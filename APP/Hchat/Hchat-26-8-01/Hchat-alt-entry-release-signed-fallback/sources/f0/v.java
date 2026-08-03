package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements android.view.inputmethod.InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.x f3012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w.q0 f3014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.d1 f3015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y1.l2 f3016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n2.s f3018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f3021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3022k;

    public v(n2.s r1, androidx.lifecycle.x r2, boolean r3, w.q0 r4, h0.d1 r5, y1.l2 r6) {
            r0 = this;
            r0.<init>()
            r0.f3012a = r2
            r0.f3013b = r3
            r0.f3014c = r4
            r0.f3015d = r5
            r0.f3016e = r6
            r0.f3018g = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3021j = r1
            r1 = 1
            r0.f3022k = r1
            return
    }

    public final void a(n2.g r2) {
            r1 = this;
            int r0 = r1.f3017f
            int r0 = r0 + 1
            r1.f3017f = r0
            java.util.ArrayList r0 = r1.f3021j     // Catch: java.lang.Throwable -> Lf
            r0.add(r2)     // Catch: java.lang.Throwable -> Lf
            r1.b()
            return
        Lf:
            r2 = move-exception
            r1.b()
            throw r2
    }

    public final boolean b() {
            r3 = this;
            int r0 = r3.f3017f
            int r0 = r0 + (-1)
            r3.f3017f = r0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = r3.f3021j
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            androidx.lifecycle.x r2 = r3.f3012a
            java.lang.Object r2 = r2.f310h
            f0.u r2 = (f0.u) r2
            fg.l r2 = r2.f3001c
            r2.invoke(r1)
            r0.clear()
        L23:
            int r0 = r3.f3017f
            if (r0 <= 0) goto L29
            r0 = 1
            return r0
        L29:
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
            r2 = this;
            boolean r0 = r2.f3022k
            if (r0 == 0) goto Lb
            int r0 = r2.f3017f
            r1 = 1
            int r0 = r0 + r1
            r2.f3017f = r0
            return r1
        Lb:
            return r0
    }

    public final void c(int r3) {
            r2 = this;
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r1 = 0
            r0.<init>(r1, r3)
            r2.sendKeyEvent(r0)
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r1 = 1
            r0.<init>(r1, r3)
            r2.sendKeyEvent(r0)
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int r1) {
            r0 = this;
            boolean r1 = r0.f3022k
            if (r1 == 0) goto L5
            r1 = 0
        L5:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
            r4 = this;
            java.util.ArrayList r0 = r4.f3021j
            r0.clear()
            r0 = 0
            r4.f3017f = r0
            r4.f3022k = r0
            androidx.lifecycle.x r1 = r4.f3012a
            java.lang.Object r1 = r1.f310h
            f0.u r1 = (f0.u) r1
            java.util.ArrayList r1 = r1.f3008j
            int r2 = r1.size()
        L16:
            if (r0 >= r2) goto L2f
            java.lang.Object r3 = r1.get(r0)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L2c
            r1.remove(r0)
            return
        L2c:
            int r0 = r0 + 1
            goto L16
        L2f:
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo r1) {
            r0 = this;
            boolean r1 = r0.f3022k
            if (r1 == 0) goto L5
            r1 = 0
        L5:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = r0.f3022k
            if (r1 == 0) goto L5
            r1 = 0
        L5:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo r1) {
            r0 = this;
            boolean r1 = r0.f3022k
            if (r1 == 0) goto L6
            boolean r1 = r0.f3013b
        L6:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.f3022k
            if (r0 == 0) goto L10
            n2.a r1 = new n2.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3, r4)
            r2.a(r1)
        L10:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f3022k
            if (r0 == 0) goto Le
            n2.e r0 = new n2.e
            r0.<init>(r2, r3)
            r1.a(r0)
            r2 = 1
            return r2
        Le:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f3022k
            if (r0 == 0) goto Le
            n2.f r0 = new n2.f
            r0.<init>(r2, r3)
            r1.a(r0)
            r2 = 1
            return r2
        Le:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
            r1 = this;
            boolean r0 = r1.b()
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
            r1 = this;
            boolean r0 = r1.f3022k
            if (r0 == 0) goto Ld
            n2.h r0 = new n2.h
            r0.<init>()
            r1.a(r0)
            r0 = 1
        Ld:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int r5) {
            r4 = this;
            n2.s r0 = r4.f3018g
            i2.g r1 = r0.f8976a
            java.lang.String r1 = r1.f6314h
            long r2 = r0.f8977b
            int r0 = i2.m0.f(r2)
            int r5 = android.text.TextUtils.getCapsMode(r1, r0, r5)
            return r5
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest r3, int r4) {
            r2 = this;
            r0 = 1
            r4 = r4 & r0
            r1 = 0
            if (r4 == 0) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            r2.f3020i = r0
            if (r0 == 0) goto L11
            if (r3 == 0) goto Lf
            int r1 = r3.token
        Lf:
            r2.f3019h = r1
        L11:
            n2.s r3 = r2.f3018g
            android.view.inputmethod.ExtractedText r3 = f0.q.d(r3)
            return r3
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int r3) {
            r2 = this;
            n2.s r3 = r2.f3018g
            long r0 = r3.f8977b
            boolean r3 = i2.m0.c(r0)
            if (r3 == 0) goto Lc
            r3 = 0
            return r3
        Lc:
            n2.s r3 = r2.f3018g
            i2.g r3 = ig.a.z(r3)
            java.lang.String r3 = r3.f6314h
            return r3
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int r1, int r2) {
            r0 = this;
            n2.s r2 = r0.f3018g
            i2.g r1 = ig.a.B(r2, r1)
            java.lang.String r1 = r1.f6314h
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int r1, int r2) {
            r0 = this;
            n2.s r2 = r0.f3018g
            i2.g r1 = ig.a.C(r2, r1)
            java.lang.String r1 = r1.f6314h
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int r3) {
            r2 = this;
            boolean r0 = r2.f3022k
            if (r0 == 0) goto L2d
            r0 = 0
            switch(r3) {
                case 16908319: goto L1b;
                case 16908320: goto L15;
                case 16908321: goto Lf;
                case 16908322: goto L9;
                default: goto L8;
            }
        L8:
            return r0
        L9:
            r3 = 279(0x117, float:3.91E-43)
            r2.c(r3)
            return r0
        Lf:
            r3 = 278(0x116, float:3.9E-43)
            r2.c(r3)
            return r0
        L15:
            r3 = 277(0x115, float:3.88E-43)
            r2.c(r3)
            return r0
        L1b:
            n2.r r3 = new n2.r
            n2.s r1 = r2.f3018g
            i2.g r1 = r1.f8976a
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            r3.<init>(r0, r1)
            r2.a(r3)
        L2d:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int r4) {
            r3 = this;
            boolean r0 = r3.f3022k
            if (r0 == 0) goto L3a
            r0 = 1
            if (r4 == 0) goto L1d
            switch(r4) {
                case 2: goto L29;
                case 3: goto L27;
                case 4: goto L25;
                case 5: goto L23;
                case 6: goto L21;
                case 7: goto L1f;
                default: goto La;
            }
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "IME sends unsupported Editor Action: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "RecordingIC"
            android.util.Log.w(r1, r4)
        L1d:
            r4 = r0
            goto L2a
        L1f:
            r4 = 5
            goto L2a
        L21:
            r4 = 7
            goto L2a
        L23:
            r4 = 6
            goto L2a
        L25:
            r4 = 4
            goto L2a
        L27:
            r4 = 3
            goto L2a
        L29:
            r4 = 2
        L2a:
            androidx.lifecycle.x r1 = r3.f3012a
            java.lang.Object r1 = r1.f310h
            f0.u r1 = (f0.u) r1
            fg.l r1 = r1.f3002d
            n2.i r2 = new n2.i
            r2.<init>(r4)
            r1.invoke(r2)
        L3a:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r20, java.util.concurrent.Executor r21, java.util.function.IntConsumer r22) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto L365
            b0.d0 r3 = new b0.d0
            r4 = 12
            r3.<init>(r0, r4)
            r4 = 0
            w.q0 r5 = r0.f3014c
            r6 = 3
            if (r5 == 0) goto L353
            i2.g r7 = r5.f14609j
            if (r7 != 0) goto L1f
            goto L353
        L1f:
            w.m1 r8 = r5.d()
            r9 = 0
            if (r8 == 0) goto L2f
            i2.k0 r8 = r8.f14569a
            i2.j0 r8 = r8.f6346a
            if (r8 == 0) goto L2f
            i2.g r8 = r8.f6334a
            goto L30
        L2f:
            r8 = r9
        L30:
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L38
            goto L353
        L38:
            boolean r6 = b0.a0.q(r20)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            r12 = 1
            h0.d1 r13 = r0.f3015d
            if (r6 == 0) goto L87
            android.view.inputmethod.SelectGesture r6 = b0.a0.j(r20)
            android.graphics.RectF r7 = f0.k.l(r6)
            e1.c r7 = f1.c0.y(r7)
            int r9 = f0.k.e(r6)
            if (r9 == r12) goto L5c
            r9 = r4
            goto L5d
        L5c:
            r9 = r12
        L5d:
            long r14 = f0.q.i(r5, r7, r9)
            boolean r5 = i2.m0.c(r14)
            if (r5 == 0) goto L71
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        L71:
            n2.r r5 = new n2.r
            long r6 = r14 >> r8
            int r6 = (int) r6
            long r7 = r14 & r10
            int r7 = (int) r7
            r5.<init>(r6, r7)
            r3.invoke(r5)
            if (r13 == 0) goto L84
            r13.h(r12)
        L84:
            r6 = r12
            goto L353
        L87:
            boolean r6 = b0.a0.x(r20)
            if (r6 == 0) goto Lbf
            android.view.inputmethod.DeleteGesture r6 = b0.a0.d(r20)
            int r8 = f0.k.c(r6)
            if (r8 == r12) goto L99
            r8 = r4
            goto L9a
        L99:
            r8 = r12
        L9a:
            android.graphics.RectF r9 = f0.k.j(r6)
            e1.c r9 = f1.c0.y(r9)
            long r9 = f0.q.i(r5, r9, r8)
            boolean r5 = i2.m0.c(r9)
            if (r5 == 0) goto Lb6
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        Lb6:
            if (r8 != r12) goto Lba
            r5 = r12
            goto Lbb
        Lba:
            r5 = r4
        Lbb:
            f0.q.n(r9, r7, r5, r3)
            goto L84
        Lbf:
            boolean r6 = b0.a0.z(r20)
            if (r6 == 0) goto L10b
            android.view.inputmethod.SelectRangeGesture r6 = b0.a0.k(r20)
            android.graphics.RectF r7 = b0.a0.c(r6)
            e1.c r7 = f1.c0.y(r7)
            android.graphics.RectF r9 = b0.a0.r(r6)
            e1.c r9 = f1.c0.y(r9)
            int r14 = f0.k.f(r6)
            if (r14 == r12) goto Le1
            r14 = r4
            goto Le2
        Le1:
            r14 = r12
        Le2:
            long r14 = f0.q.b(r5, r7, r9, r14)
            boolean r5 = i2.m0.c(r14)
            if (r5 == 0) goto Lf6
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        Lf6:
            n2.r r5 = new n2.r
            long r6 = r14 >> r8
            int r6 = (int) r6
            long r7 = r14 & r10
            int r7 = (int) r7
            r5.<init>(r6, r7)
            r3.invoke(r5)
            if (r13 == 0) goto L84
            r13.h(r12)
            goto L84
        L10b:
            boolean r6 = b0.a0.B(r20)
            if (r6 == 0) goto L14c
            android.view.inputmethod.DeleteRangeGesture r6 = b0.a0.e(r20)
            int r8 = f0.k.d(r6)
            if (r8 == r12) goto L11d
            r8 = r4
            goto L11e
        L11d:
            r8 = r12
        L11e:
            android.graphics.RectF r9 = f0.k.k(r6)
            e1.c r9 = f1.c0.y(r9)
            android.graphics.RectF r10 = f0.k.v(r6)
            e1.c r10 = f1.c0.y(r10)
            long r9 = f0.q.b(r5, r9, r10, r8)
            boolean r5 = i2.m0.c(r9)
            if (r5 == 0) goto L142
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        L142:
            if (r8 != r12) goto L146
            r5 = r12
            goto L147
        L146:
            r5 = r4
        L147:
            f0.q.n(r9, r7, r5, r3)
            goto L84
        L14c:
            boolean r6 = b0.a0.D(r20)
            r10 = 2
            y1.l2 r11 = r0.f3016e
            r13 = -1
            if (r6 == 0) goto L1e7
            android.view.inputmethod.JoinOrSplitGesture r6 = b0.a0.h(r20)
            if (r11 != 0) goto L166
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        L166:
            android.graphics.PointF r9 = f0.k.h(r6)
            long r14 = f0.q.e(r9)
            int r9 = f0.q.a(r5, r14, r11)
            if (r9 == r13) goto L1dd
            w.m1 r5 = r5.d()
            if (r5 == 0) goto L183
            i2.k0 r5 = r5.f14569a
            boolean r5 = f0.q.c(r5, r9)
            if (r5 != r12) goto L183
            goto L1dd
        L183:
            r5 = r9
        L184:
            if (r5 <= 0) goto L197
            int r6 = java.lang.Character.codePointBefore(r7, r5)
            boolean r11 = f0.q.k(r6)
            if (r11 != 0) goto L191
            goto L197
        L191:
            int r6 = java.lang.Character.charCount(r6)
            int r5 = r5 - r6
            goto L184
        L197:
            java.lang.String r6 = r7.f6314h
            int r6 = r6.length()
            if (r9 >= r6) goto L1b0
            int r6 = java.lang.Character.codePointAt(r7, r9)
            boolean r11 = f0.q.k(r6)
            if (r11 != 0) goto L1aa
            goto L1b0
        L1aa:
            int r6 = java.lang.Character.charCount(r6)
            int r9 = r9 + r6
            goto L197
        L1b0:
            long r5 = i2.e0.b(r5, r9)
            boolean r9 = i2.m0.c(r5)
            if (r9 == 0) goto L1d8
            long r5 = r5 >> r8
            int r5 = (int) r5
            n2.r r6 = new n2.r
            r6.<init>(r5, r5)
            n2.a r5 = new n2.a
            java.lang.String r7 = " "
            r5.<init>(r7, r12)
            n2.g[] r7 = new n2.g[r10]
            r7[r4] = r6
            r7[r12] = r5
            f0.m r5 = new f0.m
            r5.<init>(r7)
            r3.invoke(r5)
            goto L84
        L1d8:
            f0.q.n(r5, r7, r4, r3)
            goto L84
        L1dd:
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        L1e7:
            boolean r6 = b0.a0.t(r20)
            if (r6 == 0) goto L242
            android.view.inputmethod.InsertGesture r6 = b0.a0.g(r20)
            if (r11 != 0) goto L1fd
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        L1fd:
            android.graphics.PointF r7 = b0.a0.b(r6)
            long r7 = f0.q.e(r7)
            int r7 = f0.q.a(r5, r7, r11)
            if (r7 == r13) goto L238
            w.m1 r5 = r5.d()
            if (r5 == 0) goto L21a
            i2.k0 r5 = r5.f14569a
            boolean r5 = f0.q.c(r5, r7)
            if (r5 != r12) goto L21a
            goto L238
        L21a:
            java.lang.String r5 = f0.k.p(r6)
            n2.r r6 = new n2.r
            r6.<init>(r7, r7)
            n2.a r7 = new n2.a
            r7.<init>(r5, r12)
            n2.g[] r5 = new n2.g[r10]
            r5[r4] = r6
            r5[r12] = r7
            f0.m r6 = new f0.m
            r6.<init>(r5)
            r3.invoke(r6)
            goto L84
        L238:
            android.view.inputmethod.HandwritingGesture r5 = b0.a0.f(r6)
            int r6 = f0.q.g(r5, r3)
            goto L353
        L242:
            boolean r6 = b0.a0.v(r20)
            if (r6 == 0) goto L352
            android.view.inputmethod.RemoveSpaceGesture r6 = b0.a0.i(r20)
            w.m1 r14 = r5.d()
            if (r14 == 0) goto L254
            i2.k0 r9 = r14.f14569a
        L254:
            android.graphics.PointF r14 = f0.k.i(r6)
            long r14 = f0.q.e(r14)
            android.graphics.PointF r16 = f0.k.u(r6)
            r18 = r5
            long r4 = f0.q.e(r16)
            r16 = r8
            v1.t r8 = r18.c()
            if (r9 == 0) goto L2d0
            i2.o r9 = r9.f6347b
            if (r8 != 0) goto L273
            goto L2d0
        L273:
            long r14 = r8.j0(r14)
            long r4 = r8.j0(r4)
            int r8 = f0.q.h(r9, r14, r11)
            int r11 = f0.q.h(r9, r4, r11)
            if (r8 != r13) goto L28a
            if (r11 != r13) goto L292
            long r4 = i2.m0.f6358b
            goto L2d2
        L28a:
            if (r11 != r13) goto L28d
            goto L291
        L28d:
            int r8 = java.lang.Math.min(r8, r11)
        L291:
            r11 = r8
        L292:
            float r8 = r9.f(r11)
            float r11 = r9.b(r11)
            float r11 = r11 + r8
            float r8 = (float) r10
            float r11 = r11 / r8
            e1.c r8 = new e1.c
            long r14 = r14 >> r16
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            long r4 = r4 >> r16
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = java.lang.Math.min(r15, r5)
            r20 = 1036831949(0x3dcccccd, float:0.1)
            float r15 = r11 - r20
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = java.lang.Math.max(r14, r4)
            float r11 = r11 + r20
            r8.<init>(r5, r15, r4, r11)
            g1.d r4 = i2.i0.f6331a
            r5 = 0
            long r8 = r9.h(r8, r5, r4)
            r4 = r8
            goto L2d2
        L2d0:
            long r4 = i2.m0.f6358b
        L2d2:
            boolean r8 = i2.m0.c(r4)
            if (r8 == 0) goto L2e1
            android.view.inputmethod.HandwritingGesture r4 = b0.a0.f(r6)
            int r6 = f0.q.g(r4, r3)
            goto L353
        L2e1:
            gg.s r8 = new gg.s
            r8.<init>()
            r8.f4562g = r13
            gg.s r9 = new gg.s
            r9.<init>()
            r9.f4562g = r13
            int r11 = i2.m0.f(r4)
            int r14 = i2.m0.e(r4)
            i2.g r7 = r7.b(r11, r14)
            java.lang.String r7 = r7.f6314h
            og.k r11 = new og.k
            java.lang.String r14 = "\\s+"
            r11.<init>(r14)
            f0.l r14 = new f0.l
            r15 = 0
            r14.<init>(r8, r9, r15)
            java.lang.String r7 = r11.e(r7, r14)
            int r8 = r8.f4562g
            if (r8 == r13) goto L349
            int r11 = r9.f4562g
            if (r11 != r13) goto L317
            goto L349
        L317:
            long r13 = r4 >> r16
            int r6 = (int) r13
            int r13 = r6 + r8
            int r6 = r6 + r11
            int r11 = r7.length()
            int r4 = i2.m0.d(r4)
            int r5 = r9.f4562g
            int r4 = r4 - r5
            int r11 = r11 - r4
            java.lang.String r4 = r7.substring(r8, r11)
            n2.r r5 = new n2.r
            r5.<init>(r13, r6)
            n2.a r6 = new n2.a
            r6.<init>(r4, r12)
            n2.g[] r4 = new n2.g[r10]
            r17 = 0
            r4[r17] = r5
            r4[r12] = r6
            f0.m r5 = new f0.m
            r5.<init>(r4)
            r3.invoke(r5)
            goto L84
        L349:
            android.view.inputmethod.HandwritingGesture r4 = b0.a0.f(r6)
            int r6 = f0.q.g(r4, r3)
            goto L353
        L352:
            r6 = r10
        L353:
            if (r2 != 0) goto L356
            goto L365
        L356:
            if (r1 == 0) goto L362
            f0.d r3 = new f0.d
            r15 = 0
            r3.<init>(r6, r15, r2)
            r1.execute(r3)
            return
        L362:
            r2.accept(r6)
        L365:
            return
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            boolean r1 = r0.f3022k
            if (r1 == 0) goto L5
            r1 = 1
        L5:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture r9, android.os.CancellationSignal r10) {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto L143
            w.q0 r0 = r8.f3014c
            if (r0 == 0) goto L143
            i2.g r1 = r0.f14609j
            if (r1 != 0) goto L11
            goto L143
        L11:
            w.m1 r3 = r0.d()
            if (r3 == 0) goto L20
            i2.k0 r3 = r3.f14569a
            i2.j0 r3 = r3.f6346a
            if (r3 == 0) goto L20
            i2.g r3 = r3.f6334a
            goto L21
        L20:
            r3 = 0
        L21:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            goto L143
        L29:
            boolean r1 = b0.a0.q(r9)
            w.h0 r3 = w.h0.f14484g
            h0.d1 r4 = r8.f3015d
            r5 = 1
            if (r1 == 0) goto L6d
            android.view.inputmethod.SelectGesture r9 = b0.a0.j(r9)
            if (r4 == 0) goto L137
            android.graphics.RectF r1 = f0.k.l(r9)
            e1.c r1 = f1.c0.y(r1)
            int r9 = f0.k.e(r9)
            if (r9 == r5) goto L4a
            r9 = r2
            goto L4b
        L4a:
            r9 = r5
        L4b:
            long r0 = f0.q.i(r0, r1, r9)
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto L56
            r9.f(r0)
        L56:
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto L5f
            long r6 = i2.m0.f6358b
            r9.e(r6)
        L5f:
            boolean r9 = i2.m0.c(r0)
            if (r9 != 0) goto L137
            r4.t(r2)
            r4.q(r3)
            goto L137
        L6d:
            boolean r1 = b0.a0.x(r9)
            if (r1 == 0) goto Lac
            android.view.inputmethod.DeleteGesture r9 = b0.a0.d(r9)
            if (r4 == 0) goto L137
            android.graphics.RectF r1 = f0.k.j(r9)
            e1.c r1 = f1.c0.y(r1)
            int r9 = f0.k.c(r9)
            if (r9 == r5) goto L89
            r9 = r2
            goto L8a
        L89:
            r9 = r5
        L8a:
            long r0 = f0.q.i(r0, r1, r9)
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto L95
            r9.e(r0)
        L95:
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto L9e
            long r6 = i2.m0.f6358b
            r9.f(r6)
        L9e:
            boolean r9 = i2.m0.c(r0)
            if (r9 != 0) goto L137
            r4.t(r2)
            r4.q(r3)
            goto L137
        Lac:
            boolean r1 = b0.a0.z(r9)
            if (r1 == 0) goto Lf2
            android.view.inputmethod.SelectRangeGesture r9 = b0.a0.k(r9)
            if (r4 == 0) goto L137
            android.graphics.RectF r1 = b0.a0.c(r9)
            e1.c r1 = f1.c0.y(r1)
            android.graphics.RectF r6 = b0.a0.r(r9)
            e1.c r6 = f1.c0.y(r6)
            int r9 = f0.k.f(r9)
            if (r9 == r5) goto Ld0
            r9 = r2
            goto Ld1
        Ld0:
            r9 = r5
        Ld1:
            long r0 = f0.q.b(r0, r1, r6, r9)
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto Ldc
            r9.f(r0)
        Ldc:
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto Le5
            long r6 = i2.m0.f6358b
            r9.e(r6)
        Le5:
            boolean r9 = i2.m0.c(r0)
            if (r9 != 0) goto L137
            r4.t(r2)
            r4.q(r3)
            goto L137
        Lf2:
            boolean r1 = b0.a0.B(r9)
            if (r1 == 0) goto L143
            android.view.inputmethod.DeleteRangeGesture r9 = b0.a0.e(r9)
            if (r4 == 0) goto L137
            android.graphics.RectF r1 = f0.k.k(r9)
            e1.c r1 = f1.c0.y(r1)
            android.graphics.RectF r6 = f0.k.v(r9)
            e1.c r6 = f1.c0.y(r6)
            int r9 = f0.k.d(r9)
            if (r9 == r5) goto L116
            r9 = r2
            goto L117
        L116:
            r9 = r5
        L117:
            long r0 = f0.q.b(r0, r1, r6, r9)
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto L122
            r9.e(r0)
        L122:
            w.q0 r9 = r4.f4850d
            if (r9 == 0) goto L12b
            long r6 = i2.m0.f6358b
            r9.f(r6)
        L12b:
            boolean r9 = i2.m0.c(r0)
            if (r9 != 0) goto L137
            r4.t(r2)
            r4.q(r3)
        L137:
            if (r10 == 0) goto L142
            e2.d r9 = new e2.d
            r0 = 1
            r9.<init>(r4, r0)
            r10.setOnCancelListener(r9)
        L142:
            return r5
        L143:
            return r2
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int r10) {
            r9 = this;
            boolean r0 = r9.f3022k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            androidx.lifecycle.x r4 = r9.f3012a
            java.lang.Object r4 = r4.f310h
            f0.u r4 = (f0.u) r4
            f0.r r4 = r4.f3011m
            java.lang.Object r7 = r4.f2982c
            monitor-enter(r7)
            r4.f2985f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f2986g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f2987h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f2988i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f2984e = r2     // Catch: java.lang.Throwable -> L6f
            n2.s r10 = r4.f2989j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f2983d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = r1.f3022k
            if (r0 == 0) goto L17
            androidx.lifecycle.x r0 = r1.f3012a
            java.lang.Object r0 = r0.f310h
            f0.u r0 = (f0.u) r0
            java.lang.Object r0 = r0.f3009k
            java.lang.Object r0 = r0.getValue()
            android.view.inputmethod.BaseInputConnection r0 = (android.view.inputmethod.BaseInputConnection) r0
            r0.sendKeyEvent(r2)
            r2 = 1
            return r2
        L17:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.f3022k
            if (r0 == 0) goto Lc
            n2.p r1 = new n2.p
            r1.<init>(r3, r4)
            r2.a(r1)
        Lc:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.f3022k
            if (r0 == 0) goto L10
            n2.q r1 = new n2.q
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.<init>(r3, r4)
            r2.a(r1)
        L10:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f3022k
            if (r0 == 0) goto Le
            n2.r r0 = new n2.r
            r0.<init>(r2, r3)
            r1.a(r0)
            r2 = 1
            return r2
        Le:
            return r0
    }
}
