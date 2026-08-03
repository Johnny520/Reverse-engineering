package p001;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: renamed from: ۟.c4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0167c4 {
    /* JADX INFO: renamed from: ۥ */
    public static boolean m834(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m835(int i) {
        return (i & 1) == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m1034(int i) {
        return (i & 2) == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m1035(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ int m1036(int i) {
        if (i == 1) {
            return 96;
        }
        if (i == 2) {
            return 384;
        }
        if (i == 3) {
            return -1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m1037(int i) {
        if (i == 1) {
            return 96;
        }
        if (i == 2) {
            return 512;
        }
        if (i == 3) {
            return -1;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static float m1038(int i, float f) {
        return TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static StringBuilder m1039(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ int m1040(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
