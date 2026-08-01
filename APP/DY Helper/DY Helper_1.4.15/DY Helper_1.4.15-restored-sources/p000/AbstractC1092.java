package p000;

/* JADX INFO: renamed from: ο */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1092 extends p000.fo0 implements p000.InterfaceC0631op, p000.InterfaceC0086bq {

    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0880up f13409;

    public AbstractC1092(p000.InterfaceC0880up r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            xn0 r2 = p000.xn0.f12226
            sp r2 = r1.mo1785(r2)
            fo0 r2 = (p000.fo0) r2
            r0.m2166(r2)
            up r1 = r1.mo1784(r0)
            r0.f13409 = r1
            return
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: Θ */
    public final void mo2165(p000.C0692pm r1) {
            r0 = this;
            up r0 = r0.f13409
            p000.AbstractC0073bd.m890(r0, r1)
            return
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: Ρ */
    public final void mo2173(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0628om
            if (r0 == 0) goto L17
            om r3 = (p000.C0628om) r3
            java.lang.Throwable r0 = r3.f8149
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.C0628om.f8148
            int r3 = r1.get(r3)
            if (r3 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            r2.mo6675(r0, r3)
            return
        L17:
            r2.mo6676(r3)
            return
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            up r0 = r0.f13409
            return r0
    }

    @Override // p000.InterfaceC0086bq
    /* JADX INFO: renamed from: δ */
    public final p000.InterfaceC0880up mo993() {
            r0 = this;
            up r0 = r0.f13409
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            om r3 = new om
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            java.lang.Object r3 = r2.m2171(r3)
            uy r0 = p000.AbstractC0978xb.f12102
            if (r3 != r0) goto L16
            return
        L16:
            r2.mo2182(r3)
            return
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: υ */
    public final java.lang.String mo2186() {
            r1 = this;
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r0 = " was cancelled"
            java.lang.String r1 = r1.concat(r0)
            return r1
    }

    /* JADX INFO: renamed from: а */
    public void mo6675(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: б */
    public void mo6676(java.lang.Object r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: в */
    public final void m7284(p000.EnumC0257eq r4, p000.AbstractC1092 r5, p000.e80 r6) {
            r3 = this;
            int r4 = r4.ordinal()
            s62 r0 = p000.s62.f9751
            if (r4 == 0) goto L57
            r1 = 1
            if (r4 == r1) goto L56
            r1 = 2
            if (r4 == r1) goto L48
            r0 = 3
            if (r4 != r0) goto L44
            up r4 = r3.f13409     // Catch: java.lang.Throwable -> L35
            r0 = 0
            java.lang.Object r0 = p000.pd2.m4504(r4, r0)     // Catch: java.lang.Throwable -> L35
            boolean r2 = r6 instanceof p000.AbstractC0715q8     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L23
            java.lang.Object r5 = p000.AbstractC0978xb.m6604(r6, r5, r3)     // Catch: java.lang.Throwable -> L21
            goto L2a
        L21:
            r5 = move-exception
            goto L37
        L23:
            p000.h62.m2394(r1, r6)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r5 = r6.invoke(r5, r3)     // Catch: java.lang.Throwable -> L21
        L2a:
            p000.pd2.m4470(r4, r0)     // Catch: java.lang.Throwable -> L35
            cq r4 = p000.EnumC0184cq.f2716
            if (r5 == r4) goto L56
            r3.mo75(r5)
            return
        L35:
            r4 = move-exception
            goto L3b
        L37:
            p000.pd2.m4470(r4, r0)     // Catch: java.lang.Throwable -> L35
            throw r5     // Catch: java.lang.Throwable -> L35
        L3b:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r3.mo75(r5)
            return
        L44:
            p000.C1080.m7272()
            return
        L48:
            r6.getClass()
            op r3 = p000.AbstractC0978xb.m6590(r5, r3, r6)
            op r3 = p000.AbstractC0978xb.m6563(r3)
            r3.mo75(r0)
        L56:
            return
        L57:
            op r4 = p000.AbstractC0978xb.m6590(r5, r3, r6)     // Catch: java.lang.Throwable -> L63
            op r4 = p000.AbstractC0978xb.m6563(r4)     // Catch: java.lang.Throwable -> L63
            p000.jx0.m3033(r4, r0)     // Catch: java.lang.Throwable -> L63
            return
        L63:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r3.mo75(r5)
            throw r4
    }
}
