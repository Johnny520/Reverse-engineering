package p061i;

import java.util.Map;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0950c implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f3369a;

    /* JADX INFO: renamed from: b */
    public final Object f3370b;

    /* JADX INFO: renamed from: c */
    public C0950c f3371c;

    /* JADX INFO: renamed from: d */
    public C0950c f3372d;

    public C0950c(Object obj, Object obj2) {
        this.f3369a = obj;
        this.f3370b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0950c)) {
            return false;
        }
        C0950c c0950c = (C0950c) obj;
        return this.f3369a.equals(c0950c.f3369a) && this.f3370b.equals(c0950c.f3370b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3369a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3370b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3369a.hashCode() ^ this.f3370b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3369a + "=" + this.f3370b;
    }
}
