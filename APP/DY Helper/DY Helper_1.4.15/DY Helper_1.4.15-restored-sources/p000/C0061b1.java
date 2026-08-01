package p000;

/* JADX INFO: renamed from: b1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0061b1 extends p000.bp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1401;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ androidx.compose.p001ui.platform.AndroidComposeView f1402;

    public /* synthetic */ C0061b1(androidx.compose.p001ui.platform.AndroidComposeView r1, int r2) {
            r0 = this;
            r0.f1401 = r2
            r0.f1402 = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f1401
            switch(r0) {
                case 0: goto L34;
                default: goto L5;
            }
        L5:
            p70 r5 = (p000.p70) r5
            androidx.compose.ui.platform.AndroidComposeView r4 = r4.f1402
            r4.getUncaughtExceptionHandler$ui()
            android.os.Handler r0 = r4.getHandler()
            if (r0 == 0) goto L17
            android.os.Looper r0 = r0.getLooper()
            goto L18
        L17:
            r0 = 0
        L18:
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto L22
            r5.invoke()
            goto L31
        L22:
            android.os.Handler r4 = r4.getHandler()
            if (r4 == 0) goto L31
            r0 r0 = new r0
            r1 = 1
            r0.<init>(r1, r5)
            r4.post(r0)
        L31:
            s62 r4 = p000.s62.f9751
            return r4
        L34:
            q40 r5 = (p000.q40) r5
            int r5 = r5.f8856
            androidx.compose.ui.platform.AndroidComposeView r4 = r4.f1402
            v40 r4 = r4.getFocusOwner()
            y40 r4 = (p000.y40) r4
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f12445
            um1 r1 = new um1
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.f10912 = r2
            c50 r2 = r4.m6827()
            ml1 r0 = r0.getEmbeddedViewFocusRect()
            x40 r3 = new x40
            r3.<init>(r1, r5)
            java.lang.Boolean r5 = r4.m6826(r5, r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r5, r0)
            if (r0 == 0) goto L6b
            c50 r4 = r4.m6827()
            if (r2 == r4) goto L6b
            goto L7f
        L6b:
            if (r5 == 0) goto L7f
            java.lang.Object r4 = r1.f10912
            if (r4 != 0) goto L72
            goto L7f
        L72:
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r1.f10912
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
        L7f:
            s62 r4 = p000.s62.f9751
            return r4
    }
}
