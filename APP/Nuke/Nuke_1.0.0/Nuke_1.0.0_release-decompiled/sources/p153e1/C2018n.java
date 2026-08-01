package p153e1;

import p011B4.AbstractC0231b;
import p159f1.InterfaceC2095a;

/* JADX INFO: renamed from: e1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2018n implements InterfaceC2095a {

    /* JADX INFO: renamed from: a */
    public final float f6745a;

    public C2018n(float f2) {
        this.f6745a = f2;
    }

    @Override // p159f1.InterfaceC2095a
    /* JADX INFO: renamed from: a */
    public final float mo3706a(float f2) {
        return f2 / this.f6745a;
    }

    @Override // p159f1.InterfaceC2095a
    /* JADX INFO: renamed from: b */
    public final float mo3707b(float f2) {
        return f2 * this.f6745a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2018n) && Float.compare(this.f6745a, ((C2018n) obj).f6745a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6745a);
    }

    public final String toString() {
        return AbstractC0231b.m401l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f6745a, ')');
    }
}
