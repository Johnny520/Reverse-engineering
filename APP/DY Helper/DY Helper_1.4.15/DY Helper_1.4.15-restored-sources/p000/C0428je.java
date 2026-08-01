package p000;

/* JADX INFO: renamed from: je */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0428je {

    /* JADX INFO: renamed from: γ */
    public static final p000.C0428je f5435 = null;

    /* JADX INFO: renamed from: α */
    public final java.util.Set f5436;

    /* JADX INFO: renamed from: β */
    public final p000.AbstractC0073bd f5437;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            je r1 = new je
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r0)
            r2 = 0
            r1.<init>(r0, r2)
            p000.C0428je.f5435 = r1
            return
    }

    public C0428je(java.util.Set r1, p000.AbstractC0073bd r2) {
            r0 = this;
            r0.<init>()
            r0.f5436 = r1
            r0.f5437 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0428je
            if (r0 == 0) goto L1c
            je r3 = (p000.C0428je) r3
            java.util.Set r0 = r3.f5436
            java.util.Set r1 = r2.f5436
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            bd r3 = r3.f5437
            bd r2 = r2.f5437
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.f5436
            int r0 = r0.hashCode()
            int r0 = r0 + 1517
            int r0 = r0 * 41
            bd r1 = r1.f5437
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            return r0
    }
}
