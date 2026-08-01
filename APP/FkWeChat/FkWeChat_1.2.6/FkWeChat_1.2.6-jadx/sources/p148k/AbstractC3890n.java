package p148k;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p163l.AbstractC4336n3;
import p163l.C4352r;
import p163l.InterfaceC4365t2;
import p265s1.AbstractC7138s1;
import p265s1.C7128q1;
import p276t1.AbstractC8027c;
import p276t1.C8043k;

/* JADX INFO: renamed from: k.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3890n {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0184l f11236a = a.f11237r;

    /* JADX INFO: renamed from: k.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f11237r = new a();

        /* JADX INFO: renamed from: k.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10131a extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public static final C10131a f11238r = new C10131a();

            public C10131a() {
                super(1);
            }

            /* JADX INFO: renamed from: a */
            public final C4352r m15442a(long j10) {
                long jM28127m = C7128q1.m28127m(j10, C8043k.f26795a.m30963x());
                return new C4352r(C7128q1.m28132r(jM28127m), C7128q1.m28136v(jM28127m), C7128q1.m28135u(jM28127m), C7128q1.m28133s(jM28127m));
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                return m15442a(((C7128q1) obj).m28139y());
            }
        }

        /* JADX INFO: renamed from: k.n$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ AbstractC8027c f11239r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC8027c abstractC8027c) {
                super(1);
                this.f11239r = abstractC8027c;
            }

            /* JADX INFO: renamed from: a */
            public final long m15443a(C4352r c4352r) {
                float fM17108g = c4352r.m17108g();
                if (fM17108g < 0.0f) {
                    fM17108g = 0.0f;
                }
                if (fM17108g > 1.0f) {
                    fM17108g = 1.0f;
                }
                float fM17109h = c4352r.m17109h();
                if (fM17109h < -0.5f) {
                    fM17109h = -0.5f;
                }
                if (fM17109h > 0.5f) {
                    fM17109h = 0.5f;
                }
                float fM17110i = c4352r.m17110i();
                float f10 = fM17110i >= -0.5f ? fM17110i : -0.5f;
                float f11 = f10 <= 0.5f ? f10 : 0.5f;
                float fM17107f = c4352r.m17107f();
                float f12 = fM17107f >= 0.0f ? fM17107f : 0.0f;
                return C7128q1.m28127m(AbstractC7138s1.m28197a(fM17108g, fM17109h, f11, f12 <= 1.0f ? f12 : 1.0f, C8043k.f26795a.m30963x()), this.f11239r);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                return C7128q1.m28125k(m15443a((C4352r) obj));
            }
        }

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4365t2 mo27m(AbstractC8027c abstractC8027c) {
            return AbstractC4336n3.m17024s(C10131a.f11238r, new b(abstractC8027c));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0184l m15440a(C7128q1.a aVar) {
        return f11236a;
    }
}
