package a;

/* JADX INFO: renamed from: a.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0454x2 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f756a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ C0454x2(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.f756a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f756a
            switch(r0) {
                case 0: goto L75;
                default: goto L5;
            }
        L5:
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r0 = "v"
            a.C0193i9.e(r6, r0)
            int r0 = r6.getId()
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L15
            goto L70
        L15:
            android.content.res.Resources r0 = r6.getResources()     // Catch: java.lang.Throwable -> L22
            int r1 = r6.getId()     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r0.getResourceEntryName(r1)     // Catch: java.lang.Throwable -> L22
            goto L27
        L22:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L27:
            boolean r1 = r0 instanceof a.C0447wd.a
            if (r1 == 0) goto L2c
            r0 = 0
        L2c:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L31
            goto L70
        L31:
            java.lang.Object r1 = r5.c
            a.od r1 = (a.C0304od) r1
            java.util.List<java.lang.String> r1 = r1.f626a
            if (r1 == 0) goto L40
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L40
            goto L70
        L40:
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1
            boolean r3 = a.Be.I(r0, r3, r4)
            if (r3 == 0) goto L44
            int r0 = r5.b
            boolean r0 = a.C0282n9.d(r6, r0)
            if (r0 == 0) goto L70
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L6a
            int r6 = r6.length()
            goto L6b
        L6a:
            r6 = r2
        L6b:
            r0 = 10
            if (r6 > r0) goto L70
            r2 = r4
        L70:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L75:
            android.view.View r6 = (android.view.View) r6
            java.lang.String r0 = "v"
            a.C0193i9.e(r6, r0)
            boolean r0 = r6 instanceof android.widget.TextView
            if (r0 == 0) goto Lb4
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r0.getVisibility()
            if (r1 != 0) goto Lb4
            java.lang.Object r1 = r5.c
            a.y2 r1 = (a.C0472y2) r1
            java.util.Set<java.lang.String> r1 = r1.f765a
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L9a
            java.lang.String r0 = r0.toString()
            goto L9b
        L9a:
            r0 = 0
        L9b:
            boolean r0 = a.C0383t3.k0(r1, r0)
            if (r0 == 0) goto Lb4
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r6 = r6.getGlobalVisibleRect(r0)
            if (r6 == 0) goto Lb4
            int r6 = r0.bottom
            int r0 = r5.b
            if (r6 <= r0) goto Lb4
            r6 = 1
            goto Lb5
        Lb4:
            r6 = 0
        Lb5:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
    }
}
