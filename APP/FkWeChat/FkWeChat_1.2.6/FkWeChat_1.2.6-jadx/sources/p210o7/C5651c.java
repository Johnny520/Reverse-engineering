package p210o7;

import p023b8.AbstractC1011d;
import p023b8.C1016i;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: o7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5651c extends AbstractC1011d {

    /* JADX INFO: renamed from: w */
    public static final a f17779w = new a(null);

    /* JADX INFO: renamed from: x */
    public static final C1016i f17780x = new C1016i("Before");

    /* JADX INFO: renamed from: y */
    public static final C1016i f17781y = new C1016i("Transform");

    /* JADX INFO: renamed from: z */
    public static final C1016i f17782z = new C1016i("After");

    /* JADX INFO: renamed from: v */
    public final boolean f17783v;

    public C5651c(boolean z10) {
        super(f17780x, f17781y, f17782z);
        this.f17783v = z10;
    }

    @Override // p023b8.AbstractC1011d
    /* JADX INFO: renamed from: p */
    public boolean mo3742p() {
        return this.f17783v;
    }

    /* JADX INFO: renamed from: o7.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C1016i m22854a() {
            return C5651c.f17780x;
        }

        /* JADX INFO: renamed from: b */
        public final C1016i m22855b() {
            return C5651c.f17781y;
        }

        public a() {
        }
    }
}
