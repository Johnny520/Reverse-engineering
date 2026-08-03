package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.t f8929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.c f8930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f8931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n2.s f8938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i2.k0 f8939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b5.k f8940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fg.l f8941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e1.c f8942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e1.c f8943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.view.inputmethod.CursorAnchorInfo.Builder f8944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f8945q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final android.graphics.Matrix f8946r;

    public c(y1.t r1, b5.c r2) {
            r0 = this;
            r0.<init>()
            r0.f8929a = r1
            r0.f8930b = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f8931c = r1
            n2.b r1 = n2.b.f8923i
            r0.f8941m = r1
            android.view.inputmethod.CursorAnchorInfo$Builder r1 = new android.view.inputmethod.CursorAnchorInfo$Builder
            r1.<init>()
            r0.f8944p = r1
            float[] r1 = f1.i0.a()
            r0.f8945q = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.f8946r = r1
            return
    }

    public final void a() {
            r29 = this;
            r0 = r29
            b5.c r1 = r0.f8930b
            java.lang.Object r2 = r1.f470b
            java.lang.Object r3 = r2.getValue()
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.Object r1 = r1.f469a
            android.view.View r1 = (android.view.View) r1
            boolean r3 = r3.isActive(r1)
            if (r3 != 0) goto L17
            return
        L17:
            fg.l r3 = r0.f8941m
            f1.i0 r4 = new f1.i0
            float[] r5 = r0.f8945q
            r4.<init>(r5)
            r3.invoke(r4)
            y1.t r3 = r0.f8929a
            r3.v(r5)
            android.graphics.Matrix r3 = r0.f8946r
            f1.c0.p(r3, r5)
            n2.s r4 = r0.f8938j
            r4.getClass()
            long r5 = r4.f8977b
            b5.k r7 = r0.f8940l
            r7.getClass()
            i2.k0 r8 = r0.f8939k
            r8.getClass()
            i2.o r9 = r8.f6347b
            e1.c r10 = r0.f8942n
            r10.getClass()
            float r11 = r10.f2299d
            float r12 = r10.f2297b
            e1.c r13 = r0.f8943o
            r13.getClass()
            boolean r14 = r0.f8934f
            boolean r15 = r0.f8935g
            r16 = r2
            boolean r2 = r0.f8936h
            r17 = r2
            boolean r2 = r0.f8937i
            r25 = r2
            android.view.inputmethod.CursorAnchorInfo$Builder r2 = r0.f8944p
            r2.reset()
            r2.setMatrix(r3)
            i2.m0 r3 = r4.f8978c
            r18 = r5
            int r5 = i2.m0.f(r18)
            int r6 = i2.m0.e(r18)
            r2.setSelectionRange(r5, r6)
            t2.j r6 = t2.j.f13012h
            r18 = r2
            r26 = 1
            if (r14 == 0) goto Ld2
            if (r5 >= 0) goto L7e
            goto Ld2
        L7e:
            r7.l(r5)
            e1.c r14 = r8.c(r5)
            float r2 = r14.f2296a
            r27 = r1
            long r0 = r8.f6348c
            r19 = 32
            long r0 = r0 >> r19
            int r0 = (int) r0
            float r0 = (float) r0
            r1 = 0
            float r0 = r9.e0.q(r2, r1, r0)
            float r1 = r14.f2297b
            boolean r1 = be.h.p(r10, r0, r1)
            float r2 = r14.f2299d
            boolean r2 = be.h.p(r10, r0, r2)
            t2.j r5 = r8.a(r5)
            if (r5 != r6) goto Lab
            r5 = r26
            goto Lac
        Lab:
            r5 = 0
        Lac:
            if (r1 != 0) goto Lb4
            if (r2 == 0) goto Lb1
            goto Lb4
        Lb1:
            r19 = 0
            goto Lb6
        Lb4:
            r19 = r26
        Lb6:
            if (r1 == 0) goto Lba
            if (r2 != 0) goto Lbc
        Lba:
            r19 = r19 | 2
        Lbc:
            if (r5 == 0) goto Lc0
            r19 = r19 | 4
        Lc0:
            r23 = r19
            float r1 = r14.f2297b
            float r2 = r14.f2299d
            r22 = r2
            r19 = r0
            r20 = r1
            r21 = r2
            r18.setInsertionMarkerLocation(r19, r20, r21, r22, r23)
            goto Ld4
        Ld2:
            r27 = r1
        Ld4:
            r0 = r18
            if (r15 == 0) goto L187
            r1 = -1
            if (r3 == 0) goto Le2
            long r14 = r3.f6360a
            int r2 = i2.m0.f(r14)
            goto Le3
        Le2:
            r2 = r1
        Le3:
            if (r3 == 0) goto Leb
            long r14 = r3.f6360a
            int r1 = i2.m0.e(r14)
        Leb:
            if (r2 < 0) goto L187
            if (r2 >= r1) goto L187
            i2.g r3 = r4.f8976a
            java.lang.String r3 = r3.f6314h
            java.lang.CharSequence r3 = r3.subSequence(r2, r1)
            r0.setComposingText(r2, r3)
            r7.l(r2)
            r7.l(r1)
            int r3 = r1 - r2
            int r3 = r3 * 4
            float[] r3 = new float[r3]
            long r4 = i2.e0.b(r2, r1)
            r9.a(r4, r3)
            r4 = r2
        L10e:
            if (r4 >= r1) goto L187
            r7.l(r4)
            int r5 = r4 - r2
            int r5 = r5 * 4
            r14 = r3[r5]
            int r15 = r5 + 1
            r15 = r3[r15]
            int r18 = r5 + 2
            r19 = r0
            r0 = r3[r18]
            int r5 = r5 + 3
            r5 = r3[r5]
            r28 = r1
            float r1 = r10.f2296a
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 >= 0) goto L132
            r18 = r26
            goto L134
        L132:
            r18 = 0
        L134:
            float r1 = r10.f2298c
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L13d
            r1 = r26
            goto L13e
        L13d:
            r1 = 0
        L13e:
            r1 = r18 & r1
            int r18 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r18 >= 0) goto L147
            r18 = r26
            goto L149
        L147:
            r18 = 0
        L149:
            r1 = r1 & r18
            int r18 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r18 >= 0) goto L152
            r18 = r26
            goto L154
        L152:
            r18 = 0
        L154:
            r1 = r1 & r18
            boolean r18 = be.h.p(r10, r14, r15)
            if (r18 == 0) goto L166
            boolean r18 = be.h.p(r10, r0, r5)
            if (r18 != 0) goto L163
            goto L166
        L163:
            r22 = r0
            goto L169
        L166:
            r1 = r1 | 2
            goto L163
        L169:
            t2.j r0 = r8.a(r4)
            if (r0 != r6) goto L171
            r1 = r1 | 4
        L171:
            r24 = r1
            r23 = r5
            r20 = r14
            r21 = r15
            r18 = r19
            r19 = r4
            r18.addCharacterBounds(r19, r20, r21, r22, r23, r24)
            r0 = r18
            int r4 = r19 + 1
            r1 = r28
            goto L10e
        L187:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L1aa
            if (r17 == 0) goto L1aa
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = ai.a.m()
            android.graphics.RectF r3 = f1.c0.u(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = ai.a.n(r2, r3)
            android.graphics.RectF r3 = f1.c0.u(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = ai.a.D(r2, r3)
            android.view.inputmethod.EditorBoundsInfo r2 = ai.a.o(r2)
            ai.a.l(r0, r2)
        L1aa:
            r2 = 34
            if (r1 < r2) goto L1e8
            if (r25 == 0) goto L1e8
            boolean r1 = r10.f()
            if (r1 != 0) goto L1e8
            int r1 = r9.f6373f
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L1bd
            r1 = 0
        L1bd:
            int r2 = r9.e(r12)
            r3 = 0
            int r2 = r9.e0.r(r2, r3, r1)
            int r4 = r9.e(r11)
            int r1 = r9.e0.r(r4, r3, r1)
            if (r2 > r1) goto L1e8
        L1d0:
            float r3 = r8.e(r2)
            float r4 = r9.f(r2)
            float r5 = r8.f(r2)
            float r6 = r9.b(r2)
            b0.a0.n(r0, r3, r4, r5, r6)
            if (r2 == r1) goto L1e8
            int r2 = r2 + 1
            goto L1d0
        L1e8:
            android.view.inputmethod.CursorAnchorInfo r0 = r0.build()
            java.lang.Object r1 = r16.getValue()
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = r27
            r1.updateCursorAnchorInfo(r2, r0)
            r3 = 0
            r0 = r29
            r0.f8933e = r3
            return
    }
}
