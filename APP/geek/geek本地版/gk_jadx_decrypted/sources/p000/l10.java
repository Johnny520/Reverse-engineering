package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l10 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f2988a;

    /* JADX INFO: renamed from: b */
    public final Object f2989b;

    /* JADX INFO: renamed from: c */
    public l10 f2990c;

    /* JADX INFO: renamed from: d */
    public l10 f2991d;

    public l10(Object obj, Object obj2) {
        this.f2988a = obj;
        this.f2989b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l10)) {
            return false;
        }
        l10 l10Var = (l10) obj;
        return this.f2988a.equals(l10Var.f2988a) && this.f2989b.equals(l10Var.f2989b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2988a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2989b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2988a.hashCode() ^ this.f2989b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2988a + "=" + this.f2989b;
    }
}
