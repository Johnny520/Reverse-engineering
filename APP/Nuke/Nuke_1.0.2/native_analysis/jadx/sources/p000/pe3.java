package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pe3 {

    /* JADX INFO: renamed from: a */
    public final cf3 f8287a;

    /* JADX INFO: renamed from: b */
    public zz0[] f8288b;

    /* JADX INFO: renamed from: c */
    public final Rect[][] f8289c;

    /* JADX INFO: renamed from: d */
    public final Rect[][] f8290d;

    public pe3(cf3 cf3Var) {
        this.f8289c = new Rect[10][];
        this.f8290d = new Rect[10][];
        this.f8287a = cf3Var;
        mo3292c(cf3Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m3862a() {
        zz0[] zz0VarArr = this.f8288b;
        if (zz0VarArr != null) {
            zz0 zz0VarMo4165i = zz0VarArr[0];
            zz0 zz0VarMo4165i2 = zz0VarArr[1];
            cf3 cf3Var = this.f8287a;
            if (zz0VarMo4165i2 == null) {
                zz0VarMo4165i2 = cf3Var.f1518a.mo4165i(2);
            }
            if (zz0VarMo4165i == null) {
                zz0VarMo4165i = cf3Var.f1518a.mo4165i(1);
            }
            mo2152h(zz0.m6517a(zz0VarMo4165i, zz0VarMo4165i2));
            zz0 zz0Var = this.f8288b[ze3.m6409a(16)];
            if (zz0Var != null) {
                mo2492g(zz0Var);
            }
            zz0 zz0Var2 = this.f8288b[ze3.m6409a(32)];
            if (zz0Var2 != null) {
                mo2491e(zz0Var2);
            }
            zz0 zz0Var3 = this.f8288b[ze3.m6409a(64)];
            if (zz0Var3 != null) {
                mo2493i(zz0Var3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract cf3 mo2150b();

    /* JADX INFO: renamed from: c */
    public void mo3292c(cf3 cf3Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo4163f = cf3Var.f1518a.mo4163f(i);
            int iM6409a = ze3.m6409a(i);
            this.f8289c[iM6409a] = (Rect[]) listMo4163f.toArray(new Rect[listMo4163f.size()]);
            if (i != 8) {
                List<Rect> listMo4164g = cf3Var.f1518a.mo4164g(i);
                this.f8290d[iM6409a] = (Rect[]) listMo4164g.toArray(new Rect[listMo4164g.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo2646d(int i, zz0 zz0Var) {
        if (this.f8288b == null) {
            this.f8288b = new zz0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f8288b[ze3.m6409a(i2)] = zz0Var;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2151f(zz0 zz0Var);

    /* JADX INFO: renamed from: h */
    public abstract void mo2152h(zz0 zz0Var);

    public pe3() {
        this(new cf3((cf3) null));
    }

    /* JADX INFO: renamed from: e */
    public void mo2491e(zz0 zz0Var) {
    }

    /* JADX INFO: renamed from: g */
    public void mo2492g(zz0 zz0Var) {
    }

    /* JADX INFO: renamed from: i */
    public void mo2493i(zz0 zz0Var) {
    }
}
