package p000A;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: A.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0005f {

    /* JADX INFO: renamed from: a */
    public final String f10a;

    /* JADX INFO: renamed from: b */
    public final String f11b;

    /* JADX INFO: renamed from: c */
    public final String f12c;

    /* JADX INFO: renamed from: d */
    public final List f13d;

    /* JADX INFO: renamed from: e */
    public final String f14e;

    public C0005f(String str, String str2, String str3, List list) {
        str.getClass();
        this.f10a = str;
        str2.getClass();
        this.f11b = str2;
        this.f12c = str3;
        list.getClass();
        this.f13d = list;
        this.f14e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f10a + ", mProviderPackage: " + this.f11b + ", mQuery: " + this.f12c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.f13d;
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
