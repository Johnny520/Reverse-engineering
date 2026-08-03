package p000;

import java.util.Map;

/* JADX INFO: renamed from: Uw */
/* JADX INFO: loaded from: classes.dex */
public final class C0898Uw implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f2791a;

    /* JADX INFO: renamed from: b */
    public final Object f2792b;

    /* JADX INFO: renamed from: c */
    public C0898Uw f2793c;

    /* JADX INFO: renamed from: d */
    public C0898Uw f2794d;

    public C0898Uw(Object obj, Object obj2) {
        this.f2791a = obj;
        this.f2792b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0898Uw)) {
            return false;
        }
        C0898Uw c0898Uw = (C0898Uw) obj;
        return this.f2791a.equals(c0898Uw.f2791a) && this.f2792b.equals(c0898Uw.f2792b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2791a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2792b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2791a.hashCode() ^ this.f2792b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2791a + "=" + this.f2792b;
    }
}
