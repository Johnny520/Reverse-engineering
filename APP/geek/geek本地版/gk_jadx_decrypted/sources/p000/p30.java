package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p30 {

    /* JADX INFO: renamed from: a */
    public float f3656a;

    /* JADX INFO: renamed from: b */
    public float f3657b;

    /* JADX INFO: renamed from: c */
    public float f3658c;

    /* JADX INFO: renamed from: d */
    public float f3659d;

    /* JADX INFO: renamed from: e */
    public float f3660e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f3661f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f3662g = new ArrayList();

    public p30() {
        m2035d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2032a(float f) {
        float f2 = this.f3659d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f3657b;
        float f5 = this.f3658c;
        l30 l30Var = new l30(f4, f5, f4, f5);
        l30Var.f3007f = this.f3659d;
        l30Var.f3008g = f3;
        this.f3662g.add(new j30(l30Var));
        this.f3659d = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2033b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f3661f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n30) arrayList.get(i)).mo1741a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2034c(float f, float f2) {
        m30 m30Var = new m30();
        m30Var.f3130b = f;
        m30Var.f3131c = f2;
        this.f3661f.add(m30Var);
        k30 k30Var = new k30(m30Var, this.f3657b, this.f3658c);
        float fM1621b = k30Var.m1621b() + 270.0f;
        float fM1621b2 = k30Var.m1621b() + 270.0f;
        m2032a(fM1621b);
        this.f3662g.add(k30Var);
        this.f3659d = fM1621b2;
        this.f3657b = f;
        this.f3658c = f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2035d(float f, float f2, float f3) {
        this.f3656a = f;
        this.f3657b = 0.0f;
        this.f3658c = f;
        this.f3659d = f2;
        this.f3660e = (f2 + f3) % 360.0f;
        this.f3661f.clear();
        this.f3662g.clear();
    }
}
