package uk.me.richardcook.sessionography.model;

import javax.persistence.*;

/**
 * Class which represents the release entity in the database
 */
@Entity
@Table( name = "[release]" )
public class Release {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id" )
	private int id;

	@Column( name = "title" )
	private String title;

	@Column( name = "label" )
	private Integer label;

	@Column( name = "year" )
	private String year;

	@Column( name = "format" )
	private Integer format;

	@Column( name = "[all]" )
	private boolean all;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public Integer getLabel() {
		return label;
	}

	public void setLabel( Integer label ) {
		this.label = label;
	}

	public String getYear() {
		return year;
	}

	public void setYear( String year ) {
		this.year = year;
	}

	public Integer getFormat() {
		return format;
	}

	public void setFormat( Integer format ) {
		this.format = format;
	}

	public boolean isAll() {
		return all;
	}

	public void setAll( boolean all ) {
		this.all = all;
	}

	@Override
	public boolean equals( Object obj ) {
		if ( ! obj.getClass().equals( Release.class ) )
			return false;
		Release release = (Release) obj;

		if ( id != release.getId() )
			return false;

		if ( ! title.equals( release.getTitle() ) )
			return false;

		if ( ( label == null && release.getLabel() != null ) || ( label != null && ! label.equals( release.getLabel() ) ) )
			return false;

		if ( ( year == null && release.getYear() != null ) || ( year != null && ! year.equals( release.getYear() ) ) )
			return false;

		if ( ( format == null && release.getFormat() != null ) || ( format != null && ! format.equals( release.getFormat() ) ) )
			return false;

		return all == release.isAll();
	}
}
