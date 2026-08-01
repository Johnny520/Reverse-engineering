package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s42 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9732;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f9733;

    public /* synthetic */ s42(androidx.appcompat.widget.Toolbar r1, int r2) {
            r0 = this;
            r0.f9732 = r2
            r0.f9733 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f9732
            androidx.appcompat.widget.Toolbar r1 = r1.f9733
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r1.m308()
            return
        Lb:
            v42 r1 = r1.f753
            if (r1 != 0) goto L11
            r1 = 0
            goto L13
        L11:
            lz0 r1 = r1.f11103
        L13:
            if (r1 == 0) goto L18
            r1.collapseActionView()
        L18:
            return
    }
}
