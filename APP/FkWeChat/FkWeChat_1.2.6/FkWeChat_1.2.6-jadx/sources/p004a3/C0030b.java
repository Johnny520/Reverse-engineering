package p004a3;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: a3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0030b implements InterfaceC0061y {

    /* JADX INFO: renamed from: b */
    public final int f59b;

    public C0030b(int i10) {
        this.f59b = i10;
    }

    @Override // p004a3.InterfaceC0061y
    /* JADX INFO: renamed from: b */
    public C0054r mo131b(C0054r c0054r) {
        int i10 = this.f59b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? c0054r : new C0054r(AbstractC2368o.m8586m(c0054r.m202m() + this.f59b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0030b) && this.f59b == ((C0030b) obj).f59b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f59b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f59b + ')';
    }
}
