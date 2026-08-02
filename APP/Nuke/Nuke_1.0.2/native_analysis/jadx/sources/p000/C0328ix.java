package p000;

import android.content.Context;

/* JADX INFO: renamed from: ix */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0328ix extends AbstractC0526o2 {

    /* JADX INFO: renamed from: q */
    public final nx1 f4824q;

    /* JADX INFO: renamed from: r */
    public boolean f4825r;

    public C0328ix(Context context) {
        super(context);
        this.f4824q = op0.m3598u(null);
    }

    @Override // p000.AbstractC0526o2
    /* JADX INFO: renamed from: a */
    public final void mo927a(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(420213850);
        int i2 = 2;
        int i3 = (go0Var.m1984h(this) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            mn0 mn0Var = (mn0) this.f4824q.getValue();
            if (mn0Var == null) {
                go0Var.m1966W(-1238823553);
            } else {
                go0Var.m1966W(98585282);
                mn0Var.mo12g(go0Var, 0);
            }
            go0Var.m1994p(false);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0483n2(this, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0328ix.class.getName();
    }

    @Override // p000.AbstractC0526o2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f4825r;
    }

    public final void setContent(mn0 mn0Var) {
        this.f4825r = true;
        this.f4824q.setValue(mn0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m3467e();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
