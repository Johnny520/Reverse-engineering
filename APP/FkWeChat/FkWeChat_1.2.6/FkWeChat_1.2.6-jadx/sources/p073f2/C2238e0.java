package p073f2;

import java.util.List;
import p024b9.AbstractC1043k;
import p117i.C3037a0;

/* JADX INFO: renamed from: f2.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2238e0 {

    /* JADX INFO: renamed from: a */
    public final C3037a0 f6140a = new C3037a0(0, 1, null);

    /* JADX INFO: renamed from: a */
    public final void m8094a() {
        this.f6140a.m11220a();
    }

    /* JADX INFO: renamed from: b */
    public final C2241g m8095b(C2240f0 c2240f0, InterfaceC2266s0 interfaceC2266s0) {
        long jM8098c;
        boolean zM8096a;
        long jMo8254q;
        C3037a0 c3037a0 = new C3037a0(c2240f0.m8121b().size());
        List listM8121b = c2240f0.m8121b();
        int size = listM8121b.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2242g0 c2242g0 = (C2242g0) listM8121b.get(i10);
            a aVar = (a) this.f6140a.m11223d(c2242g0.m8131d());
            if (aVar == null) {
                zM8096a = false;
                jM8098c = c2242g0.m8138k();
                jMo8254q = c2242g0.m8133f();
            } else {
                jM8098c = aVar.m8098c();
                zM8096a = aVar.m8096a();
                jMo8254q = interfaceC2266s0.mo8254q(aVar.m8097b());
            }
            c3037a0.m11227i(c2242g0.m8131d(), new C2236d0(c2242g0.m8131d(), c2242g0.m8138k(), c2242g0.m8133f(), c2242g0.m8129b(), c2242g0.m8135h(), jM8098c, jMo8254q, zM8096a, false, c2242g0.m8137j(), c2242g0.m8130c(), c2242g0.m8136i(), c2242g0.m8132e(), null));
            boolean zM8129b = c2242g0.m8129b();
            C3037a0 c3037a02 = this.f6140a;
            if (zM8129b) {
                c3037a02.m11227i(c2242g0.m8131d(), new a(c2242g0.m8138k(), c2242g0.m8134g(), c2242g0.m8129b(), null));
            } else {
                c3037a02.m11228j(c2242g0.m8131d());
            }
        }
        return new C2241g(c3037a0, c2240f0);
    }

    /* JADX INFO: renamed from: f2.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f6141a;

        /* JADX INFO: renamed from: b */
        public final long f6142b;

        /* JADX INFO: renamed from: c */
        public final boolean f6143c;

        public a(long j10, long j11, boolean z10) {
            this.f6141a = j10;
            this.f6142b = j11;
            this.f6143c = z10;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m8096a() {
            return this.f6143c;
        }

        /* JADX INFO: renamed from: b */
        public final long m8097b() {
            return this.f6142b;
        }

        /* JADX INFO: renamed from: c */
        public final long m8098c() {
            return this.f6141a;
        }

        public /* synthetic */ a(long j10, long j11, boolean z10, AbstractC1043k abstractC1043k) {
            this(j10, j11, z10);
        }
    }
}
