package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class t42 implements p000.InterfaceC1152, p000.gz0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f10199;

    public /* synthetic */ t42(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.f10199 = r1
            r0.<init>()
            return
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: δ */
    public boolean mo220(p000.iz0 r1, android.view.MenuItem r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.gz0
    /* JADX INFO: renamed from: θ */
    public void mo221(p000.iz0 r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar r0 = r0.f10199
            androidx.appcompat.widget.ActionMenuView r1 = r0.f759
            androidx.appcompat.widget.γ r1 = r1.f528
            if (r1 == 0) goto Lf
            boolean r1 = r1.m327()
            if (r1 == 0) goto Lf
            return
        Lf:
            m6 r0 = r0.f748
            java.lang.Object r0 = r0.f6969
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            v60 r1 = (p000.v60) r1
            b70 r1 = r1.f11116
            r1.m794()
            goto L19
        L2b:
            return
    }
}
