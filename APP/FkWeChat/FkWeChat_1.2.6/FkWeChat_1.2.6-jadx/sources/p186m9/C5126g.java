package p186m9;

import p024b9.AbstractC1043k;
import p082fb.C2404f;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;

/* JADX INFO: renamed from: m9.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5126g extends AbstractC5128i {

    /* JADX INFO: renamed from: h */
    public static final a f15439h = new a(null);

    /* JADX INFO: renamed from: i */
    public static final InterfaceC4705l f15440i = AbstractC4706m.m18787a(C5125f.f15438q);

    public C5126g(boolean z10) {
        super(new C2404f("DefaultBuiltIns"));
        if (z10) {
            m20917f(false);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static final C5126g m20829G0() {
        return new C5126g(false, 1, null);
    }

    /* JADX INFO: renamed from: m9.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5126g m20832a() {
            return (C5126g) C5126g.f15440i.getValue();
        }

        public a() {
        }
    }

    public /* synthetic */ C5126g(boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
