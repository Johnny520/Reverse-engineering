package p308v1;

import java.util.Map;
import p069f.C0943k0;
import p085fg.InterfaceC1231l;
import p131j0.C2046b;

/* JADX INFO: renamed from: v1.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4385e0 implements InterfaceC4415o0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4415o0 f14618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C4400j0 f14619c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f14620d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC4415o0 f14621e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4385e0(InterfaceC4415o0 interfaceC4415o0, C4400j0 c4400j0, int i9, InterfaceC4415o0 interfaceC4415o02, int i10) {
        this.f14617a = i10;
        this.f14619c = c4400j0;
        this.f14620d = i9;
        this.f14621e = interfaceC4415o02;
        this.f14618b = interfaceC4415o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: e */
    public final Map mo7599e() {
        switch (this.f14617a) {
        }
        return this.f14618b.mo7599e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7600f() {
        int i9;
        switch (this.f14617a) {
            case 0:
                int i10 = this.f14620d;
                C4400j0 c4400j0 = this.f14619c;
                c4400j0.f14652k = i10;
                this.f14621e.mo7600f();
                C2046b c2046b = c4400j0.f14660s;
                C0943k0 c0943k0 = c4400j0.f14659r;
                long[] jArr = c0943k0.f2968a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((255 & j3) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    Object obj = c0943k0.f2969b[i15];
                                    InterfaceC4395h1 interfaceC4395h1 = (InterfaceC4395h1) c0943k0.f2970c[i15];
                                    int iM5063i = c2046b.m5063i(obj);
                                    i9 = i12;
                                    if (iM5063i < 0 || iM5063i >= c4400j0.f14652k) {
                                        if (iM5063i >= 0) {
                                            Object[] objArr = c2046b.f6891g;
                                            Object obj2 = objArr[iM5063i];
                                            objArr[iM5063i] = AbstractC4434w.f14744b;
                                        }
                                        if (c4400j0.f14657p.m2315b(obj)) {
                                            interfaceC4395h1.mo8828a();
                                        }
                                        c0943k0.m2325l(i15);
                                    }
                                } else {
                                    i9 = i12;
                                }
                                j3 >>= i9;
                                i14++;
                                i12 = i9;
                            }
                            if (i13 == i12) {
                                if (i11 != length) {
                                    i11++;
                                }
                            }
                        }
                    }
                }
                c4400j0.m8847g(c4400j0.f14651j);
                break;
            default:
                int i16 = this.f14620d;
                C4400j0 c4400j02 = this.f14619c;
                c4400j02.f14651j = i16;
                this.f14621e.mo7600f();
                if (c4400j02.f14648g.f22797n == null) {
                    c4400j02.m8847g(c4400j02.f14651j);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: g */
    public final int mo7601g() {
        switch (this.f14617a) {
        }
        return this.f14618b.mo7601g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: h */
    public final int mo7602h() {
        switch (this.f14617a) {
        }
        return this.f14618b.mo7602h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4415o0
    /* JADX INFO: renamed from: i */
    public final InterfaceC1231l mo7612i() {
        switch (this.f14617a) {
        }
        return this.f14618b.mo7612i();
    }
}
