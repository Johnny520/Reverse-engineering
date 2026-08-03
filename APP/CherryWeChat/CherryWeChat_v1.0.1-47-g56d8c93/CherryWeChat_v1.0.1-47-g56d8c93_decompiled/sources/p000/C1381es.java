package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: es */
/* JADX INFO: loaded from: classes.dex */
public final class C1381es {

    /* JADX INFO: renamed from: b */
    public static final C1381es f4925b = new C1381es(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f4926a;

    public C1381es(Map map) {
        this.f4926a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1381es) {
            return this.f4926a.equals(((C1381es) obj).f4926a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4926a.hashCode();
    }

    public final String toString() {
        return this.f4926a.toString();
    }
}
