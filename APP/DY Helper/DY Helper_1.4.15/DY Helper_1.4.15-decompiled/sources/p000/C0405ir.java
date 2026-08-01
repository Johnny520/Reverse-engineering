package p000;

/* JADX INFO: renamed from: ir */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0405ir implements p000.fr0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5169;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f5170;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f5171;

    public C0405ir(p000.gr0 r3) {
            r2 = this;
            r0 = 2
            r2.f5169 = r0
            r2.<init>()
            r2.f5170 = r3
            zf r0 = p000.C1056zf.f13072
            java.lang.Class r3 = r3.getClass()
            java.util.HashMap r1 = r0.f13073
            java.lang.Object r1 = r1.get(r3)
            xf r1 = (p000.C0982xf) r1
            if (r1 == 0) goto L19
            goto L1e
        L19:
            r1 = 0
            xf r1 = r0.m7131(r3, r1)
        L1e:
            r2.f5171 = r1
            return
    }

    public C0405ir(p000.InterfaceC0332gr r2, p000.fr0 r3) {
            r1 = this;
            r0 = 0
            r1.f5169 = r0
            r2.getClass()
            r1.<init>()
            r1.f5170 = r2
            r1.f5171 = r3
            return
    }

    public C0405ir(p000.C0574n5 r2, p000.jr0 r3) {
            r1 = this;
            r0 = 1
            r1.f5169 = r0
            r1.<init>()
            r1.f5170 = r3
            r1.f5171 = r2
            return
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: κ */
    public final void mo743(p000.hr0 r4, p000.br0 r5) {
            r3 = this;
            int r0 = r3.f5169
            switch(r0) {
                case 0: goto L35;
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f5171
            xf r0 = (p000.C0982xf) r0
            java.util.HashMap r0 = r0.f12152
            java.lang.Object r1 = r0.get(r5)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r3.f5170
            p000.C0982xf.m6630(r1, r4, r5, r3)
            br0 r1 = p000.br0.ON_ANY
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            p000.C0982xf.m6630(r0, r4, r5, r3)
            return
        L22:
            br0 r4 = p000.br0.ON_START
            if (r5 != r4) goto L34
            java.lang.Object r4 = r3.f5170
            jr0 r4 = (p000.jr0) r4
            r4.m2985(r3)
            java.lang.Object r3 = r3.f5171
            n5 r3 = (p000.C0574n5) r3
            r3.m3975()
        L34:
            return
        L35:
            java.lang.Object r0 = r3.f5170
            gr r0 = (p000.InterfaceC0332gr) r0
            int[] r1 = p000.AbstractC0369hr.f4789
            int r2 = r5.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L62;
                case 2: goto L5e;
                case 3: goto L5a;
                case 4: goto L56;
                case 5: goto L52;
                case 6: goto L4e;
                case 7: goto L48;
                default: goto L44;
            }
        L44:
            p000.C1080.m7272()
            goto L6e
        L48:
            java.lang.String r3 = "ON_ANY must not been send by anybody"
            p000.C1080.m7275(r3)
            goto L6e
        L4e:
            r0.getClass()
            goto L65
        L52:
            r0.mo385(r4)
            goto L65
        L56:
            r0.getClass()
            goto L65
        L5a:
            r0.mo386(r4)
            goto L65
        L5e:
            r0.mo2318(r4)
            goto L65
        L62:
            r0.getClass()
        L65:
            java.lang.Object r3 = r3.f5171
            fr0 r3 = (p000.fr0) r3
            if (r3 == 0) goto L6e
            r3.mo743(r4, r5)
        L6e:
            return
    }
}
