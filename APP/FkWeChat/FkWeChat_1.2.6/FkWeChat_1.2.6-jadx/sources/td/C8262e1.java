package td;

import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p350y1.C9516d;

/* JADX INFO: renamed from: td.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8262e1 {

    /* JADX INFO: renamed from: a */
    public final String f27618a;

    /* JADX INFO: renamed from: b */
    public final String f27619b;

    /* JADX INFO: renamed from: c */
    public final C9516d f27620c;

    /* JADX INFO: renamed from: d */
    public final String f27621d;

    /* JADX INFO: renamed from: e */
    public final boolean f27622e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0189q f27623f;

    public C8262e1(String str, String str2, C9516d c9516d, String str3, boolean z10, InterfaceC0189q interfaceC0189q) {
        str.getClass();
        str2.getClass();
        c9516d.getClass();
        str3.getClass();
        this.f27618a = str;
        this.f27619b = str2;
        this.f27620c = c9516d;
        this.f27621d = str3;
        this.f27622e = z10;
        this.f27623f = interfaceC0189q;
    }

    /* JADX INFO: renamed from: a */
    public final String m31938a() {
        return this.f27621d;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0189q m31939b() {
        return this.f27623f;
    }

    /* JADX INFO: renamed from: c */
    public final C9516d m31940c() {
        return this.f27620c;
    }

    /* JADX INFO: renamed from: d */
    public final String m31941d() {
        return this.f27619b;
    }

    /* JADX INFO: renamed from: e */
    public final String m31942e() {
        return this.f27618a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8262e1)) {
            return false;
        }
        C8262e1 c8262e1 = (C8262e1) obj;
        return AbstractC1061t.m3842c(this.f27618a, c8262e1.f27618a) && AbstractC1061t.m3842c(this.f27619b, c8262e1.f27619b) && AbstractC1061t.m3842c(this.f27620c, c8262e1.f27620c) && AbstractC1061t.m3842c(this.f27621d, c8262e1.f27621d) && this.f27622e == c8262e1.f27622e && AbstractC1061t.m3842c(this.f27623f, c8262e1.f27623f);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m31943f() {
        return this.f27622e;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f27618a.hashCode() * 31) + this.f27619b.hashCode()) * 31) + this.f27620c.hashCode()) * 31) + this.f27621d.hashCode()) * 31) + Boolean.hashCode(this.f27622e)) * 31;
        InterfaceC0189q interfaceC0189q = this.f27623f;
        return iHashCode + (interfaceC0189q == null ? 0 : interfaceC0189q.hashCode());
    }

    public String toString() {
        return "FeatureDef(title=" + this.f27618a + ", subtitle=" + this.f27619b + ", icon=" + this.f27620c + ", configKey=" + this.f27621d + ", isDisabled=" + this.f27622e + ", content=" + this.f27623f + ")";
    }

    public /* synthetic */ C8262e1(String str, String str2, C9516d c9516d, String str3, boolean z10, InterfaceC0189q interfaceC0189q, int i10, AbstractC1043k abstractC1043k) {
        this(str, str2, c9516d, str3, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : interfaceC0189q);
    }
}
