package p311v7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5109u0;
import p193n3.AbstractC5489b;

/* JADX INFO: renamed from: v7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8853b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29406a = AtomicReferenceFieldUpdater.newUpdater(C8853b.class, Object.class, "current");
    private volatile /* synthetic */ Object current = AbstractC5109u0.m20768i();

    /* JADX INFO: renamed from: a */
    public final Object m33997a(Object obj, InterfaceC0184l interfaceC0184l) {
        Map map;
        HashMap map2;
        Object objMo27m;
        obj.getClass();
        interfaceC0184l.getClass();
        do {
            map = (Map) this.current;
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            map2 = new HashMap(map);
            objMo27m = interfaceC0184l.mo27m(obj);
            map2.put(obj, objMo27m);
        } while (!AbstractC5489b.m22334a(f29406a, this, map, map2));
        return objMo27m;
    }

    /* JADX INFO: renamed from: b */
    public final Object m33998b(Object obj) {
        obj.getClass();
        return ((Map) this.current).get(obj);
    }
}
