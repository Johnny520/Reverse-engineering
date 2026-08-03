package da;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.List f2155k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f2156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f2157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f2158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f2159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f2160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f2161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sf.i f2162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sf.i f2163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sf.i f2164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f2165j;

    static {
            java.lang.String r0 = "bjx"
            java.lang.String r1 = "bj2"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            da.h.f2155k = r0
            return
    }

    public h(r8.g r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f2156a = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_message_text_color_config"
            android.content.SharedPreferences r0 = ub.b.c(r2, r0)
            r1.f2157b = r0
            java.lang.String r0 = "Hchat_message_text_color_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f2158c = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f2159d = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f2160e = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f2161f = r2
            da.a r2 = new da.a
            r0 = 0
            r2.<init>(r1, r0)
            sf.i r0 = new sf.i
            r0.<init>(r2)
            r1.f2162g = r0
            da.a r2 = new da.a
            r0 = 1
            r2.<init>(r1, r0)
            sf.i r0 = new sf.i
            r0.<init>(r2)
            r1.f2163h = r0
            da.a r2 = new da.a
            r0 = 2
            r2.<init>(r1, r0)
            sf.i r0 = new sf.i
            r0.<init>(r2)
            r1.f2164i = r0
            return
    }

    public static android.widget.TextView A(android.view.View r3) {
            boolean r0 = m(r3)
            r1 = 0
            if (r0 == 0) goto L22
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "getWrappedTextView"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r2, r0)
            boolean r2 = r0 instanceof android.widget.TextView
            if (r2 == 0) goto L17
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L1b
            return r0
        L1b:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L29
            android.widget.TextView r3 = (android.widget.TextView) r3
            return r3
        L22:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L29
            android.widget.TextView r3 = (android.widget.TextView) r3
            return r3
        L29:
            return r1
    }

    public static final int a(da.h r4, android.view.View r5, da.f r6) {
            r4.getClass()
            android.view.View r4 = r6.f2150a
            android.widget.TextView r6 = r6.f2151b
            int r0 = r4.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            if (r0 <= 0) goto L13
            goto L14
        L13:
            r1 = r2
        L14:
            if (r1 == 0) goto L1b
        L16:
            int r0 = r1.intValue()
            goto L2e
        L1b:
            int r0 = r6.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L26
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 == 0) goto L2a
            goto L16
        L2a:
            int r0 = r6.getMeasuredWidth()
        L2e:
            int r1 = r4.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto L39
            goto L3a
        L39:
            r3 = r2
        L3a:
            if (r3 == 0) goto L41
            int r1 = r3.intValue()
            goto L57
        L41:
            int r1 = r6.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto L4c
            r2 = r3
        L4c:
            if (r2 == 0) goto L53
            int r1 = r2.intValue()
            goto L57
        L53:
            int r1 = r6.getMeasuredHeight()
        L57:
            r2 = 0
            if (r0 >= 0) goto L5b
            r0 = r2
        L5b:
            if (r1 >= 0) goto L5e
            r1 = r2
        L5e:
            int r0 = r0 * r1
            android.graphics.drawable.Drawable r1 = r4.getBackground()
            if (r1 != 0) goto L6b
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            if (r1 == 0) goto L6f
        L6b:
            r1 = 100000(0x186a0, float:1.4013E-40)
            int r0 = r0 + r1
        L6f:
            float r1 = r6.getTextSize()
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            r2 = 1
            r3 = 1095761920(0x41500000, float:13.0)
            float r6 = android.util.TypedValue.applyDimension(r2, r3, r6)
            int r6 = (int) r6
            float r6 = (float) r6
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 < 0) goto L8a
            int r0 = r0 + 20000
        L8a:
            r6 = 2
            int[] r1 = new int[r6]
            int[] r6 = new int[r6]
            r4.getLocationOnScreen(r1)
            r5.getLocationOnScreen(r6)
            r4 = r1[r2]
            r5 = r6[r2]
            if (r4 < r5) goto L9d
            int r0 = r0 + 5000
        L9d:
            return r0
    }

    public static void b(java.lang.String r3, java.util.LinkedHashSet r4) {
            java.lang.String r3 = s(r3)
            int r0 = r3.length()
            if (r0 != 0) goto Lb
            goto L2b
        Lb:
            r4.add(r3)
            java.lang.String r0 = ":\n"
            r1 = 6
            r2 = 0
            int r0 = og.m.r0(r3, r0, r2, r2, r1)
            if (r0 <= 0) goto L2b
            int r0 = r0 + 2
            int r1 = r3.length()
            if (r0 >= r1) goto L2b
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r3 = s(r3)
            r4.add(r3)
        L2b:
            return
    }

    public static void c(java.lang.String r2, java.util.ArrayList r3) {
            if (r2 == 0) goto L19
            boolean r0 = og.m.t0(r2)
            if (r0 != 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L19
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            sf.e r1 = new sf.e
            r1.<init>(r0, r2)
            r3.add(r1)
        L19:
            return
    }

    public static void d(android.view.View r10) {
            r0 = 2131099711(0x7f06003f, float:1.7811783E38)
            java.lang.Object r1 = r10.getTag(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto Le5
            android.widget.TextView r1 = A(r10)
            r2 = 2131099712(0x7f060040, float:1.7811785E38)
            java.lang.Object r3 = r10.getTag(r2)
            boolean r4 = r3 instanceof da.b
            r5 = 0
            if (r4 == 0) goto L22
            da.b r3 = (da.b) r3
            goto L23
        L22:
            r3 = r5
        L23:
            java.lang.String r4 = "setTextColor"
            r6 = 2131099713(0x7f060041, float:1.7811787E38)
            if (r1 == 0) goto L90
            if (r3 == 0) goto L90
            int r7 = r3.f2140e
            android.graphics.LinearGradient r8 = r3.f2141f
            if (r8 == 0) goto L47
            android.text.TextPaint r8 = r1.getPaint()
            android.graphics.Shader r8 = r8.getShader()
            android.graphics.LinearGradient r9 = r3.f2141f
            if (r8 != r9) goto L47
            android.text.TextPaint r8 = r1.getPaint()
            android.graphics.Shader r9 = r3.f2139d
            r8.setShader(r9)
        L47:
            int r8 = r1.getCurrentTextColor()
            if (r8 != r7) goto L6d
            android.content.res.ColorStateList r8 = r3.f2136a
            boolean r9 = m(r10)
            if (r9 == 0) goto L64
            int r9 = r8.getDefaultColor()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            h.Hchat.utils.KavaReflector.invokeMethod(r10, r4, r9)
        L64:
            r1.setTextColor(r8)
            r1.invalidate()
            r10.invalidate()
        L6d:
            android.text.TextPaint r4 = r1.getPaint()
            int r4 = r4.linkColor
            if (r4 != r7) goto Ld9
            android.content.res.ColorStateList r4 = r3.f2137b
            int r3 = r3.f2138c
            r1.setLinkTextColor(r4)
            boolean r1 = m(r10)
            if (r1 == 0) goto Ld9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "setLinkTextColor"
            h.Hchat.utils.KavaReflector.invokeMethod(r10, r3, r1)
            goto Ld9
        L90:
            java.lang.Object r3 = r10.getTag(r2)
            boolean r7 = r3 instanceof java.lang.Integer
            if (r7 == 0) goto L9b
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L9c
        L9b:
            r3 = r5
        L9c:
            java.lang.Object r7 = r10.getTag(r6)
            boolean r8 = r7 instanceof java.lang.Integer
            if (r8 == 0) goto La7
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto La8
        La7:
            r7 = r5
        La8:
            if (r3 == 0) goto Ld9
            if (r7 == 0) goto Ld9
            if (r1 == 0) goto Ld9
            int r8 = r1.getCurrentTextColor()
            int r7 = r7.intValue()
            if (r8 != r7) goto Ld9
            android.text.TextPaint r7 = r1.getPaint()
            r7.setShader(r5)
            int r7 = r3.intValue()
            boolean r8 = m(r10)
            if (r8 == 0) goto Ld0
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            h.Hchat.utils.KavaReflector.invokeMethod(r10, r4, r3)
        Ld0:
            r1.setTextColor(r7)
            r1.invalidate()
            r10.invalidate()
        Ld9:
            r10.setTag(r0, r5)
            r10.setTag(r2, r5)
            r10.setTag(r6, r5)
            r10.invalidate()
        Le5:
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto L100
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r0 = r10.getChildCount()
            r1 = 0
        Lf0:
            if (r1 < r0) goto Lf3
            goto L100
        Lf3:
            android.view.View r2 = r10.getChildAt(r1)
            r2.getClass()
            d(r2)
            int r1 = r1 + 1
            goto Lf0
        L100:
            return
    }

    public static void e(android.view.View r16, java.util.List r17, boolean r18, java.util.ArrayList r19) {
            r0 = r16
            r1 = r18
            r2 = r19
            android.widget.TextView r3 = A(r0)
            r4 = 0
            if (r3 == 0) goto Lc2
            java.lang.String r5 = r(r0, r3)
            java.lang.String r5 = s(r5)
            int r6 = r5.length()
            if (r6 <= 0) goto Lc2
            java.util.Iterator r6 = r17.iterator()
        L1f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb0
            java.lang.Object r7 = r6.next()
            r8 = r7
            da.d r8 = (da.d) r8
            r9 = 35
            java.lang.String r10 = ""
            java.lang.String r11 = "#"
            r12 = 2
            r13 = 1
            if (r1 == 0) goto L5e
            java.lang.String r8 = r8.f2145a
            boolean r14 = r5.equals(r8)
            if (r14 == 0) goto L40
            goto Lad
        L40:
            boolean r9 = og.m.i0(r8, r9)
            if (r9 != 0) goto L49
        L46:
            r13 = r4
            goto Lad
        L49:
            java.lang.String r8 = og.t.a0(r8, r11, r10, r4)
            int r9 = r8.length()
            if (r9 >= r12) goto L54
            goto L46
        L54:
            java.lang.String r9 = og.t.a0(r5, r11, r10, r4)
            boolean r8 = r9.equals(r8)
            r13 = r8
            goto Lad
        L5e:
            java.lang.String r8 = r8.f2145a
            int r14 = r8.length()
            if (r14 >= r12) goto L67
            goto L46
        L67:
            int r14 = r5.length()
            int r15 = r8.length()
            int r15 = r15 * 3
            int r15 = r15 + 12
            if (r14 <= r15) goto L76
            goto L46
        L76:
            boolean r14 = og.m.h0(r5, r8, r4)
            if (r14 == 0) goto L7d
            goto Lad
        L7d:
            boolean r9 = og.m.i0(r8, r9)
            if (r9 != 0) goto L84
            goto L8e
        L84:
            java.lang.String r8 = og.t.a0(r8, r11, r10, r4)
            int r9 = r8.length()
            if (r9 >= r12) goto L8f
        L8e:
            goto L46
        L8f:
            java.lang.String r9 = og.t.a0(r5, r11, r10, r4)
            int r10 = r8.length()
            if (r10 < r12) goto L46
            int r10 = r9.length()
            int r11 = r8.length()
            int r11 = r11 * 3
            int r11 = r11 + 12
            if (r10 > r11) goto L46
            boolean r8 = og.m.h0(r9, r8, r4)
            if (r8 == 0) goto L46
        Lad:
            if (r13 == 0) goto L1f
            goto Lb1
        Lb0:
            r7 = 0
        Lb1:
            da.d r7 = (da.d) r7
            if (r7 == 0) goto Lc2
            da.e r5 = new da.e
            da.f r6 = new da.f
            r6.<init>(r0, r3)
            r5.<init>(r6, r7, r1)
            r2.add(r5)
        Lc2:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto Lde
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r0.getChildCount()
        Lcc:
            if (r4 < r3) goto Lcf
            goto Lde
        Lcf:
            android.view.View r5 = r0.getChildAt(r4)
            r5.getClass()
            r6 = r17
            e(r5, r6, r1, r2)
            int r4 = r4 + 1
            goto Lcc
        Lde:
            return
    }

    public static void f(android.view.View r7, java.util.List r8, boolean r9, java.util.ArrayList r10) {
            android.widget.TextView r0 = A(r7)
            r1 = 0
            if (r0 == 0) goto L59
            java.lang.String r2 = r(r7, r0)
            java.lang.String r2 = n(r2)
            int r3 = r2.length()
            if (r3 <= 0) goto L59
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L1c
            goto L59
        L1c:
            java.util.Iterator r3 = r8.iterator()
        L20:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r9 == 0) goto L33
            boolean r4 = r2.equals(r4)
            goto L4f
        L33:
            int r5 = r4.length()
            r6 = 2
            if (r5 >= r6) goto L3c
        L3a:
            r4 = r1
            goto L4f
        L3c:
            int r5 = r2.length()
            int r6 = r4.length()
            int r6 = r6 * 3
            int r6 = r6 + 12
            if (r5 <= r6) goto L4b
            goto L3a
        L4b:
            boolean r4 = og.m.h0(r2, r4, r1)
        L4f:
            if (r4 == 0) goto L20
            da.f r2 = new da.f
            r2.<init>(r7, r0)
            r10.add(r2)
        L59:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L73
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r0 = r7.getChildCount()
        L63:
            if (r1 < r0) goto L66
            goto L73
        L66:
            android.view.View r2 = r7.getChildAt(r1)
            r2.getClass()
            f(r2, r8, r9, r10)
            int r1 = r1 + 1
            goto L63
        L73:
            return
    }

    public static void g(android.view.View r5, java.util.ArrayList r6) {
            boolean r0 = m(r5)
            r1 = 0
            if (r0 == 0) goto Lc
            android.widget.TextView r0 = A(r5)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L9b
            java.lang.String r2 = r(r5, r0)
            java.lang.String r2 = s(r2)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L1f
            goto L9b
        L1f:
            int r3 = r2.length()
            r4 = 1200(0x4b0, float:1.682E-42)
            if (r3 <= r4) goto L29
            goto L9b
        L29:
            java.lang.String r3 = "\\d{1,2}:\\d{2}"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L3d
            goto L9b
        L3d:
            java.lang.String r3 = "已读"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L9b
            java.lang.String r3 = "未读"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4e
            goto L9b
        L4e:
            int r2 = r0.getWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r2 <= 0) goto L59
            goto L5a
        L59:
            r3 = r1
        L5a:
            if (r3 == 0) goto L61
            int r2 = r3.intValue()
            goto L65
        L61:
            int r2 = r0.getMeasuredWidth()
        L65:
            int r3 = r0.getHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r3 <= 0) goto L70
            r1 = r4
        L70:
            if (r1 == 0) goto L77
            int r1 = r1.intValue()
            goto L7b
        L77:
            int r1 = r0.getMeasuredHeight()
        L7b:
            if (r2 <= 0) goto L9b
            if (r1 > 0) goto L80
            goto L9b
        L80:
            android.content.res.Resources r2 = r0.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = 1
            r4 = 1094713344(0x41400000, float:12.0)
            float r2 = android.util.TypedValue.applyDimension(r3, r4, r2)
            int r2 = (int) r2
            if (r1 >= r2) goto L93
            goto L9b
        L93:
            da.f r1 = new da.f
            r1.<init>(r5, r0)
            r6.add(r1)
        L9b:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lb6
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            r1 = 0
        La6:
            if (r1 < r0) goto La9
            goto Lb6
        La9:
            android.view.View r2 = r5.getChildAt(r1)
            r2.getClass()
            g(r2, r6)
            int r1 = r1 + 1
            goto La6
        Lb6:
            return
    }

    public static void h(android.view.View r3, java.util.ArrayList r4) {
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L7
            goto L3a
        L7:
            android.widget.TextView r0 = A(r3)
            if (r0 == 0) goto L1f
            java.lang.CharSequence r1 = y(r3, r0)
            boolean r1 = og.m.t0(r1)
            if (r1 != 0) goto L1f
            da.f r1 = new da.f
            r1.<init>(r3, r0)
            r4.add(r1)
        L1f:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3a
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L2a:
            if (r1 < r0) goto L2d
            goto L3a
        L2d:
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            h(r2, r4)
            int r1 = r1 + 1
            goto L2a
        L3a:
            return
    }

    public static java.lang.Object j(java.lang.Object r7, int r8, java.util.Set r9, int r10) {
            r0 = 0
            if (r8 < 0) goto Lae
            r1 = 3
            if (r10 > r1) goto Lae
            boolean r1 = r9.add(r7)
            if (r1 != 0) goto Le
            goto Lae
        Le:
            java.lang.Object r1 = o(r8, r7)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            r4.getClass()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r4 = z(r3, r1, r4)
            if (r4 == 0) goto L2c
            r4 = r2
            goto L2d
        L2c:
            r4 = r3
        L2d:
            if (r4 == 0) goto L30
            goto L31
        L30:
            r1 = r0
        L31:
            if (r1 == 0) goto L34
            return r1
        L34:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "java."
            boolean r4 = og.t.d0(r1, r4, r3)
            if (r4 != 0) goto Lae
            java.lang.String r4 = "android."
            boolean r1 = og.t.d0(r1, r4, r3)
            if (r1 == 0) goto L4d
            goto Lae
        L4d:
            boolean r1 = r7 instanceof android.view.View
            if (r1 != 0) goto Lae
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L56
            goto Lae
        L56:
            java.lang.Class r1 = r7.getClass()
        L5a:
            if (r1 == 0) goto Lae
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lae
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L6c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La9
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            boolean r6 = r5.isPrimitive()
            if (r6 != 0) goto L6c
            boolean r6 = r5.isArray()
            if (r6 == 0) goto L89
            goto L6c
        L89:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L6c
            java.lang.Class<java.lang.Number> r6 = java.lang.Number.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L9a
            goto L6c
        L9a:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r7)
            if (r4 == 0) goto L6c
            int r5 = r10 + 1
            java.lang.Object r4 = j(r4, r8, r9, r5)
            if (r4 == 0) goto L6c
            return r4
        La9:
            java.lang.Class r1 = r1.getSuperclass()
            goto L5a
        Lae:
            return r0
    }

    public static boolean m(android.view.View r3) {
            java.lang.Class r3 = r3.getClass()
        L4:
            r0 = 0
            if (r3 == 0) goto L33
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = "com.tencent.mm.ui.widget.MMNeat7extView"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L31
            java.lang.String r2 = "com.tencent.neattextview.textview.view.NeatTextView"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L31
            java.lang.String r2 = "NeatTextView"
            boolean r0 = og.m.h0(r1, r2, r0)
            if (r0 == 0) goto L2c
            goto L31
        L2c:
            java.lang.Class r3 = r3.getSuperclass()
            goto L4
        L31:
            r3 = 1
            return r3
        L33:
            return r0
    }

    public static java.lang.String n(java.lang.String r3) {
            java.lang.String r0 = "\u200b"
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "\ufeff"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            r0 = 160(0xa0, float:2.24E-43)
            r1 = 32
            java.lang.String r3 = r3.replace(r0, r1)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.Object o(int r4, java.lang.Object r5) {
            if (r5 == 0) goto L52
            if (r4 >= 0) goto L5
            goto L52
        L5:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L17
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r4 >= r1) goto L17
            java.lang.Object r4 = r0.get(r4)
            return r4
        L17:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class r1 = java.lang.Integer.TYPE
            r1.getClass()
            java.lang.Class[] r2 = new java.lang.Class[]{r1}
            java.lang.String r3 = "get"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r2)
            if (r0 == 0) goto L39
            return r0
        L39:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r4)
            return r4
        L52:
            r4 = 0
            return r4
    }

    public static long q(java.lang.Object r8) {
            java.lang.String r0 = "getMsgID"
            java.lang.String r1 = "getId"
            java.lang.String r2 = "getMsgId"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lc:
            r3 = 0
            r5 = 3
            if (r2 < r5) goto L39
            java.lang.String r0 = "msgID"
            java.lang.String r2 = "id"
            java.lang.String r5 = "field_msgId"
            java.lang.String r6 = "msgId"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r0, r2}
        L1d:
            r0 = 4
            if (r1 < r0) goto L21
            return r3
        L21:
            r0 = r5[r1]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r8, r0)
            java.lang.Long r0 = w(r0)
            if (r0 == 0) goto L36
            long r6 = r0.longValue()
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L36
            return r6
        L36:
            int r1 = r1 + 1
            goto L1d
        L39:
            r5 = r0[r2]
            java.lang.Class r6 = r8.getClass()
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r6, r5, r7)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r8, r6)
            java.lang.Long r5 = w(r5)
            if (r5 == 0) goto L5a
            long r5 = r5.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L5a
            return r5
        L5a:
            int r2 = r2 + 1
            goto Lc
    }

    public static java.lang.String r(android.view.View r3, android.widget.TextView r4) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "a"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r1, r0)
            boolean r1 = r0 instanceof java.lang.CharSequence
            r2 = 0
            if (r1 == 0) goto L11
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L25
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == 0) goto L25
            return r0
        L25:
            java.lang.String r0 = "x"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L32
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L33
        L32:
            r0 = r2
        L33:
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L46
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L42
            goto L43
        L42:
            r0 = r2
        L43:
            if (r0 == 0) goto L46
            return r0
        L46:
            java.lang.CharSequence r3 = r3.getContentDescription()
            if (r3 == 0) goto L5d
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L5d
            boolean r0 = og.m.t0(r3)
            if (r0 != 0) goto L59
            goto L5a
        L59:
            r3 = r2
        L5a:
            if (r3 == 0) goto L5d
            return r3
        L5d:
            java.lang.CharSequence r3 = r4.getText()
            if (r3 == 0) goto L67
            java.lang.String r2 = r3.toString()
        L67:
            if (r2 != 0) goto L6c
            java.lang.String r3 = ""
            return r3
        L6c:
            return r2
    }

    public static java.lang.String s(java.lang.String r5) {
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r5.length()
            r2 = 0
        Le:
            if (r2 < r0) goto L3b
            java.lang.String r5 = r1.toString()
            java.lang.String r0 = "[ \\t\\x0B\\f\\r]+"
            java.lang.String r1 = " "
            java.lang.String r5 = j8.b.h(r0, r5, r1)
            java.lang.String r0 = " *\\n *"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = "\n"
            java.util.regex.Matcher r5 = r0.matcher(r5)
            java.lang.String r5 = r5.replaceAll(r1)
            r5.getClass()
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            return r5
        L3b:
            char r3 = r5.charAt(r2)
            r4 = 160(0xa0, float:2.24E-43)
            if (r3 == r4) goto L6b
            r4 = 8199(0x2007, float:1.1489E-41)
            if (r3 == r4) goto L6b
            r4 = 8239(0x202f, float:1.1545E-41)
            if (r3 == r4) goto L6b
            r4 = 8288(0x2060, float:1.1614E-41)
            if (r3 == r4) goto L70
            r4 = 65279(0xfeff, float:9.1475E-41)
            if (r3 == r4) goto L70
            r4 = 65283(0xff03, float:9.1481E-41)
            if (r3 == r4) goto L65
            r4 = 65532(0xfffc, float:9.183E-41)
            if (r3 == r4) goto L70
            switch(r3) {
                case 8203: goto L70;
                case 8204: goto L70;
                case 8205: goto L70;
                case 8206: goto L70;
                case 8207: goto L70;
                default: goto L61;
            }
        L61:
            r1.append(r3)
            goto L70
        L65:
            r3 = 35
            r1.append(r3)
            goto L70
        L6b:
            r3 = 32
            r1.append(r3)
        L70:
            int r2 = r2 + 1
            goto Le
    }

    public static java.lang.Integer t(java.lang.String r2) {
            java.lang.String r2 = ac.p.l(r2)
            int r0 = r2.length()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L1c:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
    }

    public static da.c u(java.lang.String r4) {
            java.lang.String r4 = ac.p.m(r4)
            int r0 = r4.length()
            if (r0 != 0) goto Lb
            goto L4e
        Lb:
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 44
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r4 = og.m.F0(r4, r1, r2)
            r1 = 2
            java.util.List r4 = tf.m.L1(r1, r4)
            java.lang.Object r1 = tf.m.v1(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            if (r1 != 0) goto L28
            r1 = r2
        L28:
            java.lang.Integer r1 = t(r1)
            if (r1 == 0) goto L4e
            int r1 = r1.intValue()
            java.lang.Object r4 = tf.m.w1(r0, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r4
        L3c:
            java.lang.Integer r4 = t(r2)
            if (r4 == 0) goto L47
            int r4 = r4.intValue()
            goto L48
        L47:
            r4 = r1
        L48:
            da.c r0 = new da.c
            r0.<init>(r1, r4)
            return r0
        L4e:
            r4 = 0
            return r4
    }

    public static java.lang.Integer v(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Lf:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Integer r1 = og.t.f0(r1)
            return r1
        L22:
            r1 = 0
            return r1
    }

    public static java.lang.Long w(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        Lf:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Long r2 = og.t.g0(r2)
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static java.lang.Object x(java.lang.Object r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.Class r0 = r3.getClass()
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r0, r4, r2)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r4, r3, r0)
            if (r4 == 0) goto L14
            return r4
        L14:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r3, r5)
            if (r4 == 0) goto L1b
            return r4
        L1b:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r6)
            return r3
    }

    public static java.lang.CharSequence y(android.view.View r5, android.widget.TextView r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "a"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r2, r1)
            boolean r2 = r1 instanceof java.lang.CharSequence
            r3 = 0
            if (r2 == 0) goto L11
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L12
        L11:
            r1 = r3
        L12:
            r2 = 1
            if (r1 == 0) goto L25
            int r4 = r1.length()
            if (r4 <= 0) goto L1d
            r4 = r2
            goto L1e
        L1d:
            r4 = r0
        L1e:
            if (r4 == 0) goto L21
            goto L22
        L21:
            r1 = r3
        L22:
            if (r1 == 0) goto L25
            return r1
        L25:
            java.lang.String r1 = "x"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r1)
            boolean r1 = r5 instanceof java.lang.CharSequence
            if (r1 == 0) goto L32
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L33
        L32:
            r5 = r3
        L33:
            if (r5 == 0) goto L42
            int r1 = r5.length()
            if (r1 <= 0) goto L3c
            r0 = r2
        L3c:
            if (r0 == 0) goto L3f
            r3 = r5
        L3f:
            if (r3 == 0) goto L42
            return r3
        L42:
            java.lang.CharSequence r5 = r6.getText()
            r5.getClass()
            return r5
    }

    public static java.lang.Object z(int r8, java.lang.Object r9, java.util.Set r10) {
            r0 = 0
            if (r9 == 0) goto L115
            r1 = 4
            if (r8 > r1) goto L115
            boolean r1 = r10.add(r9)
            if (r1 != 0) goto Le
            goto L115
        Le:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.storage."
            r3 = 0
            boolean r2 = eh.a.z(r2, r9, r3)
            if (r2 != 0) goto L7a
            java.lang.Class r2 = r9.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            if (r2 == 0) goto L30
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L30
            goto L85
        L30:
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L34
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "getMsgId"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 != 0) goto L62
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "getMsgID"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L34
        L62:
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r5 = gg.l.a(r5, r6)
            if (r5 != 0) goto L7a
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L34
        L7a:
            long r4 = q(r9)
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L85
            return r9
        L85:
            java.lang.String r2 = "java."
            boolean r2 = og.t.d0(r1, r2, r3)
            if (r2 != 0) goto L115
            java.lang.String r2 = "android."
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 == 0) goto L97
            goto L115
        L97:
            boolean r1 = r9 instanceof android.view.View
            if (r1 != 0) goto L115
            boolean r1 = r9 instanceof android.view.ViewGroup
            if (r1 == 0) goto La0
            return r0
        La0:
            boolean r1 = r9 instanceof java.util.Collection
            if (r1 == 0) goto Lbd
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r9 = r9.iterator()
        Laa:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L115
            java.lang.Object r1 = r9.next()
            int r2 = r8 + 1
            java.lang.Object r1 = z(r2, r1, r10)
            if (r1 == 0) goto Laa
            return r1
        Lbd:
            java.lang.Class r1 = r9.getClass()
        Lc1:
            if (r1 == 0) goto L115
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L115
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L110
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            boolean r5 = r4.isPrimitive()
            if (r5 != 0) goto Ld3
            boolean r5 = r4.isArray()
            if (r5 == 0) goto Lf0
            goto Ld3
        Lf0:
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto Ld3
            java.lang.Class<java.lang.Number> r5 = java.lang.Number.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L101
            goto Ld3
        L101:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r9)
            if (r3 == 0) goto Ld3
            int r4 = r8 + 1
            java.lang.Object r3 = z(r4, r3, r10)
            if (r3 == 0) goto Ld3
            return r3
        L110:
            java.lang.Class r1 = r1.getSuperclass()
            goto Lc1
        L115:
            return r0
    }

    public final void B(android.view.View r12, android.widget.TextView r13, da.c r14, da.b r15) {
            r11 = this;
            android.text.TextPaint r0 = r13.getPaint()
            java.lang.CharSequence r1 = r13.getText()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.toString()
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L14
            java.lang.String r1 = ""
        L14:
            float r0 = r0.measureText(r1)
            int r1 = r12.getWidth()
            float r1 = (float) r1
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L23
            r6 = r1
            goto L24
        L23:
            r6 = r0
        L24:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L38
            ca.x r0 = new ca.x
            r6 = 3
            r3 = r11
            r1 = r12
            r4 = r13
            r5 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.post(r0)
            return
        L38:
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int r8 = r14.f2142a
            int r9 = r14.f2143b
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r4 = 0
            r5 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r15.f2141f = r3
            android.text.TextPaint r0 = r13.getPaint()
            r0.setShader(r3)
            r13.invalidate()
            r12.invalidate()
            return
    }

    public final java.util.List i(java.lang.String... r5) {
            r4 = this;
            r8.g r0 = r4.f2156a
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d     // Catch: java.lang.Throwable -> L4c
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.List r5 = tf.l.L0(r5)     // Catch: java.lang.Throwable -> L4c
            fh.k.u0(r3, r5)     // Catch: java.lang.Throwable -> L4c
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L4c
            hh.p r5 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4c
        L24:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L4c
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r3 = r0.f11622c     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r2 = r3
        L3e:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L44
            r2 = 0
        L44:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L24
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c
            goto L24
        L4c:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
        L52:
            java.lang.Throwable r5 = sf.g.b(r1)
            if (r5 != 0) goto L59
            goto L64
        L59:
            java.lang.String r0 = r5.getMessage()
            java.lang.String r1 = "[Hchat:MessageTextColor] 定位聊天消息绑定方法异常: "
            eh.a.x(r1, r0, r5)
            tf.t r1 = tf.t.f13167g
        L64:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final java.lang.reflect.Field k(java.lang.Class r9) {
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f2161f
            java.lang.Object r1 = r0.get(r9)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            r1 = r9
        Lc:
            r2 = 0
            if (r1 == 0) goto L58
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L58
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "itemView"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L47
            java.lang.Class r5 = r5.getType()
            java.lang.Class<android.view.View> r6 = android.view.View.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L45
            goto L47
        L45:
            r5 = 0
            goto L48
        L47:
            r5 = 1
        L48:
            if (r5 == 0) goto L1f
            r2 = r4
        L4b:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L53
            r0.put(r9, r2)
            return r2
        L53:
            java.lang.Class r1 = r1.getSuperclass()
            goto Lc
        L58:
            return r2
    }

    public final boolean l(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r0 = r6.length
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L85
            r0 = 1
            r1 = r6[r0]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L85
            r6 = r6[r2]
            if (r6 != 0) goto L1a
            goto L85
        L1a:
            r8.g r1 = r5.f2156a     // Catch: java.lang.Throwable -> L2d
            java.lang.ClassLoader r1 = r1.f11622c     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "androidx.recyclerview.widget.RecyclerView$ViewHolder"
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r1 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r1 = r3
        L34:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r1 instanceof sf.f
            if (r4 == 0) goto L3b
            r1 = r3
        L3b:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L44
            goto L7e
        L44:
            java.lang.reflect.Field r1 = r5.k(r6)
            if (r1 == 0) goto L4b
            goto L7e
        L4b:
            if (r6 == 0) goto L85
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L85
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            if (r1 == 0) goto L62
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getType()
            java.lang.Class<android.view.View> r4 = android.view.View.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L66
        L7e:
            r2 = r0
            goto L85
        L80:
            java.lang.Class r6 = r6.getSuperclass()
            goto L4b
        L85:
            return r2
    }

    public final java.lang.reflect.Method p() {
            r8 = this;
            r8.g r0 = r8.f2156a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r1 = o8.k.a(r1, r0)
            java.lang.String r1 = r1.f7933h
            boolean r2 = og.m.t0(r1)
            r3 = 0
            if (r2 != 0) goto L17
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 == 0) goto L21
            java.lang.String r2 = "|message_text_color_v3"
            java.lang.String r1 = r1.concat(r2)
            goto L22
        L21:
            r1 = r3
        L22:
            java.lang.String r2 = ""
            if (r1 != 0) goto L27
            r1 = r2
        L27:
            android.content.SharedPreferences r4 = r8.f2158c
            java.lang.String r5 = "adapter_bind"
            java.lang.reflect.Method r0 = e8.b.c(r4, r1, r0, r5)
            if (r0 == 0) goto L3c
            boolean r6 = r8.l(r0)
            if (r6 == 0) goto L38
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 == 0) goto L3c
            return r0
        L3c:
            java.lang.String r0 = "_onBindViewHolder["
            java.lang.String r6 = "msgInfo"
            java.lang.String r7 = "MicroMsg.ChattingDataAdapterV3"
            java.lang.String[] r0 = new java.lang.String[]{r7, r0, r6}
            java.util.List r0 = r8.i(r0)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L5c
            java.lang.String r0 = "holder"
            java.lang.String r6 = "itemView"
            java.lang.String[] r0 = new java.lang.String[]{r7, r0, r6}
            java.util.List r0 = r8.i(r0)
        L5c:
            java.util.Iterator r0 = r0.iterator()
        L60:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = r8.l(r7)
            if (r7 == 0) goto L60
            r3 = r6
        L74:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L7c
            e8.b.h(r4, r1, r5, r3)
            return r3
        L7c:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r6 = r4.edit()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = r4.getString(r0, r2)     // Catch: java.lang.Throwable -> L9a
            boolean r2 = gg.l.a(r2, r1)     // Catch: java.lang.Throwable -> L9a
            if (r2 != 0) goto L93
            android.content.SharedPreferences$Editor r2 = r6.clear()     // Catch: java.lang.Throwable -> L9a
            r2.putString(r0, r1)     // Catch: java.lang.Throwable -> L9a
        L93:
            android.content.SharedPreferences$Editor r0 = r6.remove(r5)     // Catch: java.lang.Throwable -> L9a
            r0.apply()     // Catch: java.lang.Throwable -> L9a
        L9a:
            return r3
    }
}
