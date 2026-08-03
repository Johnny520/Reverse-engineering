package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: mo */
/* JADX INFO: loaded from: classes.dex */
public final class C2244mo {

    /* JADX INFO: renamed from: q */
    public static boolean f7925q = false;

    /* JADX INFO: renamed from: d */
    public final C2731xu f7929d;

    /* JADX INFO: renamed from: m */
    public final C2656w4 f7938m;

    /* JADX INFO: renamed from: p */
    public C0564N4 f7941p;

    /* JADX INFO: renamed from: a */
    public int f7926a = 1000;

    /* JADX INFO: renamed from: b */
    public boolean f7927b = false;

    /* JADX INFO: renamed from: c */
    public int f7928c = 0;

    /* JADX INFO: renamed from: e */
    public int f7930e = 32;

    /* JADX INFO: renamed from: f */
    public int f7931f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f7933h = false;

    /* JADX INFO: renamed from: i */
    public boolean[] f7934i = new boolean[32];

    /* JADX INFO: renamed from: j */
    public int f7935j = 1;

    /* JADX INFO: renamed from: k */
    public int f7936k = 0;

    /* JADX INFO: renamed from: l */
    public int f7937l = 32;

    /* JADX INFO: renamed from: n */
    public C0256Fy[] f7939n = new C0256Fy[1000];

    /* JADX INFO: renamed from: o */
    public int f7940o = 0;

    /* JADX INFO: renamed from: g */
    public C0564N4[] f7932g = new C0564N4[32];

    public C2244mo() {
        m4579s();
        C2656w4 c2656w4 = new C2656w4(7);
        c2656w4.f9196b = new C1067Yt();
        c2656w4.f9197c = new C1067Yt();
        c2656w4.f9198d = new C0256Fy[32];
        this.f7938m = c2656w4;
        C2731xu c2731xu = new C2731xu(c2656w4);
        c2731xu.f9331f = new C0256Fy[128];
        c2731xu.f9332g = new C0256Fy[128];
        c2731xu.f9333h = 0;
        c2731xu.f9334i = new C0649P3(27, c2731xu);
        this.f7929d = c2731xu;
        this.f7941p = new C0564N4(c2656w4);
    }

