package p235q1;

import android.view.KeyEvent;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p029c2.InterfaceC1310c;
import p103h2.C2847b;
import p117i.C3076o0;
import p165l1.InterfaceC4507m;
import p215oc.C5725t;
import p250r1.C6457g;

/* JADX INFO: renamed from: q1.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6223q extends InterfaceC6217n {

    /* JADX INFO: renamed from: q1.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final a f19307r = new a();

        public a() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ boolean m24488z(InterfaceC6223q interfaceC6223q, KeyEvent keyEvent, InterfaceC0173a interfaceC0173a, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
            return false;
        }
        if ((i10 & 2) != 0) {
            interfaceC0173a = a.f19307r;
        }
        return interfaceC6223q.mo24512x(keyEvent, interfaceC0173a);
    }

    /* JADX INFO: renamed from: B */
    boolean mo24489B(C2847b c2847b, InterfaceC0173a interfaceC0173a);

    /* JADX INFO: renamed from: C */
    boolean mo24490C(InterfaceC1310c interfaceC1310c);

    /* JADX INFO: renamed from: a */
    boolean mo24491a(C6203g c6203g, C6457g c6457g);

    /* JADX INFO: renamed from: b */
    void mo24492b();

    /* JADX INFO: renamed from: d */
    C6457g mo24493d();

    /* JADX INFO: renamed from: e */
    void mo24494e();

    /* JADX INFO: renamed from: f */
    void mo24495f();

    /* JADX INFO: renamed from: g */
    InterfaceC4507m mo24496g();

    /* JADX INFO: renamed from: h */
    Boolean mo24497h(int i10, C6457g c6457g, InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: i */
    void mo24498i();

    /* JADX INFO: renamed from: j */
    boolean mo24499j();

    /* JADX INFO: renamed from: k */
    boolean mo24500k();

    /* JADX INFO: renamed from: l */
    boolean mo24501l(boolean z10, boolean z11, boolean z12, int i10);

    /* JADX INFO: renamed from: m */
    void mo24502m(C6206h0 c6206h0);

    /* JADX INFO: renamed from: n */
    InterfaceC6198d0 mo24503n();

    /* JADX INFO: renamed from: o */
    boolean mo24504o(int i10, boolean z10);

    /* JADX INFO: renamed from: p */
    boolean mo24505p();

    /* JADX INFO: renamed from: q */
    boolean mo24506q(int i10);

    /* JADX INFO: renamed from: r */
    void mo24507r(InterfaceC6207i interfaceC6207i);

    /* JADX INFO: renamed from: t */
    boolean mo24508t(KeyEvent keyEvent);

    /* JADX INFO: renamed from: u */
    void mo24509u(C6206h0 c6206h0);

    /* JADX INFO: renamed from: v */
    void mo24510v();

    /* JADX INFO: renamed from: w */
    C6206h0 mo24511w();

    /* JADX INFO: renamed from: x */
    boolean mo24512x(KeyEvent keyEvent, InterfaceC0173a interfaceC0173a);

    /* JADX INFO: renamed from: y */
    C3076o0 mo24513y();
}
