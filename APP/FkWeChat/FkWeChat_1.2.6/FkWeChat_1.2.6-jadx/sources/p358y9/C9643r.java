package p358y9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5109u0;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5698i;

/* JADX INFO: renamed from: y9.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9643r {

    /* JADX INFO: renamed from: a */
    public static final C9643r f32837a;

    /* JADX INFO: renamed from: b */
    public static final Map f32838b;

    /* JADX INFO: renamed from: c */
    public static final Map f32839c;

    static {
        C9643r c9643r = new C9643r();
        f32837a = c9643r;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f32838b = linkedHashMap;
        C5698i c5698i = C5698i.f17977a;
        c9643r.m37706c(c5698i.m23049l(), c9643r.m37704a("java.util.ArrayList", "java.util.LinkedList"));
        c9643r.m37706c(c5698i.m23051n(), c9643r.m37704a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        c9643r.m37706c(c5698i.m23050m(), c9643r.m37704a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C5691b.a aVar = C5691b.f17894d;
        c9643r.m37706c(aVar.m22993c(new C5692c("java.util.function.Function")), c9643r.m37704a("java.util.function.UnaryOperator"));
        c9643r.m37706c(aVar.m22993c(new C5692c("java.util.function.BiFunction")), c9643r.m37704a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(AbstractC4717x.m18815a(((C5691b) entry.getKey()).m22982a(), ((C5691b) entry.getValue()).m22982a()));
        }
        f32839c = AbstractC5109u0.m20778s(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final List m37704a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C5691b.f17894d.m22993c(new C5692c(str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final C5692c m37705b(C5692c c5692c) {
        c5692c.getClass();
        return (C5692c) f32839c.get(c5692c);
    }

    /* JADX INFO: renamed from: c */
    public final void m37706c(C5691b c5691b, List list) {
        Map map = f32838b;
        for (Object obj : list) {
            map.put(obj, c5691b);
        }
    }
}
