package p135j2;

/* JADX INFO: renamed from: j2.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3527h {

    /* JADX INFO: renamed from: a */
    public static final a f9763a = a.f9764a;

    /* JADX INFO: renamed from: j2.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f9764a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC3527h f9765b = new C10118a();

        /* JADX INFO: renamed from: c */
        public static final InterfaceC3527h f9766c = new e();

        /* JADX INFO: renamed from: d */
        public static final InterfaceC3527h f9767d = new c();

        /* JADX INFO: renamed from: e */
        public static final InterfaceC3527h f9768e = new d();

        /* JADX INFO: renamed from: f */
        public static final InterfaceC3527h f9769f = new f();

        /* JADX INFO: renamed from: g */
        public static final C3539k f9770g = new C3539k(1.0f);

        /* JADX INFO: renamed from: h */
        public static final InterfaceC3527h f9771h = new b();

        /* JADX INFO: renamed from: j2.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10118a implements InterfaceC3527h {
            @Override // p135j2.InterfaceC3527h
            /* JADX INFO: renamed from: a */
            public long mo13126a(long j10, long j11) {
                float fM13141c = AbstractC3531i.m13141c(j10, j11);
                return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(fM13141c)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM13141c))));
            }
        }

        /* JADX INFO: renamed from: j2.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b implements InterfaceC3527h {
            @Override // p135j2.InterfaceC3527h
            /* JADX INFO: renamed from: a */
            public long mo13126a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
                return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: j2.h$a$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c implements InterfaceC3527h {
            @Override // p135j2.InterfaceC3527h
            /* JADX INFO: renamed from: a */
            public long mo13126a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L));
                return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: j2.h$a$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d implements InterfaceC3527h {
            @Override // p135j2.InterfaceC3527h
            /* JADX INFO: renamed from: a */
            public long mo13126a(long j10, long j11) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: j2.h$a$e */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class e implements InterfaceC3527h {
            @Override // p135j2.InterfaceC3527h
            /* JADX INFO: renamed from: a */
            public long mo13126a(long j10, long j11) {
                float fM13142d = AbstractC3531i.m13142d(j10, j11);
                return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(fM13142d)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM13142d))));
            }
        }

        /* JADX INFO: renamed from: j2.h$a$f */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class f implements InterfaceC3527h {
            @Override // p135j2.InterfaceC3527h
            /* JADX INFO: renamed from: a */
            public long mo13126a(long j10, long j11) {
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & 4294967295L)) <= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                    return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                }
                float fM13142d = AbstractC3531i.m13142d(j10, j11);
                return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(fM13142d)) << 32) | (((long) Float.floatToRawIntBits(fM13142d)) & 4294967295L));
            }
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC3527h m13127a() {
            return f9765b;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC3527h m13128b() {
            return f9766c;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC3527h m13129c() {
            return f9769f;
        }
    }

    /* JADX INFO: renamed from: a */
    long mo13126a(long j10, long j11);
}
