package p000;

/* JADX INFO: renamed from: mj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0551mj {

    /* JADX INFO: renamed from: α */
    public static final p000.h22 f7171 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f7172 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f7173 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f7174 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Set f7175 = null;

    /* JADX INFO: renamed from: ζ */
    public static volatile android.content.SharedPreferences f7176;

    /* JADX INFO: renamed from: η */
    public static final p000.SharedPreferencesOnSharedPreferenceChangeListenerC0361hj f7177 = null;

    /* JADX INFO: renamed from: θ */
    public static volatile p000.C0514lj f7178;

    /* JADX INFO: renamed from: ι */
    public static final java.lang.Object f7179 = null;

    /* JADX INFO: renamed from: κ */
    public static volatile p000.C0397ij f7180;

    static {
            o7 r0 = new o7
            r1 = 18
            r0.<init>(r1)
            h22 r1 = new h22
            r1.<init>(r0)
            p000.AbstractC0551mj.f7171 = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.AbstractC0551mj.f7172 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.AbstractC0551mj.f7173 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.AbstractC0551mj.f7174 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.AbstractC0551mj.f7175 = r0
            java.lang.String r6 = "comment_bg_image_blur_enabled"
            java.lang.String r7 = "comment_bg_image_blur_radius"
            java.lang.String r1 = "comment_bg_mode"
            java.lang.String r2 = "comment_bg_color"
            java.lang.String r3 = "comment_bg_image_uri"
            java.lang.String r4 = "comment_bg_cropped_uri"
            java.lang.String r5 = "comment_bg_image_alpha"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            p000.AbstractC0312g7.m2263(r0)
            hj r0 = new hj
            r0.<init>()
            p000.AbstractC0551mj.f7177 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.AbstractC0551mj.f7179 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m3842(android.view.ViewGroup r40, boolean r41) {
            r1 = r40
            android.content.Context r0 = r1.getContext()
            if (r0 != 0) goto L9
            goto L1d
        L9:
            boolean r2 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1a
            android.content.Context r2 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L16
            goto L17
        L16:
            r0 = r2
        L17:
            p000.ui1.m5896(r0)     // Catch: java.lang.Throwable -> L1d
        L1a:
            m3848()     // Catch: java.lang.Throwable -> L1d
        L1d:
            java.util.Set r0 = p000.AbstractC0551mj.f7175
            r0.add(r1)
            java.lang.String r0 = ""
            java.lang.String r2 = "#FF1A1A2E"
            java.lang.String r3 = "comment_bg_mode"
            r4 = 0
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L32
            int r3 = r5.getInt(r3, r4)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r3 = r4
        L33:
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L3a
            if (r3 == r5) goto L3a
            r3 = r4
        L3a:
            java.lang.String r7 = "comment_bg_color"
            java.lang.String r7 = p000.ui1.m5893(r7, r2)
            boolean r8 = p000.q02.m4671(r7)
            if (r8 == 0) goto L47
            goto L48
        L47:
            r2 = r7
        L48:
            java.lang.String r7 = "comment_bg_cropped_uri"
            java.lang.String r7 = p000.ui1.m5893(r7, r0)
            java.lang.String r8 = "comment_bg_image_uri"
            java.lang.String r0 = p000.ui1.m5893(r8, r0)
            boolean r8 = p000.q02.m4671(r7)
            if (r8 == 0) goto L5b
            r7 = r0
        L5b:
            java.lang.String r0 = "comment_bg_image_alpha"
            r8 = 100
            android.content.SharedPreferences r9 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L68
            int r0 = r9.getInt(r0, r8)     // Catch: java.lang.Throwable -> L68
            goto L69
        L68:
            r0 = r8
        L69:
            int r9 = p000.j81.m2906(r0, r4, r8)
            java.lang.String r0 = "comment_bg_image_blur_enabled"
            boolean r10 = p000.ui1.m5887(r0, r4)
            java.lang.String r0 = "comment_bg_image_blur_radius"
            r11 = 23
            android.content.SharedPreferences r12 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L7f
            int r11 = r12.getInt(r0, r11)     // Catch: java.lang.Throwable -> L7f
        L7f:
            r12 = 25
            int r11 = p000.j81.m2906(r11, r6, r12)
            int r0 = r1.getWidth()
            int r13 = r1.getMeasuredWidth()
            int r0 = m3861(r0, r13)
            int r13 = r1.getHeight()
            int r14 = r1.getMeasuredHeight()
            int r13 = m3861(r13, r14)
            r14 = 8
            r17 = 0
            if (r0 <= 0) goto La5
            if (r13 > 0) goto Lab
        La5:
            r16 = r12
            r18 = 0
            goto L1c6
        Lab:
            r18 = 0
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>(r4, r4, r0, r13)
            r16 = r12
            android.view.View r12 = m3852(r1)
            boolean r5 = r1 instanceof android.widget.LinearLayout
            if (r5 == 0) goto Lc0
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            goto Lc2
        Lc0:
            r5 = r17
        Lc2:
            if (r5 == 0) goto Lc9
            int r5 = r5.getOrientation()
            goto Lca
        Lc9:
            r5 = r6
        Lca:
            if (r12 == 0) goto L112
            int r6 = r12.getVisibility()
            if (r6 == r14) goto L112
            android.graphics.Rect r6 = m3844(r12, r1)
            boolean r12 = m3857(r6)
            if (r12 != 0) goto L112
            if (r5 != 0) goto Lf4
            int r5 = r6.left
            int r12 = r0 / 2
            if (r5 > r12) goto Lec
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r6.right
            r5.<init>(r6, r4, r0, r13)
            goto L109
        Lec:
            android.graphics.Rect r5 = new android.graphics.Rect
            int r0 = r6.left
            r5.<init>(r4, r4, r0, r13)
            goto L109
        Lf4:
            int r5 = r6.top
            int r12 = r13 / 2
            if (r5 > r12) goto L102
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r6.bottom
            r5.<init>(r4, r6, r0, r13)
            goto L109
        L102:
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r6.top
            r5.<init>(r4, r4, r0, r6)
        L109:
            boolean r0 = m3857(r5)
            if (r0 != 0) goto L112
            r15 = r5
            goto L1cb
        L112:
            android.view.View r0 = m3852(r1)
            int r5 = r15.width()
            long r5 = (long) r5
            int r12 = r15.height()
            long r12 = (long) r12
            long r5 = r5 * r12
            int r12 = r1.getChildCount()
            r22 = -9223372036854775808
            r13 = r4
            r24 = r17
        L12a:
            if (r13 >= r12) goto L1b6
            android.view.View r4 = r1.getChildAt(r13)
            if (r4 != 0) goto L138
        L132:
            r29 = r5
            r28 = r15
            goto L1a9
        L138:
            if (r4 == r0) goto L132
            boolean r26 = m3858(r13, r4, r1)
            if (r26 != 0) goto L132
            int r8 = r4.getVisibility()
            if (r8 == r14) goto L132
            android.graphics.Rect r4 = m3844(r4, r1)
            boolean r8 = m3857(r4)
            if (r8 != 0) goto L132
            int r8 = r4.width()
            r28 = r15
            long r14 = (long) r8
            int r8 = r4.height()
            r29 = r5
            r6 = r4
            long r4 = (long) r8
            long r14 = r14 * r4
            int r4 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r4 <= 0) goto L1a9
            int r4 = (r29 > r18 ? 1 : (r29 == r18 ? 0 : -1))
            if (r4 <= 0) goto L17a
            r4 = 95
            long r4 = (long) r4
            long r4 = r4 * r29
            r31 = r4
            r8 = 100
            long r4 = (long) r8
            long r4 = r31 / r4
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 >= 0) goto L17a
            long r14 = r14 + r29
        L17a:
            int r4 = r6.width()
            int r5 = r28.width()
            int r5 = r5 * 70
            r26 = 100
            int r5 = r5 / 100
            r8 = 4
            if (r4 < r5) goto L18f
            long r4 = (long) r8
            long r4 = r29 / r4
            long r14 = r14 + r4
        L18f:
            int r4 = r6.height()
            int r5 = r28.height()
            int r5 = r5 * 25
            int r5 = r5 / 100
            if (r4 < r5) goto L1a1
            long r4 = (long) r8
            long r4 = r29 / r4
            long r14 = r14 + r4
        L1a1:
            int r4 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r4 <= 0) goto L1a9
            r24 = r6
            r22 = r14
        L1a9:
            int r13 = r13 + 1
            r15 = r28
            r5 = r29
            r4 = 0
            r8 = 100
            r14 = 8
            goto L12a
        L1b6:
            r28 = r15
            if (r24 == 0) goto L1c3
            boolean r0 = m3857(r24)
            if (r0 != 0) goto L1c3
            r15 = r24
            goto L1cb
        L1c3:
            r15 = r28
            goto L1cb
        L1c6:
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
        L1cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r4 = "|"
            r0.append(r4)
            r0.append(r2)
            r0.append(r4)
            r0.append(r7)
            r0.append(r4)
            r0.append(r9)
            r0.append(r4)
            r0.append(r10)
            r0.append(r4)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            int r4 = r15.left
            int r5 = r15.top
            int r6 = r15.right
            int r8 = r15.bottom
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r0 = "|"
            r12.append(r0)
            r12.append(r4)
            java.lang.String r0 = ","
            r12.append(r0)
            r12.append(r5)
            java.lang.String r0 = ","
            r12.append(r0)
            r12.append(r6)
            java.lang.String r0 = ","
            r12.append(r0)
            r12.append(r8)
            java.lang.String r4 = r12.toString()
            r5 = 2114784002(0x7e0d0b02, float:4.6869576E37)
            java.lang.Object r0 = r1.getTag(r5)
            boolean r6 = r0 instanceof java.lang.String
            if (r6 == 0) goto L239
            java.lang.String r0 = (java.lang.String) r0
            goto L23b
        L239:
            r0 = r17
        L23b:
            if (r41 != 0) goto L244
            boolean r0 = p000.ln0.m3626(r0, r4)
            if (r0 == 0) goto L244
            goto L286
        L244:
            r6 = 1
            if (r3 == r6) goto L252
            r6 = 2
            if (r3 != r6) goto L24b
            goto L253
        L24b:
            m3863(r1)
            r1.setTag(r5, r4)
            return
        L252:
            r6 = 2
        L253:
            if (r3 != r6) goto L262
            boolean r0 = p000.q02.m4671(r7)
            if (r0 == 0) goto L262
            m3863(r1)
            r1.setTag(r5, r4)
            return
        L262:
            boolean r0 = m3857(r15)
            if (r0 == 0) goto L287
            r0 = 2114784003(0x7e0d0b03, float:4.686958E37)
            java.lang.Object r2 = r1.getTag(r0)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L278
            goto L286
        L278:
            r1.setTag(r0, r3)
            gj r0 = new gj
            r2 = 3
            r0.<init>(r1, r2)
            r2 = 80
            r1.postDelayed(r0, r2)
        L286:
            return
        L287:
            int r6 = r15.width()
            int r8 = r15.height()
            java.lang.String r0 = "comment_panel_height_px"
            java.lang.String r12 = "comment_panel_width_px"
            r13 = 100
            if (r6 < r13) goto L2d1
            if (r8 >= r13) goto L29a
            goto L2d1
        L29a:
            r13 = 10000(0x2710, float:1.4013E-41)
            if (r6 > r13) goto L2d1
            r13 = 20000(0x4e20, float:2.8026E-41)
            if (r8 <= r13) goto L2a3
            goto L2d1
        L2a3:
            android.content.SharedPreferences r13 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2af
            r14 = 0
            int r25 = r13.getInt(r12, r14)     // Catch: java.lang.Throwable -> L2b0
            r13 = r25
            goto L2b1
        L2af:
            r14 = 0
        L2b0:
            r13 = r14
        L2b1:
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2ba
            int r5 = r5.getInt(r0, r14)     // Catch: java.lang.Throwable -> L2ba
            goto L2bb
        L2ba:
            r5 = 0
        L2bb:
            int r13 = r13 - r6
            int r13 = java.lang.Math.abs(r13)
            r14 = 2
            if (r13 > r14) goto L2cb
            int r5 = r5 - r8
            int r5 = java.lang.Math.abs(r5)
            if (r5 > r14) goto L2cb
            goto L2d1
        L2cb:
            p000.ui1.m5873(r12, r6)
            p000.ui1.m5873(r0, r8)
        L2d1:
            android.view.View r0 = m3852(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r12 = r1.getChildCount()
            r13 = 0
        L2df:
            if (r13 >= r12) goto L383
            android.view.View r14 = r1.getChildAt(r13)
            if (r14 != 0) goto L2f1
        L2e7:
            r41 = r0
            r23 = r2
        L2eb:
            r28 = r12
            r29 = r13
            goto L379
        L2f1:
            if (r14 == r0) goto L2e7
            boolean r23 = m3858(r13, r14, r1)
            if (r23 != 0) goto L2e7
            r41 = r0
            int r0 = r14.getVisibility()
            r23 = r2
            r2 = 8
            if (r0 == r2) goto L2eb
            android.graphics.Rect r0 = m3844(r14, r1)
            boolean r24 = m3857(r0)
            if (r24 == 0) goto L310
            goto L2eb
        L310:
            boolean r24 = m3857(r15)
            if (r24 == 0) goto L317
            goto L2eb
        L317:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r0)
            boolean r24 = r2.intersect(r15)
            if (r24 != 0) goto L323
            goto L2eb
        L323:
            r24 = r0
            int r0 = r2.width()
            r28 = r12
            r29 = r13
            long r12 = (long) r0
            int r0 = r2.height()
            r30 = r12
            long r12 = (long) r0
            long r12 = r12 * r30
            int r0 = r24.width()
            r30 = r12
            long r12 = (long) r0
            int r0 = r24.height()
            r32 = r12
            long r12 = (long) r0
            long r12 = r12 * r32
            int r0 = r15.width()
            r32 = r12
            long r12 = (long) r0
            int r0 = r15.height()
            r34 = r12
            long r12 = (long) r0
            long r12 = r12 * r34
            int r0 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r0 > 0) goto L35c
            goto L379
        L35c:
            r0 = 15
            r34 = r12
            long r12 = (long) r0
            long r32 = r32 * r12
            r36 = r12
            r2 = 100
            long r12 = (long) r2
            long r32 = r32 / r12
            int r0 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r0 >= 0) goto L376
            long r32 = r34 * r36
            long r32 = r32 / r12
            int r0 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r0 < 0) goto L379
        L376:
            r5.add(r14)
        L379:
            int r13 = r29 + 1
            r0 = r41
            r2 = r23
            r12 = r28
            goto L2df
        L383:
            r23 = r2
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L38e
            r5.add(r1)
        L38e:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r5)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L3a6
            m3863(r1)
            r2 = 2114784002(0x7e0d0b02, float:4.6869576E37)
            r1.setTag(r2, r4)
            return
        L3a6:
            m3863(r1)
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
        L3ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L87e
            java.lang.Object r0 = r2.next()
            r12 = r0
            android.view.View r12 = (android.view.View) r12
            android.content.Context r13 = r1.getContext()
            r13.getClass()
            r14 = 1
            if (r3 == r14) goto L67e
            r14 = 2
            if (r3 == r14) goto L3e0
            r24 = r2
            r16 = r3
            r31 = r4
            r27 = r5
            r28 = r6
            r29 = r8
            r1 = r9
            r2 = r11
            r32 = r12
            r33 = r15
            r4 = r17
        L3dc:
            r8 = 100
            goto L747
        L3e0:
            boolean r0 = p000.q02.m4671(r7)
            if (r0 == 0) goto L3fd
            r24 = r2
            r16 = r3
            r31 = r4
            r27 = r5
            r28 = r6
            r29 = r8
            r34 = r9
            r2 = r11
            r32 = r12
            r33 = r15
        L3f9:
            r0 = r17
            goto L650
        L3fd:
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L425
            java.lang.String r14 = r0.getScheme()     // Catch: java.lang.Throwable -> L425
            if (r14 == 0) goto L413
            r24 = r0
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L425
            java.lang.String r0 = r14.toLowerCase(r0)     // Catch: java.lang.Throwable -> L425
            r0.getClass()     // Catch: java.lang.Throwable -> L425
            goto L417
        L413:
            r24 = r0
            r0 = r17
        L417:
            java.lang.String r14 = "file"
            boolean r14 = p000.ln0.m3626(r0, r14)     // Catch: java.lang.Throwable -> L425
            if (r14 == 0) goto L43a
            java.lang.String r0 = r24.getPath()     // Catch: java.lang.Throwable -> L425
            if (r0 != 0) goto L42b
        L425:
            r24 = r2
            r14 = r3
            r2 = r18
            goto L44e
        L42b:
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L425
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L425
            long r27 = r14.lastModified()     // Catch: java.lang.Throwable -> L425
        L434:
            r24 = r2
            r14 = r3
            r2 = r27
            goto L44e
        L43a:
            if (r0 == 0) goto L444
            java.lang.String r14 = ""
            boolean r0 = r0.equals(r14)     // Catch: java.lang.Throwable -> L425
            if (r0 == 0) goto L425
        L444:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L425
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L425
            long r27 = r0.lastModified()     // Catch: java.lang.Throwable -> L425
            goto L434
        L44e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            if (r6 <= 0) goto L455
            goto L457
        L455:
            r0 = r17
        L457:
            if (r0 == 0) goto L461
            int r0 = r0.intValue()
        L45d:
            r27 = r5
            r5 = r0
            goto L46c
        L461:
            android.content.res.Resources r0 = r13.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            goto L45d
        L46c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            if (r8 <= 0) goto L473
            goto L475
        L473:
            r0 = r17
        L475:
            if (r0 == 0) goto L47f
            int r0 = r0.intValue()
        L47b:
            r28 = r6
            r6 = r0
            goto L48a
        L47f:
            android.content.res.Resources r0 = r13.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            goto L47b
        L48a:
            if (r10 == 0) goto L5e6
            boolean r0 = p000.q02.m4671(r7)
            if (r0 == 0) goto L4a4
            r31 = r4
            r29 = r8
            r34 = r9
            r37 = r11
            r32 = r12
            r16 = r14
            r33 = r15
        L4a0:
            r0 = r17
            goto L5e2
        L4a4:
            r29 = r16
            r16 = r14
            r14 = r29
            r29 = r8
            r8 = 1
            int r0 = p000.j81.m2906(r11, r8, r14)
            if (r5 >= r8) goto L4b5
            r14 = r8
            goto L4b6
        L4b5:
            r14 = r5
        L4b6:
            if (r6 >= r8) goto L4bc
            r8 = 1
        L4b9:
            r31 = r4
            goto L4be
        L4bc:
            r8 = r6
            goto L4b9
        L4be:
            java.io.File r4 = new java.io.File
            java.io.File r1 = r13.getFilesDir()
            r32 = r12
            java.lang.String r12 = "comment_bg_blur_cache"
            r4.<init>(r1, r12)
            r4.mkdirs()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r12 = "|"
            r1.append(r12)
            r1.append(r2)
            r1.append(r12)
            r1.append(r14)
            r1.append(r12)
            r1.append(r8)
            r1.append(r12)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r12 = "SHA-256"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r12)
            r33 = r15
            java.nio.charset.Charset r15 = p000.AbstractC0547mf.f7105
            byte[] r1 = r1.getBytes(r15)
            r1.getClass()
            byte[] r1 = r12.digest(r1)
            r1.getClass()
            java.lang.String r12 = ""
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r34 = r9
            int r9 = r1.length
            r35 = r1
            r1 = 0
            r36 = 0
        L51e:
            if (r1 >= r9) goto L54e
            r37 = r35[r1]
            r38 = r1
            r39 = r9
            r1 = 1
            int r9 = r36 + 1
            if (r9 <= r1) goto L52e
            r15.append(r12)
        L52e:
            java.lang.Byte r21 = java.lang.Byte.valueOf(r37)
            r36 = r9
            java.lang.String r9 = "%02x"
            r37 = r11
            java.lang.Object[] r11 = new java.lang.Object[]{r21}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r1)
            java.lang.String r1 = java.lang.String.format(r9, r11)
            r15.append(r1)
            int r1 = r38 + 1
            r11 = r37
            r9 = r39
            goto L51e
        L54e:
            r37 = r11
            r15.append(r12)
            java.lang.String r1 = r15.toString()
            r9 = 32
            java.lang.String r1 = p000.q02.m4693(r1, r9)
            java.lang.String r9 = ".png"
            java.lang.String r1 = r1.concat(r9)
            java.io.File r9 = new java.io.File
            r9.<init>(r4, r1)
            boolean r1 = r9.exists()
            if (r1 == 0) goto L57f
            long r11 = r9.length()
            int r1 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r1 <= 0) goto L57f
            android.net.Uri r0 = android.net.Uri.fromFile(r9)
            java.lang.String r0 = r0.toString()
            goto L5e2
        L57f:
            android.graphics.Bitmap r1 = m3847(r13, r7, r14, r8)     // Catch: java.lang.Throwable -> L597
            if (r1 != 0) goto L587
            goto L4a0
        L587:
            android.graphics.Bitmap r0 = m3843(r0, r1)     // Catch: java.lang.Throwable -> L597
            if (r0 == r1) goto L599
            boolean r4 = r1.isRecycled()     // Catch: java.lang.Throwable -> L597
            if (r4 != 0) goto L599
            r1.recycle()     // Catch: java.lang.Throwable -> L597
            goto L599
        L597:
            r0 = move-exception
            goto L5c8
        L599:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L597
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L597
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L5c0
            r8 = 100
            r0.compress(r4, r8, r1)     // Catch: java.lang.Throwable -> L5c0
            r1.flush()     // Catch: java.lang.Throwable -> L5c0
            r1.close()     // Catch: java.lang.Throwable -> L597
            boolean r1 = r0.isRecycled()     // Catch: java.lang.Throwable -> L597
            if (r1 != 0) goto L5b4
            r0.recycle()     // Catch: java.lang.Throwable -> L597
        L5b4:
            m3845(r9)     // Catch: java.lang.Throwable -> L597
            android.net.Uri r0 = android.net.Uri.fromFile(r9)     // Catch: java.lang.Throwable -> L597
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L597
            goto L5e2
        L5c0:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L5c3
        L5c3:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r1, r4)     // Catch: java.lang.Throwable -> L597
            throw r0     // Catch: java.lang.Throwable -> L597
        L5c8:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "create blurred cache failed: "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m3859(r0)
            r9.delete()     // Catch: java.lang.Throwable -> L4a0
            goto L4a0
        L5e2:
            if (r0 != 0) goto L5f5
        L5e4:
            r0 = r7
            goto L5f5
        L5e6:
            r31 = r4
            r29 = r8
            r34 = r9
            r37 = r11
            r32 = r12
            r16 = r14
            r33 = r15
            goto L5e4
        L5f5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r4 = "|"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = "|"
            r1.append(r2)
            java.lang.String r2 = "|"
            java.lang.String r3 = "|"
            p000.AbstractC0602nx.m4117(r1, r5, r2, r6, r3)
            r1.append(r10)
            java.lang.String r2 = "|"
            r1.append(r2)
            r2 = r37
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r3 = p000.AbstractC0551mj.f7179
            monitor-enter(r3)
            ij r4 = p000.AbstractC0551mj.f7180     // Catch: java.lang.Throwable -> L63d
            if (r4 == 0) goto L63f
            java.lang.String r8 = r4.f5094     // Catch: java.lang.Throwable -> L63d
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L63d
            if (r8 == 0) goto L63f
            android.graphics.Bitmap r8 = r4.f5095     // Catch: java.lang.Throwable -> L63d
            boolean r8 = r8.isRecycled()     // Catch: java.lang.Throwable -> L63d
            if (r8 != 0) goto L63f
            android.graphics.Bitmap r0 = r4.f5095     // Catch: java.lang.Throwable -> L63d
            monitor-exit(r3)
            goto L650
        L63d:
            r0 = move-exception
            goto L67c
        L63f:
            android.graphics.Bitmap r0 = m3847(r13, r0, r5, r6)     // Catch: java.lang.Throwable -> L63d
            if (r0 != 0) goto L648
            monitor-exit(r3)
            goto L3f9
        L648:
            ij r4 = new ij     // Catch: java.lang.Throwable -> L63d
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L63d
            p000.AbstractC0551mj.f7180 = r4     // Catch: java.lang.Throwable -> L63d
            monitor-exit(r3)
        L650:
            if (r0 != 0) goto L658
            r4 = r17
            r1 = r34
            goto L3dc
        L658:
            r1 = r34
            r8 = 100
            r14 = 0
            int r3 = p000.j81.m2906(r1, r14, r8)
            r4 = 255(0xff, float:3.57E-43)
            int r3 = r3 * r4
            int r3 = r3 / r8
            int r3 = p000.j81.m2906(r3, r14, r4)
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r13.getResources()
            r4.<init>(r5, r0)
            r5 = 119(0x77, float:1.67E-43)
            r4.setGravity(r5)
            r4.setAlpha(r3)
            goto L747
        L67c:
            monitor-exit(r3)
            throw r0
        L67e:
            r24 = r2
            r16 = r3
            r31 = r4
            r27 = r5
            r28 = r6
            r29 = r8
            r1 = r9
            r2 = r11
            r32 = r12
            r33 = r15
            r8 = 100
            java.lang.String r0 = "#FF1A1A2E"
            int r0 = android.graphics.Color.parseColor(r0)
            int r0 = android.graphics.Color.parseColor(r23)     // Catch: java.lang.Throwable -> L69c
        L69c:
            java.lang.String r3 = "create solid color bitmap failed: "
            java.lang.Integer r4 = java.lang.Integer.valueOf(r28)
            if (r28 <= 0) goto L6a5
            goto L6a7
        L6a5:
            r4 = r17
        L6a7:
            if (r4 == 0) goto L6ae
            int r4 = r4.intValue()
            goto L6b8
        L6ae:
            android.content.res.Resources r4 = r13.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
        L6b8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r29)
            if (r29 <= 0) goto L6bf
            goto L6c1
        L6bf:
            r5 = r17
        L6c1:
            if (r5 == 0) goto L6ca
            int r5 = r5.intValue()
        L6c7:
            r6 = r5
            r14 = 1
            goto L6d5
        L6ca:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.heightPixels
            goto L6c7
        L6d5:
            if (r4 >= r14) goto L6d8
            r4 = r14
        L6d8:
            if (r6 >= r14) goto L6db
            r6 = 1
        L6db:
            java.lang.String r5 = "solidColor|"
            java.lang.String r9 = "|"
            java.lang.String r11 = "|"
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4136(r5, r0, r9, r4, r11)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r9 = p000.AbstractC0551mj.f7179
            monitor-enter(r9)
            lj r11 = p000.AbstractC0551mj.f7178     // Catch: java.lang.Throwable -> L707
            if (r11 == 0) goto L70a
            java.lang.String r12 = r11.f6684     // Catch: java.lang.Throwable -> L707
            boolean r12 = r12.equals(r5)     // Catch: java.lang.Throwable -> L707
            if (r12 == 0) goto L70a
            android.graphics.Bitmap r12 = r11.f6685     // Catch: java.lang.Throwable -> L707
            boolean r12 = r12.isRecycled()     // Catch: java.lang.Throwable -> L707
            if (r12 != 0) goto L70a
            android.graphics.Bitmap r0 = r11.f6685     // Catch: java.lang.Throwable -> L707
            monitor-exit(r9)
            goto L734
        L707:
            r0 = move-exception
            goto L87c
        L70a:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L71d
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r6, r11)     // Catch: java.lang.Throwable -> L71d
            r4.eraseColor(r0)     // Catch: java.lang.Throwable -> L71d
            lj r0 = new lj     // Catch: java.lang.Throwable -> L707
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L707
            p000.AbstractC0551mj.f7178 = r0     // Catch: java.lang.Throwable -> L707
            monitor-exit(r9)
            r0 = r4
            goto L734
        L71d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L707
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L707
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L707
            r4.append(r0)     // Catch: java.lang.Throwable -> L707
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L707
            m3859(r0)     // Catch: java.lang.Throwable -> L707
            monitor-exit(r9)
            r0 = r17
        L734:
            if (r0 != 0) goto L739
            r4 = r17
            goto L747
        L739:
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r13.getResources()
            r4.<init>(r3, r0)
            r5 = 119(0x77, float:1.67E-43)
            r4.setGravity(r5)
        L747:
            if (r4 != 0) goto L751
            r21 = 1
            r11 = r40
            r15 = r33
            goto L83a
        L751:
            int r0 = r32.getWidth()
            int r3 = r32.getMeasuredWidth()
            int r0 = m3861(r0, r3)
            int r3 = r32.getHeight()
            int r5 = r32.getMeasuredHeight()
            int r3 = m3861(r3, r5)
            if (r0 <= 0) goto L76d
            if (r3 > 0) goto L777
        L76d:
            r11 = r40
            r12 = r32
            r15 = r33
            r21 = 1
            goto L81e
        L777:
            boolean r5 = m3857(r33)
            if (r5 == 0) goto L789
            r11 = r40
            r4 = r17
            r12 = r32
            r15 = r33
            r21 = 1
            goto L838
        L789:
            int r5 = r32.getWidth()
            int r6 = r32.getMeasuredWidth()
            int r5 = m3861(r5, r6)
            int r6 = r32.getHeight()
            int r9 = r32.getMeasuredHeight()
            int r6 = m3861(r6, r9)
            if (r5 <= 0) goto L7a5
            if (r6 > 0) goto L7ae
        L7a5:
            r11 = r40
            r12 = r32
            r15 = r33
            r21 = 1
            goto L813
        L7ae:
            boolean r9 = m3857(r33)
            if (r9 == 0) goto L7c2
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r11 = r40
            r12 = r32
            r15 = r33
            r21 = 1
            goto L818
        L7c2:
            android.graphics.Rect r9 = new android.graphics.Rect
            r15 = r33
            r9.<init>(r15)
            r11 = r40
            r12 = r32
            if (r12 == r11) goto L7fd
            r14 = 2
            int[] r13 = new int[r14]     // Catch: java.lang.Throwable -> L7ed
            int[] r8 = new int[r14]     // Catch: java.lang.Throwable -> L7ed
            r11.getLocationOnScreen(r13)     // Catch: java.lang.Throwable -> L7ed
            r12.getLocationOnScreen(r8)     // Catch: java.lang.Throwable -> L7ed
            r25 = 0
            r20 = r13[r25]     // Catch: java.lang.Throwable -> L7ed
            r32 = r8[r25]     // Catch: java.lang.Throwable -> L7ed
            int r14 = r20 - r32
            r21 = 1
            r13 = r13[r21]     // Catch: java.lang.Throwable -> L7ef
            r8 = r8[r21]     // Catch: java.lang.Throwable -> L7ef
            int r13 = r13 - r8
            r9.offset(r14, r13)     // Catch: java.lang.Throwable -> L7ef
            goto L7ff
        L7ed:
            r21 = 1
        L7ef:
            android.graphics.Rect r8 = m3844(r12, r11)
            int r13 = r8.left
            int r13 = -r13
            int r8 = r8.top
            int r8 = -r8
            r9.offset(r13, r8)
            goto L7ff
        L7fd:
            r21 = 1
        L7ff:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r9)
            r14 = 0
            boolean r5 = r8.intersect(r14, r14, r5, r6)
            if (r5 != 0) goto L811
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            goto L818
        L811:
            r5 = r8
            goto L818
        L813:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
        L818:
            boolean r6 = m3857(r5)
            if (r6 == 0) goto L821
        L81e:
            r4 = r17
            goto L838
        L821:
            int r6 = r5.left
            if (r6 > 0) goto L832
            int r6 = r5.top
            if (r6 > 0) goto L832
            int r6 = r5.right
            if (r6 < r0) goto L832
            int r0 = r5.bottom
            if (r0 < r3) goto L832
            goto L838
        L832:
            jj r0 = new jj
            r0.<init>(r4, r5)
            r4 = r0
        L838:
            if (r4 != 0) goto L83e
        L83a:
            r5 = r27
            r14 = 0
            goto L86b
        L83e:
            r0 = 2114784001(0x7e0d0b01, float:4.686957E37)
            java.lang.Object r3 = r12.getTag(r0)
            if (r3 == 0) goto L848
            goto L857
        L848:
            android.graphics.drawable.Drawable r3 = r12.getBackground()
            if (r3 != 0) goto L854
            x r3 = p000.C0966x.f11953
            r12.setTag(r0, r3)
            goto L857
        L854:
            r12.setTag(r0, r3)
        L857:
            r12.setBackground(r4)
            r12.invalidate()
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto L868
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r14 = 0
            m3846(r12, r14)
            goto L869
        L868:
            r14 = 0
        L869:
            r5 = r21
        L86b:
            r9 = r1
            r1 = r11
            r3 = r16
            r6 = r28
            r8 = r29
            r4 = r31
            r16 = 25
            r11 = r2
            r2 = r24
            goto L3ae
        L87c:
            monitor-exit(r9)
            throw r0
        L87e:
            r11 = r1
            r31 = r4
            r27 = r5
            if (r27 != 0) goto L888
            m3863(r11)
        L888:
            r1 = r31
            r2 = 2114784002(0x7e0d0b02, float:4.6869576E37)
            r11.setTag(r2, r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public static android.graphics.Bitmap m3843(int r26, android.graphics.Bitmap r27) {
            r0 = r26
            float r1 = (float) r0
            r2 = 1086324736(0x40c00000, float:6.0)
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r2
            float r2 = r2 / r1
            r1 = 1039516303(0x3df5c28f, float:0.12)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = p000.j81.m2905(r2, r1, r3)
            int r2 = r27.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = p000.jx0.m3061(r2)
            r3 = 1
            int r2 = java.lang.Math.max(r3, r2)
            int r4 = r27.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = p000.jx0.m3061(r4)
            int r1 = java.lang.Math.max(r3, r1)
            r4 = r27
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r4, r2, r1, r3)
            r1.getClass()
            int r2 = r0 / 8
            r5 = 4
            int r2 = p000.j81.m2906(r2, r3, r5)
            r5 = 0
            r7 = r1
            r6 = r5
        L43:
            if (r6 >= r2) goto L1d6
            r8 = 25
            int r15 = p000.j81.m2906(r0, r3, r8)
            int r10 = r7.getWidth()
            int r14 = r7.getHeight()
            int r8 = r10 * r14
            int[] r9 = new int[r8]
            int[] r11 = new int[r8]
            int[] r8 = new int[r8]
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r16 = r8
            r8 = r9
            r9 = 0
            r17 = r13
            r13 = r10
            r25 = r16
            r16 = r3
            r3 = r25
            r7.getPixels(r8, r9, r10, r11, r12, r13, r14)
            int r9 = r15 * 2
            int r9 = r9 + 1
            r11 = r5
        L74:
            if (r11 >= r14) goto L118
            int r12 = r11 * r10
            int r13 = -r15
            if (r13 > r15) goto La8
            r18 = r5
            r19 = r18
            r20 = r19
            r21 = r20
        L83:
            int r0 = r10 + (-1)
            int r0 = p000.j81.m2906(r13, r5, r0)
            int r0 = r0 + r12
            r0 = r8[r0]
            int r22 = r0 >>> 24
            int r18 = r18 + r22
            int r5 = r0 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r19 = r19 + r5
            int r5 = r0 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r20 = r20 + r5
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r21 = r21 + r0
            if (r13 == r15) goto Lb0
            int r13 = r13 + 1
            r0 = r26
            r5 = 0
            goto L83
        La8:
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        Lb0:
            r0 = 0
        Lb1:
            if (r0 >= r10) goto L10f
            int r5 = r12 + r0
            int r13 = r18 / r9
            int r13 = r13 << 24
            int r23 = r19 / r9
            int r23 = r23 << 16
            r13 = r13 | r23
            int r23 = r20 / r9
            int r23 = r23 << 8
            r13 = r13 | r23
            int r23 = r21 / r9
            r13 = r13 | r23
            r17[r5] = r13
            int r5 = r0 - r15
            int r13 = r10 + (-1)
            r23 = r0
            r0 = 0
            int r5 = p000.j81.m2906(r5, r0, r13)
            int r5 = r5 + r12
            r5 = r8[r5]
            int r22 = r23 + r15
            r24 = r2
            int r2 = r22 + 1
            int r2 = p000.j81.m2906(r2, r0, r13)
            int r2 = r2 + r12
            r0 = r8[r2]
            int r2 = r0 >>> 24
            int r13 = r5 >>> 24
            int r2 = r2 - r13
            int r18 = r2 + r18
            int r2 = r0 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r13 = r5 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r2 = r2 - r13
            int r19 = r2 + r19
            int r2 = r0 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r13 = r5 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r2 = r2 - r13
            int r20 = r2 + r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r5 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r2
            int r21 = r0 + r21
            int r0 = r23 + 1
            r2 = r24
            goto Lb1
        L10f:
            r24 = r2
            int r11 = r11 + 1
            r0 = r26
            r5 = 0
            goto L74
        L118:
            r24 = r2
            r0 = 0
        L11b:
            if (r0 >= r10) goto L1b4
            int r2 = -r15
            if (r2 > r15) goto L149
            r5 = 0
            r8 = 0
            r11 = 0
            r12 = 0
        L124:
            int r13 = r14 + (-1)
            r18 = r0
            r0 = 0
            int r13 = p000.j81.m2906(r2, r0, r13)
            int r13 = r13 * r10
            int r13 = r13 + r18
            r0 = r17[r13]
            int r13 = r0 >>> 24
            int r5 = r5 + r13
            int r13 = r0 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r8 = r8 + r13
            int r13 = r0 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r11 = r11 + r13
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r12 = r12 + r0
            if (r2 == r15) goto L14f
            int r2 = r2 + 1
            r0 = r18
            goto L124
        L149:
            r18 = r0
            r5 = 0
            r8 = 0
            r11 = 0
            r12 = 0
        L14f:
            r0 = 0
        L150:
            if (r0 >= r14) goto L1ae
            int r2 = r0 * r10
            int r2 = r2 + r18
            int r13 = r5 / r9
            int r13 = r13 << 24
            int r19 = r8 / r9
            int r19 = r19 << 16
            r13 = r13 | r19
            int r19 = r11 / r9
            int r19 = r19 << 8
            r13 = r13 | r19
            int r19 = r12 / r9
            r13 = r13 | r19
            r3[r2] = r13
            int r2 = r0 - r15
            int r13 = r14 + (-1)
            r19 = r0
            r0 = 0
            int r2 = p000.j81.m2906(r2, r0, r13)
            int r2 = r2 * r10
            int r2 = r2 + r18
            r2 = r17[r2]
            int r20 = r19 + r15
            int r4 = r20 + 1
            int r4 = p000.j81.m2906(r4, r0, r13)
            int r4 = r4 * r10
            int r4 = r4 + r18
            r0 = r17[r4]
            int r4 = r0 >>> 24
            int r13 = r2 >>> 24
            int r4 = r4 - r13
            int r5 = r5 + r4
            int r4 = r0 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r2 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r4 - r13
            int r8 = r8 + r4
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r2 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r4 - r13
            int r11 = r11 + r4
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 - r2
            int r12 = r12 + r0
            int r0 = r19 + 1
            r4 = r27
            goto L150
        L1ae:
            int r0 = r18 + 1
            r4 = r27
            goto L11b
        L1b4:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r10, r14, r0)
            r0.getClass()
            if (r7 == r1) goto L1c8
            boolean r2 = r7.isRecycled()
            if (r2 != 0) goto L1c8
            r7.recycle()
        L1c8:
            int r6 = r6 + 1
            r4 = r27
            r7 = r0
            r3 = r16
            r2 = r24
            r5 = 0
            r0 = r26
            goto L43
        L1d6:
            int r0 = r27.getWidth()
            int r1 = r27.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r0.getClass()
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            r5 = 0
            r2.<init>(r5, r5, r3, r4)
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 6
            r3.<init>(r4)
            r4 = 0
            r1.drawBitmap(r7, r4, r2, r3)
            boolean r1 = r7.isRecycled()
            if (r1 != 0) goto L20d
            r7.recycle()
        L20d:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static android.graphics.Rect m3844(android.view.View r6, android.view.ViewGroup r7) {
            int r0 = r6.getWidth()
            int r1 = r6.getMeasuredWidth()
            int r0 = m3861(r0, r1)
            int r1 = r6.getHeight()
            int r2 = r6.getMeasuredHeight()
            int r1 = m3861(r1, r2)
            if (r0 <= 0) goto L56
            if (r1 > 0) goto L1d
            goto L56
        L1d:
            r2 = 2
            int[] r3 = new int[r2]     // Catch: java.lang.Throwable -> L3e
            int[] r2 = new int[r2]     // Catch: java.lang.Throwable -> L3e
            r7.getLocationOnScreen(r3)     // Catch: java.lang.Throwable -> L3e
            r6.getLocationOnScreen(r2)     // Catch: java.lang.Throwable -> L3e
            r7 = 0
            r4 = r2[r7]     // Catch: java.lang.Throwable -> L3e
            r7 = r3[r7]     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 - r7
            r7 = 1
            r2 = r2[r7]     // Catch: java.lang.Throwable -> L3e
            r7 = r3[r7]     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 - r7
            android.graphics.Rect r7 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L3e
            int r3 = r4 + r0
            int r5 = r2 + r1
            r7.<init>(r4, r2, r3, r5)     // Catch: java.lang.Throwable -> L3e
            return r7
        L3e:
            android.graphics.Rect r7 = new android.graphics.Rect
            int r2 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getLeft()
            int r4 = r4 + r0
            int r6 = r6.getTop()
            int r6 = r6 + r1
            r7.<init>(r2, r3, r4, r6)
            return r7
        L56:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            return r6
    }

    /* JADX INFO: renamed from: δ */
    public static void m3845(java.io.File r7) {
            java.io.File r0 = r7.getParentFile()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L54
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L54
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            int r2 = r0.length     // Catch: java.lang.Throwable -> L54
            r3 = 0
        L13:
            if (r3 >= r2) goto L31
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L54
            boolean r5 = r4.isFile()     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L2e
            java.lang.String r5 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L54
            boolean r5 = p000.ln0.m3626(r5, r6)     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L2e
            r1.add(r4)     // Catch: java.lang.Throwable -> L54
        L2e:
            int r3 = r3 + 1
            goto L13
        L31:
            tf r7 = new tf     // Catch: java.lang.Throwable -> L54
            r0 = 7
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L54
            java.util.List r7 = p000.AbstractC0984xh.m6658(r1, r7)     // Catch: java.lang.Throwable -> L54
            r0 = 3
            java.util.List r7 = p000.AbstractC0984xh.m6634(r7, r0)     // Catch: java.lang.Throwable -> L54
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L54
        L44:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L54
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L54
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L54
            r0.delete()     // Catch: java.lang.Throwable -> L54
            goto L44
        L54:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m3846(android.view.ViewGroup r16, int r17) {
            r0 = r17
            r1 = 10
            if (r0 <= r1) goto L8
            goto L103
        L8:
            int r1 = r16.getChildCount()
            r3 = 0
        Ld:
            if (r3 >= r1) goto L103
            r4 = r16
            android.view.View r5 = r4.getChildAt(r3)
            if (r5 != 0) goto L1a
        L17:
            r15 = r3
            goto Lff
        L1a:
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L17
            android.graphics.drawable.Drawable r6 = r5.getBackground()
            r7 = 1
            if (r6 != 0) goto L26
            goto L8b
        L26:
            int r6 = r5.getVisibility()
            r8 = 8
            if (r6 != r8) goto L2f
            goto L8b
        L2f:
            java.lang.Class r6 = r5.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "RecyclerView"
            boolean r8 = p000.q02.m4654(r6, r8, r7)
            if (r8 != 0) goto L4f
            java.lang.String r8 = "ViewPager"
            boolean r8 = p000.q02.m4654(r6, r8, r7)
            if (r8 != 0) goto L4f
            java.lang.String r8 = "NestedScroll"
            boolean r6 = p000.q02.m4654(r6, r8, r7)
            if (r6 == 0) goto L53
        L4f:
            r15 = r3
            r3 = r7
            goto Ld5
        L53:
            int r6 = r5.getWidth()
            int r8 = r5.getMeasuredWidth()
            int r6 = m3861(r6, r8)
            int r8 = r5.getHeight()
            int r9 = r5.getMeasuredHeight()
            int r8 = m3861(r8, r9)
            int r9 = r4.getWidth()
            int r10 = r4.getMeasuredWidth()
            int r9 = m3861(r9, r10)
            int r10 = r4.getHeight()
            int r11 = r4.getMeasuredHeight()
            int r10 = m3861(r10, r11)
            if (r6 <= 0) goto L8b
            if (r8 <= 0) goto L8b
            if (r9 <= 0) goto L8b
            if (r10 > 0) goto L8f
        L8b:
            r15 = r3
        L8c:
            r3 = r7
            goto Lf8
        L8f:
            long r11 = (long) r6
            long r13 = (long) r8
            long r11 = r11 * r13
            long r13 = (long) r9
            r15 = r3
            long r2 = (long) r10
            long r13 = r13 * r2
            r2 = 0
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L9d
            goto L8c
        L9d:
            r2 = 35
            long r2 = (long) r2
            long r13 = r13 * r2
            r2 = 100
            r3 = r7
            r10 = r8
            long r7 = (long) r2
            long r13 = r13 / r7
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 < 0) goto Lad
            r7 = r3
            goto Lae
        Lad:
            r7 = 0
        Lae:
            int r9 = r9 * 85
            int r9 = r9 / r2
            if (r6 < r9) goto Ld0
            android.content.Context r2 = r5.getContext()
            r2.getClass()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r6 = 96
            float r6 = (float) r6
            float r2 = r2 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r6
            int r2 = (int) r2
            if (r10 < r2) goto Ld0
            r2 = r3
            goto Ld1
        Ld0:
            r2 = 0
        Ld1:
            if (r7 != 0) goto Ld5
            if (r2 == 0) goto Lf8
        Ld5:
            r2 = 2114784001(0x7e0d0b01, float:4.686957E37)
            java.lang.Object r6 = r5.getTag(r2)
            if (r6 == 0) goto Ldf
            goto Lee
        Ldf:
            android.graphics.drawable.Drawable r6 = r5.getBackground()
            if (r6 != 0) goto Leb
            x r6 = p000.C0966x.f11953
            r5.setTag(r2, r6)
            goto Lee
        Leb:
            r5.setTag(r2, r6)
        Lee:
            r2 = r5
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6 = 0
            r2.setBackground(r6)
            r5.invalidate()
        Lf8:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r2 = r0 + 1
            m3846(r5, r2)
        Lff:
            int r3 = r15 + 1
            goto Ld
        L103:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static android.graphics.Bitmap m3847(android.content.Context r7, java.lang.String r8, int r9, int r10) {
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch: java.lang.Throwable -> L16
            java.io.InputStream r3 = m3860(r7, r8)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L1f
            android.graphics.BitmapFactory.decodeStream(r3, r0, r1)     // Catch: java.lang.Throwable -> L18
            r3.close()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r7 = move-exception
            goto L64
        L18:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L1a
        L1a:
            r8 = move-exception
            p000.AbstractC0978xb.m6584(r3, r7)     // Catch: java.lang.Throwable -> L16
            throw r8     // Catch: java.lang.Throwable -> L16
        L1f:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            r4 = 0
            r3.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L16
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L16
            r3.inPreferredConfig = r4     // Catch: java.lang.Throwable -> L16
            int r4 = r1.outWidth     // Catch: java.lang.Throwable -> L16
            int r1 = r1.outHeight     // Catch: java.lang.Throwable -> L16
            if (r4 <= 0) goto L4c
            if (r1 <= 0) goto L4c
            if (r9 <= 0) goto L4c
            if (r10 > 0) goto L38
            goto L4c
        L38:
            int r4 = r4 / 2
            int r1 = r1 / 2
            r5 = r2
        L3d:
            int r6 = r4 / r5
            if (r6 < r9) goto L48
            int r6 = r1 / r5
            if (r6 < r10) goto L48
            int r5 = r5 * 2
            goto L3d
        L48:
            int r2 = java.lang.Math.max(r2, r5)     // Catch: java.lang.Throwable -> L16
        L4c:
            r3.inSampleSize = r2     // Catch: java.lang.Throwable -> L16
            java.io.InputStream r7 = m3860(r7, r8)     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L63
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r7, r0, r3)     // Catch: java.lang.Throwable -> L5c
            r7.close()     // Catch: java.lang.Throwable -> L16
            return r8
        L5c:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L5e
        L5e:
            r9 = move-exception
            p000.AbstractC0978xb.m6584(r7, r8)     // Catch: java.lang.Throwable -> L16
            throw r9     // Catch: java.lang.Throwable -> L16
        L63:
            return r0
        L64:
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "decode bitmap failed: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            m3859(r7)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static void m3848() {
            android.content.SharedPreferences r0 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L19
            android.content.SharedPreferences r1 = p000.AbstractC0551mj.f7176     // Catch: java.lang.Throwable -> L19
            if (r1 != r0) goto L9
            goto L19
        L9:
            android.content.SharedPreferences r1 = p000.AbstractC0551mj.f7176     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L12
            hj r2 = p000.AbstractC0551mj.f7177     // Catch: java.lang.Throwable -> L19
            r1.unregisterOnSharedPreferenceChangeListener(r2)     // Catch: java.lang.Throwable -> L19
        L12:
            hj r1 = p000.AbstractC0551mj.f7177     // Catch: java.lang.Throwable -> L19
            r0.registerOnSharedPreferenceChangeListener(r1)     // Catch: java.lang.Throwable -> L19
            p000.AbstractC0551mj.f7176 = r0     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static android.view.ViewGroup m3849(android.view.View r3) {
            if (r3 != 0) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L10
            boolean r1 = m3856(r3)
            if (r1 == 0) goto L10
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L10:
            if (r0 == 0) goto L2c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L19:
            if (r1 >= r0) goto L2c
            android.view.View r2 = r3.getChildAt(r1)
            if (r2 != 0) goto L22
            goto L29
        L22:
            android.view.ViewGroup r2 = m3849(r2)
            if (r2 == 0) goto L29
            return r2
        L29:
            int r1 = r1 + 1
            goto L19
        L2c:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public static android.view.ViewGroup m3850(java.lang.Object r9) {
            if (r9 != 0) goto L4
            goto Lb4
        L4:
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0471kj.f5941
            java.lang.Class r0 = r9.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = p000.AbstractC0471kj.f5944
            java.lang.String r0 = p000.AbstractC0471kj.m3282(r0)
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r0 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            r1 = r0
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L2c
            boolean r1 = m3856(r1)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2c
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Throwable -> L2c
            return r0
        L2c:
            java.lang.Class r0 = r9.getClass()
        L30:
            if (r0 == 0) goto Lb4
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lb4
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L44:
            if (r4 >= r2) goto Lae
            r5 = r1[r4]
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC4A030EF56F70E6FEEB90FFE1280654D00E21B04C378E1FA69488"
            java.lang.String r8 = p000.jf0.m2957(r8)     // Catch: java.lang.Throwable -> Lab
            boolean r8 = r7.equals(r8)     // Catch: java.lang.Throwable -> Lab
            if (r8 != 0) goto L68
            java.lang.String r8 = ".CommentNestedLayout"
            boolean r7 = p000.x02.m6479(r7, r8, r3)     // Catch: java.lang.Throwable -> Lab
            if (r7 == 0) goto L85
        L68:
            java.util.concurrent.ConcurrentHashMap r7 = p000.AbstractC0471kj.f5941     // Catch: java.lang.Throwable -> Lab
            java.lang.Class r7 = r9.getClass()     // Catch: java.lang.Throwable -> Lab
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> Lab
            java.util.concurrent.ConcurrentHashMap r8 = p000.AbstractC0471kj.f5944     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = p000.AbstractC0471kj.m3282(r7)     // Catch: java.lang.Throwable -> Lab
            r8.put(r7, r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r7 = r5.get(r9)     // Catch: java.lang.Throwable -> Lab
            boolean r8 = r7 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> Lab
            if (r8 == 0) goto L85
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> Lab
            return r7
        L85:
            java.lang.Object r7 = r5.get(r9)     // Catch: java.lang.Throwable -> Lab
            boolean r8 = r7 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> Lab
            if (r8 == 0) goto Lab
            r8 = r7
            android.view.View r8 = (android.view.View) r8     // Catch: java.lang.Throwable -> Lab
            boolean r8 = m3856(r8)     // Catch: java.lang.Throwable -> Lab
            if (r8 == 0) goto Lab
            java.util.concurrent.ConcurrentHashMap r8 = p000.AbstractC0471kj.f5941     // Catch: java.lang.Throwable -> Lab
            java.lang.Class r8 = r9.getClass()     // Catch: java.lang.Throwable -> Lab
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> Lab
            java.util.concurrent.ConcurrentHashMap r6 = p000.AbstractC0471kj.f5944     // Catch: java.lang.Throwable -> Lab
            java.lang.String r8 = p000.AbstractC0471kj.m3282(r8)     // Catch: java.lang.Throwable -> Lab
            r6.put(r8, r5)     // Catch: java.lang.Throwable -> Lab
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> Lab
            return r7
        Lab:
            int r4 = r4 + 1
            goto L44
        Lae:
            java.lang.Class r0 = r0.getSuperclass()
            goto L30
        Lb4:
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: κ */
    public static android.view.ViewGroup m3851(java.lang.Object r4) {
            r0 = 0
            if (r4 != 0) goto L4
            goto L27
        L4:
            java.util.concurrent.ConcurrentHashMap r1 = p000.AbstractC0471kj.f5941     // Catch: java.lang.Throwable -> L27
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "getView"
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r1 = p000.AbstractC0471kj.m3284(r1, r2, r3)     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L16
            goto L27
        L16:
            java.lang.Object r4 = r1.invoke(r4, r0)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L27
            goto L22
        L21:
            r4 = r0
        L22:
            android.view.ViewGroup r4 = m3849(r4)     // Catch: java.lang.Throwable -> L27
            return r4
        L27:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static android.view.View m3852(android.view.ViewGroup r5) {
            r0 = 0
            r1 = 0
            java.util.concurrent.ConcurrentHashMap r2 = p000.AbstractC0471kj.f5941     // Catch: java.lang.Throwable -> L12
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = "getPlaceHolderView"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r2 = p000.AbstractC0471kj.m3284(r2, r3, r4)     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L14
        L12:
            r2 = r1
            goto L1e
        L14:
            java.lang.Object r2 = r2.invoke(r5, r1)     // Catch: java.lang.Throwable -> L12
            boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L12
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L12
        L1e:
            if (r2 == 0) goto L21
            return r2
        L21:
            int r2 = r5.getChildCount()
        L25:
            if (r0 >= r2) goto L38
            android.view.View r3 = r5.getChildAt(r0)
            if (r3 != 0) goto L2e
            goto L35
        L2e:
            boolean r4 = m3858(r0, r3, r5)
            if (r4 == 0) goto L35
            return r3
        L35:
            int r0 = r0 + 1
            goto L25
        L38:
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static void m3853(java.lang.ClassLoader r7) {
            java.lang.String r0 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC480344D16569A5D8EA89DEED35064AD41A30935A1A880BAC8F88"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007CDD8DCD02E7A0727E48DD1CCDC2C529195B1582DE4BA5395A48AA678AE38B45D36CFCF4F401CFDBF8AB2"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = p000.AbstractC0471kj.m3283(r7, r2)
            if (r2 == 0) goto L1d
            r1.add(r2)
            goto L1d
        L33:
            java.util.Set r7 = p000.AbstractC0984xh.m6670(r1)
            java.util.List r7 = p000.AbstractC0984xh.m6666(r7)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L47
            java.lang.String r7 = "comment fragment class not found"
            m3859(r7)
            return
        L47:
            java.util.Iterator r7 = r7.iterator()
        L4b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r7.next()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.Class[] r4 = new java.lang.Class[]{r1, r2, r3}
            gh r5 = new gh
            r6 = 17
            r5.<init>(r6)
            java.lang.String r6 = "o40"
            m3855(r0, r6, r4, r5)
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}
            gh r2 = new gh
            r4 = 18
            r2.<init>(r4)
            java.lang.String r4 = "onCreateView"
            m3855(r0, r4, r1, r2)
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Class[] r2 = new java.lang.Class[]{r1}
            gh r4 = new gh
            r5 = 19
            r4.<init>(r5)
            java.lang.String r5 = "p40"
            m3855(r0, r5, r2, r4)
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r3}
            gh r2 = new gh
            r3 = 20
            r2.<init>(r3)
            java.lang.String r3 = "onViewCreated"
            m3855(r0, r3, r1, r2)
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            gh r2 = new gh
            r3 = 21
            r2.<init>(r3)
            java.lang.String r3 = "show"
            m3855(r0, r3, r1, r2)
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            gh r2 = new gh
            r3 = 22
            r2.<init>(r3)
            java.lang.String r3 = "onConfigurationChanged"
            m3855(r0, r3, r1, r2)
            goto L4b
        Lc1:
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m3854(java.lang.ClassLoader r5) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0471kj.f5941
            java.lang.String r0 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC4A030EF56F70E6FEEB90FFE1280654D00E21B04C378E1FA69488"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r5 = p000.AbstractC0471kj.m3283(r5, r0)
            if (r5 != 0) goto L14
            java.lang.String r5 = "CommentNestedLayout class not found"
            m3859(r5)
            return
        L14:
            gh r0 = new gh
            r1 = 15
            r0.<init>(r1)
            java.lang.ClassLoader r1 = r5.getClassLoader()
            if (r1 == 0) goto L26
            int r1 = java.lang.System.identityHashCode(r1)
            goto L27
        L26:
            r1 = 0
        L27:
            java.lang.String r2 = r5.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ctor:"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.AbstractC0551mj.f7173
            boolean r1 = r2.add(r1)
            if (r1 != 0) goto L4a
            goto L62
        L4a:
            xq0 r1 = p000.xq0.f12253
            nh r2 = new nh
            r3 = 1
            r2.<init>(r3, r0)
            r1.m6773(r5, r2)
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "hooked constructors "
            java.lang.String r0 = r1.concat(r0)
            m3859(r0)
        L62:
            java.lang.Class r0 = java.lang.Integer.TYPE
            r0.getClass()
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0}
            gh r1 = new gh
            r2 = 16
            r1.<init>(r2)
            java.lang.String r2 = "onMeasure"
            m3855(r5, r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static void m3855(java.lang.Class r5, java.lang.String r6, java.lang.Class[] r7, p000.a80 r8) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.AbstractC0471kj.f5941
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.Class[] r7 = (java.lang.Class[]) r7
            r5.getClass()
            java.lang.String r0 = "D"
            java.lang.String r0 = p000.AbstractC0471kj.m3285(r0, r5, r6, r7)
            java.util.concurrent.ConcurrentHashMap r1 = p000.AbstractC0471kj.f5942
            java.lang.Object r2 = r1.get(r0)
            r3 = 0
            if (r2 == 0) goto L24
            boolean r5 = r2 instanceof java.lang.reflect.Method
            if (r5 == 0) goto L22
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            goto L3f
        L22:
            r2 = r3
            goto L3f
        L24:
            int r2 = r7.length     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r2)     // Catch: java.lang.Throwable -> L35
            java.lang.Class[] r7 = (java.lang.Class[]) r7     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch: java.lang.Throwable -> L35
            r7 = 1
            r5.setAccessible(r7)     // Catch: java.lang.Throwable -> L35
            r2 = r5
            goto L36
        L35:
            r2 = r3
        L36:
            if (r2 != 0) goto L3b
            x r5 = p000.C0966x.f11954
            goto L3c
        L3b:
            r5 = r2
        L3c:
            r1.put(r0, r5)
        L3f:
            if (r2 != 0) goto L42
            goto La2
        L42:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r7 = r2.getDeclaringClass()
            r7.getClass()
            java.lang.ClassLoader r7 = r7.getClassLoader()
            if (r7 == 0) goto L59
            int r7 = java.lang.System.identityHashCode(r7)
            goto L5a
        L59:
            r7 = 0
        L5a:
            r5.append(r7)
            r7 = 58
            r5.append(r7)
            java.lang.Class r7 = r2.getDeclaringClass()
            java.lang.String r7 = r7.getName()
            r5.append(r7)
            r7 = 35
            r5.append(r7)
            java.lang.String r7 = r2.getName()
            r5.append(r7)
            r7 = 40
            r5.append(r7)
            java.lang.Class[] r7 = r2.getParameterTypes()
            r7.getClass()
            gh r0 = new gh
            r1 = 14
            r0.<init>(r1)
            r1 = 30
            java.lang.String r4 = ","
            java.lang.String r7 = p000.AbstractC0312g7.m2256(r7, r4, r3, r0, r1)
            r0 = 41
            java.lang.String r5 = p000.AbstractC0602nx.m4132(r5, r7, r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = p000.AbstractC0551mj.f7173
            boolean r5 = r7.add(r5)
            if (r5 != 0) goto La3
        La2:
            return
        La3:
            xq0 r5 = p000.xq0.f12253
            qg r7 = new qg
            r0 = 3
            r7.<init>(r8, r0, r6)
            r5.m6775(r2, r7)
            java.lang.Class r5 = r2.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "hooked "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = "#"
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            m3859(r5)
            return
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m3856(android.view.View r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC4A030EF56F70E6FEEB90FFE1280654D00E21B04C378E1FA69488"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 == 0) goto L16
            goto L26
        L16:
            java.lang.String r0 = "comment"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L27
            java.lang.String r0 = "NestedLayout"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L27
        L26:
            return r1
        L27:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: π */
    public static boolean m3857(android.graphics.Rect r1) {
            int r0 = r1.width()
            if (r0 <= 0) goto Lf
            int r1 = r1.height()
            if (r1 > 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public static boolean m3858(int r1, android.view.View r2, android.view.ViewGroup r3) {
            if (r1 == 0) goto L3
            goto L32
        L3:
            boolean r1 = r3 instanceof android.widget.LinearLayout
            if (r1 != 0) goto L8
            goto L32
        L8:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L13
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 != 0) goto L17
            goto L32
        L17:
            float r2 = r1.weight
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L1f
            goto L32
        L1f:
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r2 = r3.getOrientation()
            if (r2 != 0) goto L2c
            int r1 = r1.width
            if (r1 != 0) goto L32
            goto L30
        L2c:
            int r1 = r1.height
            if (r1 != 0) goto L32
        L30:
            r1 = 1
            return r1
        L32:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: σ */
    public static void m3859(java.lang.String r3) {
            r0 = 0
            r1 = 4
            java.lang.String r2 = "r31ea4ef8bcca40f9"
            p000.C0888ux.m5988(r2, r3, r0, r1, r0)
            return
    }

    /* JADX INFO: renamed from: τ */
    public static java.io.InputStream m3860(android.content.Context r5, java.lang.String r6) {
            boolean r0 = p000.q02.m4671(r6)
            r1 = 0
            if (r0 == 0) goto L9
            goto L8d
        L9:
            android.net.Uri r0 = android.net.Uri.parse(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r0.getScheme()     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L1d
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r2.toLowerCase(r3)     // Catch: java.lang.Throwable -> L8d
            r2.getClass()     // Catch: java.lang.Throwable -> L8d
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 == 0) goto L82
            int r3 = r2.hashCode()     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L5d
            r4 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r3 == r4) goto L42
            r4 = 951530617(0x38b73479, float:8.735894E-5)
            if (r3 == r4) goto L31
            goto L65
        L31:
            java.lang.String r3 = "content"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L65
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L8d
            java.io.InputStream r5 = r5.openInputStream(r0)     // Catch: java.lang.Throwable -> L8d
            return r5
        L42:
            java.lang.String r3 = "file"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L4b
            goto L65
        L4b:
            java.lang.String r5 = r0.getPath()     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L52
            goto L8d
        L52:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8d
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L8d
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            return r6
        L5d:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L8d
            if (r2 != 0) goto L82
        L65:
            java.lang.String r2 = "/"
            r3 = 0
            boolean r2 = p000.x02.m6485(r6, r2, r3)     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L79
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8d
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            return r5
        L79:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L8d
            java.io.InputStream r5 = r5.openInputStream(r0)     // Catch: java.lang.Throwable -> L8d
            return r5
        L82:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8d
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8d
            return r5
        L8d:
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public static int m3861(int r0, int r1) {
            if (r0 <= 0) goto L3
            return r0
        L3:
            if (r1 <= 0) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static void m3862() {
            java.util.Set r0 = p000.AbstractC0551mj.f7175
            monitor-enter(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L46
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            java.util.Iterator r0 = r1.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            m3842(r1, r2)     // Catch: java.lang.Throwable -> L22
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L29:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "refresh layout failed: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            m3859(r1)
            goto Lf
        L45:
            return
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: χ */
    public static void m3863(android.view.View r4) {
            r0 = 2114784001(0x7e0d0b01, float:4.686957E37)
            java.lang.Object r1 = r4.getTag(r0)
            if (r1 != 0) goto La
            goto L26
        La:
            x r2 = p000.C0966x.f11953
            boolean r2 = r1.equals(r2)
            r3 = 0
            if (r2 == 0) goto L17
            r4.setBackground(r3)
            goto L20
        L17:
            boolean r2 = r1 instanceof android.graphics.drawable.Drawable
            if (r2 == 0) goto L20
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r4.setBackground(r1)
        L20:
            r4.setTag(r0, r3)
            r4.invalidate()
        L26:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L40
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L31:
            if (r1 >= r0) goto L40
            android.view.View r2 = r4.getChildAt(r1)
            if (r2 != 0) goto L3a
            goto L3d
        L3a:
            m3863(r2)
        L3d:
            int r1 = r1 + 1
            goto L31
        L40:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public static void m3864(android.view.ViewGroup r1, boolean r2, boolean r3) {
            java.util.Set r0 = p000.AbstractC0551mj.f7175
            r0.add(r1)
            af0 r0 = new af0
            r0.<init>(r1, r3, r2)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L1c
            r0.invoke()
            return
        L1c:
            h22 r1 = p000.AbstractC0551mj.f7171
            java.lang.Object r1 = r1.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            ν r2 = new ν
            r3 = 7
            r2.<init>(r3, r0)
            r1.post(r2)
            return
    }

    /* JADX INFO: renamed from: ω */
    public static void m3865(android.view.View r3, java.lang.Object r4) {
            android.view.ViewGroup r0 = m3849(r3)
            if (r0 != 0) goto L10
            android.view.ViewGroup r0 = m3850(r4)
            if (r0 != 0) goto L10
            android.view.ViewGroup r0 = m3851(r4)
        L10:
            if (r0 == 0) goto L17
            r3 = 1
            m3864(r0, r3, r3)
            return
        L17:
            if (r3 == 0) goto L24
            w1 r0 = new w1
            r1 = 7
            r0.<init>(r3, r1, r4)
            r1 = 120(0x78, double:5.93E-322)
            r3.postDelayed(r0, r1)
        L24:
            return
    }
}
