package p000;

/* JADX INFO: renamed from: vl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0914vl implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11340;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f11341;

    public /* synthetic */ C0914vl(p000.um1 r1, int r2) {
            r0 = this;
            r0.f11340 = r2
            r0.f11341 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f11340
            switch(r0) {
                case 0: goto L61;
                case 1: goto L57;
                case 2: goto L4d;
                case 3: goto L43;
                case 4: goto L39;
                case 5: goto L2f;
                case 6: goto L25;
                case 7: goto L1b;
                case 8: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
        Le:
            s62 r4 = p000.s62.f9751
            return r4
        L11:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L1b:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L25:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L2f:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L39:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L43:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L4d:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L57:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            um1 r4 = r4.f11341
            r4.f10912 = r5
            goto Le
        L61:
            android.view.View r5 = (android.view.View) r5
            r5.getClass()
            um1 r4 = r4.f11341
            java.lang.Object r0 = r4.f10912
            if (r0 == 0) goto L6d
            goto Lb9
        L6d:
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L72
            goto Lb9
        L72:
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "~791C379118E47E8B07D05A90B0CB47BAE4B25E3CE56C7556A7BA2B119EDA86273BF6"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 != 0) goto L97
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = ".DuxTextView"
            boolean r1 = p000.x02.m6479(r1, r3, r2)
            if (r1 == 0) goto Lb9
        L97:
            r1 = 0
            if (r0 == 0) goto L9d
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L9e
        L9d:
            r5 = r1
        L9e:
            if (r5 != 0) goto La1
            goto Lb9
        La1:
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto Lab
            java.lang.String r1 = r0.toString()
        Lab:
            if (r1 != 0) goto Laf
            java.lang.String r1 = ""
        Laf:
            java.lang.String r0 = "同时发布"
            boolean r0 = p000.q02.m4654(r1, r0, r2)
            if (r0 == 0) goto Lb9
            r4.f10912 = r5
        Lb9:
            s62 r4 = p000.s62.f9751
            return r4
    }
}
