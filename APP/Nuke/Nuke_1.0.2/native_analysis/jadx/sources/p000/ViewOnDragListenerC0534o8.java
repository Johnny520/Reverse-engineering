package p000;

import android.view.DragEvent;
import android.view.View;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC0534o8 implements View.OnDragListener, eb0 {

    /* JADX INFO: renamed from: a */
    public final gb0 f7576a;

    /* JADX INFO: renamed from: b */
    public final C0349jg f7577b;

    /* JADX INFO: renamed from: c */
    public final C0489n8 f7578c;

    public ViewOnDragListenerC0534o8() {
        gb0 gb0Var = new gb0();
        gb0Var.f3384x = 0L;
        this.f7576a = gb0Var;
        this.f7577b = new C0349jg();
        this.f7578c = new C0489n8(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C0485n4 c0485n4 = new C0485n4(14, dragEvent);
        int action = dragEvent.getAction();
        c43 c43Var = c43.f1146h;
        C0349jg c0349jg = this.f7577b;
        gb0 gb0Var = this.f7576a;
        switch (action) {
            case 1:
                y62 y62Var = new y62();
                fb0 fb0Var = new fb0(c0485n4, gb0Var, y62Var);
                if (fb0Var.mo5j(gb0Var) == c43Var) {
                    tb3.m5160f(gb0Var, fb0Var);
                }
                boolean z = y62Var.f13324h;
                c0349jg.getClass();
                C0129dg c0129dg = new C0129dg(c0349jg);
                while (c0129dg.hasNext()) {
                    ((gb0) c0129dg.next()).m1826Q0();
                }
                break;
            case 2:
                gb0Var.m1825P0(c0485n4);
                break;
            case 4:
                C0798v5 c0798v5 = new C0798v5(10, c0485n4);
                if (c0798v5.mo5j(gb0Var) == c43Var) {
                    tb3.m5160f(gb0Var, c0798v5);
                }
                c0349jg.clear();
                break;
            case 5:
                gb0Var.m1823N0();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                gb0Var.m1824O0();
                break;
        }
        return false;
    }
}
