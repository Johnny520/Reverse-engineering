package p135b;

import com.bumptech.glide.AbstractC1926h;
import p002A1.InterfaceC0145r;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1834v extends AbstractC1926h {

    /* JADX INFO: renamed from: b */
    public final C1810B f6231b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0145r f6232c;

    public C1834v(C1810B c1810b, InterfaceC0145r interfaceC0145r) {
        AbstractC1665j.m2985e(c1810b, "callback");
        this.f6231b = c1810b;
        this.f6232c = interfaceC0145r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834v)) {
            return false;
        }
        C1834v c1834v = (C1834v) obj;
        return AbstractC1665j.m2981a(this.f6231b, c1834v.f6231b) && AbstractC1665j.m2981a(this.f6232c, c1834v.f6232c);
    }

    public final int hashCode() {
        int iHashCode = this.f6231b.hashCode() * 31;
        InterfaceC0145r interfaceC0145r = this.f6232c;
        return iHashCode + (interfaceC0145r == null ? 0 : interfaceC0145r.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f6231b + ", owner=" + this.f6232c + ')';
    }
}
