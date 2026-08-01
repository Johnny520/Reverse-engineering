package p245u0;

import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: u0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3315l extends AbstractC3295B {

    /* JADX INFO: renamed from: c */
    public final float f10324c;

    public C3315l(float f2) {
        super(3);
        this.f10324c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3315l) && Float.compare(this.f10324c, ((C3315l) obj).f10324c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10324c);
    }

    public final String toString() {
        return AbstractC0231b.m401l(new StringBuilder("HorizontalTo(x="), this.f10324c, ')');
    }
}
