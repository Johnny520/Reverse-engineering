package p121i3;

import p024b9.AbstractC1043k;
import p215oc.C5706c;

/* JADX INFO: renamed from: i3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3173c {

    /* JADX INFO: renamed from: b */
    public static final a f8451b = new a(null);

    /* JADX INFO: renamed from: a */
    public final long f8452a;

    public /* synthetic */ C3173c(long j10) {
        this.f8452a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C3173c m11962a(long j10) {
        return new C3173c(j10);
    }

    /* JADX INFO: renamed from: c */
    public static final long m11964c(long j10, int i10, int i11, int i12, int i13) {
        if (!(i11 >= i10 && i13 >= i12 && i10 >= 0 && i12 >= 0)) {
            AbstractC3184n.m12039a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC3174d.m11991h(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m11965d(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = m11975n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = m11973l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = m11974m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = m11972k(j10);
        }
        return m11964c(j10, i15, i16, i17, i13);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11966e(long j10, Object obj) {
        return (obj instanceof C3173c) && j10 == ((C3173c) obj).m11978q();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m11967f(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m11968g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m11969h(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m11970i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m11971j(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final int m11972k(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    /* JADX INFO: renamed from: l */
    public static final int m11973l(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    /* JADX INFO: renamed from: m */
    public static final int m11974m(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    /* JADX INFO: renamed from: n */
    public static final int m11975n(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: o */
    public static int m11976o(long j10) {
        return Long.hashCode(j10);
    }

    /* JADX INFO: renamed from: p */
    public static String m11977p(long j10) {
        int iM11973l = m11973l(j10);
        String strValueOf = iM11973l == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM11973l);
        int iM11972k = m11972k(j10);
        return "Constraints(minWidth = " + m11975n(j10) + ", maxWidth = " + strValueOf + ", minHeight = " + m11974m(j10) + ", maxHeight = " + (iM11972k != Integer.MAX_VALUE ? String.valueOf(iM11972k) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m11966e(this.f8452a, obj);
    }

    public int hashCode() {
        return m11976o(this.f8452a);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ long m11978q() {
        return this.f8452a;
    }

    public String toString() {
        return m11977p(this.f8452a);
    }

    /* JADX INFO: renamed from: i3.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m11979a(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i12, 262142);
            int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        AbstractC3174d.m11995l(i15);
                        C5706c.m23089a();
                        return 0L;
                    }
                    i14 = 8190;
                }
            }
            return AbstractC3174d.m11984a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
        }

        /* JADX INFO: renamed from: b */
        public final long m11980b(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i10, 262142);
            int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        AbstractC3174d.m11995l(i15);
                        C5706c.m23089a();
                        return 0L;
                    }
                    i14 = 8190;
                }
            }
            return AbstractC3174d.m11984a(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: c */
        public final long m11981c(int i10, int i11) {
            if (!((i11 >= 0) & (i10 >= 0))) {
                AbstractC3184n.m12039a("width and height must be >= 0");
            }
            return AbstractC3174d.m11991h(i10, i10, i11, i11);
        }

        /* JADX INFO: renamed from: d */
        public final long m11982d(int i10) {
            if (!(i10 >= 0)) {
                AbstractC3184n.m12039a("height must be >= 0");
            }
            return AbstractC3174d.m11991h(0, Integer.MAX_VALUE, i10, i10);
        }

        /* JADX INFO: renamed from: e */
        public final long m11983e(int i10) {
            if (!(i10 >= 0)) {
                AbstractC3184n.m12039a("width must be >= 0");
            }
            return AbstractC3174d.m11991h(i10, i10, 0, Integer.MAX_VALUE);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m11963b(long j10) {
        return j10;
    }
}
