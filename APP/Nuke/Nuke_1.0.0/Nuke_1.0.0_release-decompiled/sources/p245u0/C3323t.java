package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3323t extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10352c;

    public C3323t(float f2) {
        super(3);
        this.f10352c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3323t) && Float.compare(this.f10352c, ((C3323t) obj).f10352c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10352c);
    }

    public final String toString() {
        return AbstractC0231b.m401l(new StringBuilder("RelativeHorizontalTo(dx="), this.f10352c, ')');
    }
}
