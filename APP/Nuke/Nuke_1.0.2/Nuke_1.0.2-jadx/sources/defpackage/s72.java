package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s72 extends kj0 implements d63 {
    public static final s72 j = new s72(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s72 h(r72 r72Var) {
        s72 s72Var = new s72(1);
        s72Var.f(0, r72Var);
        return s72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static s72 i(r72 r72Var, r72 r72Var2) {
        s72 s72Var = new s72(2);
        s72Var.f(0, r72Var);
        s72Var.f(1, r72Var2);
        return s72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kj0, defpackage.d63
    public final o43 getType(int i) {
        o43 o43VarA = ((r72) e(i)).i.a();
        o43VarA.getClass();
        return o43VarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s72 j(boolean z, BitSet bitSet) {
        Object[] objArr = this.i;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        s72 s72Var = new s72(objArr.length);
        int i = 0;
        int iD = 0;
        while (i < length) {
            r72 r72VarE = (r72) e(i);
            if (bitSet == null || !bitSet.get(i)) {
                if (r72VarE.h != iD) {
                    r72VarE = r72.e(iD, r72VarE.i);
                }
                if (!z) {
                    iD += r72VarE.d();
                }
            }
            s72Var.f(i, r72VarE);
            i++;
            z = false;
        }
        if (!this.h) {
            s72Var.h = false;
        }
        return s72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s72 k(int i) {
        int i2;
        int i3;
        int length = this.i.length;
        if (length == 0) {
            return this;
        }
        s72 s72Var = new s72(length);
        for (int i4 = 0; i4 < length; i4++) {
            r72 r72VarE = (r72) e(i4);
            if (i != 0 && i2 != (i3 = (i2 = r72VarE.h) + i)) {
                r72VarE = r72.e(i3, r72VarE.i);
            }
            s72Var.f(i4, r72VarE);
        }
        if (!this.h) {
            s72Var.h = false;
        }
        return s72Var;
    }
}
