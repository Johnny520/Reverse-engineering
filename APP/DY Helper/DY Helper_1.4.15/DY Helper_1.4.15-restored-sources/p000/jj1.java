package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5488;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5489;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f5490;

    public /* synthetic */ jj1(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f5488 = r2
            r0.f5489 = r3
            r0.f5490 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f5488
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f5489
            int r1 = r1.f5490
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.m1465(r1, r0)
            return
        Ld:
            java.lang.Object r0 = r1.f5489
            int r1 = r1.f5490
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.m1464(r1, r0)
            return
        L15:
            java.lang.Object r0 = r1.f5489
            int r1 = r1.f5490
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.m1466(r1, r0)
            return
    }
}
