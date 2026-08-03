package a;

/* JADX INFO: loaded from: classes.dex */
public final class P5 implements android.text.method.KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.text.method.KeyListener f206a;
    public final a.P5.a b;

    public static class a {
    }

    public P5(android.text.method.KeyListener r2) {
            r1 = this;
            a.P5$a r0 = new a.P5$a
            r0.<init>()
            r1.<init>()
            r1.f206a = r2
            r1.b = r0
            return
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View r2, android.text.Editable r3, int r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f206a
            r0.clearMetaKeyState(r2, r3, r4)
            return
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f206a
            int r0 = r0.getInputType()
            return r0
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
            r3 = this;
            a.P5$a r0 = r3.b
            r0.getClass()
            r0 = 67
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L16
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto L11
            r0 = r1
            goto L1a
        L11:
            boolean r0 = a.Q5.a(r5, r7, r2)
            goto L1a
        L16:
            boolean r0 = a.Q5.a(r5, r7, r1)
        L1a:
            if (r0 == 0) goto L21
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L2e
            android.text.method.KeyListener r0 = r3.f206a
            boolean r4 = r0.onKeyDown(r4, r5, r6, r7)
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            return r1
        L2e:
            return r2
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View r2, android.text.Editable r3, android.view.KeyEvent r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f206a
            boolean r2 = r0.onKeyOther(r2, r3, r4)
            return r2
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View r2, android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f206a
            boolean r2 = r0.onKeyUp(r2, r3, r4, r5)
            return r2
    }
}
