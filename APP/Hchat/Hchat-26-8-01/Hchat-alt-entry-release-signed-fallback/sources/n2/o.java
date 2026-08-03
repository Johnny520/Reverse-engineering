package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements android.view.inputmethod.InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.a f8962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n2.s f8965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f8968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8969h;

    public o(n2.s r1, m.a r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f8962a = r2
            r0.f8963b = r3
            r0.f8965d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8968g = r1
            r1 = 1
            r0.f8969h = r1
            return
    }

    public final void a(n2.g r2) {
            r1 = this;
            int r0 = r1.f8964c
            int r0 = r0 + 1
            r1.f8964c = r0
            java.util.ArrayList r0 = r1.f8968g     // Catch: java.lang.Throwable -> Lf
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
            int r0 = r3.f8964c
            int r0 = r0 + (-1)
            r3.f8964c = r0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = r3.f8968g
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            m.a r2 = r3.f8962a
            java.lang.Object r2 = r2.f8069h
            n2.v r2 = (n2.v) r2
            fg.l r2 = r2.f8990e
            r2.invoke(r1)
            r0.clear()
        L23:
            int r0 = r3.f8964c
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
            boolean r0 = r2.f8969h
            if (r0 == 0) goto Lb
            int r0 = r2.f8964c
            r1 = 1
            int r0 = r0 + r1
            r2.f8964c = r0
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
            boolean r1 = r0.f8969h
            if (r1 == 0) goto L5
            r1 = 0
        L5:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
            r4 = this;
            java.util.ArrayList r0 = r4.f8968g
            r0.clear()
            r0 = 0
            r4.f8964c = r0
            r4.f8969h = r0
            m.a r1 = r4.f8962a
            java.lang.Object r1 = r1.f8069h
            n2.v r1 = (n2.v) r1
            java.util.ArrayList r1 = r1.f8994i
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
            boolean r1 = r0.f8969h
            if (r1 == 0) goto L5
            r1 = 0
        L5:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = r0.f8969h
            if (r1 == 0) goto L5
            r1 = 0
        L5:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo r1) {
            r0 = this;
            boolean r1 = r0.f8969h
            if (r1 == 0) goto L6
            boolean r1 = r0.f8963b
        L6:
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.f8969h
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
            boolean r0 = r1.f8969h
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
            boolean r0 = r1.f8969h
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
            boolean r0 = r1.f8969h
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
            n2.s r0 = r4.f8965d
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
            r2.f8967f = r0
            if (r0 == 0) goto L11
            if (r3 == 0) goto Lf
            int r1 = r3.token
        Lf:
            r2.f8966e = r1
        L11:
            n2.s r3 = r2.f8965d
            android.view.inputmethod.ExtractedText r3 = fb.v0.N(r3)
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
            n2.s r3 = r2.f8965d
            long r0 = r3.f8977b
            boolean r3 = i2.m0.c(r0)
            if (r3 == 0) goto Lc
            r3 = 0
            return r3
        Lc:
            n2.s r3 = r2.f8965d
            i2.g r3 = ig.a.z(r3)
            java.lang.String r3 = r3.f6314h
            return r3
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int r1, int r2) {
            r0 = this;
            n2.s r2 = r0.f8965d
            i2.g r1 = ig.a.B(r2, r1)
            java.lang.String r1 = r1.f6314h
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int r1, int r2) {
            r0 = this;
            n2.s r2 = r0.f8965d
            i2.g r1 = ig.a.C(r2, r1)
            java.lang.String r1 = r1.f6314h
            return r1
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int r3) {
            r2 = this;
            boolean r0 = r2.f8969h
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
            n2.s r1 = r2.f8965d
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
            boolean r0 = r3.f8969h
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
            m.a r1 = r3.f8962a
            java.lang.Object r1 = r1.f8069h
            n2.v r1 = (n2.v) r1
            fg.l r1 = r1.f8991f
            n2.i r2 = new n2.i
            r2.<init>(r4)
            r1.invoke(r2)
        L3a:
            return r0
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            boolean r1 = r0.f8969h
            if (r1 == 0) goto L5
            r1 = 1
        L5:
            return r1
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
            boolean r0 = r9.f8969h
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
            m.a r4 = r9.f8962a
            java.lang.Object r4 = r4.f8069h
            n2.v r4 = (n2.v) r4
            n2.c r4 = r4.f8997l
            java.lang.Object r7 = r4.f8931c
            monitor-enter(r7)
            r4.f8934f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f8935g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f8936h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f8937i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f8933e = r2     // Catch: java.lang.Throwable -> L6f
            n2.s r10 = r4.f8938j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f8932d = r3     // Catch: java.lang.Throwable -> L6f
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
            boolean r0 = r1.f8969h
            if (r0 == 0) goto L17
            m.a r0 = r1.f8962a
            java.lang.Object r0 = r0.f8069h
            n2.v r0 = (n2.v) r0
            java.lang.Object r0 = r0.f8995j
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
            boolean r0 = r2.f8969h
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
            boolean r0 = r2.f8969h
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
            boolean r0 = r1.f8969h
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
