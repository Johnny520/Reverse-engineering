package p000;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jm2 {

    /* JADX INFO: renamed from: a */
    public final String f5107a;

    /* JADX INFO: renamed from: b */
    public final z70 f5108b;

    /* JADX INFO: renamed from: c */
    public final int f5109c;

    /* JADX INFO: renamed from: d */
    public int f5110d;

    /* JADX INFO: renamed from: e */
    public boolean f5111e;

    public jm2(String str, z70 z70Var, int i) {
        if (z70Var == null) {
            um2.m5516f("file == null");
            throw null;
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            C0676s.m4651j("invalid alignment");
            throw null;
        }
        this.f5107a = str;
        this.f5108b = z70Var;
        this.f5109c = i;
        this.f5110d = -1;
        this.f5111e = false;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1349a(f21 f21Var);

    /* JADX INFO: renamed from: b */
    public final int m2516b() {
        int i = this.f5110d;
        if (i >= 0) {
            return i;
        }
        c80.m667j("fileOffset not set");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public abstract Collection mo398c();

    /* JADX INFO: renamed from: d */
    public final void m2517d() {
        m2519g();
        mo1350e();
        this.f5111e = true;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo1350e();

    /* JADX INFO: renamed from: f */
    public final void m2518f() {
        if (this.f5111e) {
            return;
        }
        c80.m667j("not prepared");
    }

    /* JADX INFO: renamed from: g */
    public final void m2519g() {
        if (this.f5111e) {
            c80.m667j("already prepared");
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo1351h();

    /* JADX INFO: renamed from: i */
    public final void m2520i(C0929yn c0929yn) {
        m2518f();
        c0929yn.m6290a(this.f5109c);
        int i = c0929yn.f13526c;
        int i2 = this.f5110d;
        if (i2 < 0) {
            this.f5110d = i;
        } else if (i2 != i) {
            StringBuilder sb = new StringBuilder("alignment mismatch: for ");
            sb.append(this);
            int i3 = this.f5110d;
            sb.append(", at ");
            sb.append(i);
            sb.append(", but expected ");
            sb.append(i3);
            throw new RuntimeException(sb.toString());
        }
        if (c0929yn.m6293d()) {
            String str = this.f5107a;
            if (str != null) {
                c0929yn.m6292c("\n" + str + ":", 0);
            } else if (i != 0) {
                c0929yn.m6292c("\n", 0);
            }
        }
        mo1352j(c0929yn);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1352j(C0929yn c0929yn);
}
