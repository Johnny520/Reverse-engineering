package p000;

/* JADX INFO: renamed from: pl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0691pl extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8590;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.C0728ql f8591;

    public /* synthetic */ C0691pl(p000.C0728ql r1, int r2) {
            r0 = this;
            r0.f8590 = r2
            r0.f8591 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r3) {
            r2 = this;
            int r0 = r2.f8590
            ql r2 = r2.f8591
            r1 = 0
            r3.getClass()
            switch(r0) {
                case 0: goto L36;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r3 = r3.f5691     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r3 instanceof android.view.View     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L14
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L2f
            goto L15
        L14:
            r3 = r1
        L15:
            if (r3 != 0) goto L18
            goto L35
        L18:
            boolean r0 = p000.C0728ql.m4900(r3)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L1f
            goto L35
        L1f:
            boolean r0 = r3 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L26
            r1 = r3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L2f
        L26:
            if (r1 != 0) goto L29
            goto L35
        L29:
            int r3 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L2f
            p000.C0728ql.m4912(r2, r1)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L2f:
            r2 = move-exception
            r2.getMessage()
            int r2 = com.example.dyhelper.MainHook.f2222
        L35:
            return
        L36:
            java.lang.Object r3 = r3.f5691     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r3 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L3f
            r1 = r3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Throwable -> L4d
        L3f:
            if (r1 != 0) goto L42
            goto L53
        L42:
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L4d
            p000.C0728ql.m4904(r3)     // Catch: java.lang.Throwable -> L4d
            p000.C0728ql.m4912(r2, r1)     // Catch: java.lang.Throwable -> L4d
            goto L53
        L4d:
            r2 = move-exception
            r2.getMessage()
            int r2 = com.example.dyhelper.MainHook.f2222
        L53:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r2) {
            r1 = this;
            int r0 = r1.f8590
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r2)
            return
        L9:
            r2.getClass()
            ql r1 = r1.f8591
            java.lang.Object r0 = r2.f5691     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r2 = r2.f5692     // Catch: java.lang.Throwable -> L16
            p000.C0728ql.m4910(r1, r0, r2)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L16:
            r1 = move-exception
            r1.getMessage()
            int r1 = com.example.dyhelper.MainHook.f2222
        L1c:
            return
    }
}
