package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lp2 implements rd0 {

    /* JADX INFO: renamed from: a */
    public final C0690sd f6240a;

    /* JADX INFO: renamed from: b */
    public final int f6241b;

    public lp2(String str, int i) {
        this.f6240a = new C0690sd(str);
        this.f6241b = i;
    }

    @Override // p000.rd0
    /* JADX INFO: renamed from: a */
    public final void mo103a(sd0 sd0Var) {
        int i = sd0Var.f10057d;
        C0690sd c0690sd = this.f6240a;
        if (i != -1) {
            int i2 = sd0Var.f10058e;
            String str = c0690sd.f10051i;
            String str2 = c0690sd.f10051i;
            sd0Var.m4803i(str, i, i2);
            if (str2.length() > 0) {
                sd0Var.m4805k(i, str2.length() + i);
            }
        } else {
            int i3 = sd0Var.f10055b;
            int i4 = sd0Var.f10056c;
            String str3 = c0690sd.f10051i;
            String str4 = c0690sd.f10051i;
            sd0Var.m4803i(str3, i3, i4);
            if (str4.length() > 0) {
                sd0Var.m4805k(i3, str4.length() + i3);
            }
        }
        int i5 = sd0Var.f10055b;
        int i6 = sd0Var.f10056c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f6241b;
        int iM779D = ci0.m779D(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c0690sd.f10051i.length(), 0, ((sx1) sd0Var.f10059f).m5009b());
        sd0Var.m4806l(iM779D, iM779D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp2)) {
            return false;
        }
        lp2 lp2Var = (lp2) obj;
        return t11.m5086l(this.f6240a.f10051i, lp2Var.f6240a.f10051i) && this.f6241b == lp2Var.f6241b;
    }

    public final int hashCode() {
        return (this.f6240a.f10051i.hashCode() * 31) + this.f6241b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f6240a.f10051i);
        sb.append("', newCursorPosition=");
        return vi0.m5694m(sb, this.f6241b, ')');
    }
}
