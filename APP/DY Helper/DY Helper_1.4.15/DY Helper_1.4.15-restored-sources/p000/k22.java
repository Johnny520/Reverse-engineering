package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k22 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5719;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.LinearLayout f5720;

    public /* synthetic */ k22(android.widget.LinearLayout r1, int r2) {
            r0 = this;
            r0.f5719 = r2
            r0.f5720 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f5719
            android.widget.LinearLayout r1 = r1.f5720
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            java.util.Set r0 = p000.o22.f7901
            r0.remove(r1)
            o22 r0 = p000.o22.f7889
            p000.o22.m4170(r1)
            return
        L12:
            o22 r0 = p000.o22.f7889
            p000.o22.m4170(r1)
            return
    }
}
