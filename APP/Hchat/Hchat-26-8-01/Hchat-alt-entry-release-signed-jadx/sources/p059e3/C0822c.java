package p059e3;

import android.util.Base64;
import java.util.List;
import p025bc.AbstractC0255e;

/* JADX INFO: renamed from: e3.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822c {

    /* JADX INFO: renamed from: a */
    public final String f2464a;

    /* JADX INFO: renamed from: b */
    public final String f2465b;

    /* JADX INFO: renamed from: c */
    public final String f2466c;

    /* JADX INFO: renamed from: d */
    public final List f2467d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0822c(String str, List list, String str2, String str3) {
        str.getClass();
        this.f2464a = str;
        str2.getClass();
        this.f2465b = str2;
        this.f2466c = str3;
        list.getClass();
        this.f2467d = list;
        AbstractC0255e.m1033v(str, "-", str2, "-", str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f2464a + ", mProviderPackage: " + this.f2465b + ", mQuery: " + this.f2466c + ", mCertificates:");
        int i9 = 0;
        while (true) {
            List list = this.f2467d;
            if (i9 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i9);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i9++;
        }
    }
}
