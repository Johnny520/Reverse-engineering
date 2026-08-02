package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a42 extends iy0 {

    /* JADX INFO: renamed from: i */
    public final d42 f50i;

    /* JADX INFO: renamed from: j */
    public final q30 f51j;

    /* JADX INFO: renamed from: k */
    public f63 f52k;

    public a42(d42 d42Var) {
        if (d42Var == null) {
            um2.m5516f("prototype == null");
            throw null;
        }
        wu2 wu2Var = d42Var.f1865j;
        Object[] objArr = wu2Var.f5590i;
        this.f50i = d42Var;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder(length + 1);
        char cCharAt = d42Var.f1864i.f7521h.charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < length; i++) {
            char cCharAt2 = ((o43) wu2Var.m2693e(i)).f7521h.charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f51j = new q30(sb.toString());
        this.f52k = objArr.length != 0 ? new f63(wu2Var) : null;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        b42 b42Var = (b42) z70Var.f13757h;
        b42 b42Var2 = (b42) z70Var.f13758i;
        eh1 eh1Var = (eh1) z70Var.f13752c;
        b42Var2.m405q(this.f50i.f1864i);
        b42Var.m403o(this.f51j);
        f63 f63Var = this.f52k;
        if (f63Var != null) {
            this.f52k = (f63) eh1Var.m1354l(f63Var);
        }
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_PROTO_ID_ITEM;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: c */
    public final int mo70c() {
        return 12;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: d */
    public final void mo71d(z70 z70Var, C0929yn c0929yn) {
        b42 b42Var = (b42) z70Var.f13757h;
        q30 q30Var = this.f51j;
        int iM400l = b42Var.m400l(q30Var);
        b42 b42Var2 = (b42) z70Var.f13758i;
        d42 d42Var = this.f50i;
        o43 o43Var = d42Var.f1864i;
        o43 o43Var2 = d42Var.f1864i;
        int iM402n = b42Var2.m402n(o43Var);
        f63 f63Var = this.f52k;
        int iM6177f = f63Var == null ? 0 : f63Var.m6177f();
        if (c0929yn.m6293d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(o43Var2.mo23b());
            sb.append(" proto(");
            wu2 wu2Var = d42Var.f1865j;
            int length = wu2Var.f5590i.length;
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(((o43) wu2Var.m2693e(i)).mo23b());
            }
            sb.append(")");
            c0929yn.m6292c(m2416f() + ' ' + sb.toString(), 0);
            c0929yn.m6292c("  shorty_idx:      " + pp0.m3899K(iM400l) + " // " + q30Var.m4048g(), 4);
            c0929yn.m6292c("  return_type_idx: " + pp0.m3899K(iM402n) + " // " + o43Var2.mo23b(), 4);
            c0929yn.m6292c("  parameters_off:  ".concat(pp0.m3899K(iM6177f)), 4);
        }
        c0929yn.m6298j(iM400l);
        c0929yn.m6298j(iM402n);
        c0929yn.m6298j(iM6177f);
    }
}
