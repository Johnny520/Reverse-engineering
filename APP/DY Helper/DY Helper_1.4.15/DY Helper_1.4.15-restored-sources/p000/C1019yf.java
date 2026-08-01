package p000;

/* JADX INFO: renamed from: yf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1019yf {

    /* JADX INFO: renamed from: α */
    public final int f12596;

    /* JADX INFO: renamed from: β */
    public final java.lang.reflect.Method f12597;

    public C1019yf(int r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.<init>()
            r0.f12596 = r1
            r0.f12597 = r2
            r0 = 1
            r2.setAccessible(r0)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof p000.C1019yf
            if (r0 != 0) goto L8
            goto L24
        L8:
            yf r3 = (p000.C1019yf) r3
            int r0 = r2.f12596
            int r1 = r3.f12596
            if (r0 != r1) goto L24
            java.lang.reflect.Method r2 = r2.f12597
            java.lang.String r2 = r2.getName()
            java.lang.reflect.Method r3 = r3.f12597
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f12596
            int r0 = r0 * 31
            java.lang.reflect.Method r1 = r1.f12597
            java.lang.String r1 = r1.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
