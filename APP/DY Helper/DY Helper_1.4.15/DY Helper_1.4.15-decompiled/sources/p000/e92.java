package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e92 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.compose.p001ui.platform.AbstractComposeView f3449;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.c92 f3450;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.d92 f3451;

    public e92(androidx.compose.p001ui.platform.AbstractComposeView r1, p000.c92 r2, p000.d92 r3) {
            r0 = this;
            r0.f3449 = r1
            r0.f3450 = r2
            r0.f3451 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r2 = this;
            c92 r0 = r2.f3450
            androidx.compose.ui.platform.AbstractComposeView r1 = r2.f3449
            r1.removeOnAttachStateChangeListener(r0)
            gi1 r0 = p000.v81.m6123(r1)
            java.util.ArrayList r0 = r0.f4382
            d92 r2 = r2.f3451
            r0.remove(r2)
            s62 r2 = p000.s62.f9751
            return r2
    }
}
