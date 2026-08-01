package p244u;

import java.util.List;
import p029F0.InterfaceC0377O;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p061L2.C0982v;
import p153e1.C2005a;
import p203n.C2654f0;

/* JADX INFO: renamed from: u.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3281n implements InterfaceC0377O {

    /* JADX INFO: renamed from: b */
    public static final C3281n f10144b = new C3281n(0);

    /* JADX INFO: renamed from: c */
    public static final C3281n f10145c = new C3281n(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10146a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [u.n.<clinit>():void] */
    public /* synthetic */ C3281n(int i5) {
        this.f10146a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0377O
    /* JADX INFO: renamed from: i */
    public final InterfaceC0378P mo16i(InterfaceC0379Q interfaceC0379Q, List list, long j5) {
        switch (this.f10146a) {
            case 0:
                return interfaceC0379Q.mo604f0(C2005a.m3682j(j5), C2005a.m3681i(j5), C0982v.f3048d, new C2654f0(22));
            default:
                return interfaceC0379Q.mo604f0(C2005a.m3678f(j5) ? C2005a.m3680h(j5) : 0, C2005a.m3677e(j5) ? C2005a.m3679g(j5) : 0, C0982v.f3048d, new C2654f0(22));
        }
    }
}
