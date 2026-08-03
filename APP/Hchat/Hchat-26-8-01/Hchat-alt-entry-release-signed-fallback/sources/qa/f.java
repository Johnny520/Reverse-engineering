package qa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.Set f10783l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.List f10784m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f10785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f10786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f10787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.WeakHashMap f10788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.WeakHashMap f10789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.ThreadLocal f10790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.ThreadLocal f10791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f10792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f10793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f10794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f10795k;

    static {
            java.lang.String r0 = "setFirstMoney"
            java.lang.String r1 = "setNewMoney"
            java.lang.String r2 = "setMoney"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            qa.f.f10783l = r0
            java.lang.String r0 = "商户余额"
            java.lang.String r1 = "商家账户"
            java.lang.String r2 = "经营账户"
            java.lang.String r3 = "经营账号"
            java.lang.String r4 = "商户账户"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            qa.f.f10784m = r0
            return
    }

    public f(r8.g r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f10785a = r2
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_fake_wallet_balance_config"
            android.content.SharedPreferences r0 = ub.b.c(r2, r0)
            r1.f10786b = r0
            java.lang.String r0 = "Hchat_fake_wallet_balance_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f10787c = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r1.f10788d = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r1.f10789e = r2
            java.lang.ThreadLocal r2 = new java.lang.ThreadLocal
            r2.<init>()
            r1.f10790f = r2
            java.lang.ThreadLocal r2 = new java.lang.ThreadLocal
            r2.<init>()
            r1.f10791g = r2
            return
    }

    public static final java.lang.String a(qa.f r8, qa.b r9, java.lang.String r10) {
            android.content.SharedPreferences r8 = r8.f10786b
            int r0 = r9.ordinal()
            java.lang.String r1 = "fake_wallet_balance_mode_lqt"
            java.lang.String r2 = "fake_wallet_business_amount"
            java.lang.String r3 = "fake_wallet_lqt_amount"
            r4 = 2
            if (r0 == 0) goto L27
            r5 = 1
            if (r0 == r5) goto L21
            if (r0 != r4) goto L1c
            sf.e r0 = new sf.e
            java.lang.String r5 = "fake_wallet_balance_mode_business"
            r0.<init>(r2, r5)
            goto L30
        L1c:
            okio.a.k()
            r8 = 0
            return r8
        L21:
            sf.e r0 = new sf.e
            r0.<init>(r3, r1)
            goto L30
        L27:
            sf.e r0 = new sf.e
            java.lang.String r5 = "fake_wallet_balance_amount"
            java.lang.String r6 = "fake_wallet_balance_mode_balance"
            r0.<init>(r5, r6)
        L30:
            java.lang.Object r5 = r0.f12418g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f12419h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "0.00"
            qa.b r7 = qa.b.f10775i
            if (r9 != r7) goto L42
            java.lang.String r6 = r8.getString(r3, r6)
        L42:
            java.lang.String r3 = r8.getString(r5, r6)
            java.lang.String r5 = "fixed"
            if (r9 != r7) goto L57
            boolean r9 = r8.contains(r2)
            if (r9 != 0) goto L57
            og.k r9 = qa.g.f10796a
            java.lang.String r9 = qa.g.b(r8, r1, r6, r5)
            goto L58
        L57:
            r9 = r5
        L58:
            og.k r1 = qa.g.f10796a
            java.lang.String r8 = qa.g.b(r8, r0, r3, r9)
            r10.getClass()
            r8.getClass()
            java.math.BigDecimal r9 = qa.g.a(r3)
            java.math.BigDecimal r9 = r9.abs()
            java.math.BigDecimal r10 = qa.g.a(r10)
            java.lang.String r8 = qa.g.e(r8, r5)
            java.lang.String r0 = "increase"
            boolean r0 = gg.l.a(r8, r0)
            if (r0 == 0) goto L81
            java.math.BigDecimal r9 = r10.add(r9)
            goto L8d
        L81:
            java.lang.String r0 = "decrease"
            boolean r8 = gg.l.a(r8, r0)
            if (r8 == 0) goto L8d
            java.math.BigDecimal r9 = r10.subtract(r9)
        L8d:
            java.math.BigDecimal r8 = java.math.BigDecimal.ZERO
            java.math.BigDecimal r8 = r9.max(r8)
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r8 = r8.setScale(r4, r9)
            java.lang.String r8 = r8.toPlainString()
            r8.getClass()
            return r8
    }

    public static final boolean b(qa.f r5, android.view.View r6, java.lang.String r7) {
            java.lang.ThreadLocal r0 = r5.f10790f
            java.lang.Object r0 = r0.get()
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            if (r0 == 0) goto Lb
            goto L15
        Lb:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.ThreadLocal r1 = r5.f10790f
            r1.set(r0)
        L15:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.addLast(r1)
            java.lang.ThreadLocal r0 = r5.f10791g
            java.lang.Object r0 = r0.get()
            qa.a r0 = (qa.a) r0
            r1 = 0
            if (r0 == 0) goto L65
            r2 = 1
            if (r6 == 0) goto L64
            if (r7 == 0) goto L64
        L2a:
            int r3 = r7.length()
            if (r1 >= r3) goto L64
            char r3 = r7.charAt(r1)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 == 0) goto L61
            og.k r1 = qa.g.f10796a
            java.lang.String r1 = r0.f10772b
            java.math.BigDecimal r1 = qa.g.a(r1)
            java.lang.String r1 = r1.toPlainString()
            r1.getClass()
            java.lang.String r1 = l(r7, r1)
            java.util.WeakHashMap r3 = r5.f10789e
            monitor-enter(r3)
            java.util.WeakHashMap r5 = r5.f10789e     // Catch: java.lang.Throwable -> L5e
            qa.c r4 = new qa.c     // Catch: java.lang.Throwable -> L5e
            qa.b r0 = r0.f10771a     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r0, r1, r7)     // Catch: java.lang.Throwable -> L5e
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r3)
            return r2
        L5e:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
        L61:
            int r1 = r1 + 1
            goto L2a
        L64:
            return r2
        L65:
            return r1
    }

    public static final void c(qa.f r3) {
            java.lang.ThreadLocal r0 = r3.f10791g
            java.lang.ThreadLocal r3 = r3.f10790f
            java.lang.Object r1 = r3.get()
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            if (r1 == 0) goto L31
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L19
            r3.remove()
            r0.remove()
            return
        L19:
            java.lang.Object r2 = r1.removeLast()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L28
            r0.remove()
        L28:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L31
            r3.remove()
        L31:
            return
    }

    public static final boolean d(qa.f r1, qa.b r2) {
            int r2 = r2.ordinal()
            if (r2 == 0) goto L17
            r0 = 1
            if (r2 == r0) goto L14
            r0 = 2
            if (r2 != r0) goto Lf
            java.lang.String r2 = "fake_wallet_balance_enable_business"
            goto L19
        Lf:
            okio.a.k()
            r1 = 0
            return r1
        L14:
            java.lang.String r2 = "fake_wallet_balance_enable_lqt"
            goto L19
        L17:
            java.lang.String r2 = "fake_wallet_balance_enable_balance"
        L19:
            og.k r0 = qa.g.f10796a
            android.content.SharedPreferences r1 = r1.f10786b
            boolean r1 = qa.g.c(r1, r2)
            return r1
    }

    public static final void e(qa.f r2, qa.b r3, java.lang.String r4) {
            java.lang.ThreadLocal r0 = r2.f10790f
            java.lang.Object r0 = r0.get()
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            if (r0 == 0) goto L23
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            goto L23
        L11:
            r0.removeLast()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.addLast(r1)
            java.lang.ThreadLocal r2 = r2.f10791g
            qa.a r0 = new qa.a
            r0.<init>(r3, r4)
            r2.set(r0)
        L23:
            return
    }

    public static final java.lang.String f(qa.f r6, android.view.View r7, qa.b r8, java.lang.String r9) {
            if (r7 != 0) goto L3
            return r9
        L3:
            java.util.WeakHashMap r0 = r6.f10789e
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r6.f10789e     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L13
            qa.c r1 = (qa.c) r1     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            qa.b r2 = r1.f10777a     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r6 = move-exception
            goto L76
        L15:
            r2 = 0
        L16:
            if (r2 != r8) goto L6a
            java.lang.String r2 = r1.f10779c     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r4 = r3
        L1c:
            int r5 = r9.length()     // Catch: java.lang.Throwable -> L13
            if (r4 >= r5) goto L53
            char r5 = r9.charAt(r4)     // Catch: java.lang.Throwable -> L13
            boolean r5 = java.lang.Character.isDigit(r5)     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L50
            r4 = r3
        L2d:
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L13
            if (r4 >= r5) goto L53
            char r5 = r2.charAt(r4)     // Catch: java.lang.Throwable -> L13
            boolean r5 = java.lang.Character.isDigit(r5)     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L4d
            java.math.BigDecimal r4 = qa.g.a(r9)     // Catch: java.lang.Throwable -> L13
            java.math.BigDecimal r2 = qa.g.a(r2)     // Catch: java.lang.Throwable -> L13
            int r2 = r4.compareTo(r2)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L53
            r3 = 1
            goto L53
        L4d:
            int r4 = r4 + 1
            goto L2d
        L50:
            int r4 = r4 + 1
            goto L1c
        L53:
            if (r3 == 0) goto L6a
            og.k r6 = qa.g.f10796a     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = r1.f10778b     // Catch: java.lang.Throwable -> L13
            java.math.BigDecimal r6 = qa.g.a(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = r6.toPlainString()     // Catch: java.lang.Throwable -> L13
            r6.getClass()     // Catch: java.lang.Throwable -> L13
            java.lang.String r6 = l(r9, r6)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r6
        L6a:
            java.util.WeakHashMap r6 = r6.f10789e     // Catch: java.lang.Throwable -> L13
            qa.c r1 = new qa.c     // Catch: java.lang.Throwable -> L13
            r1.<init>(r8, r9, r9)     // Catch: java.lang.Throwable -> L13
            r6.put(r7, r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r9
        L76:
            monitor-exit(r0)
            throw r6
    }

    public static final void g(qa.f r3, android.view.View r4, qa.b r5, java.lang.String r6) {
            if (r4 != 0) goto L3
            return
        L3:
            java.util.WeakHashMap r0 = r3.f10789e
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r3.f10789e     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L1d
            qa.c r1 = (qa.c) r1     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            qa.b r2 = r1.f10777a     // Catch: java.lang.Throwable -> L1d
            if (r2 != r5) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L1f
            java.lang.String r1 = r1.f10778b     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            goto L20
        L1d:
            r3 = move-exception
            goto L2c
        L1f:
            r1 = r6
        L20:
            java.util.WeakHashMap r3 = r3.f10789e     // Catch: java.lang.Throwable -> L1d
            qa.c r2 = new qa.c     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r5, r1, r6)     // Catch: java.lang.Throwable -> L1d
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L2c:
            monitor-exit(r0)
            throw r3
    }

    public static final boolean h(qa.f r0, qa.b r1) {
            qa.b r0 = qa.b.f10774h
            if (r1 == r0) goto Lb
            qa.b r0 = qa.b.f10775i
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static final qa.b i(qa.f r12, android.view.View r13) {
            r0 = 0
            r1 = r13
            r2 = r0
        L3:
            qa.b r3 = qa.b.f10774h
            qa.b r4 = qa.b.f10773g
            r5 = 0
            if (r1 == 0) goto L82
            r6 = 8
            if (r2 >= r6) goto L82
            java.lang.CharSequence r6 = r1.getContentDescription()
            if (r6 == 0) goto L19
            java.lang.String r6 = r6.toString()
            goto L1a
        L19:
            r6 = r5
        L1a:
            qa.b r6 = r(r6)
            if (r6 == 0) goto L22
            goto L83
        L22:
            boolean r6 = r1 instanceof android.widget.TextView
            if (r6 == 0) goto L3c
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.CharSequence r6 = r6.getText()
            if (r6 == 0) goto L34
            java.lang.String r6 = r6.toString()
            goto L35
        L34:
            r6 = r5
        L35:
            qa.b r6 = r(r6)
            if (r6 == 0) goto L3c
            goto L83
        L3c:
            android.view.ViewParent r6 = r1.getParent()
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L47
            android.view.View r6 = (android.view.View) r6
            goto L48
        L47:
            r6 = r5
        L48:
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L7e
            r7 = r6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            gg.q r8 = new gg.q
            r8.<init>()
            gg.q r9 = new gg.q
            r9.<init>()
            gg.q r10 = new gg.q
            r10.<init>()
            b0.s r11 = new b0.s
            r11.<init>(r12, r10, r9, r8)
            j(r7, r1, r0, r11)
            boolean r1 = r10.f4560g
            if (r1 == 0) goto L6d
            qa.b r1 = qa.b.f10775i
            goto L7a
        L6d:
            boolean r1 = r9.f4560g
            if (r1 == 0) goto L73
            r1 = r3
            goto L7a
        L73:
            boolean r1 = r8.f4560g
            if (r1 == 0) goto L79
            r1 = r4
            goto L7a
        L79:
            r1 = r5
        L7a:
            if (r1 == 0) goto L7e
            r6 = r1
            goto L83
        L7e:
            int r2 = r2 + 1
            r1 = r6
            goto L3
        L82:
            r6 = r5
        L83:
            if (r6 == 0) goto L86
            return r6
        L86:
            android.content.Context r12 = r13.getContext()
        L8a:
            boolean r13 = r12 instanceof android.content.ContextWrapper
            if (r13 == 0) goto L9c
            boolean r13 = r12 instanceof android.app.Activity
            if (r13 == 0) goto L95
            android.app.Activity r12 = (android.app.Activity) r12
            goto La4
        L95:
            android.content.ContextWrapper r12 = (android.content.ContextWrapper) r12
            android.content.Context r12 = r12.getBaseContext()
            goto L8a
        L9c:
            boolean r13 = r12 instanceof android.app.Activity
            if (r13 == 0) goto La3
            android.app.Activity r12 = (android.app.Activity) r12
            goto La4
        La3:
            r12 = r5
        La4:
            java.lang.String r13 = "mallwallet"
            java.lang.String r1 = "mallindexui"
            java.lang.String r2 = "walletbalancemanagerui"
            java.lang.String r6 = "lqt"
            if (r12 == 0) goto L117
            java.lang.CharSequence r7 = r12.getTitle()
            if (r7 == 0) goto Lb9
            java.lang.String r7 = r7.toString()
            goto Lba
        Lb9:
            r7 = r5
        Lba:
            qa.b r7 = r(r7)
            if (r7 == 0) goto Lc1
            goto L118
        Lc1:
            java.lang.Class r12 = r12.getClass()
        Lc5:
            if (r12 == 0) goto L117
            java.lang.Class<android.app.Activity> r7 = android.app.Activity.class
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L117
            java.lang.String r7 = r12.getName()
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = j8.b.l(r8, r7, r8)
            boolean r8 = og.m.h0(r7, r6, r0)
            if (r8 == 0) goto Le1
        Ldf:
            r7 = r3
            goto L118
        Le1:
            java.lang.String r8 = "moneyfund"
            boolean r8 = og.m.h0(r7, r8, r0)
            if (r8 == 0) goto Lea
            goto Ldf
        Lea:
            boolean r8 = og.m.h0(r7, r2, r0)
            if (r8 == 0) goto Lf2
        Lf0:
            r7 = r4
            goto L118
        Lf2:
            boolean r8 = og.m.h0(r7, r1, r0)
            if (r8 == 0) goto Lf9
        Lf8:
            goto Lf0
        Lf9:
            boolean r8 = og.m.h0(r7, r13, r0)
            if (r8 == 0) goto L100
            goto Lf8
        L100:
            java.lang.String r8 = ".wallet.balance.ui."
            boolean r8 = og.m.h0(r7, r8, r0)
            if (r8 == 0) goto L109
            goto Lf0
        L109:
            java.lang.String r8 = ".plugin.mall.ui."
            boolean r7 = og.m.h0(r7, r8, r0)
            if (r7 == 0) goto L112
            goto Lf8
        L112:
            java.lang.Class r12 = r12.getSuperclass()
            goto Lc5
        L117:
            r7 = r5
        L118:
            if (r7 == 0) goto L11b
            return r7
        L11b:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r12 = r12.getStackTrace()
            r12.getClass()
            int r7 = r12.length
            r8 = r0
        L128:
            if (r8 < r7) goto L12b
            return r5
        L12b:
            r9 = r12[r8]
            java.lang.String r9 = r9.getClassName()
            r9.getClass()
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r9 = j8.b.l(r10, r9, r10)
            boolean r10 = og.m.h0(r9, r6, r0)
            if (r10 == 0) goto L141
            return r3
        L141:
            boolean r10 = og.m.h0(r9, r2, r0)
            if (r10 == 0) goto L148
            return r4
        L148:
            boolean r10 = og.m.h0(r9, r1, r0)
            if (r10 == 0) goto L14f
            return r4
        L14f:
            boolean r9 = og.m.h0(r9, r13, r0)
            if (r9 == 0) goto L156
            return r4
        L156:
            int r8 = r8 + 1
            goto L128
    }

    public static void j(android.view.View r4, android.view.View r5, int r6, b0.s r7) {
            r0 = 3
            if (r6 <= r0) goto L4
            goto L5c
        L4:
            if (r4 == r5) goto L3f
            java.lang.CharSequence r0 = r4.getContentDescription()
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L20
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L20
            r7.invoke(r0)
        L20:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L3f
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L3f
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L3f
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L3a
            r1 = r0
        L3a:
            if (r1 == 0) goto L3f
            r7.invoke(r1)
        L3f:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5c
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L4a:
            if (r1 < r0) goto L4d
            goto L5c
        L4d:
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            int r3 = r6 + 1
            j(r2, r5, r3, r7)
            int r1 = r1 + 1
            goto L4a
        L5c:
            return
    }

    public static android.view.View k(android.view.View r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.robinhood.ticker.TickerView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            return r3
        L11:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L16
            goto L1f
        L16:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L1d:
            if (r1 < r0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.view.View r2 = k(r2)
            if (r2 == 0) goto L2f
            return r2
        L2f:
            int r1 = r1 + 1
            goto L1d
    }

    public static java.lang.String l(java.lang.String r5, java.lang.String r6) {
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            int r0 = r5.length()
            if (r0 != 0) goto Lf
            goto L4a
        Lf:
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L15:
            if (r2 >= r0) goto L25
            char r3 = r5.charAt(r2)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 == 0) goto L22
            goto L26
        L22:
            int r2 = r2 + 1
            goto L15
        L25:
            r2 = -1
        L26:
            if (r2 >= 0) goto L4b
            r0 = r1
        L29:
            int r2 = r5.length()
            if (r0 >= r2) goto L4a
            char r2 = r5.charAt(r0)
            r3 = 165(0xa5, float:2.31E-43)
            if (r2 == r3) goto L3f
            r3 = 65509(0xffe5, float:9.1798E-41)
            if (r2 != r3) goto L3d
            goto L3f
        L3d:
            r2 = r1
            goto L40
        L3f:
            r2 = 1
        L40:
            if (r2 == 0) goto L47
            java.lang.String r5 = r5.concat(r6)
            return r5
        L47:
            int r0 = r0 + 1
            goto L29
        L4a:
            return r6
        L4b:
            r0 = r2
        L4c:
            int r3 = r5.length()
            if (r0 >= r3) goto L68
            char r3 = r5.charAt(r0)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 != 0) goto L65
            r4 = 44
            if (r3 == r4) goto L65
            r4 = 46
            if (r3 == r4) goto L65
            goto L68
        L65:
            int r0 = r0 + 1
            goto L4c
        L68:
            java.lang.String r1 = r5.substring(r1, r2)
            java.lang.String r5 = r5.substring(r0)
            java.lang.String r5 = wb.en.h(r1, r6, r5)
            return r5
    }

    public static boolean q(java.lang.reflect.Method r4) {
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4.getClass()
            int r0 = r4.length
            r1 = 0
            if (r0 != 0) goto Lc
            goto L2a
        Lc:
            r0 = r4[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L17
            goto L2a
        L17:
            int r0 = r4.length
            r2 = 1
            if (r0 == r2) goto L2b
            int r0 = r4.length
            r3 = 2
            if (r0 != r3) goto L2a
            r4 = r4[r2]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            return r2
    }

    public static qa.b r(java.lang.String r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            r3 = r0
        L5:
            java.lang.String r1 = "\\s+"
            java.lang.String r3 = j8.b.h(r1, r3, r0)
            int r0 = r3.length()
            if (r0 != 0) goto L12
            goto L59
        L12:
            r0 = 0
            java.util.List r1 = qa.f.f10784m
            if (r1 == 0) goto L1e
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1e
            goto L37
        L1e:
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.h0(r3, r2, r0)
            if (r2 == 0) goto L22
            qa.b r3 = qa.b.f10775i
            return r3
        L37:
            java.lang.String r1 = "零钱通"
            boolean r1 = og.m.h0(r3, r1, r0)
            if (r1 != 0) goto L5e
            java.lang.String r1 = "理财通"
            boolean r1 = og.m.h0(r3, r1, r0)
            if (r1 == 0) goto L48
            goto L5e
        L48:
            java.lang.String r1 = "零钱"
            boolean r1 = og.m.h0(r3, r1, r0)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "钱包余额"
            boolean r3 = og.m.h0(r3, r1, r0)
            if (r3 == 0) goto L59
            goto L5b
        L59:
            r3 = 0
            return r3
        L5b:
            qa.b r3 = qa.b.f10773g
            return r3
        L5e:
            qa.b r3 = qa.b.f10774h
            return r3
    }

    public static android.animation.ValueAnimator s(android.view.View r5) {
            java.lang.Class r0 = r5.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class<android.animation.ValueAnimator> r4 = android.animation.ValueAnimator.class
            java.lang.Class r3 = r3.getType()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto Lc
            goto L28
        L27:
            r1 = r2
        L28:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto L37
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r1, r5)
            boolean r0 = r5 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L37
            android.animation.ValueAnimator r5 = (android.animation.ValueAnimator) r5
            return r5
        L37:
            return r2
    }

    public final void m() {
            r9 = this;
            r8.g r0 = r9.f10785a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r1 = "com.tencent.kinda.framework.WxCrossServices"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            if (r0 == 0) goto L8e
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L63
            java.lang.Object r2 = r0.next()
            r5 = r2
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = "startLqtDetailUseCaseWithBalanceInMMProcess"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L5d
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Boolean.TYPE
            boolean r5 = gg.l.a(r5, r7)
            if (r5 == 0) goto L5d
            int r5 = r6.length
            r7 = 2
            if (r5 != r7) goto L5d
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r7 = r6[r3]
            boolean r5 = r5.isAssignableFrom(r7)
            if (r5 == 0) goto L5d
            r5 = r6[r4]
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L5d
            r3 = r4
        L5d:
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        L63:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L6a
            goto L8e
        L6a:
            java.util.Iterator r0 = r1.iterator()
            r1 = r3
        L6f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r8.i r5 = r8.i.f11631b
            qa.e r6 = new qa.e
            r7 = 0
            r6.<init>(r9, r7)
            r5.b(r2, r6)
            int r1 = r1 + 1
            goto L6f
        L89:
            if (r1 <= 0) goto L8c
            r3 = r4
        L8c:
            r9.f10795k = r3
        L8e:
            return
    }

    public final void n() {
            r9 = this;
            r8.g r0 = r9.f10785a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r1 = "com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            if (r0 == 0) goto L9b
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L70
            java.lang.Object r2 = r0.next()
            r5 = r2
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r5 = gg.l.a(r5, r7)
            if (r5 == 0) goto L6a
            int r5 = r6.length
            r7 = 7
            if (r5 != r7) goto L6a
            r5 = r6[r4]
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = "org.json.JSONObject"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L6a
            r5 = 2
            r5 = r6[r5]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            boolean r5 = gg.l.a(r5, r7)
            if (r5 == 0) goto L6a
            r5 = 3
            r5 = r6[r5]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r8)
            if (r5 == 0) goto L6a
            r5 = 4
            r5 = r6[r5]
            boolean r5 = gg.l.a(r5, r7)
            if (r5 == 0) goto L6a
            r3 = r4
        L6a:
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        L70:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L77
            goto L9b
        L77:
            java.util.Iterator r0 = r1.iterator()
            r1 = r3
        L7c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r8.i r5 = r8.i.f11631b
            qa.e r6 = new qa.e
            r7 = 1
            r6.<init>(r9, r7)
            r5.b(r2, r6)
            int r1 = r1 + 1
            goto L7c
        L96:
            if (r1 <= 0) goto L99
            r3 = r4
        L99:
            r9.f10794j = r3
        L9b:
            return
    }

    public final void o() {
            r9 = this;
            r8.g r0 = r9.f10785a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r1 = "com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            if (r0 == 0) goto Le5
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r0.next()
            r5 = r2
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r7 = r6.length
            if (r7 != 0) goto L33
            goto L3d
        L33:
            r7 = r6[r4]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L40
        L3d:
            r3 = r4
            goto Lb2
        L40:
            java.util.Set r7 = qa.f.f10783l
            java.lang.String r5 = r5.getName()
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L50
            int r5 = r6.length
            if (r5 != r3) goto L50
            goto Lb2
        L50:
            int r5 = r6.length
            r7 = 2
            if (r5 == r7) goto L58
            int r5 = r6.length
            r7 = 4
            if (r5 != r7) goto L3d
        L58:
            java.lang.String r5 = " is less than zero."
            java.lang.String r7 = "Requested element count "
            int r8 = r6.length
            int r8 = r8 - r3
            if (r8 >= 0) goto L61
            r8 = 0
        L61:
            if (r8 < 0) goto L8a
            if (r8 != 0) goto L68
            tf.t r5 = tf.t.f13167g
            goto L92
        L68:
            int r5 = r6.length
            if (r8 < r5) goto L70
            java.util.List r5 = tf.l.L0(r6)
            goto L92
        L70:
            r7 = 1
            if (r8 != r7) goto L7c
            int r5 = r5 + (-1)
            r5 = r6[r5]
            java.util.List r5 = a.a.x0(r5)
            goto L92
        L7c:
            int r7 = r5 - r8
            java.lang.Object[] r5 = tf.l.u0(r6, r7, r5)
            java.util.List r5 = java.util.Arrays.asList(r5)
            r5.getClass()
            goto L92
        L8a:
            java.lang.String r5 = eh.a.m(r8, r7, r5)
            j8.o.q(r5)
            r5 = 0
        L92:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L99
            goto Lb2
        L99:
            java.util.Iterator r5 = r5.iterator()
        L9d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r5.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Class r7 = java.lang.Boolean.TYPE
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L9d
            goto L3d
        Lb2:
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        Lb9:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc0
            goto Le5
        Lc0:
            java.util.Iterator r0 = r1.iterator()
            r1 = r4
        Lc5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r8.i r5 = r8.i.f11631b
            qa.e r6 = new qa.e
            r7 = 2
            r6.<init>(r9, r7)
            r5.b(r2, r6)
            int r1 = r1 + 1
            goto Lc5
        Ldf:
            if (r1 <= 0) goto Le2
            goto Le3
        Le2:
            r3 = r4
        Le3:
            r9.f10792h = r3
        Le5:
            return
    }

    public final void p() {
            r13 = this;
            tf.t r0 = tf.t.f13167g
            android.content.SharedPreferences r1 = r13.f10787c
            e8.b r2 = e8.b.f2358a
            r8.g r3 = r13.f10785a
            android.content.Context r4 = r3.f11620a
            java.lang.ClassLoader r5 = r3.f11622c
            r5.getClass()
            l8.i r4 = o8.k.a(r4, r5)
            java.lang.String r4 = r4.f7933h
            boolean r5 = og.m.t0(r4)
            r6 = 0
            if (r5 != 0) goto L1d
            goto L1e
        L1d:
            r4 = r6
        L1e:
            if (r4 == 0) goto L27
            java.lang.String r5 = "|fake_wallet_balance_wekit_style_v1"
            java.lang.String r4 = r4.concat(r5)
            goto L28
        L27:
            r4 = r6
        L28:
            java.lang.String r5 = ""
            if (r4 != 0) goto L2d
            r4 = r5
        L2d:
            java.lang.ClassLoader r7 = r3.f11622c
            java.lang.String r8 = "ticker_methods"
            java.util.List r7 = e8.b.f(r1, r4, r7, r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L3e:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L55
            java.lang.Object r10 = r7.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            boolean r11 = q(r11)
            if (r11 == 0) goto L3e
            r9.add(r10)
            goto L3e
        L55:
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L5c
            goto L5d
        L5c:
            r9 = r6
        L5d:
            java.lang.String r7 = "com.robinhood.ticker.TickerView"
            if (r9 == 0) goto L63
            goto L13d
        L63:
            java.lang.ClassLoader r9 = r3.f11622c
            java.lang.Class r9 = h.Hchat.utils.KavaReflector.loadClass(r7, r9)
            if (r9 == 0) goto L8f
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredMethods(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L78:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L90
            java.lang.Object r11 = r9.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            boolean r12 = q(r12)
            if (r12 == 0) goto L78
            r10.add(r11)
            goto L78
        L8f:
            r10 = r6
        L90:
            if (r10 != 0) goto L94
            r9 = r0
            goto L95
        L94:
            r9 = r10
        L95:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto La0
            r2.j(r1, r4, r8, r9)
            goto L13d
        La0:
            org.luckypray.dexkit.DexKitBridge r9 = r3.f11623d     // Catch: java.lang.Throwable -> Lf3
            ch.e r10 = new ch.e     // Catch: java.lang.Throwable -> Lf3
            r10.<init>()     // Catch: java.lang.Throwable -> Lf3
            fh.k r11 = new fh.k     // Catch: java.lang.Throwable -> Lf3
            r11.<init>()     // Catch: java.lang.Throwable -> Lf3
            r12 = 5
            r11.l0(r12, r7)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r12 = "Need to call #setCharacterLists first."
            java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> Lf3
            r11.r0(r12)     // Catch: java.lang.Throwable -> Lf3
            r10.f1666h = r11     // Catch: java.lang.Throwable -> Lf3
            hh.p r9 = r9.findMethod(r10)     // Catch: java.lang.Throwable -> Lf3
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf3
            r10.<init>()     // Catch: java.lang.Throwable -> Lf3
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lf3
        Lc8:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> Lf3
            if (r11 == 0) goto L101
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> Lf3
            hh.o r11 = (hh.o) r11     // Catch: java.lang.Throwable -> Lf3
            java.lang.ClassLoader r12 = r3.f11622c     // Catch: java.lang.Throwable -> Ldb
            java.lang.reflect.Method r11 = r11.r(r12)     // Catch: java.lang.Throwable -> Ldb
            goto Le2
        Ldb:
            r11 = move-exception
            sf.f r12 = new sf.f     // Catch: java.lang.Throwable -> Lf3
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lf3
            r11 = r12
        Le2:
            boolean r12 = r11 instanceof sf.f     // Catch: java.lang.Throwable -> Lf3
            if (r12 == 0) goto Le8
            r11 = r6
        Le8:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch: java.lang.Throwable -> Lf3
            if (r11 == 0) goto Lf5
            boolean r12 = q(r11)     // Catch: java.lang.Throwable -> Lf3
            if (r12 == 0) goto Lf5
            goto Lf6
        Lf3:
            r3 = move-exception
            goto Lfc
        Lf5:
            r11 = r6
        Lf6:
            if (r11 == 0) goto Lc8
            r10.add(r11)     // Catch: java.lang.Throwable -> Lf3
            goto Lc8
        Lfc:
            sf.f r10 = new sf.f
            r10.<init>(r3)
        L101:
            java.lang.Throwable r3 = sf.g.b(r10)
            if (r3 != 0) goto L109
            r0 = r10
            goto L112
        L109:
            java.lang.String r6 = r3.getMessage()
            java.lang.String r9 = "[Hchat:FakeWalletBalance] 定位 TickerView 金额方法失败: "
            eh.a.x(r9, r6, r3)
        L112:
            r9 = r0
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L11f
            r2.j(r1, r4, r8, r9)
            goto L13d
        L11f:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r2 = r1.edit()     // Catch: java.lang.Throwable -> L13d
            java.lang.String r1 = r1.getString(r0, r5)     // Catch: java.lang.Throwable -> L13d
            boolean r1 = gg.l.a(r1, r4)     // Catch: java.lang.Throwable -> L13d
            if (r1 != 0) goto L136
            android.content.SharedPreferences$Editor r1 = r2.clear()     // Catch: java.lang.Throwable -> L13d
            r1.putString(r0, r4)     // Catch: java.lang.Throwable -> L13d
        L136:
            android.content.SharedPreferences$Editor r0 = r2.remove(r8)     // Catch: java.lang.Throwable -> L13d
            r0.apply()     // Catch: java.lang.Throwable -> L13d
        L13d:
            r8.g r0 = r13.f10785a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r7, r0)
            java.lang.Class r1 = java.lang.Float.TYPE
            r1.getClass()
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "setTextSize"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r2, r1)
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L15d
            if (r0 != 0) goto L15d
            return
        L15d:
            java.util.Iterator r1 = r9.iterator()
            r2 = 0
            r3 = r2
        L163:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L17e
            java.lang.Object r4 = r1.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r8.i r5 = r8.i.f11631b
            c9.c2 r6 = new c9.c2
            r7 = 13
            r6.<init>(r13, r7, r4)
            r5.b(r4, r6)
            int r3 = r3 + 1
            goto L163
        L17e:
            if (r0 == 0) goto L18d
            r8.i r1 = r8.i.f11631b
            qa.e r4 = new qa.e
            r5 = 3
            r4.<init>(r13, r5)
            r1.b(r0, r4)
            int r3 = r3 + 1
        L18d:
            if (r3 <= 0) goto L190
            r2 = 1
        L190:
            r13.f10793i = r2
            return
    }
}
