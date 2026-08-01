package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: qz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0651qz {

    /* JADX INFO: renamed from: a */
    public C0466lz f3984a;

    /* JADX INFO: renamed from: b */
    public ArrayList f3985b;

    /* JADX INFO: renamed from: c */
    public long f3986c;

    /* JADX INFO: renamed from: d */
    public long f3987d;

    /* JADX INFO: renamed from: e */
    public long f3988e;

    /* JADX INFO: renamed from: f */
    public long f3989f;

    /* JADX INFO: renamed from: b */
    public static void m2189b(i00 i00Var) {
        RecyclerView recyclerView;
        int i = i00Var.f2305j;
        if (i00Var.m1424f() || (i & 4) != 0 || (recyclerView = i00Var.f2313r) == null) {
            return;
        }
        recyclerView.m362F(i00Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2190a(i00 i00Var, i00 i00Var2, C0759tw c0759tw, C0759tw c0759tw2);

    /* JADX INFO: renamed from: c */
    public final void m2191c(i00 i00Var) {
        C0466lz c0466lz = this.f3984a;
        if (c0466lz != null) {
            RecyclerView recyclerView = c0466lz.f3055a;
            boolean z = true;
            i00Var.m1432n(true);
            View view = i00Var.f2296a;
            if (i00Var.f2303h != null && i00Var.f2304i == null) {
                i00Var.f2303h = null;
            }
            i00Var.f2304i = null;
            if ((i00Var.f2305j & 16) != 0) {
                return;
            }
            a00 a00Var = recyclerView.f548b;
            recyclerView.m382a0();
            C0658r5 c0658r5 = recyclerView.f554e;
            C0515na c0515na = (C0515na) c0658r5.f4065c;
            C0466lz c0466lz2 = (C0466lz) c0658r5.f4064b;
            int iIndexOfChild = c0466lz2.f3055a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c0658r5.m2228B(view);
            } else if (c0515na.m1932d(iIndexOfChild)) {
                c0515na.m1934f(iIndexOfChild);
                c0658r5.m2228B(view);
                c0466lz2.m1788h(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                i00 i00VarM352I = RecyclerView.m352I(view);
                a00Var.m12j(i00VarM352I);
                a00Var.m9g(i00VarM352I);
            }
            recyclerView.m383b0(!z);
            if (z || !i00Var.m1428j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2192d(i00 i00Var);

    /* JADX INFO: renamed from: e */
    public abstract void mo2193e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2194f();
}
