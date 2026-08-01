package p185m8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p172l8.C4711r;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: m8.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5109u0 extends AbstractC5107t0 {
    /* JADX INFO: renamed from: i */
    public static Map m20768i() {
        C5089k0 c5089k0 = C5089k0.f15400q;
        c5089k0.getClass();
        return c5089k0;
    }

    /* JADX INFO: renamed from: j */
    public static Object m20769j(Map map, Object obj) {
        map.getClass();
        return AbstractC5105s0.m20679a(map, obj);
    }

    /* JADX INFO: renamed from: k */
    public static HashMap m20770k(C4711r... c4711rArr) {
        c4711rArr.getClass();
        HashMap map = new HashMap(AbstractC5107t0.m20763e(c4711rArr.length));
        m20777r(map, c4711rArr);
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static Map m20771l(C4711r... c4711rArr) {
        c4711rArr.getClass();
        return c4711rArr.length > 0 ? m20783x(c4711rArr, new LinkedHashMap(AbstractC5107t0.m20763e(c4711rArr.length))) : m20768i();
    }

    /* JADX INFO: renamed from: m */
    public static Map m20772m(C4711r... c4711rArr) {
        c4711rArr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5107t0.m20763e(c4711rArr.length));
        m20777r(linkedHashMap, c4711rArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: n */
    public static final Map m20773n(Map map) {
        map.getClass();
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC5107t0.m20765g(map) : m20768i();
    }

    /* JADX INFO: renamed from: o */
    public static Map m20774o(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: p */
    public static final void m20775p(Map map, Iterable iterable) {
        map.getClass();
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C4711r c4711r = (C4711r) it.next();
            map.put(c4711r.m18792a(), c4711r.m18793b());
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m20776q(Map map, InterfaceC7282h interfaceC7282h) {
        map.getClass();
        interfaceC7282h.getClass();
        Iterator it = interfaceC7282h.iterator();
        while (it.hasNext()) {
            C4711r c4711r = (C4711r) it.next();
            map.put(c4711r.m18792a(), c4711r.m18793b());
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m20777r(Map map, C4711r[] c4711rArr) {
        map.getClass();
        c4711rArr.getClass();
        for (C4711r c4711r : c4711rArr) {
            map.put(c4711r.m18792a(), c4711r.m18793b());
        }
    }

    /* JADX INFO: renamed from: s */
    public static Map m20778s(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return m20773n(m20779t(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m20768i();
        }
        if (size != 1) {
            return m20779t(iterable, new LinkedHashMap(AbstractC5107t0.m20763e(collection.size())));
        }
        return AbstractC5107t0.m20764f((C4711r) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    /* JADX INFO: renamed from: t */
    public static final Map m20779t(Iterable iterable, Map map) {
        iterable.getClass();
        map.getClass();
        m20775p(map, iterable);
        return map;
    }

    /* JADX INFO: renamed from: u */
    public static Map m20780u(Map map) {
        map.getClass();
        int size = map.size();
        return size != 0 ? size != 1 ? m20784y(map) : AbstractC5107t0.m20765g(map) : m20768i();
    }

    /* JADX INFO: renamed from: v */
    public static Map m20781v(InterfaceC7282h interfaceC7282h) {
        interfaceC7282h.getClass();
        return m20773n(m20782w(interfaceC7282h, new LinkedHashMap()));
    }

    /* JADX INFO: renamed from: w */
    public static final Map m20782w(InterfaceC7282h interfaceC7282h, Map map) {
        interfaceC7282h.getClass();
        map.getClass();
        m20776q(map, interfaceC7282h);
        return map;
    }

    /* JADX INFO: renamed from: x */
    public static final Map m20783x(C4711r[] c4711rArr, Map map) {
        c4711rArr.getClass();
        map.getClass();
        m20777r(map, c4711rArr);
        return map;
    }

    /* JADX INFO: renamed from: y */
    public static Map m20784y(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
