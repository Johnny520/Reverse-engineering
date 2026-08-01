package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0694 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final char[] f2348 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final java.lang.Object f2349 = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            xhss.AbstractC0694.f2348 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.AbstractC0694.f2349 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final long m1193(long r5, long r7) {
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r2 == 0) goto L23
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L23
        L13:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L22
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            goto L22
        L1c:
            long r5 = r5 + r7
            long r5 = xhss.AbstractC0473.m861(r5)
            return r5
        L22:
            return r7
        L23:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L2c
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2c
            goto L33
        L2c:
            long r7 = r7 ^ r5
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 < 0) goto L34
        L33:
            return r5
        L34:
            r5 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            return r5
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public static final int m1194(java.lang.String r1, int r2) {
            char r0 = r1.charAt(r2)
            int r2 = r2 + 1
            char r1 = r1.charAt(r2)
            int r2 = r0 << 7
            int r2 = r2 + r1
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static final void m1195(xhss.C0230 r3, java.lang.String r4) {
            java.lang.Object r3 = r3.f894
            android.widget.EditText r3 = (android.widget.EditText) r3
            r0 = -6941128886341(0xfffff9afe47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            int r0 = r3.getSelectionStart()
            r1 = 0
            if (r0 >= 0) goto L14
            r0 = r1
        L14:
            int r2 = r3.getSelectionEnd()
            if (r2 >= 0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            android.text.Editable r3 = r3.getText()
            int r2 = java.lang.Math.min(r0, r1)
            int r0 = java.lang.Math.max(r0, r1)
            r3.replace(r2, r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public static void m1196(android.content.Context r11) {
            r0 = -6292588824645(0xfffffa46e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            android.content.Context r0 = xhss.C1085.m1746(r11)
            android.view.LayoutInflater r1 = xhss.AbstractC0968.m1604(r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r0)
            r0 = 1678442535(0x640b0027, float:1.0256434E22)
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r2, r3)
            r1 = 1678245999(0x6408006f, float:1.0035154E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto La7
            r1 = 1678246107(0x640800db, float:1.0035275E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto La7
            r1 = 1678246109(0x640800dd, float:1.0035278E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r8 = r2
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto La7
            r1 = 1678246112(0x640800e0, float:1.0035281E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r9 = r2
            android.widget.EditText r9 = (android.widget.EditText) r9
            if (r9 == 0) goto La7
            r1 = 1678246121(0x640800e9, float:1.0035291E22)
            android.view.View r2 = xhss.AbstractC0775.m1320(r0, r1)
            r10 = r2
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto La7
            xhss.ᛳᛲᲀᲈ r4 = new xhss.ᛳᛲᲀᲈ
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = -6326948563013(0xfffffa3ee47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r0)
            xhss.ᛵᲇᲀᛳ r0 = xhss.C0523.m931(r11)
            r1 = -6382783137861(0xfffffa31e47a77bb, double:NaN)
            java.lang.String r1 = xhss.AbstractC0775.m1313(r1)
            r0.f1907 = r1
            r0.m933()
            r0.f1901 = r3
            r1 = -6404257974341(0xfffffa2ce47a77bb, double:NaN)
            java.lang.String r1 = xhss.AbstractC0775.m1313(r1)
            r0.f1900 = r1
            r0.m933()
            xhss.ᛵᲈᲁᲈ r1 = new xhss.ᛵᲈᲁᲈ
            r2 = 26
            r1.<init>(r2)
            r0.f83 = r1
            xhss.ᛲᛴᛱᛴ r1 = new xhss.ᛲᛴᛱᛴ
            r1.<init>(r11, r4, r5)
            r0.f1909 = r1
            r0.m933()
            r0.m935()
            return
        La7:
            android.content.res.Resources r11 = r0.getResources()
            java.lang.String r11 = r11.getResourceName(r1)
            r0 = -354820594960453(0xfffebd4ae47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            java.lang.String r11 = r0.concat(r11)
            xhss.C0532.m953(r11)
            return
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static final void m1197(java.lang.String r5) {
            int r0 = r5.length()
            if (r0 <= 0) goto L5b
            int r0 = r5.length()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L5a
            char r2 = r5.charAt(r1)
            r3 = 33
            if (r3 > r2) goto L1c
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L1c
            int r1 = r1 + 1
            goto Lb
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected char 0x"
            r0.<init>(r3)
            r3 = 16
            xhss.AbstractC0955.m1551(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r3 = r2.length()
            r4 = 2
            if (r3 >= r4) goto L39
            java.lang.String r3 = "0"
            java.lang.String r2 = r3.concat(r2)
        L39:
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in header name: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L5a:
            return
        L5b:
            java.lang.String r5 = "name is empty"
            xhss.C0532.m959(r5)
            return
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public static final long m1198(int r2, xhss.EnumC0540 r3) {
            xhss.ᛶᛲᛲᲁ r0 = xhss.EnumC0540.f1958
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L18
            long r0 = (long) r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.TimeUnit r3 = r3.f1961
            long r2 = r2.convert(r0, r3)
            xhss.ᛳᛴᲀᲁ r0 = xhss.AbstractC0012.f154
            r0 = 1
            long r2 = r2 << r0
            int r0 = xhss.AbstractC0344.f1269
            return r2
        L18:
            long r0 = (long) r2
            long r2 = m1214(r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public static android.widget.LinearLayout m1199(android.content.Context r7, java.lang.String r8, android.view.View r9) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r0.setLayoutParams(r3)
            r3 = 52
            int r3 = m1202(r7, r3)
            r0.setMinimumHeight(r3)
            int r2 = m1202(r7, r2)
            r3 = 4
            int r4 = m1202(r7, r3)
            r6 = 12
            int r6 = m1202(r7, r6)
            int r3 = m1202(r7, r3)
            r0.setPadding(r2, r4, r6, r3)
            r2 = 1
            r0.setClickable(r2)
            r0.setFocusable(r2)
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r6 = 16843534(0x101030e, float:2.369575E-38)
            r4.resolveAttribute(r6, r3, r2)
            int r3 = r3.resourceId
            r0.setBackgroundResource(r3)
            xhss.ᛵᛱᛷᛸ r3 = new xhss.ᛵᛱᛷᛸ
            r3.<init>()
            r0.setOnTouchListener(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r7)
            r3.setText(r8)
            r8 = 1678049409(0x64050081, float:9.813813E21)
            int r8 = r7.getColor(r8)
            r3.setTextColor(r8)
            r8 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r8)
            android.graphics.Typeface r8 = r3.getTypeface()
            r3.setTypeface(r8, r1)
            r3.setMaxLines(r2)
            android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r2 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r1, r5, r2)
            r1 = 10
            int r7 = m1202(r7, r1)
            r8.setMarginEnd(r7)
            r0.addView(r3, r8)
            r0.addView(r9)
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static final void m1200(xhss.InterfaceC0362 r4, java.lang.Throwable r5) {
            java.util.List r0 = xhss.AbstractC0304.f1158
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            xhss.ᛴᛳᲈᛴ r1 = (xhss.C0351) r1
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            if (r5 != r1) goto L1b
            r2 = r5
            goto L25
        L1b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Exception while trying to handle coroutine exception"
            r2.<init>(r3, r1)
            xhss.AbstractC1178.m1874(r2, r5)
        L25:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r1.getUncaughtExceptionHandler()
            r3.uncaughtException(r1, r2)
            goto L6
        L31:
            xhss.ᲁᛳᲀᲇ r0 = new xhss.ᲁᛳᲀᲇ     // Catch: java.lang.Throwable -> L39
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L39
            xhss.AbstractC1178.m1874(r5, r0)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.getUncaughtExceptionHandler()
            r0.uncaughtException(r4, r5)
            return
    }

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public static final java.lang.String m1201(int r10) {
            if (r10 != 0) goto L5
            java.lang.String r10 = "0"
            return r10
        L5:
            int r0 = r10 >> 28
            r0 = r0 & 15
            char[] r1 = xhss.AbstractC0694.f2348
            char r0 = r1[r0]
            int r2 = r10 >> 24
            r2 = r2 & 15
            char r2 = r1[r2]
            int r3 = r10 >> 20
            r3 = r3 & 15
            char r3 = r1[r3]
            int r4 = r10 >> 16
            r4 = r4 & 15
            char r4 = r1[r4]
            int r5 = r10 >> 12
            r5 = r5 & 15
            char r5 = r1[r5]
            int r6 = r10 >> 8
            r6 = r6 & 15
            char r6 = r1[r6]
            int r7 = r10 >> 4
            r7 = r7 & 15
            char r7 = r1[r7]
            r10 = r10 & 15
            char r10 = r1[r10]
            r1 = 8
            char[] r8 = new char[r1]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r2
            r0 = 2
            r8[r0] = r3
            r0 = 3
            r8[r0] = r4
            r0 = 4
            r8[r0] = r5
            r0 = 5
            r8[r0] = r6
            r0 = 6
            r8[r0] = r7
            r0 = 7
            r8[r0] = r10
        L51:
            if (r9 >= r1) goto L5c
            char r10 = r8[r9]
            r0 = 48
            if (r10 != r0) goto L5c
            int r9 = r9 + 1
            goto L51
        L5c:
            java.lang.String r10 = "startIndex: "
            if (r9 < 0) goto L81
            if (r9 > r1) goto L6a
            java.lang.String r10 = new java.lang.String
            int r0 = 8 - r9
            r10.<init>(r8, r9, r0)
            return r10
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r9)
            java.lang.String r10 = " > endIndex: 8"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L81:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r9)
            java.lang.String r10 = ", endIndex: 8, size: 8"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static int m1202(android.content.Context r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final android.widget.LinearLayout m1203(android.content.Context r3, xhss.C0144 r4, java.lang.String r5, java.util.List r6, xhss.InterfaceC0645 r7) {
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r3)
            r1 = 1678180481(0x64070081, float:9.961387E21)
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r1)
            r0.setImageDrawable(r1)
            r1 = 1678049410(0x64050082, float:9.813814E21)
            int r1 = r3.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            r1 = 176(0xb0, float:2.47E-43)
            r0.setImageAlpha(r1)
            android.widget.LinearLayout r0 = m1199(r3, r5, r0)
            xhss.ᲇᲇᛷᲈ r1 = new xhss.ᲇᲇᛷᲈ
            r2 = 2
            r1.<init>(r2, r7)
            r0.setOnClickListener(r1)
            m1218(r4, r3, r5, r6, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static final java.lang.String m1204(xhss.C0972 r2, int r3) {
            java.lang.String[] r2 = r2.f3173
            int r0 = r3 * 2
            java.lang.Object r2 = xhss.AbstractC0193.m447(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "name["
            r0.<init>(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static final int m1205(int r1, int r2, int r3) {
            if (r3 <= 0) goto L18
            if (r1 < r2) goto L5
            goto L1c
        L5:
            int r0 = r2 % r3
            if (r0 < 0) goto La
            goto Lb
        La:
            int r0 = r0 + r3
        Lb:
            int r1 = r1 % r3
            if (r1 < 0) goto Lf
            goto L10
        Lf:
            int r1 = r1 + r3
        L10:
            int r0 = r0 - r1
            int r0 = r0 % r3
            if (r0 < 0) goto L15
            goto L16
        L15:
            int r0 = r0 + r3
        L16:
            int r2 = r2 - r0
            return r2
        L18:
            if (r3 >= 0) goto L31
            if (r1 > r2) goto L1d
        L1c:
            return r2
        L1d:
            int r3 = -r3
            int r1 = r1 % r3
            if (r1 < 0) goto L22
            goto L23
        L22:
            int r1 = r1 + r3
        L23:
            int r0 = r2 % r3
            if (r0 < 0) goto L28
            goto L29
        L28:
            int r0 = r0 + r3
        L29:
            int r1 = r1 - r0
            int r1 = r1 % r3
            if (r1 < 0) goto L2e
            goto L2f
        L2e:
            int r1 = r1 + r3
        L2f:
            int r1 = r1 + r2
            return r1
        L31:
            java.lang.String r1 = "Step is zero."
            xhss.C0532.m959(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static native void m1206(android.view.View r0, int r1, xhss.C0345 r2, xhss.C1036 r3);

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final native android.widget.LinearLayout m1207(android.content.Context r0, xhss.C0144 r1, java.lang.String r2, xhss.C0345 r3, java.util.List r4, int r5);

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static final long m1208(long r3) {
            xhss.ᛳᛴᲀᲁ r0 = xhss.AbstractC0012.f154
            r1 = 1
            long r3 = r3 << r1
            r1 = 1
            long r3 = r3 + r1
            r0.getClass()
            int r0 = xhss.AbstractC0344.f1269
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static final xhss.C0425 m1209(xhss.C0972 r2) {
            xhss.ᛴᲈᛱᲁ r0 = new xhss.ᛴᲈᛱᲁ
            r1 = 1
            r0.<init>(r1)
            java.lang.String[] r2 = r2.f3173
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.ArrayList r1 = r0.f1504
            r1.addAll(r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final void m1210(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "size="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " offset="
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = " byteCount="
            r1.append(r4)
            r1.append(r8)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public static java.lang.String m1211(java.security.cert.X509Certificate r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sha256/"
            r0.<init>(r1)
            java.security.PublicKey r13 = r13.getPublicKey()
            byte[] r13 = r13.getEncoded()
            int r1 = r13.length
            int r2 = r13.length
            long r3 = (long) r2
            r5 = 0
            long r7 = (long) r1
            m1210(r3, r5, r7)
            r2 = 0
            byte[] r13 = xhss.AbstractC0193.m451(r13, r2, r1)
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)
            int r3 = r13.length
            r1.update(r13, r2, r3)
            byte[] r13 = r1.digest()
            byte[] r1 = xhss.AbstractC0659.f2255
            int r3 = r13.length
            r4 = 2
            int r3 = r3 + r4
            int r3 = r3 / 3
            int r3 = r3 * 4
            byte[] r3 = new byte[r3]
            int r5 = r13.length
            int r6 = r13.length
            int r6 = r6 % 3
            int r5 = r5 - r6
            r6 = r2
        L3c:
            if (r2 >= r5) goto L79
            int r7 = r2 + 1
            r8 = r13[r2]
            int r9 = r2 + 2
            r7 = r13[r7]
            int r2 = r2 + 3
            r9 = r13[r9]
            int r10 = r6 + 1
            r11 = r8 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> r4
            r11 = r1[r11]
            r3[r6] = r11
            int r11 = r6 + 2
            r8 = r8 & 3
            int r8 = r8 << 4
            r12 = r7 & 255(0xff, float:3.57E-43)
            int r12 = r12 >> 4
            r8 = r8 | r12
            r8 = r1[r8]
            r3[r10] = r8
            int r8 = r6 + 3
            r7 = r7 & 15
            int r7 = r7 << r4
            r10 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 6
            r7 = r7 | r10
            r7 = r1[r7]
            r3[r11] = r7
            int r6 = r6 + 4
            r7 = r9 & 63
            r7 = r1[r7]
            r3[r8] = r7
            goto L3c
        L79:
            int r7 = r13.length
            int r7 = r7 - r5
            r5 = 1
            r8 = 61
            if (r7 == r5) goto Lad
            if (r7 == r4) goto L83
            goto Lc9
        L83:
            int r5 = r2 + 1
            r2 = r13[r2]
            r13 = r13[r5]
            int r5 = r6 + 1
            r7 = r2 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> r4
            r7 = r1[r7]
            r3[r6] = r7
            int r7 = r6 + 2
            r2 = r2 & 3
            int r2 = r2 << 4
            r9 = r13 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 4
            r2 = r2 | r9
            r2 = r1[r2]
            r3[r5] = r2
            int r6 = r6 + 3
            r13 = r13 & 15
            int r13 = r13 << r4
            r13 = r1[r13]
            r3[r7] = r13
            r3[r6] = r8
            goto Lc9
        Lad:
            r13 = r13[r2]
            int r2 = r6 + 1
            r5 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r5 >> 2
            r4 = r1[r4]
            r3[r6] = r4
            int r4 = r6 + 2
            r13 = r13 & 3
            int r13 = r13 << 4
            r13 = r1[r13]
            r3[r2] = r13
            int r6 = r6 + 3
            r3[r4] = r8
            r3[r6] = r8
        Lc9:
            java.lang.String r13 = new java.lang.String
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            r13.<init>(r3, r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            return r13
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final void m1212(android.content.Context r7, xhss.C0246 r8, xhss.C0144 r9, java.util.ArrayList r10, java.lang.String r11) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r5 = 14
            int r5 = m1202(r7, r5)
            r2.topMargin = r5
            r0.setLayoutParams(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r7)
            r2.setText(r11)
            r11 = 1678049410(0x64050082, float:9.813814E21)
            int r11 = r7.getColor(r11)
            r2.setTextColor(r11)
            r11 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r3, r4)
            r5 = 7
            int r5 = m1202(r7, r5)
            r11.bottomMargin = r5
            r2.setLayoutParams(r11)
            r11 = 4
            int r5 = m1202(r7, r11)
            r6 = 0
            int r11 = m1202(r7, r11)
            r2.setPadding(r5, r6, r11, r6)
            android.graphics.Typeface r11 = r2.getTypeface()
            r2.setTypeface(r11, r1)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r11.<init>(r7)
            r11.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r3, r4)
            r11.setLayoutParams(r7)
            r7 = 1678180455(0x64070067, float:9.961358E21)
            r11.setBackgroundResource(r7)
            r11.setClipToOutline(r1)
            r0.addView(r2)
            r0.addView(r11)
            java.lang.Object r7 = r8.f920
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r7.addView(r0)
            xhss.ᛵᛷᛷᛲ r7 = new xhss.ᛵᛷᛷᛲ
            r7.<init>(r0, r2, r11)
            r10.add(r7)
            r9.f617 = r7
            return
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static final void m1213(java.lang.String r5, java.lang.String r6) {
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L70
            char r2 = r5.charAt(r1)
            r3 = 9
            if (r2 == r3) goto L6d
            r3 = 32
            if (r3 > r2) goto L18
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 >= r3) goto L18
            goto L6d
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected char 0x"
            r0.<init>(r3)
            r3 = 16
            xhss.AbstractC0955.m1551(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r3 = r2.length()
            r4 = 2
            if (r3 >= r4) goto L35
            java.lang.String r3 = "0"
            java.lang.String r2 = r3.concat(r2)
        L35:
            r0.append(r2)
            java.lang.String r2 = " at "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " value"
            r0.append(r1)
            boolean r6 = xhss.AbstractC0577.m1043(r6)
            if (r6 == 0) goto L56
            java.lang.String r5 = ""
            goto L5c
        L56:
            java.lang.String r6 = ": "
            java.lang.String r5 = r6.concat(r5)
        L5c:
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L6d:
            int r1 = r1 + 1
            goto L5
        L70:
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public static final long m1214(long r8, xhss.EnumC0540 r10) {
            java.util.concurrent.TimeUnit r0 = r10.f1961
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r0.convert(r1, r3)
            long r4 = -r1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L21
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L21
            long r8 = r3.convert(r8, r0)
            xhss.ᛳᛴᲀᲁ r10 = xhss.AbstractC0012.f154
            r10 = 1
            long r8 = r8 << r10
            int r10 = xhss.AbstractC0344.f1269
            return r8
        L21:
            xhss.ᛶᛲᛲᲁ r1 = xhss.EnumC0540.f1959
            int r1 = r10.compareTo(r1)
            if (r1 < 0) goto La8
            int r0 = java.lang.Long.signum(r8)
            long r0 = (long) r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L38
            r8 = r2
        L38:
            long r8 = java.lang.Math.abs(r8)
            int r2 = r10.ordinal()
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == r3) goto L68
            r3 = 3
            if (r2 == r3) goto L65
            r3 = 4
            if (r2 == r3) goto L61
            r3 = 5
            if (r2 == r3) goto L5d
            r3 = 6
            if (r2 != r3) goto L57
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L69
        L57:
            java.lang.String r8 = "Wrong unit for millisMultiplier: "
            xhss.C0532.m948(r10, r8)
            return r4
        L5d:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L69
        L61:
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L69
        L65:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L69
        L68:
            r2 = r6
        L69:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L6f
        L6d:
            r8 = r4
            goto La2
        L6f:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r10 != 0) goto L7f
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L7d
            goto La1
        L7d:
            r8 = r2
            goto La2
        L7f:
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L88
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
            goto La1
        L88:
            int r10 = java.lang.Long.numberOfLeadingZeros(r8)
            int r10 = 128 - r10
            int r6 = java.lang.Long.numberOfLeadingZeros(r2)
            int r10 = r10 - r6
            r6 = 63
            if (r10 >= r6) goto L99
            long r8 = r8 * r2
            goto La2
        L99:
            if (r10 <= r6) goto L9c
            goto La1
        L9c:
            long r8 = r8 * r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
        La1:
            goto L6d
        La2:
            long r0 = r0 * r8
            long r8 = m1208(r0)
            return r8
        La8:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r10.convert(r8, r0)
            long r8 = xhss.AbstractC0473.m861(r8)
            long r8 = m1208(r8)
            return r8
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public static java.nio.MappedByteBuffer m1215(android.content.Context r8, android.net.Uri r9) {
            android.content.ContentResolver r8 = r8.getContentResolver()
            r1 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r9, r0, r1)     // Catch: java.io.IOException -> L4c
            if (r8 != 0) goto L13
            if (r8 == 0) goto L4c
            r8.close()     // Catch: java.io.IOException -> L4c
            return r1
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileDescriptor r0 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L36
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.close()     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.io.IOException -> L4c
            return r0
        L33:
            r0 = move-exception
            r9 = r0
            goto L42
        L36:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r9 = r0
            r2.addSuppressed(r9)     // Catch: java.lang.Throwable -> L33
        L41:
            throw r2     // Catch: java.lang.Throwable -> L33
        L42:
            r8.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.io.IOException -> L4c
        L4b:
            throw r9     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public static final android.widget.RadioButton m1216(android.content.Context r2, android.widget.RadioGroup r3, java.lang.String r4, int r5) {
            android.widget.RadioButton r0 = new android.widget.RadioButton
            r0.<init>(r2)
            int r1 = android.view.View.generateViewId()
            r0.setId(r1)
            r0.setText(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.setTag(r4)
            r4 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r4)
            r4 = 1678049409(0x64050081, float:9.813813E21)
            int r4 = r2.getColor(r4)
            r0.setTextColor(r4)
            r4 = 52
            int r2 = m1202(r2, r4)
            r0.setMinimumHeight(r2)
            r3.addView(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static xhss.C1181 m1217() {
            xhss.ᛱᲇᛴᲇ r0 = xhss.C1181.f3808
            java.lang.Object r1 = r0.f486
            xhss.ᲈᲀᲇᛶ[] r1 = (xhss.C1181[]) r1
            r2 = 1
            r1 = r1[r2]
            r3 = 0
            if (r1 != 0) goto L30
            long r4 = java.lang.System.nanoTime()
            java.util.concurrent.locks.Condition r1 = xhss.C1181.f3811
            long r6 = xhss.C1181.f3806
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.await(r6, r8)
            java.lang.Object r0 = r0.f486
            xhss.ᲈᲀᲇᛶ[] r0 = (xhss.C1181[]) r0
            r0 = r0[r2]
            if (r0 != 0) goto L2f
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r4
            long r4 = xhss.C1181.f3809
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L2f
            xhss.ᲈᲀᲇᛶ r0 = xhss.C1181.f3807
            return r0
        L2f:
            return r3
        L30:
            long r4 = java.lang.System.nanoTime()
            long r6 = r1.f3813
            long r6 = r6 - r4
            r4 = 0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L45
            java.util.concurrent.locks.Condition r0 = xhss.C1181.f3811
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.await(r6, r1)
            return r3
        L45:
            r0.m295(r1)
            r0 = 2
            r1.f3812 = r0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final void m1218(xhss.C0144 r6, android.content.Context r7, java.lang.String r8, java.util.List r9, android.widget.LinearLayout r10) {
            java.lang.Object r6 = r6.f617
            xhss.ᛵᛷᛷᛲ r6 = (xhss.C0493) r6
            if (r6 != 0) goto L7
            return
        L7:
            java.util.List r0 = r6.f1806
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 == 0) goto L12
            r1 = 0
            goto L56
        L12:
            android.view.View r1 = new android.view.View
            r1.<init>(r7)
            r3 = 1678049347(0x64050043, float:9.813743E21)
            int r3 = r7.getColor(r3)
            r1.setBackgroundColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            android.content.res.Resources r4 = r7.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r5 = 1050253722(0x3e99999a, float:0.3)
            float r4 = r4 * r5
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L74
            int r4 = java.lang.Math.round(r4)
            int r4 = java.lang.Math.max(r2, r4)
            r5 = -1
            r3.<init>(r5, r4)
            r4 = 16
            int r5 = m1202(r7, r4)
            r3.setMarginStart(r5)
            int r4 = m1202(r7, r4)
            r3.setMarginEnd(r4)
            r1.setLayoutParams(r3)
        L56:
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r7)
            r3.setOrientation(r2)
            if (r1 == 0) goto L63
            r3.addView(r1)
        L63:
            r3.addView(r10)
            android.widget.LinearLayout r6 = r6.f1804
            r6.addView(r3)
            xhss.ᛷᛱᲁᲀ r6 = new xhss.ᛷᛱᲁᲀ
            r6.<init>(r8, r9, r3, r1)
            r0.add(r6)
            return
        L74:
            java.lang.String r6 = "Cannot round NaN value."
            xhss.C0532.m959(r6)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final java.lang.String m1219(xhss.C0972 r2, int r3) {
            java.lang.String[] r2 = r2.f3173
            int r0 = r3 * 2
            int r0 = r0 + 1
            java.lang.Object r2 = xhss.AbstractC0193.m447(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Lf
            return r2
        Lf:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "value["
            r0.<init>(r1)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static void m1220(xhss.C1181 r8) {
            xhss.ᲈᲀᲇᛶ r0 = xhss.C1181.f3807
            r1 = 1
            if (r0 != 0) goto L19
            xhss.ᲈᲀᲇᛶ r0 = new xhss.ᲈᲀᲇᛶ
            r0.<init>()
            xhss.C1181.f3807 = r0
            xhss.ᲀᲀᛶᛸ r0 = new xhss.ᲀᲀᛶᛸ
            java.lang.String r2 = "Okio Watchdog"
            r0.<init>(r2)
            r0.setDaemon(r1)
            r0.start()
        L19:
            long r2 = java.lang.System.nanoTime()
            long r4 = r8.f789
            boolean r0 = r8.f790
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L36
            if (r0 == 0) goto L36
            long r6 = r8.mo478()
            long r6 = r6 - r2
            long r4 = java.lang.Math.min(r4, r6)
            long r4 = r4 + r2
            r8.f3813 = r4
            goto L44
        L36:
            if (r6 == 0) goto L3c
            long r2 = r2 + r4
            r8.f3813 = r2
            goto L44
        L3c:
            if (r0 == 0) goto L6b
            long r2 = r8.mo478()
            r8.f3813 = r2
        L44:
            xhss.ᛱᲇᛴᲇ r0 = xhss.C1181.f3808
            int r2 = r0.f485
            int r2 = r2 + r1
            r0.f485 = r2
            java.lang.Object r3 = r0.f486
            xhss.ᲈᲀᲇᛶ[] r3 = (xhss.C1181[]) r3
            int r4 = r3.length
            if (r2 != r4) goto L5e
            int r4 = r2 * 2
            xhss.ᲈᲀᲇᛶ[] r4 = new xhss.C1181[r4]
            r5 = 14
            r6 = 0
            xhss.AbstractC0193.m450(r6, r6, r5, r3, r4)
            r0.f486 = r4
        L5e:
            r0.m293(r2, r8)
            int r8 = r8.f3814
            if (r8 != r1) goto L6a
            java.util.concurrent.locks.Condition r8 = xhss.C1181.f3811
            r8.signal()
        L6a:
            return
        L6b:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final xhss.C0972 m1221(xhss.C0425 r2) {
            xhss.ᲁᛸᛱᛵ r0 = new xhss.ᲁᛸᛱᛵ
            java.util.ArrayList r2 = r2.f1504
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2)
            return r0
    }
}
