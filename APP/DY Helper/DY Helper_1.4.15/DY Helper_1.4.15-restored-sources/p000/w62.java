package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w62 implements p000.oq0, java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public p000.p70 f11589;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f11590;

    @Override // p000.oq0
    public final java.lang.Object getValue() {
            r2 = this;
            java.lang.Object r0 = r2.f11590
            xn0 r1 = p000.xn0.f12222
            if (r0 != r1) goto L14
            p70 r0 = r2.f11589
            r0.getClass()
            java.lang.Object r0 = r0.invoke()
            r2.f11590 = r0
            r0 = 0
            r2.f11589 = r0
        L14:
            java.lang.Object r2 = r2.f11590
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f11590
            xn0 r1 = p000.xn0.f12222
            if (r0 == r1) goto Lf
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Lf:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}
