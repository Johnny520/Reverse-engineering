package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ar */
/* JADX INFO: loaded from: classes.dex */
public final class C0041ar {

    /* JADX INFO: renamed from: o */
    public static int f654o = 1000;

    /* JADX INFO: renamed from: p */
    public static boolean f655p = true;

    /* JADX INFO: renamed from: b */
    public final C0983zx f657b;

    /* JADX INFO: renamed from: e */
    public C0586p6[] f660e;

    /* JADX INFO: renamed from: k */
    public final C0009a8 f666k;

    /* JADX INFO: renamed from: n */
    public C0586p6 f669n;

    /* JADX INFO: renamed from: a */
    public int f656a = 0;

    /* JADX INFO: renamed from: c */
    public int f658c = 32;

    /* JADX INFO: renamed from: d */
    public int f659d = 32;

    /* JADX INFO: renamed from: f */
    public boolean f661f = false;

    /* JADX INFO: renamed from: g */
    public boolean[] f662g = new boolean[32];

    /* JADX INFO: renamed from: h */
    public int f663h = 1;

    /* JADX INFO: renamed from: i */
    public int f664i = 0;

    /* JADX INFO: renamed from: j */
    public int f665j = 32;

    /* JADX INFO: renamed from: l */
    public a40[] f667l = new a40[f654o];

    /* JADX INFO: renamed from: m */
    public int f668m = 0;

