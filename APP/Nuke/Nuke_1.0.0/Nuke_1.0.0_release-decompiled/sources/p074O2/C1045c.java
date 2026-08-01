package p074O2;

import java.io.Serializable;
import p011B4.AbstractC0231b;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: O2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1045c implements InterfaceC1051i, Serializable {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1051i f3283d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1049g f3284e;

    public C1045c(InterfaceC1049g interfaceC1049g, InterfaceC1051i interfaceC1051i) {
        AbstractC1665j.m2985e(interfaceC1051i, "left");
        AbstractC1665j.m2985e(interfaceC1049g, "element");
        this.f3283d = interfaceC1051i;
        this.f3284e = interfaceC1049g;
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: A */
    public final Object mo1165A(InterfaceC1603e interfaceC1603e, Object obj) {
        return interfaceC1603e.mo0g(this.f3283d.mo1165A(interfaceC1603e, obj), this.f3284e);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: C */
    public final InterfaceC1049g mo1166C(InterfaceC1050h interfaceC1050h) {
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        C1045c c1045c = this;
        while (true) {
            InterfaceC1049g interfaceC1049gMo1166C = c1045c.f3284e.mo1166C(interfaceC1050h);
            if (interfaceC1049gMo1166C != null) {
                return interfaceC1049gMo1166C;
            }
            InterfaceC1051i interfaceC1051i = c1045c.f3283d;
            if (!(interfaceC1051i instanceof C1045c)) {
                return interfaceC1051i.mo1166C(interfaceC1050h);
            }
            c1045c = (C1045c) interfaceC1051i;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM2981a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1045c) {
            C1045c c1045c = (C1045c) obj;
            int i5 = 2;
            C1045c c1045c2 = c1045c;
            int i6 = 2;
            while (true) {
                InterfaceC1051i interfaceC1051i = c1045c2.f3283d;
                c1045c2 = interfaceC1051i instanceof C1045c ? (C1045c) interfaceC1051i : null;
                if (c1045c2 == null) {
                    break;
                }
                i6++;
            }
            C1045c c1045c3 = this;
            while (true) {
                InterfaceC1051i interfaceC1051i2 = c1045c3.f3283d;
                c1045c3 = interfaceC1051i2 instanceof C1045c ? (C1045c) interfaceC1051i2 : null;
                if (c1045c3 == null) {
                    break;
                }
                i5++;
            }
            if (i6 == i5) {
                C1045c c1045c4 = this;
                while (true) {
                    InterfaceC1049g interfaceC1049g = c1045c4.f3284e;
                    if (!AbstractC1665j.m2981a(c1045c.mo1166C(interfaceC1049g.getKey()), interfaceC1049g)) {
                        zM2981a = false;
                        break;
                    }
                    InterfaceC1051i interfaceC1051i3 = c1045c4.f3283d;
                    if (!(interfaceC1051i3 instanceof C1045c)) {
                        AbstractC1665j.m2983c(interfaceC1051i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC1049g interfaceC1049g2 = (InterfaceC1049g) interfaceC1051i3;
                        zM2981a = AbstractC1665j.m2981a(c1045c.mo1166C(interfaceC1049g2.getKey()), interfaceC1049g2);
                        break;
                    }
                    c1045c4 = (C1045c) interfaceC1051i3;
                }
                if (zM2981a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3284e.hashCode() + this.f3283d.hashCode();
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: j */
    public final InterfaceC1051i mo1167j(InterfaceC1050h interfaceC1050h) {
        AbstractC1665j.m2985e(interfaceC1050h, "key");
        InterfaceC1049g interfaceC1049g = this.f3284e;
        InterfaceC1049g interfaceC1049gMo1166C = interfaceC1049g.mo1166C(interfaceC1050h);
        InterfaceC1051i interfaceC1051i = this.f3283d;
        if (interfaceC1049gMo1166C != null) {
            return interfaceC1051i;
        }
        InterfaceC1051i interfaceC1051iMo1167j = interfaceC1051i.mo1167j(interfaceC1050h);
        return interfaceC1051iMo1167j == interfaceC1051i ? this : interfaceC1051iMo1167j == C1052j.f3286d ? interfaceC1049g : new C1045c(interfaceC1049g, interfaceC1051iMo1167j);
    }

    @Override // p074O2.InterfaceC1051i
    /* JADX INFO: renamed from: m */
    public final InterfaceC1051i mo1168m(InterfaceC1051i interfaceC1051i) {
        AbstractC1665j.m2985e(interfaceC1051i, "context");
        return interfaceC1051i == C1052j.f3286d ? this : (InterfaceC1051i) interfaceC1051i.mo1165A(new C1044b(1), this);
    }

    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("["), (String) mo1165A(new C1044b(0), ""), ']');
    }
}
