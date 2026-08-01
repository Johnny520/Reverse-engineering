package p000;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0747t0 {

    /* JADX INFO: renamed from: a */
    public String f5882a;

    /* JADX INFO: renamed from: b */
    public final int[] f5883b = new int[2];

    /* JADX INFO: renamed from: a */
    public abstract int[] mo4139a(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int[] m4140b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f5883b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m4141c() {
        String str = this.f5882a;
        if (str != null) {
            return str;
        }
        p30.m2986V("text");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public abstract int[] mo4142d(int i);
}
