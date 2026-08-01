package p000;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0744r0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9186;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.p70 f9187;

    public /* synthetic */ RunnableC0744r0(int r1, p000.p70 r2) {
            r0 = this;
            r0.f9186 = r1
            r0.f9187 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f9186
            p70 r1 = r1.f9187
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L2a;
                case 2: goto L26;
                case 3: goto L17;
                case 4: goto L13;
                case 5: goto Lf;
                case 6: goto Lb;
                default: goto L7;
            }
        L7:
            r1.invoke()
            return
        Lb:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.m1451(r1)
            return
        Lf:
            r1.invoke()
            return
        L13:
            r1.invoke()
            return
        L17:
            r1.invoke()     // Catch: java.lang.Throwable -> L1b
            goto L25
        L1b:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "r9e132ed1c22c7945"
            p000.AbstractC0602nx.m4142(r0, r1)
        L25:
            return
        L26:
            r1.invoke()
            return
        L2a:
            r1.invoke()
            return
        L2e:
            java.lang.Class r0 = androidx.compose.p001ui.platform.AndroidComposeView.f872
            r1.invoke()
            return
    }
}
