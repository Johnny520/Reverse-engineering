package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8489;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.p70 f8490;

    public /* synthetic */ pc0(int r1, p000.p70 r2) {
            r0 = this;
            r0.f8489 = r1
            r0.f8490 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f8489
            p70 r1 = r1.f8490
            switch(r0) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L11;
                case 3: goto Ld;
                default: goto L7;
            }
        L7:
            r1.invoke()
        La:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        Ld:
            r1.invoke()
            goto La
        L11:
            r1.invoke()
            goto La
        L15:
            r1.invoke()
            goto La
        L19:
            java.lang.Object r1 = r1.invoke()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L20
            java.util.List r1 = (java.util.List) r1     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L20
            goto L22
        L20:
            jz r1 = p000.C0450jz.f5672
        L22:
            return r1
    }
}
