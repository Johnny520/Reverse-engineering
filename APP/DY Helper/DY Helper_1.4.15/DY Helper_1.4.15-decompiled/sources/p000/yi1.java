package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yi1 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12640;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f12641;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f12642;

    public /* synthetic */ yi1(android.app.Activity r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f12640 = r0
            r1.<init>()
            r1.f12642 = r2
            r1.f12641 = r3
            return
    }

    public /* synthetic */ yi1(java.lang.String r2, android.app.Activity r3) {
            r1 = this;
            r0 = 1
            r1.f12640 = r0
            r1.<init>()
            r1.f12641 = r2
            r1.f12642 = r3
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r7, int r8) {
            r6 = this;
            int r7 = r6.f12640
            switch(r7) {
                case 0: goto L99;
                default: goto L5;
            }
        L5:
            java.lang.String r7 = r6.f12641
            r7.getClass()
            int r8 = r7.length()
            r0 = 0
            r1 = 3500(0xdac, float:4.905E-42)
            if (r8 > r1) goto L1e
            java.lang.String r8 = "r242b43e72f6ccb21"
            java.lang.String r7 = r8.concat(r7)
            p000.C0888ux.m5985(r7)
            goto L8d
        L1e:
            int r8 = r7.length()
            int r8 = r8 + 3499
            int r8 = r8 / r1
            p000.p91.m4419(r1, r1)
            int r1 = r7.length()
            int r2 = r1 / 3500
            int r3 = r1 % 3500
            if (r3 != 0) goto L34
            r3 = r0
            goto L35
        L34:
            r3 = 1
        L35:
            int r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r2 = r0
        L3c:
            if (r2 < 0) goto L5a
            if (r2 >= r1) goto L5a
            int r4 = r2 + 3500
            if (r4 < 0) goto L49
            if (r4 <= r1) goto L47
            goto L49
        L47:
            r5 = r4
            goto L4a
        L49:
            r5 = r1
        L4a:
            java.lang.CharSequence r2 = r7.subSequence(r2, r5)
            r2.getClass()
            java.lang.String r2 = r2.toString()
            r3.add(r2)
            r2 = r4
            goto L3c
        L5a:
            java.util.Iterator r7 = r3.iterator()
            r1 = r0
        L5f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r7.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L88
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "re4c55833703f0c26"
            r1.<init>(r4)
            r1.append(r3)
            r1.append(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p000.C0888ux.m5985(r1)
            r1 = r3
            goto L5f
        L88:
            p000.AbstractC1021yh.m6917()
            r6 = 0
            throw r6
        L8d:
            java.lang.String r7 = "已打印调试 JSON 到日志"
            android.app.Activity r6 = r6.f12642
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r0)
            r6.show()
            return
        L99:
            java.lang.String r7 = "clipboard"
            android.app.Activity r8 = r6.f12642
            java.lang.Object r7 = r8.getSystemService(r7)
            boolean r0 = r7 instanceof android.content.ClipboardManager
            if (r0 == 0) goto La8
            android.content.ClipboardManager r7 = (android.content.ClipboardManager) r7
            goto La9
        La8:
            r7 = 0
        La9:
            if (r7 == 0) goto Lb6
            java.lang.String r0 = "profile_aweme_debug"
            java.lang.String r6 = r6.f12641
            android.content.ClipData r6 = android.content.ClipData.newPlainText(r0, r6)
            r7.setPrimaryClip(r6)
        Lb6:
            java.lang.String r6 = "已复制调试 JSON"
            r7 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r8, r6, r7)
            r6.show()
            return
    }
}
