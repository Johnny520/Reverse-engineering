package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ak1 {

    /* JADX INFO: renamed from: α */
    public final p000.rq0 f302;

    public ak1(p000.p70 r2) {
            r1 = this;
            r1.<init>()
            rq0 r0 = new rq0
            r0.<init>(r2)
            r1.f302 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public abstract p000.C0711q4 mo171(java.lang.Object r1);

    /* JADX INFO: renamed from: β */
    public final p000.i72 m172(p000.C0711q4 r3, p000.i72 r4) {
            r2 = this;
            boolean r2 = r4 instanceof p000.C1074zx
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.f8853
            if (r2 == 0) goto L3d
            r0 = r4
            zx r0 = (p000.C1074zx) r0
            x91 r2 = r0.f13344
            java.lang.Object r4 = r3.m4763()
            r2.setValue(r4)
            goto L3d
        L16:
            boolean r2 = r4 instanceof p000.n02
            if (r2 == 0) goto L36
            boolean r2 = r3.f8852
            if (r2 != 0) goto L22
            java.lang.Object r2 = r3.f8851
            if (r2 == 0) goto L3d
        L22:
            boolean r2 = r3.f8853
            if (r2 != 0) goto L3d
            java.lang.Object r2 = r3.m4763()
            n02 r4 = (p000.n02) r4
            java.lang.Object r1 = r4.f7348
            boolean r2 = p000.ln0.m3626(r2, r1)
            if (r2 == 0) goto L3d
            r0 = r4
            goto L3d
        L36:
            boolean r2 = r4 instanceof p000.AbstractC0329go
            if (r2 == 0) goto L3d
            r3.getClass()
        L3d:
            if (r0 != 0) goto L62
            boolean r2 = r3.f8853
            if (r2 == 0) goto L58
            zx r2 = new zx
            java.lang.Object r4 = r3.f8851
            java.lang.Object r3 = r3.f8850
            xn0 r3 = (p000.xn0) r3
            if (r3 != 0) goto L4f
            xn0 r3 = p000.xn0.f12220
        L4f:
            x91 r0 = new x91
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L58:
            n02 r2 = new n02
            java.lang.Object r3 = r3.m4763()
            r2.<init>(r3)
            return r2
        L62:
            return r0
    }
}
