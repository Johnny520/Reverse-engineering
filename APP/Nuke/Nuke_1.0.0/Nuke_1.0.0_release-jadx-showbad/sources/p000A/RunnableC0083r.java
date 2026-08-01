package p000A;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import nuke.p209ui.HomeActivity;
import p061L2.C0981u;
import p092S0.AbstractC1251D;
import p092S0.C1260M;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p130a1.C1791d;
import p135b.C1812D;
import p135b.C1827o;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.C2070b;

/* JADX INFO: renamed from: A.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0083r implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f377d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f378e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f379f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f380g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f381h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f382i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0083r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f377d = i5;
        this.f378e = obj;
        this.f379f = obj2;
        this.f380g = obj3;
        this.f381h = obj4;
        this.f382i = obj5;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C2070b c2070bMo3799C;
        switch (this.f377d) {
            case 0:
                C1260M c1260m = (C1260M) this.f378e;
                EnumC2017m enumC2017m = (EnumC2017m) this.f379f;
                String str = (String) this.f380g;
                InterfaceC2007c interfaceC2007c = (InterfaceC2007c) this.f381h;
                InterfaceC1580e interfaceC1580e = (InterfaceC1580e) this.f382i;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
                    C2070b c2070b = abstractC2074fM3834j instanceof C2070b ? (C2070b) abstractC2074fM3834j : null;
                    if (c2070b == null || (c2070bMo3799C = c2070b.mo3799C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC2074f abstractC2074fM3813j = c2070bMo3799C.m3813j();
                        try {
                            C1260M c1260mM2319h = AbstractC1251D.m2319h(c1260m, enumC2017m);
                            C0981u c0981u = C0981u.f3047d;
                            new C1791d(str, c1260mM2319h, c0981u, c0981u, interfaceC1580e, interfaceC2007c).mo426c();
                            c2070bMo3799C.mo3800w().mo3817d();
                            return;
                        } finally {
                            AbstractC2074f.m3811q(abstractC2074fM3813j);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            default:
                C1827o c1827o = (C1827o) this.f378e;
                C1812D c1812d = (C1812D) this.f379f;
                C1812D c1812d2 = (C1812D) this.f380g;
                HomeActivity homeActivity = (HomeActivity) this.f381h;
                View view = (View) this.f382i;
                Window window = homeActivity.getWindow();
                AbstractC1665j.m2984d(window, "getWindow(...)");
                InterfaceC1601c interfaceC1601c = c1812d.f6200c;
                Resources resources = view.getResources();
                AbstractC1665j.m2984d(resources, "getResources(...)");
                boolean zBooleanValue = ((Boolean) interfaceC1601c.mo1h(resources)).booleanValue();
                InterfaceC1601c interfaceC1601c2 = c1812d2.f6200c;
                Resources resources2 = view.getResources();
                AbstractC1665j.m2984d(resources2, "getResources(...)");
                c1827o.mo3297b(c1812d, c1812d2, window, view, zBooleanValue, ((Boolean) interfaceC1601c2.mo1h(resources2)).booleanValue());
                return;
        }
    }
}
