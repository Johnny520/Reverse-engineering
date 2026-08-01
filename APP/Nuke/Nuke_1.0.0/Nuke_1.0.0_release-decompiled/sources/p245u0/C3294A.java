package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C3294A extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10180c;

    public C3294A(float f2) {
        super(3);
        this.f10180c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3294A) && Float.compare(this.f10180c, ((C3294A) obj).f10180c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10180c);
    }

    public final String toString() {
        return AbstractC0231b.m401l(new StringBuilder("VerticalTo(y="), this.f10180c, ')');
    }
}
