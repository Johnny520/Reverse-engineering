package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w30 {

    /* JADX INFO: renamed from: a */
    public float f5054a;

    /* JADX INFO: renamed from: b */
    public float f5055b;

    /* JADX INFO: renamed from: c */
    public float f5056c;

    /* JADX INFO: renamed from: d */
    public float f5057d;

    /* JADX INFO: renamed from: e */
    public float f5058e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5059f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f5060g = new ArrayList();

    public w30() {
        m2593d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2590a(float f) {
        float f2 = this.f5057d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f5055b;
        float f5 = this.f5056c;
        s30 s30Var = new s30(f4, f5, f4, f5);
        s30Var.f4200f = this.f5057d;
        s30Var.f4201g = f3;
        this.f5060g.add(new q30(s30Var));
        this.f5057d = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2591b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f5059f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u30) arrayList.get(i)).mo2303a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2592c(float f, float f2) {
        t30 t30Var = new t30();
        t30Var.f4398b = f;
        t30Var.f4399c = f2;
        this.f5059f.add(t30Var);
        r30 r30Var = new r30(t30Var, this.f5055b, this.f5056c);
        float fM2224b = r30Var.m2224b() + 270.0f;
        float fM2224b2 = r30Var.m2224b() + 270.0f;
        m2590a(fM2224b);
        this.f5060g.add(r30Var);
        this.f5057d = fM2224b2;
        this.f5055b = f;
        this.f5056c = f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2593d(float f, float f2, float f3) {
        this.f5054a = f;
        this.f5055b = 0.0f;
        this.f5056c = f;
        this.f5057d = f2;
        this.f5058e = (f2 + f3) % 360.0f;
        this.f5059f.clear();
        this.f5060g.clear();
    }
}
