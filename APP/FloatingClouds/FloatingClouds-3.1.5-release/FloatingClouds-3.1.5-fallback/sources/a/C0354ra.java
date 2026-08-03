package a;

/* JADX INFO: renamed from: a.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0354ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f669a;
    public final a.C0354ra.a b;
    public final boolean c;
    public android.app.AlertDialog d;
    public android.widget.LinearLayout e;
    public android.widget.ScrollView f;
    public int g;
    public android.widget.Switch h;
    public boolean i;
    public a.C0203j2 j;
    public final a.Me k;

    /* JADX INFO: renamed from: a.ra$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f670a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;

        public a(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9) {
                r0 = this;
                r0.<init>()
                r0.f670a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.g = r7
                r0.h = r8
                r0.i = r9
                return
        }
    }

    /* JADX INFO: renamed from: a.ra$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f671a;
        public final java.lang.String b;
        public final a.H7<android.widget.LinearLayout, a.C0213jc, a.Wf> c;

        public b(java.lang.String r1, java.lang.String r2, a.H7<? super android.widget.LinearLayout, ? super a.C0213jc, a.Wf> r3) {
                r0 = this;
                r0.<init>()
                r0.f671a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0354ra.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.ra$b r5 = (a.C0354ra.b) r5
                java.lang.String r1 = r5.f671a
                java.lang.String r3 = r4.f671a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r3 = r5.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                a.H7<android.widget.LinearLayout, a.jc, a.Wf> r1 = r4.c
                a.H7<android.widget.LinearLayout, a.jc, a.Wf> r5 = r5.c
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f671a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                a.H7<android.widget.LinearLayout, a.jc, a.Wf> r1 = r3.c
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Group(title="
                r0.<init>(r1)
                java.lang.String r1 = r2.f671a
                r0.append(r1)
                java.lang.String r1 = ", desc="
                r0.append(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", build="
                r0.append(r1)
                a.H7<android.widget.LinearLayout, a.jc, a.Wf> r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public C0354ra(android.app.Activity r14) {
            r13 = this;
            r13.<init>()
            r13.f669a = r14
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            int r14 = r14.uiMode
            r14 = r14 & 48
            r0 = 32
            java.lang.String r1 = "#FA5151"
            if (r14 != r0) goto L4c
            a.ra$a r2 = new a.ra$a
            java.lang.String r14 = "#111111"
            int r3 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#1E1E1E"
            int r4 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#2C2C2C"
            int r5 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#F2F2F2"
            int r6 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#B3B3B3"
            int r7 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#666666"
            int r8 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#8FB2DC"
            int r9 = android.graphics.Color.parseColor(r14)
            int r10 = android.graphics.Color.parseColor(r1)
            r11 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L81
        L4c:
            a.ra$a r3 = new a.ra$a
            java.lang.String r14 = "#EDEDED"
            int r4 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#FFFFFF"
            int r5 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#DDDDDD"
            int r6 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#191919"
            int r7 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#888888"
            int r8 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#B0B0B0"
            int r9 = android.graphics.Color.parseColor(r14)
            java.lang.String r14 = "#576B95"
            int r10 = android.graphics.Color.parseColor(r14)
            int r11 = android.graphics.Color.parseColor(r1)
            r12 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r3
        L81:
            r13.b = r2
            boolean r14 = r2.i
            r13.c = r14
            r14 = -1
            r13.g = r14
            a.da r14 = new a.da
            r0 = 0
            r14.<init>(r13, r0)
            a.Me r0 = new a.Me
            r0.<init>(r14)
            r13.k = r0
            return
    }

    public static java.lang.String c(long r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L9
            java.lang.String r3 = "未知"
            return r3
        L9:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            java.lang.String r3 = r0.format(r1)
            java.lang.String r4 = "format(...)"
            a.C0193i9.d(r3, r4)
            return r3
    }

    public static void i(a.C0213jc r1) {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.K3.a.t(r1)
            r1 = 0
            a.K3.j = r1
            a.K3.k = r1
            a.K3.l = r1
            return
    }

    public static java.lang.String k(java.lang.String r2) {
            if (r2 == 0) goto L2b
            int r0 = r2.length()
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.lang.String r0 = "null"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L12
            goto L2b
        L12:
            int r0 = r2.length()
            r1 = 12
            if (r0 <= r1) goto L2a
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r0 = "substring(...)"
            a.C0193i9.d(r2, r0)
            java.lang.String r0 = "..."
            java.lang.String r2 = r2.concat(r0)
        L2a:
            return r2
        L2b:
            java.lang.String r2 = "尚未加载"
            return r2
    }

    public final android.widget.LinearLayout a(java.lang.String r9, a.InterfaceC0369s7 r10) {
            r8 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r8.f669a
            r0.<init>(r1)
            r2 = 0
            r0.setOrientation(r2)
            r3 = 16
            r0.setGravity(r3)
            r3 = 14
            int r4 = r8.b(r3)
            int r5 = r8.b(r3)
            int r6 = r8.b(r3)
            int r3 = r8.b(r3)
            r0.setPadding(r4, r5, r6, r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            a.ra$a r4 = r8.b
            int r5 = r4.b
            r3.setColor(r5)
            r5 = 12
            int r5 = r8.b(r5)
            float r5 = (float) r5
            r3.setCornerRadius(r5)
            r0.setBackground(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r6 = -2
            r3.<init>(r5, r6)
            r5 = 3
            int r7 = r8.b(r5)
            int r5 = r8.b(r5)
            r3.setMargins(r2, r7, r2, r5)
            r0.setLayoutParams(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r1)
            r3.setText(r9)
            r9 = 2
            r5 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r9, r5)
            int r5 = r4.d
            r3.setTextColor(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r2, r6, r7)
            r3.setLayoutParams(r5)
            r0.addView(r3)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            java.lang.String r1 = ">"
            r2.setText(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r2.setTextSize(r9, r1)
            int r9 = r4.f
            r2.setTextColor(r9)
            r0.addView(r2)
            a.h3 r9 = new a.h3
            r1 = 3
            r9.<init>(r1, r10)
            r0.setOnClickListener(r9)
            return r0
    }

    public final int b(int r3) {
            r2 = this;
            float r3 = (float) r3
            android.app.Activity r0 = r2.f669a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1
            float r3 = android.util.TypedValue.applyDimension(r1, r3, r0)
            int r3 = (int) r3
            return r3
    }

    public final android.widget.LinearLayout d(java.lang.String r17, java.lang.String r18, int r19, a.D7 r20) {
            r16 = this;
            r4 = r16
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.app.Activity r0 = r4.f669a
            r6.<init>(r0)
            r1 = 1
            r6.setOrientation(r1)
            r2 = 14
            int r3 = r4.b(r2)
            r5 = 10
            int r7 = r4.b(r5)
            int r2 = r4.b(r2)
            int r8 = r4.b(r5)
            r6.setPadding(r3, r7, r2, r8)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            a.ra$a r3 = r4.b
            int r7 = r3.b
            r2.setColor(r7)
            r7 = 12
            int r8 = r4.b(r7)
            float r8 = (float) r8
            r2.setCornerRadius(r8)
            r6.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r2.<init>(r8, r9)
            r8 = 3
            int r10 = r4.b(r8)
            int r8 = r4.b(r8)
            r11 = 0
            r2.setMargins(r11, r10, r11, r8)
            r6.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r2.setOrientation(r11)
            r8 = 16
            r2.setGravity(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r0)
            r10 = r17
            r8.setText(r10)
            r10 = 2
            r12 = 1096810496(0x41600000, float:14.0)
            r8.setTextSize(r10, r12)
            int r13 = r3.d
            r8.setTextColor(r13)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r15 = 1065353216(0x3f800000, float:1.0)
            r14.<init>(r11, r9, r15)
            r8.setLayoutParams(r14)
            r2.addView(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r0)
            java.lang.String r9 = "保存"
            r8.setText(r9)
            r9 = 1093664768(0x41300000, float:11.0)
            r8.setTextSize(r10, r9)
            int r9 = r3.b
            r8.setTextColor(r9)
            r9 = 17
            r8.setGravity(r9)
            int r9 = r4.b(r5)
            r11 = 4
            int r14 = r4.b(r11)
            int r5 = r4.b(r5)
            int r11 = r4.b(r11)
            r8.setPadding(r9, r14, r5, r11)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            int r9 = r3.g
            r5.setColor(r9)
            r9 = 6
            int r9 = r4.b(r9)
            float r9 = (float) r9
            r5.setCornerRadius(r9)
            r8.setBackground(r5)
            r2.addView(r8)
            r6.addView(r2)
            android.widget.EditText r2 = new android.widget.EditText
            r2.<init>(r0)
            r0 = r18
            r2.setText(r0)
            r2.setTextSize(r10, r12)
            r2.setTextColor(r13)
            int r0 = r3.f
            r2.setHintTextColor(r0)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r3 = r3.f670a
            r0.setColor(r3)
            r3 = 8
            int r5 = r4.b(r3)
            float r5 = (float) r5
            r0.setCornerRadius(r5)
            r2.setBackground(r0)
            int r0 = r4.b(r7)
            int r5 = r4.b(r3)
            int r7 = r4.b(r7)
            int r3 = r4.b(r3)
            r2.setPadding(r0, r5, r7, r3)
            r2.setSingleLine(r1)
            r0 = r19
            r2.setInputType(r0)
            r2.setFocusable(r1)
            r2.setFocusableInTouchMode(r1)
            a.na r0 = new a.na
            r0.<init>()
            r2.setOnTouchListener(r0)
            r6.addView(r2)
            a.oa r0 = new a.oa
            r5 = 0
            r1 = r20
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r3.setOnClickListener(r0)
            return r6
    }

    public final void e() {
            r7 = this;
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.LinkedHashSet r0 = a.K3.a.c()
            java.util.ArrayList r0 = a.C0383t3.y0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.toString()
            r1.add(r3)
            goto L1c
        L30:
            r2 = 0
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            a.Sc r2 = new a.Sc
            r2.<init>()
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            android.app.Activity r4 = r7.f669a
            r3.<init>(r4)
            int r4 = r0.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "已隐藏的朋友圈（共 "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = " 条）"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.app.AlertDialog$Builder r3 = r3.setTitle(r4)
            int r4 = r1.length
            if (r4 != 0) goto L69
            java.lang.String r0 = "暂无已隐藏的朋友圈"
            r3.setMessage(r0)
            goto L7d
        L69:
            a.qa r4 = new a.qa
            r5 = 0
            r4.<init>(r5, r7, r2, r0)
            r3.setItems(r1, r4)
            a.qa r1 = new a.qa
            r4 = 1
            r1.<init>(r4, r7, r2, r0)
            java.lang.String r0 = "清空"
            r3.setPositiveButton(r0, r1)
        L7d:
            a.pa r0 = new a.pa
            r1 = 2
            r0.<init>(r7, r1)
            java.lang.String r1 = "添加"
            android.app.AlertDialog$Builder r0 = r3.setNeutralButton(r1, r0)
            java.lang.String r1 = "关闭"
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            android.app.AlertDialog r0 = r0.create()
            if (r0 == 0) goto L9d
            r0.show()
            r7.o(r0)
            r3 = r0
        L9d:
            r2.f263a = r3
            return
    }

    public final void f() {
            r21 = this;
            r1 = r21
            r2 = 2
            r3 = 1
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            android.widget.ScrollView r4 = new android.widget.ScrollView
            android.app.Activity r5 = r1.f669a
            r4.<init>(r5)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            a.ra$a r7 = r1.b
            int r8 = r7.f670a
            r6.setColor(r8)
            r8 = 16
            int r9 = r1.b(r8)
            float r9 = (float) r9
            r6.setCornerRadius(r9)
            r4.setBackground(r6)
            r6 = 12
            int r9 = r1.b(r6)
            r10 = 0
            r4.setPadding(r10, r10, r10, r9)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r5)
            r9.setOrientation(r3)
            int r11 = r1.b(r8)
            r12 = 20
            int r12 = r1.b(r12)
            int r8 = r1.b(r8)
            r13 = 36
            int r13 = r1.b(r13)
            r9.setPadding(r11, r12, r8, r13)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r5)
            int r11 = r0.size()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "配置名单（"
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = " 个）"
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            r8.setText(r12)
            r12 = 1095761920(0x41500000, float:13.0)
            r8.setTextSize(r2, r12)
            android.graphics.Typeface r12 = android.graphics.Typeface.DEFAULT_BOLD
            r8.setTypeface(r12)
            int r12 = r7.e
            r8.setTextColor(r12)
            r13 = 4
            int r14 = r1.b(r13)
            r15 = 8
            int r3 = r1.b(r15)
            int r10 = r1.b(r13)
            int r13 = r1.b(r15)
            r8.setPadding(r14, r3, r10, r13)
            r9.addView(r8)
            boolean r3 = r0.isEmpty()
            r8 = 1096810496(0x41600000, float:14.0)
            r10 = 17
            if (r3 == 0) goto Lc9
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r5)
            java.lang.String r13 = "暂无伪装"
            r3.setText(r13)
            r3.setTextSize(r2, r8)
            r3.setTextColor(r12)
            r3.setGravity(r10)
            int r13 = r1.b(r6)
            int r14 = r1.b(r15)
            r8 = 0
            r3.setPadding(r8, r13, r8, r14)
            r9.addView(r3)
        Lc9:
            r4.addView(r9)
            a.Sc r3 = new a.Sc
            r3.<init>()
            a.n5 r8 = new a.n5
            r13 = 1
            r8.<init>(r3, r13, r1)
            boolean r13 = r0.isEmpty()
            if (r13 != 0) goto L491
            java.util.Iterator r13 = r0.iterator()
        Le1:
            boolean r0 = r13.hasNext()
            int r14 = r7.h
            r10 = 14
            if (r0 == 0) goto L417
            java.lang.Object r0 = r13.next()
            r15 = r0
            top.mmjz.floatingclouds.bean.MaskItemBean r15 = (top.mmjz.floatingclouds.bean.MaskItemBean) r15
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r5)
            r6 = 1
            r2.setOrientation(r6)
            int r0 = r1.b(r10)
            r16 = r13
            r6 = 12
            int r13 = r1.b(r6)
            int r10 = r1.b(r10)
            r17 = r3
            int r3 = r1.b(r6)
            r2.setPadding(r0, r13, r10, r3)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r3 = r7.b
            r0.setColor(r3)
            int r3 = r1.b(r6)
            float r3 = (float) r3
            r0.setCornerRadius(r3)
            r2.setBackground(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r6 = -2
            r0.<init>(r3, r6)
            r3 = 2
            int r6 = r1.b(r3)
            int r10 = r1.b(r3)
            r3 = 0
            r0.setMargins(r3, r6, r3, r10)
            r2.setLayoutParams(r0)
            java.lang.String r6 = r15.getMaskId()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r0 = a.xh.f764a
            if (r6 == 0) goto L19c
            boolean r0 = a.Be.P(r6)
            if (r0 == 0) goto L14f
        L14e:
            goto L19c
        L14f:
            java.lang.String r0 = "gh_"
            boolean r0 = a.Ae.H(r6, r0, r3)
            if (r0 != 0) goto L19c
            java.lang.String r0 = "@"
            boolean r0 = a.Be.I(r6, r0, r3)
            if (r0 == 0) goto L160
            goto L14e
        L160:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = a.xh.b
            java.lang.Object r3 = r0.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L172
            r18 = r4
            r20 = r9
            r19 = r11
            goto L2f9
        L172:
            boolean r3 = r0.isEmpty()
            java.lang.String r10 = "FCloud_DB"
            if (r3 != 0) goto L1a5
            int r0 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r13 = "cache miss for "
            r3.<init>(r13)
            r3.append(r6)
            java.lang.String r6 = " (cache="
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = " entries, no fallback)"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r10, r0)
        L19c:
            r18 = r4
            r20 = r9
            r19 = r11
            r3 = 0
            goto L2f9
        L1a5:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r0 = a.xh.f764a
            java.util.Set r0 = r0.entrySet()
            java.lang.String r3 = "<get-entries>(...)"
            a.C0193i9.d(r0, r3)
            java.util.Iterator r0 = r0.iterator()
        L1b4:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1df
            java.lang.Object r3 = r0.next()
            r13 = r3
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getKey()
            r18 = r0
            java.lang.String r0 = "<get-key>(...)"
            a.C0193i9.d(r13, r0)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.String r0 = "EnMicroMsg"
            r19 = r3
            r3 = 0
            boolean r0 = a.Be.I(r13, r0, r3)
            if (r0 == 0) goto L1dc
            r3 = r19
            goto L1e0
        L1dc:
            r0 = r18
            goto L1b4
        L1df:
            r3 = 0
        L1e0:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 != 0) goto L203
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r0 = a.xh.f764a
            int r0 = r0.size()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r18 = r3
            java.lang.String r3 = "no EnMicroMsg in Store (Store size="
            r13.<init>(r3)
            r13.append(r0)
            java.lang.String r0 = ")"
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            android.util.Log.e(r10, r0)
            goto L205
        L203:
            r18 = r3
        L205:
            if (r18 == 0) goto L212
            java.lang.Object r0 = r18.getValue()
            a.G4 r0 = (a.G4) r0
            if (r0 == 0) goto L212
            java.lang.Object r0 = r0.f96a
            goto L213
        L212:
            r0 = 0
        L213:
            java.lang.String r3 = "no row for "
            java.lang.String r13 = "row found but blank for "
            r18 = r4
            java.lang.String r4 = "cursor null for "
            if (r0 != 0) goto L22d
            java.lang.String r0 = "db null for "
            java.lang.String r0 = r0.concat(r6)
            android.util.Log.e(r10, r0)
            r20 = r9
            r19 = r11
        L22a:
            r3 = 0
            goto L2da
        L22d:
            r19 = r11
            java.lang.String r11 = "select nickname, alias, conRemark from rcontact where username=?"
            r20 = r9
            java.lang.String[] r9 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L24d
            android.database.Cursor r9 = a.xh.a.a(r0, r11, r9)     // Catch: java.lang.Throwable -> L24d
            if (r9 != 0) goto L250
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L24d
            r0.append(r6)     // Catch: java.lang.Throwable -> L24d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L24d
            android.util.Log.e(r10, r0)     // Catch: java.lang.Throwable -> L24d
            goto L22a
        L24d:
            r0 = move-exception
            goto L2bb
        L250:
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L269
            if (r0 == 0) goto L29d
            r4 = 2
            java.lang.String r0 = r9.getString(r4)     // Catch: java.lang.Throwable -> L269
            if (r0 == 0) goto L267
            boolean r3 = a.Be.P(r0)     // Catch: java.lang.Throwable -> L269
            if (r3 != 0) goto L264
            goto L265
        L264:
            r0 = 0
        L265:
            if (r0 != 0) goto L28b
        L267:
            r3 = 0
            goto L26c
        L269:
            r0 = move-exception
            r3 = r0
            goto L2b2
        L26c:
            java.lang.String r0 = r9.getString(r3)     // Catch: java.lang.Throwable -> L269
            if (r0 == 0) goto L279
            boolean r3 = a.Be.P(r0)     // Catch: java.lang.Throwable -> L269
            if (r3 != 0) goto L279
            goto L27a
        L279:
            r0 = 0
        L27a:
            if (r0 != 0) goto L28b
            r3 = 1
            java.lang.String r0 = r9.getString(r3)     // Catch: java.lang.Throwable -> L269
            if (r0 == 0) goto L28a
            boolean r3 = a.Be.P(r0)     // Catch: java.lang.Throwable -> L269
            if (r3 != 0) goto L28a
            goto L28b
        L28a:
            r0 = 0
        L28b:
            if (r0 != 0) goto L2ad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L269
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L269
            r3.append(r6)     // Catch: java.lang.Throwable -> L269
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L269
            android.util.Log.e(r10, r3)     // Catch: java.lang.Throwable -> L269
            goto L2ad
        L29d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L269
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L269
            r0.append(r6)     // Catch: java.lang.Throwable -> L269
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L269
            android.util.Log.e(r10, r0)     // Catch: java.lang.Throwable -> L269
            r0 = 0
        L2ad:
            r9.close()     // Catch: java.lang.Throwable -> L24d
            r3 = r0
            goto L2da
        L2b2:
            throw r3     // Catch: java.lang.Throwable -> L2b3
        L2b3:
            r0 = move-exception
            a.C0435w1.e(r9, r3)     // Catch: java.lang.Throwable -> L24d
            throw r0     // Catch: java.lang.Throwable -> L24d
        L2b8:
            r0 = move-exception
            r20 = r9
        L2bb:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "query failed for "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r10, r0)
            goto L22a
        L2da:
            if (r3 != 0) goto L2df
            java.lang.String r0 = "null"
            goto L2e0
        L2df:
            r0 = r3
        L2e0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "single query for "
            r4.<init>(r9)
            r4.append(r6)
            java.lang.String r6 = " -> "
            r4.append(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r10, r0)
        L2f9:
            if (r3 == 0) goto L323
            java.lang.String r0 = r15.getTagName()
            int r0 = r0.length()
            if (r0 <= 0) goto L332
            java.lang.String r0 = r15.getTagName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "（"
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = "）"
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            goto L332
        L323:
            java.lang.String r0 = r15.getTagName()
            int r3 = r0.length()
            if (r3 != 0) goto L331
            java.lang.String r0 = r15.getMaskId()
        L331:
            r3 = r0
        L332:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            r0.setText(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            r4 = 2
            r0.setTextSize(r4, r3)
            int r3 = r7.d
            r0.setTextColor(r3)
            r2.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            java.lang.String r3 = r15.getMaskId()
            int r4 = r3.length()
            r6 = 10
            if (r4 > r6) goto L35d
            r4 = 8
            r11 = 4
            goto L37c
        L35d:
            r4 = 8
            java.lang.String r9 = a.Ce.X(r3, r4)
            r11 = 4
            java.lang.String r3 = a.Ce.Y(r3, r11)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "…"
            r10.append(r9)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
        L37c:
            java.lang.String r9 = r15.getMapId()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r13 = "伪装ID: "
            r10.<init>(r13)
            r10.append(r3)
            java.lang.String r3 = "\n映射ID: "
            r10.append(r3)
            r10.append(r9)
            java.lang.String r3 = r10.toString()
            r0.setText(r3)
            r3 = 1093664768(0x41300000, float:11.0)
            r9 = 2
            r0.setTextSize(r9, r3)
            r0.setTextColor(r12)
            int r3 = r1.b(r9)
            r10 = 6
            int r13 = r1.b(r10)
            r4 = 0
            r0.setPadding(r4, r3, r4, r13)
            r2.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            java.lang.String r3 = "移除伪装"
            r0.setText(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r9, r3)
            r0.setTextColor(r14)
            r3 = 17
            r0.setGravity(r3)
            int r3 = r1.b(r6)
            r4 = 5
            int r9 = r1.b(r4)
            int r6 = r1.b(r6)
            int r4 = r1.b(r4)
            r0.setPadding(r3, r9, r6, r4)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r6 = 1
            r3.setStroke(r6, r14)
            int r4 = r1.b(r10)
            float r4 = (float) r4
            r3.setCornerRadius(r4)
            r4 = 0
            r3.setColor(r4)
            r0.setBackground(r3)
            a.Y9 r3 = new a.Y9
            r3.<init>(r15, r6, r8)
            r0.setOnClickListener(r3)
            r2.addView(r0)
            r3 = r20
            r3.addView(r2)
            r9 = r3
            r13 = r16
            r3 = r17
            r4 = r18
            r11 = r19
            r2 = 2
            r6 = 12
            r10 = 17
            r15 = 8
            goto Le1
        L417:
            r17 = r3
            r18 = r4
            r3 = r9
            r19 = r11
            int r0 = r1.b(r6)
            android.view.View r0 = r1.n(r0)
            r3.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r5)
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            int r2 = r2.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "一键清空全部伪装（"
            r4.<init>(r6)
            r4.append(r2)
            r2 = r19
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.setText(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r4 = 2
            r0.setTextSize(r4, r2)
            r0.setTextColor(r14)
            r2 = 17
            r0.setGravity(r2)
            int r2 = r1.b(r10)
            int r4 = r1.b(r10)
            r6 = 0
            r0.setPadding(r6, r2, r6, r4)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r13 = 1
            r2.setStroke(r13, r14)
            r4 = 12
            int r4 = r1.b(r4)
            float r4 = (float) r4
            r2.setCornerRadius(r4)
            r2.setColor(r6)
            r0.setBackground(r2)
            a.Y9 r2 = new a.Y9
            r4 = 2
            r2.<init>(r1, r4, r8)
            r0.setOnClickListener(r2)
            r3.addView(r0)
            goto L495
        L491:
            r17 = r3
            r18 = r4
        L495:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r5)
            r2 = r18
            android.app.AlertDialog$Builder r0 = r0.setView(r2)
            android.app.AlertDialog r0 = r0.create()
            if (r0 == 0) goto L4f8
            android.view.Window r2 = r0.getWindow()
            if (r2 == 0) goto L4b6
            r3 = 17170445(0x106000d, float:2.461195E-38)
            r2.setBackgroundDrawableResource(r3)
            r3 = 3
            r2.setSoftInputMode(r3)
        L4b6:
            r6 = 1
            r0.setCanceledOnTouchOutside(r6)
            r0.show()
            android.view.Window r2 = r0.getWindow()
            if (r2 == 0) goto L4f4
            android.content.res.Resources r3 = r5.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            android.view.WindowManager$LayoutParams r4 = r2.getAttributes()
            int r5 = r3.widthPixels
            double r5 = (double) r5
            r7 = 4606641986844732948(0x3fee147ae147ae14, double:0.94)
            double r5 = r5 * r7
            int r5 = (int) r5
            r4.width = r5
            int r3 = r3.heightPixels
            double r5 = (double) r3
            r7 = 4605561122934164029(0x3fea3d70a3d70a3d, double:0.82)
            double r5 = r5 * r7
            int r3 = (int) r5
            r4.height = r3
            r3 = 17
            r4.gravity = r3
            int r3 = r4.flags
            r3 = r3 | 32
            r4.flags = r3
            r2.setAttributes(r4)
        L4f4:
            r14 = r0
        L4f5:
            r2 = r17
            goto L4fa
        L4f8:
            r14 = 0
            goto L4f5
        L4fa:
            r2.f263a = r14
            return
    }

    public final void g() {
            r16 = this;
            r0 = r16
            android.widget.LinearLayout r1 = r0.e
            if (r1 != 0) goto L8
            goto L19b
        L8:
            r1.removeAllViews()
            r2 = -1
            r0.g = r2
            r3 = 0
            r0.h = r3
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            a.K3.a.i()
            android.widget.TextView r3 = new android.widget.TextView
            android.app.Activity r4 = r0.f669a
            r3.<init>(r4)
            java.lang.String r5 = "@mmjz"
            r3.setText(r5)
            r5 = 2
            r6 = 1099956224(0x41900000, float:18.0)
            r3.setTextSize(r5, r6)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r6)
            a.ra$a r6 = r0.b
            int r7 = r6.g
            r3.setTextColor(r7)
            r7 = 17
            r3.setGravity(r7)
            r8 = 4
            int r9 = r0.b(r8)
            int r10 = r0.b(r8)
            r11 = 0
            r3.setPadding(r11, r9, r11, r10)
            r1.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r4)
            java.lang.String r9 = "https://t.me/tkwx123"
            r3.setText(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r5, r9)
            int r10 = r6.g
            r3.setTextColor(r10)
            r3.setGravity(r7)
            r7 = 12
            int r7 = r0.b(r7)
            r3.setPadding(r11, r11, r11, r7)
            a.ga r7 = new a.ga
            r10 = 0
            r7.<init>(r0, r10)
            r3.setOnClickListener(r7)
            r1.addView(r3)
            r3 = 1
            int r7 = r0.b(r3)
            android.view.View r10 = new android.view.View
            r10.<init>(r4)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r2, r7)
            r10.setLayoutParams(r12)
            int r7 = r6.c
            r10.setBackgroundColor(r7)
            r1.addView(r10)
            r7 = 10
            int r7 = r0.b(r7)
            android.view.View r7 = r0.n(r7)
            r1.addView(r7)
            a.Me r7 = r0.k
            java.lang.Object r7 = r7.a()
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r10 = r11
        Lac:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L19b
            int r12 = r10 + 1
            java.lang.Object r13 = r7.next()
            a.ra$b r13 = (a.C0354ra.b) r13
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r4)
            r14.setOrientation(r11)
            r15 = 16
            r14.setGravity(r15)
            r15 = 14
            int r9 = r0.b(r15)
            r5 = 13
            int r11 = r0.b(r5)
            int r8 = r0.b(r15)
            int r5 = r0.b(r5)
            r14.setPadding(r9, r11, r8, r5)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            int r8 = r6.b
            r5.setColor(r8)
            int r8 = r0.b(r15)
            float r8 = (float) r8
            r5.setCornerRadius(r8)
            boolean r8 = r0.c
            if (r8 == 0) goto Lff
            r8 = 33
            r9 = 255(0xff, float:3.57E-43)
            int r8 = android.graphics.Color.argb(r8, r9, r9, r9)
            r5.setStroke(r3, r8)
        Lff:
            r14.setBackground(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r5.<init>(r2, r8)
            r9 = 4
            int r11 = r0.b(r9)
            int r15 = r0.b(r9)
            r2 = 0
            r5.setMargins(r2, r11, r2, r15)
            r14.setLayoutParams(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r4)
            r5.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r15 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r2, r8, r15)
            r5.setLayoutParams(r11)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            java.lang.String r8 = r13.f671a
            r2.setText(r8)
            r8 = 1097859072(0x41700000, float:15.0)
            r11 = 2
            r2.setTextSize(r11, r8)
            android.graphics.Typeface r8 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r8 = android.graphics.Typeface.create(r8, r3)
            r2.setTypeface(r8)
            int r8 = r6.d
            r2.setTextColor(r8)
            r5.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            java.lang.String r8 = r13.b
            r2.setText(r8)
            r8 = 1094713344(0x41400000, float:12.0)
            r11 = 2
            r2.setTextSize(r11, r8)
            int r11 = r6.e
            r2.setTextColor(r11)
            r11 = 3
            int r11 = r0.b(r11)
            r13 = 0
            r2.setPadding(r13, r11, r13, r13)
            r5.addView(r2)
            r14.addView(r5)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            java.lang.String r5 = ">"
            r2.setText(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            r11 = 2
            r2.setTextSize(r11, r5)
            int r5 = r6.f
            r2.setTextColor(r5)
            r14.addView(r2)
            a.la r2 = new a.la
            r2.<init>(r0, r10)
            r14.setOnClickListener(r2)
            r1.addView(r14)
            r2 = r9
            r9 = r8
            r8 = r2
            r5 = r11
            r10 = r12
            r11 = r13
            r2 = -1
            goto Lac
        L19b:
            return
    }

    public final void h() {
            r10 = this;
            r0 = 1
            android.app.Activity r1 = r10.f669a
            java.lang.String r2 = "正在重启微信…"
            r3 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r3)
            r2.show()
            android.app.AlertDialog r2 = r10.d
            if (r2 == 0) goto L14
            r2.dismiss()
        L14:
            android.content.Context r2 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L6c
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L6c
            r4.<init>()     // Catch: java.lang.Exception -> L6c
            java.lang.String r5 = "com.tencent.mm"
            java.lang.String r6 = "com.tencent.mm.ui.LauncherUI"
            r4.setClassName(r5, r6)     // Catch: java.lang.Exception -> L6c
            r5 = 335544320(0x14000000, float:6.4623485E-27)
            r4.addFlags(r5)     // Catch: java.lang.Exception -> L6c
            r5 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "alarm"
            java.lang.Object r5 = r2.getSystemService(r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = "null cannot be cast to non-null type android.app.AlarmManager"
            a.C0193i9.c(r5, r6)     // Catch: java.lang.Throwable -> L4a
            android.app.AlarmManager r5 = (android.app.AlarmManager) r5     // Catch: java.lang.Throwable -> L4a
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L4a
            r8 = 1500(0x5dc, double:7.41E-321)
            long r6 = r6 + r8
            r8 = 2
            r5.set(r8, r6, r3)     // Catch: java.lang.Throwable -> L4a
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r3 = move-exception
            a.C0465xd.a(r3)     // Catch: java.lang.Exception -> L6c
        L4e:
            r2.startActivity(r4)     // Catch: java.lang.Throwable -> L54
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r2 = move-exception
            a.C0465xd.a(r2)     // Catch: java.lang.Exception -> L6c
        L58:
            android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Exception -> L6c
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L6c
            r2.<init>(r3)     // Catch: java.lang.Exception -> L6c
            a.l0 r3 = new a.l0     // Catch: java.lang.Exception -> L6c
            r3.<init>(r0)     // Catch: java.lang.Exception -> L6c
            r4 = 800(0x320, double:3.953E-321)
            r2.postDelayed(r3, r4)     // Catch: java.lang.Exception -> L6c
            goto L86
        L6c:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "重启失败: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r0)
            r0.show()
        L86:
            return
    }

    public final android.widget.LinearLayout j(java.lang.String r17, java.lang.String r18, int r19, a.D7 r20, a.A3 r21) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r21
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.app.Activity r4 = r0.f669a
            r3.<init>(r4)
            r5 = 1
            r3.setOrientation(r5)
            r5 = 14
            int r6 = r0.b(r5)
            r7 = 10
            int r7 = r0.b(r7)
            int r5 = r0.b(r5)
            r8 = 12
            int r9 = r0.b(r8)
            r3.setPadding(r6, r7, r5, r9)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            a.ra$a r6 = r0.b
            int r7 = r6.b
            r5.setColor(r7)
            int r7 = r0.b(r8)
            float r7 = (float) r7
            r5.setCornerRadius(r7)
            r3.setBackground(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r9 = -2
            r5.<init>(r7, r9)
            r7 = 3
            int r10 = r0.b(r7)
            int r7 = r0.b(r7)
            r11 = 0
            r5.setMargins(r11, r10, r11, r7)
            r3.setLayoutParams(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r4)
            r5.setOrientation(r11)
            r7 = 16
            r5.setGravity(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r4)
            r10 = r17
            r7.setText(r10)
            r10 = 2
            r12 = 1096810496(0x41600000, float:14.0)
            r7.setTextSize(r10, r12)
            int r12 = r6.d
            r7.setTextColor(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r11, r9, r13)
            r7.setLayoutParams(r12)
            r5.addView(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r12 = "%"
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            r7.setText(r9)
            r9 = 1095761920(0x41500000, float:13.0)
            r7.setTextSize(r10, r9)
            int r9 = r6.g
            r7.setTextColor(r9)
            r5.addView(r7)
            r12 = 6
            if (r2 == 0) goto Lfc
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r4)
            java.lang.String r14 = "测试"
            r13.setText(r14)
            r14 = 1094713344(0x41400000, float:12.0)
            r13.setTextSize(r10, r14)
            int r14 = r6.b
            r13.setTextColor(r14)
            r14 = 17
            r13.setGravity(r14)
            int r14 = r0.b(r8)
            r15 = 5
            int r11 = r0.b(r15)
            int r8 = r0.b(r8)
            int r15 = r0.b(r15)
            r13.setPadding(r14, r11, r8, r15)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            r8.setColor(r9)
            int r9 = r0.b(r12)
            float r9 = (float) r9
            r8.setCornerRadius(r9)
            r13.setBackground(r8)
            a.h3 r8 = new a.h3
            r9 = 5
            r8.<init>(r9, r2)
            r13.setOnClickListener(r8)
            r5.addView(r13)
        Lfc:
            r3.addView(r5)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            r5 = r18
            r2.setText(r5)
            r5 = 1093664768(0x41300000, float:11.0)
            r2.setTextSize(r10, r5)
            int r5 = r6.e
            r2.setTextColor(r5)
            r5 = 4
            int r5 = r0.b(r5)
            int r6 = r0.b(r12)
            r8 = 0
            r2.setPadding(r8, r5, r8, r6)
            r3.addView(r2)
            android.widget.SeekBar r2 = new android.widget.SeekBar
            r2.<init>(r4)
            r4 = 100
            r2.setMax(r4)
            int r1 = a.Oc.C(r1, r8, r4)
            r2.setProgress(r1)
            a.sa r1 = new a.sa
            r4 = r20
            r1.<init>(r7, r4)
            r2.setOnSeekBarChangeListener(r1)
            r3.addView(r2)
            return r3
    }

    public final void l() {
            r13 = this;
            a.j2 r0 = r13.j
            if (r0 == 0) goto L9
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r1 = a.C0086ca.f421a
            r1.remove(r0)
        L9:
            r0 = 0
            r13.j = r0
            android.app.Activity r1 = r13.f669a
            android.content.res.Resources r2 = r1.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r3 = r2.widthPixels
            double r3 = (double) r3
            r5 = 4606641986844732948(0x3fee147ae147ae14, double:0.94)
            double r3 = r3 * r5
            int r3 = (int) r3
            int r2 = r2.heightPixels
            double r4 = (double) r2
            r6 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r4 = r4 * r6
            int r2 = (int) r4
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r1)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            a.ra$a r6 = r13.b
            int r6 = r6.f670a
            r5.setColor(r6)
            r6 = 16
            int r7 = r13.b(r6)
            float r7 = (float) r7
            r5.setCornerRadius(r7)
            boolean r7 = r13.c
            r8 = 1
            if (r7 == 0) goto L55
            r9 = 41
            r10 = 255(0xff, float:3.57E-43)
            int r9 = android.graphics.Color.argb(r9, r10, r10, r10)
            r5.setStroke(r8, r9)
        L55:
            r4.setBackground(r5)
            if (r7 == 0) goto L5d
            r5 = 1103101952(0x41c00000, float:24.0)
            goto L5f
        L5d:
            r5 = 1094713344(0x41400000, float:12.0)
        L5f:
            r4.setElevation(r5)
            android.widget.ScrollView r5 = new android.widget.ScrollView
            r5.<init>(r1)
            r9 = 12
            int r9 = r13.b(r9)
            r10 = 0
            r5.setPadding(r10, r10, r10, r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r5.setLayoutParams(r9)
            r13.f = r5
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r1)
            r5.setOrientation(r8)
            int r9 = r13.b(r6)
            int r10 = r13.b(r6)
            int r11 = r13.b(r6)
            r12 = 24
            int r12 = r13.b(r12)
            r5.setPadding(r9, r10, r11, r12)
            r13.e = r5
            android.widget.ScrollView r5 = r13.f
            a.C0193i9.b(r5)
            android.widget.LinearLayout r9 = r13.e
            r5.addView(r9)
            android.widget.ScrollView r5 = r13.f
            r4.addView(r5)
            r13.g()
            android.app.AlertDialog$Builder r5 = new android.app.AlertDialog$Builder
            r5.<init>(r1)
            android.app.AlertDialog$Builder r1 = r5.setView(r4)
            android.app.AlertDialog r1 = r1.create()
            if (r1 == 0) goto L12f
            android.view.Window r0 = r1.getWindow()
            if (r0 == 0) goto Ld8
            r4 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r4)
            r0.setSoftInputMode(r6)
            if (r7 == 0) goto Ld4
            r4 = 1058642330(0x3f19999a, float:0.6)
        Ld0:
            r0.setDimAmount(r4)
            goto Ld8
        Ld4:
            r4 = 1055286886(0x3ee66666, float:0.45)
            goto Ld0
        Ld8:
            r1.setCanceledOnTouchOutside(r8)
            a.ia r0 = new a.ia
            r0.<init>(r13)
            r1.setOnKeyListener(r0)
            r1.show()
            a.ja r0 = new a.ja
            r0.<init>(r13)
            r1.setOnDismissListener(r0)
            a.j2 r0 = r13.j
            if (r0 == 0) goto Lf3
            goto Lfe
        Lf3:
            a.j2 r0 = new a.j2
            r4 = 4
            r0.<init>(r4, r13)
            r13.j = r0
            a.C0086ca.b(r0)
        Lfe:
            android.view.Window r0 = r1.getWindow()
            if (r0 == 0) goto L12e
            android.view.WindowManager$LayoutParams r4 = r0.getAttributes()
            r4.width = r3
            r4.height = r2
            r2 = 17
            r4.gravity = r2
            int r2 = r4.flags
            r2 = r2 | 32
            r3 = -131081(0xfffffffffffdfff7, float:NaN)
            r2 = r2 & r3
            r4.flags = r2
            r0.setAttributes(r4)
            r0.setSoftInputMode(r6)
            android.view.View r2 = r0.getDecorView()
            r2.setFocusable(r8)
            android.view.View r0 = r0.getDecorView()
            r0.setFocusableInTouchMode(r8)
        L12e:
            r0 = r1
        L12f:
            r13.d = r0
            return
    }

    public final void m() {
            r35 = this;
            r1 = r35
            java.lang.String r3 = "<this>"
            r7 = 10
            r9 = 0
            r10 = 1
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r11 = r0.M
            java.lang.ClassLoader r12 = a.C0435w1.g
            if (r12 == 0) goto L2e
            a.hg r0 = a.C0182hg.f502a     // Catch: java.lang.Throwable -> L21
            r0.getClass()     // Catch: java.lang.Throwable -> L21
            a.ig r0 = a.C0182hg.c(r12)     // Catch: java.lang.Throwable -> L21
            goto L26
        L21:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L26:
            boolean r13 = r0 instanceof a.C0447wd.a
            if (r13 == 0) goto L2b
            r0 = 0
        L2b:
            a.ig r0 = (a.C0199ig) r0
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L44
            java.lang.String r13 = r0.b
            int r13 = r13.length()
            if (r13 <= 0) goto L44
            a.K3$a r13 = a.K3.f148a
            r13.getClass()
            a.K3.a.p(r0)
            a.K3.a.q(r0)
        L44:
            if (r0 == 0) goto L52
            java.lang.String r13 = r0.b
            int r13 = r13.length()
            if (r13 <= 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 != 0) goto L5b
        L52:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.ig r0 = a.K3.a.e()
        L5b:
            a.K3$a r13 = a.K3.f148a
            r13.getClass()
            a.ig r13 = a.K3.a.d()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "━━━ 热更新屏蔽状态 ━━━\n"
            r14.<init>(r15)
            if (r11 == 0) goto L73
            java.lang.String r11 = "✅ 热更新已被屏蔽\n"
            r14.append(r11)
            goto L78
        L73:
            java.lang.String r11 = "⚠️ 热更新屏蔽已关闭\n"
            r14.append(r11)
        L78:
            a.if r11 = a.Cif.f512a
            r11.getClass()
            java.lang.String r11 = a.Cif.b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r16 = 0
            java.lang.String r4 = "符号定位："
            r15.<init>(r4)
            r15.append(r11)
            java.lang.String r4 = r15.toString()
            r14.append(r4)
            r14.append(r7)
            java.util.List<java.lang.String> r4 = a.gh.b
            boolean r4 = r4.isEmpty()
            java.lang.String r5 = ")"
            if (r4 != 0) goto Lac
            java.util.List<java.lang.String> r4 = a.gh.b
            int r4 = r4.size()
            java.lang.String r11 = "已就绪("
            java.lang.String r4 = a.C0487z.c(r4, r11, r5)
            goto Lae
        Lac:
            java.lang.String r4 = "未就绪"
        Lae:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r15 = "路径段："
            r11.<init>(r15)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r14.append(r4)
            java.lang.String r4 = "\n\n"
            r14.append(r4)
            a.Y5 r4 = a.Y5.f351a
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> Ldf
            java.io.File r15 = a.gh.b()     // Catch: java.lang.Throwable -> Ldf
            r18 = 0
            java.lang.String r8 = "hotupdate_intercept_events.log"
            r11.<init>(r15, r8)     // Catch: java.lang.Throwable -> Le1
            boolean r8 = r11.isFile()     // Catch: java.lang.Throwable -> Le1
            if (r8 != 0) goto Lda
            goto Le1
        Lda:
            java.util.ArrayList r4 = a.C0435w1.R(r11)     // Catch: java.lang.Throwable -> Le1
            goto Le1
        Ldf:
            r18 = 0
        Le1:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lea:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L288
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r19 = "|"
            java.lang.String[] r19 = new java.lang.String[]{r19}
            a.C0193i9.e(r11, r3)
            r2 = r19[r9]
            int r20 = r2.length()
            if (r20 != 0) goto L153
            java.util.List r2 = java.util.Arrays.asList(r19)
            java.lang.String r15 = "asList(...)"
            a.C0193i9.d(r2, r15)
            a.S4 r15 = new a.S4
            a.i0 r6 = new a.i0
            r6.<init>(r10, r2)
            r15.<init>(r11, r6)
            a.Sd r2 = new a.Sd
            r2.<init>(r15)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r15 = a.C0312p3.g0(r2, r7)
            r6.<init>(r15)
            java.util.Iterator r2 = r2.iterator()
        L12c:
            r15 = r2
            a.S4$a r15 = (a.S4.a) r15
            boolean r21 = r15.hasNext()
            if (r21 == 0) goto L19b
            java.lang.Object r15 = r15.next()
            a.f9 r15 = (a.C0139f9) r15
            java.lang.String r7 = "range"
            a.C0193i9.e(r15, r7)
            int r7 = r15.b
            int r7 = r7 + r10
            int r15 = r15.f434a
            java.lang.CharSequence r7 = r11.subSequence(r15, r7)
            java.lang.String r7 = r7.toString()
            r6.add(r7)
            r7 = 10
            goto L12c
        L153:
            int r6 = a.Be.L(r11, r2, r9, r9)
            r7 = -1
            if (r6 == r7) goto L193
            java.util.ArrayList r7 = new java.util.ArrayList
            r15 = 4
            r7.<init>(r15)
            r15 = r9
        L161:
            java.lang.CharSequence r15 = r11.subSequence(r15, r6)
            java.lang.String r15 = r15.toString()
            r7.add(r15)
            int r15 = r2.length()
            int r15 = r15 + r6
            int r6 = r7.size()
            r10 = 3
            if (r6 == r10) goto L182
            int r6 = a.Be.L(r11, r2, r15, r9)
            r10 = -1
            if (r6 != r10) goto L180
            goto L182
        L180:
            r10 = 1
            goto L161
        L182:
            int r2 = r11.length()
            java.lang.CharSequence r2 = r11.subSequence(r15, r2)
            java.lang.String r2 = r2.toString()
            r7.add(r2)
            r6 = r7
            goto L19b
        L193:
            java.lang.String r2 = r11.toString()
            java.util.List r6 = a.C0435w1.K(r2)
        L19b:
            int r2 = r6.size()
            r15 = 4
            if (r2 >= r15) goto L1a9
            r15 = r3
            r29 = r4
            r2 = r18
            goto L27a
        L1a9:
            a.if$a r23 = new a.if$a
            java.lang.Object r2 = r6.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            a.C0193i9.e(r2, r3)
            int r7 = r2.length()
            if (r7 != 0) goto L1bf
        L1ba:
            r15 = r3
            r29 = r4
            goto L22a
        L1bf:
            char r10 = r2.charAt(r9)
            r11 = 48
            if (r10 >= r11) goto L1c9
            r11 = -1
            goto L1ce
        L1c9:
            if (r10 != r11) goto L1cd
            r11 = r9
            goto L1ce
        L1cd:
            r11 = 1
        L1ce:
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 >= 0) goto L1ea
            r11 = 1
            if (r7 != r11) goto L1d9
            goto L1ba
        L1d9:
            r11 = 43
            if (r10 == r11) goto L1e7
            r11 = 45
            if (r10 == r11) goto L1e2
            goto L1ba
        L1e2:
            r24 = -9223372036854775808
            r10 = 1
            r11 = 1
            goto L1ec
        L1e7:
            r11 = r9
            r10 = 1
            goto L1ec
        L1ea:
            r10 = r9
            r11 = r10
        L1ec:
            r26 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r15 = r3
            r29 = r4
            r3 = r16
            r30 = r26
        L1f8:
            if (r10 >= r7) goto L238
            char r9 = r2.charAt(r10)
            r19 = r2
            r2 = 10
            int r9 = java.lang.Character.digit(r9, r2)
            if (r9 >= 0) goto L209
            goto L22a
        L209:
            int r21 = (r3 > r30 ? 1 : (r3 == r30 ? 0 : -1))
            if (r21 >= 0) goto L21d
            int r21 = (r30 > r26 ? 1 : (r30 == r26 ? 0 : -1))
            if (r21 != 0) goto L22a
            r32 = r10
            r28 = r11
            long r10 = (long) r2
            long r30 = r24 / r10
            int r10 = (r3 > r30 ? 1 : (r3 == r30 ? 0 : -1))
            if (r10 >= 0) goto L221
            goto L22a
        L21d:
            r32 = r10
            r28 = r11
        L221:
            long r10 = (long) r2
            long r3 = r3 * r10
            long r9 = (long) r9
            long r33 = r24 + r9
            int r2 = (r3 > r33 ? 1 : (r3 == r33 ? 0 : -1))
            if (r2 >= 0) goto L22d
        L22a:
            r2 = r18
            goto L246
        L22d:
            long r3 = r3 - r9
            r22 = 1
            int r10 = r32 + 1
            r2 = r19
            r11 = r28
            r9 = 0
            goto L1f8
        L238:
            r28 = r11
            if (r28 == 0) goto L241
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            goto L246
        L241:
            long r2 = -r3
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L246:
            if (r2 == 0) goto L250
            long r2 = r2.longValue()
            r24 = r2
        L24e:
            r11 = 1
            goto L253
        L250:
            r24 = r16
            goto L24e
        L253:
            java.lang.Object r2 = r6.get(r11)
            r26 = r2
            java.lang.String r26 = (java.lang.String) r26
            r2 = 2
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r3 = "1"
            boolean r27 = a.C0193i9.a(r2, r3)
            r10 = 3
            java.lang.Object r2 = r6.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = a.Be.V(r2)
            java.lang.String r28 = r2.toString()
            r23.<init>(r24, r26, r27, r28)
            r2 = r23
        L27a:
            if (r2 == 0) goto L27f
            r8.add(r2)
        L27f:
            r3 = r15
            r4 = r29
            r7 = 10
            r9 = 0
            r10 = 1
            goto Lea
        L288:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L290
            r3 = 0
            goto L2b0
        L290:
            java.util.Iterator r2 = r8.iterator()
            r3 = 0
        L295:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2b0
            java.lang.Object r4 = r2.next()
            a.if$a r4 = (a.Cif.a) r4
            boolean r4 = r4.c
            if (r4 == 0) goto L295
            r22 = 1
            int r3 = r3 + 1
            if (r3 < 0) goto L2ac
            goto L295
        L2ac:
            a.C0294o3.f0()
            throw r18
        L2b0:
            java.util.Iterator r2 = r8.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L2bd
            r4 = r18
            goto L2e3
        L2bd:
            java.lang.Object r4 = r2.next()
            a.if$a r4 = (a.Cif.a) r4
            long r6 = r4.f513a
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
        L2c9:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L2e3
            java.lang.Object r6 = r2.next()
            a.if$a r6 = (a.Cif.a) r6
            long r6 = r6.f513a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            int r7 = r4.compareTo(r6)
            if (r7 >= 0) goto L2c9
            r4 = r6
            goto L2c9
        L2e3:
            if (r4 == 0) goto L2ea
            long r6 = r4.longValue()
            goto L2ec
        L2ea:
            r6 = r16
        L2ec:
            int r2 = r8.size()
            int r2 = r2 - r3
            int r4 = r8.size()
            r9 = 20
            if (r9 < r4) goto L2ff
            java.util.List r4 = a.C0383t3.w0(r8)
        L2fd:
            r11 = 1
            goto L314
        L2ff:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            int r9 = r4 + (-20)
        L306:
            if (r9 >= r4) goto L312
            java.lang.Object r11 = r8.get(r9)
            r10.add(r11)
            r11 = 1
            int r9 = r9 + r11
            goto L306
        L312:
            r4 = r10
            goto L2fd
        L314:
            int r8 = r4.size()
            if (r8 > r11) goto L31f
            java.util.List r4 = a.C0383t3.w0(r4)
            goto L326
        L31f:
            java.util.List r4 = a.C0383t3.z0(r4)
            java.util.Collections.reverse(r4)
        L326:
            java.lang.String r8 = "━━━ 拦截记录 ━━━\n"
            r14.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "拦截成功："
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r3 = " 次"
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r14.append(r8)
            r8 = 10
            r14.append(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "拦截失败（绕过）："
            r9.<init>(r10)
            r9.append(r2)
            r9.append(r3)
            java.lang.String r2 = r9.toString()
            r14.append(r2)
            r14.append(r8)
            java.lang.String r2 = c(r6)
            java.lang.String r3 = "最近拦截："
            java.lang.String r2 = r3.concat(r2)
            r14.append(r2)
            java.lang.String r2 = "\n\n━━━ 当前运行版本 ━━━\n"
            r14.append(r2)
            if (r0 == 0) goto L589
            java.lang.String r2 = r0.b
            int r2 = r2.length()
            if (r2 <= 0) goto L589
            java.lang.String r2 = r0.b
            int r3 = r0.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "版本号："
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " ("
            r6.append(r2)
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            r14.append(r3)
            r8 = 10
            r14.append(r8)
            long r6 = r0.f515a
            java.lang.String r3 = c(r6)
            java.lang.String r6 = "采集时间："
            java.lang.String r3 = r6.concat(r3)
            r14.append(r3)
            r14.append(r8)
            java.lang.String r3 = r0.d
            java.lang.String r6 = "尚未加载"
            if (r3 != 0) goto L3b7
            r3 = r6
        L3b7:
            java.lang.String r7 = "当前 Tag："
            java.lang.String r3 = r7.concat(r3)
            r14.append(r3)
            r14.append(r8)
            java.lang.String r3 = r0.f
            if (r3 != 0) goto L3c8
            r3 = r6
        L3c8:
            java.lang.String r7 = "当前构建："
            java.lang.String r3 = r7.concat(r3)
            r14.append(r3)
            r14.append(r8)
            java.lang.String r3 = r0.h
            java.lang.String r3 = k(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "当前 Rev："
            r7.<init>(r9)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r14.append(r3)
            r14.append(r8)
            java.lang.Boolean r3 = r0.l
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r7 = a.C0193i9.a(r3, r7)
            if (r7 == 0) goto L3fb
            java.lang.String r3 = "启用"
            goto L40a
        L3fb:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r7 = a.C0193i9.a(r3, r7)
            if (r7 == 0) goto L406
            java.lang.String r3 = "禁用"
            goto L40a
        L406:
            if (r3 != 0) goto L583
            java.lang.String r3 = "未知"
        L40a:
            java.lang.String r7 = "补丁状态："
            java.lang.String r3 = r7.concat(r3)
            r14.append(r3)
            java.lang.String r3 = "\n\n━━━ 基线版本（热更新前） ━━━\n"
            r14.append(r3)
            boolean r3 = r0.a()
            java.lang.String r7 = "基线版本："
            if (r3 != 0) goto L43f
            boolean r3 = r0.a()
            if (r3 == 0) goto L427
            goto L43f
        L427:
            java.lang.String r3 = "🟢 未检测到热更新（当前 = 基线）\n"
            r14.append(r3)
            java.lang.String r3 = r0.k
            if (r3 != 0) goto L432
            java.lang.String r3 = "null（无热更新记录）"
        L432:
            java.lang.String r3 = r7.concat(r3)
            r14.append(r3)
            r8 = 10
            r14.append(r8)
            goto L4ac
        L43f:
            java.lang.String r3 = "🔴 当前版本已被热更新\n"
            r14.append(r3)
            java.lang.String r3 = r0.k
            if (r3 != 0) goto L449
            r3 = r6
        L449:
            java.lang.String r3 = r7.concat(r3)
            r14.append(r3)
            r8 = 10
            r14.append(r8)
            java.lang.String r3 = r0.e
            if (r3 != 0) goto L45a
            r3 = r6
        L45a:
            java.lang.String r7 = "基线 Tag："
            java.lang.String r3 = r7.concat(r3)
            r14.append(r3)
            r14.append(r8)
            java.lang.String r3 = r0.g
            if (r3 != 0) goto L46b
            goto L46c
        L46b:
            r6 = r3
        L46c:
            java.lang.String r3 = "基线构建："
            java.lang.String r3 = r3.concat(r6)
            r14.append(r3)
            r14.append(r8)
            java.lang.String r3 = r0.i
            java.lang.String r3 = k(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "基线 Rev："
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r14.append(r3)
            r14.append(r8)
            java.lang.String r3 = r0.j
            java.lang.String r3 = k(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "补丁 Rev："
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r14.append(r3)
            r14.append(r8)
        L4ac:
            r14.append(r8)
            if (r13 == 0) goto L57d
            long r6 = r13.f515a
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r3 <= 0) goto L57d
            java.lang.String r3 = "━━━ 初始快照对比 ━━━\n"
            r14.append(r3)
            long r6 = r13.f515a
            java.lang.String r3 = c(r6)
            java.lang.String r6 = "初始记录："
            java.lang.String r3 = r6.concat(r3)
            r14.append(r3)
            r8 = 10
            r14.append(r8)
            java.lang.String r3 = r13.b
            int r6 = r13.c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "初始版本："
            r7.<init>(r8)
            r7.append(r3)
            r7.append(r2)
            r7.append(r6)
            r7.append(r5)
            java.lang.String r2 = r7.toString()
            r14.append(r2)
            r8 = 10
            r14.append(r8)
            java.lang.String r2 = r13.b
            java.lang.String r3 = r0.b
            boolean r2 = r2.equals(r3)
            java.lang.String r3 = "🟢 版本未变动\n"
            if (r2 == 0) goto L50f
            java.lang.String r2 = r13.h
            java.lang.String r5 = r0.h
            boolean r2 = a.C0193i9.a(r2, r5)
            if (r2 != 0) goto L50a
            goto L50f
        L50a:
            r14.append(r3)
            goto L597
        L50f:
            java.lang.String r2 = r13.h
            if (r2 == 0) goto L51f
            java.lang.String r5 = r0.h
            if (r5 == 0) goto L51f
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L51f
            r2 = 1
            goto L520
        L51f:
            r2 = 0
        L520:
            java.lang.String r5 = r13.b
            int r5 = r5.length()
            if (r5 <= 0) goto L53b
            java.lang.String r5 = r0.b
            int r5 = r5.length()
            if (r5 <= 0) goto L53b
            java.lang.String r5 = r13.b
            java.lang.String r6 = r0.b
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L53b
            goto L53d
        L53b:
            if (r2 == 0) goto L579
        L53d:
            java.lang.String r2 = "🟡 版本已变动（疑似热更新或 APK 更新）\n"
            r14.append(r2)
            java.lang.String r2 = r13.h
            java.lang.String r2 = k(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "  初始 Rev："
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r14.append(r2)
            r8 = 10
            r14.append(r8)
            java.lang.String r0 = r0.h
            java.lang.String r0 = k(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "  当前 Rev："
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r14.append(r0)
            r14.append(r8)
            goto L597
        L579:
            r14.append(r3)
            goto L597
        L57d:
            java.lang.String r0 = "━━━ 初始快照 ━━━\n尚未记录（本次采集将作为初始快照）\n"
            r14.append(r0)
            goto L597
        L583:
            a.Ob r0 = new a.Ob
            r0.<init>()
            throw r0
        L589:
            java.lang.String r0 = "⚠️ 尚未采集到版本信息\n（请确保微信已完全启动后重试）\n"
            r14.append(r0)
            if (r12 != 0) goto L595
            java.lang.String r0 = "（ClassLoader 未就绪，模块可能未在微信进程加载）\n"
            r14.append(r0)
        L595:
            a.Wf r0 = a.Wf.f330a
        L597:
            android.widget.ScrollView r0 = new android.widget.ScrollView
            android.app.Activity r2 = r1.f669a
            r0.<init>(r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            a.ra$a r3 = r1.b
            int r3 = r3.f670a
            r2.setColor(r3)
            r3 = 12
            int r3 = r1.b(r3)
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            r0.setBackground(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.app.Activity r3 = r1.f669a
            r2.<init>(r3)
            r11 = 1
            r2.setOrientation(r11)
            r3 = 16
            int r5 = r1.b(r3)
            int r6 = r1.b(r3)
            int r7 = r1.b(r3)
            int r3 = r1.b(r3)
            r2.setPadding(r5, r6, r7, r3)
            android.widget.TextView r3 = new android.widget.TextView
            android.app.Activity r5 = r1.f669a
            r3.<init>(r5)
            java.lang.String r5 = r14.toString()
            r3.setText(r5)
            r5 = 1094713344(0x41400000, float:12.0)
            r6 = 2
            r3.setTextSize(r6, r5)
            a.ra$a r6 = r1.b
            int r6 = r6.d
            r3.setTextColor(r6)
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            r3.setTypeface(r6)
            r7 = 0
            r8 = 1067869798(0x3fa66666, float:1.3)
            r3.setLineSpacing(r7, r8)
            r2.addView(r3)
            r8 = 10
            java.util.List r13 = a.C0383t3.s0(r8, r4)
            boolean r3 = r13.isEmpty()
            if (r3 != 0) goto L74a
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "HH:mm:ss"
            java.util.Locale r8 = java.util.Locale.getDefault()
            r3.<init>(r4, r8)
            android.widget.TextView r12 = new android.widget.TextView
            android.app.Activity r4 = r1.f669a
            r12.<init>(r4)
            int r4 = r13.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "▸ 最近事件（"
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r4 = " 条）点击展开"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r12.setText(r4)
            r4 = 2
            r12.setTextSize(r4, r5)
            a.ra$a r4 = r1.b
            int r4 = r4.g
            r12.setTextColor(r4)
            r12.setTypeface(r6)
            r4 = 8
            int r6 = r1.b(r4)
            r15 = 4
            int r8 = r1.b(r15)
            r9 = 0
            r12.setPadding(r9, r6, r9, r8)
            r11 = 1
            r12.setClickable(r11)
            r2.addView(r12)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.app.Activity r8 = r1.f669a
            r6.<init>(r8)
            r6.setOrientation(r11)
            java.util.Iterator r8 = r13.iterator()
        L66b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L700
            java.lang.Object r9 = r8.next()
            a.if$a r9 = (a.Cif.a) r9
            long r10 = r9.f513a
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L689
            java.util.Date r10 = new java.util.Date
            long r14 = r9.f513a
            r10.<init>(r14)
            java.lang.String r10 = r3.format(r10)
            goto L68b
        L689:
            java.lang.String r10 = "--:--:--"
        L68b:
            boolean r11 = r9.c
            if (r11 == 0) goto L692
            java.lang.String r11 = "拦截"
            goto L694
        L692:
            java.lang.String r11 = "绕过"
        L694:
            java.lang.String r14 = r9.d
            int r14 = r14.length()
            r15 = 40
            if (r14 <= r15) goto L6ad
            java.lang.String r14 = r9.d
            r15 = 37
            java.lang.String r14 = a.Ce.Y(r14, r15)
            java.lang.String r15 = "..."
            java.lang.String r14 = r15.concat(r14)
            goto L6af
        L6ad:
            java.lang.String r14 = r9.d
        L6af:
            android.widget.TextView r15 = new android.widget.TextView
            android.app.Activity r4 = r1.f669a
            r15.<init>(r4)
            java.lang.String r4 = r9.b
            java.lang.String r9 = "["
            java.lang.String r7 = "] "
            java.lang.String r5 = " "
            java.lang.StringBuilder r4 = a.C0487z.i(r9, r10, r7, r4, r5)
            r4.append(r11)
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            r15.setText(r4)
            r4 = 2
            r5 = 1094713344(0x41400000, float:12.0)
            r15.setTextSize(r4, r5)
            a.ra$a r7 = r1.b
            int r7 = r7.d
            r15.setTextColor(r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.MONOSPACE
            r15.setTypeface(r7)
            r10 = 3
            int r7 = r1.b(r10)
            int r9 = r1.b(r10)
            r11 = 0
            r15.setPadding(r11, r7, r11, r9)
            r7 = 1067030938(0x3f99999a, float:1.2)
            r9 = 0
            r15.setLineSpacing(r9, r7)
            r6.addView(r15)
            r7 = r9
            r4 = 8
            goto L66b
        L700:
            android.widget.ScrollView r11 = new android.widget.ScrollView
            android.app.Activity r3 = r1.f669a
            r11.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 160(0xa0, float:2.24E-43)
            int r4 = r1.b(r4)
            r7 = -1
            r3.<init>(r7, r4)
            r11.setLayoutParams(r3)
            r3 = 1
            r11.setVerticalScrollBarEnabled(r3)
            r3 = 8
            r11.setVisibility(r3)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            a.ra$a r5 = r1.b
            int r5 = r5.b
            r4.setColor(r5)
            int r3 = r1.b(r3)
            float r3 = (float) r3
            r4.setCornerRadius(r3)
            r11.setBackground(r4)
            r11.addView(r6)
            r2.addView(r11)
            a.Qc r10 = new a.Qc
            r10.<init>()
            a.oa r9 = new a.oa
            r14 = 1
            r9.<init>(r10, r11, r12, r13, r14)
            r12.setOnClickListener(r9)
        L74a:
            r0.addView(r2)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.app.Activity r3 = r1.f669a
            r2.<init>(r3)
            java.lang.String r3 = "版本详情"
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            android.app.AlertDialog$Builder r0 = r2.setView(r0)
            a.pa r2 = new a.pa
            r9 = 0
            r2.<init>(r1, r9)
            java.lang.String r3 = "刷新"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r2)
            a.pa r2 = new a.pa
            r11 = 1
            r2.<init>(r1, r11)
            java.lang.String r3 = "重置快照"
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r3, r2)
            java.lang.String r2 = "关闭"
            r3 = r18
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            r1.o(r0)
            return
    }

    public final android.view.View n(int r4) {
            r3 = this;
            android.view.View r0 = new android.view.View
            android.app.Activity r1 = r3.f669a
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r4)
            r0.setLayoutParams(r1)
            return r0
    }

    public final void o(android.app.AlertDialog r5) {
            r4 = this;
            android.view.Window r0 = r5.getWindow()
            a.ra$a r1 = r4.b
            if (r0 == 0) goto L1f
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r3 = r1.f670a
            r2.setColor(r3)
            r3 = 16
            int r3 = r4.b(r3)
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            r0.setBackgroundDrawable(r2)
        L1f:
            r0 = -1
            android.widget.Button r0 = r5.getButton(r0)
            if (r0 == 0) goto L2b
            int r2 = r1.g
            r0.setTextColor(r2)
        L2b:
            r0 = -2
            android.widget.Button r0 = r5.getButton(r0)
            if (r0 == 0) goto L37
            int r2 = r1.g
            r0.setTextColor(r2)
        L37:
            r0 = -3
            android.widget.Button r0 = r5.getButton(r0)
            if (r0 == 0) goto L43
            int r2 = r1.g
            r0.setTextColor(r2)
        L43:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L53
            int r2 = r1.d
            r0.setTextColor(r2)
        L53:
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L63
            int r0 = r1.e
            r5.setTextColor(r0)
        L63:
            return
    }

    public final android.widget.LinearLayout p(java.lang.String r10, java.lang.String r11, android.widget.Switch r12, a.D7 r13) {
            r9 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.app.Activity r1 = r9.f669a
            r0.<init>(r1)
            r2 = 0
            r0.setOrientation(r2)
            r3 = 16
            r0.setGravity(r3)
            r3 = 14
            int r3 = r9.b(r3)
            r4 = 12
            int r5 = r9.b(r4)
            r6 = 10
            int r6 = r9.b(r6)
            int r7 = r9.b(r4)
            r0.setPadding(r3, r5, r6, r7)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            a.ra$a r5 = r9.b
            int r6 = r5.b
            r3.setColor(r6)
            int r4 = r9.b(r4)
            float r4 = (float) r4
            r3.setCornerRadius(r4)
            boolean r4 = r9.c
            r6 = 1
            if (r4 == 0) goto L4d
            r4 = 33
            r7 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.argb(r4, r7, r7, r7)
            r3.setStroke(r6, r4)
        L4d:
            r0.setBackground(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r7 = -2
            r3.<init>(r4, r7)
            r4 = 3
            int r8 = r9.b(r4)
            int r4 = r9.b(r4)
            r3.setMargins(r2, r8, r2, r4)
            r0.setLayoutParams(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r3.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r2, r7, r8)
            r3.setLayoutParams(r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            r2.setText(r10)
            r10 = 2
            r4 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r10, r4)
            int r4 = r5.d
            r2.setTextColor(r4)
            r2.setSingleLine(r6)
            r3.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            r2.setText(r11)
            r11 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r10, r11)
            int r10 = r5.e
            r2.setTextColor(r10)
            r3.addView(r2)
            a.X2 r10 = new a.X2
            r11 = 1
            r10.<init>(r11, r13)
            r12.setOnCheckedChangeListener(r10)
            r0.addView(r3)
            r0.addView(r12)
            return r0
    }

    public final android.widget.LinearLayout q(java.lang.String r3, java.lang.String r4, boolean r5, a.D7 r6) {
            r2 = this;
            android.widget.Switch r0 = new android.widget.Switch
            android.app.Activity r1 = r2.f669a
            r0.<init>(r1)
            r0.setChecked(r5)
            a.Wf r5 = a.Wf.f330a
            android.widget.LinearLayout r3 = r2.p(r3, r4, r0, r6)
            return r3
    }
}
