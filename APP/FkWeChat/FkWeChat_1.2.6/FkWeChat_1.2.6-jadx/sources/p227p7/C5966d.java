package p227p7;

import p023b8.AbstractC1011d;
import p023b8.C1016i;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: p7.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5966d extends AbstractC1011d {

    /* JADX INFO: renamed from: v */
    public final boolean f18902v;

    /* JADX INFO: renamed from: w */
    public static final a f18898w = new a(null);

    /* JADX INFO: renamed from: x */
    public static final C1016i f18899x = new C1016i("Before");

    /* JADX INFO: renamed from: y */
    public static final C1016i f18900y = new C1016i("Transform");

    /* JADX INFO: renamed from: z */
    public static final C1016i f18901z = new C1016i("Render");

    /* JADX INFO: renamed from: A */
    public static final C1016i f18894A = new C1016i("ContentEncoding");

    /* JADX INFO: renamed from: B */
    public static final C1016i f18895B = new C1016i("TransferEncoding");

    /* JADX INFO: renamed from: C */
    public static final C1016i f18896C = new C1016i("After");

    /* JADX INFO: renamed from: D */
    public static final C1016i f18897D = new C1016i("Engine");

    public C5966d(boolean z10) {
        super(f18899x, f18900y, f18901z, f18894A, f18895B, f18896C, f18897D);
        this.f18902v = z10;
    }

    @Override // p023b8.AbstractC1011d
    /* JADX INFO: renamed from: p */
    public boolean mo3742p() {
        return this.f18902v;
    }

    /* JADX INFO: renamed from: p7.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1016i m23959a() {
            return C5966d.f18897D;
        }

        /* JADX INFO: renamed from: b */
        public final C1016i m23960b() {
            return C5966d.f18901z;
        }

        /* JADX INFO: renamed from: c */
        public final C1016i m23961c() {
            return C5966d.f18900y;
        }

        public a() {
        }
    }
}