    public C0041ar() {
        this.f660e = null;
        this.f660e = new C0586p6[32];
        m468q();
        C0009a8 c0009a8 = new C0009a8();
        c0009a8.f64a = new C0724sx();
        c0009a8.f65b = new C0724sx();
        c0009a8.f66c = new C0724sx();
        c0009a8.f67d = new a40[32];
        this.f666k = c0009a8;
        C0983zx c0983zx = new C0983zx(c0009a8);
        c0983zx.f5626f = new a40[128];
        c0983zx.f5627g = new a40[128];
        c0983zx.f5628h = 0;
        c0983zx.f5629i = new C0946yx(c0983zx);
        this.f657b = c0983zx;
        if (f655p) {
            this.f669n = new C0976zq(c0009a8);
        } else {
            this.f669n = new C0586p6(c0009a8);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m452m(Object obj) {
        a40 a40Var = ((C0099cc) obj).f950g;
        if (a40Var != null) {
            return (int) (a40Var.f32e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final a40 m453a(int i) {
        a40 a40Var = (a40) ((C0724sx) this.f666k.f66c).mo2338a();
        if (a40Var == null) {
            a40Var = new a40(i);
            a40Var.f39l = i;
        } else {
            a40Var.m13c();
            a40Var.f39l = i;
        }
        int i2 = this.f668m;
        int i3 = f654o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f654o = i4;
            this.f667l = (a40[]) Arrays.copyOf(this.f667l, i4);
        }
        a40[] a40VarArr = this.f667l;
        int i5 = this.f668m;
        this.f668m = i5 + 1;
        a40VarArr[i5] = a40Var;
        return a40Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m454b(a40 a40Var, a40 a40Var2, int i, float f, a40 a40Var3, a40 a40Var4, int i2, int i3) {
        C0586p6 c0586p6M463k = m463k();
        if (a40Var2 == a40Var3) {
            c0586p6M463k.f3673d.mo506i(a40Var, 1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var4, 1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var2, -2.0f);
        } else if (f == 0.5f) {
            c0586p6M463k.f3673d.mo506i(a40Var, 1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var2, -1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var3, -1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                c0586p6M463k.f3671b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0586p6M463k.f3673d.mo506i(a40Var, -1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var2, 1.0f);
            c0586p6M463k.f3671b = i;
        } else if (f >= 1.0f) {
            c0586p6M463k.f3673d.mo506i(a40Var4, -1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var3, 1.0f);
            c0586p6M463k.f3671b = -i2;
        } else {
            float f2 = 1.0f - f;
            c0586p6M463k.f3673d.mo506i(a40Var, f2 * 1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var2, f2 * (-1.0f));
            c0586p6M463k.f3673d.mo506i(a40Var3, (-1.0f) * f);
            c0586p6M463k.f3673d.mo506i(a40Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0586p6M463k.f3671b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0586p6M463k.m2037a(this, i3);
        }
        m455c(c0586p6M463k);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m455c(p000.C0586p6 r18) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0041ar.m455c(p6):void");
    }

    /* JADX INFO: renamed from: d */
    public final void m456d(a40 a40Var, int i) {
        int i2 = a40Var.f30c;
        if (i2 == -1) {
            a40Var.f32e = i;
            a40Var.f33f = true;
            int i3 = a40Var.f37j;
            for (int i4 = 0; i4 < i3; i4++) {
                a40Var.f36i[i4].m2043g(a40Var, false);
            }
            a40Var.f37j = 0;
            return;
        }
        if (i2 == -1) {
            C0586p6 c0586p6M463k = m463k();
            c0586p6M463k.f3670a = a40Var;
            float f = i;
            a40Var.f32e = f;
            c0586p6M463k.f3671b = f;
            c0586p6M463k.f3674e = true;
            m455c(c0586p6M463k);
            return;
        }
        C0586p6 c0586p6 = this.f660e[i2];
        if (c0586p6.f3674e) {
            c0586p6.f3671b = i;
            return;
        }
        if (c0586p6.f3673d.mo508k() == 0) {
            c0586p6.f3674e = true;
            c0586p6.f3671b = i;
            return;
        }
        C0586p6 c0586p6M463k2 = m463k();
        if (i < 0) {
            c0586p6M463k2.f3671b = i * (-1);
            c0586p6M463k2.f3673d.mo506i(a40Var, 1.0f);
        } else {
            c0586p6M463k2.f3671b = i;
            c0586p6M463k2.f3673d.mo506i(a40Var, -1.0f);
        }
        m455c(c0586p6M463k2);
    }

    /* JADX INFO: renamed from: e */
    public final void m457e(a40 a40Var, a40 a40Var2, int i, int i2) {
        boolean z = false;
        if (i2 == 8 && a40Var2.f33f && a40Var.f30c == -1) {
            a40Var.f32e = a40Var2.f32e + i;
            a40Var.f33f = true;
            int i3 = a40Var.f37j;
            for (int i4 = 0; i4 < i3; i4++) {
                a40Var.f36i[i4].m2043g(a40Var, false);
            }
            a40Var.f37j = 0;
            return;
        }
        C0586p6 c0586p6M463k = m463k();
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0586p6M463k.f3671b = i;
        }
        if (z) {
            c0586p6M463k.f3673d.mo506i(a40Var, 1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var2, -1.0f);
        } else {
            c0586p6M463k.f3673d.mo506i(a40Var, -1.0f);
            c0586p6M463k.f3673d.mo506i(a40Var2, 1.0f);
        }
        if (i2 != 8) {
            c0586p6M463k.m2037a(this, i2);
        }
        m455c(c0586p6M463k);
    }

    /* JADX INFO: renamed from: f */
    public final void m458f(a40 a40Var, a40 a40Var2, int i, int i2) {
        C0586p6 c0586p6M463k = m463k();
        a40 a40VarM464l = m464l();
        a40VarM464l.f31d = 0;
        c0586p6M463k.m2038b(a40Var, a40Var2, a40VarM464l, i);
        if (i2 != 8) {
            c0586p6M463k.f3673d.mo506i(m461i(i2), (int) (c0586p6M463k.f3673d.mo499b(a40VarM464l) * (-1.0f)));
        }
        m455c(c0586p6M463k);
    }

    /* JADX INFO: renamed from: g */
    public final void m459g(a40 a40Var, a40 a40Var2, int i, int i2) {
        C0586p6 c0586p6M463k = m463k();
        a40 a40VarM464l = m464l();
        a40VarM464l.f31d = 0;
        c0586p6M463k.m2039c(a40Var, a40Var2, a40VarM464l, i);
        if (i2 != 8) {
            c0586p6M463k.f3673d.mo506i(m461i(i2), (int) (c0586p6M463k.f3673d.mo499b(a40VarM464l) * (-1.0f)));
        }
        m455c(c0586p6M463k);
    }

    /* JADX INFO: renamed from: h */
    public final void m460h(C0586p6 c0586p6) {
        boolean z = f655p;
        C0009a8 c0009a8 = this.f666k;
        if (z) {
            C0586p6 c0586p62 = this.f660e[this.f664i];
            if (c0586p62 != null) {
                ((C0724sx) c0009a8.f64a).m2339b(c0586p62);
            }
        } else {
            C0586p6 c0586p63 = this.f660e[this.f664i];
            if (c0586p63 != null) {
                ((C0724sx) c0009a8.f65b).m2339b(c0586p63);
            }
        }
        C0586p6[] c0586p6Arr = this.f660e;
        int i = this.f664i;
        c0586p6Arr[i] = c0586p6;
        a40 a40Var = c0586p6.f3670a;
        a40Var.f30c = i;
        this.f664i = i + 1;
        a40Var.m14d(c0586p6);
    }

    /* JADX INFO: renamed from: i */
    public final a40 m461i(int i) {
        if (this.f663h + 1 >= this.f659d) {
            m465n();
        }
        a40 a40VarM453a = m453a(4);
        float[] fArr = a40VarM453a.f35h;
        int i2 = this.f656a + 1;
        this.f656a = i2;
        this.f663h++;
        a40VarM453a.f29b = i2;
        a40VarM453a.f31d = i;
        ((a40[]) this.f666k.f67d)[i2] = a40VarM453a;
        C0983zx c0983zx = this.f657b;
        c0983zx.f5629i.f5410a = a40VarM453a;
        Arrays.fill(fArr, 0.0f);
        fArr[a40VarM453a.f31d] = 1.0f;
        c0983zx.m2844i(a40VarM453a);
        return a40VarM453a;
    }

    /* JADX INFO: renamed from: j */
    public final a40 m462j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f663h + 1 >= this.f659d) {
            m465n();
        }
        if (!(obj instanceof C0099cc)) {
            return null;
        }
        C0099cc c0099cc = (C0099cc) obj;
        a40 a40Var = c0099cc.f950g;
        if (a40Var == null) {
            c0099cc.m667i();
            a40Var = c0099cc.f950g;
        }
        int i = a40Var.f29b;
        C0009a8 c0009a8 = this.f666k;
        if (i != -1 && i <= this.f656a && ((a40[]) c0009a8.f67d)[i] != null) {
            return a40Var;
        }
        if (i != -1) {
            a40Var.m13c();
        }
        int i2 = this.f656a + 1;
        this.f656a = i2;
        this.f663h++;
        a40Var.f29b = i2;
        a40Var.f39l = 1;
        ((a40[]) c0009a8.f67d)[i2] = a40Var;
        return a40Var;
    }

    /* JADX INFO: renamed from: k */
    public final C0586p6 m463k() {
        boolean z = f655p;
        C0009a8 c0009a8 = this.f666k;
        if (z) {
            C0586p6 c0586p6 = (C0586p6) ((C0724sx) c0009a8.f64a).mo2338a();
            if (c0586p6 == null) {
                return new C0976zq(c0009a8);
            }
            c0586p6.f3670a = null;
            c0586p6.f3673d.clear();
            c0586p6.f3671b = 0.0f;
            c0586p6.f3674e = false;
            return c0586p6;
        }
        C0586p6 c0586p62 = (C0586p6) ((C0724sx) c0009a8.f65b).mo2338a();
        if (c0586p62 == null) {
            return new C0586p6(c0009a8);
        }
        c0586p62.f3670a = null;
        c0586p62.f3673d.clear();
        c0586p62.f3671b = 0.0f;
        c0586p62.f3674e = false;
        return c0586p62;
    }

    /* JADX INFO: renamed from: l */
    public final a40 m464l() {
        if (this.f663h + 1 >= this.f659d) {
            m465n();
        }
        a40 a40VarM453a = m453a(3);
        int i = this.f656a + 1;
        this.f656a = i;
        this.f663h++;
        a40VarM453a.f29b = i;
        ((a40[]) this.f666k.f67d)[i] = a40VarM453a;
        return a40VarM453a;
    }

    /* JADX INFO: renamed from: n */
    public final void m465n() {
        int i = this.f658c * 2;
        this.f658c = i;
        this.f660e = (C0586p6[]) Arrays.copyOf(this.f660e, i);
        C0009a8 c0009a8 = this.f666k;
        c0009a8.f67d = (a40[]) Arrays.copyOf((a40[]) c0009a8.f67d, this.f658c);
        int i2 = this.f658c;
        this.f662g = new boolean[i2];
        this.f659d = i2;
        this.f665j = i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m466o(C0983zx c0983zx) {
        C0009a8 c0009a8;
        int i = 0;
        while (true) {
            if (i >= this.f664i) {
                break;
            }
            C0586p6 c0586p6 = this.f660e[i];
            int i2 = 1;
            if (c0586p6.f3670a.f39l != 1) {
                float f = 0.0f;
                if (c0586p6.f3671b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            int i8 = this.f664i;
                            c0009a8 = this.f666k;
                            if (i6 >= i8) {
                                break;
                            }
                            C0586p6 c0586p62 = this.f660e[i6];
                            if (c0586p62.f3670a.f39l != i2 && !c0586p62.f3674e && c0586p62.f3671b < f) {
                                int i9 = i2;
                                while (i9 < this.f663h) {
                                    a40 a40Var = ((a40[]) c0009a8.f67d)[i9];
                                    float fMo499b = c0586p62.f3673d.mo499b(a40Var);
                                    if (fMo499b > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = a40Var.f34g[i10] / fMo499b;
                                            if ((f3 < f2 && i10 == i7) || i10 > i7) {
                                                i7 = i10;
                                                f2 = f3;
                                                i4 = i6;
                                                i5 = i9;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0586p6 c0586p63 = this.f660e[i4];
                            c0586p63.f3670a.f30c = -1;
                            c0586p63.m2042f(((a40[]) c0009a8.f67d)[i5]);
                            a40 a40Var2 = c0586p63.f3670a;
                            a40Var2.f30c = i4;
                            a40Var2.m14d(c0586p63);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f663h / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m467p(c0983zx);
        for (int i11 = 0; i11 < this.f664i; i11++) {
            C0586p6 c0586p64 = this.f660e[i11];
            c0586p64.f3670a.f32e = c0586p64.f3671b;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m467p(C0586p6 c0586p6) {
        for (int i = 0; i < this.f663h; i++) {
            this.f662g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f663h * 2) {
                return;
            }
            a40 a40Var = c0586p6.f3670a;
            if (a40Var != null) {
                this.f662g[a40Var.f29b] = true;
            }
            a40 a40VarMo2040d = c0586p6.mo2040d(this.f662g);
            if (a40VarMo2040d != null) {
                boolean[] zArr = this.f662g;
                int i3 = a40VarMo2040d.f29b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (a40VarMo2040d != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f664i; i5++) {
                    C0586p6 c0586p62 = this.f660e[i5];
                    if (c0586p62.f3670a.f39l != 1 && !c0586p62.f3674e && c0586p62.f3673d.mo500c(a40VarMo2040d)) {
                        float fMo499b = c0586p62.f3673d.mo499b(a40VarMo2040d);
                        if (fMo499b < 0.0f) {
                            float f2 = (-c0586p62.f3671b) / fMo499b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0586p6 c0586p63 = this.f660e[i4];
                    c0586p63.f3670a.f30c = -1;
                    c0586p63.m2042f(a40VarMo2040d);
                    a40 a40Var2 = c0586p63.f3670a;
                    a40Var2.f30c = i4;
                    a40Var2.m14d(c0586p63);
                }
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m468q() {
        boolean z = f655p;
        C0009a8 c0009a8 = this.f666k;
        int i = 0;
        if (z) {
            while (true) {
                C0586p6[] c0586p6Arr = this.f660e;
                if (i >= c0586p6Arr.length) {
                    return;
                }
                C0586p6 c0586p6 = c0586p6Arr[i];
                if (c0586p6 != null) {
                    ((C0724sx) c0009a8.f64a).m2339b(c0586p6);
                }
                this.f660e[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0586p6[] c0586p6Arr2 = this.f660e;
                if (i >= c0586p6Arr2.length) {
                    return;
                }
                C0586p6 c0586p62 = c0586p6Arr2[i];
                if (c0586p62 != null) {
                    ((C0724sx) c0009a8.f65b).m2339b(c0586p62);
                }
                this.f660e[i] = null;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m469r() {
        C0009a8 c0009a8;
        int i = 0;
        while (true) {
            c0009a8 = this.f666k;
            a40[] a40VarArr = (a40[]) c0009a8.f67d;
            if (i >= a40VarArr.length) {
                break;
            }
            a40 a40Var = a40VarArr[i];
            if (a40Var != null) {
                a40Var.m13c();
            }
            i++;
        }
        C0724sx c0724sx = (C0724sx) c0009a8.f66c;
        a40[] a40VarArr2 = this.f667l;
        int length = this.f668m;
        c0724sx.getClass();
        if (length > a40VarArr2.length) {
            length = a40VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            a40 a40Var2 = a40VarArr2[i2];
            int i3 = c0724sx.f4469c;
            Object[] objArr = c0724sx.f4468b;
            if (i3 < objArr.length) {
                objArr[i3] = a40Var2;
                c0724sx.f4469c = i3 + 1;
            }
        }
        this.f668m = 0;
        Arrays.fill((a40[]) c0009a8.f67d, (Object) null);
        this.f656a = 0;
        C0983zx c0983zx = this.f657b;
        c0983zx.f5628h = 0;
        c0983zx.f3671b = 0.0f;
        this.f663h = 1;
        for (int i4 = 0; i4 < this.f664i; i4++) {
            this.f660e[i4].getClass();
        }
        m468q();
        this.f664i = 0;
        if (f655p) {
            this.f669n = new C0976zq(c0009a8);
        } else {
            this.f669n = new C0586p6(c0009a8);
        }
    }
}
