package p308v1;

import java.util.List;
import p085fg.InterfaceC1235p;
import p293u2.C4231a;
import p339x1.AbstractC5590c0;

/* JADX INFO: renamed from: v1.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4388f0 extends AbstractC5590c0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4400j0 f14624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1235p f14625c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4388f0(C4400j0 c4400j0, InterfaceC1235p interfaceC1235p, String str) {
        super(str);
        this.f14624b = c4400j0;
        this.f14625c = interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        C4400j0 c4400j0 = this.f14624b;
        C4382d0 c4382d0 = c4400j0.f14655n;
        c4382d0.f14610g = interfaceC4418p0.getLayoutDirection();
        c4382d0.f14611h = interfaceC4418p0.mo1333d();
        c4382d0.f14612i = interfaceC4418p0.mo1335q0();
        boolean zMo8009u0 = interfaceC4418p0.mo8009u0();
        InterfaceC1235p interfaceC1235p = this.f14625c;
        if (zMo8009u0 || c4400j0.f14648g.f22797n == null) {
            c4400j0.f14651j = 0;
            InterfaceC4415o0 interfaceC4415o0 = (InterfaceC4415o0) interfaceC1235p.invoke(c4382d0, new C4231a(j3));
            return new C4385e0(interfaceC4415o0, c4400j0, c4400j0.f14651j, interfaceC4415o0, 1);
        }
        c4400j0.f14652k = 0;
        InterfaceC4415o0 interfaceC4415o02 = (InterfaceC4415o0) interfaceC1235p.invoke(c4400j0.f14656o, new C4231a(j3));
        return new C4385e0(interfaceC4415o02, c4400j0, c4400j0.f14652k, interfaceC4415o02, 0);
    }
}
