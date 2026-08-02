package p000;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 {

    /* JADX INFO: renamed from: a */
    public final Object f12178a;

    /* JADX INFO: renamed from: b */
    public final Object f12179b;

    /* JADX INFO: renamed from: c */
    public final Object f12180c;

    public vu2(int i) {
        switch (i) {
            case 3:
                y63 y63Var = new y63(7);
                tc3 tc3Var = tc3.f10679o;
                y63 y63Var2 = new y63(8);
                this.f12178a = y63Var;
                this.f12179b = tc3Var;
                this.f12180c = y63Var2;
                break;
            default:
                this.f12178a = new WeakHashMap();
                this.f12179b = new WeakHashMap();
                this.f12180c = new WeakHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m5800a() {
        if (((gu2) this.f12178a).getValue() != this.f12180c) {
            return true;
        }
        vu2 vu2Var = (vu2) this.f12179b;
        return vu2Var != null && vu2Var.m5800a();
    }

    public vu2(C0043b5 c0043b5, int[] iArr, C0043b5 c0043b52) {
        if (iArr == null) {
            um2.m5516f("order == null");
            throw null;
        }
        if (c0043b52 != null) {
            this.f12178a = c0043b5;
            this.f12179b = iArr;
            this.f12180c = c0043b52;
            return;
        }
        um2.m5516f("addresses == null");
        throw null;
    }

    public vu2(m63 m63Var, vu2 vu2Var) {
        this.f12178a = m63Var;
        this.f12179b = vu2Var;
        this.f12180c = m63Var.f6489h;
    }
}
