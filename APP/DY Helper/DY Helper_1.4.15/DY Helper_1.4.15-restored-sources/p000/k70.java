package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class k70 {

    /* JADX INFO: renamed from: α */
    public static final p000.j70 f5785 = null;

    static {
            j70 r0 = p000.j70.f5343
            p000.k70.f5785 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.j70 m3175(p000.n60 r1) {
        L0:
            if (r1 == 0) goto L10
            p60 r0 = r1.f7440
            if (r0 == 0) goto Ld
            boolean r0 = r1.f7432
            if (r0 == 0) goto Ld
            r1.m3999()
        Ld:
            n60 r1 = r1.f7400
            goto L0
        L10:
            j70 r1 = p000.k70.f5785
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static void m3176(p000.g70 r2) {
            r0 = 3
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L1c
            n60 r0 = r2.f4264
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "StrictMode violation in "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0, r2)
        L1c:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static final void m3177(p000.n60 r3, java.lang.String r4) {
            r4.getClass()
            g70 r0 = new g70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempting to reuse fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " with previous ID "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r3, r4)
            m3176(r0)
            j70 r3 = m3175(r3)
            r3.getClass()
            return
    }
}
