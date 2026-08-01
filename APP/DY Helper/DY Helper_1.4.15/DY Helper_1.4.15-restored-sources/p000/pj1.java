package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pj1 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8584;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.qj1 f8585;

    public /* synthetic */ pj1(p000.qj1 r1, int r2) {
            r0 = this;
            r0.f8584 = r2
            r0.f8585 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r6) {
            r5 = this;
            int r0 = r5.f8584
            s62 r1 = p000.s62.f9751
            r2 = 0
            r3 = 0
            qj1 r5 = r5.f8585
            r6.getClass()
            switch(r0) {
                case 0: goto L59;
                default: goto Le;
            }
        Le:
            java.lang.Object[] r0 = r6.f5692     // Catch: java.lang.Throwable -> L33
            r0.getClass()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r3, r0)     // Catch: java.lang.Throwable -> L33
            boolean r3 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L1e
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L33
        L1e:
            if (r2 != 0) goto L21
            goto L39
        L21:
            java.lang.Object r0 = r6.f5691     // Catch: java.lang.Throwable -> L33
            r0.getClass()     // Catch: java.lang.Throwable -> L33
            p000.qj1.m4887(r5, r0, r2)     // Catch: java.lang.Throwable -> L33
            oj1 r0 = new oj1     // Catch: java.lang.Throwable -> L33
            r3 = 1
            r0.<init>(r5, r6, r2, r3)     // Catch: java.lang.Throwable -> L33
            r2.post(r0)     // Catch: java.lang.Throwable -> L33
            goto L39
        L33:
            r5 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r5)
        L39:
            java.lang.Throwable r5 = p000.fo1.m2190(r1)
            if (r5 == 0) goto L58
            qj1 r6 = p000.qj1.f9022
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "ultra_comment_after 回调已降级: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "callback_ultra_comment_after"
            p000.qj1.m4888(r6, r5)
        L58:
            return
        L59:
            java.lang.Object r0 = r6.f5694     // Catch: java.lang.Throwable -> L76
            boolean r4 = r0 instanceof android.view.View     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L62
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L76
        L62:
            if (r2 != 0) goto L65
            goto L7c
        L65:
            java.lang.Object r0 = r6.f5691     // Catch: java.lang.Throwable -> L76
            r0.getClass()     // Catch: java.lang.Throwable -> L76
            p000.qj1.m4886(r5, r0, r2)     // Catch: java.lang.Throwable -> L76
            oj1 r0 = new oj1     // Catch: java.lang.Throwable -> L76
            r0.<init>(r5, r6, r2, r3)     // Catch: java.lang.Throwable -> L76
            r2.post(r0)     // Catch: java.lang.Throwable -> L76
            goto L7c
        L76:
            r5 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r5)
        L7c:
            java.lang.Throwable r5 = p000.fo1.m2190(r1)
            if (r5 == 0) goto L9b
            qj1 r6 = p000.qj1.f9022
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "comment_create_after 回调已降级: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "callback_comment_create_after"
            p000.qj1.m4888(r6, r5)
        L9b:
            return
    }
}
