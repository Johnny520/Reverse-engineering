package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p30 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f;
    public final ArrayList g;

    public p30() {
        this.f = new ArrayList();
        this.g = new ArrayList();
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float r5) {
        float r0 = this.d;
        if (r0 == r5) goto L10;
        float r02 = ((r5 - r0) + 360.0f) % 360.0f;
        if (r02 <= 180.0f) goto L8;
        return;
    L8:
        float r2 = this.b;
        float r3 = this.c;
        l30 r1 = new l30(r2, r3, r2, r3);
        r1.f = this.d;
        r1.g = r02;
        j30 r03 = new j30(r1);
        this.g.add(r03);
        this.d = r5;
        return;
    }

    public final void b(Matrix r5, Path r6) {
        ArrayList r0 = this.f;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((n30) r0.get(r2)).a(r5, r6);
        r2 = r2 + 1;
        goto L3
    }

    public final void c(float r5, float r6) {
        m30 r0 = new m30();
        r0.b = r5;
        r0.c = r6;
        this.f.add(r0);
        k30 r1 = new k30(r0, this.b, this.c);
        float r02 = r1.b() + 270.0f;
        float r3 = r1.b() + 270.0f;
        a(r02);
        this.g.add(r1);
        this.d = r3;
        this.b = r5;
        this.c = r6;
    }

    public final void d(float r2, float r3, float r4) {
        this.a = r2;
        this.b = 0.0f;
        this.c = r2;
        this.d = r3;
        this.e = (r3 + r4) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
