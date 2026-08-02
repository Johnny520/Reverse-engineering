package defpackage;

import android.view.DragEvent;
import android.view.View;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o8 implements View.OnDragListener, eb0 {
    public final gb0 a;
    public final jg b;
    public final n8 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o8() {
        gb0 gb0Var = new gb0();
        gb0Var.x = 0L;
        this.a = gb0Var;
        this.b = new jg();
        this.c = new n8(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        n4 n4Var = new n4(14, dragEvent);
        int action = dragEvent.getAction();
        c43 c43Var = c43.h;
        jg jgVar = this.b;
        gb0 gb0Var = this.a;
        switch (action) {
            case 1:
                y62 y62Var = new y62();
                fb0 fb0Var = new fb0(n4Var, gb0Var, y62Var);
                if (fb0Var.j(gb0Var) == c43Var) {
                    tb3.f(gb0Var, fb0Var);
                }
                boolean z = y62Var.h;
                jgVar.getClass();
                dg dgVar = new dg(jgVar);
                while (dgVar.hasNext()) {
                    ((gb0) dgVar.next()).Q0();
                }
                break;
            case 2:
                gb0Var.P0(n4Var);
                break;
            case 4:
                v5 v5Var = new v5(10, n4Var);
                if (v5Var.j(gb0Var) == c43Var) {
                    tb3.f(gb0Var, v5Var);
                }
                jgVar.clear();
                break;
            case 5:
                gb0Var.N0();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                gb0Var.O0();
                break;
        }
        return false;
    }
}
