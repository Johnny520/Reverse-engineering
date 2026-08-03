package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r9.d0 f11762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f11763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r9.q f11765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f11767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f11769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f11771p;

    public /* synthetic */ m(r9.d0 r1, android.widget.TextView r2, android.view.View r3, r9.q r4, android.view.View r5, java.lang.String r6, int r7, boolean r8, int r9, android.widget.RelativeLayout r10) {
            r0 = this;
            r0.<init>()
            r0.f11762g = r1
            r0.f11763h = r2
            r0.f11764i = r3
            r0.f11765j = r4
            r0.f11766k = r5
            r0.f11767l = r6
            r0.f11768m = r7
            r0.f11769n = r8
            r0.f11770o = r9
            r0.f11771p = r10
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r24 = this;
            r1 = r24
            r9.d0 r3 = r1.f11762g
            android.widget.TextView r4 = r1.f11763h
            android.view.View r5 = r1.f11764i
            r9.q r6 = r1.f11765j
            android.view.View r7 = r1.f11766k
            java.lang.String r8 = r1.f11767l
            int r9 = r1.f11768m
            boolean r10 = r1.f11769n
            int r0 = r1.f11770o
            android.widget.RelativeLayout r2 = r1.f11771p
            r13 = 2
            if (r0 < r13) goto L1b
            r14 = 1
            goto L1c
        L1b:
            r14 = 0
        L1c:
            android.widget.RelativeLayout r15 = r6.f11784a
            r16 = r13
            android.view.View r13 = r6.f11785b
            android.view.ViewParent r12 = r4.getParent()
            if (r12 != r15) goto L38
            int r12 = r13.getHeight()
            if (r12 <= 0) goto L38
            boolean r12 = r6.f11786c
            if (r12 != 0) goto L44
            int r12 = r13.getWidth()
            if (r12 > 0) goto L44
        L38:
            r18 = r2
            r20 = r5
            r21 = r7
            r19 = r9
            r22 = r10
            goto L287
        L44:
            r12 = 0
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r12)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r12)
            r4.measure(r11, r1)
            int r1 = r5.getWidth()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto L5b
            goto L5c
        L5b:
            r11 = 0
        L5c:
            if (r11 == 0) goto L5f
            goto L6b
        L5f:
            int r1 = r5.getMeasuredWidth()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto L6a
            goto L6b
        L6a:
            r11 = 0
        L6b:
            if (r11 == 0) goto L9c
            boolean r1 = r5 instanceof android.view.ViewGroup
            if (r1 == 0) goto L9c
            boolean r1 = r9.d0.P(r15, r5)
            if (r1 == 0) goto L9c
            android.graphics.Rect r1 = new android.graphics.Rect
            int r11 = r11.intValue()
            r12 = r5
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r18 = r2
            int r2 = r12.getHeight()
            r19 = r9
            r9 = 1
            if (r2 >= r9) goto L8c
            r2 = 1
        L8c:
            r9 = 0
            r1.<init>(r9, r9, r11, r2)
            if (r5 == r15) goto L95
            r12.offsetRectIntoDescendantCoords(r15, r1)
        L95:
            int r2 = r1.width()
            if (r2 <= 0) goto La0
            goto Ld3
        L9c:
            r18 = r2
            r19 = r9
        La0:
            int r1 = r15.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto Lab
            goto Lac
        Lab:
            r2 = 0
        Lac:
            if (r2 == 0) goto Lb3
        Lae:
            int r1 = r2.intValue()
            goto Lc2
        Lb3:
            int r1 = r15.getMeasuredWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto Lbe
            goto Lbf
        Lbe:
            r2 = 0
        Lbf:
            if (r2 == 0) goto Ld2
            goto Lae
        Lc2:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r9 = r15.getHeight()
            r11 = 1
            if (r9 >= r11) goto Lcc
            r9 = 1
        Lcc:
            r12 = 0
            r2.<init>(r12, r12, r1, r9)
            r1 = r2
            goto Ld3
        Ld2:
            r1 = 0
        Ld3:
            if (r1 == 0) goto L27e
            if (r13 != r15) goto Lf8
            android.graphics.Rect r2 = new android.graphics.Rect
            int r9 = r15.getPaddingLeft()
            int r11 = r15.getPaddingTop()
            int r12 = r15.getWidth()
            int r13 = r15.getPaddingRight()
            int r12 = r12 - r13
            int r13 = r15.getHeight()
            int r20 = r15.getPaddingBottom()
            int r13 = r13 - r20
            r2.<init>(r9, r11, r12, r13)
            goto L109
        Lf8:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r9 = r13.getWidth()
            int r11 = r13.getHeight()
            r12 = 0
            r2.<init>(r12, r12, r9, r11)
            r15.offsetDescendantRectToMyCoords(r13, r2)
        L109:
            android.view.ViewGroup$LayoutParams r9 = r4.getLayoutParams()
            boolean r11 = r9 instanceof android.widget.RelativeLayout.LayoutParams
            if (r11 == 0) goto L114
            android.widget.RelativeLayout$LayoutParams r9 = (android.widget.RelativeLayout.LayoutParams) r9
            goto L115
        L114:
            r9 = 0
        L115:
            if (r9 == 0) goto L275
            int r11 = r4.getMeasuredWidth()
            int r12 = r1.left
            int r1 = r1.right
            int r1 = r1 - r11
            if (r1 >= r12) goto L123
            r1 = r12
        L123:
            if (r7 == 0) goto L15a
            boolean r13 = r6.f11786c
            if (r13 == 0) goto L13d
            int r13 = r7.getWidth()
            if (r13 <= 0) goto L13d
            int r13 = r7.getHeight()
            if (r13 <= 0) goto L13d
            boolean r13 = r9.d0.P(r7, r15)
            if (r13 == 0) goto L13d
            r13 = r7
            goto L13e
        L13d:
            r13 = 0
        L13e:
            if (r13 == 0) goto L15a
            r20 = r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r21 = r7
            int r7 = r13.getWidth()
            r22 = r10
            int r10 = r13.getHeight()
            r23 = r14
            r14 = 0
            r5.<init>(r14, r14, r7, r10)
            r15.offsetDescendantRectToMyCoords(r13, r5)
            goto L163
        L15a:
            r20 = r5
            r21 = r7
            r22 = r10
            r23 = r14
            r5 = 0
        L163:
            boolean r7 = r6.f11786c
            if (r7 == 0) goto L180
            if (r22 == 0) goto L175
            if (r5 == 0) goto L16f
            int r5 = r5.right
            int r5 = r5 - r11
            goto L170
        L16f:
            r5 = r1
        L170:
            int r1 = r9.e0.r(r5, r12, r1)
            goto L18e
        L175:
            if (r5 == 0) goto L17a
            int r5 = r5.left
            goto L17b
        L17a:
            r5 = r12
        L17b:
            int r1 = r9.e0.r(r5, r12, r1)
            goto L18e
        L180:
            int r5 = r2.left
            int r7 = r2.width()
            int r7 = r7 - r11
            int r7 = r7 / 2
            int r7 = r7 + r5
            int r1 = r9.e0.r(r7, r12, r1)
        L18e:
            java.lang.String r5 = "avatar_above"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L1a0
            int r5 = r2.top
            int r7 = r4.getMeasuredHeight()
            int r5 = r5 - r7
            int r5 = r5 - r19
            goto L1a4
        L1a0:
            int r5 = r2.bottom
            int r5 = r5 + r19
        L1a4:
            java.lang.String r7 = "avatar_below"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L1fa
            int r7 = r4.getMeasuredHeight()
            int r7 = r7 + r5
            int r10 = r15.getHeight()
            int r7 = r7 - r10
            if (r7 <= 0) goto L1fa
            if (r7 > 0) goto L1bb
            goto L1fa
        L1bb:
            java.util.WeakHashMap r10 = r3.f11675w
            monitor-enter(r10)
            java.util.WeakHashMap r12 = r3.f11675w     // Catch: java.lang.Throwable -> L1f7
            java.lang.Object r12 = r12.get(r15)     // Catch: java.lang.Throwable -> L1f7
            r9.s r12 = (r9.s) r12     // Catch: java.lang.Throwable -> L1f7
            monitor-exit(r10)
            if (r12 == 0) goto L1fa
            int r10 = r12.f11792d
            int r13 = r12.f11790b
            if (r10 == r13) goto L1d0
            goto L1fa
        L1d0:
            int r10 = r10 + r7
            r1 = 55
            r9 = 0
            r9.s r1 = r9.s.a(r12, r9, r10, r1)
            int r2 = r15.getPaddingLeft()
            int r5 = r1.f11791c
            int r7 = r15.getPaddingRight()
            int r9 = r1.f11792d
            r15.setPadding(r2, r5, r7, r9)
            java.util.WeakHashMap r2 = r3.f11675w
            monitor-enter(r2)
            java.util.WeakHashMap r5 = r3.f11675w     // Catch: java.lang.Throwable -> L1f4
            r5.put(r15, r1)     // Catch: java.lang.Throwable -> L1f4
            monitor-exit(r2)
            r9.t r1 = r9.t.f11796h
            goto L289
        L1f4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L1f7:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L1fa:
            if (r5 >= 0) goto L246
            java.lang.String r7 = "avatar_above"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L246
            if (r23 != 0) goto L246
            int r1 = -r5
            if (r1 > 0) goto L20a
            goto L240
        L20a:
            java.util.WeakHashMap r2 = r3.f11675w
            monitor-enter(r2)
            java.util.WeakHashMap r5 = r3.f11675w     // Catch: java.lang.Throwable -> L243
            java.lang.Object r5 = r5.get(r15)     // Catch: java.lang.Throwable -> L243
            r9.s r5 = (r9.s) r5     // Catch: java.lang.Throwable -> L243
            monitor-exit(r2)
            if (r5 == 0) goto L240
            int r2 = r5.f11791c
            int r2 = r2 + r1
            r1 = 59
            r12 = 0
            r9.s r1 = r9.s.a(r5, r2, r12, r1)
            int r2 = r15.getPaddingLeft()
            int r5 = r1.f11791c
            int r7 = r15.getPaddingRight()
            int r9 = r1.f11792d
            r15.setPadding(r2, r5, r7, r9)
            java.util.WeakHashMap r2 = r3.f11675w
            monitor-enter(r2)
            java.util.WeakHashMap r5 = r3.f11675w     // Catch: java.lang.Throwable -> L23d
            r5.put(r15, r1)     // Catch: java.lang.Throwable -> L23d
            monitor-exit(r2)
            r9.t r1 = r9.t.f11796h
            goto L289
        L23d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L240:
            r9.t r1 = r9.t.f11797i
            goto L289
        L243:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L246:
            if (r5 < 0) goto L249
            goto L24d
        L249:
            int r2 = r2.bottom
            int r5 = r2 + r19
        L24d:
            int r2 = r15.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r15.getPaddingTop()
            int r5 = r5 - r2
            int r2 = r9.width
            if (r2 != r11) goto L266
            int r2 = r9.leftMargin
            if (r2 != r1) goto L266
            int r2 = r9.topMargin
            if (r2 != r5) goto L266
            r9.t r1 = r9.t.f11795g
            goto L289
        L266:
            r9.width = r11
            r9.leftMargin = r1
            r9.setMarginStart(r1)
            r9.topMargin = r5
            r4.setLayoutParams(r9)
            r9.t r1 = r9.t.f11796h
            goto L289
        L275:
            r20 = r5
            r21 = r7
            r22 = r10
            r9.t r1 = r9.t.f11797i
            goto L289
        L27e:
            r20 = r5
            r21 = r7
            r22 = r10
            r9.t r1 = r9.t.f11797i
            goto L289
        L287:
            r9.t r1 = r9.t.f11797i
        L289:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L31f
            r2 = 4
            r9 = 1
            if (r1 == r9) goto L2c1
            r5 = r16
            if (r1 != r5) goto L2bc
            if (r0 >= r2) goto L2b1
            int r11 = r0 + 1
            android.widget.RelativeLayout r12 = r6.f11784a
            java.util.WeakHashMap r0 = r3.f11677y
            r9.m r2 = new r9.m
            r9 = r19
            r5 = r20
            r7 = r21
            r10 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r9.d0.A0(r4, r12, r0, r2)
            goto L323
        L2b1:
            r5 = r20
            r1 = 0
            r3.u0(r5, r1)
            r3.y0(r5, r1)
            goto L323
        L2bc:
            okio.a.k()
            r0 = 0
            return r0
        L2c1:
            r9 = r19
            r5 = r20
            r7 = r21
            r10 = r22
            r1 = 0
            android.view.ViewGroup$LayoutParams r11 = r4.getLayoutParams()
            boolean r12 = r11 instanceof android.widget.RelativeLayout.LayoutParams
            if (r12 == 0) goto L2d5
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            goto L2d6
        L2d5:
            r11 = r1
        L2d6:
            if (r11 == 0) goto L308
            int r12 = r11.width
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            if (r12 <= 0) goto L2e1
            r1 = r13
        L2e1:
            if (r1 == 0) goto L2e8
            int r1 = r1.intValue()
            goto L2ec
        L2e8:
            int r1 = r4.getMeasuredWidth()
        L2ec:
            int r12 = r4.getMeasuredHeight()
            if (r1 <= 0) goto L308
            if (r12 > 0) goto L2f5
            goto L308
        L2f5:
            int r13 = r18.getPaddingLeft()
            int r14 = r11.leftMargin
            int r13 = r13 + r14
            int r14 = r18.getPaddingTop()
            int r11 = r11.topMargin
            int r14 = r14 + r11
            int r1 = r1 + r13
            int r12 = r12 + r14
            r4.layout(r13, r14, r1, r12)
        L308:
            r12 = 0
            r4.setVisibility(r12)
            if (r0 >= r2) goto L323
            r17 = 1
            int r11 = r0 + 1
            android.widget.RelativeLayout r12 = r6.f11784a
            java.util.WeakHashMap r0 = r3.f11677y
            r9.m r2 = new r9.m
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r9.d0.A0(r4, r12, r0, r2)
            goto L323
        L31f:
            r12 = 0
            r4.setVisibility(r12)
        L323:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
