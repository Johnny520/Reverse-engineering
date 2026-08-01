package p000;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0423j9 implements android.content.DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5363;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5364;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f5365;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0423j9(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f5363 = r2
            r0.f5364 = r1
            r0.f5365 = r3
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            int r3 = r2.f5363
            switch(r3) {
                case 0: goto L2d;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r2.f5364
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r2 = r2.f5365
            ub1 r2 = (p000.ub1) r2
            r3.removeCallbacks(r2)
            return
        L11:
            java.lang.Object r3 = r2.f5364
            um1 r3 = (p000.um1) r3
            java.lang.Object r2 = r2.f5365
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.Object r0 = r3.f10912
            if (r0 == r2) goto L2c
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            boolean r2 = r0.isRecycled()
            if (r2 != 0) goto L2c
            java.lang.Object r2 = r3.f10912
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r2.recycle()
        L2c:
            return
        L2d:
            java.lang.Object r3 = r2.f5364
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r2 = r2.f5365
            o7 r2 = (p000.C0613o7) r2
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L57
            r2.invoke()     // Catch: java.lang.Throwable -> L43
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L43
            goto L4a
        L43:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L4a:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L57
            java.lang.String r3 = "r24de9f070d18b34b"
            java.lang.String r0 = "公告弹窗关闭 回调执行失败"
            p000.C0888ux.m5977(r3, r0, r2)
        L57:
            return
    }
}
