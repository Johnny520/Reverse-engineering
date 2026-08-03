package p089x0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: x0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1137u {

    /* JADX INFO: renamed from: a */
    public float f4390a;

    /* JADX INFO: renamed from: b */
    public float f4391b;

    /* JADX INFO: renamed from: c */
    public float f4392c;

    /* JADX INFO: renamed from: d */
    public float f4393d;

    /* JADX INFO: renamed from: e */
    public float f4394e;

    /* JADX INFO: renamed from: f */
    public float f4395f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4396g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f4397h = new ArrayList();

    public C1137u() {
        m2669d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2666a(float f2) {
        float f3 = this.f4394e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f4392c;
        float f6 = this.f4393d;
        C1133q c1133q = new C1133q(f5, f6, f5, f6);
        c1133q.f4383f = this.f4394e;
        c1133q.f4384g = f4;
        this.f4397h.add(new C1131o(c1133q));
        this.f4394e = f2;
    }

    /* JADX INFO: renamed from: b */
    public final void m2667b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f4396g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1135s) arrayList.get(i2)).mo2665a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2668c(float f2, float f3) {
        C1134r c1134r = new C1134r();
        c1134r.f4385b = f2;
        c1134r.f4386c = f3;
        this.f4396g.add(c1134r);
        C1132p c1132p = new C1132p(c1134r, this.f4392c, this.f4393d);
        float fM2664b = c1132p.m2664b() + 270.0f;
        float fM2664b2 = c1132p.m2664b() + 270.0f;
        m2666a(fM2664b);
        this.f4397h.add(c1132p);
        this.f4394e = fM2664b2;
        this.f4392c = f2;
        this.f4393d = f3;
    }

    /* JADX INFO: renamed from: d */
    public final void m2669d(float f2, float f3, float f4) {
        this.f4390a = 0.0f;
        this.f4391b = f2;
        this.f4392c = 0.0f;
        this.f4393d = f2;
        this.f4394e = f3;
        this.f4395f = (f3 + f4) % 360.0f;
        this.f4396g.clear();
        this.f4397h.clear();
    }
}
