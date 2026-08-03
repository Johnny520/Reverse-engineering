package p016b1;

import android.view.DragEvent;
import android.view.View;
import androidx.lifecycle.C0119x;
import gg.C1421q;
import p069f.C0922a;
import p069f.C0932f;
import p339x1.AbstractC5618k;
import p339x1.EnumC5596d2;

/* JADX INFO: renamed from: b1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC0162b implements View.OnDragListener, InterfaceC0163c {

    /* JADX INFO: renamed from: a */
    public final C0168h f429a;

    /* JADX INFO: renamed from: b */
    public final C0932f f430b;

    /* JADX INFO: renamed from: c */
    public final C0161a f431c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnDragListenerC0162b() {
        C0168h c0168h = new C0168h();
        c0168h.f443w = 0L;
        this.f429a = c0168h;
        this.f430b = new C0932f();
        this.f431c = new C0161a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C0119x c0119x = new C0119x(dragEvent, 1);
        int action = dragEvent.getAction();
        EnumC5596d2 enumC5596d2 = EnumC5596d2.f22747g;
        C0932f c0932f = this.f430b;
        C0168h c0168h = this.f429a;
        switch (action) {
            case 1:
                C1421q c1421q = new C1421q();
                C0165e c0165e = new C0165e(c0119x, c0168h, c1421q);
                if (c0165e.invoke(c0168h) == enumC5596d2) {
                    AbstractC5618k.m10143B(c0168h, c0165e);
                }
                boolean z9 = c1421q.f4734g;
                c0932f.getClass();
                C0922a c0922a = new C0922a(c0932f);
                while (c0922a.hasNext()) {
                    ((C0168h) c0922a.next()).m749o1();
                }
                break;
            case 2:
                c0168h.m748n1(c0119x);
                break;
            case 4:
                C0166f c0166f = new C0166f(c0119x, 0);
                if (c0166f.invoke(c0168h) == enumC5596d2) {
                    AbstractC5618k.m10143B(c0168h, c0166f);
                }
                c0932f.clear();
                break;
            case 5:
                c0168h.m746l1();
                break;
            case 6:
                c0168h.m747m1();
                break;
        }
        return false;
    }
}
