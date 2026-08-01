package p153e1;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: e1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2008d implements InterfaceC2007c {

    /* JADX INFO: renamed from: d */
    public final float f6727d;

    /* JADX INFO: renamed from: e */
    public final float f6728e;

    public C2008d(float f2, float f5) {
        this.f6727d = f2;
        this.f6728e = f5;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f6727d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2008d)) {
            return false;
        }
        C2008d c2008d = (C2008d) obj;
        return Float.compare(this.f6727d, c2008d.f6727d) == 0 && Float.compare(this.f6728e, c2008d.f6728e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6728e) + (Float.hashCode(this.f6727d) * 31);
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f6728e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f6727d);
        sb.append(", fontScale=");
        return AbstractC0231b.m401l(sb, this.f6728e, ')');
    }
}
