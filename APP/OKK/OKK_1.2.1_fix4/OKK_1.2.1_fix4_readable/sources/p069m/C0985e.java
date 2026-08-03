package p069m;

import java.util.ArrayList;
import java.util.Arrays;
import p004C.C0061b;
import p043Y.C0463v;
import p071n.C0998c;

/* JADX INFO: renamed from: m.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0985e {

    /* JADX INFO: renamed from: o */
    public static int f3484o = 1000;

    /* JADX INFO: renamed from: p */
    public static boolean f3485p = true;

    /* JADX INFO: renamed from: b */
    public final C0987g f3487b;

    /* JADX INFO: renamed from: e */
    public C0983c[] f3490e;

    /* JADX INFO: renamed from: k */
    public final C0463v f3496k;

    /* JADX INFO: renamed from: n */
    public C0983c f3499n;

    /* JADX INFO: renamed from: a */
    public int f3486a = 0;

    /* JADX INFO: renamed from: c */
    public int f3488c = 32;

    /* JADX INFO: renamed from: d */
    public int f3489d = 32;

    /* JADX INFO: renamed from: f */
    public boolean f3491f = false;

    /* JADX INFO: renamed from: g */
    public boolean[] f3492g = new boolean[32];

    /* JADX INFO: renamed from: h */
    public int f3493h = 1;

    /* JADX INFO: renamed from: i */
    public int f3494i = 0;

    /* JADX INFO: renamed from: j */
    public int f3495j = 32;

    /* JADX INFO: renamed from: l */
    public C0989i[] f3497l = new C0989i[f3484o];

    /* JADX INFO: renamed from: m */
    public int f3498m = 0;

    public C0985e() {
        this.f3490e = null;
        this.f3490e = new C0983c[32];
        m2368q();
        C0463v c0463v = new C0463v();
        c0463v.f1044a = new C0061b();
        c0463v.f1045b = new C0061b();
        c0463v.f1046c = new C0061b();
        c0463v.f1047d = new C0989i[32];
        this.f3496k = c0463v;
        C0987g c0987g = new C0987g(c0463v);
        c0987g.f3502f = new C0989i[128];
        c0987g.f3503g = new C0989i[128];
        c0987g.f3504h = 0;
        c0987g.f3505i = new C0986f(c0987g);
        this.f3487b = c0987g;
        if (f3485p) {
            this.f3499n = new C0984d(c0463v);
        } else {
            this.f3499n = new C0983c(c0463v);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m2352m(Object obj) {
        C0989i c0989i = ((C0998c) obj).f3583g;
        if (c0989i != null) {
            return (int) (c0989i.f3510e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final C0989i m2353a(int i2) {
        C0989i c0989i = (C0989i) ((C0061b) this.f3496k.f1046c).mo198a();
        if (c0989i == null) {
            c0989i = new C0989i(i2);
            c0989i.f3517l = i2;
        } else {
            c0989i.m2375c();
            c0989i.f3517l = i2;
        }
        int i3 = this.f3498m;
        int i4 = f3484o;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f3484o = i5;
            this.f3497l = (C0989i[]) Arrays.copyOf(this.f3497l, i5);
        }
        C0989i[] c0989iArr = this.f3497l;
        int i6 = this.f3498m;
        this.f3498m = i6 + 1;
        c0989iArr[i6] = c0989i;
        return c0989i;
    }

    /* JADX INFO: renamed from: b */
    public final void m2354b(C0989i c0989i, C0989i c0989i2, int i2, float f2, C0989i c0989i3, C0989i c0989i4, int i3, int i4) {
        C0983c c0983cM2363k = m2363k();
        if (c0989i2 == c0989i3) {
            c0983cM2363k.f3482d.mo2335c(c0989i, 1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i4, 1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i2, -2.0f);
        } else if (f2 == 0.5f) {
            c0983cM2363k.f3482d.mo2335c(c0989i, 1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i2, -1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i3, -1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                c0983cM2363k.f3480b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            c0983cM2363k.f3482d.mo2335c(c0989i, -1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i2, 1.0f);
            c0983cM2363k.f3480b = i2;
        } else if (f2 >= 1.0f) {
            c0983cM2363k.f3482d.mo2335c(c0989i4, -1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i3, 1.0f);
            c0983cM2363k.f3480b = -i3;
        } else {
            float f3 = 1.0f - f2;
            c0983cM2363k.f3482d.mo2335c(c0989i, f3 * 1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i2, f3 * (-1.0f));
            c0983cM2363k.f3482d.mo2335c(c0989i3, (-1.0f) * f2);
            c0983cM2363k.f3482d.mo2335c(c0989i4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                c0983cM2363k.f3480b = (i3 * f2) + ((-i2) * f3);
            }
        }
        if (i4 != 8) {
            c0983cM2363k.m2344a(this, i4);
        }
        m2355c(c0983cM2363k);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00de  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2355c(C0983c c0983c) {
        boolean z2;
        boolean z3;
        C0989i c0989iM2348e;
        ArrayList<C0989i> arrayList;
        if (this.f3494i + 1 >= this.f3495j || this.f3493h + 1 >= this.f3489d) {
            m2365n();
        }
        if (c0983c.f3483e) {
            z2 = false;
        } else {
            if (this.f3490e.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iMo2343k = c0983c.f3482d.mo2343k();
                    int i2 = 0;
                    while (true) {
                        arrayList = c0983c.f3481c;
                        if (i2 >= iMo2343k) {
                            break;
                        }
                        C0989i c0989iMo2336d = c0983c.f3482d.mo2336d(i2);
                        if (c0989iMo2336d.f3508c != -1 || c0989iMo2336d.f3511f) {
                            arrayList.add(c0989iMo2336d);
                        }
                        i2++;
                    }
                    if (arrayList.size() > 0) {
                        for (C0989i c0989i : arrayList) {
                            if (c0989i.f3511f) {
                                c0983c.m2350g(c0989i, true);
                            } else {
                                c0983c.mo2351h(this.f3490e[c0989i.f3508c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
            }
            if (c0983c.f3479a == null && c0983c.f3480b == 0.0f && c0983c.f3482d.mo2343k() == 0) {
                return;
            }
            float f2 = c0983c.f3480b;
            if (f2 < 0.0f) {
                c0983c.f3480b = f2 * (-1.0f);
                c0983c.f3482d.mo2342j();
            }
            int iMo2343k2 = c0983c.f3482d.mo2343k();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C0989i c0989i2 = null;
            C0989i c0989i3 = null;
            boolean z5 = false;
            boolean z6 = false;
            for (int i3 = 0; i3 < iMo2343k2; i3++) {
                float fMo2333a = c0983c.f3482d.mo2333a(i3);
                C0989i c0989iMo2336d2 = c0983c.f3482d.mo2336d(i3);
                if (c0989iMo2336d2.f3517l == 1) {
                    if (c0989i2 == null) {
                        z5 = c0989iMo2336d2.f3516k <= 1;
                    } else if (f3 > fMo2333a) {
                        if (c0989iMo2336d2.f3516k <= 1) {
                        }
                    } else if (z5 || c0989iMo2336d2.f3516k > 1) {
                    }
                    c0989i2 = c0989iMo2336d2;
                    f3 = fMo2333a;
                } else if (c0989i2 == null && fMo2333a < 0.0f) {
                    if (c0989i3 == null) {
                        z6 = c0989iMo2336d2.f3516k <= 1;
                    } else if (f4 > fMo2333a) {
                        if (c0989iMo2336d2.f3516k <= 1) {
                        }
                    } else if (z6 || c0989iMo2336d2.f3516k > 1) {
                    }
                    c0989i3 = c0989iMo2336d2;
                    f4 = fMo2333a;
                }
            }
            if (c0989i2 == null) {
                c0989i2 = c0989i3;
            }
            if (c0989i2 == null) {
                z3 = true;
            } else {
                c0983c.m2349f(c0989i2);
                z3 = false;
            }
            if (c0983c.f3482d.mo2343k() == 0) {
                c0983c.f3483e = true;
            }
            if (z3) {
                if (this.f3493h + 1 >= this.f3489d) {
                    m2365n();
                }
                C0989i c0989iM2353a = m2353a(3);
                int i4 = this.f3486a + 1;
                this.f3486a = i4;
                this.f3493h++;
                c0989iM2353a.f3507b = i4;
                ((C0989i[]) this.f3496k.f1047d)[i4] = c0989iM2353a;
                c0983c.f3479a = c0989iM2353a;
                m2360h(c0983c);
                C0983c c0983c2 = this.f3499n;
                c0983c2.getClass();
                c0983c2.f3479a = null;
                c0983c2.f3482d.clear();
                for (int i5 = 0; i5 < c0983c.f3482d.mo2343k(); i5++) {
                    c0983c2.f3482d.mo2338f(c0983c.f3482d.mo2336d(i5), c0983c.f3482d.mo2333a(i5), true);
                }
                m2367p(this.f3499n);
                if (c0989iM2353a.f3508c == -1) {
                    if (c0983c.f3479a == c0989iM2353a && (c0989iM2348e = c0983c.m2348e(null, c0989iM2353a)) != null) {
                        c0983c.m2349f(c0989iM2348e);
                    }
                    if (!c0983c.f3483e) {
                        c0983c.f3479a.m2376d(c0983c);
                    }
                    this.f3494i--;
                }
                z2 = true;
            } else {
                z2 = false;
            }
            C0989i c0989i4 = c0983c.f3479a;
            if (c0989i4 == null) {
                return;
            }
            if (c0989i4.f3517l != 1 && c0983c.f3480b < 0.0f) {
                return;
            }
        }
        if (z2) {
            return;
        }
        m2360h(c0983c);
    }

    /* JADX INFO: renamed from: d */
    public final void m2356d(C0989i c0989i, int i2) {
        int i3 = c0989i.f3508c;
        if (i3 == -1) {
            c0989i.f3510e = i2;
            c0989i.f3511f = true;
            int i4 = c0989i.f3515j;
            for (int i5 = 0; i5 < i4; i5++) {
                c0989i.f3514i[i5].m2350g(c0989i, false);
            }
            c0989i.f3515j = 0;
            return;
        }
        if (i3 == -1) {
            C0983c c0983cM2363k = m2363k();
            c0983cM2363k.f3479a = c0989i;
            float f2 = i2;
            c0989i.f3510e = f2;
            c0983cM2363k.f3480b = f2;
            c0983cM2363k.f3483e = true;
            m2355c(c0983cM2363k);
            return;
        }
        C0983c c0983c = this.f3490e[i3];
        if (c0983c.f3483e) {
            c0983c.f3480b = i2;
            return;
        }
        if (c0983c.f3482d.mo2343k() == 0) {
            c0983c.f3483e = true;
            c0983c.f3480b = i2;
            return;
        }
        C0983c c0983cM2363k2 = m2363k();
        if (i2 < 0) {
            c0983cM2363k2.f3480b = i2 * (-1);
            c0983cM2363k2.f3482d.mo2335c(c0989i, 1.0f);
        } else {
            c0983cM2363k2.f3480b = i2;
            c0983cM2363k2.f3482d.mo2335c(c0989i, -1.0f);
        }
        m2355c(c0983cM2363k2);
    }

    /* JADX INFO: renamed from: e */
    public final void m2357e(C0989i c0989i, C0989i c0989i2, int i2, int i3) {
        boolean z2 = false;
        if (i3 == 8 && c0989i2.f3511f && c0989i.f3508c == -1) {
            c0989i.f3510e = c0989i2.f3510e + i2;
            c0989i.f3511f = true;
            int i4 = c0989i.f3515j;
            for (int i5 = 0; i5 < i4; i5++) {
                c0989i.f3514i[i5].m2350g(c0989i, false);
            }
            c0989i.f3515j = 0;
            return;
        }
        C0983c c0983cM2363k = m2363k();
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            c0983cM2363k.f3480b = i2;
        }
        if (z2) {
            c0983cM2363k.f3482d.mo2335c(c0989i, 1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i2, -1.0f);
        } else {
            c0983cM2363k.f3482d.mo2335c(c0989i, -1.0f);
            c0983cM2363k.f3482d.mo2335c(c0989i2, 1.0f);
        }
        if (i3 != 8) {
            c0983cM2363k.m2344a(this, i3);
        }
        m2355c(c0983cM2363k);
    }

    /* JADX INFO: renamed from: f */
    public final void m2358f(C0989i c0989i, C0989i c0989i2, int i2, int i3) {
        C0983c c0983cM2363k = m2363k();
        C0989i c0989iM2364l = m2364l();
        c0989iM2364l.f3509d = 0;
        c0983cM2363k.m2345b(c0989i, c0989i2, c0989iM2364l, i2);
        if (i3 != 8) {
            c0983cM2363k.f3482d.mo2335c(m2361i(i3), (int) (c0983cM2363k.f3482d.mo2339g(c0989iM2364l) * (-1.0f)));
        }
        m2355c(c0983cM2363k);
    }

    /* JADX INFO: renamed from: g */
    public final void m2359g(C0989i c0989i, C0989i c0989i2, int i2, int i3) {
        C0983c c0983cM2363k = m2363k();
        C0989i c0989iM2364l = m2364l();
        c0989iM2364l.f3509d = 0;
        c0983cM2363k.m2346c(c0989i, c0989i2, c0989iM2364l, i2);
        if (i3 != 8) {
            c0983cM2363k.f3482d.mo2335c(m2361i(i3), (int) (c0983cM2363k.f3482d.mo2339g(c0989iM2364l) * (-1.0f)));
        }
        m2355c(c0983cM2363k);
    }

    /* JADX INFO: renamed from: h */
    public final void m2360h(C0983c c0983c) {
        boolean z2 = f3485p;
        C0463v c0463v = this.f3496k;
        if (z2) {
            C0983c c0983c2 = this.f3490e[this.f3494i];
            if (c0983c2 != null) {
                ((C0061b) c0463v.f1044a).m199b(c0983c2);
            }
        } else {
            C0983c c0983c3 = this.f3490e[this.f3494i];
            if (c0983c3 != null) {
                ((C0061b) c0463v.f1045b).m199b(c0983c3);
            }
        }
        C0983c[] c0983cArr = this.f3490e;
        int i2 = this.f3494i;
        c0983cArr[i2] = c0983c;
        C0989i c0989i = c0983c.f3479a;
        c0989i.f3508c = i2;
        this.f3494i = i2 + 1;
        c0989i.m2376d(c0983c);
    }

    /* JADX INFO: renamed from: i */
    public final C0989i m2361i(int i2) {
        if (this.f3493h + 1 >= this.f3489d) {
            m2365n();
        }
        C0989i c0989iM2353a = m2353a(4);
        int i3 = this.f3486a + 1;
        this.f3486a = i3;
        this.f3493h++;
        c0989iM2353a.f3507b = i3;
        c0989iM2353a.f3509d = i2;
        ((C0989i[]) this.f3496k.f1047d)[i3] = c0989iM2353a;
        C0987g c0987g = this.f3487b;
        c0987g.f3505i.f3500a = c0989iM2353a;
        float[] fArr = c0989iM2353a.f3513h;
        Arrays.fill(fArr, 0.0f);
        fArr[c0989iM2353a.f3509d] = 1.0f;
        c0987g.m2370i(c0989iM2353a);
        return c0989iM2353a;
    }

    /* JADX INFO: renamed from: j */
    public final C0989i m2362j(Object obj) {
        C0989i c0989i = null;
        if (obj == null) {
            return null;
        }
        if (this.f3493h + 1 >= this.f3489d) {
            m2365n();
        }
        if (obj instanceof C0998c) {
            C0998c c0998c = (C0998c) obj;
            c0989i = c0998c.f3583g;
            if (c0989i == null) {
                c0998c.m2396i();
                c0989i = c0998c.f3583g;
            }
            int i2 = c0989i.f3507b;
            C0463v c0463v = this.f3496k;
            if (i2 == -1 || i2 > this.f3486a || ((C0989i[]) c0463v.f1047d)[i2] == null) {
                if (i2 != -1) {
                    c0989i.m2375c();
                }
                int i3 = this.f3486a + 1;
                this.f3486a = i3;
                this.f3493h++;
                c0989i.f3507b = i3;
                c0989i.f3517l = 1;
                ((C0989i[]) c0463v.f1047d)[i3] = c0989i;
            }
        }
        return c0989i;
    }

    /* JADX INFO: renamed from: k */
    public final C0983c m2363k() {
        boolean z2 = f3485p;
        C0463v c0463v = this.f3496k;
        if (z2) {
            C0983c c0983c = (C0983c) ((C0061b) c0463v.f1044a).mo198a();
            if (c0983c == null) {
                return new C0984d(c0463v);
            }
            c0983c.f3479a = null;
            c0983c.f3482d.clear();
            c0983c.f3480b = 0.0f;
            c0983c.f3483e = false;
            return c0983c;
        }
        C0983c c0983c2 = (C0983c) ((C0061b) c0463v.f1045b).mo198a();
        if (c0983c2 == null) {
            return new C0983c(c0463v);
        }
        c0983c2.f3479a = null;
        c0983c2.f3482d.clear();
        c0983c2.f3480b = 0.0f;
        c0983c2.f3483e = false;
        return c0983c2;
    }

    /* JADX INFO: renamed from: l */
    public final C0989i m2364l() {
        if (this.f3493h + 1 >= this.f3489d) {
            m2365n();
        }
        C0989i c0989iM2353a = m2353a(3);
        int i2 = this.f3486a + 1;
        this.f3486a = i2;
        this.f3493h++;
        c0989iM2353a.f3507b = i2;
        ((C0989i[]) this.f3496k.f1047d)[i2] = c0989iM2353a;
        return c0989iM2353a;
    }

    /* JADX INFO: renamed from: n */
    public final void m2365n() {
        int i2 = this.f3488c * 2;
        this.f3488c = i2;
        this.f3490e = (C0983c[]) Arrays.copyOf(this.f3490e, i2);
        C0463v c0463v = this.f3496k;
        c0463v.f1047d = (C0989i[]) Arrays.copyOf((C0989i[]) c0463v.f1047d, this.f3488c);
        int i3 = this.f3488c;
        this.f3492g = new boolean[i3];
        this.f3489d = i3;
        this.f3495j = i3;
    }

    /* JADX INFO: renamed from: o */
    public final void m2366o(C0987g c0987g) {
        C0463v c0463v;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f3494i) {
                break;
            }
            C0983c c0983c = this.f3490e[i2];
            int i3 = 1;
            if (c0983c.f3479a.f3517l != 1) {
                float f2 = 0.0f;
                if (c0983c.f3480b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4 += i3;
                        float f3 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (true) {
                            int i9 = this.f3494i;
                            c0463v = this.f3496k;
                            if (i7 >= i9) {
                                break;
                            }
                            C0983c c0983c2 = this.f3490e[i7];
                            if (c0983c2.f3479a.f3517l != i3 && !c0983c2.f3483e && c0983c2.f3480b < f2) {
                                int i10 = i3;
                                while (i10 < this.f3493h) {
                                    C0989i c0989i = ((C0989i[]) c0463v.f1047d)[i10];
                                    float fMo2339g = c0983c2.f3482d.mo2339g(c0989i);
                                    if (fMo2339g > f2) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f4 = c0989i.f3512g[i11] / fMo2339g;
                                            if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                                i8 = i11;
                                                f3 = f4;
                                                i5 = i7;
                                                i6 = i10;
                                            }
                                        }
                                    }
                                    i10++;
                                    f2 = 0.0f;
                                }
                            }
                            i7++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            C0983c c0983c3 = this.f3490e[i5];
                            c0983c3.f3479a.f3508c = -1;
                            c0983c3.m2349f(((C0989i[]) c0463v.f1047d)[i6]);
                            C0989i c0989i2 = c0983c3.f3479a;
                            c0989i2.f3508c = i5;
                            c0989i2.m2376d(c0983c3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f3493h / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        m2367p(c0987g);
        for (int i12 = 0; i12 < this.f3494i; i12++) {
            C0983c c0983c4 = this.f3490e[i12];
            c0983c4.f3479a.f3510e = c0983c4.f3480b;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2367p(C0983c c0983c) {
        for (int i2 = 0; i2 < this.f3493h; i2++) {
            this.f3492g[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f3493h * 2) {
                return;
            }
            C0989i c0989i = c0983c.f3479a;
            if (c0989i != null) {
                this.f3492g[c0989i.f3507b] = true;
            }
            C0989i c0989iMo2347d = c0983c.mo2347d(this.f3492g);
            if (c0989iMo2347d != null) {
                boolean[] zArr = this.f3492g;
                int i4 = c0989iMo2347d.f3507b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (c0989iMo2347d != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f3494i; i6++) {
                    C0983c c0983c2 = this.f3490e[i6];
                    if (c0983c2.f3479a.f3517l != 1 && !c0983c2.f3483e && c0983c2.f3482d.mo2334b(c0989iMo2347d)) {
                        float fMo2339g = c0983c2.f3482d.mo2339g(c0989iMo2347d);
                        if (fMo2339g < 0.0f) {
                            float f3 = (-c0983c2.f3480b) / fMo2339g;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    C0983c c0983c3 = this.f3490e[i5];
                    c0983c3.f3479a.f3508c = -1;
                    c0983c3.m2349f(c0989iMo2347d);
                    C0989i c0989i2 = c0983c3.f3479a;
                    c0989i2.f3508c = i5;
                    c0989i2.m2376d(c0983c3);
                }
            } else {
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2368q() {
        boolean z2 = f3485p;
        C0463v c0463v = this.f3496k;
        int i2 = 0;
        if (z2) {
            while (true) {
                C0983c[] c0983cArr = this.f3490e;
                if (i2 >= c0983cArr.length) {
                    return;
                }
                C0983c c0983c = c0983cArr[i2];
                if (c0983c != null) {
                    ((C0061b) c0463v.f1044a).m199b(c0983c);
                }
                this.f3490e[i2] = null;
                i2++;
            }
        } else {
            while (true) {
                C0983c[] c0983cArr2 = this.f3490e;
                if (i2 >= c0983cArr2.length) {
                    return;
                }
                C0983c c0983c2 = c0983cArr2[i2];
                if (c0983c2 != null) {
                    ((C0061b) c0463v.f1045b).m199b(c0983c2);
                }
                this.f3490e[i2] = null;
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2369r() {
        C0463v c0463v;
        int i2 = 0;
        while (true) {
            c0463v = this.f3496k;
            C0989i[] c0989iArr = (C0989i[]) c0463v.f1047d;
            if (i2 >= c0989iArr.length) {
                break;
            }
            C0989i c0989i = c0989iArr[i2];
            if (c0989i != null) {
                c0989i.m2375c();
            }
            i2++;
        }
        C0061b c0061b = (C0061b) c0463v.f1046c;
        C0989i[] c0989iArr2 = this.f3497l;
        int length = this.f3498m;
        c0061b.getClass();
        if (length > c0989iArr2.length) {
            length = c0989iArr2.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            C0989i c0989i2 = c0989iArr2[i3];
            int i4 = c0061b.f207c;
            Object[] objArr = c0061b.f206b;
            if (i4 < objArr.length) {
                objArr[i4] = c0989i2;
                c0061b.f207c = i4 + 1;
            }
        }
        this.f3498m = 0;
        Arrays.fill((C0989i[]) c0463v.f1047d, (Object) null);
        this.f3486a = 0;
        C0987g c0987g = this.f3487b;
        c0987g.f3504h = 0;
        c0987g.f3480b = 0.0f;
        this.f3493h = 1;
        for (int i5 = 0; i5 < this.f3494i; i5++) {
            this.f3490e[i5].getClass();
        }
        m2368q();
        this.f3494i = 0;
        if (f3485p) {
            this.f3499n = new C0984d(c0463v);
        } else {
            this.f3499n = new C0983c(c0463v);
        }
    }
}
