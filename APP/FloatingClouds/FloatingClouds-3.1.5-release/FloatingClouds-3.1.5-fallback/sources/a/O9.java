package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O9 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ O9(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f201a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            int r2 = r1.f201a
            switch(r2) {
                case 0: goto L58;
                case 1: goto L46;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r1.b
            android.widget.EditText r2 = (android.widget.EditText) r2
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = a.Be.V(r2)
            java.lang.String r2 = r2.toString()
            boolean r3 = a.Be.P(r2)
            if (r3 != 0) goto L45
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            java.util.LinkedHashSet r3 = a.K3.a.c()
            boolean r2 = r3.add(r2)
            if (r2 == 0) goto L31
            a.K3.a.r(r3)
        L31:
            a.C0263m8.a.b()
            a.C0263m8.a.a()
            a.m8 r2 = a.C0263m8.l
            if (r2 == 0) goto L3e
            r2.s()
        L3e:
            a.m8 r2 = a.C0263m8.l
            if (r2 == 0) goto L45
            r2.r()
        L45:
            return
        L46:
            a.K3$a r2 = a.K3.f148a
            a.Y5 r3 = a.Y5.f351a
            r2.getClass()
            a.K3.a.s(r3)
            java.lang.Object r2 = r1.b
            a.n5 r2 = (a.C0278n5) r2
            r2.a()
            return
        L58:
            java.lang.Object r2 = r1.b
            java.lang.String r2 = (java.lang.String) r2
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            java.util.LinkedHashSet r3 = a.K3.a.c()
            boolean r2 = r3.add(r2)
            if (r2 == 0) goto L6e
            a.K3.a.r(r3)
        L6e:
            android.content.Context r2 = a.C0435w1.p
            if (r2 != 0) goto L73
            goto L8d
        L73:
            a.jc r3 = a.K3.a.i()
            boolean r0 = r3.R
            if (r0 == 0) goto L8d
            java.lang.String r3 = r3.V
            boolean r0 = a.Be.P(r3)
            if (r0 == 0) goto L85
            java.lang.String r3 = "刻舟求剑"
        L85:
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
        L8d:
            a.C0263m8.a.b()
            a.C0263m8.a.a()
            a.m8 r2 = a.C0263m8.l
            if (r2 == 0) goto L9a
            r2.s()
        L9a:
            a.m8 r2 = a.C0263m8.l
            if (r2 == 0) goto La1
            r2.r()
        La1:
            return
    }
}
