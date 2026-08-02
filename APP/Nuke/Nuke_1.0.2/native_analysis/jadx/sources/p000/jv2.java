package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jv2 extends iy0 implements Comparable {

    /* JADX INFO: renamed from: i */
    public final q30 f5235i;

    /* JADX INFO: renamed from: j */
    public iv2 f5236j;

    public jv2(q30 q30Var) {
        if (q30Var == null) {
            um2.m5516f("value == null");
            throw null;
        }
        this.f5235i = q30Var;
        this.f5236j = null;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        if (this.f5236j == null) {
            eh1 eh1Var = (eh1) z70Var.f13754e;
            iv2 iv2Var = new iv2(this.f5235i);
            this.f5236j = iv2Var;
            eh1Var.m1353k(iv2Var);
        }
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_STRING_ID_ITEM;
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: c */
    public final int mo70c() {
        return 4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5235i.compareTo(((jv2) obj).f5235i);
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: d */
    public final void mo71d(z70 z70Var, C0929yn c0929yn) {
        String str;
        int iM6177f = this.f5236j.m6177f();
        if (c0929yn.m6293d()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m2416f());
            sb.append(' ');
            String strMo23b = this.f5235i.mo23b();
            if (strMo23b.length() <= 98) {
                str = "";
            } else {
                strMo23b = strMo23b.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo23b + str + '\"');
            c0929yn.m6292c(sb.toString(), 0);
            c0929yn.m6292c("  string_data_off: ".concat(pp0.m3899K(iM6177f)), 4);
        }
        c0929yn.m6298j(iM6177f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jv2) {
            return this.f5235i.equals(((jv2) obj).f5235i);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5235i.f8714h.hashCode();
    }
}
