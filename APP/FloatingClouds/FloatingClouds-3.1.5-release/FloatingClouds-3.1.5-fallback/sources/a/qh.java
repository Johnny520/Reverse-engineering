package a;

/* JADX INFO: loaded from: classes.dex */
public class qh extends a.ph {
    @Override // a.C0282n9
    public final void y(boolean r3) {
            r2 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 == 0) goto L1d
            android.view.Window r3 = r2.b
            r1 = 67108864(0x4000000, float:1.5046328E-36)
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
