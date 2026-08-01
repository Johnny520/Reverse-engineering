package p004a3;

import android.os.Build;

/* JADX INFO: renamed from: a3.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0035d0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0062z m141a() {
        return Build.VERSION.SDK_INT >= 28 ? new C0031b0() : new C0033c0();
    }

    /* JADX INFO: renamed from: b */
    public static final String m142b(String str, C0054r c0054r) {
        int iM202m = c0054r.m202m() / 100;
        if (iM202m >= 0 && iM202m < 2) {
            return str + "-thin";
        }
        if (2 <= iM202m && iM202m < 4) {
            return str + "-light";
        }
        if (iM202m == 4) {
            return str;
        }
        if (iM202m == 5) {
            return str + "-medium";
        }
        if ((6 <= iM202m && iM202m < 8) || 8 > iM202m || iM202m >= 11) {
            return str;
        }
        return str + "-black";
    }
}
