package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ei0 implements Map.Entry, q41 {

    /* JADX INFO: renamed from: h */
    public final Object f2450h;

    /* JADX INFO: renamed from: i */
    public final ka1 f2451i;

    /* JADX INFO: renamed from: j */
    public ei0 f2452j;

    /* JADX INFO: renamed from: k */
    public ei0 f2453k;

    /* JADX INFO: renamed from: l */
    public boolean f2454l;

    public ei0(ha1 ha1Var, ka1 ka1Var) {
        this.f2450h = ha1Var;
        this.f2451i = ka1Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ei0) {
            ei0 ei0Var = (ei0) obj;
            return t11.m5086l(this.f2450h, ei0Var.f2450h) && this.f2451i == ei0Var.f2451i;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2450h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2451i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2450h;
        return this.f2451i.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.f2450h + ", value=" + this.f2451i + ")";
    }
}
