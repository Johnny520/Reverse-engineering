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
    public final ArrayList f4102f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4103g;

    public C1195ay() {
        this.f4102f = new ArrayList();
        this.f4103g = new ArrayList();
        m2312d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2309a(float r5) {
        float r0 = this.f4100d;
        if (r0 == r5) goto L10;
        float r02 = ((r5 - r0) + 360.0f) % 360.0f;
        if (r02 <= 180.0f) goto L8;
        return;
    L8:
        float r2 = this.f4098b;
        float r3 = this.f4099c;
        C0985Wx r1 = new C0985Wx(r2, r3, r2, r3);
        r1.f3099f = this.f4100d;
        r1.f3100g = r02;
        C0899Ux r03 = new C0899Ux(r1);
        this.f4103g.add(r03);
        this.f4100d = r5;
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m2310b(Matrix r5, Path r6) {
        ArrayList r0 = this.f4102f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((AbstractC1071Yx) r0.get(r2)).mo1862a(r5, r6);
        r2 = r2 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: c */
    public final void m2311c(float r5, float r6) {
        C1028Xx r0 = new C1028Xx();
        r0.f3273b = r5;
        r0.f3274c = r6;
        this.f4102f.add(r0);
        C0942Vx r1 = new C0942Vx(r0, this.f4098b, this.f4099c);
        float r02 = r1.m1798b() + 270.0f;
        float r3 = r1.m1798b() + 270.0f;
        m2309a(r02);
        this.f4103g.add(r1);
        this.f4100d = r3;
        this.f4098b = r5;
        this.f4099c = r6;
    }

    /* JADX INFO: renamed from: d */
    public final void m2312d(float r2, float r3, float r4) {
        this.f4097a = r2;
        this.f4098b = 0.0f;
        this.f4099c = r2;
        this.f4100d = r3;
        this.f4101e = (r3 + r4) % 360.0f;
        this.f4102f.clear();
        this.f4103g.clear();
    }
}
