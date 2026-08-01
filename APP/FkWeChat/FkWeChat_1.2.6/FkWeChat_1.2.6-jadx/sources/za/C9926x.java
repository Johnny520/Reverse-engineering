package za;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6055y0;
import p230pb.AbstractC6059a;
import p244qb.C6379j;
import p342x9.InterfaceC9468b;
import sa.AbstractC7269s;

/* JADX INFO: renamed from: za.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9926x extends AbstractC9903a {

    /* JADX INFO: renamed from: d */
    public static final a f33454d = new a(null);

    /* JADX INFO: renamed from: b */
    public final String f33455b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9913k f33456c;

    public C9926x(String str, InterfaceC9913k interfaceC9913k) {
        this.f33455b = str;
        this.f33456c = interfaceC9913k;
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC9913k m38481m(String str, Collection collection) {
        return f33454d.m38485a(str, collection);
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC5983a m38482n(InterfaceC5983a interfaceC5983a) {
        interfaceC5983a.getClass();
        return interfaceC5983a;
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC5983a m38483o(InterfaceC6000f1 interfaceC6000f1) {
        interfaceC6000f1.getClass();
        return interfaceC6000f1;
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC5983a m38484p(InterfaceC6055y0 interfaceC6055y0) {
        interfaceC6055y0.getClass();
        return interfaceC6055y0;
    }

    @Override // za.AbstractC9903a, za.InterfaceC9913k
    /* JADX INFO: renamed from: a */
    public Collection mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return AbstractC7269s.m28848b(super.mo5513a(c5695f, interfaceC9468b), C9923u.f33451q);
    }

    @Override // za.AbstractC9903a, za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return AbstractC7269s.m28848b(super.mo5515c(c5695f, interfaceC9468b), C9924v.f33452q);
    }

    @Override // za.AbstractC9903a, za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        Collection collectionMo5519g = super.mo5519g(c9906d, interfaceC0184l);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionMo5519g) {
            if (((InterfaceC6019m) obj) instanceof InterfaceC5983a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C4711r c4711r = new C4711r(arrayList, arrayList2);
        List list = (List) c4711r.m18792a();
        List list2 = (List) c4711r.m18793b();
        list.getClass();
        return AbstractC5081g0.m20533E0(AbstractC7269s.m28848b(list, C9925w.f33453q), list2);
    }

    @Override // za.AbstractC9903a
    /* JADX INFO: renamed from: i */
    public InterfaceC9913k mo38418i() {
        return this.f33456c;
    }

    /* JADX INFO: renamed from: za.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC9913k m38485a(String str, Collection collection) {
            str.getClass();
            collection.getClass();
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC2706r0) it.next()).mo7040v());
            }
            C6379j c6379jM24123b = AbstractC6059a.m24123b(arrayList);
            InterfaceC9913k interfaceC9913kM38421b = C9904b.f33389d.m38421b(str, c6379jM24123b);
            return c6379jM24123b.size() <= 1 ? interfaceC9913kM38421b : new C9926x(str, interfaceC9913kM38421b, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C9926x(String str, InterfaceC9913k interfaceC9913k, AbstractC1043k abstractC1043k) {
        this(str, interfaceC9913k);
    }
}
