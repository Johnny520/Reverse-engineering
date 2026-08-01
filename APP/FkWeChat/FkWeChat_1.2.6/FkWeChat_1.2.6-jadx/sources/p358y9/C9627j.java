package p358y9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.C5135p;
import p212o9.C5667c;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5693d;
import p213oa.C5695f;

/* JADX INFO: renamed from: y9.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9627j {

    /* JADX INFO: renamed from: a */
    public static final C9627j f32785a = new C9627j();

    /* JADX INFO: renamed from: b */
    public static final Map f32786b;

    /* JADX INFO: renamed from: c */
    public static final Map f32787c;

    /* JADX INFO: renamed from: d */
    public static final Set f32788d;

    /* JADX INFO: renamed from: e */
    public static final Set f32789e;

    /* JADX INFO: renamed from: f */
    public static final Set f32790f;

    static {
        C5693d c5693d = C5135p.a.f15608s;
        C4711r c4711rM18815a = AbstractC4717x.m18815a(AbstractC9629k.m37677d(c5693d, "name"), C5135p.f15510m);
        C4711r c4711rM18815a2 = AbstractC4717x.m18815a(AbstractC9629k.m37677d(c5693d, "ordinal"), C5695f.m23027j("ordinal"));
        C4711r c4711rM18815a3 = AbstractC4717x.m18815a(AbstractC9629k.m37676c(C5135p.a.f15569X, "size"), C5695f.m23027j("size"));
        C5692c c5692c = C5135p.a.f15575b0;
        Map mapM20771l = AbstractC5109u0.m20771l(c4711rM18815a, c4711rM18815a2, c4711rM18815a3, AbstractC4717x.m18815a(AbstractC9629k.m37676c(c5692c, "size"), C5695f.m23027j("size")), AbstractC4717x.m18815a(AbstractC9629k.m37677d(C5135p.a.f15584g, "length"), C5695f.m23027j("length")), AbstractC4717x.m18815a(AbstractC9629k.m37676c(c5692c, "keys"), C5695f.m23027j("keySet")), AbstractC4717x.m18815a(AbstractC9629k.m37676c(c5692c, "values"), C5695f.m23027j("values")), AbstractC4717x.m18815a(AbstractC9629k.m37676c(c5692c, "entries"), C5695f.m23027j("entrySet")), AbstractC4717x.m18815a(AbstractC9629k.m37676c(C5135p.a.f15555P0, "size"), C5695f.m23027j("length")), AbstractC4717x.m18815a(AbstractC9629k.m37676c(C5135p.a.f15557Q0, "size"), C5695f.m23027j("length")), AbstractC4717x.m18815a(AbstractC9629k.m37676c(C5135p.a.f15559R0, "size"), C5695f.m23027j("length")));
        f32786b = mapM20771l;
        Set<Map.Entry> setEntrySet = mapM20771l.entrySet();
        ArrayList<C4711r> arrayList = new ArrayList(AbstractC5116y.m20814z(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C4711r(((C5692c) entry.getKey()).m22999f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C4711r c4711r : arrayList) {
            C5695f c5695f = (C5695f) c4711r.m18796f();
            Object arrayList2 = linkedHashMap.get(c5695f);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c5695f, arrayList2);
            }
            ((List) arrayList2).add((C5695f) c4711r.m18795e());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5107t0.m20763e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC5081g0.m20563c0((Iterable) entry2.getValue()));
        }
        f32787c = linkedHashMap2;
        Map map = f32786b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            C5691b c5691bM22893n = C5667c.f17796a.m22893n(((C5692c) entry3.getKey()).m22997d().m23002i());
            c5691bM22893n.getClass();
            linkedHashSet.add(c5691bM22893n.m22982a().m22995b((C5695f) entry3.getValue()));
        }
        f32788d = linkedHashSet;
        Set setKeySet = f32786b.keySet();
        f32789e = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C5692c) it.next()).m22999f());
        }
        f32790f = AbstractC5081g0.m20564c1(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public final Map m37654a() {
        return f32786b;
    }

    /* JADX INFO: renamed from: b */
    public final List m37655b(C5695f c5695f) {
        c5695f.getClass();
        List list = (List) f32787c.get(c5695f);
        return list == null ? AbstractC5114x.m20800o() : list;
    }

    /* JADX INFO: renamed from: c */
    public final Set m37656c() {
        return f32789e;
    }

    /* JADX INFO: renamed from: d */
    public final Set m37657d() {
        return f32790f;
    }
}
