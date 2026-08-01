package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.lifecycle.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0675n0 {

    /* JADX INFO: renamed from: a */
    public final Map f1990a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m2655a() {
        Iterator it = this.f1990a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0671l0) it.next()).m2639b();
        }
        this.f1990a.clear();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0671l0 m2656b(String str) {
        str.getClass();
        return (AbstractC0671l0) this.f1990a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final Set m2657c() {
        return new HashSet(this.f1990a.keySet());
    }

    /* JADX INFO: renamed from: d */
    public final void m2658d(String str, AbstractC0671l0 abstractC0671l0) {
        str.getClass();
        abstractC0671l0.getClass();
        AbstractC0671l0 abstractC0671l02 = (AbstractC0671l0) this.f1990a.put(str, abstractC0671l0);
        if (abstractC0671l02 != null) {
            abstractC0671l02.m2639b();
        }
    }
}
