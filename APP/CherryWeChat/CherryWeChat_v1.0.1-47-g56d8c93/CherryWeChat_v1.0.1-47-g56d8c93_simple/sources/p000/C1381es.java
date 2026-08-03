package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: es */
/* JADX INFO: loaded from: classes.dex */
public final class C1381es {

    /* JADX INFO: renamed from: b */
    public static final C1381es f4925b = null;

    /* JADX INFO: renamed from: a */
    public final Map f4926a;

    static {
        f4925b = new C1381es(Collections.unmodifiableMap(new HashMap()));
    }

    public C1381es(Map r1) {
        this.f4926a = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1381es) == true) goto L7;
        return false;
    L7:
        return this.f4926a.equals(((C1381es) r2).f4926a);
    }

    public final int hashCode() {
        return this.f4926a.hashCode();
    }

    public final String toString() {
        return this.f4926a.toString();
    }
}
