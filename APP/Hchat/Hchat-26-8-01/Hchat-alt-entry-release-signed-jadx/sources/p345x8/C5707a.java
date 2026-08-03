package p345x8;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: x8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5707a {

    /* JADX INFO: renamed from: a */
    public final String f23189a;

    /* JADX INFO: renamed from: b */
    public final String f23190b;

    /* JADX INFO: renamed from: c */
    public final String f23191c;

    /* JADX INFO: renamed from: d */
    public final String f23192d;

    /* JADX INFO: renamed from: e */
    public final String f23193e;

    /* JADX INFO: renamed from: f */
    public final int f23194f;

    /* JADX INFO: renamed from: g */
    public final boolean f23195g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5707a(String str, String str2, String str3, String str4, String str5, int i9, boolean z9) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        this.f23189a = str;
        this.f23190b = str2;
        this.f23191c = str3;
        this.f23192d = str4;
        this.f23193e = str5;
        this.f23194f = i9;
        this.f23195g = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C5707a m10313a(C5707a c5707a, boolean z9) {
        String str = c5707a.f23189a;
        String str2 = c5707a.f23190b;
        String str3 = c5707a.f23191c;
        String str4 = c5707a.f23192d;
        String str5 = c5707a.f23193e;
        int i9 = c5707a.f23194f;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new C5707a(str, str2, str3, str4, str5, i9, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5707a)) {
            return false;
        }
        C5707a c5707a = (C5707a) obj;
        return AbstractC1416l.m3825a(this.f23189a, c5707a.f23189a) && AbstractC1416l.m3825a(this.f23190b, c5707a.f23190b) && AbstractC1416l.m3825a(this.f23191c, c5707a.f23191c) && AbstractC1416l.m3825a(this.f23192d, c5707a.f23192d) && AbstractC1416l.m3825a(this.f23193e, c5707a.f23193e) && this.f23194f == c5707a.f23194f && this.f23195g == c5707a.f23195g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f23195g) + AbstractC0921a.m2242e(this.f23194f, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f23189a.hashCode() * 31, 31, this.f23190b), 31, this.f23191c), 31, this.f23192d), 31, this.f23193e), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("AutoReplyAiConfig(apiKey=", this.f23189a, ", apiBaseUrl=", this.f23190b, ", apiPath=");
        AbstractC2091b.m5173t(sbM1027p, this.f23191c, ", model=", this.f23192d, ", systemPrompt=");
        sbM1027p.append(this.f23193e);
        sbM1027p.append(", contextLimit=");
        sbM1027p.append(this.f23194f);
        sbM1027p.append(", stream=");
        return AbstractC3199a.m6840m(")", sbM1027p, this.f23195g);
    }
}
