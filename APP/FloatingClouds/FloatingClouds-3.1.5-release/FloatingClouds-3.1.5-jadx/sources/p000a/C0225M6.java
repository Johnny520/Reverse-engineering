package p000a;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: a.M6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0225M6 {

    /* JADX INFO: renamed from: a */
    public final String f760a;

    /* JADX INFO: renamed from: b */
    public final String f761b;

    /* JADX INFO: renamed from: c */
    public final String f762c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f763d;

    /* JADX INFO: renamed from: e */
    public final String f764e;

    public C0225M6(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f760a = str;
        str2.getClass();
        this.f761b = str2;
        this.f762c = str3;
        list.getClass();
        this.f763d = list;
        this.f764e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f760a + ", mProviderPackage: " + this.f761b + ", mQuery: " + this.f762c + ", mCertificates:");
        int i = 0;
        while (true) {
            List<List<byte[]>> list = this.f763d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
