package p118X3;

import p068N1.C1013c;
import p208n4.InterfaceC2721t;

/* JADX INFO: renamed from: X3.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1683E {

    /* JADX INFO: renamed from: a */
    public C1679A f5723a;

    /* JADX INFO: renamed from: b */
    public EnumC1716z f5724b;

    /* JADX INFO: renamed from: d */
    public String f5726d;

    /* JADX INFO: renamed from: e */
    public C1705o f5727e;

    /* JADX INFO: renamed from: h */
    public InterfaceC2721t f5730h;

    /* JADX INFO: renamed from: i */
    public C1684F f5731i;

    /* JADX INFO: renamed from: j */
    public C1684F f5732j;

    /* JADX INFO: renamed from: k */
    public C1684F f5733k;

    /* JADX INFO: renamed from: l */
    public long f5734l;

    /* JADX INFO: renamed from: m */
    public long f5735m;

    /* JADX INFO: renamed from: n */
    public C1013c f5736n;

    /* JADX INFO: renamed from: c */
    public int f5725c = -1;

    /* JADX INFO: renamed from: g */
    public AbstractC1687I f5729g = AbstractC1687I.f5761e;

    /* JADX INFO: renamed from: o */
    public InterfaceC1690L f5737o = InterfaceC1690L.f5774a;

    /* JADX INFO: renamed from: f */
    public C1706p f5728f = new C1706p(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m3003b(String str, C1684F c1684f) {
        if (c1684f != null) {
            if (c1684f.f5746l != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c1684f.f5747m != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c1684f.f5748n != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1684F m3004a() {
        int i5 = this.f5725c;
        if (i5 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f5725c).toString());
        }
        C1679A c1679a = this.f5723a;
        if (c1679a == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC1716z enumC1716z = this.f5724b;
        if (enumC1716z == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f5726d;
        if (str != null) {
            return new C1684F(c1679a, enumC1716z, str, i5, this.f5727e, this.f5728f.m3024c(), this.f5729g, this.f5730h, this.f5731i, this.f5732j, this.f5733k, this.f5734l, this.f5735m, this.f5736n, this.f5737o);
        }
        throw new IllegalStateException("message == null");
    }
}
