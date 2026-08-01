package p135j2;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p135j2.AbstractC3545l1;
import p250r1.C6455e;

/* JADX INFO: renamed from: j2.h2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3530h2 extends AbstractC3571t1 {

    /* JADX INFO: renamed from: b */
    public static final a f9773b = new a(null);

    public C3530h2(InterfaceC0188p interfaceC0188p) {
        super(interfaceC0188p, null);
    }

    @Override // p135j2.AbstractC3571t1
    /* JADX INFO: renamed from: a */
    public float mo13133a(float f10, InterfaceC3578w interfaceC3578w, InterfaceC3578w interfaceC3578w2) {
        return Float.intBitsToFloat((int) (interfaceC3578w2.mo13253v(interfaceC3578w, C6455e.m25551e((((long) Float.floatToRawIntBits(((int) (interfaceC3578w.mo13242a() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32))) >> 32));
    }

    /* JADX INFO: renamed from: j2.h2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: j2.h2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10119a extends AbstractC1067w implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C3530h2[] f9774r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10119a(C3530h2[] c3530h2Arr) {
                super(2);
                this.f9774r = c3530h2Arr;
            }

            /* JADX INFO: renamed from: a */
            public final Float m13137a(AbstractC3545l1.a aVar, float f10) {
                return Float.valueOf(AbstractC3574u1.m13366b(aVar, true, this.f9774r, f10));
            }

            @Override // p010a9.InterfaceC0188p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m13137a((AbstractC3545l1.a) obj, ((Number) obj2).floatValue());
            }
        }

        /* JADX INFO: renamed from: j2.h2$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC1067w implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C3530h2[] f9775r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3530h2[] c3530h2Arr) {
                super(2);
                this.f9775r = c3530h2Arr;
            }

            /* JADX INFO: renamed from: a */
            public final Float m13138a(AbstractC3545l1.a aVar, float f10) {
                return Float.valueOf(AbstractC3574u1.m13366b(aVar, false, this.f9775r, f10));
            }

            @Override // p010a9.InterfaceC0188p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m13138a((AbstractC3545l1.a) obj, ((Number) obj2).floatValue());
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3530h2 m13134a(InterfaceC0188p interfaceC0188p) {
            return new C3530h2(interfaceC0188p, null);
        }

        /* JADX INFO: renamed from: b */
        public final C3530h2 m13135b(C3530h2... c3530h2Arr) {
            return m13134a(new C10119a(c3530h2Arr));
        }

        /* JADX INFO: renamed from: c */
        public final C3530h2 m13136c(C3530h2... c3530h2Arr) {
            return m13134a(new b(c3530h2Arr));
        }

        public a() {
        }
    }

    public /* synthetic */ C3530h2(InterfaceC0188p interfaceC0188p, AbstractC1043k abstractC1043k) {
        this(interfaceC0188p);
    }

    public C3530h2() {
        this(null);
    }
}
