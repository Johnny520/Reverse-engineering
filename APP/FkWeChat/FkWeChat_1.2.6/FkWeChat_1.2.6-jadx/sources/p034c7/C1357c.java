package p034c7;

import p023b8.AbstractC1011d;
import p023b8.C1016i;
import p024b9.AbstractC1043k;
import p210o7.C5651c;
import p227p7.C5966d;

/* JADX INFO: renamed from: c7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1357c extends AbstractC1011d {

    /* JADX INFO: renamed from: C */
    public static final C1016i f4012C;

    /* JADX INFO: renamed from: D */
    public static final C1016i f4013D;

    /* JADX INFO: renamed from: E */
    public static final C1016i f4014E;

    /* JADX INFO: renamed from: F */
    public static final C1016i f4015F;

    /* JADX INFO: renamed from: v */
    public final boolean f4017v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC1359d f4018w;

    /* JADX INFO: renamed from: x */
    public final C5651c f4019x;

    /* JADX INFO: renamed from: y */
    public final C5966d f4020y;

    /* JADX INFO: renamed from: z */
    public static final a f4016z = new a(null);

    /* JADX INFO: renamed from: A */
    public static final C1016i f4010A = new C1016i("Setup");

    /* JADX INFO: renamed from: B */
    public static final C1016i f4011B = new C1016i("Monitoring");

    static {
        C1016i c1016i = new C1016i("Plugins");
        f4012C = c1016i;
        f4013D = new C1016i("Call");
        f4014E = new C1016i("Fallback");
        f4015F = c1016i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1357c(boolean z10, InterfaceC1359d interfaceC1359d) {
        super(f4010A, f4011B, f4012C, f4013D, f4014E);
        interfaceC1359d.getClass();
        this.f4017v = z10;
        this.f4018w = interfaceC1359d;
        this.f4019x = new C5651c(z10);
        this.f4020y = new C5966d(z10);
    }

    /* JADX INFO: renamed from: Q */
    public final InterfaceC1359d m5377Q() {
        return this.f4018w;
    }

    /* JADX INFO: renamed from: R */
    public final C5651c m5378R() {
        return this.f4019x;
    }

    /* JADX INFO: renamed from: S */
    public final C5966d m5379S() {
        return this.f4020y;
    }

    @Override // p023b8.AbstractC1011d
    /* JADX INFO: renamed from: p */
    public final boolean mo3742p() {
        return this.f4017v;
    }

    /* JADX INFO: renamed from: c7.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1016i m5380a() {
            return C1357c.f4013D;
        }

        /* JADX INFO: renamed from: b */
        public final C1016i m5381b() {
            return C1357c.f4014E;
        }

        /* JADX INFO: renamed from: c */
        public final C1016i m5382c() {
            return C1357c.f4012C;
        }

        public a() {
        }
    }
}
