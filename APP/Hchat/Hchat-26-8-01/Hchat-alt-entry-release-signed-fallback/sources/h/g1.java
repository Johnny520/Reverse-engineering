package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4677a = 0.0f;

    static {
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            h.g1.f4677a = r0
            return
    }

    public static final i.u a(i0.h0 r3) {
            i0.m2 r0 = y1.h1.f21946h
            java.lang.Object r0 = r3.j(r0)
            u2.c r0 = (u2.c) r0
            float r1 = r0.d()
            boolean r1 = r3.c(r1)
            java.lang.Object r2 = r3.P()
            if (r1 != 0) goto L1a
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L27
        L1a:
            androidx.lifecycle.x r1 = new androidx.lifecycle.x
            r1.<init>(r0)
            i.u r2 = new i.u
            r2.<init>(r1)
            r3.k0(r2)
        L27:
            i.u r2 = (i.u) r2
            return r2
    }
}
