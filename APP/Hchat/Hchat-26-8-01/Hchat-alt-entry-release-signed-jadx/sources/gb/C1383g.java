package gb;

import android.util.Base64;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p218og.AbstractC3137a;

/* JADX INFO: renamed from: gb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1383g {

    /* JADX INFO: renamed from: a */
    public final String f4590a;

    /* JADX INFO: renamed from: b */
    public final String f4591b;

    /* JADX INFO: renamed from: c */
    public final String f4592c;

    /* JADX INFO: renamed from: d */
    public final long f4593d;

    /* JADX INFO: renamed from: e */
    public final String f4594e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1383g(String str, String str2, String str3, String str4, long j3) {
        this.f4590a = str;
        this.f4591b = str2;
        this.f4592c = str3;
        this.f4593d = j3;
        this.f4594e = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final byte[] m3763a() {
        String str = this.f4594e;
        boolean zEquals = str.equals("utf8");
        String str2 = this.f4591b;
        if (zEquals) {
            byte[] bytes = str2.getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            return bytes;
        }
        if (!str.equals("base64")) {
            throw new IllegalStateException("不支持的插件文件编码: ".concat(str).toString());
        }
        byte[] bArrDecode = Base64.decode(str2, 2);
        bArrDecode.getClass();
        return bArrDecode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383g)) {
            return false;
        }
        C1383g c1383g = (C1383g) obj;
        return this.f4590a.equals(c1383g.f4590a) && this.f4591b.equals(c1383g.f4591b) && this.f4592c.equals(c1383g.f4592c) && this.f4593d == c1383g.f4593d && this.f4594e.equals(c1383g.f4594e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4594e.hashCode() + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f4590a.hashCode() * 31, 31, this.f4591b), 31, this.f4592c), 31, this.f4593d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("PluginMarketFile(name=", this.f4590a, ", content=", this.f4591b, ", sha256=");
        sbM1027p.append(this.f4592c);
        sbM1027p.append(", size=");
        sbM1027p.append(this.f4593d);
        sbM1027p.append(", encoding=");
        sbM1027p.append(this.f4594e);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
