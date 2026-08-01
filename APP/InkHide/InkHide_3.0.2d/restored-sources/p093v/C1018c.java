package p093v;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: v.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1018c {

    /* JADX INFO: renamed from: a */
    public final String f3614a;

    /* JADX INFO: renamed from: b */
    public final String f3615b;

    /* JADX INFO: renamed from: c */
    public final String f3616c;

    /* JADX INFO: renamed from: d */
    public final List f3617d;

    /* JADX INFO: renamed from: e */
    public final String f3618e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1018c(String str, String str2, String str3, List list) {
        str.getClass();
        this.f3614a = str;
        str2.getClass();
        this.f3615b = str2;
        this.f3616c = str3;
        list.getClass();
        this.f3617d = list;
        this.f3618e = str + "-" + str2 + "-" + str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3614a + ", mProviderPackage: " + this.f3615b + ", mQuery: " + this.f3616c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.f3617d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
