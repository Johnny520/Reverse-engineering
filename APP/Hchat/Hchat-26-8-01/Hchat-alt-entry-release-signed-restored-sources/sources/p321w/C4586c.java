package p321w;

import java.util.ArrayList;
import java.util.List;
import p100h0.C1541o0;
import p119i2.C1955z;
import p293u2.C4231a;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import tf.C4174u;

/* JADX INFO: renamed from: w.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4586c implements InterfaceC4412n0 {

    /* JADX INFO: renamed from: b */
    public static final C4586c f15113b = new C4586c(0);

    /* JADX INFO: renamed from: c */
    public static final C4586c f15114c = new C4586c(1);

    /* JADX INFO: renamed from: d */
    public static final C1955z f15115d = new C1955z(14);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15116a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [w.c.<clinit>():void] */
    public /* synthetic */ C4586c(int i9) {
        this.f15116a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4412n0
    /* JADX INFO: renamed from: h */
    public final InterfaceC4415o0 mo3994h(InterfaceC4418p0 interfaceC4418p0, List list, long j3) {
        switch (this.f15116a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList.add(((InterfaceC4409m0) list.get(i9)).mo8831Q(j3));
                }
                return interfaceC4418p0.mo8010z(C4231a.m8504h(j3), C4231a.m8503g(j3), C4174u.f13711g, new C1541o0(2, arrayList));
            default:
                return interfaceC4418p0.mo8010z(C4231a.m8504h(j3), C4231a.m8503g(j3), C4174u.f13711g, f15115d);
        }
    }
}
