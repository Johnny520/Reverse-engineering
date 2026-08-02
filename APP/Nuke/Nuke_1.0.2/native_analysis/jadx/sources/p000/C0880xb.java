package p000;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: xb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880xb implements y10 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12933h;

    /* JADX INFO: renamed from: i */
    public final Object f12934i;

    /* JADX INFO: renamed from: j */
    public final Object f12935j;

    public C0880xb(c62 c62Var) {
        this.f12933h = 1;
        this.f12934i = c62Var;
        this.f12935j = new C0093cj(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6080a(in0 in0Var, t00 t00Var) {
        ry1 ry1Var;
        boolean z;
        Object objM3150t;
        switch (this.f12933h) {
            case 0:
                C0804vb c0804vb = (C0804vb) this.f12935j;
                C0469mp c0469mp = new C0469mp(1, gf1.m1908z(t00Var));
                c0469mp.m3151u();
                ChoreographerFrameCallbackC0841wb choreographerFrameCallbackC0841wb = new ChoreographerFrameCallbackC0841wb(c0469mp, this, in0Var);
                if (t11.m5086l(c0804vb.f11874j, (Choreographer) this.f12934i)) {
                    synchronized (c0804vb.f11876l) {
                        c0804vb.f11878n.add(choreographerFrameCallbackC0841wb);
                        if (!c0804vb.f11881q) {
                            c0804vb.f11881q = true;
                            c0804vb.f11874j.postFrameCallback(c0804vb.f11882r);
                        }
                        break;
                    }
                    c0469mp.m3153w(new C0196fa(3, c0804vb, choreographerFrameCallbackC0841wb));
                } else {
                    ((Choreographer) this.f12934i).postFrameCallback(choreographerFrameCallbackC0841wb);
                    c0469mp.m3153w(new C0196fa(4, this, choreographerFrameCallbackC0841wb));
                }
                return c0469mp.m3150t();
            case 1:
                C0469mp c0469mp2 = new C0469mp(1, gf1.m1908z(t00Var));
                c0469mp2.m3151u();
                C0093cj c0093cj = (C0093cj) this.f12935j;
                C0928ym c0928ym = new C0928ym();
                c0928ym.f13515a = c0469mp2;
                c0928ym.f13516b = in0Var;
                c0469mp2.m3153w(new C0967zm(0, c0093cj.m829d(c0928ym, (c62) this.f12934i)));
                return c0469mp2.m3150t();
            default:
                if (t00Var instanceof ry1) {
                    ry1Var = (ry1) t00Var;
                    int i = ry1Var.f9825n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ry1Var.f9825n = i - Integer.MIN_VALUE;
                    } else {
                        ry1Var = new ry1(this, t00Var);
                    }
                }
                Object obj = ry1Var.f9823l;
                k20 k20Var = k20.f5323h;
                int i2 = ry1Var.f9825n;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    f90 f90Var = (f90) this.f12935j;
                    ry1Var.f9822k = in0Var;
                    ry1Var.f9825n = 1;
                    synchronized (f90Var.f2863b) {
                        z = f90Var.f2862a;
                    }
                    if (z) {
                        objM3150t = a83.f116a;
                    } else {
                        C0469mp c0469mp3 = new C0469mp(1, gf1.m1908z(ry1Var));
                        c0469mp3.m3151u();
                        synchronized (f90Var.f2863b) {
                            ((ArrayList) f90Var.f2864c).add(c0469mp3);
                        }
                        c0469mp3.m3153w(new C0962zh(6, f90Var, c0469mp3));
                        objM3150t = c0469mp3.m3150t();
                        if (objM3150t != k20Var) {
                            objM3150t = a83.f116a;
                        }
                    }
                    if (objM3150t != k20Var) {
                    }
                    return k20Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                in0Var = ry1Var.f9822k;
                fg1.m1627T(obj);
                C0880xb c0880xb = (C0880xb) this.f12934i;
                ry1Var.f9822k = null;
                ry1Var.f9825n = 2;
                Object objM6080a = c0880xb.m6080a(in0Var, ry1Var);
                if (objM6080a != k20Var) {
                    return objM6080a;
                }
                return k20Var;
        }
    }

    @Override // p000.y10
    public z10 getKey() {
        return gd3.f3414A;
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: k */
    public final a20 mo14k(a20 a20Var) {
        switch (this.f12933h) {
        }
        return xe1.m6120f0(this, a20Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: o */
    public final y10 mo15o(z10 z10Var) {
        switch (this.f12933h) {
        }
        return xe1.m6144u(this, z10Var);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: r */
    public final Object mo16r(mn0 mn0Var, Object obj) {
        switch (this.f12933h) {
        }
        return mn0Var.mo12g(obj, this);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: u */
    public final a20 mo17u(z10 z10Var) {
        switch (this.f12933h) {
        }
        return xe1.m6105W(this, z10Var);
    }

    public C0880xb(C0880xb c0880xb) {
        this.f12933h = 2;
        this.f12934i = c0880xb;
        this.f12935j = new f90();
    }

    public C0880xb(Choreographer choreographer, C0804vb c0804vb) {
        this.f12933h = 0;
        this.f12934i = choreographer;
        this.f12935j = c0804vb;
    }
}
