package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xc0 extends defpackage.gt {
    public final android.view.Window a;

    public xc0(android.view.Window r1, android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.gt
    public final void B(boolean r3) {
            r2 = this;
            r0 = 16
            if (r3 == 0) goto L1d
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.view.Window r1 = r2.a
            r1.clearFlags(r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r3)
            android.view.View r3 = r1.getDecorView()
            int r1 = r3.getSystemUiVisibility()
            r0 = r0 | r1
            r3.setSystemUiVisibility(r0)
            return
        L1d:
            r2.I(r0)
            return
    }

    @Override // defpackage.gt
    public final void C(boolean r3) {
            r2 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 == 0) goto L1d
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.view.Window r1 = r2.a
            r1.clearFlags(r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r3)
            android.view.View r3 = r1.getDecorView()
            int r1 = r3.getSystemUiVisibility()
            r0 = r0 | r1
            r3.setSystemUiVisibility(r0)
            return
        L1d:
            r2.I(r0)
            return
    }

    public final void I(int r3) {
            r2 = this;
            android.view.Window r0 = r2.a
            android.view.View r0 = r0.getDecorView()
            int r1 = r0.getSystemUiVisibility()
            int r3 = ~r3
            r3 = r3 & r1
            r0.setSystemUiVisibility(r3)
            return
    }
}
