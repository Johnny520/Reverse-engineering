package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 extends AbstractC0409l2 {

    /* JADX INFO: renamed from: a */
    public final gb1 f3943a;

    public hb1() {
        nv2 nv2Var = nv2.f7346a;
        o31 o31Var = o31.f7461a;
        this.f3943a = new gb1(nv2.f7347b, o31.f7462b);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        mo572i(obj);
        gb1 gb1Var = this.f3943a;
        gb1Var.getClass();
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(gb1Var);
        Iterator itMo773h = mo773h(obj);
        int i = 0;
        while (itMo773h.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo773h.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            dv2 dv2Var = (dv2) interfaceC0863wxMo1177b;
            dv2Var.m1198w(gb1Var, i, nv2.f7346a, key);
            i += 2;
            dv2Var.m1198w(gb1Var, i2, o31.f7461a, value);
        }
        interfaceC0863wxMo1177b.mo1176a(gb1Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return this.f3943a;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: f */
    public final Object mo771f() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: g */
    public final int mo772g(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: h */
    public final Iterator mo773h(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public final void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        Map map = (Map) obj;
        o31 o31Var = o31.f7461a;
        map.getClass();
        nv2 nv2Var = nv2.f7346a;
        gb1 gb1Var = this.f3943a;
        Object objMo907t = interfaceC0826vx.mo907t(gb1Var, i, nv2Var, null);
        int iMo901j = interfaceC0826vx.mo901j(gb1Var);
        if (iMo901j == i + 1) {
            map.put(objMo907t, (!map.containsKey(objMo907t) || (o31.f7462b.f322b instanceof f32)) ? interfaceC0826vx.mo907t(gb1Var, iMo901j, o31Var, null) : interfaceC0826vx.mo907t(gb1Var, iMo901j, o31Var, we1.m5875p0(objMo907t, map)));
        } else {
            C0676s.m4645c(vi0.m5689h("Value must follow key in a map, index for key: ", i, ", returned index for value: ", iMo901j));
        }
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: m */
    public final Object mo774m(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
