package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: rv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0703rv {

    /* JADX INFO: renamed from: a */
    public final String f5555a;

    /* JADX INFO: renamed from: b */
    public final String f5556b;

    /* JADX INFO: renamed from: c */
    public final String f5557c;

    /* JADX INFO: renamed from: d */
    public final List f5558d;

    /* JADX INFO: renamed from: e */
    public final String f5559e;

    /* JADX INFO: renamed from: f */
    public final String f5560f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0703rv(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f5555a = str;
        str2.getClass();
        this.f5556b = str2;
        this.f5557c = str3;
        list.getClass();
        this.f5558d = list;
        this.f5559e = str4;
        this.f5560f = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        sb.append("-");
        sb.append(str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5555a + ", mProviderPackage: " + this.f5556b + ", mQuery: " + this.f5557c + ", mSystemFont: " + this.f5559e + ", mVariationSettings: " + this.f5560f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f5558d;
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
