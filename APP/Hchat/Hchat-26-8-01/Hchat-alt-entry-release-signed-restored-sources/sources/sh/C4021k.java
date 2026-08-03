package sh;

import java.util.ArrayList;
import p069f.AbstractC0953p0;
import p069f.C0933f0;
import p069f.C0943k0;
import p085fg.InterfaceC1220a;
import p116i.C1765k1;
import p117i0.C1844j0;
import p117i0.C1868p0;
import p131j0.C2045a;
import p159l0.C2423e;

/* JADX INFO: renamed from: sh.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4021k implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13186g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f13187h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4021k(Object obj, int i9) {
        this.f13186g = i9;
        this.f13187h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0049 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [f.f0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, l0.e] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [f.f0] */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        int i9 = this.f13186g;
        Object obj = this.f13187h;
        switch (i9) {
            case 0:
                return ((C1765k1) obj).f5892d.getValue();
            case 1:
                return ((C1765k1) obj).m4417f();
            case 2:
                return ((C1765k1) obj).f5892d.getValue();
            case 3:
                return ((C1765k1) obj).m4417f();
            case 4:
                return ((C1765k1) obj).f5892d.getValue();
            case 5:
                return ((C1765k1) obj).m4417f();
            case 6:
                return ((C1765k1) obj).f5892d.getValue();
            case 7:
                return ((C1765k1) obj).m4417f();
            case 8:
                return ((C1765k1) obj).f5892d.getValue();
            case 9:
                return ((C1765k1) obj).m4417f();
            case 10:
                return ((C1765k1) obj).f5892d.getValue();
            case 11:
                return ((C1765k1) obj).m4417f();
            default:
                ArrayList arrayList = ((C1844j0) obj).f6137a;
                C0943k0 c0943k0 = new C0943k0(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ?? r5 = (C2423e) arrayList.get(i10);
                    Object obj2 = r5.f7930b;
                    int i11 = r5.f7929a;
                    Object c1868p0 = obj2 != null ? new C1868p0(Integer.valueOf(i11), r5.f7930b) : Integer.valueOf(i11);
                    int iM2319f = c0943k0.m2319f(c1868p0);
                    boolean z9 = iM2319f < 0;
                    Object obj3 = z9 ? null : c0943k0.f2970c[iM2319f];
                    if (obj3 != null) {
                        if (obj3 instanceof C0933f0) {
                            ?? r92 = (C0933f0) obj3;
                            r92.m2286a(r5);
                            r5 = r92;
                        } else {
                            Object[] objArr = AbstractC0953p0.f3002a;
                            ?? c0933f0 = new C0933f0(2);
                            c0933f0.m2286a(obj3);
                            c0933f0.m2286a(r5);
                            r5 = c0933f0;
                        }
                    }
                    if (z9) {
                        int i12 = ~iM2319f;
                        c0943k0.f2969b[i12] = c1868p0;
                        c0943k0.f2970c[i12] = r5;
                    } else {
                        c0943k0.f2970c[iM2319f] = r5;
                    }
                }
                return new C2045a(c0943k0);
        }
    }
}
