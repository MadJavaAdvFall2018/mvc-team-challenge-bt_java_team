package java112.project3;
import java.io.Serializable;

/**
 * BT_JavaBean will define the model for the Beer Tap application.
 *
 * @author jalexander1
 * @version 1.0
 * @since 04 /04/2019
 */
public class BT_JavaBean extends Object implements Serializable {

    private int tapNumber;
    private String beerName;
    private String beerStyle;
    private double beerABV;
    private double beerIBU;
    private double beerColor;
    private String beerDescription;
    private boolean bottlesAvailable;

    /**
     * Zero Parameter Constructor for the BT_JavaBean object
     */
    public BT_JavaBean() {

    }

    /**
     * Instantiates a new Bt java bean.
     *
     * @param tapNumber        the tap number
     * @param beerName         the beer name
     * @param beerStyle        the beer style
     * @param beerABV          the beer abv
     * @param beerIBU          the beer ibu
     * @param beerColor        the beer color
     * @param beerDescription  the beer description
     * @param bottlesAvailable the bottles available
     */
    public BT_JavaBean(int tapNumber, String beerName, String beerStyle, double beerABV, double beerIBU,
                       double beerColor, String beerDescription, boolean bottlesAvailable) {

        this.tapNumber = tapNumber;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.beerABV = beerABV;
        this.beerIBU = beerIBU;
        this.beerColor = beerColor;
        this.beerDescription = beerDescription;
        this.bottlesAvailable = bottlesAvailable;

    }

    /**
     * Gets tap number.
     *
     * @return the tap number
     */
    public int getTapNumber() {
        return tapNumber;
    }

    /**
     * Sets tap number.
     *
     * @param tapNumber the tap number
     */
    public void setTapNumber(int tapNumber) {
        this.tapNumber = tapNumber;
    }

    /**
     * Gets beer name.
     *
     * @return the beer name
     */
    public String getBeerName() {
        return beerName;
    }

    /**
     * Sets beer name.
     *
     * @param beerName the beer name
     */
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    /**
     * Gets beer style.
     *
     * @return the beer style
     */
    public String getBeerStyle() {
        return beerStyle;
    }

    /**
     * Sets beer style.
     *
     * @param beerStyle the beer style
     */
    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    /**
     * Gets beer abv.
     *
     * @return the beer abv
     */
    public double getBeerABV() {
        return beerABV;
    }

    /**
     * Sets beer abv.
     *
     * @param beerABV the beer abv
     */
    public void setBeerABV(double beerABV) {
        this.beerABV = beerABV;
    }

    /**
     * Gets beer ibu.
     *
     * @return the beer ibu
     */
    public double getBeerIBU() {
        return beerIBU;
    }

    /**
     * Sets beer ibu.
     *
     * @param beerIBU the beer ibu
     */
    public void setBeerIBU(double beerIBU) {
        this.beerIBU = beerIBU;
    }

    /**
     * Gets beer color.
     *
     * @return the beer color
     */
    public double getBeerColor() {
        return beerColor;
    }

    /**
     * Sets beer color.
     *
     * @param beerColor the beer color
     */
    public void setBeerColor(double beerColor) {
        this.beerColor = beerColor;
    }

    /**
     * Gets beer description.
     *
     * @return the beer description
     */
    public String getBeerDescription() {
        return beerDescription;
    }

    /**
     * Sets beer description.
     *
     * @param beerDescription the beer description
     */
    public void setBeerDescription(String beerDescription) {
        this.beerDescription = beerDescription;
    }

    /**
     * Is bottles available boolean.
     *
     * @return the boolean
     */
    public boolean isBottlesAvailable() {
        return bottlesAvailable;
    }

    /**
     * Sets bottles available.
     *
     * @param bottlesAvailable the bottles available
     */
    public void setBottlesAvailable(boolean bottlesAvailable) {
        this.bottlesAvailable = bottlesAvailable;
    }
}
