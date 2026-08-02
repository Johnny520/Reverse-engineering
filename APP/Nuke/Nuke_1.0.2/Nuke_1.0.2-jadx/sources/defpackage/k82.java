package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k82 {
    public final yw0 a;
    public final String b;
    public final js0 c;
    public final o82 d;
    public final p40 e;
    public oo f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k82(cj cjVar) {
        cjVar.getClass();
        yw0 yw0Var = (yw0) cjVar.a;
        if (yw0Var == null) {
            s.l("url == null");
            throw null;
        }
        this.a = yw0Var;
        this.b = (String) cjVar.b;
        this.c = ((ye0) cjVar.c).b();
        this.d = (o82) cjVar.d;
        this.e = (p40) cjVar.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cj a() {
        cj cjVar = new cj();
        cjVar.a = this.a;
        cjVar.b = this.b;
        cjVar.d = this.d;
        cjVar.e = this.e;
        cjVar.c = this.c.c();
        return cjVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        js0 js0Var = this.c;
        if (js0Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : js0Var) {
                int i2 = i + 1;
                if (i < 0) {
                    eu.a0();
                    throw null;
                }
                ow1 ow1Var = (ow1) obj;
                String str = (String) ow1Var.h;
                String str2 = (String) ow1Var.i;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (ug3.j(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        ie0 ie0Var = ie0.n;
        p40 p40Var = this.e;
        if (!t11.l(p40Var, ie0Var)) {
            sb.append(", tags=");
            sb.append(p40Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
