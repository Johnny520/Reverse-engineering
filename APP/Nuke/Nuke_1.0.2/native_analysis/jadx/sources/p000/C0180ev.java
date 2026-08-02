package p000;

/* JADX INFO: renamed from: ev */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0180ev implements rd0 {

    /* JADX INFO: renamed from: a */
    public final C0690sd f2649a;

    /* JADX INFO: renamed from: b */
    public final int f2650b;

    public C0180ev(String str, int i) {
        this(new C0690sd(str), i);
    }

    @Override // p000.rd0
    /* JADX INFO: renamed from: a */
    public final void mo103a(sd0 sd0Var) {
        int i = sd0Var.f10057d;
        C0690sd c0690sd = this.f2649a;
        if (i != -1) {
            sd0Var.m4803i(c0690sd.f10051i, i, sd0Var.f10058e);
        } else {
            sd0Var.m4803i(c0690sd.f10051i, sd0Var.f10055b, sd0Var.f10056c);
        }
        int i2 = sd0Var.f10055b;
        int i3 = sd0Var.f10056c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f2650b;
        int iM779D = ci0.m779D(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c0690sd.f10051i.length(), 0, ((sx1) sd0Var.f10059f).m5009b());
        sd0Var.m4806l(iM779D, iM779D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0180ev)) {
            return false;
        }
        C0180ev c0180ev = (C0180ev) obj;
        return t11.m5086l(this.f2649a.f10051i, c0180ev.f2649a.f10051i) && this.f2650b == c0180ev.f2650b;
    }

    public final int hashCode() {
        return (this.f2649a.f10051i.hashCode() * 31) + this.f2650b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f2649a.f10051i);
        sb.append("', newCursorPosition=");
        return vi0.m5694m(sb, this.f2650b, ')');
    }

    public C0180ev(C0690sd c0690sd, int i) {
        this.f2649a = c0690sd;
        this.f2650b = i;
    }
}
