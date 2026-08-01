package p244qb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: qb.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6370a {
    /* JADX INFO: renamed from: a */
    public static final void m25339a(Collection collection, Object obj) {
        collection.getClass();
        if (obj != null) {
            collection.add(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m25340b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static final List m25341c(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return AbstractC5114x.m20800o();
        }
        if (size == 1) {
            return AbstractC5112w.m20789e(AbstractC5081g0.m20576j0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static final Map m25342d(Iterable iterable) {
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: e */
    public static final HashMap m25343e(int i10) {
        return new HashMap(m25340b(i10));
    }

    /* JADX INFO: renamed from: f */
    public static final HashSet m25344f(int i10) {
        return new HashSet(m25340b(i10));
    }

    /* JADX INFO: renamed from: g */
    public static final LinkedHashSet m25345g(int i10) {
        return new LinkedHashSet(m25340b(i10));
    }
}
