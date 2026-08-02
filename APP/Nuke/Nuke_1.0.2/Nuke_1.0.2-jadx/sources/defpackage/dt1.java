package defpackage;

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
    public int A;
    public int B;
    public long C;
    public hh1 D;
    public iy2 E;
    public n4 b;
    public um2 e;
    public boolean f;
    public boolean g;
    public gd3 h;
    public boolean i;
    public boolean j;
    public sn k;
    public na0 l;
    public Proxy m;
    public ProxySelector n;
    public gd3 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public ys1 u;
    public cq v;
    public up0 w;
    public int x;
    public int y;
    public int z;
    public kj1 a = new kj1(7);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dt1() {
        TimeZone timeZone = wg3.a;
        this.e = new um2(13);
        this.f = true;
        this.g = true;
        gd3 gd3Var = gd3.j;
        this.h = gd3Var;
        this.i = true;
        this.j = true;
        this.k = sn.D;
        this.l = na0.e;
        this.o = gd3Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.p = socketFactory;
        this.s = et1.G;
        this.t = et1.F;
        this.u = ys1.a;
        this.v = cq.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.B = 60000;
        this.C = 1024L;
    }
}
