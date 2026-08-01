package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o71 extends te0 {

    /* JADX INFO: renamed from: a */
    public final String f4471a;

    /* JADX INFO: renamed from: b */
    public final s71 f4472b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0369jv f4473c;

    /* JADX INFO: renamed from: d */
    public final int f4474d;

    /* JADX INFO: renamed from: e */
    public final boolean f4475e;

    /* JADX INFO: renamed from: f */
    public final int f4476f;

    /* JADX INFO: renamed from: g */
    public final int f4477g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o71(String str, s71 s71Var, InterfaceC0369jv interfaceC0369jv, int i, boolean z, int i2, int i3) {
        this.f4471a = str;
        this.f4472b = s71Var;
        this.f4473c = interfaceC0369jv;
        this.f4474d = i;
        this.f4475e = z;
        this.f4476f = i2;
        this.f4477g = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        r71 r71Var = new r71();
        r71Var.f5312r = this.f4471a;
        r71Var.f5313s = this.f4472b;
        r71Var.f5314t = this.f4473c;
        r71Var.f5315u = this.f4474d;
        r71Var.f5316v = this.f4475e;
        r71Var.f5317w = this.f4476f;
        r71Var.f5318x = this.f4477g;
        return r71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o71)) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return p30.m3002l(this.f4471a, o71Var.f4471a) && p30.m3002l(this.f4472b, o71Var.f4472b) && p30.m3002l(this.f4473c, o71Var.f4473c) && this.f4474d == o71Var.f4474d && this.f4475e == o71Var.f4475e && this.f4476f == o71Var.f4476f && this.f4477g == o71Var.f4477g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo229f(oe0 oe0Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        s71 s71Var;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        InterfaceC0369jv interfaceC0369jv;
        InterfaceC0369jv interfaceC0369jv2;
        int i5;
        int i6;
        r71 r71Var = (r71) oe0Var;
        r71Var.getClass();
        s71 s71Var2 = r71Var.f5313s;
        boolean z5 = false;
        boolean z6 = true;
        s71 s71Var3 = this.f4472b;
        if (s71Var3 != s71Var2) {
            if (!s71Var3.f5669a.m1608b(s71Var2.f5669a)) {
                z = true;
            }
            str = r71Var.f5312r;
            str2 = this.f4471a;
            if (p30.m3002l(str, str2)) {
                r71Var.f5312r = str2;
                r71Var.f5311B = null;
                z2 = true;
            } else {
                z2 = false;
            }
            s71Var = r71Var.f5313s;
            if (s71Var == s71Var3) {
                if (p30.m3002l(s71Var.f5670b, s71Var3.f5670b) && s71Var.f5669a.m1607a(s71Var3.f5669a)) {
                }
                boolean z7 = !z5;
                r71Var.f5313s = s71Var3;
                i = r71Var.f5318x;
                i2 = this.f4477g;
                if (i != i2) {
                    r71Var.f5318x = i2;
                    z7 = true;
                }
                i3 = r71Var.f5317w;
                i4 = this.f4476f;
                if (i3 != i4) {
                    r71Var.f5317w = i4;
                    z7 = true;
                }
                z3 = r71Var.f5316v;
                z4 = this.f4475e;
                if (z3 != z4) {
                    r71Var.f5316v = z4;
                    z7 = true;
                }
                interfaceC0369jv = r71Var.f5314t;
                interfaceC0369jv2 = this.f4473c;
                if (!p30.m3002l(interfaceC0369jv, interfaceC0369jv2)) {
                    r71Var.f5314t = interfaceC0369jv2;
                    z7 = true;
                }
                i5 = r71Var.f5315u;
                i6 = this.f4474d;
                if (i5 == i6) {
                    z6 = z7;
                } else {
                    r71Var.f5315u = i6;
                }
                if (z2 || z6) {
                    zo0 zo0VarM3427w0 = r71Var.m3427w0();
                    String str3 = r71Var.f5312r;
                    s71 s71Var4 = r71Var.f5313s;
                    InterfaceC0369jv interfaceC0369jv3 = r71Var.f5314t;
                    int i7 = r71Var.f5315u;
                    boolean z8 = r71Var.f5316v;
                    int i8 = r71Var.f5317w;
                    int i9 = r71Var.f5318x;
                    zo0VarM3427w0.f7958a = str3;
                    zo0VarM3427w0.f7959b = s71Var4;
                    zo0VarM3427w0.f7960c = interfaceC0369jv3;
                    zo0VarM3427w0.f7961d = i7;
                    zo0VarM3427w0.f7962e = z8;
                    zo0VarM3427w0.f7963f = i8;
                    zo0VarM3427w0.f7964g = i9;
                    zo0VarM3427w0.f7976s = (zo0VarM3427w0.f7976s << 2) | 2;
                    zo0VarM3427w0.m5603c();
                }
                if (r71Var.f4542q) {
                    if (z2 || (z && r71Var.f5310A != null)) {
                        z60.m5417D(r71Var);
                    }
                    if (z2 || z6) {
                        v50.m4407m(r71Var);
                        AbstractC0398kl.m1932r(r71Var);
                    }
                    if (z) {
                        AbstractC0398kl.m1932r(r71Var);
                        return;
                    }
                    return;
                }
                return;
            }
            s71Var.getClass();
            z5 = true;
            boolean z72 = !z5;
            r71Var.f5313s = s71Var3;
            i = r71Var.f5318x;
            i2 = this.f4477g;
            if (i != i2) {
            }
            i3 = r71Var.f5317w;
            i4 = this.f4476f;
            if (i3 != i4) {
            }
            z3 = r71Var.f5316v;
            z4 = this.f4475e;
            if (z3 != z4) {
            }
            interfaceC0369jv = r71Var.f5314t;
            interfaceC0369jv2 = this.f4473c;
            if (!p30.m3002l(interfaceC0369jv, interfaceC0369jv2)) {
            }
            i5 = r71Var.f5315u;
            i6 = this.f4474d;
            if (i5 == i6) {
            }
            if (z2) {
                zo0 zo0VarM3427w02 = r71Var.m3427w0();
                String str32 = r71Var.f5312r;
                s71 s71Var42 = r71Var.f5313s;
                InterfaceC0369jv interfaceC0369jv32 = r71Var.f5314t;
                int i72 = r71Var.f5315u;
                boolean z82 = r71Var.f5316v;
                int i82 = r71Var.f5317w;
                int i92 = r71Var.f5318x;
                zo0VarM3427w02.f7958a = str32;
                zo0VarM3427w02.f7959b = s71Var42;
                zo0VarM3427w02.f7960c = interfaceC0369jv32;
                zo0VarM3427w02.f7961d = i72;
                zo0VarM3427w02.f7962e = z82;
                zo0VarM3427w02.f7963f = i82;
                zo0VarM3427w02.f7964g = i92;
                zo0VarM3427w02.f7976s = (zo0VarM3427w02.f7976s << 2) | 2;
                zo0VarM3427w02.m5603c();
            }
            if (r71Var.f4542q) {
            }
        } else {
            s71Var3.getClass();
        }
        z = false;
        str = r71Var.f5312r;
        str2 = this.f4471a;
        if (p30.m3002l(str, str2)) {
        }
        s71Var = r71Var.f5313s;
        if (s71Var == s71Var3) {
        }
        z5 = true;
        boolean z722 = !z5;
        r71Var.f5313s = s71Var3;
        i = r71Var.f5318x;
        i2 = this.f4477g;
        if (i != i2) {
        }
        i3 = r71Var.f5317w;
        i4 = this.f4476f;
        if (i3 != i4) {
        }
        z3 = r71Var.f5316v;
        z4 = this.f4475e;
        if (z3 != z4) {
        }
        interfaceC0369jv = r71Var.f5314t;
        interfaceC0369jv2 = this.f4473c;
        if (!p30.m3002l(interfaceC0369jv, interfaceC0369jv2)) {
        }
        i5 = r71Var.f5315u;
        i6 = this.f4474d;
        if (i5 == i6) {
        }
        if (z2) {
        }
        if (r71Var.f4542q) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((AbstractC0748t1.m4145c(AbstractC0748t1.m4144b(this.f4474d, (this.f4473c.hashCode() + AbstractC0748t1.m4147e(this.f4472b, this.f4471a.hashCode() * 31, 31)) * 31, 31), 31, this.f4475e) + this.f4476f) * 31) + this.f4477g) * 31;
    }
}
