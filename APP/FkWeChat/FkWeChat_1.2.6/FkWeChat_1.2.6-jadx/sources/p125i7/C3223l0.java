package p125i7;

import p023b8.AbstractC1011d;
import p023b8.C1016i;
import p024b9.AbstractC1043k;
import p210o7.C5651c;
import p227p7.C5966d;

/* JADX INFO: renamed from: i7.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3223l0 extends AbstractC1011d {

    /* JADX INFO: renamed from: v */
    public final boolean f8629v;

    /* JADX INFO: renamed from: w */
    public final C5651c f8630w;

    /* JADX INFO: renamed from: x */
    public final C5966d f8631x;

    /* JADX INFO: renamed from: y */
    public static final a f8627y = new a(null);

    /* JADX INFO: renamed from: z */
    public static final C1016i f8628z = new C1016i("before");

    /* JADX INFO: renamed from: A */
    public static final C1016i f8626A = new C1016i("call");

    public C3223l0(boolean z10) {
        super(f8628z, f8626A);
        this.f8629v = z10;
        this.f8630w = new C5651c(mo3742p());
        this.f8631x = new C5966d(mo3742p());
    }

    /* JADX INFO: renamed from: P */
    public final C5651c m12248P() {
        return this.f8630w;
    }

    /* JADX INFO: renamed from: Q */
    public final C5966d m12249Q() {
        return this.f8631x;
    }

    @Override // p023b8.AbstractC1011d
    /* JADX INFO: renamed from: p */
    public boolean mo3742p() {
        return this.f8629v;
    }

    /* JADX INFO: renamed from: i7.l0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1016i m12250a() {
            return C3223l0.f8628z;
        }

        /* JADX INFO: renamed from: b */
        public final C1016i m12251b() {
            return C3223l0.f8626A;
        }

        public a() {
        }
    }
}
