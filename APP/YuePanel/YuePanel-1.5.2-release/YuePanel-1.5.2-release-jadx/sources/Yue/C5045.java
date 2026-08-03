package Yue;

import Yue.InterfaceC7144;
import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5045 {

    /* JADX INFO: renamed from: ۥ */
    public final String f1224;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f1225;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f11957;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final List<List<byte[]>> f11958;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f11959;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final String f11960;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5045(@InterfaceC6391 String str, @InterfaceC6391 String str2, @InterfaceC6391 String str3, @InterfaceC6391 List<List<byte[]>> list) {
        this.f1224 = (String) C6740.m21415(str);
        this.f1225 = (String) C6740.m21415(str2);
        this.f11957 = (String) C6740.m21415(str3);
        this.f11958 = (List) C6740.m21415(list);
        this.f11959 = 0;
        this.f11960 = m1859(str, str2, str3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1224 + ", mProviderPackage: " + this.f1225 + ", mQuery: " + this.f11957 + ", mCertificates:");
        for (int i = 0; i < this.f11958.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f11958.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f11959);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public final String m1859(@InterfaceC6391 String str, @InterfaceC6391 String str2, @InterfaceC6391 String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public List<List<byte[]>> m1860() {
        return this.f11958;
    }

    @InterfaceC3397
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m15554() {
        return this.f11959;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m15555() {
        return this.f11960;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String m15556() {
        return this.f11960;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String m15557() {
        return this.f1224;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String m15558() {
        return this.f1225;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String m15559() {
        return this.f11957;
    }

    public C5045(@InterfaceC6391 String str, @InterfaceC6391 String str2, @InterfaceC6391 String str3, @InterfaceC3397 int i) {
        this.f1224 = (String) C6740.m21415(str);
        this.f1225 = (String) C6740.m21415(str2);
        this.f11957 = (String) C6740.m21415(str3);
        this.f11958 = null;
        C6740.m3226(i != 0);
        this.f11959 = i;
        this.f11960 = m1859(str, str2, str3);
    }
}
