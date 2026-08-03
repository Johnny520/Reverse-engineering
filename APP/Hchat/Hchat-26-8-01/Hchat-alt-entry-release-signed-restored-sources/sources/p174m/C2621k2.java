package p174m;

import ac.AbstractC0063p;
import p144k.C2167e1;
import p251r.C3631p;
import p251r.C3632q;
import p251r.C3641z;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: m.k2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2621k2 implements InterfaceC2660u1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8530a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8532c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2621k2(Object obj, int i9, Object obj2) {
        this.f8530a = i9;
        this.f8531b = obj;
        this.f8532c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static int m6076b(C2621k2 c2621k2, int i9) {
        Object obj;
        C3641z c3641z = (C3641z) c2621k2.f8532c;
        C3631p c3631pM7623j = c3641z.m7623j();
        if (!c3631pM7623j.f11746k.isEmpty()) {
            int iM7621h = c3641z.m7621h();
            if (i9 > c2621k2.m6078c() || iM7621h > i9) {
                return ((i9 - c3641z.m7621h()) * AbstractC0063p.m406P(c3631pM7623j)) - c3641z.m7622i();
            }
            ?? r5 = c3631pM7623j.f11746k;
            int size = r5.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    obj = null;
                    break;
                }
                obj = r5.get(i10);
                if (((C3632q) obj).f11753a == i9) {
                    break;
                }
                i10++;
            }
            C3632q c3632q = (C3632q) obj;
            if (c3632q != null) {
                return c3632q.f11767o;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2660u1
    /* JADX INFO: renamed from: a */
    public final float mo6077a(float f3) {
        switch (this.f8530a) {
            case 0:
                C2637o2 c2637o2 = (C2637o2) this.f8531b;
                if (Math.abs(f3) == 0.0f || ((Boolean) c2637o2.f8595h.invoke()).booleanValue()) {
                    return c2637o2.m6091d(c2637o2.m6094g(((C2629m2) this.f8532c).m6085a(2, c2637o2.m6092e(c2637o2.m6095h(f3)))));
                }
                throw new C2167e1("The fling animation was cancelled", 0);
            default:
                return ((InterfaceC2660u1) this.f8531b).mo6077a(f3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public int m6078c() {
        C3632q c3632q = (C3632q) AbstractC4166m.m8394C1(((C3641z) this.f8532c).m7623j().f11746k);
        if (c3632q != null) {
            return c3632q.f11753a;
        }
        return 0;
    }
}
