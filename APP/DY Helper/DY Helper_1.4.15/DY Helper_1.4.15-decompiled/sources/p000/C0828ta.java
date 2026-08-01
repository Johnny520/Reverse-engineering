package p000;

/* JADX INFO: renamed from: ta */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0828ta {

    /* JADX INFO: renamed from: α */
    public p000.C0534m2 f10258;

    /* JADX INFO: renamed from: β */
    public p000.C0495l0 f10259;

    /* JADX INFO: renamed from: γ */
    public p000.C0282fe f10260;

    /* JADX INFO: renamed from: δ */
    public p000.C0969x2 f10261;

    public C0828ta() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f10258 = r0
            r1.f10259 = r0
            r1.f10260 = r0
            r1.f10261 = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.C0828ta
            if (r0 != 0) goto L8
            goto L35
        L8:
            ta r3 = (p000.C0828ta) r3
            m2 r0 = r2.f10258
            m2 r1 = r3.f10258
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            l0 r0 = r2.f10259
            l0 r1 = r3.f10259
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            fe r0 = r2.f10260
            fe r1 = r3.f10260
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            x2 r2 = r2.f10261
            x2 r3 = r3.f10261
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            m2 r0 = r3.f10258
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            l0 r2 = r3.f10259
            if (r2 != 0) goto L13
            r2 = r1
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            fe r2 = r3.f10260
            if (r2 != 0) goto L20
            r2 = r1
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            x2 r3 = r3.f10261
            if (r3 != 0) goto L2c
            goto L30
        L2c:
            int r1 = r3.hashCode()
        L30:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BorderCache(imageBitmap="
            r0.<init>(r1)
            m2 r1 = r2.f10258
            r0.append(r1)
            java.lang.String r1 = ", canvas="
            r0.append(r1)
            l0 r1 = r2.f10259
            r0.append(r1)
            java.lang.String r1 = ", canvasDrawScope="
            r0.append(r1)
            fe r1 = r2.f10260
            r0.append(r1)
            java.lang.String r1 = ", borderPath="
            r0.append(r1)
            x2 r2 = r2.f10261
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
