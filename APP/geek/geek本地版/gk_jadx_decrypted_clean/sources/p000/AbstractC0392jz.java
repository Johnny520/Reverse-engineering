package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: jz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0392jz {

    /* JADX INFO: renamed from: a */
    public C0205ez f2677a;

    /* JADX INFO: renamed from: b */
    public ArrayList f2678b;

    /* JADX INFO: renamed from: c */
    public long f2679c;

    /* JADX INFO: renamed from: d */
    public long f2680d;

    /* JADX INFO: renamed from: e */
    public long f2681e;

    /* JADX INFO: renamed from: f */
    public long f2682f;

    /* JADX INFO: renamed from: b */
    public static void m1610b(b00 b00Var) {
        RecyclerView recyclerView;
        int i = b00Var.f706j;
        if (b00Var.m486f() || (i & 4) != 0 || (recyclerView = b00Var.f714r) == null) {
            return;
        }
        recyclerView.m377F(b00Var);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo1611a(b00 b00Var, b00 b00Var2, C0463lw c0463lw, C0463lw c0463lw2);

    /* JADX INFO: renamed from: c */
    public final void m1612c(b00 b00Var) {
        C0205ez c0205ez = this.f2677a;
        if (c0205ez != null) {
            RecyclerView recyclerView = c0205ez.f1865a;
            boolean z = true;
            b00Var.m494n(true);
            View view = b00Var.f697a;
            if (b00Var.f704h != null && b00Var.f705i == null) {
                b00Var.f704h = null;
            }
            b00Var.f705i = null;
            if ((b00Var.f706j & 16) != 0) {
                return;
            }
            C0763tz c0763tz = recyclerView.f585b;
            recyclerView.m397a0();
            C0659r5 c0659r5 = recyclerView.f591e;
            C0217fa c0217fa = (C0217fa) c0659r5.f4210c;
            C0205ez c0205ez2 = (C0205ez) c0659r5.f4209b;
            int iIndexOfChild = c0205ez2.f1865a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c0659r5.m2221B(view);
            } else if (c0217fa.m1147d(iIndexOfChild)) {
                c0217fa.m1149f(iIndexOfChild);
                c0659r5.m2221B(view);
                c0205ez2.m1100h(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                b00 b00VarM367I = RecyclerView.m367I(view);
                c0763tz.m2402j(b00VarM367I);
                c0763tz.m2399g(b00VarM367I);
            }
            recyclerView.m398b0(!z);
            if (z || !b00Var.m490j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1613d(b00 b00Var);

    /* JADX INFO: renamed from: e */
    public abstract void mo1614e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo1615f();
}
