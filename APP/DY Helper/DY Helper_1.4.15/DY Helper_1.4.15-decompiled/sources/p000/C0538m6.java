package p000;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0538m6 implements p000.lx1, p000.InterfaceC0676p6 {

    /* JADX INFO: renamed from: ι */
    public static volatile p000.C0538m6 f6963;

    /* JADX INFO: renamed from: κ */
    public static final java.lang.Object f6964 = null;

    /* JADX INFO: renamed from: λ */
    public static p000.C0538m6 f6965;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6966;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f6967;

    /* JADX INFO: renamed from: η */
    public java.lang.Object f6968;

    /* JADX INFO: renamed from: θ */
    public java.lang.Object f6969;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.C0538m6.f6964 = r0
            return
    }

    public C0538m6(int r3) {
            r2 = this;
            r2.f6966 = r3
            switch(r3) {
                case 6: goto L3f;
                case 11: goto L2b;
                case 15: goto L12;
                default: goto L5;
            }
        L5:
            r2.<init>()
            zz1 r3 = new zz1
            r0 = 4
            r1 = 0
            r3.<init>(r0, r1)
            r2.f6969 = r3
            return
        L12:
            r2.<init>()
            java.util.WeakHashMap r3 = new java.util.WeakHashMap
            r3.<init>()
            r2.f6967 = r3
            java.util.WeakHashMap r3 = new java.util.WeakHashMap
            r3.<init>()
            r2.f6968 = r3
            java.util.WeakHashMap r3 = new java.util.WeakHashMap
            r3.<init>()
            r2.f6969 = r3
            return
        L2b:
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            e42 r0 = p000.AbstractC1021yh.f12628
            r3.<init>(r0)
            r2.f6967 = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f6968 = r3
            return
        L3f:
            r2.<init>()
            n r3 = new n
            r0 = 11
            r3.<init>(r0)
            r2.f6967 = r3
            n r3 = new n
            r3.<init>(r0)
            r2.f6968 = r3
            n r3 = new n
            r3.<init>(r0)
            r2.f6969 = r3
            return
    }

    public C0538m6(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.f6966 = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.f6969 = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.f6968 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f6967 = r2
            return
    }

    public C0538m6(android.content.Context r2, android.content.res.TypedArray r3) {
            r1 = this;
            r0 = 12
            r1.f6966 = r0
            r1.<init>()
            r1.f6969 = r2
            r1.f6967 = r3
            return
    }

    public C0538m6(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r0 = 13
            r1.f6966 = r0
            r1.<init>()
            f62 r0 = new f62
            r0.<init>()
            r1.f6968 = r0
            r1.f6969 = r2
            r1.f6967 = r3
            return
    }

    public C0538m6(p000.dl1 r3) {
            r2 = this;
            r0 = 10
            r2.f6966 = r0
            r2.<init>()
            j7 r0 = new j7
            r1 = 0
            r0.<init>(r1)
            r2.f6967 = r0
            b8 r0 = new b8
            r0.<init>(r1)
            r2.f6968 = r0
            p3 r0 = new p3
            r1 = 28
            r0.<init>(r2, r1, r3)
            r2.f6969 = r0
            return
    }

    public C0538m6(p000.C0282fe r2) {
            r1 = this;
            r0 = 4
            r1.f6966 = r0
            r1.<init>()
            r1.f6969 = r2
            n r2 = new n
            r2.<init>(r0, r1)
            r1.f6967 = r2
            return
    }

    public C0538m6(p000.C0379i0 r3) {
            r2 = this;
            r0 = 3
            r2.f6966 = r0
            r2.<init>()
            r2.f6967 = r3
            java.lang.Object r0 = r3.f4859
            lr r0 = (p000.C0522lr) r0
            r0.getClass()
            rk1 r1 = new rk1
            r1.<init>(r0)
            r2.f6968 = r1
            java.lang.Object r3 = r3.f4860
            kr r3 = (p000.C0485kr) r3
            r3.getClass()
            qk1 r0 = new qk1
            r0.<init>(r3)
            r2.f6969 = r0
            return
    }

    public C0538m6(p000.C0379i0 r8, p000.C0381i2 r9, p000.C0185cr r10, java.util.Set r11) {
            r7 = this;
            r0 = 7
            r7.f6966 = r0
            r7.<init>()
            r7.f6967 = r9
            r7.f6968 = r8
            r7.f6969 = r10
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto L13
            goto L3c
        L13:
            java.util.Iterator r8 = r11.iterator()
        L17:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L3c
            java.lang.Object r9 = r8.next()
            int[] r9 = (int[]) r9
            java.lang.String r1 = new java.lang.String
            r10 = 0
            int r11 = r9.length
            r1.<init>(r9, r10, r11)
            uy r6 = new uy
            r9 = 0
            r6.<init>(r1, r9)
            int r3 = r1.length()
            r4 = 1
            r5 = 1
            r2 = 0
            r0 = r7
            r0.m3764(r1, r2, r3, r4, r5, r6)
            goto L17
        L3c:
            return
    }

    public C0538m6(java.lang.Runnable r2) {
            r1 = this;
            r0 = 8
            r1.f6966 = r0
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f6969 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f6967 = r0
            r1.f6968 = r2
            return
    }

    public C0538m6(java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            r1 = this;
            r0 = 9
            r1.f6966 = r0
            r1.<init>()
            r1.f6967 = r2
            r1.f6968 = r3
            r1.f6969 = r4
            return
    }

    public C0538m6(p000.n62 r2, p000.C0538m6 r3) {
            r1 = this;
            r0 = 14
            r1.f6966 = r0
            r1.<init>()
            r1.f6967 = r2
            r1.f6968 = r3
            java.lang.Object r2 = r2.f7443
            r1.f6969 = r2
            return
    }

    public C0538m6(p000.rk0 r2) {
            r1 = this;
            r2 = 1
            r1.f6966 = r2
            r1.<init>()
            v r2 = new v
            r0 = 30
            r2.<init>(r0)
            r1.f6967 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6968 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6969 = r2
            rk0 r2 = new rk0
            r0 = 6
            r2.<init>(r0, r1)
            return
    }

    public C0538m6(p000.sl1 r2) {
            r1 = this;
            r0 = 5
            r1.f6966 = r0
            r1.<init>()
            r1.f6967 = r2
            rf r2 = new rf
            r0 = 0
            r2.<init>(r0)
            r1.f6968 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6969 = r2
            return
    }

    public C0538m6(p000.yp0 r2) {
            r1 = this;
            r0 = 16
            r1.f6966 = r0
            r1.<init>()
            r1.f6967 = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6968 = r0
            r1.f6969 = r2
            return
    }

    /* JADX INFO: renamed from: Δ */
    public static p000.C0538m6 m3751(android.content.Context r2) {
            m6 r0 = p000.C0538m6.f6963
            if (r0 != 0) goto L19
            java.lang.Object r0 = p000.C0538m6.f6964
            monitor-enter(r0)
            m6 r1 = p000.C0538m6.f6963     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            m6 r1 = new m6     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            p000.C0538m6.f6963 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            m6 r2 = p000.C0538m6.f6963
            return r2
    }

    /* JADX INFO: renamed from: Μ */
    public static p000.C0538m6 m3752(android.content.Context r2, android.util.AttributeSet r3, int[] r4, int r5) {
            m6 r0 = new m6
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r4, r5, r1)
            r0.<init>(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m3753(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
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
            java.lang.Class<l62> r2 = p000.l62.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            l62[] r1 = (p000.l62[]) r1
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

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f6966
            switch(r0) {
                case 5: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f6968
            rf r1 = (p000.C0759rf) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.lang.Object r2 = r2.f6969
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: Α */
    public android.graphics.drawable.Drawable m3754(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f6967
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L1a
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L1a
            java.lang.Object r2 = r2.f6969
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r2 = p000.ln0.m3603(r2, r1)
            return r2
        L1a:
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)
            return r2
    }

    /* JADX INFO: renamed from: Β */
    public android.graphics.drawable.Drawable m3755(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f6967
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.f6967
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L2a
            j5 r0 = p000.C0419j5.m2862()
            java.lang.Object r3 = r3.f6969
            android.content.Context r3 = (android.content.Context) r3
            monitor-enter(r0)
            tn1 r1 = r0.f5322     // Catch: java.lang.Throwable -> L27
            r2 = 1
            android.graphics.drawable.Drawable r3 = r1.m5725(r3, r4, r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r3
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
        L2a:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: Γ */
    public android.graphics.Typeface m3756(int r13, int r14, p000.C1009y5 r15) {
            r12 = this;
            java.lang.Object r0 = r12.f6967
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r5 = r0.getResourceId(r13, r1)
            r13 = 0
            if (r5 != 0) goto Ld
            goto L2b
        Ld:
            java.lang.Object r0 = r12.f6968
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L1a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r12.f6968 = r0
        L1a:
            java.lang.Object r0 = r12.f6969
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r12 = r12.f6968
            android.util.TypedValue r12 = (android.util.TypedValue) r12
            java.lang.ThreadLocal r0 = p000.wn1.f11768
            boolean r0 = r2.isRestricted()
            if (r0 == 0) goto L2c
        L2b:
            return r13
        L2c:
            android.content.res.Resources r4 = r2.getResources()
            r0 = 1
            r4.getValue(r5, r12, r0)
            java.lang.String r1 = "ResourcesCompat"
            java.lang.CharSequence r0 = r12.string
            if (r0 == 0) goto Le8
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r6.startsWith(r0)
            r11 = -3
            if (r0 != 0) goto L4c
            r15.m6834(r11)
            goto Le7
        L4c:
            int r0 = r12.assetCookie
            kw0 r3 = p000.i62.f4929
            java.lang.String r0 = p000.i62.m2625(r4, r5, r6, r0, r14)
            java.lang.Object r0 = r3.m3421(r0)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r3 = 21
            if (r0 == 0) goto L72
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            ii0 r13 = new ii0
            r13.<init>(r15, r3, r0)
            r12.post(r13)
            r13 = r0
            goto Le7
        L72:
            java.lang.String r0 = r6.toLowerCase()     // Catch: java.io.IOException -> Laa org.xmlpull.v1.XmlPullParserException -> Lad
            java.lang.String r7 = ".xml"
            boolean r0 = r0.endsWith(r7)     // Catch: java.io.IOException -> Laa org.xmlpull.v1.XmlPullParserException -> Lad
            if (r0 == 0) goto Lb0
            android.content.res.XmlResourceParser r0 = r4.getXml(r5)     // Catch: java.io.IOException -> Laa org.xmlpull.v1.XmlPullParserException -> Lad
            u50 r3 = p000.h62.m2437(r0, r4)     // Catch: java.io.IOException -> Laa org.xmlpull.v1.XmlPullParserException -> Lad
            if (r3 != 0) goto L9a
            java.lang.String r12 = "Failed to find font-family tag"
            android.util.Log.e(r1, r12)     // Catch: java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L96
            r15.m6834(r11)     // Catch: java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L96
            goto Le7
        L92:
            r0 = move-exception
            r12 = r0
            r9 = r15
            goto Ld1
        L96:
            r0 = move-exception
            r12 = r0
            r9 = r15
            goto Ldb
        L9a:
            int r7 = r12.assetCookie     // Catch: java.io.IOException -> Laa org.xmlpull.v1.XmlPullParserException -> Lad
            r10 = 1
            r8 = r14
            r9 = r15
            android.graphics.Typeface r13 = p000.i62.m2623(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            goto Le7
        La4:
            r0 = move-exception
        La5:
            r12 = r0
            goto Ld1
        La7:
            r0 = move-exception
        La8:
            r12 = r0
            goto Ldb
        Laa:
            r0 = move-exception
            r9 = r15
            goto La5
        Lad:
            r0 = move-exception
            r9 = r15
            goto La8
        Lb0:
            r8 = r14
            r9 = r15
            int r12 = r12.assetCookie     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            android.graphics.Typeface r12 = p000.i62.m2624(r4, r5, r6, r12, r8)     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            if (r12 == 0) goto Lcd
            android.os.Handler r14 = new android.os.Handler     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            android.os.Looper r15 = android.os.Looper.getMainLooper()     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            r14.<init>(r15)     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            ii0 r15 = new ii0     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            r15.<init>(r9, r3, r12)     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            r14.post(r15)     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
        Lcb:
            r13 = r12
            goto Le7
        Lcd:
            r9.m6834(r11)     // Catch: java.io.IOException -> La4 org.xmlpull.v1.XmlPullParserException -> La7
            goto Lcb
        Ld1:
            java.lang.String r14 = "Failed to read xml resource "
            java.lang.String r14 = r14.concat(r6)
            android.util.Log.e(r1, r14, r12)
            goto Le4
        Ldb:
            java.lang.String r14 = "Failed to parse xml resource "
            java.lang.String r14 = r14.concat(r6)
            android.util.Log.e(r1, r14, r12)
        Le4:
            r9.m6834(r11)
        Le7:
            return r13
        Le8:
            android.content.res.Resources$NotFoundException r13 = new android.content.res.Resources$NotFoundException
            java.lang.String r14 = r4.getResourceName(r5)
            java.lang.String r15 = java.lang.Integer.toHexString(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Resource \""
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = "\" ("
            r0.append(r14)
            r0.append(r15)
            java.lang.String r14 = ") is not a Font: "
            r0.append(r14)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
    }

    /* JADX INFO: renamed from: Ε */
    public p000.np0 m3757() {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            fe r0 = (p000.C0282fe) r0
            ee r0 = r0.f3906
            np0 r0 = r0.f3515
            return r0
    }

    /* JADX INFO: renamed from: Ζ */
    public long m3758() {
            r2 = this;
            java.lang.Object r2 = r2.f6969
            fe r2 = (p000.C0282fe) r2
            ee r2 = r2.f3906
            long r0 = r2.f3517
            return r0
    }

    /* JADX INFO: renamed from: Η */
    public android.view.View m3759(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.f6967
            sl1 r0 = (p000.sl1) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f9954
            android.view.View r0 = r0.getChildAt(r1)
            return r0
    }

    /* JADX INFO: renamed from: Θ */
    public int m3760() {
            r0 = this;
            java.lang.Object r0 = r0.f6967
            sl1 r0 = (p000.sl1) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f9954
            int r0 = r0.getChildCount()
            return r0
    }

    /* JADX INFO: renamed from: Ι */
    public boolean m3761(java.lang.CharSequence r7, int r8, int r9, p000.k62 r10) {
            r6 = this;
            int r0 = r10.f5778
            r0 = r0 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L64
            java.lang.Object r6 = r6.f6969
            cr r6 = (p000.C0185cr) r6
            g01 r0 = r10.m3167()
            r4 = 8
            int r4 = r0.m7040(r4)
            if (r4 == 0) goto L23
            java.lang.Object r5 = r0.f12860
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r0 = r0.f12857
            int r4 = r4 + r0
            r5.getShort(r4)
        L23:
            r6.getClass()
            java.lang.ThreadLocal r0 = p000.C0185cr.f2722
            java.lang.Object r4 = r0.get()
            if (r4 != 0) goto L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r0.set(r4)
        L36:
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r0.setLength(r2)
        L3f:
            if (r8 >= r9) goto L4b
            char r4 = r7.charAt(r8)
            r0.append(r4)
            int r8 = r8 + 1
            goto L3f
        L4b:
            android.text.TextPaint r6 = r6.f2723
            java.lang.String r7 = r0.toString()
            int r8 = p000.h91.f4641
            boolean r6 = r6.hasGlyph(r7)
            int r7 = r10.f5778
            r7 = r7 & 4
            if (r6 == 0) goto L60
            r6 = r7 | 2
            goto L62
        L60:
            r6 = r7 | 1
        L62:
            r10.f5778 = r6
        L64:
            int r6 = r10.f5778
            r6 = r6 & 3
            if (r6 != r1) goto L6b
            return r3
        L6b:
            return r2
    }

    /* JADX INFO: renamed from: Κ */
    public boolean m3762() {
            r2 = this;
            java.lang.Object r0 = r2.f6967
            n r0 = (p000.C0568n) r0
            java.lang.Object r0 = r0.f7336
            qx1 r0 = (p000.qx1) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.f6969
            n r0 = (p000.C0568n) r0
            java.lang.Object r0 = r0.f7336
            qx1 r0 = (p000.qx1) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r2.f6968
            n r2 = (p000.C0568n) r2
            java.lang.Object r2 = r2.f7336
            qx1 r2 = (p000.qx1) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2d
            r2 = r1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r2 = r2 ^ r1
            return r2
    }

    /* JADX INFO: renamed from: Λ */
    public boolean m3763() {
            r2 = this;
            java.lang.Object r0 = r2.f6967
            c02 r0 = (p000.c02) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.f6969
            if (r0 != r1) goto L1b
            java.lang.Object r2 = r2.f6968
            m6 r2 = (p000.C0538m6) r2
            if (r2 == 0) goto L19
            boolean r2 = r2.m3763()
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: Ν */
    public java.lang.Object m3764(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, p000.InterfaceC0852ty r22) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            vy r5 = new vy
            java.lang.Object r6 = r0.f6968
            i0 r6 = (p000.C0379i0) r6
            java.lang.Object r6 = r6.f4859
            i01 r6 = (p000.i01) r6
            r5.<init>(r6)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 0
            r8 = 1
            r9 = r6
            r10 = r7
            r11 = r8
            r6 = r18
        L22:
            r7 = r6
        L23:
            r12 = 2
            if (r6 >= r2) goto Lce
            if (r10 >= r3) goto Lce
            if (r11 == 0) goto Lce
            i01 r13 = r5.f11478
            android.util.SparseArray r13 = r13.f4863
            if (r13 != 0) goto L32
            r13 = 0
            goto L38
        L32:
            java.lang.Object r13 = r13.get(r9)
            i01 r13 = (p000.i01) r13
        L38:
            int r14 = r5.f11476
            r15 = 3
            if (r14 == r12) goto L4c
            if (r13 != 0) goto L44
            r5.m6285()
        L42:
            r13 = r8
            goto L8c
        L44:
            r5.f11476 = r12
            r5.f11478 = r13
            r5.f11481 = r8
        L4a:
            r13 = r12
            goto L8c
        L4c:
            if (r13 == 0) goto L56
            r5.f11478 = r13
            int r13 = r5.f11481
            int r13 = r13 + r8
            r5.f11481 = r13
            goto L4a
        L56:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L5f
            r5.m6285()
            goto L42
        L5f:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L65
            goto L4a
        L65:
            i01 r13 = r5.f11478
            k62 r14 = r13.f4864
            if (r14 == 0) goto L88
            int r14 = r5.f11481
            if (r14 != r8) goto L82
            boolean r13 = r5.m6286()
            if (r13 == 0) goto L7e
            i01 r13 = r5.f11478
            r5.f11479 = r13
            r5.m6285()
        L7c:
            r13 = r15
            goto L8c
        L7e:
            r5.m6285()
            goto L42
        L82:
            r5.f11479 = r13
            r5.m6285()
            goto L7c
        L88:
            r5.m6285()
            goto L42
        L8c:
            r5.f11480 = r9
            if (r13 == r8) goto Lbc
            if (r13 == r12) goto Lad
            if (r13 == r15) goto L95
            goto L23
        L95:
            if (r21 != 0) goto La1
            i01 r12 = r5.f11479
            k62 r12 = r12.f4864
            boolean r12 = r0.m3761(r1, r7, r6, r12)
            if (r12 != 0) goto L22
        La1:
            i01 r11 = r5.f11479
            k62 r11 = r11.f4864
            boolean r11 = r4.mo3983(r1, r7, r6, r11)
            int r10 = r10 + 1
            goto L22
        Lad:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto Lb9
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        Lb9:
            r6 = r12
            goto L23
        Lbc:
            int r6 = java.lang.Character.codePointAt(r1, r7)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r7
            if (r6 >= r2) goto L22
            int r7 = java.lang.Character.codePointAt(r1, r6)
            r9 = r7
            goto L22
        Lce:
            int r2 = r5.f11476
            if (r2 != r12) goto Lf9
            i01 r2 = r5.f11478
            k62 r2 = r2.f4864
            if (r2 == 0) goto Lf9
            int r2 = r5.f11481
            if (r2 > r8) goto Le2
            boolean r2 = r5.m6286()
            if (r2 == 0) goto Lf9
        Le2:
            if (r10 >= r3) goto Lf9
            if (r11 == 0) goto Lf9
            if (r21 != 0) goto Lf2
            i01 r2 = r5.f11478
            k62 r2 = r2.f4864
            boolean r0 = r0.m3761(r1, r7, r6, r2)
            if (r0 != 0) goto Lf9
        Lf2:
            i01 r0 = r5.f11478
            k62 r0 = r0.f4864
            r4.mo3983(r1, r7, r6, r0)
        Lf9:
            java.lang.Object r0 = r4.mo3980()
            return r0
    }

    /* JADX INFO: renamed from: Ξ */
    public void m3765() {
            r0 = this;
            java.lang.Object r0 = r0.f6967
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r0.recycle()
            return
    }

    /* JADX INFO: renamed from: Ο */
    public void m3766(java.util.ArrayList r9) {
            r8 = this;
            int r0 = r9.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L3b
            java.lang.Object r2 = r9.get(r1)
            o r2 = (p000.AbstractC0605o) r2
            r2.getClass()
            java.lang.Object r3 = r8.f6967
            v r3 = (p000.C0891v) r3
            java.lang.Object r4 = r3.f11045
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r2.getClass()
            int r5 = r3.f11044
            r6 = 0
        L1e:
            if (r6 >= r5) goto L2d
            r7 = r4[r6]
            if (r7 == r2) goto L27
            int r6 = r6 + 1
            goto L1e
        L27:
            java.lang.String r2 = "Already in the pool!"
            p000.C1080.m7279(r2)
            goto L38
        L2d:
            int r5 = r3.f11044
            int r6 = r4.length
            if (r5 >= r6) goto L38
            r4[r5] = r2
            int r5 = r5 + 1
            r3.f11044 = r5
        L38:
            int r1 = r1 + 1
            goto L5
        L3b:
            r9.clear()
            return
    }

    /* JADX INFO: renamed from: Π */
    public void m3767(java.lang.Object r6) {
            r5 = this;
            long r0 = p000.i91.m2680()
            long r2 = p000.h42.f4573
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            r5.f6969 = r6
            return
        Ld:
            java.lang.Object r2 = r5.f6968
            monitor-enter(r2)
            java.lang.Object r3 = r5.f6967     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L2d
            e42 r3 = (p000.e42) r3     // Catch: java.lang.Throwable -> L2d
            int r4 = r3.m1842(r0)     // Catch: java.lang.Throwable -> L2d
            if (r4 >= 0) goto L2f
            java.lang.Object r5 = r5.f6967     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5     // Catch: java.lang.Throwable -> L2d
            e42 r6 = r3.m1843(r0, r6)     // Catch: java.lang.Throwable -> L2d
            r5.set(r6)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return
        L2d:
            r5 = move-exception
            goto L35
        L2f:
            java.lang.Object[] r5 = r3.f3408     // Catch: java.lang.Throwable -> L2d
            r5[r4] = r6     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return
        L35:
            monitor-exit(r2)
            throw r5
    }

    /* JADX INFO: renamed from: Ρ */
    public void m3768(p000.InterfaceC0209de r1) {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            fe r0 = (p000.C0282fe) r0
            ee r0 = r0.f3906
            r0.f3516 = r1
            return
    }

    /* JADX INFO: renamed from: Σ */
    public void m3769(p000.InterfaceC1031yr r1) {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            fe r0 = (p000.C0282fe) r0
            ee r0 = r0.f3906
            r0.f3514 = r1
            return
    }

    /* JADX INFO: renamed from: Τ */
    public void m3770(p000.np0 r1) {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            fe r0 = (p000.C0282fe) r0
            ee r0 = r0.f3906
            r0.f3515 = r1
            return
    }

    /* JADX INFO: renamed from: Υ */
    public void m3771(long r1) {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            fe r0 = (p000.C0282fe) r0
            ee r0 = r0.f3906
            r0.f3517 = r1
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: α */
    public void mo3772(int r1, java.lang.Object r2) {
            r0 = this;
            yp0 r2 = (p000.yp0) r2
            java.lang.Object r0 = r0.f6969
            yp0 r0 = (p000.yp0) r0
            r0.m6971(r1, r2)
            return
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: β */
    public p000.rx1 mo2556() {
            r0 = this;
            java.lang.Object r0 = r0.f6968
            rk1 r0 = (p000.rk1) r0
            return r0
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: γ */
    public void mo3773(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.f6968
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r2.f6969
            r0.add(r1)
            r2.f6969 = r3
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: δ */
    public void mo3774() {
            r7 = this;
            java.lang.Object r7 = r7.f6969
            yp0 r7 = (p000.yp0) r7
            k31 r0 = r7.f12733
            boolean r1 = r7.m6977()
            if (r1 != 0) goto L11
            java.lang.String r1 = "onReuse is only expected on attached node"
            p000.am0.m177(r1)
        L11:
            kq0 r1 = r7.f12735
            r2 = 0
            if (r1 == 0) goto L19
            r1.m3407(r2)
        L19:
            r7.f12761 = r2
            boolean r1 = r7.f12742
            if (r1 == 0) goto L22
            r7.f12742 = r2
            goto L4c
        L22:
            k31 r1 = r7.f12733
            q22 r1 = r1.f5728
            r3 = r1
        L27:
            if (r3 == 0) goto L33
            boolean r4 = r3.f8784
            if (r4 == 0) goto L30
            r3.mo4651()
        L30:
            q01 r3 = r3.f8775
            goto L27
        L33:
            r3 = r1
        L34:
            if (r3 == 0) goto L40
            boolean r4 = r3.f8784
            if (r4 == 0) goto L3d
            r3.mo4653()
        L3d:
            q01 r3 = r3.f8775
            goto L34
        L40:
            if (r1 == 0) goto L4c
            boolean r3 = r1.f8784
            if (r3 == 0) goto L49
            r1.mo4650()
        L49:
            q01 r1 = r1.f8775
            goto L40
        L4c:
            int r1 = r7.f12744
            androidx.compose.ui.platform.AndroidComposeView r3 = r7.f12756
            if (r3 == 0) goto L5b
            ol1 r3 = r3.getRectManager()
            if (r3 == 0) goto L5b
            r3.m4253(r7)
        L5b:
            java.util.concurrent.atomic.AtomicInteger r3 = p000.yr1.f12770
            r4 = 1
            int r3 = r3.addAndGet(r4)
            r7.f12744 = r3
            androidx.compose.ui.platform.AndroidComposeView r3 = r7.f12756
            if (r3 == 0) goto L78
            n11 r5 = r3.getLayoutNodes()
            r5.m3941(r1)
            n11 r3 = r3.getLayoutNodes()
            int r5 = r7.f12744
            r3.m3942(r5, r7)
        L78:
            q01 r3 = r0.f5729
        L7a:
            if (r3 == 0) goto L82
            r3.mo4649()
            q01 r3 = r3.f8776
            goto L7a
        L82:
            r0.m3145()
            r3 = 8
            boolean r0 = r0.m3144(r3)
            if (r0 == 0) goto L90
            r7.m6975()
        L90:
            p000.yp0.m6969(r7)
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.f12756
            if (r0 == 0) goto Lc4
            k0 r0 = r0.f893
            if (r0 == 0) goto Lc4
            androidx.compose.ui.platform.AndroidComposeView r3 = r0.f5683
            y21 r5 = r0.f5681
            o11 r0 = r0.f5687
            boolean r6 = r0.m4155(r1)
            if (r6 == 0) goto Laa
            r5.m6815(r3, r1, r2)
        Laa:
            xr1 r1 = r7.m7007()
            if (r1 == 0) goto Lc4
            b21 r1 = r1.f12268
            is1 r2 = p000.fs1.f4114
            boolean r1 = r1.m690(r2)
            if (r1 != r4) goto Lc4
            int r1 = r7.f12744
            r0.m4151(r1)
            int r0 = r7.f12744
            r5.m6815(r3, r0, r4)
        Lc4:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.f12756
            if (r0 == 0) goto Ld1
            ol1 r0 = r0.getRectManager()
            if (r0 == 0) goto Ld1
            r0.m4252(r7)
        Ld1:
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: ε */
    public /* bridge */ /* synthetic */ void mo3775(int r1, java.lang.Object r2) {
            r0 = this;
            yp0 r2 = (p000.yp0) r2
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: ζ */
    public void mo3776() {
            r0 = this;
            java.lang.Object r0 = r0.f6967
            yp0 r0 = (p000.yp0) r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.f12756
            if (r0 == 0) goto Lb
            r0.m394()
        Lb:
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: η */
    public void mo3777(int r1, int r2, int r3) {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            yp0 r0 = (p000.yp0) r0
            r0.m6980(r1, r2, r3)
            return
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: θ */
    public java.lang.Object mo3778() {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            return r0
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: ι */
    public void mo3779(int r1, int r2) {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            yp0 r0 = (p000.yp0) r0
            r0.m6985(r1, r2)
            return
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: λ */
    public p000.iw1 mo2564() {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            qk1 r0 = (p000.qk1) r0
            return r0
    }

    @Override // p000.InterfaceC0676p6
    /* JADX INFO: renamed from: μ */
    public void mo3780() {
            r2 = this;
            java.lang.Object r0 = r2.f6968
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            r2.f6969 = r0
            return
    }

    /* JADX INFO: renamed from: ν */
    public void m3781(p000.yp0 r4, p000.qn0 r5) {
            r3 = this;
            java.lang.Object r0 = r3.f6967
            n r0 = (p000.C0568n) r0
            java.lang.Object r1 = r3.f6968
            n r1 = (p000.C0568n) r1
            java.lang.Object r3 = r3.f6969
            n r3 = (p000.C0568n) r3
            int r5 = r5.ordinal()
            if (r5 == 0) goto L3e
            r2 = 1
            if (r5 == r2) goto L37
            r2 = 2
            if (r5 == r2) goto L2b
            r0 = 3
            if (r5 != r0) goto L27
            yp0 r5 = r4.f12750
            if (r5 == 0) goto L23
            r3.m3926(r4)
            return
        L23:
            r1.m3926(r4)
            return
        L27:
            p000.C1080.m7272()
            return
        L2b:
            yp0 r5 = r4.f12750
            if (r5 == 0) goto L33
            r3.m3926(r4)
            return
        L33:
            r0.m3926(r4)
            return
        L37:
            r1.m3926(r4)
            r3.m3926(r4)
            return
        L3e:
            r0.m3926(r4)
            r3.m3926(r4)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public void m3782() {
            r1 = this;
            java.lang.Object r0 = r1.f6968
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.lang.Object r0 = r1.f6967
            r1.f6969 = r0
            java.lang.Object r1 = r1.f6967
            yp0 r1 = (p000.yp0) r1
            r1.m6984()
            return
    }

    /* JADX INFO: renamed from: π */
    public void m3783(android.os.Bundle r7) {
            r6 = this;
            java.lang.Object r0 = r6.f6968
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Object r1 = r6.f6969
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131689501(0x7f0f001d, float:1.900802E38)
            java.lang.String r1 = r1.getString(r2)
            if (r7 == 0) goto L60
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L59
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L59
            java.util.Set r3 = r7.keySet()     // Catch: java.lang.ClassNotFoundException -> L59
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.ClassNotFoundException -> L59
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.ClassNotFoundException -> L59
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.next()     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassNotFoundException -> L59
            r5 = 0
            java.lang.String r5 = r7.getString(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L59
            boolean r5 = r1.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L59
            if (r5 == 0) goto L1e
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.Class<xl0> r5 = p000.xl0.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            if (r5 == 0) goto L1e
            r0.add(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            goto L1e
        L45:
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.ClassNotFoundException -> L59
        L49:
            boolean r0 = r7.hasNext()     // Catch: java.lang.ClassNotFoundException -> L59
            if (r0 == 0) goto L60
            java.lang.Object r0 = r7.next()     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L59
            r6.m3784(r0, r2)     // Catch: java.lang.ClassNotFoundException -> L59
            goto L49
        L59:
            r6 = move-exception
            pm r7 = new pm
            r7.<init>(r6)
            throw r7
        L60:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public java.lang.Object m3784(java.lang.Class r6, java.util.HashSet r7) {
            r5 = this;
            java.lang.Object r0 = r5.f6967
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "Cannot initialize "
            boolean r2 = p000.o52.m4212()
            if (r2 == 0) goto L13
            java.lang.String r2 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L8a
            p000.e81.m1872(r2)     // Catch: java.lang.Throwable -> L8a
        L13:
            boolean r2 = r7.contains(r6)     // Catch: java.lang.Throwable -> L8a
            if (r2 != 0) goto L6f
            boolean r1 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r1 != 0) goto L67
            r7.add(r6)     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            java.lang.reflect.Constructor r2 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L60
            xl0 r1 = (p000.xl0) r1     // Catch: java.lang.Throwable -> L60
            java.util.List r2 = r1.mo461()     // Catch: java.lang.Throwable -> L60
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L51
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L60
        L3b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L60
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L60
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L3b
            r5.m3784(r3, r7)     // Catch: java.lang.Throwable -> L60
            goto L3b
        L51:
            java.lang.Object r5 = r5.f6969     // Catch: java.lang.Throwable -> L60
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r1.mo462(r5)     // Catch: java.lang.Throwable -> L60
            r7.remove(r6)     // Catch: java.lang.Throwable -> L60
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L60
            goto L6b
        L60:
            r5 = move-exception
            pm r6 = new pm     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8a
            throw r6     // Catch: java.lang.Throwable -> L8a
        L67:
            java.lang.Object r5 = r0.get(r6)     // Catch: java.lang.Throwable -> L8a
        L6b:
            android.os.Trace.endSection()
            return r5
        L6f:
            java.lang.String r5 = r6.getName()     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L8a
            r6.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = ". Cycle detected."
            r6.append(r5)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L8a
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8a
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
    }

    /* JADX INFO: renamed from: σ */
    public int m3785(int r3, int r4) {
            r2 = this;
            java.lang.Object r2 = r2.f6969
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
        L8:
            if (r4 >= r0) goto L16
            java.lang.Object r1 = r2.get(r4)
            o r1 = (p000.AbstractC0605o) r1
            r1.getClass()
            int r4 = r4 + 1
            goto L8
        L16:
            return r3
    }

    /* JADX INFO: renamed from: τ */
    public java.lang.Object m3786() {
            r4 = this;
            long r0 = p000.i91.m2680()
            long r2 = p000.h42.f4573
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            java.lang.Object r4 = r4.f6969
            return r4
        Ld:
            java.lang.Object r4 = r4.f6967
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            java.lang.Object r4 = r4.get()
            e42 r4 = (p000.e42) r4
            int r0 = r4.m1842(r0)
            if (r0 < 0) goto L22
            java.lang.Object[] r4 = r4.f3408
            r4 = r4[r0]
            return r4
        L22:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: υ */
    public p000.InterfaceC0209de m3787() {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            fe r0 = (p000.C0282fe) r0
            ee r0 = r0.f3906
            de r0 = r0.f3516
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public android.view.View m3788(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.f6967
            sl1 r0 = (p000.sl1) r0
            java.lang.Object r4 = r4.f6968
            rf r4 = (p000.C0759rf) r4
            if (r5 >= 0) goto Lb
            goto L29
        Lb:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f9954
            int r1 = r1.getChildCount()
            r2 = r5
        L12:
            if (r2 >= r1) goto L29
            int r3 = r4.m5081(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L27
        L1e:
            boolean r5 = r4.m5082(r2)
            if (r5 == 0) goto L2a
            int r2 = r2 + 1
            goto L1e
        L27:
            int r2 = r2 + r3
            goto L12
        L29:
            r2 = -1
        L2a:
            androidx.recyclerview.widget.RecyclerView r4 = r0.f9954
            android.view.View r4 = r4.getChildAt(r2)
            return r4
    }

    /* JADX INFO: renamed from: χ */
    public int m3789() {
            r1 = this;
            java.lang.Object r0 = r1.f6967
            sl1 r0 = (p000.sl1) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f9954
            int r0 = r0.getChildCount()
            java.lang.Object r1 = r1.f6969
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ψ */
    public android.content.res.ColorStateList m3790(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f6967
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L1c
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r2.f6969
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r2 = p000.ln0.m3600(r2, r1)
            if (r2 == 0) goto L1c
            return r2
        L1c:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r3)
            return r2
    }

    /* JADX INFO: renamed from: ω */
    public p000.InterfaceC1031yr m3791() {
            r0 = this;
            java.lang.Object r0 = r0.f6969
            fe r0 = (p000.C0282fe) r0
            ee r0 = r0.f3906
            yr r0 = r0.f3514
            return r0
    }
}