    /* JADX INFO: renamed from: n */
    public static int m4561n(Object obj) {
        C0256Fy c0256Fy = ((C1259cb) obj).f4273i;
        if (c0256Fy != null) {
            return (int) (c0256Fy.f833e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final C0256Fy m4562a(int i) {
        C1067Yt c1067Yt = (C1067Yt) this.f7938m.f9197c;
        int i2 = c1067Yt.f3379b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c1067Yt.f3378a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            c1067Yt.f3379b = i3;
            obj = obj2;
        }
        C0256Fy c0256Fy = (C0256Fy) obj;
        if (c0256Fy == null) {
            c0256Fy = new C0256Fy(i);
            c0256Fy.f840l = i;
        } else {
            c0256Fy.m535c();
            c0256Fy.f840l = i;
        }
        int i4 = this.f7940o;
        int i5 = this.f7926a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f7926a = i6;
            this.f7939n = (C0256Fy[]) Arrays.copyOf(this.f7939n, i6);
        }
        C0256Fy[] c0256FyArr = this.f7939n;
        int i7 = this.f7940o;
        this.f7940o = i7 + 1;
        c0256FyArr[i7] = c0256Fy;
        return c0256Fy;
    }

    /* JADX INFO: renamed from: b */
    public final void m4563b(C0256Fy c0256Fy, C0256Fy c0256Fy2, int i, float f, C0256Fy c0256Fy3, C0256Fy c0256Fy4, int i2, int i3) {
        C0564N4 c0564n4M4573l = m4573l();
        if (c0256Fy2 == c0256Fy3) {
            c0564n4M4573l.f1845d.m367g(c0256Fy, 1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy4, 1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy2, -2.0f);
        } else if (f == 0.5f) {
            c0564n4M4573l.f1845d.m367g(c0256Fy, 1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy2, -1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy3, -1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy4, 1.0f);
            if (i > 0 || i2 > 0) {
                c0564n4M4573l.f1843b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0564n4M4573l.f1845d.m367g(c0256Fy, -1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy2, 1.0f);
            c0564n4M4573l.f1843b = i;
        } else if (f >= 1.0f) {
            c0564n4M4573l.f1845d.m367g(c0256Fy4, -1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy3, 1.0f);
            c0564n4M4573l.f1843b = -i2;
        } else {
            float f2 = 1.0f - f;
            c0564n4M4573l.f1845d.m367g(c0256Fy, f2 * 1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy2, f2 * (-1.0f));
            c0564n4M4573l.f1845d.m367g(c0256Fy3, (-1.0f) * f);
            c0564n4M4573l.f1845d.m367g(c0256Fy4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0564n4M4573l.f1843b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0564n4M4573l.m1103a(this, i3);
        }
        m4564c(c0564n4M4573l);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4564c(C0564N4 c0564n4) {
        boolean z;
        boolean z2;
        C0256Fy c0256Fy;
        C0256Fy c0256FyM1108f;
        if (this.f7936k + 1 >= this.f7937l || this.f7935j + 1 >= this.f7931f) {
            m4575o();
        }
        if (c0564n4.f1846e) {
            z = false;
        } else {
            ArrayList arrayList = c0564n4.f1844c;
            if (this.f7932g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iM364d = c0564n4.f1845d.m364d();
                    for (int i = 0; i < iM364d; i++) {
                        C0256Fy c0256FyM365e = c0564n4.f1845d.m365e(i);
                        if (c0256FyM365e.f831c != -1 || c0256FyM365e.f834f) {
                            arrayList.add(c0256FyM365e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C0256Fy c0256Fy2 = (C0256Fy) arrayList.get(i2);
                            if (c0256Fy2.f834f) {
                                c0564n4.m1110h(this, c0256Fy2, true);
                            } else {
                                c0564n4.mo1111i(this, this.f7932g[c0256Fy2.f831c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c0564n4.f1842a != null && c0564n4.f1845d.m364d() == 0) {
                    c0564n4.f1846e = true;
                    this.f7927b = true;
                }
            }
            if (c0564n4.mo1107e()) {
                return;
            }
            float f = c0564n4.f1843b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c0564n4.f1843b = f * (-1.0f);
                C0177E4 c0177e4 = c0564n4.f1845d;
                int i3 = c0177e4.f517h;
                for (int i4 = 0; i3 != -1 && i4 < c0177e4.f510a; i4++) {
                    float[] fArr = c0177e4.f516g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0177e4.f515f[i3];
                }
            }
            int iM364d2 = c0564n4.f1845d.m364d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C0256Fy c0256Fy3 = null;
            C0256Fy c0256Fy4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iM364d2) {
                float fM366f = c0564n4.f1845d.m366f(i5);
                C0256Fy c0256FyM365e2 = c0564n4.f1845d.m365e(i5);
                float f5 = f2;
                if (c0256FyM365e2.f840l == 1) {
                    if (c0256Fy3 == null) {
                        z4 = c0256FyM365e2.f839k <= 1;
                    } else if (f3 > fM366f) {
                        if (c0256FyM365e2.f839k <= 1) {
                        }
                    } else if (z4 || c0256FyM365e2.f839k > 1) {
                    }
                    c0256Fy3 = c0256FyM365e2;
                    f3 = fM366f;
                } else if (c0256Fy3 == null && fM366f < f5) {
                    if (c0256Fy4 == null) {
                        z5 = c0256FyM365e2.f839k <= 1;
                    } else if (f4 > fM366f) {
                        if (c0256FyM365e2.f839k <= 1) {
                        }
                    } else if (z5 || c0256FyM365e2.f839k > 1) {
                    }
                    c0256Fy4 = c0256FyM365e2;
                    f4 = fM366f;
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (c0256Fy3 == null) {
                c0256Fy3 = c0256Fy4;
            }
            if (c0256Fy3 == null) {
                z2 = true;
            } else {
                c0564n4.m1109g(c0256Fy3);
                z2 = false;
            }
            if (c0564n4.f1845d.m364d() == 0) {
                c0564n4.f1846e = true;
            }
            if (z2) {
                if (this.f7935j + 1 >= this.f7931f) {
                    m4575o();
                }
                C0256Fy c0256FyM4562a = m4562a(3);
                int i6 = this.f7928c + 1;
                this.f7928c = i6;
                this.f7935j++;
                c0256FyM4562a.f830b = i6;
                C2656w4 c2656w4 = this.f7938m;
                ((C0256Fy[]) c2656w4.f9198d)[i6] = c0256FyM4562a;
                c0564n4.f1842a = c0256FyM4562a;
                int i7 = this.f7936k;
                m4569h(c0564n4);
                if (this.f7936k == i7 + 1) {
                    C0564N4 c0564n42 = this.f7941p;
                    c0564n42.f1842a = null;
                    c0564n42.f1845d.m362b();
                    for (int i8 = 0; i8 < c0564n4.f1845d.m364d(); i8++) {
                        c0564n42.f1845d.m361a(c0564n4.f1845d.m365e(i8), c0564n4.f1845d.m366f(i8), true);
                    }
                    m4578r(this.f7941p);
                    if (c0256FyM4562a.f831c == -1) {
                        if (c0564n4.f1842a == c0256FyM4562a && (c0256FyM1108f = c0564n4.m1108f(null, c0256FyM4562a)) != null) {
                            c0564n4.m1109g(c0256FyM1108f);
                        }
                        if (!c0564n4.f1846e) {
                            c0564n4.f1842a.m537e(this, c0564n4);
                        }
                        ((C1067Yt) c2656w4.f9196b).m2003b(c0564n4);
                        this.f7936k--;
                    }
                    z = true;
                }
                c0256Fy = c0564n4.f1842a;
                if (c0256Fy != null) {
                }
            } else {
                z = false;
                c0256Fy = c0564n4.f1842a;
                if (c0256Fy != null) {
                    return;
                }
                if (c0256Fy.f840l != 1 && c0564n4.f1843b < f6) {
                    return;
                }
            }
        }
        if (z) {
            return;
        }
        m4569h(c0564n4);
    }

    /* JADX INFO: renamed from: d */
    public final void m4565d(C0256Fy c0256Fy, int i) {
        int i2 = c0256Fy.f831c;
        if (i2 == -1) {
            c0256Fy.m536d(this, i);
            for (int i3 = 0; i3 < this.f7928c + 1; i3++) {
                C0256Fy c0256Fy2 = ((C0256Fy[]) this.f7938m.f9198d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0564N4 c0564n4M4573l = m4573l();
            c0564n4M4573l.f1842a = c0256Fy;
            float f = i;
            c0256Fy.f833e = f;
            c0564n4M4573l.f1843b = f;
            c0564n4M4573l.f1846e = true;
            m4564c(c0564n4M4573l);
            return;
        }
        C0564N4 c0564n4 = this.f7932g[i2];
        if (c0564n4.f1846e) {
            c0564n4.f1843b = i;
            return;
        }
        if (c0564n4.f1845d.m364d() == 0) {
            c0564n4.f1846e = true;
            c0564n4.f1843b = i;
            return;
        }
        C0564N4 c0564n4M4573l2 = m4573l();
        if (i < 0) {
            c0564n4M4573l2.f1843b = i * (-1);
            c0564n4M4573l2.f1845d.m367g(c0256Fy, 1.0f);
        } else {
            c0564n4M4573l2.f1843b = i;
            c0564n4M4573l2.f1845d.m367g(c0256Fy, -1.0f);
        }
        m4564c(c0564n4M4573l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m4566e(C0256Fy c0256Fy, C0256Fy c0256Fy2, int i, int i2) {
        if (i2 == 8 && c0256Fy2.f834f && c0256Fy.f831c == -1) {
            c0256Fy.m536d(this, c0256Fy2.f833e + i);
            return;
        }
        C0564N4 c0564n4M4573l = m4573l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0564n4M4573l.f1843b = i;
        }
        if (z) {
            c0564n4M4573l.f1845d.m367g(c0256Fy, 1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy2, -1.0f);
        } else {
            c0564n4M4573l.f1845d.m367g(c0256Fy, -1.0f);
            c0564n4M4573l.f1845d.m367g(c0256Fy2, 1.0f);
        }
        if (i2 != 8) {
            c0564n4M4573l.m1103a(this, i2);
        }
        m4564c(c0564n4M4573l);
    }

    /* JADX INFO: renamed from: f */
    public final void m4567f(C0256Fy c0256Fy, C0256Fy c0256Fy2, int i, int i2) {
        C0564N4 c0564n4M4573l = m4573l();
        C0256Fy c0256FyM4574m = m4574m();
        c0256FyM4574m.f832d = 0;
        c0564n4M4573l.m1104b(c0256Fy, c0256Fy2, c0256FyM4574m, i);
        if (i2 != 8) {
            c0564n4M4573l.f1845d.m367g(m4571j(i2), (int) (c0564n4M4573l.f1845d.m363c(c0256FyM4574m) * (-1.0f)));
        }
        m4564c(c0564n4M4573l);
    }

    /* JADX INFO: renamed from: g */
    public final void m4568g(C0256Fy c0256Fy, C0256Fy c0256Fy2, int i, int i2) {
        C0564N4 c0564n4M4573l = m4573l();
        C0256Fy c0256FyM4574m = m4574m();
        c0256FyM4574m.f832d = 0;
        c0564n4M4573l.m1105c(c0256Fy, c0256Fy2, c0256FyM4574m, i);
        if (i2 != 8) {
            c0564n4M4573l.f1845d.m367g(m4571j(i2), (int) (c0564n4M4573l.f1845d.m363c(c0256FyM4574m) * (-1.0f)));
        }
        m4564c(c0564n4M4573l);
    }

    /* JADX INFO: renamed from: h */
    public final void m4569h(C0564N4 c0564n4) {
        int i;
        if (c0564n4.f1846e) {
            c0564n4.f1842a.m536d(this, c0564n4.f1843b);
        } else {
            C0564N4[] c0564n4Arr = this.f7932g;
            int i2 = this.f7936k;
            c0564n4Arr[i2] = c0564n4;
            C0256Fy c0256Fy = c0564n4.f1842a;
            c0256Fy.f831c = i2;
            this.f7936k = i2 + 1;
            c0256Fy.m537e(this, c0564n4);
        }
        if (this.f7927b) {
            int i3 = 0;
            while (i3 < this.f7936k) {
                if (this.f7932g[i3] == null) {
                    System.out.println("WTF");
                }
                C0564N4 c0564n42 = this.f7932g[i3];
                if (c0564n42 != null && c0564n42.f1846e) {
                    c0564n42.f1842a.m536d(this, c0564n42.f1843b);
                    ((C1067Yt) this.f7938m.f9196b).m2003b(c0564n42);
                    this.f7932g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f7936k;
                        if (i4 >= i) {
                            break;
                        }
                        C0564N4[] c0564n4Arr2 = this.f7932g;
                        int i6 = i4 - 1;
                        C0564N4 c0564n43 = c0564n4Arr2[i4];
                        c0564n4Arr2[i6] = c0564n43;
                        C0256Fy c0256Fy2 = c0564n43.f1842a;
                        if (c0256Fy2.f831c == i4) {
                            c0256Fy2.f831c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f7932g[i5] = null;
                    }
                    this.f7936k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f7927b = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4570i() {
        for (int i = 0; i < this.f7936k; i++) {
            C0564N4 c0564n4 = this.f7932g[i];
            c0564n4.f1842a.f833e = c0564n4.f1843b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C0256Fy m4571j(int i) {
        if (this.f7935j + 1 >= this.f7931f) {
            m4575o();
        }
        C0256Fy c0256FyM4562a = m4562a(4);
        float[] fArr = c0256FyM4562a.f836h;
        int i2 = this.f7928c + 1;
        this.f7928c = i2;
        this.f7935j++;
        c0256FyM4562a.f830b = i2;
        c0256FyM4562a.f832d = i;
        ((C0256Fy[]) this.f7938m.f9198d)[i2] = c0256FyM4562a;
        C2731xu c2731xu = this.f7929d;
        c2731xu.f9334i.f2089b = c0256FyM4562a;
        Arrays.fill(fArr, 0.0f);
        fArr[c0256FyM4562a.f832d] = 1.0f;
        c2731xu.m5297j(c0256FyM4562a);
        return c0256FyM4562a;
    }

    /* JADX INFO: renamed from: k */
    public final C0256Fy m4572k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f7935j + 1 >= this.f7931f) {
            m4575o();
        }
        if (!(obj instanceof C1259cb)) {
            return null;
        }
        C1259cb c1259cb = (C1259cb) obj;
        C0256Fy c0256Fy = c1259cb.f4273i;
        if (c0256Fy == null) {
            c1259cb.m2390k();
            c0256Fy = c1259cb.f4273i;
        }
        int i = c0256Fy.f830b;
        C2656w4 c2656w4 = this.f7938m;
        if (i != -1 && i <= this.f7928c && ((C0256Fy[]) c2656w4.f9198d)[i] != null) {
            return c0256Fy;
        }
        if (i != -1) {
            c0256Fy.m535c();
        }
        int i2 = this.f7928c + 1;
        this.f7928c = i2;
        this.f7935j++;
        c0256Fy.f830b = i2;
        c0256Fy.f840l = 1;
        ((C0256Fy[]) c2656w4.f9198d)[i2] = c0256Fy;
        return c0256Fy;
    }

    /* JADX INFO: renamed from: l */
    public final C0564N4 m4573l() {
        Object obj;
        C2656w4 c2656w4 = this.f7938m;
        C1067Yt c1067Yt = (C1067Yt) c2656w4.f9196b;
        int i = c1067Yt.f3379b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c1067Yt.f3378a;
            obj = objArr[i2];
            objArr[i2] = null;
            c1067Yt.f3379b = i2;
        } else {
            obj = null;
        }
        C0564N4 c0564n4 = (C0564N4) obj;
        if (c0564n4 == null) {
            return new C0564N4(c2656w4);
        }
        c0564n4.f1842a = null;
        c0564n4.f1845d.m362b();
        c0564n4.f1843b = 0.0f;
        c0564n4.f1846e = false;
        return c0564n4;
    }

    /* JADX INFO: renamed from: m */
    public final C0256Fy m4574m() {
        if (this.f7935j + 1 >= this.f7931f) {
            m4575o();
        }
        C0256Fy c0256FyM4562a = m4562a(3);
        int i = this.f7928c + 1;
        this.f7928c = i;
        this.f7935j++;
        c0256FyM4562a.f830b = i;
        ((C0256Fy[]) this.f7938m.f9198d)[i] = c0256FyM4562a;
        return c0256FyM4562a;
    }

    /* JADX INFO: renamed from: o */
    public final void m4575o() {
        int i = this.f7930e * 2;
        this.f7930e = i;
        this.f7932g = (C0564N4[]) Arrays.copyOf(this.f7932g, i);
        C2656w4 c2656w4 = this.f7938m;
        c2656w4.f9198d = (C0256Fy[]) Arrays.copyOf((C0256Fy[]) c2656w4.f9198d, this.f7930e);
        int i2 = this.f7930e;
        this.f7934i = new boolean[i2];
        this.f7931f = i2;
        this.f7937l = i2;
    }

    /* JADX INFO: renamed from: p */
    public final void m4576p() {
        C2731xu c2731xu = this.f7929d;
        if (c2731xu.mo1107e()) {
            m4570i();
            return;
        }
        if (!this.f7933h) {
            m4577q(c2731xu);
            return;
        }
        for (int i = 0; i < this.f7936k; i++) {
            if (!this.f7932g[i].f1846e) {
                m4577q(c2731xu);
                return;
            }
        }
        m4570i();
    }

    /* JADX INFO: renamed from: q */
    public final void m4577q(C2731xu c2731xu) {
        int i = 0;
        while (true) {
            if (i >= this.f7936k) {
                break;
            }
            C0564N4 c0564n4 = this.f7932g[i];
            int i2 = 1;
            if (c0564n4.f1842a.f840l != 1) {
                float f = 0.0f;
                if (c0564n4.f1843b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f7936k) {
                            C0564N4 c0564n42 = this.f7932g[i6];
                            if (c0564n42.f1842a.f840l != i2 && !c0564n42.f1846e && c0564n42.f1843b < f) {
                                int iM364d = c0564n42.f1845d.m364d();
                                int i8 = 0;
                                while (i8 < iM364d) {
                                    C0256Fy c0256FyM365e = c0564n42.f1845d.m365e(i8);
                                    float fM363c = c0564n42.f1845d.m363c(c0256FyM365e);
                                    if (fM363c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c0256FyM365e.f835g[i9] / fM363c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = c0256FyM365e.f830b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0564N4 c0564n43 = this.f7932g[i4];
                            c0564n43.f1842a.f831c = -1;
                            c0564n43.m1109g(((C0256Fy[]) this.f7938m.f9198d)[i5]);
                            C0256Fy c0256Fy = c0564n43.f1842a;
                            c0256Fy.f831c = i4;
                            c0256Fy.m537e(this, c0564n43);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f7935j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m4578r(c2731xu);
        m4570i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4578r(C0564N4 c0564n4) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f7935j; i2++) {
            this.f7934i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.f7935j * 2) {
                return;
            }
            C0256Fy c0256Fy = c0564n4.f1842a;
            if (c0256Fy != null) {
                this.f7934i[c0256Fy.f830b] = true;
            }
            C0256Fy c0256FyMo1106d = c0564n4.mo1106d(this.f7934i);
            if (c0256FyMo1106d != null) {
                boolean[] zArr = this.f7934i;
                int i5 = c0256FyMo1106d.f830b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (c0256FyMo1106d != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f7936k) {
                    C0564N4 c0564n42 = this.f7932g[i6];
                    if (c0564n42.f1842a.f840l != i4 && !c0564n42.f1846e) {
                        C0177E4 c0177e4 = c0564n42.f1845d;
                        int i8 = c0177e4.f517h;
                        if (i8 == -1) {
                            z = false;
                            if (!z) {
                                float fM363c = c0564n42.f1845d.m363c(c0256FyMo1106d);
                                if (fM363c < 0.0f) {
                                    float f2 = (-c0564n42.f1843b) / fM363c;
                                    if (f2 < f) {
                                        f = f2;
                                        i7 = i6;
                                    }
                                }
                            }
                        } else {
                            for (int i9 = 0; i8 != -1 && i9 < c0177e4.f510a; i9++) {
                                if (c0177e4.f514e[i8] == c0256FyMo1106d.f830b) {
                                    z = true;
                                    break;
                                }
                                i8 = c0177e4.f515f[i8];
                            }
                            z = false;
                            if (!z) {
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C0564N4 c0564n43 = this.f7932g[i7];
                    c0564n43.f1842a.f831c = -1;
                    c0564n43.m1109g(c0256FyMo1106d);
                    C0256Fy c0256Fy2 = c0564n43.f1842a;
                    c0256Fy2.f831c = i7;
                    c0256Fy2.m537e(this, c0564n43);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4579s() {
        for (int i = 0; i < this.f7936k; i++) {
            C0564N4 c0564n4 = this.f7932g[i];
            if (c0564n4 != null) {
                ((C1067Yt) this.f7938m.f9196b).m2003b(c0564n4);
            }
            this.f7932g[i] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4580t() {
        C2656w4 c2656w4;
        int i = 0;
        while (true) {
            c2656w4 = this.f7938m;
            C0256Fy[] c0256FyArr = (C0256Fy[]) c2656w4.f9198d;
            if (i >= c0256FyArr.length) {
                break;
            }
            C0256Fy c0256Fy = c0256FyArr[i];
            if (c0256Fy != null) {
                c0256Fy.m535c();
            }
            i++;
        }
        C1067Yt c1067Yt = (C1067Yt) c2656w4.f9197c;
        C0256Fy[] c0256FyArr2 = this.f7939n;
        int length = this.f7940o;
        c1067Yt.getClass();
        if (length > c0256FyArr2.length) {
            length = c0256FyArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C0256Fy c0256Fy2 = c0256FyArr2[i2];
            int i3 = c1067Yt.f3379b;
            Object[] objArr = c1067Yt.f3378a;
            if (i3 < objArr.length) {
                objArr[i3] = c0256Fy2;
                c1067Yt.f3379b = i3 + 1;
            }
        }
        this.f7940o = 0;
        Arrays.fill((C0256Fy[]) c2656w4.f9198d, (Object) null);
        this.f7928c = 0;
        C2731xu c2731xu = this.f7929d;
        c2731xu.f9333h = 0;
        c2731xu.f1843b = 0.0f;
        this.f7935j = 1;
        for (int i4 = 0; i4 < this.f7936k; i4++) {
            C0564N4 c0564n4 = this.f7932g[i4];
        }
        m4579s();
        this.f7936k = 0;
        this.f7941p = new C0564N4(c2656w4);
    }
}
