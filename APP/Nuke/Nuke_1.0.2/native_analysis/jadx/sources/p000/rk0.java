package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rk0 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f9616i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ sk0 f9617j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk0(sk0 sk0Var, int i) {
        super(1);
        this.f9616i = i;
        this.f9617j = sk0Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f9616i;
        a83 a83Var = a83.f116a;
        sk0 sk0Var = this.f9617j;
        switch (i) {
            case 0:
                C0358jp c0358jp = (C0358jp) obj;
                View viewM3912j = pp0.m3912j(sk0Var);
                if (!viewM3912j.isFocused() && !viewM3912j.hasFocus()) {
                    yk0 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(sk0Var)).getFocusOwner();
                    View viewM5344H = tp0.m5344H(sk0Var);
                    Integer numM5710c = vk0.m5710c(c0358jp.f5136a);
                    int[] iArr = new int[2];
                    viewM5344H.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewM3912j.getLocationOnScreen(iArr2);
                    pl0 pl0VarM4540a0 = rp0.m4540a0(((bl0) focusOwner).f926c);
                    Rect rect = null;
                    o62 o62VarM4544e0 = pl0VarM4540a0 != null ? rp0.m4544e0(pl0VarM4540a0) : null;
                    if (o62VarM4544e0 != null) {
                        int i2 = (int) o62VarM4544e0.f7536a;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) o62VarM4544e0.f7537b;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) o62VarM4544e0.f7538c) + i3) - i4, (((int) o62VarM4544e0.f7539d) + i6) - i7);
                    }
                    if (!vk0.m5709b(viewM3912j, numM5710c, rect)) {
                        c0358jp.f5137b = true;
                    }
                }
                break;
            default:
                pp0.m3912j(sk0Var);
                break;
        }
        return a83Var;
    }
}
