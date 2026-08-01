package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3329z extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10367c;

    public C3329z(float f2) {
        super(3);
        this.f10367c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3329z) && Float.compare(this.f10367c, ((C3329z) obj).f10367c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10367c);
    }

    public final String toString() {
        return AbstractC0231b.m401l(new StringBuilder("RelativeVerticalTo(dy="), this.f10367c, ')');
    }
}
