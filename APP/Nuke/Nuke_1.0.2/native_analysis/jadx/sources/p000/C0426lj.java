package p000;

import android.view.View;

/* JADX INFO: renamed from: lj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0426lj implements aa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6143c;

    public /* synthetic */ C0426lj(int i, Object obj, Object obj2) {
        this.f6141a = i;
        this.f6142b = obj;
        this.f6143c = obj2;
    }

    @Override // p000.aa0
    /* JADX INFO: renamed from: a */
    public final void mo120a() throws Exception {
        int i = this.f6141a;
        Object obj = this.f6143c;
        Object obj2 = this.f6142b;
        switch (i) {
            case 0:
                ((C0242gj) obj2).m1927b((C0710sw) obj);
                break;
            case 1:
                ((cz0) obj2).f1788a.m6431j((az0) obj);
                break;
            case 2:
                ((g91) obj2).f3367j.m4892k(obj);
                break;
            case 3:
                ((C0242gj) obj2).m1927b((C0940yw) obj);
                break;
            case 4:
                ((y33) obj2).f13298j.remove((y33) obj);
                break;
            case 5:
                y33 y33Var = (y33) obj2;
                t33 t33Var = (t33) ((u33) obj).f11095b.getValue();
                if (t33Var != null) {
                    y33Var.f13297i.remove(t33Var.f10533h);
                }
                break;
            default:
                ff3 ff3Var = (ff3) obj2;
                View view = (View) obj;
                int i2 = ff3Var.f2973t - 1;
                ff3Var.f2973t = i2;
                if (i2 == 0) {
                    int i3 = wa3.f12444a;
                    ra3.m4425b(view, null);
                    wa3.m5863b(view, null);
                    view.removeOnAttachStateChangeListener(ff3Var.f2974u);
                }
                break;
        }
    }
}
