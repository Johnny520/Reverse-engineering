package p241q7;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: q7.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6285e extends AbstractC6299l {

    /* JADX INFO: renamed from: a */
    public final String f19694a;

    /* JADX INFO: renamed from: b */
    public final String f19695b;

    /* JADX INFO: renamed from: c */
    public final String f19696c;

    public C6285e(String str, String str2, String str3) {
        str.getClass();
        this.f19694a = str;
        this.f19695b = str2;
        this.f19696c = str3;
    }

    @Override // p241q7.AbstractC6299l
    /* JADX INFO: renamed from: a */
    public Object mo24864a(C6294i0 c6294i0, int i10, InterfaceC5976f interfaceC5976f) {
        return AbstractC6303n.m24938a(c6294i0.m24897e(), i10, this.f19694a, this.f19695b, this.f19696c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6285e)) {
            return false;
        }
        C6285e c6285e = (C6285e) obj;
        return AbstractC1061t.m3842c(this.f19694a, c6285e.f19694a) && AbstractC1061t.m3842c(this.f19695b, c6285e.f19695b) && AbstractC1061t.m3842c(this.f19696c, c6285e.f19696c);
    }

    public int hashCode() {
        int iHashCode = this.f19694a.hashCode() * 31;
        String str = this.f19695b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19696c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f19695b;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        sb2.append('{');
        sb2.append(this.f19694a);
        sb2.append("?}");
        String str3 = this.f19696c;
        if (str3 != null) {
            str2 = str3;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
