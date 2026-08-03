package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import p000a.C0141Hc.b;
import p000a.C0693le;

/* JADX INFO: renamed from: a.B9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0029B9 {

    /* JADX INFO: renamed from: o */
    public static int f92o = 1000;

    /* JADX INFO: renamed from: p */
    public static boolean f93p = true;

    /* JADX INFO: renamed from: b */
    public final C0141Hc f95b;

    /* JADX INFO: renamed from: e */
    public C0184K1[] f98e;

    /* JADX INFO: renamed from: k */
    public final C0003A2 f104k;

    /* JADX INFO: renamed from: n */
    public C0184K1 f107n;

    /* JADX INFO: renamed from: a */
    public int f94a = 0;

    /* JADX INFO: renamed from: c */
    public int f96c = 32;

    /* JADX INFO: renamed from: d */
    public int f97d = 32;

    /* JADX INFO: renamed from: f */
    public boolean f99f = false;

    /* JADX INFO: renamed from: g */
    public boolean[] f100g = new boolean[32];

    /* JADX INFO: renamed from: h */
    public int f101h = 1;

    /* JADX INFO: renamed from: i */
    public int f102i = 0;

    /* JADX INFO: renamed from: j */
    public int f103j = 32;

    /* JADX INFO: renamed from: l */
    public C0693le[] f105l = new C0693le[f92o];

    /* JADX INFO: renamed from: m */
    public int f106m = 0;

    /* JADX INFO: renamed from: a.B9$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        C0693le mo87a(boolean[] zArr);
    }

    /* JADX INFO: renamed from: a.B9$b */
    public class b extends C0184K1 {
        public b(C0003A2 c0003a2) {
            this.f636d = new C0712me(this, c0003a2);
        }
    }

    public C0029B9() {
        this.f98e = null;
        this.f98e = new C0184K1[32];
        m85q();
        C0003A2 c0003a2 = new C0003A2();
        c0003a2.f23a = new C0051Cc();
        c0003a2.f24b = new C0051Cc();
        c0003a2.f25c = new C0051Cc();
        c0003a2.f26d = new C0693le[32];
        this.f104k = c0003a2;
        C0141Hc c0141Hc = new C0141Hc(c0003a2);
        c0141Hc.f489f = new C0693le[128];
        c0141Hc.f490g = new C0693le[128];
        c0141Hc.f491h = 0;
        c0141Hc.f492i = c0141Hc.new b();
        this.f95b = c0141Hc;
        if (f93p) {
            this.f107n = new b(c0003a2);
        } else {
            this.f107n = new C0184K1(c0003a2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m69m(Object obj) {
        C0693le c0693le = ((C0222M3) obj).f750g;
        if (c0693le != null) {
            return (int) (c0693le.f2584e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final C0693le m70a(C0693le.a aVar) {
        C0693le c0693le = (C0693le) ((C0051Cc) this.f104k.f25c).mo128a();
        if (c0693le == null) {
            c0693le = new C0693le(aVar);
            c0693le.f2588i = aVar;
        } else {
            c0693le.m1561c();
            c0693le.f2588i = aVar;
        }
        int i = this.f106m;
        int i2 = f92o;
        if (i >= i2) {
            int i3 = i2 * 2;
            f92o = i3;
            this.f105l = (C0693le[]) Arrays.copyOf(this.f105l, i3);
        }
        C0693le[] c0693leArr = this.f105l;
        int i4 = this.f106m;
        this.f106m = i4 + 1;
        c0693leArr[i4] = c0693le;
        return c0693le;
    }

    /* JADX INFO: renamed from: b */
    public final void m71b(C0693le c0693le, C0693le c0693le2, int i, float f, C0693le c0693le3, C0693le c0693le4, int i2, int i3) {
        C0184K1 c0184k1M80k = m80k();
        if (c0693le2 == c0693le3) {
            c0184k1M80k.f636d.mo343c(c0693le, 1.0f);
            c0184k1M80k.f636d.mo343c(c0693le4, 1.0f);
            c0184k1M80k.f636d.mo343c(c0693le2, -2.0f);
        } else if (f == 0.5f) {
            c0184k1M80k.f636d.mo343c(c0693le, 1.0f);
            c0184k1M80k.f636d.mo343c(c0693le2, -1.0f);
            c0184k1M80k.f636d.mo343c(c0693le3, -1.0f);
            c0184k1M80k.f636d.mo343c(c0693le4, 1.0f);
            if (i > 0 || i2 > 0) {
                c0184k1M80k.f634b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0184k1M80k.f636d.mo343c(c0693le, -1.0f);
            c0184k1M80k.f636d.mo343c(c0693le2, 1.0f);
            c0184k1M80k.f634b = i;
        } else if (f >= 1.0f) {
            c0184k1M80k.f636d.mo343c(c0693le4, -1.0f);
            c0184k1M80k.f636d.mo343c(c0693le3, 1.0f);
            c0184k1M80k.f634b = -i2;
        } else {
            float f2 = 1.0f - f;
            c0184k1M80k.f636d.mo343c(c0693le, f2 * 1.0f);
            c0184k1M80k.f636d.mo343c(c0693le2, f2 * (-1.0f));
            c0184k1M80k.f636d.mo343c(c0693le3, (-1.0f) * f);
            c0184k1M80k.f636d.mo343c(c0693le4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0184k1M80k.f634b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0184k1M80k.m494b(this, i3);
        }
        m72c(c0184k1M80k);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m72c(C0184K1 c0184k1) {
        boolean z;
        C0693le.a aVar;
        boolean z2;
        C0693le c0693leM497e;
        ArrayList<C0693le> arrayList;
        boolean z3 = true;
        if (this.f102i + 1 >= this.f103j || this.f101h + 1 >= this.f97d) {
            m82n();
        }
        if (c0184k1.f637e) {
            z = false;
        } else {
            if (this.f98e.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iMo351k = c0184k1.f636d.mo351k();
                    int i = 0;
                    while (true) {
                        arrayList = c0184k1.f635c;
                        if (i >= iMo351k) {
                            break;
                        }
                        C0693le c0693leMo346f = c0184k1.f636d.mo346f(i);
                        if (c0693leMo346f.f2582c != -1 || c0693leMo346f.f2585f) {
                            arrayList.add(c0693leMo346f);
                        }
                        i++;
                    }
                    if (arrayList.size() > 0) {
                        for (C0693le c0693le : arrayList) {
                            if (c0693le.f2585f) {
                                c0184k1.m499g(c0693le, true);
                            } else {
                                c0184k1.mo367h(this.f98e[c0693le.f2582c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
            }
            float f = 0.0f;
            if (c0184k1.f633a == null && c0184k1.f634b == 0.0f && c0184k1.f636d.mo351k() == 0) {
                return;
            }
            float f2 = c0184k1.f634b;
            if (f2 < 0.0f) {
                c0184k1.f634b = f2 * (-1.0f);
                c0184k1.f636d.mo350j();
            }
            int iMo351k2 = c0184k1.f636d.mo351k();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C0693le c0693le2 = null;
            C0693le c0693le3 = null;
            int i2 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                aVar = C0693le.a.f2592a;
                if (i2 >= iMo351k2) {
                    break;
                }
                float fMo341a = c0184k1.f636d.mo341a(i2);
                float f5 = f;
                C0693le c0693leMo346f2 = c0184k1.f636d.mo346f(i2);
                if (c0693leMo346f2.f2588i == aVar) {
                    if (c0693le2 == null) {
                        z5 = c0693leMo346f2.f2591l <= 1;
                    } else if (f3 > fMo341a) {
                        if (c0693leMo346f2.f2591l <= 1) {
                        }
                    } else if (z5 || c0693leMo346f2.f2591l > 1) {
                    }
                    f3 = fMo341a;
                    c0693le2 = c0693leMo346f2;
                } else if (c0693le2 == null && fMo341a < f5) {
                    if (c0693le3 == null) {
                        z6 = c0693leMo346f2.f2591l <= 1;
                    } else if (f4 > fMo341a) {
                        if (c0693leMo346f2.f2591l <= 1) {
                        }
                    } else if (z6 || c0693leMo346f2.f2591l > 1) {
                    }
                    f4 = fMo341a;
                    c0693le3 = c0693leMo346f2;
                }
                i2++;
                f = f5;
            }
            float f6 = f;
            if (c0693le2 == null) {
                c0693le2 = c0693le3;
            }
            if (c0693le2 == null) {
                z2 = true;
            } else {
                c0184k1.m498f(c0693le2);
                z2 = false;
            }
            if (c0184k1.f636d.mo351k() == 0) {
                c0184k1.f637e = true;
            }
            if (z2) {
                if (this.f101h + 1 >= this.f97d) {
                    m82n();
                }
                C0693le c0693leM70a = m70a(C0693le.a.f2593b);
                int i3 = this.f94a + 1;
                this.f94a = i3;
                this.f101h++;
                c0693leM70a.f2581b = i3;
                ((C0693le[]) this.f104k.f26d)[i3] = c0693leM70a;
                c0184k1.f633a = c0693leM70a;
                m77h(c0184k1);
                C0184K1 c0184k12 = this.f107n;
                c0184k12.getClass();
                c0184k12.f633a = null;
                c0184k12.f636d.clear();
                for (int i4 = 0; i4 < c0184k1.f636d.mo351k(); i4++) {
                    c0184k12.f636d.mo345e(c0184k1.f636d.mo346f(i4), c0184k1.f636d.mo341a(i4), true);
                }
                m84p(this.f107n);
                if (c0693leM70a.f2582c == -1) {
                    if (c0184k1.f633a == c0693leM70a && (c0693leM497e = c0184k1.m497e(null, c0693leM70a)) != null) {
                        c0184k1.m498f(c0693leM497e);
                    }
                    if (!c0184k1.f637e) {
                        c0184k1.f633a.m1562d(c0184k1);
                    }
                    this.f102i--;
                }
            } else {
                z3 = false;
            }
            C0693le c0693le4 = c0184k1.f633a;
            if (c0693le4 == null) {
                return;
            }
            if (c0693le4.f2588i != aVar && c0184k1.f634b < f6) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        m77h(c0184k1);
    }

    /* JADX INFO: renamed from: d */
    public final void m73d(C0693le c0693le, int i) {
        int i2 = c0693le.f2582c;
        if (i2 == -1) {
            c0693le.f2584e = i;
            c0693le.f2585f = true;
            int i3 = c0693le.f2590k;
            for (int i4 = 0; i4 < i3; i4++) {
                c0693le.f2589j[i4].m499g(c0693le, false);
            }
            c0693le.f2590k = 0;
            return;
        }
        if (i2 == -1) {
            C0184K1 c0184k1M80k = m80k();
            c0184k1M80k.f633a = c0693le;
            float f = i;
            c0693le.f2584e = f;
            c0184k1M80k.f634b = f;
            c0184k1M80k.f637e = true;
            m72c(c0184k1M80k);
            return;
        }
        C0184K1 c0184k1 = this.f98e[i2];
        if (c0184k1.f637e) {
            c0184k1.f634b = i;
            return;
        }
        if (c0184k1.f636d.mo351k() == 0) {
            c0184k1.f637e = true;
            c0184k1.f634b = i;
            return;
        }
        C0184K1 c0184k1M80k2 = m80k();
        if (i < 0) {
            c0184k1M80k2.f634b = i * (-1);
            c0184k1M80k2.f636d.mo343c(c0693le, 1.0f);
        } else {
            c0184k1M80k2.f634b = i;
            c0184k1M80k2.f636d.mo343c(c0693le, -1.0f);
        }
        m72c(c0184k1M80k2);
    }

    /* JADX INFO: renamed from: e */
    public final void m74e(C0693le c0693le, C0693le c0693le2, int i, int i2) {
        boolean z = false;
        if (i2 == 8 && c0693le2.f2585f && c0693le.f2582c == -1) {
            c0693le.f2584e = c0693le2.f2584e + i;
            c0693le.f2585f = true;
            int i3 = c0693le.f2590k;
            for (int i4 = 0; i4 < i3; i4++) {
                c0693le.f2589j[i4].m499g(c0693le, false);
            }
            c0693le.f2590k = 0;
            return;
        }
        C0184K1 c0184k1M80k = m80k();
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0184k1M80k.f634b = i;
        }
        if (z) {
            c0184k1M80k.f636d.mo343c(c0693le, 1.0f);
            c0184k1M80k.f636d.mo343c(c0693le2, -1.0f);
        } else {
            c0184k1M80k.f636d.mo343c(c0693le, -1.0f);
            c0184k1M80k.f636d.mo343c(c0693le2, 1.0f);
        }
        if (i2 != 8) {
            c0184k1M80k.m494b(this, i2);
        }
        m72c(c0184k1M80k);
    }

    /* JADX INFO: renamed from: f */
    public final void m75f(C0693le c0693le, C0693le c0693le2, int i, int i2) {
        C0184K1 c0184k1M80k = m80k();
        C0693le c0693leM81l = m81l();
        c0693leM81l.f2583d = 0;
        c0184k1M80k.m495c(c0693le, c0693le2, c0693leM81l, i);
        if (i2 != 8) {
            c0184k1M80k.f636d.mo343c(m78i(i2), (int) (c0184k1M80k.f636d.mo349i(c0693leM81l) * (-1.0f)));
        }
        m72c(c0184k1M80k);
    }

    /* JADX INFO: renamed from: g */
    public final void m76g(C0693le c0693le, C0693le c0693le2, int i, int i2) {
        C0184K1 c0184k1M80k = m80k();
        C0693le c0693leM81l = m81l();
        c0693leM81l.f2583d = 0;
        c0184k1M80k.m496d(c0693le, c0693le2, c0693leM81l, i);
        if (i2 != 8) {
            c0184k1M80k.f636d.mo343c(m78i(i2), (int) (c0184k1M80k.f636d.mo349i(c0693leM81l) * (-1.0f)));
        }
        m72c(c0184k1M80k);
    }

    /* JADX INFO: renamed from: h */
    public final void m77h(C0184K1 c0184k1) {
        boolean z = f93p;
        C0003A2 c0003a2 = this.f104k;
        if (z) {
            C0184K1 c0184k12 = this.f98e[this.f102i];
            if (c0184k12 != null) {
                ((C0051Cc) c0003a2.f23a).m129b(c0184k12);
            }
        } else {
            C0184K1 c0184k13 = this.f98e[this.f102i];
            if (c0184k13 != null) {
                ((C0051Cc) c0003a2.f24b).m129b(c0184k13);
            }
        }
        C0184K1[] c0184k1Arr = this.f98e;
        int i = this.f102i;
        c0184k1Arr[i] = c0184k1;
        C0693le c0693le = c0184k1.f633a;
        c0693le.f2582c = i;
        this.f102i = i + 1;
        c0693le.m1562d(c0184k1);
    }

    /* JADX INFO: renamed from: i */
    public final C0693le m78i(int i) {
        if (this.f101h + 1 >= this.f97d) {
            m82n();
        }
        C0693le c0693leM70a = m70a(C0693le.a.f2594c);
        int i2 = this.f94a + 1;
        this.f94a = i2;
        this.f101h++;
        c0693leM70a.f2581b = i2;
        c0693leM70a.f2583d = i;
        ((C0693le[]) this.f104k.f26d)[i2] = c0693leM70a;
        C0141Hc c0141Hc = this.f95b;
        c0141Hc.f492i.f493a = c0693leM70a;
        float[] fArr = c0693leM70a.f2587h;
        Arrays.fill(fArr, 0.0f);
        fArr[c0693leM70a.f2583d] = 1.0f;
        c0141Hc.m368i(c0693leM70a);
        return c0693leM70a;
    }

    /* JADX INFO: renamed from: j */
    public final C0693le m79j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f101h + 1 >= this.f97d) {
            m82n();
        }
        if (!(obj instanceof C0222M3)) {
            return null;
        }
        C0222M3 c0222m3 = (C0222M3) obj;
        C0693le c0693le = c0222m3.f750g;
        if (c0693le == null) {
            c0222m3.m606i();
            c0693le = c0222m3.f750g;
        }
        int i = c0693le.f2581b;
        C0003A2 c0003a2 = this.f104k;
        if (i != -1 && i <= this.f94a && ((C0693le[]) c0003a2.f26d)[i] != null) {
            return c0693le;
        }
        if (i != -1) {
            c0693le.m1561c();
        }
        int i2 = this.f94a + 1;
        this.f94a = i2;
        this.f101h++;
        c0693le.f2581b = i2;
        c0693le.f2588i = C0693le.a.f2592a;
        ((C0693le[]) c0003a2.f26d)[i2] = c0693le;
        return c0693le;
    }

    /* JADX INFO: renamed from: k */
    public final C0184K1 m80k() {
        boolean z = f93p;
        C0003A2 c0003a2 = this.f104k;
        if (z) {
            C0184K1 c0184k1 = (C0184K1) ((C0051Cc) c0003a2.f23a).mo128a();
            if (c0184k1 == null) {
                return new b(c0003a2);
            }
            c0184k1.f633a = null;
            c0184k1.f636d.clear();
            c0184k1.f634b = 0.0f;
            c0184k1.f637e = false;
            return c0184k1;
        }
        C0184K1 c0184k12 = (C0184K1) ((C0051Cc) c0003a2.f24b).mo128a();
        if (c0184k12 == null) {
            return new C0184K1(c0003a2);
        }
        c0184k12.f633a = null;
        c0184k12.f636d.clear();
        c0184k12.f634b = 0.0f;
        c0184k12.f637e = false;
        return c0184k12;
    }

    /* JADX INFO: renamed from: l */
    public final C0693le m81l() {
        if (this.f101h + 1 >= this.f97d) {
            m82n();
        }
        C0693le c0693leM70a = m70a(C0693le.a.f2593b);
        int i = this.f94a + 1;
        this.f94a = i;
        this.f101h++;
        c0693leM70a.f2581b = i;
        ((C0693le[]) this.f104k.f26d)[i] = c0693leM70a;
        return c0693leM70a;
    }

    /* JADX INFO: renamed from: n */
    public final void m82n() {
        int i = this.f96c * 2;
        this.f96c = i;
        this.f98e = (C0184K1[]) Arrays.copyOf(this.f98e, i);
        C0003A2 c0003a2 = this.f104k;
        c0003a2.f26d = (C0693le[]) Arrays.copyOf((C0693le[]) c0003a2.f26d, this.f96c);
        int i2 = this.f96c;
        this.f100g = new boolean[i2];
        this.f97d = i2;
        this.f103j = i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m83o(C0141Hc c0141Hc) {
        C0003A2 c0003a2;
        int i = 0;
        while (true) {
            if (i >= this.f102i) {
                break;
            }
            C0184K1 c0184k1 = this.f98e[i];
            C0693le.a aVar = c0184k1.f633a.f2588i;
            C0693le.a aVar2 = C0693le.a.f2592a;
            if (aVar != aVar2) {
                float f = 0.0f;
                if (c0184k1.f634b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        int i3 = 1;
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i4 = 0;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        while (true) {
                            int i8 = this.f102i;
                            c0003a2 = this.f104k;
                            if (i4 >= i8) {
                                break;
                            }
                            C0184K1 c0184k12 = this.f98e[i4];
                            if (c0184k12.f633a.f2588i != aVar2 && !c0184k12.f637e && c0184k12.f634b < f) {
                                int i9 = i3;
                                while (i9 < this.f101h) {
                                    C0693le c0693le = ((C0693le[]) c0003a2.f26d)[i9];
                                    float f3 = f;
                                    float fMo349i = c0184k12.f636d.mo349i(c0693le);
                                    if (fMo349i > f3) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f4 = c0693le.f2586g[i10] / fMo349i;
                                            if ((f4 < f2 && i10 == i7) || i10 > i7) {
                                                i7 = i10;
                                                f2 = f4;
                                                i5 = i4;
                                                i6 = i9;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = f3;
                                }
                            }
                            i4++;
                            f = f;
                            i3 = 1;
                        }
                        float f5 = f;
                        if (i5 != -1) {
                            C0184K1 c0184k13 = this.f98e[i5];
                            c0184k13.f633a.f2582c = -1;
                            c0184k13.m498f(((C0693le[]) c0003a2.f26d)[i6]);
                            C0693le c0693le2 = c0184k13.f633a;
                            c0693le2.f2582c = i5;
                            c0693le2.m1562d(c0184k13);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f101h / 2) {
                            z = true;
                        }
                        f = f5;
                    }
                }
            }
            i++;
        }
        m84p(c0141Hc);
        for (int i11 = 0; i11 < this.f102i; i11++) {
            C0184K1 c0184k14 = this.f98e[i11];
            c0184k14.f633a.f2584e = c0184k14.f634b;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m84p(C0184K1 c0184k1) {
        for (int i = 0; i < this.f101h; i++) {
            this.f100g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f101h * 2) {
                return;
            }
            C0693le c0693le = c0184k1.f633a;
            if (c0693le != null) {
                this.f100g[c0693le.f2581b] = true;
            }
            C0693le c0693leMo87a = c0184k1.mo87a(this.f100g);
            if (c0693leMo87a != null) {
                boolean[] zArr = this.f100g;
                int i3 = c0693leMo87a.f2581b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (c0693leMo87a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f102i; i5++) {
                    C0184K1 c0184k12 = this.f98e[i5];
                    if (c0184k12.f633a.f2588i != C0693le.a.f2592a && !c0184k12.f637e && c0184k12.f636d.mo344d(c0693leMo87a)) {
                        float fMo349i = c0184k12.f636d.mo349i(c0693leMo87a);
                        if (fMo349i < 0.0f) {
                            float f2 = (-c0184k12.f634b) / fMo349i;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0184K1 c0184k13 = this.f98e[i4];
                    c0184k13.f633a.f2582c = -1;
                    c0184k13.m498f(c0693leMo87a);
                    C0693le c0693le2 = c0184k13.f633a;
                    c0693le2.f2582c = i4;
                    c0693le2.m1562d(c0184k13);
                }
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m85q() {
        boolean z = f93p;
        C0003A2 c0003a2 = this.f104k;
        int i = 0;
        if (z) {
            while (true) {
                C0184K1[] c0184k1Arr = this.f98e;
                if (i >= c0184k1Arr.length) {
                    return;
                }
                C0184K1 c0184k1 = c0184k1Arr[i];
                if (c0184k1 != null) {
                    ((C0051Cc) c0003a2.f23a).m129b(c0184k1);
                }
                this.f98e[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0184K1[] c0184k1Arr2 = this.f98e;
                if (i >= c0184k1Arr2.length) {
                    return;
                }
                C0184K1 c0184k12 = c0184k1Arr2[i];
                if (c0184k12 != null) {
                    ((C0051Cc) c0003a2.f24b).m129b(c0184k12);
                }
                this.f98e[i] = null;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m86r() {
        C0003A2 c0003a2;
        int i = 0;
        while (true) {
            c0003a2 = this.f104k;
            C0693le[] c0693leArr = (C0693le[]) c0003a2.f26d;
            if (i >= c0693leArr.length) {
                break;
            }
            C0693le c0693le = c0693leArr[i];
            if (c0693le != null) {
                c0693le.m1561c();
            }
            i++;
        }
        C0051Cc c0051Cc = (C0051Cc) c0003a2.f25c;
        C0693le[] c0693leArr2 = this.f105l;
        int length = this.f106m;
        c0051Cc.getClass();
        if (length > c0693leArr2.length) {
            length = c0693leArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C0693le c0693le2 = c0693leArr2[i2];
            int i3 = c0051Cc.f183c;
            Object[] objArr = c0051Cc.f182b;
            if (i3 < objArr.length) {
                objArr[i3] = c0693le2;
                c0051Cc.f183c = i3 + 1;
            }
        }
        this.f106m = 0;
        Arrays.fill((C0693le[]) c0003a2.f26d, (Object) null);
        this.f94a = 0;
        C0141Hc c0141Hc = this.f95b;
        c0141Hc.f491h = 0;
        c0141Hc.f634b = 0.0f;
        this.f101h = 1;
        for (int i4 = 0; i4 < this.f102i; i4++) {
            this.f98e[i4].getClass();
        }
        m85q();
        this.f102i = 0;
        if (f93p) {
            this.f107n = new b(c0003a2);
        } else {
            this.f107n = new C0184K1(c0003a2);
        }
    }
}
