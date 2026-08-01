package p000;

/* JADX INFO: renamed from: dl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0216dl implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3211;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0289fl f3212;

    public /* synthetic */ C0216dl(p000.C0289fl r1, int r2) {
            r0 = this;
            r0.f3211 = r2
            r0.f3212 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f3211
            s62 r1 = p000.s62.f9751
            fl r3 = r3.f3212
            switch(r0) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            r0 = 1
            ll r2 = p000.C0516ll.f6699
            r2.m3593(r3, r0)
            return r1
        L10:
            java.util.WeakHashMap r0 = p000.C0516ll.f6703
            android.view.View r3 = r3.f4002
            java.lang.Object r0 = r0.get(r3)
            kl r0 = (p000.C0473kl) r0
            if (r0 == 0) goto L21
            ll r2 = p000.C0516ll.f6699
            p000.C0516ll.m3590(r3, r0)
        L21:
            return r1
    }
}
