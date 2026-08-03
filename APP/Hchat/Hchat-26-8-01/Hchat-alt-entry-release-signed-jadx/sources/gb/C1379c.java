package gb;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: gb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1379c {

    /* JADX INFO: renamed from: a */
    public final String f4578a;

    /* JADX INFO: renamed from: b */
    public final String f4579b;

    /* JADX INFO: renamed from: c */
    public final String f4580c;

    /* JADX INFO: renamed from: d */
    public final String f4581d;

    /* JADX INFO: renamed from: e */
    public final String f4582e;

    /* JADX INFO: renamed from: f */
    public final boolean f4583f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1379c(String str, String str2, String str3, String str4, String str5, boolean z9) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f4578a = str;
        this.f4579b = str2;
        this.f4580c = str3;
        this.f4581d = str4;
        this.f4582e = str5;
        this.f4583f = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1379c)) {
            return false;
        }
        C1379c c1379c = (C1379c) obj;
        return AbstractC1416l.m3825a(this.f4578a, c1379c.f4578a) && AbstractC1416l.m3825a(this.f4579b, c1379c.f4579b) && AbstractC1416l.m3825a(this.f4580c, c1379c.f4580c) && this.f4581d.equals(c1379c.f4581d) && this.f4582e.equals(c1379c.f4582e) && this.f4583f == c1379c.f4583f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f4583f) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f4578a.hashCode() * 31, 31, this.f4579b), 31, this.f4580c), 31, this.f4581d), 31, this.f4582e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PluginMarketComment(commentId=", this.f4578a, ", remotePluginId=", this.f4579b, ", userNickname=");
        AbstractC2091b.m5173t(sbM1027p, this.f4580c, ", content=", this.f4581d, ", createdAt=");
        sbM1027p.append(this.f4582e);
        sbM1027p.append(", canDelete=");
        sbM1027p.append(this.f4583f);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
