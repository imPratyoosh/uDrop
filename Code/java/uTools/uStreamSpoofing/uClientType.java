//Thanks to ReVanced/RvX Team for the original code

package uTools.uStreamSpoofing;

import java.util.Objects;

public enum uClientType {
    ANDROID_CREATOR(
        "35",
        14,
        "com.google.android.apps.youtube.creator",
        "23.47.101",
        "132.0.6779.0",
        "Pixel 9 Pro Fold",
        "Google",
        "AP3A.241005.015.A2",
        "Android",
        "15",
        null
    ),
    ANDROID_VR(
        "32",
        28,
        "com.google.android.apps.youtube.vr.oculus",
        "1.43.32",
        "107.0.5284.2",
        "Quest 3",
        "Oculus",
        "SQ3A.220605.009.A1",
        "Android",
        "12",
        null
    ),
    IPADOS(
        null,
        5,
        null,
        "19.22.3",
        null,
        "iPad7,6",
        "Apple",
        null,
        "iPadOS",
        "17.7.10.21H450",
        "com.google.ios.youtube/19.22.3 (iPad7,6; U; CPU iPadOS 17_7_10 like Mac OS X)"
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