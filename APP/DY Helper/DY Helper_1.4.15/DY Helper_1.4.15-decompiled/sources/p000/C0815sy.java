package p000;

/* JADX INFO: renamed from: sy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0815sy implements android.text.method.KeyListener {

    /* JADX INFO: renamed from: α */
    public final android.text.method.KeyListener f10081;

    public C0815sy(android.text.method.KeyListener r1) {
            r0 = this;
            r0.<init>()
            r0.f10081 = r1
            return
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View r1, android.text.Editable r2, int r3) {
            r0 = this;
            android.text.method.KeyListener r0 = r0.f10081
            r0.clearMetaKeyState(r1, r2, r3)
            return
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
            r0 = this;
            android.text.method.KeyListener r0 = r0.f10081
            int r0 = r0.getInputType()
            return r0
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
            r3 = this;
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L11
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto Lc
            r0 = r2
            goto L15
        Lc:
            boolean r0 = p000.C0538m6.m3753(r5, r7, r1)
            goto L15
        L11:
            boolean r0 = p000.C0538m6.m3753(r5, r7, r2)
        L15:
            if (r0 == 0) goto L1c
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            r0 = r1
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 != 0) goto L29
            android.text.method.KeyListener r3 = r3.f10081
            boolean r3 = r3.onKeyDown(r4, r5, r6, r7)
            if (r3 == 0) goto L28
            goto L29
        L28:
            return r2
        L29:
            return r1
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View r1, android.text.Editable r2, android.view.KeyEvent r3) {
            r0 = this;
            android.text.method.KeyListener r0 = r0.f10081
            boolean r0 = r0.onKeyOther(r1, r2, r3)
            return r0
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View r1, android.text.Editable r2, int r3, android.view.KeyEvent r4) {
            r0 = this;
            android.text.method.KeyListener r0 = r0.f10081
            boolean r0 = r0.onKeyUp(r1, r2, r3, r4)
            return r0
    }
}
