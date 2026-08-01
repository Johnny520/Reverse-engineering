package p241q7;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: q7.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6287f extends AbstractC6299l {

    /* JADX INFO: renamed from: a */
    public final String f19704a;

    /* JADX INFO: renamed from: b */
    public final String f19705b;

    /* JADX INFO: renamed from: c */
    public final String f19706c;

    public C6287f(String str, String str2, String str3) {
        str.getClass();
        this.f19704a = str;
        this.f19705b = str2;
        this.f19706c = str3;
    }

    @Override // p241q7.AbstractC6299l
    /* JADX INFO: renamed from: a */
    public Object mo24864a(C6294i0 c6294i0, int i10, InterfaceC5976f interfaceC5976f) {
        return AbstractC6303n.m24938a(c6294i0.m24897e(), i10, this.f19704a, this.f19705b, this.f19706c, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6287f)) {
            return false;
        }
        C6287f c6287f = (C6287f) obj;
        return AbstractC1061t.m3842c(this.f19704a, c6287f.f19704a) && AbstractC1061t.m3842c(this.f19705b, c6287f.f19705b) && AbstractC1061t.m3842c(this.f19706c, c6287f.f19706c);
    }

    public int hashCode() {
        int iHashCode = this.f19704a.hashCode() * 31;
        String str = this.f19705b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19706c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f19705b;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        sb2.append('{');
        sb2.append(this.f19704a);
        sb2.append('}');
        String str3 = this.f19706c;
        if (str3 != null) {
            str2 = str3;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
