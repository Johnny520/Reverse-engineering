package p321w4;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p321w4.AbstractC9171a;

/* JADX INFO: renamed from: w4.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9182l extends AbstractC9181k {

    /* JADX INFO: renamed from: N */
    public static final int[] f31318N = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};

    /* JADX INFO: renamed from: A */
    public C9180j f31319A;

    /* JADX INFO: renamed from: B */
    public C9180j f31320B;

    /* JADX INFO: renamed from: C */
    public C9180j f31321C;

    /* JADX INFO: renamed from: D */
    public int f31322D;

    /* JADX INFO: renamed from: E */
    public int f31323E;

    /* JADX INFO: renamed from: F */
    public int f31324F;

    /* JADX INFO: renamed from: G */
    public int[] f31325G;

    /* JADX INFO: renamed from: H */
    public int[] f31326H;

    /* JADX INFO: renamed from: I */
    public boolean f31327I;

    /* JADX INFO: renamed from: J */
    public boolean f31328J;

    /* JADX INFO: renamed from: K */
    public int f31329K;

    /* JADX INFO: renamed from: L */
    public int f31330L;

    /* JADX INFO: renamed from: M */
    public int f31331M;

    /* JADX INFO: renamed from: c */
    public final C9184n f31332c;

    /* JADX INFO: renamed from: d */
    public final int f31333d;

    /* JADX INFO: renamed from: e */
    public final int f31334e;

    /* JADX INFO: renamed from: f */
    public final int f31335f;

    /* JADX INFO: renamed from: g */
    public final String f31336g;

    /* JADX INFO: renamed from: h */
    public int f31337h;

    /* JADX INFO: renamed from: i */
    public int f31338i;

    /* JADX INFO: renamed from: j */
    public final C9172b f31339j;

    /* JADX INFO: renamed from: k */
    public C9179i f31340k;

    /* JADX INFO: renamed from: l */
    public int f31341l;

    /* JADX INFO: renamed from: m */
    public C9172b f31342m;

    /* JADX INFO: renamed from: n */
    public int f31343n;

    /* JADX INFO: renamed from: o */
    public C9172b f31344o;

    /* JADX INFO: renamed from: p */
    public int f31345p;

    /* JADX INFO: renamed from: q */
    public C9172b f31346q;

    /* JADX INFO: renamed from: r */
    public int f31347r;

    /* JADX INFO: renamed from: s */
    public C9172b f31348s;

    /* JADX INFO: renamed from: t */
    public final int f31349t;

    /* JADX INFO: renamed from: u */
    public final int[] f31350u;

    /* JADX INFO: renamed from: v */
    public final int f31351v;

    /* JADX INFO: renamed from: w */
    public C9172b f31352w;

    /* JADX INFO: renamed from: x */
    public int f31353x;

    /* JADX INFO: renamed from: y */
    public C9172b f31354y;

    /* JADX INFO: renamed from: z */
    public final int f31355z;

    public C9182l(C9184n c9184n, int i10, String str, String str2, String str3, String[] strArr, int i11) {
        super(393216);
        this.f31339j = new C9172b();
        this.f31332c = c9184n;
        this.f31333d = "<init>".equals(str) ? 262144 | i10 : i10;
        this.f31334e = c9184n.m35721o(str);
        this.f31335f = c9184n.m35721o(str2);
        this.f31336g = str2;
        this.f31351v = str3 == null ? 0 : c9184n.m35721o(str3);
        if (strArr == null || strArr.length <= 0) {
            this.f31349t = 0;
            this.f31350u = null;
        } else {
            int length = strArr.length;
            this.f31349t = length;
            this.f31350u = new int[length];
            for (int i12 = 0; i12 < this.f31349t; i12++) {
                this.f31350u[i12] = c9184n.m35708b(strArr[i12]).f31356a;
            }
        }
        this.f31355z = i11;
        if (i11 != 0) {
            int iM35734b = C9185o.m35734b(str2) >> 2;
            iM35734b = (i10 & 8) != 0 ? iM35734b - 1 : iM35734b;
            this.f31338i = iM35734b;
            this.f31324F = iM35734b;
            C9180j c9180j = new C9180j();
            this.f31319A = c9180j;
            mo35673e(c9180j);
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: a */
    public void mo35669a(int i10, String str, String str2, String str3) {
        int i11;
        int i12;
        this.f31329K = this.f31339j.f31256b;
        AbstractC9183m abstractC9183mM35710d = this.f31332c.m35710d(str, str2, str3);
        this.f31339j.m35622d(i10, abstractC9183mM35710d.f31356a);
        C9180j c9180j = this.f31321C;
        if (c9180j != null) {
            int i13 = this.f31355z;
            if (i13 == 4 || i13 == 3) {
                c9180j.f31312h.m35646c(i10, 0, abstractC9183mM35710d, this.f31332c);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i14 = -2;
            switch (i10) {
                case Opcodes.GETSTATIC /* 178 */:
                    i11 = this.f31322D + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case Opcodes.PUTSTATIC /* 179 */:
                    i12 = this.f31322D;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i14 = -1;
                    }
                    i11 = i12 + i14;
                    break;
                case Opcodes.GETFIELD /* 180 */:
                    i11 = this.f31322D + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i12 = this.f31322D;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i14 = -3;
                    }
                    i11 = i12 + i14;
                    break;
            }
            if (i11 > this.f31323E) {
                this.f31323E = i11;
            }
            this.f31322D = i11;
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: b */
    public void mo35670b(int i10) {
        C9172b c9172b = this.f31339j;
        this.f31329K = c9172b.f31256b;
        c9172b.m35624f(i10);
        C9180j c9180j = this.f31321C;
        if (c9180j != null) {
            int i11 = this.f31355z;
            if (i11 == 4 || i11 == 3) {
                c9180j.f31312h.m35646c(i10, 0, null, null);
            } else {
                int i12 = this.f31322D + f31318N[i10];
                if (i12 > this.f31323E) {
                    this.f31323E = i12;
                }
                this.f31322D = i12;
            }
            if ((i10 < 172 || i10 > 177) && i10 != 191) {
                return;
            }
            m35685q();
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: c */
    public void mo35671c(int i10, int i11) {
        C9172b c9172b = this.f31339j;
        this.f31329K = c9172b.f31256b;
        if (i10 == 17) {
            c9172b.m35622d(i10, i11);
        } else {
            c9172b.m35621c(i10, i11);
        }
        C9180j c9180j = this.f31321C;
        if (c9180j != null) {
            int i12 = this.f31355z;
            if (i12 == 4 || i12 == 3) {
                c9180j.f31312h.m35646c(i10, i11, null, null);
            } else if (i10 != 188) {
                int i13 = this.f31322D + 1;
                if (i13 > this.f31323E) {
                    this.f31323E = i13;
                }
                this.f31322D = i13;
            }
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: d */
    public void mo35672d(int i10, C9180j c9180j) {
        boolean z10;
        C9172b c9172b = this.f31339j;
        int i11 = c9172b.f31256b;
        this.f31329K = i11;
        int i12 = i10 >= 200 ? i10 - 33 : i10;
        if ((c9180j.f31305a & 4) == 0 || c9180j.f31306b - i11 >= -32768) {
            if (i12 != i10) {
                c9172b.m35624f(i10);
                C9172b c9172b2 = this.f31339j;
                c9180j.m35667f(c9172b2, c9172b2.f31256b - 1, true);
            } else {
                c9172b.m35624f(i12);
                C9172b c9172b3 = this.f31339j;
                c9180j.m35667f(c9172b3, c9172b3.f31256b - 1, false);
            }
            z10 = false;
        } else {
            if (i12 == 167) {
                c9172b.m35624f(200);
            } else if (i12 == 168) {
                c9172b.m35624f(201);
            } else {
                c9172b.m35624f(i12 >= 198 ? i12 ^ 1 : ((i12 + 1) ^ 1) - 1);
                this.f31339j.m35628j(8);
                this.f31339j.m35624f(220);
                this.f31328J = true;
                z10 = true;
                C9172b c9172b4 = this.f31339j;
                c9180j.m35667f(c9172b4, c9172b4.f31256b - 1, true);
            }
            z10 = false;
            C9172b c9172b42 = this.f31339j;
            c9180j.m35667f(c9172b42, c9172b42.f31256b - 1, true);
        }
        C9180j c9180j2 = this.f31321C;
        if (c9180j2 != null) {
            int i13 = this.f31355z;
            C9180j c9180j3 = null;
            if (i13 == 4) {
                c9180j2.f31312h.m35646c(i12, 0, null, null);
                C9180j c9180jM35664c = c9180j.m35664c();
                c9180jM35664c.f31305a = (short) (c9180jM35664c.f31305a | 2);
                m35680l(0, c9180j);
                if (i12 != 167) {
                    c9180j3 = new C9180j();
                }
            } else if (i13 == 3) {
                c9180j2.f31312h.m35646c(i12, 0, null, null);
            } else if (i13 == 2) {
                this.f31322D += f31318N[i12];
            } else if (i12 == 168) {
                short s10 = c9180j.f31305a;
                if ((s10 & 32) == 0) {
                    c9180j.f31305a = (short) (s10 | 32);
                    this.f31327I = true;
                }
                c9180j2.f31305a = (short) (c9180j2.f31305a | 16);
                m35680l(this.f31322D + 1, c9180j);
                c9180j3 = new C9180j();
            } else {
                int i14 = this.f31322D + f31318N[i12];
                this.f31322D = i14;
                m35680l(i14, c9180j);
            }
            if (c9180j3 != null) {
                if (z10) {
                    c9180j3.f31305a = (short) (c9180j3.f31305a | 2);
                }
                mo35673e(c9180j3);
            }
            if (i12 == 167) {
                m35685q();
            }
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: e */
    public void mo35673e(C9180j c9180j) {
        boolean z10 = this.f31328J;
        C9172b c9172b = this.f31339j;
        this.f31328J = z10 | c9180j.m35668g(c9172b.f31255a, c9172b.f31256b);
        short s10 = c9180j.f31305a;
        if ((s10 & 1) != 0) {
            return;
        }
        int i10 = this.f31355z;
        if (i10 == 4) {
            C9180j c9180j2 = this.f31321C;
            if (c9180j2 != null) {
                if (c9180j.f31306b == c9180j2.f31306b) {
                    c9180j2.f31305a = (short) ((s10 & 2) | c9180j2.f31305a);
                    c9180j.f31312h = c9180j2.f31312h;
                    return;
                }
                m35680l(0, c9180j);
            }
            C9180j c9180j3 = this.f31320B;
            if (c9180j3 != null) {
                if (c9180j.f31306b == c9180j3.f31306b) {
                    c9180j3.f31305a = (short) (c9180j3.f31305a | (c9180j.f31305a & 2));
                    c9180j.f31312h = c9180j3.f31312h;
                    this.f31321C = c9180j3;
                    return;
                }
                c9180j3.f31313i = c9180j;
            }
            this.f31320B = c9180j;
            this.f31321C = c9180j;
            c9180j.f31312h = new C9178h(c9180j);
            return;
        }
        if (i10 == 3) {
            C9180j c9180j4 = this.f31321C;
            if (c9180j4 == null) {
                this.f31321C = c9180j;
                return;
            } else {
                c9180j4.f31312h.f31289a = c9180j;
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2 && this.f31321C == null) {
                this.f31321C = c9180j;
                return;
            }
            return;
        }
        C9180j c9180j5 = this.f31321C;
        if (c9180j5 != null) {
            c9180j5.f31310f = (short) this.f31323E;
            m35680l(this.f31322D, c9180j);
        }
        this.f31321C = c9180j;
        this.f31322D = 0;
        this.f31323E = 0;
        C9180j c9180j6 = this.f31320B;
        if (c9180j6 != null) {
            c9180j6.f31313i = c9180j;
        }
        this.f31320B = c9180j;
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: f */
    public void mo35674f(Object obj) {
        this.f31329K = this.f31339j.f31256b;
        AbstractC9183m abstractC9183mM35707a = this.f31332c.m35707a(obj);
        int i10 = abstractC9183mM35707a.f31356a;
        int i11 = abstractC9183mM35707a.f31357b;
        boolean z10 = i11 == 5 || i11 == 6;
        if (z10) {
            this.f31339j.m35622d(20, i10);
        } else {
            C9172b c9172b = this.f31339j;
            if (i10 >= 256) {
                c9172b.m35622d(19, i10);
            } else {
                c9172b.m35621c(18, i10);
            }
        }
        C9180j c9180j = this.f31321C;
        if (c9180j != null) {
            int i12 = this.f31355z;
            if (i12 == 4 || i12 == 3) {
                c9180j.f31312h.m35646c(18, 0, abstractC9183mM35707a, this.f31332c);
                return;
            }
            int i13 = this.f31322D + (z10 ? 2 : 1);
            if (i13 > this.f31323E) {
                this.f31323E = i13;
            }
            this.f31322D = i13;
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: g */
    public void mo35675g(int i10, int i11) {
        int i12 = this.f31355z;
        if (i12 == 4) {
            m35682n();
            return;
        }
        if (i12 == 1) {
            m35683o();
        } else if (i12 == 2) {
            this.f31337h = this.f31323E;
        } else {
            this.f31337h = i10;
            this.f31338i = i11;
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: h */
    public void mo35676h(int i10, String str, String str2, String str3, boolean z10) {
        this.f31329K = this.f31339j.f31256b;
        AbstractC9183m abstractC9183mM35718l = this.f31332c.m35718l(str, str2, str3, z10);
        C9172b c9172b = this.f31339j;
        if (i10 == 185) {
            c9172b.m35622d(Opcodes.INVOKEINTERFACE, abstractC9183mM35718l.f31356a).m35621c(abstractC9183mM35718l.m35695a() >> 2, 0);
        } else {
            c9172b.m35622d(i10, abstractC9183mM35718l.f31356a);
        }
        C9180j c9180j = this.f31321C;
        if (c9180j != null) {
            int i11 = this.f31355z;
            if (i11 == 4 || i11 == 3) {
                c9180j.f31312h.m35646c(i10, 0, abstractC9183mM35718l, this.f31332c);
                return;
            }
            int iM35695a = abstractC9183mM35718l.m35695a();
            int i12 = (iM35695a & 3) - (iM35695a >> 2);
            int i13 = this.f31322D;
            int i14 = i10 == 184 ? i13 + i12 + 1 : i13 + i12;
            if (i14 > this.f31323E) {
                this.f31323E = i14;
            }
            this.f31322D = i14;
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: i */
    public void mo35677i(int i10, int i11, C9180j c9180j, C9180j... c9180jArr) {
        C9172b c9172b = this.f31339j;
        this.f31329K = c9172b.f31256b;
        c9172b.m35624f(Opcodes.TABLESWITCH).m35625g(null, 0, (4 - (this.f31339j.f31256b % 4)) % 4);
        c9180j.m35667f(this.f31339j, this.f31329K, true);
        this.f31339j.m35626h(i10).m35626h(i11);
        for (C9180j c9180j2 : c9180jArr) {
            c9180j2.m35667f(this.f31339j, this.f31329K, true);
        }
        m35694z(c9180j, c9180jArr);
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: j */
    public void mo35678j(int i10, String str) {
        this.f31329K = this.f31339j.f31256b;
        AbstractC9183m abstractC9183mM35708b = this.f31332c.m35708b(str);
        this.f31339j.m35622d(i10, abstractC9183mM35708b.f31356a);
        C9180j c9180j = this.f31321C;
        if (c9180j != null) {
            int i11 = this.f31355z;
            if (i11 == 4 || i11 == 3) {
                c9180j.f31312h.m35646c(i10, this.f31329K, abstractC9183mM35708b, this.f31332c);
            } else if (i10 == 187) {
                int i12 = this.f31322D + 1;
                if (i12 > this.f31323E) {
                    this.f31323E = i12;
                }
                this.f31322D = i12;
            }
        }
    }

    @Override // p321w4.AbstractC9181k
    /* JADX INFO: renamed from: k */
    public void mo35679k(int i10, int i11) {
        C9172b c9172b = this.f31339j;
        this.f31329K = c9172b.f31256b;
        if (i11 < 4 && i10 != 169) {
            c9172b.m35624f((i10 < 54 ? ((i10 - 21) << 2) + 26 : ((i10 - 54) << 2) + 59) + i11);
        } else if (i11 >= 256) {
            c9172b.m35624f(196).m35622d(i10, i11);
        } else {
            c9172b.m35621c(i10, i11);
        }
        C9180j c9180j = this.f31321C;
        if (c9180j != null) {
            int i12 = this.f31355z;
            if (i12 == 4 || i12 == 3) {
                c9180j.f31312h.m35646c(i10, i11, null, null);
            } else if (i10 == 169) {
                c9180j.f31305a = (short) (c9180j.f31305a | 64);
                c9180j.f31309e = (short) this.f31322D;
                m35685q();
            } else {
                int i13 = this.f31322D + f31318N[i10];
                if (i13 > this.f31323E) {
                    this.f31323E = i13;
                }
                this.f31322D = i13;
            }
        }
        int i14 = this.f31355z;
        if (i14 != 0) {
            int i15 = (i10 == 22 || i10 == 24 || i10 == 55 || i10 == 57) ? i11 + 2 : i11 + 1;
            if (i15 > this.f31338i) {
                this.f31338i = i15;
            }
        }
        if (i10 < 54 || i14 != 4 || this.f31340k == null) {
            return;
        }
        mo35673e(new C9180j());
    }

    /* JADX INFO: renamed from: l */
    public final void m35680l(int i10, C9180j c9180j) {
        C9180j c9180j2 = this.f31321C;
        c9180j2.f31314j = new C9175e(i10, c9180j, c9180j2.f31314j);
    }

    /* JADX INFO: renamed from: m */
    public final void m35681m(AbstractC9171a.a aVar) {
        aVar.m35617a(null);
        aVar.m35617a(null);
    }

    /* JADX INFO: renamed from: n */
    public final void m35682n() {
        C9172b c9172b;
        C9179i c9179i = this.f31340k;
        while (true) {
            if (c9179i == null) {
                break;
            }
            String str = c9179i.f31302e;
            int iM35641e = C9178h.m35641e(this.f31332c, str != null ? str : "java/lang/Throwable");
            C9180j c9180jM35664c = c9179i.f31300c.m35664c();
            c9180jM35664c.f31305a = (short) (c9180jM35664c.f31305a | 2);
            C9180j c9180jM35664c2 = c9179i.f31299b.m35664c();
            for (C9180j c9180jM35664c3 = c9179i.f31298a.m35664c(); c9180jM35664c3 != c9180jM35664c2; c9180jM35664c3 = c9180jM35664c3.f31313i) {
                c9180jM35664c3.f31314j = new C9175e(iM35641e, c9180jM35664c, c9180jM35664c3.f31314j);
            }
            c9179i = c9179i.f31303f;
        }
        C9178h c9178h = this.f31319A.f31312h;
        c9178h.m35656q(this.f31332c, this.f31333d, this.f31336g, this.f31338i);
        c9178h.m35644a(this);
        C9180j c9180j = this.f31319A;
        c9180j.f31315k = C9180j.f31304l;
        int iMax = 0;
        while (c9180j != C9180j.f31304l) {
            C9180j c9180j2 = c9180j.f31315k;
            c9180j.f31315k = null;
            c9180j.f31305a = (short) (c9180j.f31305a | 8);
            int iM35648g = c9180j.f31312h.m35648g() + c9180j.f31310f;
            if (iM35648g > iMax) {
                iMax = iM35648g;
            }
            for (C9175e c9175e = c9180j.f31314j; c9175e != null; c9175e = c9175e.f31280c) {
                C9180j c9180jM35664c4 = c9175e.f31279b.m35664c();
                if (c9180j.f31312h.m35650j(this.f31332c, c9180jM35664c4.f31312h, c9175e.f31278a) && c9180jM35664c4.f31315k == null) {
                    c9180jM35664c4.f31315k = c9180j2;
                    c9180j2 = c9180jM35664c4;
                }
            }
            c9180j = c9180j2;
        }
        for (C9180j c9180j3 = this.f31319A; c9180j3 != null; c9180j3 = c9180j3.f31313i) {
            if ((c9180j3.f31305a & 10) == 10) {
                c9180j3.f31312h.m35644a(this);
            }
            if ((c9180j3.f31305a & 8) == 0) {
                C9180j c9180j4 = c9180j3.f31313i;
                int i10 = c9180j3.f31306b;
                int i11 = (c9180j4 == null ? this.f31339j.f31256b : c9180j4.f31306b) - 1;
                if (i11 >= i10) {
                    int i12 = i10;
                    while (true) {
                        c9172b = this.f31339j;
                        if (i12 >= i11) {
                            break;
                        }
                        c9172b.f31255a[i12] = 0;
                        i12++;
                    }
                    c9172b.f31255a[i11] = JSONB.Constants.BC_INT64_INT;
                    this.f31326H[m35693y(i10, 0, 1)] = C9178h.m35641e(this.f31332c, "java/lang/Throwable");
                    m35692x();
                    this.f31340k = C9179i.m35661d(this.f31340k, c9180j3, c9180j4);
                    iMax = Math.max(iMax, 1);
                }
            }
        }
        this.f31337h = iMax;
    }

    /* JADX INFO: renamed from: o */
    public final void m35683o() {
        C9180j c9180j;
        for (C9179i c9179i = this.f31340k; c9179i != null; c9179i = c9179i.f31303f) {
            C9180j c9180j2 = c9179i.f31300c;
            C9180j c9180j3 = c9179i.f31299b;
            for (C9180j c9180j4 = c9179i.f31298a; c9180j4 != c9180j3; c9180j4 = c9180j4.f31313i) {
                int i10 = c9180j4.f31305a & 16;
                C9175e c9175e = c9180j4.f31314j;
                if (i10 == 0) {
                    c9180j4.f31314j = new C9175e(Integer.MAX_VALUE, c9180j2, c9175e);
                } else {
                    C9175e c9175e2 = c9175e.f31280c;
                    c9175e2.f31280c = new C9175e(Integer.MAX_VALUE, c9180j2, c9175e2.f31280c);
                }
            }
        }
        if (this.f31327I) {
            this.f31319A.m35665d((short) 1);
            short s10 = 1;
            short s11 = 1;
            while (true) {
                c9180j = this.f31319A;
                if (s10 > s11) {
                    break;
                }
                while (c9180j != null) {
                    if ((c9180j.f31305a & 16) != 0 && c9180j.f31311g == s10) {
                        C9180j c9180j5 = c9180j.f31314j.f31280c.f31279b;
                        if (c9180j5.f31311g == 0) {
                            s11 = (short) (s11 + 1);
                            c9180j5.m35665d(s11);
                        }
                    }
                    c9180j = c9180j.f31313i;
                }
                s10 = (short) (s10 + 1);
            }
            while (c9180j != null) {
                if ((c9180j.f31305a & 16) != 0) {
                    c9180j.f31314j.f31280c.f31279b.m35663b(c9180j);
                }
                c9180j = c9180j.f31313i;
            }
        }
        C9180j c9180j6 = this.f31319A;
        c9180j6.f31315k = C9180j.f31304l;
        int i11 = this.f31337h;
        while (c9180j6 != C9180j.f31304l) {
            C9180j c9180j7 = c9180j6.f31315k;
            short s12 = c9180j6.f31308d;
            int i12 = c9180j6.f31310f + s12;
            if (i12 > i11) {
                i11 = i12;
            }
            C9175e c9175e3 = c9180j6.f31314j;
            if ((c9180j6.f31305a & 16) != 0) {
                c9175e3 = c9175e3.f31280c;
            }
            c9180j6 = c9180j7;
            while (c9175e3 != null) {
                C9180j c9180j8 = c9175e3.f31279b;
                if (c9180j8.f31315k == null) {
                    int i13 = c9175e3.f31278a;
                    c9180j8.f31308d = (short) (i13 == Integer.MAX_VALUE ? 1 : i13 + s12);
                    c9180j8.f31315k = c9180j6;
                    c9180j6 = c9180j8;
                }
                c9175e3 = c9175e3.f31280c;
            }
        }
        this.f31337h = i11;
    }

    /* JADX INFO: renamed from: p */
    public int m35684p() {
        int iM35659b;
        if (this.f31330L != 0) {
            return this.f31331M + 6;
        }
        int i10 = this.f31339j.f31256b;
        if (i10 <= 0) {
            iM35659b = 8;
        } else {
            if (i10 > 65535) {
                throw new IndexOutOfBoundsException("Method code too large!");
            }
            this.f31332c.m35721o("Code");
            iM35659b = this.f31339j.f31256b + 16 + C9179i.m35659b(this.f31340k) + 8;
            if (this.f31348s != null) {
                this.f31332c.m35721o(this.f31332c.m35732z() >= 50 ? "StackMapTable" : "StackMap");
                iM35659b += this.f31348s.f31256b + 8;
            }
            if (this.f31342m != null) {
                this.f31332c.m35721o("LineNumberTable");
                iM35659b += this.f31342m.f31256b + 8;
            }
            if (this.f31344o != null) {
                this.f31332c.m35721o("LocalVariableTable");
                iM35659b += this.f31344o.f31256b + 8;
            }
            if (this.f31346q != null) {
                this.f31332c.m35721o("LocalVariableTypeTable");
                iM35659b += this.f31346q.f31256b + 8;
            }
        }
        if (this.f31349t > 0) {
            this.f31332c.m35721o("Exceptions");
            iM35659b += (this.f31349t * 2) + 8;
        }
        boolean z10 = this.f31332c.m35732z() < 49;
        if ((this.f31333d & 4096) != 0 && z10) {
            this.f31332c.m35721o("Synthetic");
            iM35659b += 6;
        }
        if (this.f31351v != 0) {
            this.f31332c.m35721o("Signature");
            iM35659b += 8;
        }
        if ((this.f31333d & 131072) != 0) {
            this.f31332c.m35721o("Deprecated");
            iM35659b += 6;
        }
        if (this.f31352w != null) {
            this.f31332c.m35721o("AnnotationDefault");
            iM35659b += this.f31352w.f31256b + 6;
        }
        if (this.f31354y == null) {
            return iM35659b;
        }
        this.f31332c.m35721o("MethodParameters");
        return iM35659b + this.f31354y.f31256b + 7;
    }

    /* JADX INFO: renamed from: q */
    public final void m35685q() {
        int i10 = this.f31355z;
        if (i10 != 4) {
            if (i10 == 1) {
                this.f31321C.f31310f = (short) this.f31323E;
                this.f31321C = null;
                return;
            }
            return;
        }
        C9180j c9180j = new C9180j();
        c9180j.f31312h = new C9178h(c9180j);
        C9172b c9172b = this.f31339j;
        c9180j.m35668g(c9172b.f31255a, c9172b.f31256b);
        this.f31320B.f31313i = c9180j;
        this.f31320B = c9180j;
        this.f31321C = null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m35686r() {
        return this.f31328J;
    }

    /* JADX INFO: renamed from: s */
    public boolean m35687s() {
        return this.f31347r > 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m35688t(int i10, int i11) {
        while (i10 < i11) {
            C9178h.m35643p(this.f31332c, this.f31326H[i10], this.f31348s);
            i10++;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m35689u() {
        char c10;
        int i10;
        int[] iArr = this.f31326H;
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = 0;
        int i14 = 3;
        if (this.f31332c.m35732z() < 50) {
            this.f31348s.m35628j(this.f31326H[0]).m35628j(i11);
            int i15 = i11 + 3;
            m35688t(3, i15);
            this.f31348s.m35628j(i12);
            m35688t(i15, i12 + i15);
            return;
        }
        int i16 = this.f31347r;
        int[] iArr2 = this.f31326H;
        int i17 = i16 == 0 ? iArr2[0] : (iArr2[0] - this.f31325G[0]) - 1;
        int i18 = this.f31325G[1];
        int i19 = i11 - i18;
        if (i12 == 0) {
            switch (i19) {
                case -3:
                case -2:
                case -1:
                    c10 = 248;
                    break;
                case 0:
                    c10 = i17 >= 64 ? (char) 251 : (char) 0;
                    break;
                case 1:
                case 2:
                case 3:
                    c10 = 252;
                    break;
                default:
                    c10 = 255;
                    break;
            }
        } else {
            c10 = (i19 == 0 && i12 == 1) ? i17 < 63 ? '@' : (char) 247 : (char) 255;
        }
        if (c10 != 255) {
            int i20 = 3;
            while (i13 < i18 && i13 < i11) {
                i10 = i14;
                if (this.f31326H[i20] != this.f31325G[i20]) {
                    c10 = 255;
                } else {
                    i20++;
                    i13++;
                    i14 = i10;
                }
            }
            i10 = i14;
        } else {
            i10 = i14;
        }
        if (c10 == 0) {
            this.f31348s.m35624f(i17);
            return;
        }
        if (c10 == '@') {
            this.f31348s.m35624f(i17 + 64);
            m35688t(i11 + 3, i11 + 4);
            return;
        }
        if (c10 == 247) {
            this.f31348s.m35624f(247).m35628j(i17);
            m35688t(i11 + 3, i11 + 4);
            return;
        }
        if (c10 == 248) {
            this.f31348s.m35624f(i19 + 251).m35628j(i17);
            return;
        }
        if (c10 == 251) {
            this.f31348s.m35624f(251).m35628j(i17);
            return;
        }
        C9172b c9172b = this.f31348s;
        if (c10 == 252) {
            int i21 = i10;
            c9172b.m35624f(i19 + 251).m35628j(i17);
            m35688t(i18 + i21, i11 + i21);
        } else {
            c9172b.m35624f(255).m35628j(i17).m35628j(i11);
            int i22 = i11 + 3;
            m35688t(i10, i22);
            this.f31348s.m35628j(i12);
            m35688t(i22, i12 + i22);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m35690v(C9172b c9172b) {
        int i10;
        boolean z10 = this.f31332c.m35732z() < 49;
        c9172b.m35628j((~(z10 ? 4096 : 0)) & this.f31333d).m35628j(this.f31334e).m35628j(this.f31335f);
        int i11 = this.f31339j.f31256b > 0 ? 1 : 0;
        if (this.f31349t > 0) {
            i11++;
        }
        int i12 = this.f31333d;
        if ((i12 & 4096) != 0 && z10) {
            i11++;
        }
        if (this.f31351v != 0) {
            i11++;
        }
        if ((i12 & 131072) != 0) {
            i11++;
        }
        if (this.f31352w != null) {
            i11++;
        }
        if (this.f31354y != null) {
            i11++;
        }
        c9172b.m35628j(i11);
        int i13 = this.f31339j.f31256b;
        if (i13 > 0) {
            int iM35659b = i13 + 10 + C9179i.m35659b(this.f31340k);
            C9172b c9172b2 = this.f31348s;
            if (c9172b2 != null) {
                iM35659b += c9172b2.f31256b + 8;
                i10 = 1;
            } else {
                i10 = 0;
            }
            C9172b c9172b3 = this.f31342m;
            if (c9172b3 != null) {
                iM35659b += c9172b3.f31256b + 8;
                i10++;
            }
            C9172b c9172b4 = this.f31344o;
            if (c9172b4 != null) {
                iM35659b += c9172b4.f31256b + 8;
                i10++;
            }
            C9172b c9172b5 = this.f31346q;
            if (c9172b5 != null) {
                iM35659b += c9172b5.f31256b + 8;
                i10++;
            }
            C9172b c9172bM35626h = c9172b.m35628j(this.f31332c.m35721o("Code")).m35626h(iM35659b).m35628j(this.f31337h).m35628j(this.f31338i).m35626h(this.f31339j.f31256b);
            C9172b c9172b6 = this.f31339j;
            c9172bM35626h.m35625g(c9172b6.f31255a, 0, c9172b6.f31256b);
            C9179i.m35660c(this.f31340k, c9172b);
            c9172b.m35628j(i10);
            if (this.f31348s != null) {
                C9172b c9172bM35628j = c9172b.m35628j(this.f31332c.m35721o(this.f31332c.m35732z() >= 50 ? "StackMapTable" : "StackMap")).m35626h(this.f31348s.f31256b + 2).m35628j(this.f31347r);
                C9172b c9172b7 = this.f31348s;
                c9172bM35628j.m35625g(c9172b7.f31255a, 0, c9172b7.f31256b);
            }
            if (this.f31342m != null) {
                C9172b c9172bM35628j2 = c9172b.m35628j(this.f31332c.m35721o("LineNumberTable")).m35626h(this.f31342m.f31256b + 2).m35628j(this.f31341l);
                C9172b c9172b8 = this.f31342m;
                c9172bM35628j2.m35625g(c9172b8.f31255a, 0, c9172b8.f31256b);
            }
            if (this.f31344o != null) {
                C9172b c9172bM35628j3 = c9172b.m35628j(this.f31332c.m35721o("LocalVariableTable")).m35626h(this.f31344o.f31256b + 2).m35628j(this.f31343n);
                C9172b c9172b9 = this.f31344o;
                c9172bM35628j3.m35625g(c9172b9.f31255a, 0, c9172b9.f31256b);
            }
            if (this.f31346q != null) {
                C9172b c9172bM35628j4 = c9172b.m35628j(this.f31332c.m35721o("LocalVariableTypeTable")).m35626h(this.f31346q.f31256b + 2).m35628j(this.f31345p);
                C9172b c9172b10 = this.f31346q;
                c9172bM35628j4.m35625g(c9172b10.f31255a, 0, c9172b10.f31256b);
            }
        }
        if (this.f31349t > 0) {
            c9172b.m35628j(this.f31332c.m35721o("Exceptions")).m35626h((this.f31349t * 2) + 2).m35628j(this.f31349t);
            for (int i14 : this.f31350u) {
                c9172b.m35628j(i14);
            }
        }
        if ((4096 & this.f31333d) != 0 && z10) {
            c9172b.m35628j(this.f31332c.m35721o("Synthetic")).m35626h(0);
        }
        if (this.f31351v != 0) {
            c9172b.m35628j(this.f31332c.m35721o("Signature")).m35626h(2).m35628j(this.f31351v);
        }
        if ((this.f31333d & 131072) != 0) {
            c9172b.m35628j(this.f31332c.m35721o("Deprecated")).m35626h(0);
        }
        if (this.f31352w != null) {
            C9172b c9172bM35626h2 = c9172b.m35628j(this.f31332c.m35721o("AnnotationDefault")).m35626h(this.f31352w.f31256b);
            C9172b c9172b11 = this.f31352w;
            c9172bM35626h2.m35625g(c9172b11.f31255a, 0, c9172b11.f31256b);
        }
        if (this.f31354y != null) {
            C9172b c9172bM35624f = c9172b.m35628j(this.f31332c.m35721o("MethodParameters")).m35626h(this.f31354y.f31256b + 1).m35624f(this.f31353x);
            C9172b c9172b12 = this.f31354y;
            c9172bM35624f.m35625g(c9172b12.f31255a, 0, c9172b12.f31256b);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m35691w(int i10, int i11) {
        this.f31326H[i10] = i11;
    }

    /* JADX INFO: renamed from: x */
    public void m35692x() {
        if (this.f31325G != null) {
            if (this.f31348s == null) {
                this.f31348s = new C9172b();
            }
            m35689u();
            this.f31347r++;
        }
        this.f31325G = this.f31326H;
        this.f31326H = null;
    }

    /* JADX INFO: renamed from: y */
    public int m35693y(int i10, int i11, int i12) {
        int i13 = i11 + 3 + i12;
        int[] iArr = this.f31326H;
        if (iArr == null || iArr.length < i13) {
            this.f31326H = new int[i13];
        }
        int[] iArr2 = this.f31326H;
        iArr2[0] = i10;
        iArr2[1] = i11;
        iArr2[2] = i12;
        return 3;
    }

    /* JADX INFO: renamed from: z */
    public final void m35694z(C9180j c9180j, C9180j[] c9180jArr) {
        C9180j c9180j2 = this.f31321C;
        if (c9180j2 != null) {
            int i10 = this.f31355z;
            if (i10 == 4) {
                c9180j2.f31312h.m35646c(Opcodes.LOOKUPSWITCH, 0, null, null);
                m35680l(0, c9180j);
                C9180j c9180jM35664c = c9180j.m35664c();
                c9180jM35664c.f31305a = (short) (c9180jM35664c.f31305a | 2);
                for (C9180j c9180j3 : c9180jArr) {
                    m35680l(0, c9180j3);
                    C9180j c9180jM35664c2 = c9180j3.m35664c();
                    c9180jM35664c2.f31305a = (short) (c9180jM35664c2.f31305a | 2);
                }
            } else if (i10 == 1) {
                int i11 = this.f31322D - 1;
                this.f31322D = i11;
                m35680l(i11, c9180j);
                for (C9180j c9180j4 : c9180jArr) {
                    m35680l(this.f31322D, c9180j4);
                }
            }
            m35685q();
        }
    }
}
