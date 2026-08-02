package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dt1 {

    /* JADX INFO: renamed from: A */
    public int f2195A;

    /* JADX INFO: renamed from: B */
    public int f2196B;

    /* JADX INFO: renamed from: C */
    public long f2197C;

    /* JADX INFO: renamed from: D */
    public hh1 f2198D;

    /* JADX INFO: renamed from: E */
    public iy2 f2199E;

    /* JADX INFO: renamed from: b */
    public C0485n4 f2201b;

    /* JADX INFO: renamed from: e */
    public um2 f2204e;

    /* JADX INFO: renamed from: f */
    public boolean f2205f;

    /* JADX INFO: renamed from: g */
    public boolean f2206g;

    /* JADX INFO: renamed from: h */
    public gd3 f2207h;

    /* JADX INFO: renamed from: i */
    public boolean f2208i;

    /* JADX INFO: renamed from: j */
    public boolean f2209j;

    /* JADX INFO: renamed from: k */
    public C0700sn f2210k;

    /* JADX INFO: renamed from: l */
    public na0 f2211l;

    /* JADX INFO: renamed from: m */
    public Proxy f2212m;

    /* JADX INFO: renamed from: n */
    public ProxySelector f2213n;

    /* JADX INFO: renamed from: o */
    public gd3 f2214o;

    /* JADX INFO: renamed from: p */
    public SocketFactory f2215p;

    /* JADX INFO: renamed from: q */
    public SSLSocketFactory f2216q;

    /* JADX INFO: renamed from: r */
    public X509TrustManager f2217r;

    /* JADX INFO: renamed from: s */
    public List f2218s;

    /* JADX INFO: renamed from: t */
    public List f2219t;

    /* JADX INFO: renamed from: u */
    public ys1 f2220u;

    /* JADX INFO: renamed from: v */
    public C0102cq f2221v;

    /* JADX INFO: renamed from: w */
    public up0 f2222w;

    /* JADX INFO: renamed from: x */
    public int f2223x;

    /* JADX INFO: renamed from: y */
    public int f2224y;

    /* JADX INFO: renamed from: z */
    public int f2225z;

    /* JADX INFO: renamed from: a */
    public kj1 f2200a = new kj1(7);

    /* JADX INFO: renamed from: c */
    public final ArrayList f2202c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f2203d = new ArrayList();

    public dt1() {
        TimeZone timeZone = wg3.f12507a;
        this.f2204e = new um2(13);
        this.f2205f = true;
        this.f2206g = true;
        gd3 gd3Var = gd3.f3432j;
        this.f2207h = gd3Var;
        this.f2208i = true;
        this.f2209j = true;
        this.f2210k = C0700sn.f10200D;
        this.f2211l = na0.f7081e;
        this.f2214o = gd3Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.f2215p = socketFactory;
        this.f2218s = et1.f2594G;
        this.f2219t = et1.f2593F;
        this.f2220u = ys1.f13610a;
        this.f2221v = C0102cq.f1665c;
        this.f2224y = 10000;
        this.f2225z = 10000;
        this.f2195A = 10000;
        this.f2196B = 60000;
        this.f2197C = 1024L;
    }
}
