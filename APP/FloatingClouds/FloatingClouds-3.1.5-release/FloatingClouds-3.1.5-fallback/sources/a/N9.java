package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N9 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185a;
    public final /* synthetic */ java.io.Serializable b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ N9(java.io.Serializable r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f185a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            int r3 = r2.f185a
            switch(r3) {
                case 0: goto L42;
                default: goto L5;
            }
        L5:
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            java.util.LinkedHashSet r3 = a.K3.a.c()
            int r3 = r3.size()
            if (r3 <= 0) goto L19
            a.b6 r3 = a.C0063b6.f410a
            a.K3.a.r(r3)
        L19:
            a.C0263m8.a.b()
            a.C0263m8.a.a()
            a.m8 r3 = a.C0263m8.l
            if (r3 == 0) goto L26
            r3.s()
        L26:
            a.m8 r3 = a.C0263m8.l
            if (r3 == 0) goto L2d
            r3.r()
        L2d:
            java.io.Serializable r3 = r2.b
            a.Sc r3 = (a.Sc) r3
            T r3 = r3.f263a
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            if (r3 == 0) goto L3a
            r3.dismiss()
        L3a:
            java.lang.Object r3 = r2.c
            a.ra r3 = (a.C0354ra) r3
            r3.e()
            return
        L42:
            java.io.Serializable r3 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.c
            android.content.Context r4 = (android.content.Context) r4
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L5d
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = "Label"
            android.content.ClipData r3 = android.content.ClipData.newPlainText(r1, r3)     // Catch: java.lang.Exception -> L5d
            r0.setPrimaryClip(r3)     // Catch: java.lang.Exception -> L5d
        L5d:
            java.lang.String r3 = "已复制 SnsId"
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r4, r3, r0)
            r3.show()
            return
    }
}
