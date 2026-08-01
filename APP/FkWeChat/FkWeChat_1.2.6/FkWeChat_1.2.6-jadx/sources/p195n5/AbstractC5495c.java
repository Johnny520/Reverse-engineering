package p195n5;

/* JADX INFO: renamed from: n5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5495c {
    /* JADX INFO: renamed from: a */
    public static boolean m22343a(int i10) {
        int i11;
        if (i10 < -1) {
            return false;
        }
        return i10 == -1 || (i11 = i10 & 255) == 0 || i11 == 255 || (i10 & 65280) == 0;
    }
}
