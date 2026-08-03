package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: Nh */
/* JADX INFO: loaded from: classes.dex */
public final class C0583Nh {

    /* JADX INFO: renamed from: a */
    public final String f1883a;

    /* JADX INFO: renamed from: b */
    public final String f1884b;

    /* JADX INFO: renamed from: c */
    public final String f1885c;

    /* JADX INFO: renamed from: d */
    public final List f1886d;

    /* JADX INFO: renamed from: e */
    public final String f1887e;

    /* JADX INFO: renamed from: f */
    public final String f1888f;

    /* JADX INFO: renamed from: g */
    public final String f1889g;

    public C0583Nh(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f1883a = str;
        str2.getClass();
        this.f1884b = str2;
        this.f1885c = str3;
        list.getClass();
        this.f1886d = list;
        this.f1887e = str4;
        this.f1888f = str5;
        this.f1889g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1883a + ", mProviderPackage: " + this.f1884b + ", mQuery: " + this.f1885c + ", mSystemFont: " + this.f1887e + ", mVariationSettings: " + this.f1888f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f1886d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
