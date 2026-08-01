package sd;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: sd.i9 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7460i9 {

    /* JADX INFO: renamed from: a */
    public final String f24740a;

    /* JADX INFO: renamed from: b */
    public final String f24741b;

    /* JADX INFO: renamed from: c */
    public final boolean f24742c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0173a f24743d;

    public C7460i9(String str, String str2, boolean z10, InterfaceC0173a interfaceC0173a) {
        str.getClass();
        str2.getClass();
        interfaceC0173a.getClass();
        this.f24740a = str;
        this.f24741b = str2;
        this.f24742c = z10;
        this.f24743d = interfaceC0173a;
    }

    /* JADX INFO: renamed from: a */
    public final String m29149a() {
        return this.f24741b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a m29150b() {
        return this.f24743d;
    }

    /* JADX INFO: renamed from: c */
    public final String m29151c() {
        return this.f24740a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m29152d() {
        return this.f24742c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7460i9)) {
            return false;
        }
        C7460i9 c7460i9 = (C7460i9) obj;
        return AbstractC1061t.m3842c(this.f24740a, c7460i9.f24740a) && AbstractC1061t.m3842c(this.f24741b, c7460i9.f24741b) && this.f24742c == c7460i9.f24742c && AbstractC1061t.m3842c(this.f24743d, c7460i9.f24743d);
    }

    public int hashCode() {
        return (((((this.f24740a.hashCode() * 31) + this.f24741b.hashCode()) * 31) + Boolean.hashCode(this.f24742c)) * 31) + this.f24743d.hashCode();
    }

    public String toString() {
        return "ConfirmReq(title=" + this.f24740a + ", message=" + this.f24741b + ", isDanger=" + this.f24742c + ", onConfirm=" + this.f24743d + ")";
    }

    public /* synthetic */ C7460i9(String str, String str2, boolean z10, InterfaceC0173a interfaceC0173a, int i10, AbstractC1043k abstractC1043k) {
        this(str, str2, (i10 & 4) != 0 ? true : z10, interfaceC0173a);
    }
}
