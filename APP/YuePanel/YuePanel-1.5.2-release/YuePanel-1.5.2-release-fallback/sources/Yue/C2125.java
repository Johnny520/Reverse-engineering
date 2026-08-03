package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(19)
public final class C2125 implements android.text.method.KeyListener {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.text.method.KeyListener f6677;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C2125.C2126 f6678;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۦ$ۥ, reason: contains not printable characters */
    public static class C2126 {
        public C2126() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m10012(@Yue.InterfaceC4410 android.text.Editable r1, int r2, @Yue.InterfaceC4410 android.view.KeyEvent r3) {
                r0 = this;
                boolean r1 = androidx.emoji2.text.C7527.m28939(r1, r2, r3)
                return r1
        }
    }

    public C2125(android.text.method.KeyListener r2) {
            r1 = this;
            Yue.ۥ۠۠ۦۦ$ۥ r0 = new Yue.ۥ۠۠ۦۦ$ۥ
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public C2125(android.text.method.KeyListener r1, Yue.C2125.C2126 r2) {
            r0 = this;
            r0.<init>()
            r0.f6677 = r1
            r0.f6678 = r2
            return
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(android.view.View r2, android.text.Editable r3, int r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f6677
            r0.clearMetaKeyState(r2, r3, r4)
            return
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f6677
            int r0 = r0.getInputType()
            return r0
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(android.view.View r2, android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r1 = this;
            Yue.ۥ۠۠ۦۦ$ۥ r0 = r1.f6678
            boolean r0 = r0.m10012(r3, r4, r5)
            if (r0 != 0) goto L13
            android.text.method.KeyListener r0 = r1.f6677
            boolean r2 = r0.onKeyDown(r2, r3, r4, r5)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(android.view.View r2, android.text.Editable r3, android.view.KeyEvent r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f6677
            boolean r2 = r0.onKeyOther(r2, r3, r4)
            return r2
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(android.view.View r2, android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.f6677
            boolean r2 = r0.onKeyUp(r2, r3, r4, r5)
            return r2
    }
}
