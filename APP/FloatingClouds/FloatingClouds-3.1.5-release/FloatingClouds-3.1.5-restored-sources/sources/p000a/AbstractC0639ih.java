package p000a;

import p000a.C0240N3;

/* JADX INFO: renamed from: a.ih */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0639ih implements InterfaceC0348T4 {

    /* JADX INFO: renamed from: a */
    public int f2342a;

    /* JADX INFO: renamed from: b */
    public C0240N3 f2343b;

    /* JADX INFO: renamed from: c */
    public C0070Dd f2344c;

    /* JADX INFO: renamed from: d */
    public C0240N3.a f2345d;

    /* JADX INFO: renamed from: e */
    public final C0684l5 f2346e = new C0684l5(this);

    /* JADX INFO: renamed from: f */
    public int f2347f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f2348g = false;

    /* JADX INFO: renamed from: h */
    public final C0384V4 f2349h = new C0384V4(this);

    /* JADX INFO: renamed from: i */
    public final C0384V4 f2350i = new C0384V4(this);

    /* JADX INFO: renamed from: j */
    public a f2351j = a.f2352a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.ih$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f2352a;

        /* JADX INFO: renamed from: b */
        public static final a f2353b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ a[] f2354c;

        static {
            a aVar = new a("NONE", 0);
            f2352a = aVar;
            a aVar2 = new a("START", 1);
            a aVar3 = new a("END", 2);
            a aVar4 = new a("CENTER", 3);
            f2353b = aVar4;
            f2354c = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f2354c.clone();
        }
    }

    public AbstractC0639ih(C0240N3 c0240n3) {
        this.f2343b = c0240n3;
    }

    /* JADX INFO: renamed from: b */
    public static void m1500b(C0384V4 c0384v4, C0384V4 c0384v42, int i) {
        c0384v4.f1454l.add(c0384v42);
        c0384v4.f1448f = i;
        c0384v42.f1453k.add(c0384v4);
    }

    /* JADX INFO: renamed from: h */
    public static C0384V4 m1501h(C0222M3 c0222m3) {
        C0222M3 c0222m32 = c0222m3.f747d;
        if (c0222m32 == null) {
            return null;
        }
        C0240N3 c0240n3 = c0222m32.f745b;
        int iOrdinal = c0222m32.f746c.ordinal();
        if (iOrdinal == 1) {
            return c0240n3.f815d.f2349h;
        }
        if (iOrdinal == 2) {
            return c0240n3.f817e.f2349h;
        }
        if (iOrdinal == 3) {
            return c0240n3.f815d.f2350i;
        }
        if (iOrdinal == 4) {
            return c0240n3.f817e.f2350i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return c0240n3.f817e.f2962k;
    }

    /* JADX INFO: renamed from: i */
    public static C0384V4 m1502i(C0222M3 c0222m3, int i) {
        C0222M3 c0222m32 = c0222m3.f747d;
        if (c0222m32 == null) {
            return null;
        }
        C0240N3 c0240n3 = c0222m32.f745b;
        AbstractC0639ih abstractC0639ih = i == 0 ? c0240n3.f815d : c0240n3.f817e;
        int iOrdinal = c0222m32.f746c.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return abstractC0639ih.f2349h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return abstractC0639ih.f2350i;
        }
        return null;
    }

    @Override // p000a.InterfaceC0348T4
    /* JADX INFO: renamed from: a */
    public void mo521a(InterfaceC0348T4 interfaceC0348T4) {
    }

    /* JADX INFO: renamed from: c */
    public final void m1503c(C0384V4 c0384v4, C0384V4 c0384v42, int i, C0684l5 c0684l5) {
        c0384v4.f1454l.add(c0384v42);
        c0384v4.f1454l.add(this.f2346e);
        c0384v4.f1450h = i;
        c0384v4.f1451i = c0684l5;
        c0384v42.f1453k.add(c0384v4);
        c0684l5.f1453k.add(c0384v4);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo522d();

    /* JADX INFO: renamed from: e */
    public abstract void mo523e();

    /* JADX INFO: renamed from: f */
    public abstract void mo524f();

    /* JADX INFO: renamed from: g */
    public final int m1504g(int i, int i2) {
        if (i2 == 0) {
            C0240N3 c0240n3 = this.f2343b;
            int i3 = c0240n3.f826n;
            int iMax = Math.max(c0240n3.f825m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C0240N3 c0240n32 = this.f2343b;
            int i4 = c0240n32.f829q;
            int iMax2 = Math.max(c0240n32.f828p, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public long mo978j() {
        if (this.f2346e.f1452j) {
            return r0.f1449g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo525k();

    /* JADX INFO: renamed from: l */
    public final void m1505l(C0222M3 c0222m3, C0222M3 c0222m32, int i) {
        C0384V4 c0384v4M1501h = m1501h(c0222m3);
        C0384V4 c0384v4M1501h2 = m1501h(c0222m32);
        if (c0384v4M1501h.f1452j && c0384v4M1501h2.f1452j) {
            int iM600c = c0222m3.m600c() + c0384v4M1501h.f1449g;
            int iM600c2 = c0384v4M1501h2.f1449g - c0222m32.m600c();
            int i2 = iM600c2 - iM600c;
            C0684l5 c0684l5 = this.f2346e;
            if (!c0684l5.f1452j) {
                C0240N3.a aVar = this.f2345d;
                C0240N3.a aVar2 = C0240N3.a.f841c;
                if (aVar == aVar2) {
                    int i3 = this.f2342a;
                    if (i3 == 0) {
                        c0684l5.mo1014d(m1504g(i2, i));
                    } else if (i3 == 1) {
                        c0684l5.mo1014d(Math.min(m1504g(c0684l5.f2547m, i), i2));
                    } else if (i3 == 2) {
                        C0240N3 c0240n3 = this.f2343b;
                        C0240N3 c0240n32 = c0240n3.f793K;
                        if (c0240n32 != null) {
                            if ((i == 0 ? c0240n32.f815d : c0240n32.f817e).f2346e.f1452j) {
                                c0684l5.mo1014d(m1504g((int) ((r6.f1449g * (i == 0 ? c0240n3.f827o : c0240n3.f830r)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        C0240N3 c0240n33 = this.f2343b;
                        AbstractC0639ih abstractC0639ih = c0240n33.f815d;
                        C0240N3.a aVar3 = abstractC0639ih.f2345d;
                        C0752og c0752og = c0240n33.f817e;
                        if (aVar3 != aVar2 || abstractC0639ih.f2342a != 3 || c0752og.f2345d != aVar2 || c0752og.f2342a != 3) {
                            if (i == 0) {
                                abstractC0639ih = c0752og;
                            }
                            if (abstractC0639ih.f2346e.f1452j) {
                                float f = c0240n33.f796N;
                                c0684l5.mo1014d(i == 1 ? (int) ((r6.f1449g / f) + 0.5f) : (int) ((f * r6.f1449g) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (c0684l5.f1452j) {
                int i4 = c0684l5.f1449g;
                C0384V4 c0384v4 = this.f2350i;
                C0384V4 c0384v42 = this.f2349h;
                if (i4 == i2) {
                    c0384v42.mo1014d(iM600c);
                    c0384v4.mo1014d(iM600c2);
                    return;
                }
                C0240N3 c0240n34 = this.f2343b;
                float f2 = i == 0 ? c0240n34.f803U : c0240n34.f804V;
                if (c0384v4M1501h == c0384v4M1501h2) {
                    iM600c = c0384v4M1501h.f1449g;
                    iM600c2 = c0384v4M1501h2.f1449g;
                    f2 = 0.5f;
                }
                c0384v42.mo1014d((int) ((((iM600c2 - iM600c) - i4) * f2) + iM600c + 0.5f));
                c0384v4.mo1014d(c0384v42.f1449g + c0684l5.f1449g);
            }
        }
    }
}
