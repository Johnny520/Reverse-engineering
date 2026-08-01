package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements defpackage.sm {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ f(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // defpackage.sm
    public final java.lang.Object f(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L76;
                case 1: goto L64;
                case 2: goto L4d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.b
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L4a
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()     // Catch: java.lang.Throwable -> L37
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L37
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            r3 = 150(0x96, float:2.1E-43)
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L37
            float r2 = r2 * r3
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L37
            r3 = 1
            if (r2 >= r3) goto L26
            r2 = r3
        L26:
            defpackage.p7.n(r1, r2)     // Catch: java.lang.Throwable -> L37
            r2 = 4
            if (r5 != 0) goto L30
            r0.clearFlags(r2)     // Catch: java.lang.Throwable -> L37
            goto L33
        L30:
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> L37
        L33:
            r0.setAttributes(r1)     // Catch: java.lang.Throwable -> L37
            goto L4a
        L37:
            java.lang.String r5 = "G/D3921Ql7gX1+/2dm6CrA==\n"
            java.lang.String r0 = "SJWDgwQ+8Ms=\n"
            java.lang.String r5 = defpackage.u40.a(r5, r0)
            java.lang.String r0 = "Fg==\n"
            java.lang.String r1 = "c8HJlSTQVfc=\n"
            java.lang.String r2 = "Nwje\n"
            java.lang.String r3 = "Q2m5jaPP2Zc=\n"
            defpackage.z30.o(r2, r3, r5, r0, r1)
        L4a:
            vh r5 = defpackage.vh.n
            return r5
        L4d:
            java.lang.Object r0 = r4.b
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "Xjm7mKqv7Xc=\n"
            java.lang.String r2 = "MFzMzsvDmBI=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            defpackage.ip.o(r1, r5)
            r0.setText(r5)
        L61:
            vh r5 = defpackage.vh.n
            return r5
        L64:
            java.lang.Object r0 = r4.b
            o9 r0 = (defpackage.o9) r0
            java.lang.String r5 = (java.lang.String) r5
            android.os.Handler r1 = defpackage.d9.b
            t5 r2 = new t5
            r3 = 1
            r2.<init>(r0, r3, r5)
            r1.post(r2)
            goto L61
        L76:
            java.lang.Object r0 = r4.b
            l r0 = (defpackage.l) r0
            if (r5 != r0) goto L7f
            java.lang.String r5 = "(this Collection)"
            goto L83
        L7f:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L83:
            return r5
    }
}
