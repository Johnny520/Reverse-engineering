package p176m1;

import androidx.lifecycle.C0119x;
import gg.AbstractC1417m;
import p020b5.C0184c;
import p085fg.InterfaceC1231l;
import p101h1.InterfaceC1567d;
import p276sf.C3967n;

/* JADX INFO: renamed from: m1.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2727d0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8837g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2729e0 f8838h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2727d0(C2729e0 c2729e0, int i9) {
        super(1);
        this.f8837g = i9;
        this.f8838h = c2729e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [fg.a, gg.m] */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f8837g) {
            case 0:
                C2729e0 c2729e0 = this.f8838h;
                c2729e0.f8852d = true;
                c2729e0.f8854f.invoke();
                return C3967n.f12976a;
            default:
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                C2729e0 c2729e02 = this.f8838h;
                C2724c c2724c = c2729e02.f8850b;
                float f3 = c2729e02.f8859k;
                float f10 = c2729e02.f8860l;
                C0184c c0184cMo4081z0 = interfaceC1567d.mo4081z0();
                long jM825v = c0184cMo4081z0.m825v();
                c0184cMo4081z0.m819p().mo2487e();
                try {
                    ((C0119x) c0184cMo4081z0.f469a).m587S(f3, f10, 0L);
                    c2724c.mo6141a(interfaceC1567d);
                    c0184cMo4081z0.m819p().mo2497p();
                    c0184cMo4081z0.m803U(jM825v);
                    return C3967n.f12976a;
                } catch (Throwable th2) {
                    c0184cMo4081z0.m819p().mo2497p();
                    c0184cMo4081z0.m803U(jM825v);
                    throw th2;
                }
        }
    }
}
