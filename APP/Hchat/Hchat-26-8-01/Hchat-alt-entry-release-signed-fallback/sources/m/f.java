package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.e f8139a = null;

    static {
            m.e r0 = m.e.f8121a
            m.f.f8139a = r0
            return
    }

    default float a(float r3, float r4, float r5) {
            r2 = this;
            m.e r0 = m.f.f8139a
            r0.getClass()
            float r4 = r4 + r3
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto L10
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 > 0) goto L10
            goto L18
        L10:
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L19
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 <= 0) goto L19
        L18:
            return r0
        L19:
            float r0 = java.lang.Math.abs(r3)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L27
            return r3
        L27:
            return r4
    }
}
