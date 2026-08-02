package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 {
    public final Object a;
    public final Object b;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vu2(int i) {
        switch (i) {
            case 3:
                y63 y63Var = new y63(7);
                tc3 tc3Var = tc3.o;
                y63 y63Var2 = new y63(8);
                this.a = y63Var;
                this.b = tc3Var;
                this.c = y63Var2;
                break;
            default:
                this.a = new WeakHashMap();
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a() {
        if (((gu2) this.a).getValue() != this.c) {
            return true;
        }
        vu2 vu2Var = (vu2) this.b;
        return vu2Var != null && vu2Var.a();
    }

    public vu2(b5 b5Var, int[] iArr, b5 b5Var2) {
        if (iArr == null) {
            um2.f("order == null");
            throw null;
        }
        if (b5Var2 != null) {
            this.a = b5Var;
            this.b = iArr;
            this.c = b5Var2;
            return;
        }
        um2.f("addresses == null");
        throw null;
    }

    public vu2(m63 m63Var, vu2 vu2Var) {
        this.a = m63Var;
        this.b = vu2Var;
        this.c = m63Var.h;
    }
}
