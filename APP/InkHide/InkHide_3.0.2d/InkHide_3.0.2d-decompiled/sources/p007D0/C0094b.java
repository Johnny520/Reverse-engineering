package p007D0;

import java.util.LinkedHashMap;
import java.util.Map;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0291a;

/* JADX INFO: renamed from: D0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0094b {

    /* JADX INFO: renamed from: a */
    public final String f371a;

    /* JADX INFO: renamed from: b */
    public final String f372b;

    /* JADX INFO: renamed from: c */
    public final Map f373c;

    /* JADX INFO: renamed from: d */
    public final byte[] f374d;

    /* JADX INFO: renamed from: e */
    public final int f375e;

    /* JADX INFO: renamed from: f */
    public final int f376f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0094b(String str, String str2, Map map, byte[] bArr, int i2) {
        map = (i2 & 4) != 0 ? new LinkedHashMap() : map;
        bArr = (i2 & 8) != 0 ? null : bArr;
        AbstractC0223g.m418e(str, "url");
        AbstractC0223g.m418e(map, "header");
        this.f371a = str;
        this.f372b = str2;
        this.f373c = map;
        this.f374d = bArr;
        this.f375e = 10000;
        this.f376f = 10000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        byte[] bArr = this.f374d;
        return "Request(url='" + this.f371a + "', method='" + this.f372b + "', header=" + this.f373c + ", body=" + (bArr != null ? new String(bArr, AbstractC0291a.f663a) : null) + ", connectTimeOut=" + this.f375e + ", readTimeOut=" + this.f376f + ")";
    }
}
