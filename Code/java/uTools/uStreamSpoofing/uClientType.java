//Thanks to ReVanced/RvX Team for the original code

package uTools.uStreamSpoofing;

import java.util.Objects;

public enum uClientType {
    ANDROID_CREATOR(
        "33",
        14,
        "com.google.android.apps.youtube.creator",
        "25.40.100",
        "143.0.7460.0",
        "Pixel 7a",
        "Google",
        "TQ3A.230901.001.C3",
        "Android",
        "13",
        null
    ),
    ANDROID_VR(
        "32",
        28,
        "com.google.android.apps.youtube.vr.oculus",
        "1.65.10",
        "143.0.7460.0",
        "Quest 3S",
        "Oculus",
        "SQ3A.220605.009.A1",
        "Android",
        "12",
        null
    ),
    VISIONOS(
        null,
        101,
        null,
        "0.1",
        null,
        "RealityDevice14,1",
        "Apple",
        null,
        "visionOS",
        "1.3.21O771",
        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.0 Safari/605.1.15"
    );

    public final String androidSDKVersion;
    public final int clientID;
    public final String clientVersion;
    public final String deviceMake;
    public final String deviceModel;
    public final String osName;
    public final String osVersion;
    public String userAgent = "";
    uClientType(String androidSDKVersion, int clientID, String clientPackageName, String clientVersion, String cronetVersion, String deviceMake, String deviceModel, String osBuildID, String osName, String osVersion, String userAgent) {
        this.androidSDKVersion = androidSDKVersion;
        this.clientID = clientID;
        this.clientVersion = clientVersion;
        this.deviceMake = deviceMake;
        this.deviceModel = deviceModel;
        this.osName = osName;
        this.osVersion = osVersion;

        if (userAgent == null) {
            if (Objects.equals(deviceMake, "Google")) {
                this.userAgent =
                    String.format(
                        "%s/%s (Linux; U; Android %s; %s; Build/%s; Cronet/%s)",

                        clientPackageName,
                        clientVersion,
                        osVersion,
                        deviceModel,
                        osBuildID,
                        cronetVersion
                    );
            }
        } else {
            this.userAgent = userAgent;
        }
    }
}