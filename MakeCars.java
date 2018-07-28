import java.awt.*;
import java.util.Collection;
public class Cars {
	
	Double averageMilesPerGallen;
	String licensePlate;
	Color paintColor;
	boolean areTailingWorking;
	
	public Cars(Double inputAverageMPG, 
			String inputLicensePlate, 
			Color inputPaintColor, 
			Boolean inputAreTaillightsWorking ) {
		this.averageMilesPerGallen = inputAverageMPG;
		this.licensePlate = inputLicensePlate;
		this.paintColor =inputPaintColor;
		this.areTailingWorking = inputAreTaillightsWorking;
		
	}
	public void ChangePaintColor(Color newPaintColor) {
		this.paintColor = newPaintColor;
	}
	public void SpeedUp(double CurrentSpeed) {
		CurrentSpeed =+100;
		
	}
}
