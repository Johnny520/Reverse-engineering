package p281t6;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p282t7.AbstractC8179c0;
import p282t7.AbstractC8187k;
import p376zd.C9987e;

/* JADX INFO: renamed from: t6.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8159m0 implements Serializable {

    /* JADX INFO: renamed from: s */
    public static final a f27282s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C8159m0 f27283t;

    /* JADX INFO: renamed from: u */
    public static final C8159m0 f27284u;

    /* JADX INFO: renamed from: v */
    public static final C8159m0 f27285v;

    /* JADX INFO: renamed from: w */
    public static final C8159m0 f27286w;

    /* JADX INFO: renamed from: x */
    public static final C8159m0 f27287x;

    /* JADX INFO: renamed from: y */
    public static final Map f27288y;

    /* JADX INFO: renamed from: q */
    public final String f27289q;

    /* JADX INFO: renamed from: r */
    public final int f27290r;

    static {
        C8159m0 c8159m0 = new C8159m0("http", 80);
        f27283t = c8159m0;
        C8159m0 c8159m02 = new C8159m0("https", 443);
        f27284u = c8159m02;
        C8159m0 c8159m03 = new C8159m0("ws", 80);
        f27285v = c8159m03;
        C8159m0 c8159m04 = new C8159m0("wss", 443);
        f27286w = c8159m04;
        C8159m0 c8159m05 = new C8159m0("socks", 1080);
        f27287x = c8159m05;
        List listM20803r = AbstractC5114x.m20803r(c8159m0, c8159m02, c8159m03, c8159m04, c8159m05);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(listM20803r, 10)), 16));
        for (Object obj : listM20803r) {
            linkedHashMap.put(((C8159m0) obj).f27289q, obj);
        }
        f27288y = linkedHashMap;
    }

    public C8159m0(String str, int i10) {
        str.getClass();
        this.f27289q = str;
        this.f27290r = i10;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!AbstractC8187k.m31861a(str.charAt(i11))) {
                C9987e.m38645a("All characters should be lower case");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m31642b() {
        return this.f27290r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8159m0)) {
            return false;
        }
        C8159m0 c8159m0 = (C8159m0) obj;
        return AbstractC1061t.m3842c(this.f27289q, c8159m0.f27289q) && this.f27290r == c8159m0.f27290r;
    }

    public int hashCode() {
        return (this.f27289q.hashCode() * 31) + Integer.hashCode(this.f27290r);
    }

    public String toString() {
        return "URLProtocol(name=" + this.f27289q + ", defaultPort=" + this.f27290r + ')';
    }

    /* JADX INFO: renamed from: t6.m0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8159m0 m31643a(String str) {
            str.getClass();
            String strM31845c = AbstractC8179c0.m31845c(str);
            C8159m0 c8159m0 = (C8159m0) C8159m0.f27282s.m31644b().get(strM31845c);
            return c8159m0 == null ? new C8159m0(strM31845c, 0) : c8159m0;
        }

        /* JADX INFO: renamed from: b */
        public final Map m31644b() {
            return C8159m0.f27288y;
        }

        public a() {
        }
    }
}
