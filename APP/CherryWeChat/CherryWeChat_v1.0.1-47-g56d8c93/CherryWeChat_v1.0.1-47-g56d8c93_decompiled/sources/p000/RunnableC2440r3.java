package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2440r3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f8556b;

    public /* synthetic */ RunnableC2440r3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3, int i) {
        this.f8555a = i;
        this.f8556b = layoutInflaterFactory2C0176E3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f8555a) {
            case 0:
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f8556b;
                if ((layoutInflaterFactory2C0176E3.f485Z & 1) != 0) {
                    layoutInflaterFactory2C0176E3.m356v(0);
                }
                if ((layoutInflaterFactory2C0176E3.f485Z & 4096) != 0) {
                    layoutInflaterFactory2C0176E3.m356v(108);
                }
                layoutInflaterFactory2C0176E3.f484Y = false;
                layoutInflaterFactory2C0176E3.f485Z = 0;
                break;
            default:
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E32 = this.f8556b;
                layoutInflaterFactory2C0176E32.f506w.showAtLocation(layoutInflaterFactory2C0176E32.f505v, 55, 0, 0);
                C0273GE c0273ge = layoutInflaterFactory2C0176E32.f508y;
                if (c0273ge != null) {
                    c0273ge.m554b();
                }
                if (layoutInflaterFactory2C0176E32.f509z && (viewGroup = layoutInflaterFactory2C0176E32.f460A) != null && viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C0176E32.f505v.setAlpha(0.0f);
                    C0273GE c0273geM4388a = AbstractC2185lE.m4388a(layoutInflaterFactory2C0176E32.f505v);
                    c0273geM4388a.m553a(1.0f);
                    layoutInflaterFactory2C0176E32.f508y = c0273geM4388a;
                    c0273geM4388a.m556d(new C2526t3(0, this));
                } else {
                    layoutInflaterFactory2C0176E32.f505v.setAlpha(1.0f);
                    layoutInflaterFactory2C0176E32.f505v.setVisibility(0);
                }
                break;
        }
    }
}
