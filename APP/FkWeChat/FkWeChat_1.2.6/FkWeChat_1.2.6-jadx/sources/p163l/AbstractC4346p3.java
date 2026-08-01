package p163l;

/* JADX INFO: renamed from: l.p3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4346p3 {

    /* JADX INFO: renamed from: a */
    public static final int[] f12703a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final float[] f12704b = new float[0];

    /* JADX INFO: renamed from: c */
    public static final C4377w f12705c = new C4377w(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    /* JADX INFO: renamed from: l.p3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC4367u {

        /* JADX INFO: renamed from: a */
        public final C4323l0[] f12706a;

        public a(AbstractC4357s abstractC4357s, float f10, float f11) {
            int iMo17033b = abstractC4357s.mo17033b();
            C4323l0[] c4323l0Arr = new C4323l0[iMo17033b];
            for (int i10 = 0; i10 < iMo17033b; i10++) {
                c4323l0Arr[i10] = new C4323l0(f10, f11, abstractC4357s.mo17032a(i10));
            }
            this.f12706a = c4323l0Arr;
        }

        @Override // p163l.InterfaceC4367u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4323l0 get(int i10) {
            return this.f12706a[i10];
        }
    }

    /* JADX INFO: renamed from: l.p3$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC4367u {

        /* JADX INFO: renamed from: a */
        public final C4323l0 f12707a;

        public b(float f10, float f11) {
            this.f12707a = new C4323l0(f10, f11, 0.0f, 4, null);
        }

        @Override // p163l.InterfaceC4367u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4323l0 get(int i10) {
            return this.f12707a;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final long m17055e(InterfaceC4356r3 interfaceC4356r3, long j10) {
        long jMo16781f = j10 - ((long) interfaceC4356r3.mo16781f());
        long jMo16782g = interfaceC4356r3.mo16782g();
        if (jMo16781f < 0) {
            jMo16781f = 0;
        }
        return jMo16781f > jMo16782g ? jMo16782g : jMo16781f;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC4367u m17056f(AbstractC4357s abstractC4357s, float f10, float f11) {
        return abstractC4357s != null ? new a(abstractC4357s, f10, f11) : new b(f10, f11);
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC4357s m17057g(InterfaceC4341o3 interfaceC4341o3, long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        return interfaceC4341o3.mo16779d(j10 * 1000000, abstractC4357s, abstractC4357s2, abstractC4357s3);
    }
}
