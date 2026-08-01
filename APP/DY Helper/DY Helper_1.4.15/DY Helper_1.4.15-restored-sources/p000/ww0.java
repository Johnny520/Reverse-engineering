package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ww0 extends p000.yw0 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f11878;

    public ww0(p000.zw0 r1, int r2) {
            r0 = this;
            r0.f11878 = r2
            r1.getClass()
            r0.<init>()
            r0.f12860 = r1
            r2 = -1
            r0.f12858 = r2
            int r1 = r1.f13335
            r0.f12859 = r1
            r0.m7042()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f11878
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L2a;
                default: goto L5;
            }
        L5:
            r3.m7041()
            int r0 = r3.f12857
            java.lang.Object r1 = r3.f12860
            zw0 r1 = (p000.zw0) r1
            int r2 = r1.f13333
            if (r0 >= r2) goto L25
            int r2 = r0 + 1
            r3.f12857 = r2
            r3.f12858 = r0
            java.lang.Object[] r0 = r1.f13329
            r0.getClass()
            int r1 = r3.f12858
            r0 = r0[r1]
            r3.m7042()
            goto L29
        L25:
            p000.C1080.m7277()
            r0 = 0
        L29:
            return r0
        L2a:
            r3.m7041()
            int r0 = r3.f12857
            java.lang.Object r1 = r3.f12860
            zw0 r1 = (p000.zw0) r1
            int r2 = r1.f13333
            if (r0 >= r2) goto L45
            int r2 = r0 + 1
            r3.f12857 = r2
            r3.f12858 = r0
            java.lang.Object[] r1 = r1.f13328
            r0 = r1[r0]
            r3.m7042()
            goto L49
        L45:
            p000.C1080.m7277()
            r0 = 0
        L49:
            return r0
        L4a:
            r3.m7041()
            int r0 = r3.f12857
            java.lang.Object r1 = r3.f12860
            zw0 r1 = (p000.zw0) r1
            int r2 = r1.f13333
            if (r0 >= r2) goto L66
            int r2 = r0 + 1
            r3.f12857 = r2
            r3.f12858 = r0
            xw0 r2 = new xw0
            r2.<init>(r1, r0)
            r3.m7042()
            goto L6a
        L66:
            p000.C1080.m7277()
            r2 = 0
        L6a:
            return r2
    }
}
