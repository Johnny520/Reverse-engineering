package p043W0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p027N0.AbstractC0223g;
import p035S.C0246b;
import p047Z0.C0361a;
import p047Z0.C0362b;
import p047Z0.C0364d;
import p050a1.C0368a;

/* JADX INFO: renamed from: W0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0353a extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f826d;

    /* JADX INFO: renamed from: e */
    public List f827e;

    /* JADX INFO: renamed from: f */
    public AbstractC0079h f828f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.a.c(java.lang.Object):java.lang.Object, A0.g.A(org.luckypray.dexkit.DexKitBridge, java.util.List, java.util.Set):java.util.List, A0.g.r(org.luckypray.dexkit.DexKitBridge, java.lang.String[]):java.util.List, A0.g.s(org.luckypray.dexkit.DexKitBridge, java.lang.ClassLoader, java.util.List):java.util.ArrayList, A0.g.t(java.lang.ClassLoader, org.luckypray.dexkit.DexKitBridge, java.util.List, java.util.List):java.lang.Class, A0.g.u(org.luckypray.dexkit.DexKitBridge, java.util.List, java.util.List, boolean):java.util.List, A0.h.c(java.lang.Object):java.lang.Object, A0.h.d(java.lang.Object):java.lang.Object, A0.h.e(java.lang.Object):java.lang.Object, A0.h.f(java.lang.Object):java.lang.Object, A0.h.g(java.lang.Object):java.lang.Object, A0.h.h(java.lang.Object):java.lang.Object, A0.h.i(java.lang.Object):java.lang.Object, Z0.b.c0(java.lang.String[]):void] */
    public /* synthetic */ C0353a(int i2) {
        this.f826d = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final int m607Y(C0246b c0246b) {
        int iM464d;
        int iM464d2;
        int iM464d3;
        switch (this.f826d) {
            case 0:
                List list = this.f827e;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(c0246b.m463c((String) it.next())));
                    }
                    iM464d = c0246b.m464d(AbstractC0123k.m280v0(arrayList));
                } else {
                    iM464d = 0;
                }
                C0361a c0361a = (C0361a) this.f828f;
                int iM618Z = c0361a != null ? c0361a.m618Z(c0246b) : 0;
                c0246b.m470j(6);
                c0246b.m461a(5, iM618Z);
                c0246b.m461a(3, 0);
                c0246b.m461a(1, 0);
                c0246b.m461a(0, iM464d);
                int iM465e = c0246b.m465e();
                c0246b.m466f(iM465e);
                return iM465e;
            case 1:
                List list2 = this.f827e;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(list2));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(c0246b.m463c((String) it2.next())));
                    }
                    iM464d2 = c0246b.m464d(AbstractC0123k.m280v0(arrayList2));
                } else {
                    iM464d2 = 0;
                }
                C0362b c0362b = (C0362b) this.f828f;
                int iM624Z = c0362b != null ? c0362b.m624Z(c0246b) : 0;
                c0246b.m470j(7);
                c0246b.m461a(6, iM624Z);
                c0246b.m461a(4, 0);
                c0246b.m461a(3, 0);
                c0246b.m461a(1, 0);
                c0246b.m461a(0, iM464d2);
                int iM465e2 = c0246b.m465e();
                c0246b.m466f(iM465e2);
                return iM465e2;
            default:
                List<C0364d> list3 = this.f827e;
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(AbstractC0125m.m289c0(list3));
                    for (C0364d c0364d : list3) {
                        if (c0364d == null) {
                            c0364d = new C0364d();
                        }
                        arrayList3.add(Integer.valueOf(c0364d.m628Y(c0246b)));
                    }
                    iM464d3 = c0246b.m464d(AbstractC0123k.m280v0(arrayList3));
                } else {
                    iM464d3 = 0;
                }
                C0368a c0368a = (C0368a) this.f828f;
                int iM630Y = c0368a != null ? c0368a.m630Y(c0246b) : 0;
                c0246b.m470j(2);
                c0246b.m461a(1, iM630Y);
                c0246b.m461a(0, iM464d3);
                int iM465e3 = c0246b.m465e();
                c0246b.m466f(iM465e3);
                return iM465e3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public void m608Z(String... strArr) {
        AbstractC0223g.m418e(strArr, "searchPackages");
        this.f827e = AbstractC0120h.m262j0(strArr);
    }
}
