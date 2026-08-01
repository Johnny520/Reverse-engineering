package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mi implements android.text.method.KeyListener {
    public final android.text.method.KeyListener a;
    public final defpackage.vh b;

    public mi(android.text.method.KeyListener r3) {
            r2 = this;
            vh r0 = new vh
            r1 = 19
            r0.<init>(r1)
            r2.<init>()
            r2.a = r3
            r2.b = r0
            return
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View r2, android.text.Editable r3, int r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.a
            r0.clearMetaKeyState(r2, r3, r4)
            return
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
            r1 = this;
            android.text.method.KeyListener r0 = r1.a
            int r0 = r0.getInputType()
            return r0
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
            r3 = this;
            vh r0 = r3.b
            r0.getClass()
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L16
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto L11
            r0 = r2
            goto L1a
        L11:
            boolean r0 = defpackage.d4.b(r5, r7, r1)
            goto L1a
        L16:
            boolean r0 = defpackage.d4.b(r5, r7, r2)
        L1a:
            if (r0 == 0) goto L21
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            r0 = r1
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 != 0) goto L2e
            android.text.method.KeyListener r0 = r3.a
            boolean r4 = r0.onKeyDown(r4, r5, r6, r7)
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            return r2
        L2e:
            return r1
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View r2, android.text.Editable r3, android.view.KeyEvent r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.a
            boolean r2 = r0.onKeyOther(r2, r3, r4)
            return r2
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View r2, android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.a
            boolean r2 = r0.onKeyUp(r2, r3, r4, r5)
            return r2
    }
}
