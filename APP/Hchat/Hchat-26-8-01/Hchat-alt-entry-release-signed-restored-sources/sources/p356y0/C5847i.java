package p356y0;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;

/* JADX INFO: renamed from: y0.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5847i implements InterfaceC5853o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5853o f23783a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5853o f23784b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5847i(InterfaceC5853o interfaceC5853o, InterfaceC5853o interfaceC5853o2) {
        this.f23783a = interfaceC5853o;
        this.f23784b = interfaceC5853o2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.InterfaceC5853o
    /* JADX INFO: renamed from: a */
    public final boolean mo10547a(InterfaceC1231l interfaceC1231l) {
        return this.f23783a.mo10547a(interfaceC1231l) && this.f23784b.mo10547a(interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.InterfaceC5853o
    /* JADX INFO: renamed from: b */
    public final Object mo10548b(InterfaceC1235p interfaceC1235p, Object obj) {
        return this.f23784b.mo10548b(interfaceC1235p, this.f23783a.mo10548b(interfaceC1235p, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5847i)) {
            return false;
        }
        C5847i c5847i = (C5847i) obj;
        return this.f23783a.equals(c5847i.f23783a) && AbstractC1416l.m3825a(this.f23784b, c5847i.f23784b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f23784b.hashCode() * 31) + this.f23783a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0921a.m2254q(new StringBuilder("["), (String) mo10548b(C5846h.f23782g, HttpUrl.FRAGMENT_ENCODE_SET), ']');
    }
}
