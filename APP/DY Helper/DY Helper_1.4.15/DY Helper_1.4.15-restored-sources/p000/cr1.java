package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cr1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2730;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f2731;

    public /* synthetic */ cr1(androidx.appcompat.widget.SearchView r1, int r2) {
            r0 = this;
            r0.f2730 = r2
            r0.f2731 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f2730
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            androidx.appcompat.widget.SearchView r1 = r1.f2731
            sq r1 = r1.f667
            boolean r0 = r1 instanceof p000.m12
            if (r0 == 0) goto L11
            r0 = 0
            r1.mo3707(r0)
        L11:
            return
        L12:
            androidx.appcompat.widget.SearchView r1 = r1.f2731
            r1.m287()
            return
    }
}
