package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8271a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8272b = 0.0f;

    static {
            r0 = 6
            float r0 = (float) r0
            m.m1.f8271a = r0
            r0 = 1
            float r0 = (float) r0
            m.m1.f8272b = r0
            return
    }

    public static final boolean a(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L13
            float r1 = java.lang.Math.abs(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 >= 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }
}
