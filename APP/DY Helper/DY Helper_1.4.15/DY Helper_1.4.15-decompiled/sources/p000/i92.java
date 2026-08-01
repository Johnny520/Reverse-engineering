package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i92 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4968;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.compose.p001ui.viewinterop.ViewFactoryHolder f4969;

    public /* synthetic */ i92(androidx.compose.p001ui.viewinterop.ViewFactoryHolder r1, int r2) {
            r0 = this;
            r0.f4968 = r2
            r0.f4969 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f4968
            s62 r1 = p000.s62.f9751
            r2 = 0
            androidx.compose.ui.viewinterop.ViewFactoryHolder r3 = r3.f4969
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L14;
                default: goto La;
            }
        La:
            int r0 = androidx.compose.p001ui.viewinterop.ViewFactoryHolder.f981
            a80 r3 = r3.getUpdateBlock()
            r3.invoke(r2)
            return r1
        L14:
            int r0 = androidx.compose.p001ui.viewinterop.ViewFactoryHolder.f981
            a80 r3 = r3.getResetBlock()
            r3.invoke(r2)
            return r1
        L1e:
            int r0 = androidx.compose.p001ui.viewinterop.ViewFactoryHolder.f981
            a80 r0 = r3.getReleaseBlock()
            r0.invoke(r2)
            androidx.compose.p001ui.viewinterop.ViewFactoryHolder.m411(r3)
            return r1
    }
}
