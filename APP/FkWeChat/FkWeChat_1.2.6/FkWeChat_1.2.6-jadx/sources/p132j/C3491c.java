package p132j;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3491c {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f9696a;

    public C3491c(int i10, float f10) {
        this.f9696a = new LinkedHashMap(i10, f10, true);
    }

    /* JADX INFO: renamed from: a */
    public final Object m13010a(Object obj) {
        obj.getClass();
        return this.f9696a.get(obj);
    }

    /* JADX INFO: renamed from: b */
    public final Set m13011b() {
        Set setEntrySet = this.f9696a.entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13012c() {
        return this.f9696a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final Object m13013d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.f9696a.put(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    public final Object m13014e(Object obj) {
        obj.getClass();
        return this.f9696a.remove(obj);
    }
}
