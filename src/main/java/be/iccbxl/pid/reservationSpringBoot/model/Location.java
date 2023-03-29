package be.iccbxl.pid.reservationSpringBoot.model;

import com.github.slugify.Slugify;
import jakarta.persistence.*;

@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String slug;

    private String designation;
    private String address;

    @ManyToOne
    @JoinColumn(name = "locality_id", nullable = false)
    private Locality locality;

    private String website;
    private String phone;

    protected Location() {
    }

    public Location(String slug, String designation, String address, Locality locality, String website, String phone) {
        Slugify slg = new Slugify();
        this.slug = slg.slugify(designation);
        this.designation = designation;
        this.address = address;
        this.locality = locality;
        this.website = website;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    private void setSlug(String slug) {
        this.slug = slug;
    }


    public Locality getLocality() {
        return this.locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }
}

