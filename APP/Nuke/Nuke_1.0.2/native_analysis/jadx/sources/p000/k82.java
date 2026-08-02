package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k82 {

    /* JADX INFO: renamed from: a */
    public final yw0 f5390a;

    /* JADX INFO: renamed from: b */
    public final String f5391b;

    /* JADX INFO: renamed from: c */
    public final js0 f5392c;

    /* JADX INFO: renamed from: d */
    public final o82 f5393d;

    /* JADX INFO: renamed from: e */
    public final p40 f5394e;

    /* JADX INFO: renamed from: f */
    public C0550oo f5395f;

    public k82(C0093cj c0093cj) {
        c0093cj.getClass();
        yw0 yw0Var = (yw0) c0093cj.f1579a;
        if (yw0Var == null) {
            C0676s.m4653l("url == null");
            throw null;
        }
        this.f5390a = yw0Var;
        this.f5391b = (String) c0093cj.f1580b;
        this.f5392c = ((ye0) c0093cj.f1581c).m6250b();
        this.f5393d = (o82) c0093cj.f1582d;
        this.f5394e = (p40) c0093cj.f1583e;
    }

    /* JADX INFO: renamed from: a */
    public final C0093cj m2615a() {
        C0093cj c0093cj = new C0093cj();
        c0093cj.f1579a = this.f5390a;
        c0093cj.f1580b = this.f5391b;
        c0093cj.f1582d = this.f5393d;
        c0093cj.f1583e = this.f5394e;
        c0093cj.f1581c = this.f5392c.m2559c();
        return c0093cj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f5391b);
        sb.append(", url=");
        sb.append(this.f5390a);
        js0 js0Var = this.f5392c;
        if (js0Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : js0Var) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0179eu.m1447a0();
                    throw null;
                }
                ow1 ow1Var = (ow1) obj;
                String str = (String) ow1Var.f7862h;
                String str2 = (String) ow1Var.f7863i;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (ug3.m5502j(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        ie0 ie0Var = ie0.f4582n;
        p40 p40Var = this.f5394e;
        if (!t11.m5086l(p40Var, ie0Var)) {
            sb.append(", tags=");
            sb.append(p40Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
