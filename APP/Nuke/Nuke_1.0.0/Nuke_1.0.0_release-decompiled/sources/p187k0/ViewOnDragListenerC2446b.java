package p187k0;

import android.view.DragEvent;
import android.view.View;
import me.dartcv.nuke.BuildConfig;
import p007B0.C0172E;
import p007B0.C0192f;
import p041H0.AbstractC0601k;
import p041H0.EnumC0556D0;
import p117X2.C1671p;
import p121Y1.C1753n;
import p186k.C2419a;
import p186k.C2424f;

/* JADX INFO: renamed from: k0.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC2446b implements View.OnDragListener, InterfaceC2447c {

    /* JADX INFO: renamed from: a */
    public final C2449e f7905a;

    /* JADX INFO: renamed from: b */
    public final C2424f f7906b;

    /* JADX INFO: renamed from: c */
    public final C2445a f7907c;

    public ViewOnDragListenerC2446b() {
        C2449e c2449e = new C2449e();
        c2449e.f7911t = 0L;
        this.f7905a = c2449e;
        this.f7906b = new C2424f();
        this.f7907c = new C2445a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C1753n c1753n = new C1753n(9, dragEvent);
        int action = dragEvent.getAction();
        EnumC0556D0 enumC0556D0 = EnumC0556D0.f1668d;
        C2424f c2424f = this.f7906b;
        C2449e c2449e = this.f7905a;
        switch (action) {
            case BuildConfig.VERSION_CODE /* 1 */:
                C1671p c1671p = new C1671p();
                C0192f c0192f = new C0192f(c1753n, c2449e, c1671p);
                if (c0192f.mo1h(c2449e) == enumC0556D0) {
                    AbstractC0601k.m1050z(c2449e, c0192f);
                }
                boolean z5 = c1671p.f5705d;
                c2424f.getClass();
                C2419a c2419a = new C2419a(c2424f);
                while (c2419a.hasNext()) {
                    ((C2449e) c2419a.next()).m4372N0(c1753n);
                }
                break;
            case 2:
                c2449e.m4371M0(c1753n);
                break;
            case 4:
                C0172E c0172e = new C0172E(18, c1753n);
                if (c0172e.mo1h(c2449e) == enumC0556D0) {
                    AbstractC0601k.m1050z(c2449e, c0172e);
                }
                c2424f.clear();
                break;
            case 5:
                c2449e.m4369K0(c1753n);
                break;
            case 6:
                c2449e.m4370L0(c1753n);
                break;
        }
        return false;
    }
}
