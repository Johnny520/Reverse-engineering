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
    public final ArrayList f4396g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4397h;

    public C1137u() {
        this.f4396g = new ArrayList();
        this.f4397h = new ArrayList();
        m2669d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2666a(float r5) {
        float r02 = this.f4394e;
        if (r02 != r5) goto L5;
        return;
    L5:
        float r03 = ((r5 - r02) + 360.0f) % 360.0f;
        if (r03 <= 180.0f) goto L8;
        return;
    L8:
        float r2 = this.f4392c;
        float r3 = this.f4393d;
        C1133q r1 = new C1133q(r2, r3, r2, r3);
        r1.f4383f = this.f4394e;
        r1.f4384g = r03;
        this.f4397h.add(new C1131o(r1));
        this.f4394e = r5;
    }

    /* JADX INFO: renamed from: b */
    public final void m2667b(Matrix r5, Path r6) {
        ArrayList r02 = this.f4396g;
        int r1 = r02.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((AbstractC1135s) r02.get(r2)).mo2665a(r5, r6);
        r2 = r2 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: c */
    public final void m2668c(float r5, float r6) {
        C1134r r02 = new C1134r();
        r02.f4385b = r5;
        r02.f4386c = r6;
        this.f4396g.add(r02);
        C1132p r1 = new C1132p(r02, this.f4392c, this.f4393d);
        float r03 = r1.m2664b() + 270.0f;
        float r3 = r1.m2664b() + 270.0f;
        m2666a(r03);
        this.f4397h.add(r1);
        this.f4394e = r3;
        this.f4392c = r5;
        this.f4393d = r6;
    }

    /* JADX INFO: renamed from: d */
    public final void m2669d(float r2, float r3, float r4) {
        this.f4390a = 0.0f;
        this.f4391b = r2;
        this.f4392c = 0.0f;
        this.f4393d = r2;
        this.f4394e = r3;
        this.f4395f = (r3 + r4) % 360.0f;
        this.f4396g.clear();
        this.f4397h.clear();
    }
}
