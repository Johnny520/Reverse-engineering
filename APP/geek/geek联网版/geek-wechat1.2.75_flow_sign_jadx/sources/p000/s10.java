package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s10 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f4187a;

    /* JADX INFO: renamed from: b */
    public final Object f4188b;

    /* JADX INFO: renamed from: c */
    public s10 f4189c;

    /* JADX INFO: renamed from: d */
    public s10 f4190d;

    public s10(Object obj, Object obj2) {
        this.f4187a = obj;
        this.f4188b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s10)) {
            return false;
        }
        s10 s10Var = (s10) obj;
        return this.f4187a.equals(s10Var.f4187a) && this.f4188b.equals(s10Var.f4188b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4187a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4188b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4187a.hashCode() ^ this.f4188b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4187a + "=" + this.f4188b;
    }
}
