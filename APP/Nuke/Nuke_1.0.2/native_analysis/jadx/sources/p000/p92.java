package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p92 {

    /* JADX INFO: renamed from: a */
    public k82 f8044a;

    /* JADX INFO: renamed from: b */
    public c42 f8045b;

    /* JADX INFO: renamed from: d */
    public String f8047d;

    /* JADX INFO: renamed from: e */
    public yr0 f8048e;

    /* JADX INFO: renamed from: h */
    public ys2 f8051h;

    /* JADX INFO: renamed from: i */
    public r92 f8052i;

    /* JADX INFO: renamed from: j */
    public r92 f8053j;

    /* JADX INFO: renamed from: k */
    public r92 f8054k;

    /* JADX INFO: renamed from: l */
    public long f8055l;

    /* JADX INFO: renamed from: m */
    public long f8056m;

    /* JADX INFO: renamed from: n */
    public f90 f8057n;

    /* JADX INFO: renamed from: c */
    public int f8046c = -1;

    /* JADX INFO: renamed from: g */
    public u92 f8050g = u92.f11170i;

    /* JADX INFO: renamed from: o */
    public e33 f8058o = e33.f2303g;

    /* JADX INFO: renamed from: f */
    public ye0 f8049f = new ye0(1);

    /* JADX INFO: renamed from: b */
    public static void m3829b(String str, r92 r92Var) {
        if (r92Var != null) {
            if (r92Var.f9464p != null) {
                C0676s.m4645c(str.concat(".networkResponse != null"));
            } else if (r92Var.f9465q != null) {
                C0676s.m4645c(str.concat(".cacheResponse != null"));
            } else {
                if (r92Var.f9466r == null) {
                    return;
                }
                C0676s.m4645c(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final r92 m3830a() {
        int i = this.f8046c;
        if (i < 0) {
            c80.m668k("code < 0: ", this.f8046c);
            return null;
        }
        k82 k82Var = this.f8044a;
        if (k82Var == null) {
            C0676s.m4653l("request == null");
            return null;
        }
        c42 c42Var = this.f8045b;
        if (c42Var == null) {
            C0676s.m4653l("protocol == null");
            return null;
        }
        String str = this.f8047d;
        if (str != null) {
            return new r92(k82Var, c42Var, str, i, this.f8048e, this.f8049f.m6250b(), this.f8050g, this.f8051h, this.f8052i, this.f8053j, this.f8054k, this.f8055l, this.f8056m, this.f8057n, this.f8058o);
        }
        C0676s.m4653l("message == null");
        return null;
    }
}
