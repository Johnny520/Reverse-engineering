package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class d4 implements defpackage.qw {
    public static final int[] d = null;
    public final /* synthetic */ int a;
    public java.lang.Object b;
    public java.lang.Object c;

    static {
            r0 = 16843067(0x101013b, float:2.369444E-38)
            r1 = 16843068(0x101013c, float:2.3694444E-38)
            int[] r0 = new int[]{r0, r1}
            defpackage.d4.d = r0
            return
    }

    public d4(int r1) {
            r0 = this;
            r0.a = r1
            switch(r1) {
                case 19: goto L17;
                default: goto L5;
            }
        L5:
            r0.<init>()
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.b = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.c = r1
            return
        L17:
            r0.<init>()
            u30 r1 = new u30
            r1.<init>()
            r0.b = r1
            bs r1 = new bs
            r1.<init>()
            r0.c = r1
            return
    }

    public d4(int r2, int r3) {
            r1 = this;
            r0 = 12
            r1.a = r0
            r1.<init>()
            int[] r2 = new int[]{r2, r3}
            r1.b = r2
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {x0016: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r1.c = r2
            return
    }

    public d4(int r2, int r3, int r4) {
            r1 = this;
            r0 = 12
            r1.a = r0
            r1.<init>()
            int[] r2 = new int[]{r2, r3, r4}
            r1.b = r2
            r2 = 3
            float[] r2 = new float[r2]
            r2 = {x0016: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            r1.c = r2
            return
    }

    public /* synthetic */ d4(int r1, boolean r2) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public d4(defpackage.a8 r1, defpackage.vh r2, defpackage.mf r3) {
            r0 = this;
            r2 = 9
            r0.a = r2
            r0.<init>()
            r0.b = r1
            r0.c = r3
            return
    }

    public d4(android.animation.Animator r2) {
            r1 = this;
            r0 = 10
            r1.a = r0
            r1.<init>()
            r0 = 0
            r1.b = r0
            r1.c = r2
            return
    }

    public d4(android.content.Context r5) {
            r4 = this;
            r0 = 5
            r4.a = r0
            r4.<init>()
            java.lang.Class<ut> r0 = defpackage.ut.class
            java.lang.String r0 = r0.getCanonicalName()
            r1 = 2130969278(0x7f0402be, float:1.7547233E38)
            android.util.TypedValue r0 = defpackage.gt.A(r5, r1, r0)
            int r0 = r0.data
            int[] r1 = defpackage.wy.l
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r0, r1)
            r1 = 4
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            defpackage.vh.f(r5, r1)
            r1 = 2
            int r1 = r0.getResourceId(r1, r2)
            defpackage.vh.f(r5, r1)
            r1 = 3
            int r1 = r0.getResourceId(r1, r2)
            defpackage.vh.f(r5, r1)
            r1 = 5
            int r1 = r0.getResourceId(r1, r2)
            defpackage.vh.f(r5, r1)
            r1 = 7
            android.content.res.ColorStateList r1 = defpackage.ct.n(r5, r0, r1)
            r3 = 9
            int r3 = r0.getResourceId(r3, r2)
            vh r3 = defpackage.vh.f(r5, r3)
            r4.b = r3
            r3 = 8
            int r3 = r0.getResourceId(r3, r2)
            defpackage.vh.f(r5, r3)
            r3 = 10
            int r2 = r0.getResourceId(r3, r2)
            vh r5 = defpackage.vh.f(r5, r2)
            r4.c = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            int r1 = r1.getDefaultColor()
            r5.setColor(r1)
            r0.recycle()
            return
    }

    public d4(android.view.animation.Animation r2) {
            r1 = this;
            r0 = 10
            r1.a = r0
            r1.<init>()
            r1.b = r2
            r2 = 0
            r1.c = r2
            return
    }

    public d4(android.widget.AbsSeekBar r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public d4(android.widget.EditText r5, int r6) {
            r4 = this;
            r4.a = r6
            switch(r6) {
                case 8: goto L12;
                default: goto L5;
            }
        L5:
            r4.<init>()
            r4.b = r5
            l0 r6 = new l0
            r6.<init>(r5)
            r4.c = r6
            return
        L12:
            r4.<init>()
            r4.b = r5
            si r6 = new si
            r6.<init>(r5)
            r4.c = r6
            r5.addTextChangedListener(r6)
            ii r6 = defpackage.ii.b
            if (r6 != 0) goto L49
            java.lang.Object r6 = defpackage.ii.a
            monitor-enter(r6)
            ii r0 = defpackage.ii.b     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L45
            ii r0 = new ii     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<ii> r2 = defpackage.ii.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L40
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L40
            defpackage.ii.c = r1     // Catch: java.lang.Throwable -> L40
        L40:
            defpackage.ii.b = r0     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r5 = move-exception
            goto L47
        L45:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
            goto L49
        L47:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
            throw r5
        L49:
            ii r6 = defpackage.ii.b
            r5.setEditableFactory(r6)
            return
    }

    public /* synthetic */ d4(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r2
            r0.c = r1
            r0.b = r3
            r0.<init>()
            return
    }

    public /* synthetic */ d4(java.lang.Object r1, java.lang.Object r2, int r3, boolean r4) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    public d4(java.lang.Runnable r2) {
            r1 = this;
            r0 = 16
            r1.a = r0
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r2
            return
    }

    public d4(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            r0 = 12
            r4.a = r0
            r4.<init>()
            int r0 = r5.size()
            int[] r1 = new int[r0]
            r4.b = r1
            float[] r1 = new float[r0]
            r4.c = r1
            r1 = 0
        L14:
            if (r1 >= r0) goto L39
            java.lang.Object r2 = r4.b
            int[] r2 = (int[]) r2
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2[r1] = r3
            java.lang.Object r2 = r4.c
            float[] r2 = (float[]) r2
            java.lang.Object r3 = r6.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L14
        L39:
            return
    }

    public d4(java.util.regex.Matcher r2, java.lang.CharSequence r3) {
            r1 = this;
            r0 = 15
            r1.a = r0
            java.lang.String r0 = "input"
            defpackage.ip.o(r0, r3)
            r1.<init>()
            r1.b = r2
            return
    }

    public d4(defpackage.lz r2) {
            r1 = this;
            r0 = 18
            r1.a = r0
            r1.<init>()
            r1.b = r2
            n90 r2 = new n90
            r2.<init>()
            r0 = 0
            r2.a = r0
            r1.c = r2
            return
    }

    public d4(defpackage.yl r2) {
            r1 = this;
            r0 = 11
            r1.a = r0
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.b = r0
            r1.c = r2
            return
    }

    public static boolean b(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L4b
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            r2 = -1
            if (r7 == r2) goto L4b
            if (r1 == r2) goto L4b
            if (r7 == r1) goto L1c
            goto L4b
        L1c:
            java.lang.Class<g80> r2 = defpackage.g80.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            g80[] r1 = (defpackage.g80[]) r1
            if (r1 == 0) goto L4b
            int r2 = r1.length
            if (r2 <= 0) goto L4b
            int r2 = r1.length
            r3 = r0
        L2b:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L3b
            if (r5 == r7) goto L43
        L3b:
            if (r8 != 0) goto L3f
            if (r4 == r7) goto L43
        L3f:
            if (r7 <= r5) goto L48
            if (r7 >= r4) goto L48
        L43:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L48:
            int r3 = r3 + 1
            goto L2b
        L4b:
            return r0
    }

    public static int v(int r5, int r6) {
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            r4 = 1
            if (r1 >= r5) goto L17
            int r2 = r2 + 1
            if (r2 != r6) goto Lf
            int r3 = r3 + 1
            r2 = r0
            goto L14
        Lf:
            if (r2 <= r6) goto L14
            int r3 = r3 + 1
            r2 = r4
        L14:
            int r1 = r1 + 1
            goto L4
        L17:
            int r2 = r2 + r4
            if (r2 <= r6) goto L1b
            int r3 = r3 + r4
        L1b:
            return r3
    }

    public void A(int r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.b
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L45
            int r0 = r0.length
            if (r4 < r0) goto La
            goto L45
        La:
            int r0 = r4 + r5
            r3.r(r0)
            java.lang.Object r1 = r3.b
            int[] r1 = (int[]) r1
            int r2 = r1.length
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r4, r1, r0, r2)
            java.lang.Object r1 = r3.b
            int[] r1 = (int[]) r1
            r2 = -1
            java.util.Arrays.fill(r1, r4, r0, r2)
            java.lang.Object r0 = r3.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L28
            goto L45
        L28:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L2e:
            if (r0 < 0) goto L45
            java.lang.Object r1 = r3.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r1 = r1.get(r0)
            l40 r1 = (defpackage.l40) r1
            int r2 = r1.a
            if (r2 >= r4) goto L3f
            goto L42
        L3f:
            int r2 = r2 + r5
            r1.a = r2
        L42:
            int r0 = r0 + (-1)
            goto L2e
        L45:
            return
    }

    public void B(int r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.b
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L52
            int r0 = r0.length
            if (r6 < r0) goto La
            goto L52
        La:
            int r0 = r6 + r7
            r5.r(r0)
            java.lang.Object r1 = r5.b
            int[] r1 = (int[]) r1
            int r2 = r1.length
            int r2 = r2 - r6
            int r2 = r2 - r7
            java.lang.System.arraycopy(r1, r0, r1, r6, r2)
            java.lang.Object r1 = r5.b
            int[] r1 = (int[]) r1
            int r2 = r1.length
            int r2 = r2 - r7
            int r3 = r1.length
            r4 = -1
            java.util.Arrays.fill(r1, r2, r3, r4)
            java.lang.Object r1 = r5.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L2b
            goto L52
        L2b:
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L52
            java.lang.Object r2 = r5.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r1)
            l40 r2 = (defpackage.l40) r2
            int r3 = r2.a
            if (r3 >= r6) goto L42
            goto L4f
        L42:
            if (r3 >= r0) goto L4c
            java.lang.Object r2 = r5.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.remove(r1)
            goto L4f
        L4c:
            int r3 = r3 - r7
            r2.a = r3
        L4f:
            int r1 = r1 + (-1)
            goto L31
        L52:
            return
    }

    public defpackage.ji C(android.view.inputmethod.InputConnection r3, android.view.inputmethod.EditorInfo r4) {
            r2 = this;
            java.lang.Object r0 = r2.c
            l0 r0 = (defpackage.l0) r0
            if (r3 != 0) goto Lb
            r0.getClass()
            r3 = 0
            goto L21
        Lb:
            java.lang.Object r0 = r0.b
            d4 r0 = (defpackage.d4) r0
            r0.getClass()
            boolean r1 = r3 instanceof defpackage.ji
            if (r1 == 0) goto L17
            goto L21
        L17:
            ji r1 = new ji
            java.lang.Object r0 = r0.b
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1.<init>(r0, r3, r4)
            r3 = r1
        L21:
            ji r3 = (defpackage.ji) r3
            return r3
    }

    public void D(defpackage.n1 r4) {
            r3 = this;
            java.lang.Object r0 = r3.b
            a8 r0 = (defpackage.a8) r0
            java.lang.Object r1 = r0.a
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            h50 r4 = r0.b(r4)
            r1.onDestroyActionMode(r4)
            java.lang.Object r4 = r3.c
            r3 r4 = (defpackage.r3) r4
            android.widget.PopupWindow r0 = r4.w
            if (r0 == 0) goto L22
            android.view.Window r0 = r4.l
            android.view.View r0 = r0.getDecorView()
            f3 r1 = r4.x
            r0.removeCallbacks(r1)
        L22:
            androidx.appcompat.widget.ActionBarContextView r0 = r4.v
            if (r0 == 0) goto L42
            wa0 r0 = r4.y
            if (r0 == 0) goto L2d
            r0.b()
        L2d:
            androidx.appcompat.widget.ActionBarContextView r0 = r4.v
            wa0 r0 = defpackage.ja0.a(r0)
            r1 = 0
            r0.a(r1)
            r4.y = r0
            h3 r1 = new h3
            r2 = 2
            r1.<init>(r2, r3)
            r0.d(r1)
        L42:
            r0 = 0
            r4.u = r0
            android.view.ViewGroup r0 = r4.A
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.w90.c(r0)
            r4.I()
            return
    }

    public boolean E(defpackage.n1 r6, android.view.Menu r7) {
            r5 = this;
            java.lang.Object r0 = r5.c
            r3 r0 = (defpackage.r3) r0
            android.view.ViewGroup r0 = r0.A
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.w90.c(r0)
            java.lang.Object r0 = r5.b
            a8 r0 = (defpackage.a8) r0
            java.lang.Object r1 = r0.a
            android.view.ActionMode$Callback r1 = (android.view.ActionMode.Callback) r1
            h50 r6 = r0.b(r6)
            java.lang.Object r2 = r0.d
            u30 r2 = (defpackage.u30) r2
            r3 = 0
            java.lang.Object r3 = r2.getOrDefault(r7, r3)
            android.view.Menu r3 = (android.view.Menu) r3
            if (r3 != 0) goto L33
            gv r3 = new gv
            java.lang.Object r0 = r0.b
            android.content.Context r0 = (android.content.Context) r0
            r4 = r7
            ku r4 = (defpackage.ku) r4
            r3.<init>(r0, r4)
            r2.put(r7, r3)
        L33:
            boolean r6 = r1.onPrepareActionMode(r6, r3)
            return r6
    }

    public void F(defpackage.zk r6) {
            r5 = this;
            java.lang.Object r0 = r5.c
            android.os.Handler r0 = (android.os.Handler) r0
            java.lang.Object r1 = r5.b
            l0 r1 = (defpackage.l0) r1
            int r2 = r6.b
            if (r2 != 0) goto L19
            android.graphics.Typeface r6 = r6.a
            h1 r2 = new h1
            r3 = 4
            r4 = 0
            r2.<init>(r1, r6, r3, r4)
            r0.post(r2)
            return
        L19:
            e8 r6 = new e8
            r3 = 0
            r6.<init>(r1, r2, r3)
            r0.post(r6)
            return
    }

    public void G(android.content.Context r10, android.content.res.XmlResourceParser r11) {
            r9 = this;
            oc r0 = new oc
            r0.<init>()
            int r1 = r11.getAttributeCount()
            r2 = 0
        La:
            if (r2 >= r1) goto L1da
            java.lang.String r3 = r11.getAttributeName(r2)
            java.lang.String r4 = "id"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L1d6
            java.lang.String r1 = r11.getAttributeValue(r2)
            java.lang.String r2 = "/"
            boolean r2 = r1.contains(r2)
            r3 = -1
            r5 = 1
            if (r2 == 0) goto L3e
            r2 = 47
            int r2 = r1.indexOf(r2)
            int r2 = r2 + r5
            java.lang.String r2 = r1.substring(r2)
            android.content.res.Resources r6 = r10.getResources()
            java.lang.String r7 = r10.getPackageName()
            int r2 = r6.getIdentifier(r2, r4, r7)
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 != r3) goto L57
            int r3 = r1.length()
            if (r3 <= r5) goto L50
            java.lang.String r1 = r1.substring(r5)
            int r2 = java.lang.Integer.parseInt(r1)
            goto L57
        L50:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r3 = "error in parsing id"
            android.util.Log.e(r1, r3)
        L57:
            int r1 = r11.getEventType()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r3 = 0
            r4 = r3
        L5d:
            if (r1 == r5) goto L1ce
            if (r1 == 0) goto L1be
            r6 = 2
            java.lang.String r7 = "Constraint"
            if (r1 == r6) goto L93
            r6 = 3
            if (r1 == r6) goto L6b
            goto L1c1
        L6b:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.String r6 = "ConstraintSet"
            boolean r6 = r6.equals(r1)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r6 == 0) goto L79
            goto L1ce
        L79:
            boolean r1 = r1.equalsIgnoreCase(r7)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            java.util.HashMap r1 = r0.c     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            int r6 = r4.a     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.put(r6, r4)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r4 = r3
            goto L1c1
        L8d:
            r10 = move-exception
            goto L1c7
        L90:
            r10 = move-exception
            goto L1cb
        L93:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            int r6 = r1.hashCode()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.String r8 = "XML parser error must be within a Constraint "
            switch(r6) {
                case -2025855158: goto L191;
                case -1984451626: goto L164;
                case -1269513683: goto L136;
                case -1238332596: goto L108;
                case -71750448: goto Lf2;
                case 1331510167: goto Ldc;
                case 1791837707: goto Lb2;
                case 1803088381: goto La2;
                default: goto La0;
            }
        La0:
            goto L1c1
        La2:
            boolean r1 = r1.equals(r7)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            jc r4 = defpackage.oc.d(r10, r1)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        Lb2:
            java.lang.String r6 = "CustomAttribute"
            boolean r1 = r1.equals(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            if (r4 == 0) goto Lc3
            java.util.HashMap r1 = r4.f     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            defpackage.dc.a(r10, r11, r1)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        Lc3:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.<init>()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r8)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r10.<init>(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            throw r10     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
        Ldc:
            java.lang.String r6 = "Barrier"
            boolean r1 = r1.equals(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            jc r4 = defpackage.oc.d(r10, r1)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            kc r1 = r4.d     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.c0 = r5     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        Lf2:
            java.lang.String r6 = "Guideline"
            boolean r1 = r1.equals(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            jc r4 = defpackage.oc.d(r10, r1)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            kc r1 = r4.d     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.a = r5     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        L108:
            java.lang.String r6 = "Transform"
            boolean r1 = r1.equals(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            if (r4 == 0) goto L11d
            nc r1 = r4.e     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.a(r10, r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        L11d:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.<init>()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r8)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r10.<init>(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            throw r10     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
        L136:
            java.lang.String r6 = "PropertySet"
            boolean r1 = r1.equals(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            if (r4 == 0) goto L14b
            mc r1 = r4.b     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.a(r10, r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        L14b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.<init>()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r8)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r10.<init>(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            throw r10     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
        L164:
            java.lang.String r6 = "Motion"
            boolean r1 = r1.equals(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            if (r4 == 0) goto L178
            lc r1 = r4.c     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.a(r10, r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        L178:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.<init>()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r8)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r10.<init>(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            throw r10     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
        L191:
            java.lang.String r6 = "Layout"
            boolean r1 = r1.equals(r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            if (r1 == 0) goto L1c1
            if (r4 == 0) goto L1a5
            kc r1 = r4.d     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.a(r10, r6)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L1c1
        L1a5:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.<init>()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r8)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r1.append(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            r10.<init>(r11)     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            throw r10     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
        L1be:
            r11.getName()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
        L1c1:
            int r1 = r11.next()     // Catch: java.io.IOException -> L8d org.xmlpull.v1.XmlPullParserException -> L90
            goto L5d
        L1c7:
            r10.printStackTrace()
            goto L1ce
        L1cb:
            r10.printStackTrace()
        L1ce:
            java.lang.Object r10 = r9.c
            android.util.SparseArray r10 = (android.util.SparseArray) r10
            r10.put(r2, r0)
            return
        L1d6:
            int r2 = r2 + 1
            goto La
        L1da:
            return
    }

    public defpackage.lw H(defpackage.b00 r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.b
            u30 r0 = (defpackage.u30) r0
            int r6 = r0.e(r6)
            r1 = 0
            if (r6 >= 0) goto Lc
            goto L46
        Lc:
            java.lang.Object r2 = r0.j(r6)
            oa0 r2 = (defpackage.oa0) r2
            if (r2 == 0) goto L46
            int r3 = r2.a
            r4 = r3 & r7
            if (r4 == 0) goto L46
            int r4 = ~r7
            r3 = r3 & r4
            r2.a = r3
            r4 = 4
            if (r7 != r4) goto L24
            lw r7 = r2.b
            goto L2a
        L24:
            r4 = 8
            if (r7 != r4) goto L3e
            lw r7 = r2.c
        L2a:
            r3 = r3 & 12
            if (r3 != 0) goto L3d
            r0.i(r6)
            r6 = 0
            r2.a = r6
            r2.b = r1
            r2.c = r1
            sx r6 = defpackage.oa0.d
            r6.c(r2)
        L3d:
            return r7
        L3e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Must provide flag PRE or POST"
            r6.<init>(r7)
            throw r6
        L46:
            return r1
    }

    public void I(defpackage.b00 r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            u30 r0 = (defpackage.u30) r0
            r1 = 0
            java.lang.Object r3 = r0.getOrDefault(r3, r1)
            oa0 r3 = (defpackage.oa0) r3
            if (r3 != 0) goto Le
            return
        Le:
            int r0 = r3.a
            r0 = r0 & (-2)
            r3.a = r0
            return
    }

    public void J(defpackage.b00 r7) {
            r6 = this;
            java.lang.Object r0 = r6.c
            bs r0 = (defpackage.bs) r0
            int r1 = r0.e()
            r2 = 1
            int r1 = r1 - r2
        La:
            if (r1 < 0) goto L22
            java.lang.Object r3 = r0.f(r1)
            if (r7 != r3) goto L1f
            java.lang.Object[] r3 = r0.c
            r4 = r3[r1]
            java.lang.Object r5 = defpackage.bs.e
            if (r4 == r5) goto L22
            r3[r1] = r5
            r0.a = r2
            goto L22
        L1f:
            int r1 = r1 + (-1)
            goto La
        L22:
            java.lang.Object r0 = r6.b
            u30 r0 = (defpackage.u30) r0
            java.lang.Object r7 = r0.remove(r7)
            oa0 r7 = (defpackage.oa0) r7
            if (r7 == 0) goto L3b
            r0 = 0
            r7.a = r0
            r0 = 0
            r7.b = r0
            r7.c = r0
            sx r0 = defpackage.oa0.d
            r0.c(r7)
        L3b:
            return
    }

    public void K(boolean r6) {
            r5 = this;
            java.lang.Object r0 = r5.c
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            d4 r0 = (defpackage.d4) r0
            java.lang.Object r0 = r0.c
            si r0 = (defpackage.si) r0
            boolean r1 = r0.c
            if (r1 == r6) goto L52
            ri r1 = r0.b
            if (r1 == 0) goto L41
            ei r1 = defpackage.ei.a()
            ri r2 = r0.b
            r1.getClass()
            java.lang.String r3 = "initCallback cannot be null"
            defpackage.zt.f(r3, r2)
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.a
            java.util.concurrent.locks.Lock r4 = r3.writeLock()
            r4.lock()
            q6 r1 = r1.b     // Catch: java.lang.Throwable -> L38
            r1.remove(r2)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.locks.Lock r1 = r3.writeLock()
            r1.unlock()
            goto L41
        L38:
            r6 = move-exception
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            throw r6
        L41:
            r0.c = r6
            if (r6 == 0) goto L52
            android.widget.EditText r6 = r0.a
            ei r0 = defpackage.ei.a()
            int r0 = r0.b()
            defpackage.si.a(r6, r0)
        L52:
            return
    }

    public android.graphics.drawable.Drawable L(android.graphics.drawable.Drawable r8, boolean r9) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ad0
            if (r0 == 0) goto Le
            r9 = r8
            ad0 r9 = (defpackage.ad0) r9
            bd0 r9 = (defpackage.bd0) r9
            r9.getClass()
            goto Ldc
        Le:
            boolean r0 = r8 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L8f
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            int r9 = r8.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r9]
            r2 = 0
            r3 = r2
        L1d:
            if (r3 >= r9) goto L3e
            int r4 = r8.getId(r3)
            android.graphics.drawable.Drawable r5 = r8.getDrawable(r3)
            r6 = 16908301(0x102000d, float:2.3877265E-38)
            if (r4 == r6) goto L34
            r6 = 16908303(0x102000f, float:2.387727E-38)
            if (r4 != r6) goto L32
            goto L34
        L32:
            r4 = r2
            goto L35
        L34:
            r4 = r1
        L35:
            android.graphics.drawable.Drawable r4 = r7.L(r5, r4)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L1d
        L3e:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
        L43:
            if (r2 >= r9) goto L8e
            int r0 = r8.getId(r2)
            r1.setId(r2, r0)
            int r0 = r8.getLayerGravity(r2)
            r1.setLayerGravity(r2, r0)
            int r0 = r8.getLayerWidth(r2)
            r1.setLayerWidth(r2, r0)
            int r0 = r8.getLayerHeight(r2)
            r1.setLayerHeight(r2, r0)
            int r0 = r8.getLayerInsetLeft(r2)
            r1.setLayerInsetLeft(r2, r0)
            int r0 = r8.getLayerInsetRight(r2)
            r1.setLayerInsetRight(r2, r0)
            int r0 = r8.getLayerInsetTop(r2)
            r1.setLayerInsetTop(r2, r0)
            int r0 = r8.getLayerInsetBottom(r2)
            r1.setLayerInsetBottom(r2, r0)
            int r0 = r8.getLayerInsetStart(r2)
            r1.setLayerInsetStart(r2, r0)
            int r0 = r8.getLayerInsetEnd(r2)
            r1.setLayerInsetEnd(r2, r0)
            int r2 = r2 + 1
            goto L43
        L8e:
            return r1
        L8f:
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Ldc
            android.graphics.drawable.BitmapDrawable r8 = (android.graphics.drawable.BitmapDrawable) r8
            android.graphics.Bitmap r0 = r8.getBitmap()
            java.lang.Object r2 = r7.c
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto La1
            r7.c = r0
        La1:
            android.graphics.drawable.ShapeDrawable r2 = new android.graphics.drawable.ShapeDrawable
            r3 = 8
            float[] r3 = new float[r3]
            r3 = {x00de: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r4 = new android.graphics.drawable.shapes.RoundRectShape
            r5 = 0
            r4.<init>(r3, r5, r5)
            r2.<init>(r4)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r0, r4, r5)
            android.graphics.Paint r0 = r2.getPaint()
            r0.setShader(r3)
            android.graphics.Paint r0 = r2.getPaint()
            android.graphics.Paint r8 = r8.getPaint()
            android.graphics.ColorFilter r8 = r8.getColorFilter()
            r0.setColorFilter(r8)
            if (r9 == 0) goto Ldb
            android.graphics.drawable.ClipDrawable r8 = new android.graphics.drawable.ClipDrawable
            r9 = 3
            r8.<init>(r2, r9, r1)
            return r8
        Ldb:
            return r2
        Ldc:
            return r8
    }

    public void a(defpackage.b00 r3, defpackage.lw r4) {
            r2 = this;
            java.lang.Object r0 = r2.b
            u30 r0 = (defpackage.u30) r0
            r1 = 0
            java.lang.Object r1 = r0.getOrDefault(r3, r1)
            oa0 r1 = (defpackage.oa0) r1
            if (r1 != 0) goto L14
            oa0 r1 = defpackage.oa0.a()
            r0.put(r3, r1)
        L14:
            r1.c = r4
            int r3 = r1.a
            r3 = r3 | 8
            r1.a = r3
            return
    }

    public void c(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.c(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    @Override // defpackage.qw
    public defpackage.wc0 d(android.view.View r17, defpackage.wc0 r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.b
            r7 r3 = (defpackage.r7) r3
            java.lang.Object r4 = r0.c
            ab0 r4 = (defpackage.ab0) r4
            int r5 = r4.a
            int r6 = r4.b
            int r4 = r4.c
            tc0 r7 = r2.a
            r8 = 7
            ep r8 = r7.f(r8)
            r9 = 32
            ep r7 = r7.f(r9)
            java.lang.Object r9 = r3.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.b
            int r11 = r8.c
            int r12 = r8.a
            r9.w = r10
            boolean r10 = defpackage.gt.n(r1)
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            boolean r0 = r9.o
            if (r0 == 0) goto L48
            int r13 = r2.a()
            r9.v = r13
            int r13 = r13 + r4
        L48:
            boolean r4 = r9.p
            if (r4 == 0) goto L53
            if (r10 == 0) goto L50
            r4 = r6
            goto L51
        L50:
            r4 = r5
        L51:
            int r14 = r4 + r12
        L53:
            boolean r4 = r9.q
            if (r4 == 0) goto L5d
            if (r10 == 0) goto L5a
            goto L5b
        L5a:
            r5 = r6
        L5b:
            int r15 = r5 + r11
        L5d:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.s
            r6 = 1
            if (r5 == 0) goto L70
            int r5 = r4.leftMargin
            if (r5 == r12) goto L70
            r4.leftMargin = r12
            r5 = r6
            goto L71
        L70:
            r5 = 0
        L71:
            boolean r10 = r9.t
            if (r10 == 0) goto L7c
            int r10 = r4.rightMargin
            if (r10 == r11) goto L7c
            r4.rightMargin = r11
            r5 = r6
        L7c:
            boolean r10 = r9.u
            if (r10 == 0) goto L89
            int r10 = r4.topMargin
            int r8 = r8.b
            if (r10 == r8) goto L89
            r4.topMargin = r8
            goto L8a
        L89:
            r6 = r5
        L8a:
            if (r6 == 0) goto L8f
            r1.setLayoutParams(r4)
        L8f:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r14, r4, r15, r13)
            boolean r1 = r3.a
            if (r1 == 0) goto L9e
            int r3 = r7.d
            r9.m = r3
        L9e:
            if (r0 != 0) goto La4
            if (r1 == 0) goto La3
            goto La4
        La3:
            return r2
        La4:
            r9.I()
            return r2
    }

    public void e(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            nl r1 = r0.n
            androidx.fragment.app.FragmentActivity r1 = r1.D
            ml r0 = r0.p
            if (r0 == 0) goto L16
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.e(r1)
        L16:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2f
            r0 = 0
            if (r3 == 0) goto L2e
            throw r0
        L2e:
            throw r0
        L2f:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L35:
            return
    }

    public void f(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.f(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void g(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.g(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void h(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.h(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void i(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.i(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void j(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            nl r1 = r0.n
            androidx.fragment.app.FragmentActivity r1 = r1.D
            ml r0 = r0.p
            if (r0 == 0) goto L16
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.j(r1)
        L16:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2f
            r0 = 0
            if (r3 == 0) goto L2e
            throw r0
        L2e:
            throw r0
        L2f:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L35:
            return
    }

    public void k(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.k(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void l(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.l(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void m(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.m(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void n(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.n(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void o(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.o(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void p(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.p(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void q(boolean r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            yl r0 = (defpackage.yl) r0
            ml r0 = r0.p
            if (r0 == 0) goto L12
            yl r0 = r0.j()
            d4 r0 = r0.k
            r1 = 1
            r0.q(r1)
        L12:
            java.lang.Object r0 = r2.b
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r0 = r0.next()
            if (r0 != 0) goto L2b
            r0 = 0
            if (r3 == 0) goto L2a
            throw r0
        L2a:
            throw r0
        L2b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L31:
            return
    }

    public void r(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L17
            r0 = 10
            int r5 = java.lang.Math.max(r5, r0)
            int r5 = r5 + 1
            int[] r5 = new int[r5]
            r4.b = r5
            java.util.Arrays.fill(r5, r1)
            return
        L17:
            int r2 = r0.length
            if (r5 < r2) goto L32
            int r2 = r0.length
        L1b:
            if (r2 > r5) goto L20
            int r2 = r2 * 2
            goto L1b
        L20:
            int[] r5 = new int[r2]
            r4.b = r5
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r5, r3, r2)
            java.lang.Object r5 = r4.b
            int[] r5 = (int[]) r5
            int r0 = r0.length
            int r2 = r5.length
            java.util.Arrays.fill(r5, r0, r2, r1)
        L32:
            return
    }

    public android.view.View s(int r10, int r11, int r12, int r13) {
            r9 = this;
            java.lang.Object r0 = r9.c
            n90 r0 = (defpackage.n90) r0
            java.lang.Object r1 = r9.b
            lz r1 = (defpackage.lz) r1
            int r2 = r1.d()
            int r3 = r1.c()
            if (r11 <= r10) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = -1
        L15:
            r5 = 0
        L16:
            if (r10 == r11) goto L52
            int r6 = r1.a
            switch(r6) {
                case 0: goto L24;
                default: goto L1d;
            }
        L1d:
            nz r6 = r1.b
            android.view.View r6 = r6.u(r10)
            goto L2a
        L24:
            nz r6 = r1.b
            android.view.View r6 = r6.u(r10)
        L2a:
            int r7 = r1.b(r6)
            int r8 = r1.a(r6)
            r0.b = r2
            r0.c = r3
            r0.d = r7
            r0.e = r8
            if (r12 == 0) goto L45
            r0.a = r12
            boolean r7 = r0.a()
            if (r7 == 0) goto L45
            return r6
        L45:
            if (r13 == 0) goto L50
            r0.a = r13
            boolean r7 = r0.a()
            if (r7 == 0) goto L50
            r5 = r6
        L50:
            int r10 = r10 + r4
            goto L16
        L52:
            return r5
    }

    public java.util.List t() {
            r1 = this;
            java.lang.Object r0 = r1.c
            ft r0 = (defpackage.ft) r0
            if (r0 != 0) goto Ld
            ft r0 = new ft
            r0.<init>(r1)
            r1.c = r0
        Ld:
            java.lang.Object r0 = r1.c
            ft r0 = (defpackage.ft) r0
            defpackage.ip.l(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 21: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bounds{lower="
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            ep r1 = (defpackage.ep) r1
            r0.append(r1)
            java.lang.String r1 = " upper="
            r0.append(r1)
            java.lang.Object r1 = r2.c
            ep r1 = (defpackage.ep) r1
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public android.text.method.KeyListener u(android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L23
            java.lang.Object r0 = r1.c
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            d4 r0 = (defpackage.d4) r0
            r0.getClass()
            boolean r0 = r2 instanceof defpackage.mi
            if (r0 == 0) goto L14
            return r2
        L14:
            if (r2 != 0) goto L18
            r2 = 0
            return r2
        L18:
            boolean r0 = r2 instanceof android.text.method.NumberKeyListener
            if (r0 == 0) goto L1d
            return r2
        L1d:
            mi r0 = new mi
            r0.<init>(r2)
            return r0
        L23:
            return r2
    }

    public boolean w(java.lang.CharSequence r8, int r9, int r10, defpackage.ni r11) {
            r7 = this;
            int r0 = r11.c
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L5e
            java.lang.Object r0 = r7.c
            bi r0 = (defpackage.bi) r0
            vv r4 = r11.b()
            r5 = 8
            int r5 = r4.a(r5)
            if (r5 == 0) goto L21
            java.lang.Object r6 = r4.d
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r4 = r4.a
            int r5 = r5 + r4
            r6.getShort(r5)
        L21:
            mf r0 = (defpackage.mf) r0
            r0.getClass()
            java.lang.ThreadLocal r4 = defpackage.mf.b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L36
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L36:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r2)
        L3f:
            if (r9 >= r10) goto L4b
            char r5 = r8.charAt(r9)
            r4.append(r5)
            int r9 = r9 + 1
            goto L3f
        L4b:
            android.text.TextPaint r8 = r0.a
            java.lang.String r9 = r4.toString()
            int r10 = defpackage.jx.a
            boolean r8 = defpackage.ix.a(r8, r9)
            if (r8 == 0) goto L5b
            r8 = r1
            goto L5c
        L5b:
            r8 = r3
        L5c:
            r11.c = r8
        L5e:
            int r8 = r11.c
            if (r8 != r1) goto L63
            return r3
        L63:
            return r2
    }

    public void x() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            r0.clear()
            return
    }

    public boolean y(android.view.View r6) {
            r5 = this;
            java.lang.Object r0 = r5.c
            n90 r0 = (defpackage.n90) r0
            java.lang.Object r1 = r5.b
            lz r1 = (defpackage.lz) r1
            int r2 = r1.d()
            int r3 = r1.c()
            int r4 = r1.b(r6)
            int r6 = r1.a(r6)
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r6
            r6 = 24579(0x6003, float:3.4443E-41)
            r0.a = r6
            boolean r6 = r0.a()
            return r6
    }

    public void z(android.util.AttributeSet r9, int r10) {
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L2f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.b
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.xy.i
            r2 = 0
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9, r1, r10, r2)
            r10 = 14
            boolean r0 = r9.hasValue(r10)     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 == 0) goto L24
            boolean r1 = r9.getBoolean(r10, r1)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r10 = move-exception
            goto L2b
        L24:
            r9.recycle()
            r8.K(r1)
            return
        L2b:
            r9.recycle()
            throw r10
        L2f:
            java.lang.Object r0 = r8.b
            android.widget.AbsSeekBar r0 = (android.widget.AbsSeekBar) r0
            android.content.Context r1 = r0.getContext()
            int[] r2 = defpackage.d4.d
            r5 r9 = defpackage.r5.y(r1, r9, r2, r10)
            r10 = 0
            android.graphics.drawable.Drawable r1 = r9.n(r10)
            r2 = 1
            if (r1 == 0) goto L7c
            boolean r3 = r1 instanceof android.graphics.drawable.AnimationDrawable
            if (r3 == 0) goto L79
            android.graphics.drawable.AnimationDrawable r1 = (android.graphics.drawable.AnimationDrawable) r1
            int r3 = r1.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r4 = new android.graphics.drawable.AnimationDrawable
            r4.<init>()
            boolean r5 = r1.isOneShot()
            r4.setOneShot(r5)
            r5 = r10
        L5c:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 >= r3) goto L75
            android.graphics.drawable.Drawable r7 = r1.getFrame(r5)
            android.graphics.drawable.Drawable r7 = r8.L(r7, r2)
            r7.setLevel(r6)
            int r6 = r1.getDuration(r5)
            r4.addFrame(r7, r6)
            int r5 = r5 + 1
            goto L5c
        L75:
            r4.setLevel(r6)
            r1 = r4
        L79:
            r0.setIndeterminateDrawable(r1)
        L7c:
            android.graphics.drawable.Drawable r1 = r9.n(r2)
            if (r1 == 0) goto L89
            android.graphics.drawable.Drawable r10 = r8.L(r1, r10)
            r0.setProgressDrawable(r10)
        L89:
            r9.z()
            return
    }
}
