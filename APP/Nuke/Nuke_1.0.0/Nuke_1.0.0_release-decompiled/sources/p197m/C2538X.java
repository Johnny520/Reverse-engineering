package p197m;

import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p203n.C2650d0;

/* JADX INFO: renamed from: m.X */
/* JADX INFO: loaded from: classes.dex */
public final class C2538X {

    /* JADX INFO: renamed from: a */
    public final AbstractC1666k f8104a;

    /* JADX INFO: renamed from: b */
    public final C2650d0 f8105b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2538X(InterfaceC1601c interfaceC1601c, C2650d0 c2650d0) {
        this.f8104a = (AbstractC1666k) interfaceC1601c;
        this.f8105b = c2650d0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2538X)) {
            return false;
        }
        C2538X c2538x = (C2538X) obj;
        return this.f8104a.equals(c2538x.f8104a) && this.f8105b.equals(c2538x.f8105b);
    }

    public final int hashCode() {
        return this.f8105b.hashCode() + (this.f8104a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f8104a + ", animationSpec=" + this.f8105b + ')';
    }
}
