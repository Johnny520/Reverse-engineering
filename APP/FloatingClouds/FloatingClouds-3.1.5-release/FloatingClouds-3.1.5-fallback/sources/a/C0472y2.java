package a;

/* JADX INFO: renamed from: a.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0472y2 implements a.Oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Set<java.lang.String> f765a;
    public final java.util.Set<java.lang.String> b;

    public C0472y2() {
            r8 = this;
            r8.<init>()
            java.lang.String r4 = "WeChat"
            java.lang.String r5 = "Contacts"
            java.lang.String r0 = "微信"
            java.lang.String r1 = "通讯录"
            java.lang.String r2 = "发现"
            java.lang.String r3 = "我"
            java.lang.String r6 = "Discover"
            java.lang.String r7 = "Me"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.util.Set r0 = a.C0282n9.z(r0)
            r8.f765a = r0
            java.lang.String r0 = "Weixin"
            java.lang.String r1 = "微信"
            java.lang.String r2 = "WeChat"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r0}
            java.util.Set r0 = a.C0282n9.z(r0)
            r8.b = r0
            return
    }

    @Override // a.Oe
    public final a.Ne.a a(android.app.Activity r4, android.view.View r5, java.lang.Class<?> r6) {
            r3 = this;
            a.Ne$a r4 = a.Ne.a.c
            if (r5 != 0) goto L5
            return r4
        L5:
            android.content.Context r6 = r5.getContext()     // Catch: java.lang.Throwable -> L18
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L18
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch: java.lang.Throwable -> L18
            int r6 = r6.heightPixels     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L18
            goto L1d
        L18:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        L1d:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r6 instanceof a.C0447wd.a
            if (r1 == 0) goto L27
            r6 = r0
        L27:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 > 0) goto L30
            return r4
        L30:
            float r0 = (float) r6
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r0 * r1
            int r0 = (int) r0
            int r6 = r6 + (-200)
            if (r0 >= r6) goto L3b
            r0 = r6
        L3b:
            a.x2 r6 = new a.x2
            r1 = 0
            r6.<init>(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a.C0435w1.m(r5, r6, r0)
            java.util.Iterator r5 = r0.iterator()
        L4d:
            boolean r6 = r5.hasNext()
            r0 = 0
            if (r6 == 0) goto L77
            java.lang.Object r6 = r5.next()
            r1 = r6
            android.view.View r1 = (android.view.View) r1
        L5b:
            if (r1 == 0) goto L4d
            boolean r2 = r1.isSelected()
            if (r2 != 0) goto L78
            boolean r2 = r1.isActivated()
            if (r2 == 0) goto L6a
            goto L78
        L6a:
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L75
            android.view.View r1 = (android.view.View) r1
            goto L5b
        L75:
            r1 = r0
            goto L5b
        L77:
            r6 = r0
        L78:
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L90
            boolean r5 = r6 instanceof android.widget.TextView
            if (r5 == 0) goto L83
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L84
        L83:
            r6 = r0
        L84:
            if (r6 == 0) goto L90
            java.lang.CharSequence r5 = r6.getText()
            if (r5 == 0) goto L90
            java.lang.String r0 = r5.toString()
        L90:
            if (r0 != 0) goto L93
            goto La0
        L93:
            java.util.Set<java.lang.String> r4 = r3.b
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L9e
            a.Ne$a r4 = a.Ne.a.f188a
            goto La0
        L9e:
            a.Ne$a r4 = a.Ne.a.b
        La0:
            return r4
    }

    @Override // a.Oe
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "bottomTab"
            return r0
    }
}
