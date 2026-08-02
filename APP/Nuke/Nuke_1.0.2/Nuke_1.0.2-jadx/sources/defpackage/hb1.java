package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hb1 extends l2 {
    public final gb1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hb1() {
        nv2 nv2Var = nv2.a;
        o31 o31Var = o31.a;
        this.a = new gb1(nv2.b, o31.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final void d(ve0 ve0Var, Object obj) {
        i(obj);
        gb1 gb1Var = this.a;
        gb1Var.getClass();
        wx wxVarB = ve0Var.b(gb1Var);
        Iterator itH = h(obj);
        int i = 0;
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            dv2 dv2Var = (dv2) wxVarB;
            dv2Var.w(gb1Var, i, nv2.a, key);
            i += 2;
            dv2Var.w(gb1Var, i2, o31.a, value);
        }
        wxVarB.a(gb1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w41
    public final yo2 e() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object f() {
        return new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int g(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Iterator h(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        Map map = (Map) obj;
        o31 o31Var = o31.a;
        map.getClass();
        nv2 nv2Var = nv2.a;
        gb1 gb1Var = this.a;
        Object objT = vxVar.t(gb1Var, i, nv2Var, null);
        int iJ = vxVar.j(gb1Var);
        if (iJ == i + 1) {
            map.put(objT, (!map.containsKey(objT) || (o31.b.b instanceof f32)) ? vxVar.t(gb1Var, iJ, o31Var, null) : vxVar.t(gb1Var, iJ, o31Var, we1.p0(objT, map)));
        } else {
            s.c(vi0.h("Value must follow key in a map, index for key: ", i, ", returned index for value: ", iJ));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object m(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
