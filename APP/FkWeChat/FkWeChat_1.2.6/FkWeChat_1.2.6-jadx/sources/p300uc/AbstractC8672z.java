package p300uc;

import bd.AbstractC1109b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2550d;
import p098g9.InterfaceC2560n;
import p172l8.C4711r;
import p172l8.C4716w;
import p185m8.AbstractC5116y;
import p215oc.C5706c;
import p361yc.AbstractC9684d2;
import p361yc.AbstractC9689e2;
import p361yc.AbstractC9754r2;
import p361yc.C9678c1;
import p361yc.C9688e1;
import p361yc.C9691f;
import p361yc.C9742p0;
import p361yc.C9752r0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: uc.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC8672z {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC8647b m33285b(InterfaceC2549c interfaceC2549c, List list, InterfaceC0173a interfaceC0173a) {
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(Collection.class)) || AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(List.class)) || AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(List.class)) || AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(ArrayList.class))) {
            return new C9691f((InterfaceC8647b) list.get(0));
        }
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(HashSet.class))) {
            return new C9752r0((InterfaceC8647b) list.get(0));
        }
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(Set.class)) || AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(Set.class)) || AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(LinkedHashSet.class))) {
            return new C9688e1((InterfaceC8647b) list.get(0));
        }
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(HashMap.class))) {
            return new C9742p0((InterfaceC8647b) list.get(0), (InterfaceC8647b) list.get(1));
        }
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(Map.class)) || AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(Map.class)) || AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(LinkedHashMap.class))) {
            return new C9678c1((InterfaceC8647b) list.get(0), (InterfaceC8647b) list.get(1));
        }
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(Map.Entry.class))) {
            return AbstractC8920a.m34242j((InterfaceC8647b) list.get(0), (InterfaceC8647b) list.get(1));
        }
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(C4711r.class))) {
            return AbstractC8920a.m34245m((InterfaceC8647b) list.get(0), (InterfaceC8647b) list.get(1));
        }
        if (AbstractC1061t.m3842c(interfaceC2549c, AbstractC1052o0.m3807b(C4716w.class))) {
            return AbstractC8920a.m34248p((InterfaceC8647b) list.get(0), (InterfaceC8647b) list.get(1), (InterfaceC8647b) list.get(2));
        }
        if (!AbstractC9684d2.m37857o(interfaceC2549c)) {
            return null;
        }
        Object objInvoke = interfaceC0173a.invoke();
        objInvoke.getClass();
        return AbstractC8920a.m34233a((InterfaceC2549c) objInvoke, (InterfaceC8647b) list.get(0));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8647b m33286c(InterfaceC2549c interfaceC2549c, List list) {
        InterfaceC8647b[] interfaceC8647bArr = (InterfaceC8647b[]) list.toArray(new InterfaceC8647b[0]);
        return AbstractC9684d2.m37845c(interfaceC2549c, (InterfaceC8647b[]) Arrays.copyOf(interfaceC8647bArr, interfaceC8647bArr.length));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC8647b m33287d(InterfaceC8647b interfaceC8647b, boolean z10) {
        if (z10) {
            return AbstractC8920a.m34253u(interfaceC8647b);
        }
        interfaceC8647b.getClass();
        return interfaceC8647b;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC8647b m33288e(InterfaceC2549c interfaceC2549c, List list, InterfaceC0173a interfaceC0173a) {
        interfaceC2549c.getClass();
        list.getClass();
        interfaceC0173a.getClass();
        InterfaceC8647b interfaceC8647bM33285b = m33285b(interfaceC2549c, list, interfaceC0173a);
        return interfaceC8647bM33285b == null ? m33286c(interfaceC2549c, list) : interfaceC8647bM33285b;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC8647b m33289f(AbstractC1109b abstractC1109b, InterfaceC2560n interfaceC2560n) {
        abstractC1109b.getClass();
        interfaceC2560n.getClass();
        InterfaceC8647b interfaceC8647bM33291h = m33291h(abstractC1109b, interfaceC2560n, true);
        if (interfaceC8647bM33291h != null) {
            return interfaceC8647bM33291h;
        }
        AbstractC9684d2.m37858p(AbstractC9689e2.m37880c(interfaceC2560n));
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC8647b m33290g(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        InterfaceC8647b interfaceC8647bM33282e = AbstractC8670x.m33282e(interfaceC2549c);
        if (interfaceC8647bM33282e != null) {
            return interfaceC8647bM33282e;
        }
        AbstractC9689e2.m37883f(interfaceC2549c);
        C5706c.m23089a();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p300uc.InterfaceC8647b m33291h(bd.AbstractC1109b r6, p098g9.InterfaceC2560n r7, boolean r8) {
        /*
            g9.c r0 = p361yc.AbstractC9689e2.m37880c(r7)
            boolean r1 = r7.mo3875a()
            java.util.List r7 = r7.mo3876c()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p185m8.AbstractC5116y.m20814z(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r7.next()
            g9.p r3 = (p098g9.C2562p) r3
            g9.n r3 = p361yc.AbstractC9689e2.m37884g(r3)
            r2.add(r3)
            goto L1b
        L2f:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L4a
            boolean r7 = p361yc.AbstractC9684d2.m37854l(r0)
            if (r7 == 0) goto L45
            uc.b r7 = bd.AbstractC1109b.m4012c(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L45
        L43:
            r7 = r4
            goto L5e
        L45:
            uc.b r7 = p300uc.AbstractC8669w.m33276g(r0, r1)
            goto L5e
        L4a:
            boolean r7 = r6.mo4009d()
            if (r7 == 0) goto L51
            goto L43
        L51:
            java.lang.Object r7 = p300uc.AbstractC8669w.m33277h(r0, r2, r1)
            boolean r5 = p172l8.C4712s.m18803g(r7)
            if (r5 == 0) goto L5c
            r7 = r4
        L5c:
            uc.b r7 = (p300uc.InterfaceC8647b) r7
        L5e:
            if (r7 == 0) goto L61
            return r7
        L61:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L82
            uc.b r7 = p300uc.AbstractC8670x.m33282e(r0)
            if (r7 != 0) goto La7
            uc.b r7 = bd.AbstractC1109b.m4012c(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La7
            boolean r6 = p361yc.AbstractC9684d2.m37854l(r0)
            if (r6 == 0) goto L80
            uc.g r6 = new uc.g
            r6.<init>(r0)
        L7e:
            r7 = r6
            goto La7
        L80:
            r7 = r4
            goto La7
        L82:
            java.util.List r7 = p300uc.AbstractC8670x.m33283f(r6, r2, r8)
            if (r7 != 0) goto L89
            return r4
        L89:
            uc.y r8 = new uc.y
            r8.<init>()
            uc.b r8 = p300uc.AbstractC8670x.m33278a(r0, r7, r8)
            if (r8 != 0) goto La6
            uc.b r7 = r6.mo4008b(r0, r7)
            if (r7 != 0) goto La7
            boolean r6 = p361yc.AbstractC9684d2.m37854l(r0)
            if (r6 == 0) goto L80
            uc.g r6 = new uc.g
            r6.<init>(r0)
            goto L7e
        La6:
            r7 = r8
        La7:
            if (r7 == 0) goto Lae
            uc.b r6 = m33287d(r7, r1)
            return r6
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p300uc.AbstractC8672z.m33291h(bd.b, g9.n, boolean):uc.b");
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC2550d m33292i(List list) {
        return ((InterfaceC2560n) list.get(0)).mo3877e();
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC8647b m33293j(AbstractC1109b abstractC1109b, InterfaceC2560n interfaceC2560n) {
        abstractC1109b.getClass();
        interfaceC2560n.getClass();
        return m33291h(abstractC1109b, interfaceC2560n, false);
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC8647b m33294k(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        InterfaceC8647b interfaceC8647bM37844b = AbstractC9684d2.m37844b(interfaceC2549c);
        return interfaceC8647bM37844b == null ? AbstractC9754r2.m38035b(interfaceC2549c) : interfaceC8647bM37844b;
    }

    /* JADX INFO: renamed from: l */
    public static final List m33295l(AbstractC1109b abstractC1109b, List list, boolean z10) {
        abstractC1109b.getClass();
        list.getClass();
        if (z10) {
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8670x.m33279b(abstractC1109b, (InterfaceC2560n) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC8647b interfaceC8647bM33281d = AbstractC8670x.m33281d(abstractC1109b, (InterfaceC2560n) it2.next());
            if (interfaceC8647bM33281d == null) {
                return null;
            }
            arrayList2.add(interfaceC8647bM33281d);
        }
        return arrayList2;
    }
}
