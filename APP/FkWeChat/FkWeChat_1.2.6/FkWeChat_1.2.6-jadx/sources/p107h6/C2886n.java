package p107h6;

import p024b9.AbstractC1043k;
import p376zd.C10003m;
import p376zd.InterfaceC9997j;

/* JADX INFO: renamed from: h6.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2886n {

    /* JADX INFO: renamed from: b */
    public static final a f7614b = new a(null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC9997j f7615a;

    public C2886n(InterfaceC9997j interfaceC9997j) {
        interfaceC9997j.getClass();
        this.f7615a = interfaceC9997j;
    }

    /* JADX INFO: renamed from: a */
    public final void m10496a(C10003m c10003m) {
        c10003m.getClass();
        this.f7615a.mo38736y0(c10003m);
    }

    /* JADX INFO: renamed from: b */
    public final void m10497b(int i10) {
        this.f7615a.mo38674E(i10);
    }

    /* JADX INFO: renamed from: c */
    public final void m10498c(long j10) {
        this.f7615a.mo38737z(j10);
    }

    /* JADX INFO: renamed from: d */
    public final void m10499d(int i10) {
        if (i10 >= 0) {
            m10502g(i10);
        } else {
            m10503h(i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10500e(String str) {
        str.getClass();
        this.f7615a.mo38698a0(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m10501f(int i10, EnumC2875c enumC2875c) {
        enumC2875c.getClass();
        m10502g(f7614b.m10509f(i10, enumC2875c));
    }

    /* JADX INFO: renamed from: g */
    public final void m10502g(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            InterfaceC9997j interfaceC9997j = this.f7615a;
            if (i11 == 0) {
                interfaceC9997j.writeByte(i10);
                return;
            } else {
                interfaceC9997j.writeByte((i10 & 127) | 128);
                i10 >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10503h(long j10) {
        while (true) {
            long j11 = (-128) & j10;
            InterfaceC9997j interfaceC9997j = this.f7615a;
            if (j11 == 0) {
                interfaceC9997j.writeByte((int) j10);
                return;
            } else {
                interfaceC9997j.writeByte((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: h6.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m10504a(int i10) {
            return (-(i10 & 1)) ^ (i10 >>> 1);
        }

        /* JADX INFO: renamed from: b */
        public final long m10505b(long j10) {
            return (-(j10 & 1)) ^ (j10 >>> 1);
        }

        /* JADX INFO: renamed from: c */
        public final int m10506c(int i10) {
            return (i10 >> 31) ^ (i10 << 1);
        }

        /* JADX INFO: renamed from: d */
        public final long m10507d(long j10) {
            return (j10 >> 63) ^ (j10 << 1);
        }

        /* JADX INFO: renamed from: e */
        public final int m10508e(int i10) {
            if (i10 >= 0) {
                return m10511h(i10);
            }
            return 10;
        }

        /* JADX INFO: renamed from: f */
        public final int m10509f(int i10, EnumC2875c enumC2875c) {
            enumC2875c.getClass();
            return (i10 << 3) | enumC2875c.m10333c();
        }

        /* JADX INFO: renamed from: g */
        public final int m10510g(int i10) {
            return m10511h(m10509f(i10, EnumC2875c.f7536s));
        }

        /* JADX INFO: renamed from: h */
        public final int m10511h(int i10) {
            if ((i10 & (-128)) == 0) {
                return 1;
            }
            if ((i10 & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & i10) == 0) {
                return 3;
            }
            return (i10 & (-268435456)) == 0 ? 4 : 5;
        }

        /* JADX INFO: renamed from: i */
        public final int m10512i(long j10) {
            if (((-128) & j10) == 0) {
                return 1;
            }
            if (((-16384) & j10) == 0) {
                return 2;
            }
            if (((-2097152) & j10) == 0) {
                return 3;
            }
            if (((-268435456) & j10) == 0) {
                return 4;
            }
            if (((-34359738368L) & j10) == 0) {
                return 5;
            }
            if (((-4398046511104L) & j10) == 0) {
                return 6;
            }
            if (((-562949953421312L) & j10) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & j10) == 0) {
                return 8;
            }
            return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
        }

        public a() {
        }
    }
}
