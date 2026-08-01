package p095T;

import java.util.ArrayList;
import p105V.C1479a;
import p112W2.InterfaceC1599a;
import p186k.AbstractC2413J;
import p186k.C2404A;
import p186k.C2408E;

/* JADX INFO: renamed from: T.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1374m0 implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1376n0 f4842d;

    public C1374m0(C1376n0 c1376n0) {
        this.f4842d = c1376n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [k.A] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [k.A] */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ArrayList arrayList = this.f4842d.f4845a;
        C2408E c2408e = new C2408E(arrayList.size());
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ?? r5 = (C1336S) arrayList.get(i5);
            Object obj = r5.f4769b;
            int i6 = r5.f4768a;
            Object c1333q = obj != null ? new C1333Q(Integer.valueOf(i6), r5.f4769b) : Integer.valueOf(i6);
            int iM4271f = c2408e.m4271f(c1333q);
            boolean z5 = iM4271f < 0;
            Object obj2 = z5 ? null : c2408e.f7789c[iM4271f];
            if (obj2 != null) {
                if (obj2 instanceof C2404A) {
                    ?? r9 = (C2404A) obj2;
                    r9.m4243a(r5);
                    r5 = r9;
                } else {
                    Object[] objArr = AbstractC2413J.f7813a;
                    ?? c2404a = new C2404A(2);
                    c2404a.m4243a(obj2);
                    c2404a.m4243a(r5);
                    r5 = c2404a;
                }
            }
            if (z5) {
                int i7 = ~iM4271f;
                c2408e.f7788b[i7] = c1333q;
                c2408e.f7789c[i7] = r5;
            } else {
                c2408e.f7789c[iM4271f] = r5;
            }
        }
        return new C1479a(c2408e);
    }
}
