package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 extends p000.i91 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9328;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.tb2 f9329;

    public /* synthetic */ rb2(p000.tb2 r1, int r2) {
            r0 = this;
            r0.f9328 = r2
            r0.f9329 = r1
            r0.<init>()
            return
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: α */
    public final void mo38() {
            r3 = this;
            int r0 = r3.f9328
            r1 = 0
            tb2 r3 = r3.f9329
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            r3.f10297 = r1
            androidx.appcompat.widget.ActionBarContainer r3 = r3.f10282
            r3.requestLayout()
            return
        L10:
            boolean r0 = r3.f10293
            if (r0 == 0) goto L21
            android.view.View r0 = r3.f10285
            if (r0 == 0) goto L21
            r2 = 0
            r0.setTranslationY(r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f10282
            r0.setTranslationY(r2)
        L21:
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f10282
            r2 = 8
            r0.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f10282
            r2 = 0
            r0.setTransitioning(r2)
            r3.f10297 = r1
            n5 r0 = r3.f10289
            if (r0 == 0) goto L3d
            sb2 r2 = r3.f10288
            r0.m3969(r2)
            r3.f10288 = r1
            r3.f10289 = r1
        L3d:
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r3.f10281
            if (r3 == 0) goto L46
            java.util.WeakHashMap r0 = p000.b92.f1572
            p000.s82.m5376(r3)
        L46:
            return
    }
}
