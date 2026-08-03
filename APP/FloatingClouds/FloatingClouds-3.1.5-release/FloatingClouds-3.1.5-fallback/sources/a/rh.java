package a;

/* JADX INFO: loaded from: classes.dex */
public final class rh extends a.qh {
    @Override // a.C0282n9
    public final void x(boolean r3) {
            r2 = this;
            r0 = 16
            if (r3 == 0) goto L1d
            android.view.Window r3 = r2.b
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r3.clearFlags(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlags(r1)
            android.view.View r3 = r3.getDecorView()
            int r1 = r3.getSystemUiVisibility()
            r0 = r0 | r1
            r3.setSystemUiVisibility(r0)
            return
        L1d:
            r2.C(r0)
            return
    }
}
