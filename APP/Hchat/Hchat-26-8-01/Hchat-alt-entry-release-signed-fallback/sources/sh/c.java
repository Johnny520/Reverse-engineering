package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12530a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12531b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12532c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p.z0 f12533d = null;

    static {
            r0 = 58
            float r0 = (float) r0
            sh.c.f12530a = r0
            r0 = 40
            float r0 = (float) r0
            sh.c.f12531b = r0
            r0 = 16
            float r0 = (float) r0
            sh.c.f12532c = r0
            r1 = 13
            float r1 = (float) r1
            p.z0 r2 = new p.z0
            r2.<init>(r0, r1, r0, r1)
            sh.c.f12533d = r2
            return
    }

    public static sh.q1 a(i0.h0 r11) {
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r1 = r11.j(r0)
            bi.b r1 = (bi.b) r1
            long r3 = r1.j()
            java.lang.Object r1 = r11.j(r0)
            bi.b r1 = (bi.b) r1
            i0.j1 r1 = r1.f875k
            java.lang.Object r1 = r1.getValue()
            f1.w r1 = (f1.w) r1
            long r5 = r1.f3133a
            java.lang.Object r1 = r11.j(r0)
            bi.b r1 = (bi.b) r1
            long r7 = r1.e()
            java.lang.Object r0 = r11.j(r0)
            bi.b r0 = (bi.b) r0
            i0.j1 r0 = r0.f876l
            java.lang.Object r0 = r0.getValue()
            f1.w r0 = (f1.w) r0
            long r9 = r0.f3133a
            boolean r0 = r11.e(r3)
            boolean r1 = r11.e(r5)
            r0 = r0 | r1
            boolean r1 = r11.e(r7)
            r0 = r0 | r1
            boolean r1 = r11.e(r9)
            r0 = r0 | r1
            java.lang.Object r1 = r11.P()
            if (r0 != 0) goto L53
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L5c
        L53:
            sh.q1 r2 = new sh.q1
            r2.<init>(r3, r5, r7, r9)
            r11.k0(r2)
            r1 = r2
        L5c:
            sh.q1 r1 = (sh.q1) r1
            return r1
    }
}
