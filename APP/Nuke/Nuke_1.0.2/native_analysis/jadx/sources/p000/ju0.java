package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ju0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5220h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0402kw f5221i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ o72 f5222j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ViewGroup f5223k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ y62 f5224l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ l80 f5225m;

    public /* synthetic */ ju0(C0402kw c0402kw, o72 o72Var, ViewGroup viewGroup, y62 y62Var, l80 l80Var, int i) {
        this.f5220h = i;
        this.f5221i = c0402kw;
        this.f5222j = o72Var;
        this.f5223k = viewGroup;
        this.f5224l = y62Var;
        this.f5225m = l80Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f5220h;
        a83 a83Var = a83.f116a;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    pp0.m3906d(xe1.m6126i0(341640236, new ju0(this.f5221i, this.f5222j, this.f5223k, this.f5224l, this.f5225m, 1), go0Var), go0Var, 48);
                }
                break;
            default:
                go0 go0Var2 = (go0) interfaceC0596px;
                if (!go0Var2.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    this.f5221i.mo489e(new lu0(this.f5222j, this.f5223k, this.f5224l, this.f5225m), go0Var2, 0);
                }
                break;
        }
        return a83Var;
    }
}
