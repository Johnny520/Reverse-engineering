package p237q2;

import android.graphics.Typeface;
import p020b5.C0184c;
import p085fg.InterfaceC1236q;
import p085fg.InterfaceC1237r;
import p117i0.C1836h0;
import p177m2.AbstractC2772p;
import p177m2.C2761e;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p177m2.C2774r;
import p251r.C3619d;
import p276sf.C3967n;

/* JADX INFO: renamed from: q2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3429c implements InterfaceC1237r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11097g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f11098h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3429c(Object obj, int i9) {
        this.f11097g = i9;
        this.f11098h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1237r
    /* JADX INFO: renamed from: c */
    public final Object mo3355c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f11097g) {
            case 0:
                C3430d c3430d = (C3430d) this.f11098h;
                C2774r c2774rM6153b = ((C2761e) c3430d.f11103e).m6153b((AbstractC2772p) obj, (C2767k) obj2, ((C2765i) obj3).f8996a, ((C2766j) obj4).f8997a);
                if (c2774rM6153b instanceof C2774r) {
                    Object obj5 = c2774rM6153b.f9013g;
                    obj5.getClass();
                    return (Typeface) obj5;
                }
                C0184c c0184c = new C0184c(c2774rM6153b, c3430d.f11108j);
                c3430d.f11108j = c0184c;
                Object obj6 = c0184c.f471c;
                obj6.getClass();
                return (Typeface) obj6;
            default:
                InterfaceC1236q interfaceC1236q = (InterfaceC1236q) this.f11098h;
                C3619d c3619d = (C3619d) obj;
                ((Integer) obj2).getClass();
                C1836h0 c1836h0 = (C1836h0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4534f(c3619d) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 131) != 130)) {
                    interfaceC1236q.mo734b(c3619d, c1836h0, Integer.valueOf(iIntValue & 14));
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
        }
    }
}
