package p345x8;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: x8.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5728u {

    /* JADX INFO: renamed from: a */
    public final String f23333a;

    /* JADX INFO: renamed from: b */
    public final String f23334b;

    /* JADX INFO: renamed from: c */
    public final String f23335c;

    /* JADX INFO: renamed from: d */
    public final String f23336d;

    /* JADX INFO: renamed from: e */
    public final String f23337e;

    /* JADX INFO: renamed from: f */
    public final String f23338f;

    /* JADX INFO: renamed from: g */
    public final int f23339g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5728u(String str, String str2, String str3, String str4, String str5, String str6, int i9) {
        AbstractC2091b.m5170q(str, str2, str3, str4, str5);
        str6.getClass();
        this.f23333a = str;
        this.f23334b = str2;
        this.f23335c = str3;
        this.f23336d = str4;
        this.f23337e = str5;
        this.f23338f = str6;
        this.f23339g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C5728u m10398a(C5728u c5728u, String str, String str2, String str3, String str4, int i9, int i10) {
        String str5 = c5728u.f23334b;
        if ((i10 & 4) != 0) {
            str2 = c5728u.f23335c;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = c5728u.f23336d;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = c5728u.f23337e;
        }
        String str8 = str4;
        String str9 = c5728u.f23338f;
        if ((i10 & 64) != 0) {
            i9 = c5728u.f23339g;
        }
        AbstractC2091b.m5170q(str, str5, str6, str7, str8);
        str9.getClass();
        return new C5728u(str, str5, str6, str7, str8, str9, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C5728u m10399b() {
        String string = AbstractC3149m.m6703R0(this.f23333a).toString();
        if (AbstractC3149m.m6721t0(string)) {
            string = "默认配置";
        }
        String str = string;
        String string2 = AbstractC3149m.m6703R0(this.f23335c).toString();
        if (AbstractC3149m.m6721t0(string2)) {
            string2 = "https://api.siliconflow.cn/v1";
        }
        String str2 = string2;
        String string3 = AbstractC3149m.m6703R0(this.f23336d).toString();
        if (AbstractC3149m.m6721t0(string3)) {
            string3 = "/chat/completions";
        }
        String str3 = string3;
        String string4 = AbstractC3149m.m6703R0(this.f23337e).toString();
        if (AbstractC3149m.m6721t0(string4)) {
            string4 = "deepseek-ai/DeepSeek-V3";
        }
        return m10398a(this, str, str2, str3, string4, AbstractC3754e0.m7909r(this.f23339g, 0, 50), 34);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5728u)) {
            return false;
        }
        C5728u c5728u = (C5728u) obj;
        return AbstractC1416l.m3825a(this.f23333a, c5728u.f23333a) && AbstractC1416l.m3825a(this.f23334b, c5728u.f23334b) && AbstractC1416l.m3825a(this.f23335c, c5728u.f23335c) && AbstractC1416l.m3825a(this.f23336d, c5728u.f23336d) && AbstractC1416l.m3825a(this.f23337e, c5728u.f23337e) && AbstractC1416l.m3825a(this.f23338f, c5728u.f23338f) && this.f23339g == c5728u.f23339g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f23339g) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f23333a.hashCode() * 31, 31, this.f23334b), 31, this.f23335c), 31, this.f23336d), 31, this.f23337e), 31, this.f23338f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("AutoReplyZhiliaConfig(name=", this.f23333a, ", apiKey=", this.f23334b, ", apiBaseUrl=");
        AbstractC2091b.m5173t(sbM1027p, this.f23335c, ", apiPath=", this.f23336d, ", model=");
        AbstractC2091b.m5173t(sbM1027p, this.f23337e, ", systemPrompt=", this.f23338f, ", contextLimit=");
        return AbstractC2091b.m5163j(sbM1027p, this.f23339g, ")");
    }
}
