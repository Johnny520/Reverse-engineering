package p000;

/* JADX INFO: renamed from: f7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0275f7 implements p000.ss1 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3767;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f3768;

    public /* synthetic */ C0275f7(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3767 = r1
            r0.f3768 = r2
            r0.<init>()
            return
    }

    public C0275f7(p000.e80 r2) {
            r1 = this;
            r0 = 2
            r1.f3767 = r0
            r1.<init>()
            do1 r2 = (p000.do1) r2
            r1.f3768 = r2
            return
    }

    @Override // p000.ss1
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f3767
            switch(r0) {
                case 0: goto L40;
                case 1: goto L37;
                case 2: goto L2e;
                case 3: goto L29;
                case 4: goto Lf;
                default: goto L5;
            }
        L5:
            es0 r0 = new es0
            java.lang.Object r3 = r3.f3768
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.<init>(r3)
            return r0
        Lf:
            java.lang.Object r3 = r3.f3768
            ss1 r3 = (p000.ss1) r3
            java.util.List r3 = p000.us1.m5949(r3)
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L24
            java.util.Collections.sort(r3)
        L24:
            java.util.Iterator r3 = r0.iterator()
            return r3
        L29:
            java.lang.Object r3 = r3.f3768
            java.util.Iterator r3 = (java.util.Iterator) r3
            return r3
        L2e:
            java.lang.Object r3 = r3.f3768
            do1 r3 = (p000.do1) r3
            ts1 r3 = p000.e81.m1879(r3)
            return r3
        L37:
            java.lang.Object r3 = r3.f3768
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            return r3
        L40:
            java.lang.Object r3 = r3.f3768
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            τ r0 = new τ
            r0.<init>(r3)
            return r0
    }
}
