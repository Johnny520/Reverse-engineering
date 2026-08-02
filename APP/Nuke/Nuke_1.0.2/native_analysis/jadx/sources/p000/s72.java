package p000;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s72 extends kj0 implements d63 {

    /* JADX INFO: renamed from: j */
    public static final s72 f9958j = new s72(0);

    /* JADX INFO: renamed from: h */
    public static s72 m4746h(r72 r72Var) {
        s72 s72Var = new s72(1);
        s72Var.m2694f(0, r72Var);
        return s72Var;
    }

    /* JADX INFO: renamed from: i */
    public static s72 m4747i(r72 r72Var, r72 r72Var2) {
        s72 s72Var = new s72(2);
        s72Var.m2694f(0, r72Var);
        s72Var.m2694f(1, r72Var2);
        return s72Var;
    }

    @Override // p000.kj0, p000.d63
    public final o43 getType(int i) {
        o43 o43VarMo22a = ((r72) m2693e(i)).f9420i.mo22a();
        o43VarMo22a.getClass();
        return o43VarMo22a;
    }

    /* JADX INFO: renamed from: j */
    public final s72 m4748j(boolean z, BitSet bitSet) {
        Object[] objArr = this.f5590i;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        s72 s72Var = new s72(objArr.length);
        int i = 0;
        int iM4400d = 0;
        while (i < length) {
            r72 r72VarM4399e = (r72) m2693e(i);
            if (bitSet == null || !bitSet.get(i)) {
                if (r72VarM4399e.f9419h != iM4400d) {
                    r72VarM4399e = r72.m4399e(iM4400d, r72VarM4399e.f9420i);
                }
                if (!z) {
                    iM4400d += r72VarM4399e.m4400d();
                }
            }
            s72Var.m2694f(i, r72VarM4399e);
            i++;
            z = false;
        }
        if (!this.f11990h) {
            s72Var.f11990h = false;
        }
        return s72Var;
    }

    /* JADX INFO: renamed from: k */
    public final s72 m4749k(int i) {
        int i2;
        int i3;
        int length = this.f5590i.length;
        if (length == 0) {
            return this;
        }
        s72 s72Var = new s72(length);
        for (int i4 = 0; i4 < length; i4++) {
            r72 r72VarM4399e = (r72) m2693e(i4);
            if (i != 0 && i2 != (i3 = (i2 = r72VarM4399e.f9419h) + i)) {
                r72VarM4399e = r72.m4399e(i3, r72VarM4399e.f9420i);
            }
            s72Var.m2694f(i4, r72VarM4399e);
        }
        if (!this.f11990h) {
            s72Var.f11990h = false;
        }
        return s72Var;
    }
}
