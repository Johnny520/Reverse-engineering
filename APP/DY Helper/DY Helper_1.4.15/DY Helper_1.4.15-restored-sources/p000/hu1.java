package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hu1 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4819;

    public /* synthetic */ hu1(int r1) {
            r0 = this;
            r0.f4819 = r1
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r2 = r2.f4819
            r0 = 0
            s62 r1 = p000.s62.f9751
            switch(r2) {
                case 0: goto Laf;
                case 1: goto L9c;
                case 2: goto L89;
                case 3: goto L76;
                case 4: goto L63;
                case 5: goto L43;
                case 6: goto L33;
                case 7: goto L13;
                default: goto L8;
            }
        L8:
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.intValue()
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            return r1
        L13:
            g42 r3 = (p000.g42) r3
            sp r4 = (p000.InterfaceC0806sp) r4
            boolean r2 = r4 instanceof p000.c42
            if (r2 == 0) goto L32
            c42 r4 = (p000.c42) r4
            up r2 = r3.f4231
            java.lang.String r2 = "Compose:LaunchedEffect"
            android.os.Trace.beginSection(r2)
            java.lang.Object[] r2 = r3.f4232
            int r0 = r3.f4234
            r2[r0] = r1
            c42[] r2 = r3.f4233
            int r1 = r0 + 1
            r3.f4234 = r1
            r2[r0] = r4
        L32:
            return r3
        L33:
            c42 r3 = (p000.c42) r3
            sp r4 = (p000.InterfaceC0806sp) r4
            if (r3 == 0) goto L3b
            r0 = r3
            goto L42
        L3b:
            boolean r2 = r4 instanceof p000.c42
            if (r2 == 0) goto L42
            r0 = r4
            c42 r0 = (p000.c42) r0
        L42:
            return r0
        L43:
            sp r4 = (p000.InterfaceC0806sp) r4
            boolean r2 = r4 instanceof p000.c42
            if (r2 == 0) goto L62
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 == 0) goto L50
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
        L50:
            r2 = 1
            if (r0 == 0) goto L58
            int r3 = r0.intValue()
            goto L59
        L58:
            r3 = r2
        L59:
            if (r3 != 0) goto L5d
            r3 = r4
            goto L62
        L5d:
            int r3 = r3 + r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L62:
            return r3
        L63:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            android.widget.Switch r4 = (android.widget.Switch) r4
            r4.getClass()
            bv1 r3 = p000.bv1.f1853
            java.lang.String r3 = "auto_scroll_article_enabled"
            p000.ui1.m5871(r3, r2)
            return r1
        L76:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            android.widget.Switch r4 = (android.widget.Switch) r4
            r4.getClass()
            bv1 r3 = p000.bv1.f1853
            java.lang.String r3 = "auto_scroll_image_enabled"
            p000.ui1.m5871(r3, r2)
            return r1
        L89:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            android.widget.Switch r4 = (android.widget.Switch) r4
            r4.getClass()
            bv1 r3 = p000.bv1.f1853
            java.lang.String r3 = "auto_scroll_next_enabled"
            p000.ui1.m5871(r3, r2)
            return r1
        L9c:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            android.widget.Switch r4 = (android.widget.Switch) r4
            r4.getClass()
            bv1 r3 = p000.bv1.f1853
            java.lang.String r3 = "seekbar_time_enabled"
            p000.ui1.m5871(r3, r2)
            return r1
        Laf:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r2 = r3.booleanValue()
            android.widget.Switch r4 = (android.widget.Switch) r4
            r4.getClass()
            bv1 r3 = p000.bv1.f1853
            java.lang.String r3 = "pet_elf_auto_success_toast_enabled"
            p000.ui1.m5871(r3, r2)
            return r1
    }
}
