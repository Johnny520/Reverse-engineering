package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: ay */
/* JADX INFO: loaded from: classes.dex */
public final class C1195ay {

    /* JADX INFO: renamed from: a */
    public float f4097a;

    /* JADX INFO: renamed from: b */
    public float f4098b;

    /* JADX INFO: renamed from: c */
    public float f4099c;

    /* JADX INFO: renamed from: d */
    public float f4100d;

    /* JADX INFO: renamed from: e */
    public float f4101e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4102f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f4103g = new ArrayList();

    public C1195ay() {
        m2312d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2309a(float f) {
        float f2 = this.f4100d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f4098b;
        float f5 = this.f4099c;
        C0985Wx c0985Wx = new C0985Wx(f4, f5, f4, f5);
        c0985Wx.f3099f = this.f4100d;
        c0985Wx.f3100g = f3;
        this.f4103g.add(new C0899Ux(c0985Wx));
        this.f4100d = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2310b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f4102f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1071Yx) arrayList.get(i)).mo1862a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2311c(float f, float f2) {
        C1028Xx c1028Xx = new C1028Xx();
        c1028Xx.f3273b = f;
        c1028Xx.f3274c = f2;
        this.f4102f.add(c1028Xx);
        C0942Vx c0942Vx = new C0942Vx(c1028Xx, this.f4098b, this.f4099c);
        float fM1798b = c0942Vx.m1798b() + 270.0f;
        float fM1798b2 = c0942Vx.m1798b() + 270.0f;
        m2309a(fM1798b);
        this.f4103g.add(c0942Vx);
        this.f4100d = fM1798b2;
        this.f4098b = f;
        this.f4099c = f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2312d(float f, float f2, float f3) {
        this.f4097a = f;
        this.f4098b = 0.0f;
        this.f4099c = f;
        this.f4100d = f2;
        this.f4101e = (f2 + f3) % 360.0f;
        this.f4102f.clear();
        this.f4103g.clear();
    }
}
