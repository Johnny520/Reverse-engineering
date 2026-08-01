package p292u3;

import android.util.Base64;
import java.util.List;
import p320w3.AbstractC9170c;

/* JADX INFO: renamed from: u3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8500c {

    /* JADX INFO: renamed from: a */
    public final String f28384a;

    /* JADX INFO: renamed from: b */
    public final String f28385b;

    /* JADX INFO: renamed from: c */
    public final String f28386c;

    /* JADX INFO: renamed from: d */
    public final List f28387d;

    /* JADX INFO: renamed from: e */
    public final int f28388e = 0;

    /* JADX INFO: renamed from: f */
    public final String f28389f;

    public C8500c(String str, String str2, String str3, List list) {
        this.f28384a = (String) AbstractC9170c.m35614c(str);
        this.f28385b = (String) AbstractC9170c.m35614c(str2);
        this.f28386c = (String) AbstractC9170c.m35614c(str3);
        this.f28387d = (List) AbstractC9170c.m35614c(list);
        this.f28389f = m32732a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final String m32732a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: b */
    public List m32733b() {
        return this.f28387d;
    }

    /* JADX INFO: renamed from: c */
    public int m32734c() {
        return this.f28388e;
    }

    /* JADX INFO: renamed from: d */
    public String m32735d() {
        return this.f28384a;
    }

    /* JADX INFO: renamed from: e */
    public String m32736e() {
        return this.f28385b;
    }

    /* JADX INFO: renamed from: f */
    public String m32737f() {
        return this.f28386c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f28384a + ", mProviderPackage: " + this.f28385b + ", mQuery: " + this.f28386c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f28387d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f28387d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f28388e);
        return sb2.toString();
    }
}
