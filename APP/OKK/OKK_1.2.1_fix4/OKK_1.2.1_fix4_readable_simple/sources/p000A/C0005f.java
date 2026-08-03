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

    public C0005f(String r1, String r2, String r3, List r4) {
        r1.getClass();
        this.f10a = r1;
        r2.getClass();
        this.f11b = r2;
        this.f12c = r3;
        r4.getClass();
        this.f13d = r4;
        this.f14e = r1 + "-" + r2 + "-" + r3;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("FontRequest {mProviderAuthority: " + this.f10a + ", mProviderPackage: " + this.f11b + ", mQuery: " + this.f12c + ", mCertificates:");
        int r2 = 0;
    L3:
        List r3 = this.f13d;
        if (r2 >= r3.size()) goto L10;
        r02.append(" [");
        List r32 = (List) r3.get(r2);
        int r4 = 0;
    L7:
        if (r4 >= r32.size()) goto L9;
        r02.append(" \"");
        r02.append(Base64.encodeToString((byte[]) r32.get(r4), 0));
        r02.append("\"");
        r4 = r4 + 1;
        goto L7
    L9:
        r02.append(" ]");
        r2 = r2 + 1;
        goto L3
    L10:
        r02.append("}mCertificatesArray: 0");
        return r02.toString();
    }
}
