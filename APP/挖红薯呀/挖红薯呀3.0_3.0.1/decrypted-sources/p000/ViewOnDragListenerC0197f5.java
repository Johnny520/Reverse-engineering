package p000;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: renamed from: f5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC0197f5 implements View.OnDragListener, InterfaceC0660qp {

    /* JADX INFO: renamed from: a */
    public final C0734sp f1579a;

    /* JADX INFO: renamed from: b */
    public final C0164e9 f1580b;

    /* JADX INFO: renamed from: c */
    public final C0160e5 f1581c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnDragListenerC0197f5() {
        C0734sp c0734sp = new C0734sp();
        c0734sp.f5817t = 0L;
        this.f1579a = c0734sp;
        this.f1580b = new C0164e9();
        this.f1581c = new C0160e5(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        int i = 9;
        C0910x1 c0910x1 = new C0910x1(i, dragEvent);
        int action = dragEvent.getAction();
        g91 g91Var = g91.f1893d;
        C0164e9 c0164e9 = this.f1580b;
        C0734sp c0734sp = this.f1579a;
        switch (action) {
            case 1:
                vt0 vt0Var = new vt0();
                C0711s2 c0711s2 = new C0711s2(c0910x1, c0734sp, vt0Var);
                if (c0711s2.invoke(c0734sp) == g91Var) {
                    r60.m3397F(c0734sp, c0711s2);
                }
                boolean z = vt0Var.f6825d;
                c0164e9.getClass();
                C0991z8 c0991z8 = new C0991z8(c0164e9);
                while (c0991z8.hasNext()) {
                    ((C0734sp) c0991z8.next()).m4094A0();
                }
                break;
            case 2:
                c0734sp.m4098z0(c0910x1);
                break;
            case 4:
                C0711s2 c0711s22 = new C0711s2(i, c0910x1);
                if (c0711s22.invoke(c0734sp) == g91Var) {
                    r60.m3397F(c0734sp, c0711s22);
                }
                c0164e9.clear();
                break;
            case 5:
                c0734sp.m4096x0();
                break;
            case 6:
                c0734sp.m4097y0();
                break;
        }
        return false;
    }
}
