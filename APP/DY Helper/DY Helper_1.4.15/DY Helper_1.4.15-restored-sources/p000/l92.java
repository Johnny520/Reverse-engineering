package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l92 extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f6504;

    public /* synthetic */ l92(int r1) {
            r0 = this;
            r0.f6504 = r1
            r0.<init>()
            return
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View r1, android.graphics.Outline r2) {
            r0 = this;
            int r0 = r0.f6504
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r1.getClass()
            androidx.compose.ui.platform.ViewLayer r1 = (androidx.compose.p001ui.platform.ViewLayer) r1
            java.lang.reflect.Method r0 = androidx.compose.p001ui.platform.ViewLayer.f965
            r0 = 0
            throw r0
        Le:
            boolean r0 = r1 instanceof androidx.compose.p001ui.graphics.layer.ViewLayer
            if (r0 == 0) goto L14
            int r0 = androidx.compose.p001ui.graphics.layer.ViewLayer.f858
        L14:
            return
    }
}
