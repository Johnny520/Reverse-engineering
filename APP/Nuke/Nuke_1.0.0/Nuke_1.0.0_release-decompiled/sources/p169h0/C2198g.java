package p169h0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: h0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2198g {

    /* JADX INFO: renamed from: a */
    public final float f7177a;

    public C2198g(float f2) {
        this.f7177a = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2198g) && Float.compare(this.f7177a, ((C2198g) obj).f7177a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7177a);
    }

    public final String toString() {
        return AbstractC0231b.m401l(new StringBuilder("Vertical(bias="), this.f7177a, ')');
    }
}
