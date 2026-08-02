package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: w9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0839w9 implements on0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12408h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f12409i;

    public /* synthetic */ C0839w9(int i, Object obj) {
        this.f12408h = i;
        this.f12409i = obj;
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: o */
    public final Object mo171o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f12408h;
        Object obj5 = this.f12409i;
        switch (i) {
            case 0:
                C0878x9 c0878x9 = (C0878x9) obj5;
                m63 m63VarM6288b = ((yl0) c0878x9.f12904e).m6288b((mx2) obj, (im0) obj2, ((gm0) obj3).f3581a, ((hm0) obj4).f4076a);
                if (m63VarM6288b instanceof m63) {
                    Object obj6 = m63VarM6288b.f6489h;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                vu2 vu2Var = new vu2(m63VarM6288b, c0878x9.f12909j);
                c0878x9.f12909j = vu2Var;
                Object obj7 = vu2Var.f12180c;
                obj7.getClass();
                return (Typeface) obj7;
            default:
                C0402kw c0402kw = (C0402kw) obj5;
                o71 o71Var = (o71) obj;
                ((Integer) obj2).getClass();
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) interfaceC0596px).m1980f(o71Var) ? 4 : 2;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 131) != 130)) {
                    c0402kw.mo489e(o71Var, go0Var, Integer.valueOf(iIntValue & 14));
                } else {
                    go0Var.m1961R();
                }
                return a83.f116a;
        }
    }
}
