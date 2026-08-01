package p100h;

import java.util.HashMap;
import java.util.Map;
import p100h.AbstractC2799b;

/* JADX INFO: renamed from: h.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2798a extends AbstractC2799b {

    /* JADX INFO: renamed from: u */
    public final HashMap f7307u = new HashMap();

    @Override // p100h.AbstractC2799b
    /* JADX INFO: renamed from: c */
    public AbstractC2799b.c mo9972c(Object obj) {
        return (AbstractC2799b.c) this.f7307u.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f7307u.containsKey(obj);
    }

    @Override // p100h.AbstractC2799b
    /* JADX INFO: renamed from: l */
    public Object mo9973l(Object obj) {
        Object objMo9973l = super.mo9973l(obj);
        this.f7307u.remove(obj);
        return objMo9973l;
    }

    /* JADX INFO: renamed from: o */
    public Map.Entry m9974o(Object obj) {
        if (contains(obj)) {
            return ((AbstractC2799b.c) this.f7307u.get(obj)).f7315t;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public Object m9975p(Object obj, Object obj2) {
        AbstractC2799b.c cVarMo9972c = mo9972c(obj);
        if (cVarMo9972c != null) {
            return cVarMo9972c.f7313r;
        }
        this.f7307u.put(obj, m9979h(obj, obj2));
        return null;
    }
}
