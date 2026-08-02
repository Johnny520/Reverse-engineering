package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t81 {

    /* JADX INFO: renamed from: a */
    public final d91 f10607a;

    /* JADX INFO: renamed from: b */
    public final s81 f10608b;

    /* JADX INFO: renamed from: c */
    public final o71 f10609c;

    /* JADX INFO: renamed from: d */
    public final C0158e9 f10610d;

    public t81(d91 d91Var, s81 s81Var, o71 o71Var, C0158e9 c0158e9) {
        this.f10607a = d91Var;
        this.f10608b = s81Var;
        this.f10609c = o71Var;
        this.f10610d = c0158e9;
    }

    /* JADX INFO: renamed from: a */
    public final void m5131a(int i, Object obj, InterfaceC0596px interfaceC0596px, int i2) {
        int i3;
        Object obj2;
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-462424778);
        int i4 = (go0Var.m1976d(i) ? 4 : 2) | i2 | (go0Var.m1984h(obj) ? 32 : 16) | (go0Var.m1980f(this) ? 256 : 128);
        if (go0Var.m1958O(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            p40.m3716a(obj2, i3, this.f10607a.f1933r, xe1.m6126i0(-824725566, new C0046b8(this, i), go0Var), go0Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new a81(this, i3, obj2, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m5132b(int i) {
        s81 s81Var = this.f10608b;
        s81Var.getClass();
        l11 l11VarM1298e = s81Var.f9976a.m1298e(i);
        return ((in0) l11VarM1298e.f5880c.f563j).mo5j(Integer.valueOf(i - l11VarM1298e.f5878a));
    }

    /* JADX INFO: renamed from: c */
    public final int m5133c() {
        s81 s81Var = this.f10608b;
        s81Var.getClass();
        return s81Var.f9976a.f2352i;
    }

    /* JADX INFO: renamed from: d */
    public final Object m5134d(int i) {
        Object objMo5j;
        C0158e9 c0158e9 = this.f10610d;
        Object[] objArr = (Object[]) c0158e9.f2354k;
        int i2 = i - c0158e9.f2352i;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        s81 s81Var = this.f10608b;
        s81Var.getClass();
        l11 l11VarM1298e = s81Var.f9976a.m1298e(i);
        int i3 = i - l11VarM1298e.f5878a;
        in0 in0Var = (in0) l11VarM1298e.f5880c.f562i;
        return (in0Var == null || (objMo5j = in0Var.mo5j(Integer.valueOf(i3))) == null) ? new u50(i) : objMo5j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t81)) {
            return false;
        }
        return t11.m5086l(this.f10608b, ((t81) obj).f10608b);
    }

    public final int hashCode() {
        return this.f10608b.hashCode();
    }
}
