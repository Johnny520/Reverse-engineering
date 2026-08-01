package p197m;

import p117X2.AbstractC1665j;
import p203n.InterfaceC2677v;

/* JADX INFO: renamed from: m.O */
/* JADX INFO: loaded from: classes.dex */
public final class C2530O {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2677v f8093a;

    public C2530O(InterfaceC2677v interfaceC2677v) {
        this.f8093a = interfaceC2677v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2530O) {
            return Float.compare(0.0f, 0.0f) == 0 && AbstractC1665j.m2981a(this.f8093a, ((C2530O) obj).f8093a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8093a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f8093a + ')';
    }
}
