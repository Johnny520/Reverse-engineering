package Yue;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3069 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f60 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f61 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f4564 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f4565 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f4566 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f4567 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f4568 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f4569 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f4570 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f4571 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f4572 = 32;

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static String m147(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m148(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~iNumberOfTrailingZeros;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (iNumberOfTrailingZeros == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m6215(int i) {
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m6216(@InterfaceC6391 AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m6217(@InterfaceC6391 AccessibilityServiceInfo accessibilityServiceInfo, @InterfaceC6391 PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
