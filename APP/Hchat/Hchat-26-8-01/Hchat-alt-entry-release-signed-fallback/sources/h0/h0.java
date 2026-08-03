package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4902a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f4903b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f2.x f4904c = null;

    static {
            r0 = 25
            float r0 = (float) r0
            h0.h0.f4902a = r0
            h0.h0.f4903b = r0
            f2.x r0 = new f2.x
            java.lang.String r1 = "SelectionHandleInfo"
            r0.<init>(r1)
            h0.h0.f4904c = r0
            return
    }

    public static final long a(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            long r0 = r4 << r0
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }
}
