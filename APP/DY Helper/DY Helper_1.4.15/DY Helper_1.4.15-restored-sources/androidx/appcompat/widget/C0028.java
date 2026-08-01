package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0028 implements p000.z92 {

    /* JADX INFO: renamed from: α */
    public boolean f783;

    /* JADX INFO: renamed from: β */
    public int f784;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ androidx.appcompat.widget.AbsActionBarView f785;

    public C0028(androidx.appcompat.widget.AbsActionBarView r1) {
            r0 = this;
            r0.<init>()
            r0.f785 = r1
            r1 = 0
            r0.f783 = r1
            return
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: α */
    public final void mo38() {
            r2 = this;
            boolean r0 = r2.f783
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            androidx.appcompat.widget.AbsActionBarView r1 = r2.f785
            r1.f461 = r0
            int r2 = r2.f784
            androidx.appcompat.widget.AbsActionBarView.m240(r1, r2)
            return
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: β */
    public final void mo39() {
            r1 = this;
            r0 = 1
            r1.f783 = r0
            return
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: γ */
    public final void mo40() {
            r1 = this;
            androidx.appcompat.widget.AbsActionBarView r0 = r1.f785
            androidx.appcompat.widget.AbsActionBarView.m239(r0)
            r0 = 0
            r1.f783 = r0
            return
    }
}
