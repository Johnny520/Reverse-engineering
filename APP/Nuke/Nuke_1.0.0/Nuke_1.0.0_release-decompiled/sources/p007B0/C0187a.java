package p007B0;

import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: B0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0187a implements InterfaceC0206t {

    /* JADX INFO: renamed from: b */
    public final int f657b;

    public C0187a(int i5) {
        this.f657b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0187a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f657b == ((C0187a) obj).f657b;
    }

    public final int hashCode() {
        return this.f657b;
    }

    public final String toString() {
        return AbstractC3202a.m5466a(new StringBuilder("AndroidPointerIcon(type="), this.f657b, ')');
    }
}
