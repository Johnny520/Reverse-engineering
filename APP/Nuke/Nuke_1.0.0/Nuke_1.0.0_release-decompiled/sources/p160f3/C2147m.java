package p160f3;

import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: f3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2147m {

    /* JADX INFO: renamed from: a */
    public final Object f7085a;

    /* JADX INFO: renamed from: b */
    public final C2131e f7086b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1604f f7087c;

    /* JADX INFO: renamed from: d */
    public final Object f7088d;

    /* JADX INFO: renamed from: e */
    public final Throwable f7089e;

    public C2147m(Object obj, C2131e c2131e, InterfaceC1604f interfaceC1604f, Object obj2, Throwable th) {
        this.f7085a = obj;
        this.f7086b = c2131e;
        this.f7087c = interfaceC1604f;
        this.f7088d = obj2;
        this.f7089e = th;
    }

    /* JADX INFO: renamed from: a */
    public static C2147m m3974a(C2147m c2147m, C2131e c2131e, Throwable th, int i5) {
        Object obj = c2147m.f7085a;
        if ((i5 & 2) != 0) {
            c2131e = c2147m.f7086b;
        }
        C2131e c2131e2 = c2131e;
        InterfaceC1604f interfaceC1604f = c2147m.f7087c;
        Object obj2 = c2147m.f7088d;
        if ((i5 & 16) != 0) {
            th = c2147m.f7089e;
        }
        return new C2147m(obj, c2131e2, interfaceC1604f, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2147m)) {
            return false;
        }
        C2147m c2147m = (C2147m) obj;
        return AbstractC1665j.m2981a(this.f7085a, c2147m.f7085a) && AbstractC1665j.m2981a(this.f7086b, c2147m.f7086b) && AbstractC1665j.m2981a(this.f7087c, c2147m.f7087c) && AbstractC1665j.m2981a(this.f7088d, c2147m.f7088d) && AbstractC1665j.m2981a(this.f7089e, c2147m.f7089e);
    }

    public final int hashCode() {
        Object obj = this.f7085a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C2131e c2131e = this.f7086b;
        int iHashCode2 = (iHashCode + (c2131e == null ? 0 : c2131e.hashCode())) * 31;
        InterfaceC1604f interfaceC1604f = this.f7087c;
        int iHashCode3 = (iHashCode2 + (interfaceC1604f == null ? 0 : interfaceC1604f.hashCode())) * 31;
        Object obj2 = this.f7088d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f7089e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f7085a + ", cancelHandler=" + this.f7086b + ", onCancellation=" + this.f7087c + ", idempotentResume=" + this.f7088d + ", cancelCause=" + this.f7089e + ')';
    }

    public /* synthetic */ C2147m(Object obj, C2131e c2131e, InterfaceC1604f interfaceC1604f, Throwable th, int i5) {
        this(obj, (i5 & 2) != 0 ? null : c2131e, (i5 & 4) != 0 ? null : interfaceC1604f, (Object) null, (i5 & 16) != 0 ? null : th);
    }
}
