package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ue implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static volatile a.Ue t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference<android.view.View> f294a;
    public android.view.View b;
    public java.lang.ref.WeakReference<android.app.Activity> c;
    public java.lang.Class<?> d;
    public boolean e;
    public int f;
    public long g;
    public boolean h;
    public volatile boolean i;
    public float j;
    public float k;
    public final android.os.Handler l;
    public final a.M2 m;
    public int n;
    public a.Ue.a o;
    public final android.os.Handler p;
    public boolean q;
    public final a.Ue.b r;
    public int s;

    public static final class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Ue f295a;
        public final /* synthetic */ android.view.View b;
        public final /* synthetic */ android.app.Activity c;

        public a(a.Ue r1, android.view.View r2, android.app.Activity r3) {
                r0 = this;
                r0.<init>()
                r0.f295a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
                r4 = this;
                a.Ue r0 = r4.f295a
                int r1 = r0.n
                int r1 = r1 + 1
                r0.n = r1
                android.view.View r1 = r4.b
                android.app.Activity r2 = r4.c
                boolean r2 = r0.d(r2, r1)
                if (r2 != 0) goto L17
                int r2 = r0.n
                r3 = 5
                if (r2 < r3) goto L2b
            L17:
                r0.e(r1)
                java.lang.ref.WeakReference<android.view.View> r1 = r0.f294a
                if (r1 == 0) goto L25
                java.lang.Object r1 = r1.get()
                android.view.View r1 = (android.view.View) r1
                goto L26
            L25:
                r1 = 0
            L26:
                if (r1 == 0) goto L2b
                r0.f()
            L2b:
                return
        }
    }

    public static final class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Ue f296a;

        public b(a.Ue r1) {
                r0 = this;
                r0.<init>()
                r0.f296a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                a.Ue r0 = r5.f296a
                boolean r1 = r0.q
                if (r1 != 0) goto L7
                return
            L7:
                android.view.View r1 = r0.b
                java.lang.ref.WeakReference<android.app.Activity> r2 = r0.c
                r3 = 0
                if (r2 == 0) goto L15
                java.lang.Object r2 = r2.get()
                android.app.Activity r2 = (android.app.Activity) r2
                goto L16
            L15:
                r2 = r3
            L16:
                if (r1 == 0) goto L3b
                if (r2 == 0) goto L3b
                android.os.IBinder r4 = r1.getWindowToken()
                if (r4 == 0) goto L3b
                java.lang.ref.WeakReference<android.view.View> r4 = r0.f294a
                if (r4 == 0) goto L2a
                java.lang.Object r3 = r4.get()
                android.view.View r3 = (android.view.View) r3
            L2a:
                if (r3 == 0) goto L38
                boolean r4 = r3.isAttachedToWindow()
                if (r4 == 0) goto L38
                int r3 = r3.getVisibility()
                if (r3 == 0) goto L3b
            L38:
                r0.d(r2, r1)
            L3b:
                android.os.Handler r0 = r0.p
                r1 = 5000(0x1388, double:2.4703E-320)
                r0.postDelayed(r5, r1)
                return
        }
    }

    public Ue() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.l = r0
            a.M2 r0 = new a.M2
            r1 = 16
            r0.<init>(r1, r2)
            r2.m = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.p = r0
            a.Ue$b r0 = new a.Ue$b
            r0.<init>(r2)
            r2.r = r0
            return
    }

    public final void a(android.app.Activity r4, android.view.View r5) {
            r3 = this;
            r3.b = r5
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.c = r0
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r1 = a.K3.a.l()
            if (r1 != 0) goto L19
            goto L21
        L19:
            boolean r1 = r0.u
            if (r1 != 0) goto L22
            boolean r0 = r0.x
            if (r0 != 0) goto L22
        L21:
            return
        L22:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "TempUnhideTrigger: attachIfNeeded (rootView="
            java.lang.String r2 = ")"
            java.lang.String r0 = a.C0487z.g(r1, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            r3.c(r4)
            boolean r0 = r3.d(r4, r5)
            if (r0 == 0) goto L46
            r3.f()
            return
        L46:
            r0 = 0
            r3.n = r0
            r3.e(r5)
            a.Ue$a r0 = new a.Ue$a
            r0.<init>(r3, r5, r4)
            r3.o = r0
            android.view.ViewTreeObserver r4 = r5.getViewTreeObserver()
            r4.addOnGlobalLayoutListener(r0)
            a.P0 r4 = new a.P0
            r0 = 15
            r4.<init>(r3, r0, r5)
            r0 = 3000(0xbb8, double:1.482E-320)
            r5.postDelayed(r4, r0)
            return
    }

    public final void b(android.view.MotionEvent r23, android.app.Activity r24) {
            r22 = this;
            r1 = r22
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r2 = a.K3.a.i()
            boolean r0 = a.K3.a.l()
            if (r0 != 0) goto L13
            goto L575
        L13:
            boolean r0 = r2.u
            if (r0 != 0) goto L1d
            boolean r0 = r2.x
            if (r0 != 0) goto L1d
            goto L575
        L1d:
            int r0 = r23.getActionMasked()
            r3 = 2
            r4 = 0
            r5 = 1
            java.lang.String r6 = ")"
            if (r0 == 0) goto L17b
            r7 = 3
            if (r0 == r5) goto L76
            if (r0 == r3) goto L43
            if (r0 == r7) goto L31
            goto L575
        L31:
            boolean r0 = r1.e
            if (r0 != 0) goto L37
            goto L575
        L37:
            r1.h = r4
            android.os.Handler r0 = r1.l
            a.M2 r2 = r1.m
            r0.removeCallbacks(r2)
            r1.e = r4
            return
        L43:
            boolean r0 = r1.e
            if (r0 != 0) goto L49
            goto L575
        L49:
            boolean r0 = r1.h
            if (r0 == 0) goto L575
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r24)
            int r0 = r0.getScaledTouchSlop()
            float r2 = r23.getX()
            float r3 = r1.j
            float r2 = r2 - r3
            float r3 = r23.getY()
            float r5 = r1.k
            float r3 = r3 - r5
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r3 = r3 + r2
            int r0 = r0 * r0
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L575
            r1.h = r4
            android.os.Handler r0 = r1.l
            a.M2 r2 = r1.m
            r0.removeCallbacks(r2)
            return
        L76:
            boolean r0 = r1.e
            if (r0 != 0) goto L7c
            goto L575
        L7c:
            r1.s = r4
            r1.h = r4
            android.os.Handler r0 = r1.l
            a.M2 r3 = r1.m
            r0.removeCallbacks(r3)
            boolean r0 = r2.u
            if (r0 == 0) goto L176
            boolean r0 = r1.i
            if (r0 != 0) goto L176
            a.jc r0 = a.K3.a.i()
            boolean r2 = r0.u
            if (r2 != 0) goto L99
            goto L176
        L99:
            int r2 = r0.w
            if (r2 <= 0) goto L9f
            long r2 = (long) r2
            goto La1
        L9f:
            r2 = 500(0x1f4, double:2.47E-321)
        La1:
            int r8 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r8 = (long) r8
            long r2 = java.lang.Math.max(r2, r8)
            long r8 = android.os.SystemClock.uptimeMillis()
            long r10 = r1.g
            long r10 = r8 - r10
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 >= 0) goto Lba
            int r10 = r1.f
            int r10 = r10 + r5
            goto Lbb
        Lba:
            r10 = r5
        Lbb:
            r1.f = r10
            r1.g = r8
            int r0 = r0.v
            if (r0 <= 0) goto Lc4
            r7 = r0
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "TempUnhideTrigger: tap count="
            r0.<init>(r8)
            r0.append(r10)
            java.lang.String r8 = "/"
            r0.append(r8)
            r0.append(r7)
            java.lang.String r8 = " (window="
            r0.append(r8)
            r0.append(r2)
            java.lang.String r2 = "ms)"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            int r0 = r1.f
            if (r0 != r7) goto L176
            r1.f = r4
            java.lang.String r0 = "TempUnhideTrigger: multi-click TRIGGERED ("
            java.lang.String r2 = " taps)"
            java.lang.String r0 = a.C0487z.c(r7, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            a.jc r0 = a.K3.a.i()
            boolean r2 = a.K3.a.l()
            if (r2 == 0) goto L176
            boolean r0 = r0.u
            if (r0 != 0) goto L112
            goto L176
        L112:
            a.x8 r0 = a.C0460x8.f762a
            a.ca$c r2 = a.C0086ca.c.f425a
            a.ca$b r3 = a.C0086ca.b.b
            a.ca$b r7 = a.C0086ca.b.f424a
            java.util.Set r7 = java.util.Collections.singleton(r7)
            java.lang.String r8 = "singleton(...)"
            a.C0193i9.d(r7, r8)
            boolean r0 = r0.c(r3, r2, r7)
            if (r0 != 0) goto L148
            a.ca$b r0 = a.C0460x8.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "TempUnhideTrigger: multi-click unhide BLOCKED (state="
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.b(r0)
            goto L176
        L148:
            java.lang.String r0 = "TempUnhideTrigger: multi-click unhide triggered"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            a.C0453x1.b(r0)
            android.content.Context r0 = a.C0435w1.p
            if (r0 != 0) goto L15a
            goto L173
        L15a:
            a.jc r2 = a.K3.a.i()
            boolean r3 = r2.R
            if (r3 == 0) goto L173
            java.lang.String r2 = r2.S
            boolean r3 = a.Be.P(r2)
            if (r3 == 0) goto L16c
            java.lang.String r2 = "刻舟求剑"
        L16c:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r4)
            r0.show()
        L173:
            a.C0366s4.a.a()
        L176:
            r1.i = r4
            r1.e = r4
            return
        L17b:
            java.lang.ref.WeakReference<android.view.View> r0 = r1.f294a
            if (r0 == 0) goto L186
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L187
        L186:
            r0 = 0
        L187:
            boolean r8 = r0 instanceof android.widget.TextView
            if (r8 == 0) goto L18f
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8 = r0
            goto L190
        L18f:
            r8 = 0
        L190:
            android.content.res.Resources r0 = r24.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r9 = r0.density
            int r10 = r0.widthPixels
            int r11 = r0.heightPixels
            float r0 = r23.getRawX()
            int r12 = (int) r0
            float r0 = r23.getRawY()
            int r13 = (int) r0
            if (r8 == 0) goto L3fa
            int r0 = r8.getVisibility()
            if (r0 != 0) goto L3fa
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L3fa
            android.text.Layout r0 = r8.getLayout()
            java.lang.String r15 = ","
            if (r0 != 0) goto L1c7
        L1be:
            r21 = r2
            r18 = r4
            r20 = r9
            r2 = 0
            goto L25c
        L1c7:
            int r16 = r0.getLineCount()
            if (r16 > 0) goto L1ce
            goto L1be
        L1ce:
            float r7 = r0.getLineLeft(r4)
            float r14 = r0.getLineRight(r4)
            r17 = r5
            int r5 = r0.getLineTop(r4)
            int r0 = r0.getLineBottom(r4)
            int r18 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r18 <= 0) goto L1be
            if (r0 > r5) goto L1e7
            goto L1be
        L1e7:
            r18 = r4
            int[] r4 = new int[r3]
            r8.getLocationOnScreen(r4)
            r19 = r4[r18]
            int r20 = r8.getTotalPaddingLeft()
            int r20 = r20 + r19
            float r19 = r7 + r14
            r21 = r0
            float r0 = (float) r3
            float r0 = r19 / r0
            int r0 = (int) r0
            int r0 = r20 + r0
            r19 = r4[r17]
            int r20 = r8.getTotalPaddingTop()
            int r20 = r20 + r19
            int r5 = r5 + r21
            int r5 = r5 / r3
            int r5 = r5 + r20
            if (r0 < 0) goto L21d
            r3 = 20000(0x4e20, float:2.8026E-41)
            if (r0 > r3) goto L21d
            if (r5 < 0) goto L21d
            if (r5 <= r3) goto L218
            goto L21d
        L218:
            r21 = r2
            r20 = r9
            goto L257
        L21d:
            r3 = r4[r18]
            r4 = r4[r17]
            r20 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r21 = r2
            java.lang.String r2 = "TempUnhideTrigger: suspicious geometry loc=("
            r9.<init>(r2)
            r9.append(r3)
            r9.append(r15)
            r9.append(r4)
            java.lang.String r2 = ") lineLR=("
            r9.append(r2)
            r9.append(r7)
            r9.append(r15)
            r9.append(r14)
            r9.append(r6)
            java.lang.String r2 = r9.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = r17
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            a.C0453x1.e(r2)
        L257:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r0, r5)
        L25c:
            if (r2 == 0) goto L2a2
            int r0 = r2.x
            if (r0 < 0) goto L26a
            if (r0 > r10) goto L26a
            int r3 = r2.y
            if (r3 < 0) goto L26a
            if (r3 <= r11) goto L2a2
        L26a:
            int r2 = r2.y
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TempUnhideTrigger: center("
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r15)
            r3.append(r2)
            java.lang.String r0 = ") out of screen("
            r3.append(r0)
            r3.append(r10)
            java.lang.String r0 = "x"
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = "), fallback"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.e(r0)
            r2 = 0
        L2a2:
            if (r2 != 0) goto L31b
            r3 = 2
            int[] r4 = new int[r3]
            r8.getLocationOnScreen(r4)     // Catch: java.lang.Throwable -> L2ad
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2ad
            goto L2b2
        L2ad:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L2b2:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r5 = r0 instanceof a.C0447wd.a
            if (r5 == 0) goto L2b9
            r0 = r3
        L2b9:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2f7
            r0 = r4[r18]
            if (r0 < 0) goto L2f7
            if (r0 > r10) goto L2f7
            r17 = 1
            r0 = r4[r17]
            if (r0 < 0) goto L2f7
            if (r0 > r11) goto L2f7
            int r0 = r8.getWidth()
            if (r0 <= 0) goto L2f7
            int r0 = r8.getHeight()
            if (r0 <= 0) goto L2f7
            android.graphics.Point r2 = new android.graphics.Point
            r0 = r4[r18]
            int r3 = r8.getWidth()
            r19 = 2
            int r3 = r3 / 2
            int r3 = r3 + r0
            r17 = 1
            r0 = r4[r17]
            int r4 = r8.getHeight()
            int r4 = r4 / 2
            int r4 = r4 + r0
            r2.<init>(r3, r4)
            goto L31b
        L2f7:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r3 = r8.getGlobalVisibleRect(r0)
            if (r3 == 0) goto L31b
            int r3 = r0.width()
            if (r3 <= 0) goto L31b
            int r3 = r0.height()
            if (r3 <= 0) goto L31b
            android.graphics.Point r2 = new android.graphics.Point
            int r3 = r0.centerX()
            int r0 = r0.centerY()
            r2.<init>(r3, r0)
        L31b:
            if (r2 != 0) goto L34f
            java.lang.String r0 = "TempUnhideTrigger: title center unresolvable, fallback to top-band"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.e(r0)
            a.qf r0 = a.C0342qf.f660a
            float r2 = r23.getRawY()
            r0.getClass()
            android.content.res.Resources r0 = r24.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r3 = 80
            float r3 = (float) r3
            float r3 = r3 * r0
            int r0 = (int) r3
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L34a
        L348:
            r0 = 1
            goto L34c
        L34a:
            r0 = r18
        L34c:
            r3 = r0
            goto L41e
        L34f:
            android.text.Layout r0 = r8.getLayout()
            if (r0 == 0) goto L379
            int r3 = r0.getLineCount()
            if (r3 <= 0) goto L368
            r3 = r18
            float r4 = r0.getLineRight(r3)
            float r0 = r0.getLineLeft(r3)
            float r4 = r4 - r0
            int r0 = (int) r4
            goto L369
        L368:
            r0 = 0
        L369:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L371
            r7 = r3
            goto L372
        L371:
            r7 = 0
        L372:
            if (r7 == 0) goto L379
            int r0 = r7.intValue()
            goto L38c
        L379:
            float r0 = r8.getTextSize()
            java.lang.CharSequence r3 = r8.getText()
            if (r3 == 0) goto L388
            int r3 = r3.length()
            goto L389
        L388:
            r3 = 2
        L389:
            float r3 = (float) r3
            float r0 = r0 * r3
            int r0 = (int) r0
        L38c:
            r3 = 8
            float r3 = (float) r3
            float r3 = r3 * r20
            int r3 = (int) r3
            r4 = 48
            float r4 = (float) r4
            float r4 = r4 * r20
            int r4 = (int) r4
            r5 = 160(0xa0, float:2.24E-43)
            float r5 = (float) r5
            float r5 = r5 * r20
            int r5 = (int) r5
            r19 = 2
            int r3 = r3 * 2
            int r3 = r3 + r0
            int r0 = a.Oc.C(r3, r4, r5)
            int r3 = r0 / 2
            int r4 = r2.x
            int r5 = r4 - r3
            if (r12 < r5) goto L3be
            int r5 = r4 + r3
            if (r12 > r5) goto L3be
            int r5 = r2.y
            int r7 = r5 - r3
            if (r13 < r7) goto L3be
            int r5 = r5 + r3
            if (r13 > r5) goto L3be
            r3 = 1
            goto L3bf
        L3be:
            r3 = 0
        L3bf:
            if (r3 != 0) goto L41e
            int r2 = r2.y
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "TempUnhideTrigger: square center=("
            r5.<init>(r7)
            r5.append(r4)
            r5.append(r15)
            r5.append(r2)
            java.lang.String r2 = ") side="
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = " touch("
            r5.append(r0)
            r5.append(r12)
            r5.append(r15)
            r5.append(r13)
            java.lang.String r0 = ") outside"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            goto L41e
        L3fa:
            r21 = r2
            a.qf r0 = a.C0342qf.f660a
            float r2 = r23.getRawY()
            r0.getClass()
            android.content.res.Resources r0 = r24.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r3 = 80
            float r3 = (float) r3
            float r3 = r3 * r0
            int r0 = (int) r3
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L41b
            goto L348
        L41b:
            r0 = 0
            goto L34c
        L41e:
            a.Ne r0 = a.Ne.f187a
            android.view.View r2 = r1.b
            java.lang.Class<?> r4 = r1.d
            r0.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.List<a.Oe> r0 = a.Ne.b
            java.util.Iterator r7 = r0.iterator()
            r8 = 0
            r9 = 0
        L434:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L491
            java.lang.Object r0 = r7.next()
            r10 = r0
            a.Oe r10 = (a.Oe) r10
            r11 = r24
            a.Ne$a r0 = r10.a(r11, r2, r4)     // Catch: java.lang.Throwable -> L448
            goto L44d
        L448:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L44d:
            a.Ne$a r12 = a.Ne.a.c
            boolean r13 = r0 instanceof a.C0447wd.a
            if (r13 == 0) goto L454
            r0 = r12
        L454:
            a.Ne$a r0 = (a.Ne.a) r0
            int r12 = r0.ordinal()
            if (r12 == 0) goto L46d
            r13 = 1
            if (r12 == r13) goto L469
            r13 = 2
            if (r12 != r13) goto L463
            goto L470
        L463:
            a.Ob r0 = new a.Ob
            r0.<init>()
            throw r0
        L469:
            r13 = 2
            int r9 = r9 + 1
            goto L470
        L46d:
            r13 = 2
            int r8 = r8 + 1
        L470:
            java.lang.String r10 = r10.b()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            java.lang.String r10 = "="
            r12.append(r10)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r5.append(r0)
            goto L434
        L491:
            if (r8 <= 0) goto L495
            if (r9 == 0) goto L497
        L495:
            if (r8 <= r9) goto L499
        L497:
            r0 = 1
            goto L49a
        L499:
            r0 = 0
        L49a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "TabDetector: "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = "→ "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = " (yes="
            r2.append(r4)
            r2.append(r8)
            java.lang.String r4 = " no="
            r2.append(r4)
            r2.append(r9)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r13 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r13)
            a.C0453x1.b(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "TempUnhideTrigger: DOWN areaHit="
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r4 = " tabHit="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r13 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r13)
            a.C0453x1.b(r2)
            if (r3 == 0) goto L4f7
            if (r0 == 0) goto L4f7
            r0 = 1
            goto L4f8
        L4f7:
            r0 = 0
        L4f8:
            r1.e = r0
            if (r0 != 0) goto L4fe
            goto L575
        L4fe:
            int r0 = r1.s
            r13 = 1
            int r0 = r0 + r13
            r1.s = r0
            r2 = 5
            if (r0 < r2) goto L51d
            java.lang.String r2 = "TempUnhideTrigger: "
            java.lang.String r3 = " consecutive DOWN without UP — touch may be intercepted by system"
            java.lang.String r0 = a.C0487z.c(r0, r2, r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
            a.C0453x1.e(r0)
            r3 = 0
            r1.s = r3
        L51d:
            float r0 = r23.getRawX()
            int r0 = (int) r0
            float r2 = r23.getRawY()
            int r2 = (int) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TempUnhideTrigger: DOWN on WeChat title (x="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ",y="
            r3.append(r0)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            r3 = 0
            r1.i = r3
            r2 = r21
            boolean r0 = r2.x
            if (r0 == 0) goto L575
            r13 = 1
            r1.h = r13
            float r0 = r23.getX()
            r1.j = r0
            float r0 = r23.getY()
            r1.k = r0
            android.os.Handler r0 = r1.l
            a.M2 r3 = r1.m
            r0.removeCallbacks(r3)
            int r0 = r2.y
            if (r0 <= 0) goto L56c
            long r2 = (long) r0
            goto L56e
        L56c:
            r2 = 800(0x320, double:3.953E-321)
        L56e:
            android.os.Handler r0 = r1.l
            a.M2 r4 = r1.m
            r0.postDelayed(r4, r2)
        L575:
            return
    }

    public final void c(android.app.Activity r4) {
            r3 = this;
            android.view.Window r0 = r4.getWindow()
            if (r0 != 0) goto L7
            goto L12
        L7:
            android.view.Window$Callback r1 = r0.getCallback()
            if (r1 != 0) goto Le
            goto L12
        Le:
            boolean r2 = r1 instanceof a.WindowCallbackC0485yf
            if (r2 == 0) goto L13
        L12:
            return
        L13:
            a.yf r2 = new a.yf
            r2.<init>(r1, r3, r4)
            r0.setCallback(r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.c = r0
            java.lang.String r4 = "TempUnhideTrigger: TouchInterceptingCallback installed"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r0 = 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            a.C0453x1.b(r4)
            return
    }

    public final boolean d(android.app.Activity r4, android.view.View r5) {
            r3 = this;
            a.qf r0 = a.C0342qf.f660a
            r0.getClass()
            android.widget.TextView r4 = a.C0342qf.a(r4, r5)
            r5 = 1
            if (r4 != 0) goto L1b
            java.lang.String r4 = "TempUnhideTrigger: Title view not found this pass"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            a.C0453x1.b(r4)
            r4 = 0
            return r4
        L1b:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f294a = r0
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.CharSequence r4 = r4.getText()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TempUnhideTrigger: Title resolved: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " text='"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = "'"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            a.C0453x1.b(r4)
            return r5
    }

    public final void e(android.view.View r2) {
            r1 = this;
            a.Ue$a r0 = r1.o
            if (r0 == 0) goto L15
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()     // Catch: java.lang.Throwable -> Le
            r2.removeOnGlobalLayoutListener(r0)     // Catch: java.lang.Throwable -> Le
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r2 = move-exception
            a.C0465xd.a(r2)
        L12:
            r2 = 0
            r1.o = r2
        L15:
            return
    }

    public final void f() {
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
            android.os.Handler r0 = r4.p
            a.Ue$b r1 = r4.r
            r0.removeCallbacks(r1)
            r2 = 5000(0x1388, double:2.4703E-320)
            r0.postDelayed(r1, r2)
            java.lang.String r0 = "TempUnhideTrigger: watchdog started (5s interval)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r10) {
            r9 = this;
            java.lang.String r0 = "TempUnhideTrigger: Window.Callback approach installed on "
            java.lang.String r2 = "session"
            a.C0193i9.e(r10, r2)
            a.Ue.t = r9
            java.lang.String r2 = "com.tencent.mm.ui.LauncherUI"
            java.lang.ClassLoader r3 = r10.f136a     // Catch: java.lang.Throwable -> L24
            java.lang.Class r2 = a.A1.b(r3, r2)     // Catch: java.lang.Throwable -> L24
            r9.d = r2     // Catch: java.lang.Throwable -> L24
            r7 = 1
            if (r2 != 0) goto L26
            java.lang.String r0 = "TempUnhideTrigger: LauncherUI class NOT FOUND — touch interception disabled (no fallback to Activity)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch: java.lang.Throwable -> L24
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r0 = move-exception
            goto L74
        L26:
            r3 = r2
            java.lang.String r2 = "F_tempUnhide"
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "onPostResume"
            r5 = 0
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L24
            a.Te r6 = new a.Te     // Catch: java.lang.Throwable -> L24
            r8 = 0
            r6.<init>(r9, r8)     // Catch: java.lang.Throwable -> L24
            r1 = r10
            a.J8.d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "F_tempUnhide"
            java.lang.Class<?> r1 = r9.d     // Catch: java.lang.Throwable -> L24
            a.C0193i9.b(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "onConfigurationChanged"
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            java.lang.Class[] r5 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L24
            a.Te r6 = new a.Te     // Catch: java.lang.Throwable -> L24
            r1 = 1
            r6.<init>(r9, r1)     // Catch: java.lang.Throwable -> L24
            r1 = r10
            a.J8.d(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L24
            java.lang.Class<?> r1 = r9.d     // Catch: java.lang.Throwable -> L24
            a.C0193i9.b(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch: java.lang.Throwable -> L24
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L24
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L24
            goto L78
        L74:
            a.wd$a r0 = a.C0465xd.a(r0)
        L78:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L8c
            java.lang.String r1 = "TempUnhideTrigger: hook FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.a(r0)
        L8c:
            return
    }
}
