package a;

/* JADX INFO: loaded from: classes.dex */
public class ph extends a.C0282n9 {
    public final android.view.Window b;

    public ph(android.view.Window r1, a.C0233ke r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    public final void C(int r3) {
            r2 = this;
            android.view.Window r0 = r2.b
            android.view.View r0 = r0.getDecorView()
            int r1 = r0.getSystemUiVisibility()
            int r3 = ~r3
            r3 = r3 & r1
            r0.setSystemUiVisibility(r3)
            return
    }
}
