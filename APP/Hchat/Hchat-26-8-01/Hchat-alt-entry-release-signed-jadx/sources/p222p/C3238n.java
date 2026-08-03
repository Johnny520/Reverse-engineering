package p222p;

import java.util.List;
import p119i2.C1955z;
import p293u2.C4231a;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: p.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3238n implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: b */
    public static final C3238n f10326b = new C3238n(0);

    /* JADX INFO: renamed from: c */
    public static final C3238n f10327c = new C3238n(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10328a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [p.n.<clinit>():void] */
    public /* synthetic */ C3238n(int i9) {
        this.f10328a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        switch (this.f10328a) {
            case 0:
                return interfaceC4418p0.mo8010z(C4231a.m8506j(j3), C4231a.m8505i(j3), C4174u.f13711g, new C1955z(14));
            default:
                return interfaceC4418p0.mo8010z(C4231a.m8502f(j3) ? C4231a.m8504h(j3) : 0, C4231a.m8501e(j3) ? C4231a.m8503g(j3) : 0, C4174u.f13711g, new C1955z(14));
        }
    }
}
