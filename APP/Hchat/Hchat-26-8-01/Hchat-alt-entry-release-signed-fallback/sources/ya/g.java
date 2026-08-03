package ya;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final og.k f22385e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Set f22386f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.b f22387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f22388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ya.c f22389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ya.a f22390d;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "\\d+\\+?|…|\\.{2,3}"
            r0.<init>(r1)
            ya.g.f22385e = r0
            java.lang.String r0 = "发现"
            java.lang.String r1 = "我"
            java.lang.String r2 = "微信"
            java.lang.String r3 = "通讯录"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            ya.g.f22386f = r0
            return
    }

    public g(java.lang.ClassLoader r1, y9.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f22387a = r2
            return
    }

    public static void b(android.view.View r6, int r7, java.util.LinkedHashSet r8) {
            r0 = 4
            if (r7 <= r0) goto L5
            goto L7e
        L5:
            boolean r0 = r6 instanceof android.widget.TextView
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L5f
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r4 = r0.getText()
            if (r4 == 0) goto L37
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L37
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L37
            int r5 = r4.length()
            if (r5 <= 0) goto L2d
            r5 = r3
            goto L2e
        L2d:
            r5 = r2
        L2e:
            if (r5 == 0) goto L31
            goto L32
        L31:
            r4 = r1
        L32:
            if (r4 == 0) goto L37
            r8.add(r4)
        L37:
            java.lang.CharSequence r0 = r0.getContentDescription()
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L5f
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L5f
            int r4 = r0.length()
            if (r4 <= 0) goto L55
            r4 = r3
            goto L56
        L55:
            r4 = r2
        L56:
            if (r4 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            if (r0 == 0) goto L5f
            r8.add(r0)
        L5f:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L66
            r1 = r6
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L66:
            if (r1 == 0) goto L7e
            int r6 = r1.getChildCount()
        L6c:
            if (r2 < r6) goto L6f
            goto L7e
        L6f:
            android.view.View r0 = r1.getChildAt(r2)
            r0.getClass()
            int r4 = r7 + 1
            b(r0, r4, r8)
            int r2 = r2 + 1
            goto L6c
        L7e:
            return
    }

    public static android.widget.TextView c(android.view.View r4) {
            boolean r0 = r4 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L27
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r2 = r0.getText()
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1d
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            goto L1e
        L1d:
            r2 = r1
        L1e:
            java.lang.String r3 = "微信"
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L27
            return r0
        L27:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L2f
        L2e:
            r4 = r1
        L2f:
            if (r4 == 0) goto L4a
            int r0 = r4.getChildCount()
            r2 = 0
        L36:
            if (r2 < r0) goto L39
            goto L4a
        L39:
            android.view.View r3 = r4.getChildAt(r2)
            r3.getClass()
            android.widget.TextView r3 = c(r3)
            if (r3 == 0) goto L47
            return r3
        L47:
            int r2 = r2 + 1
            goto L36
        L4a:
            return r1
    }

    public static void d(android.view.View r3, fg.l r4) {
            r4.invoke(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto La
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto Lb
        La:
            r3 = 0
        Lb:
            if (r3 == 0) goto L22
            int r0 = r3.getChildCount()
            r1 = 0
        L12:
            if (r1 < r0) goto L15
            goto L22
        L15:
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            d(r2, r4)
            int r1 = r1 + 1
            goto L12
        L22:
            return
    }

    public final void a() {
            r2 = this;
            r0 = 0
            r2.f22389c = r0
            ya.a r1 = r2.f22390d
            if (r1 == 0) goto Lc
            r1.c()
            r2.f22390d = r0
        Lc:
            return
    }
}
