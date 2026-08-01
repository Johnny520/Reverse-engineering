package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 extends p000.vp0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.kq0 f4787;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.e80 f4788;

    public hq0(p000.kq0 r1, p000.e80 r2) {
            r0 = this;
            r0.<init>()
            r0.f4787 = r1
            r0.f4788 = r2
            return
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: ε */
    public final p000.qx0 mo1688(p000.rx0 r7, java.util.List r8, long r9) {
            r6 = this;
            kq0 r2 = r6.f4787
            fq0 r8 = r2.f6086
            np0 r0 = r7.getLayoutDirection()
            r8.f4063 = r0
            float r0 = r7.mo586()
            r8.f4064 = r0
            float r0 = r7.mo590()
            r8.f4065 = r0
            boolean r7 = r7.mo1610()
            e80 r6 = r6.f4788
            r0 = 0
            if (r7 != 0) goto L3f
            yp0 r7 = r2.f6080
            yp0 r7 = r7.f12750
            if (r7 == 0) goto L3f
            r2.f6083 = r0
            cq0 r7 = r2.f6087
            yo r8 = new yo
            r8.<init>(r9)
            java.lang.Object r6 = r6.invoke(r7, r8)
            r1 = r6
            qx0 r1 = (p000.qx0) r1
            int r3 = r2.f6083
            gq0 r0 = new gq0
            r5 = 0
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L3f:
            r2.f6082 = r0
            yo r7 = new yo
            r7.<init>(r9)
            java.lang.Object r6 = r6.invoke(r8, r7)
            r1 = r6
            qx0 r1 = (p000.qx0) r1
            int r3 = r2.f6082
            gq0 r0 = new gq0
            r5 = 1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
