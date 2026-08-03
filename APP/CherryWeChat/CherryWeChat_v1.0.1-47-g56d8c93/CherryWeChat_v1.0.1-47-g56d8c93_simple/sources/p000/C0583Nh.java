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

    public C0583Nh(String r1, String r2, String r3, List r4, String r5, String r6) {
        r1.getClass();
        this.f1883a = r1;
        r2.getClass();
        this.f1884b = r2;
        this.f1885c = r3;
        r4.getClass();
        this.f1886d = r4;
        this.f1887e = r5;
        this.f1888f = r6;
        this.f1889g = r1 + "-" + r2 + "-" + r3 + "-" + r5 + "-" + r6;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("FontRequest {mProviderAuthority: " + this.f1883a + ", mProviderPackage: " + this.f1884b + ", mQuery: " + this.f1885c + ", mSystemFont: " + this.f1887e + ", mVariationSettings: " + this.f1888f + ", mCertificates:");
        int r2 = 0;
    L3:
        List r3 = this.f1886d;
        if (r2 >= r3.size()) goto L10;
        r0.append(" [");
        List r32 = (List) r3.get(r2);
        int r4 = 0;
    L7:
        if (r4 >= r32.size()) goto L9;
        r0.append(" \"");
        r0.append(Base64.encodeToString((byte[]) r32.get(r4), 0));
        r0.append("\"");
        r4 = r4 + 1;
        goto L7
    L9:
        r0.append(" ]");
        r2 = r2 + 1;
        goto L3
    L10:
        r0.append("}mCertificatesArray: 0");
        return r0.toString();
    }
}
