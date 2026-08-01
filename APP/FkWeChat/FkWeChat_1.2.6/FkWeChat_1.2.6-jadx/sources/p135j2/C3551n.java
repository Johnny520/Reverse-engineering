package p135j2;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p135j2.AbstractC3545l1;
import p250r1.C6455e;

/* JADX INFO: renamed from: j2.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3551n extends AbstractC3571t1 {

    /* JADX INFO: renamed from: b */
    public static final a f9883b = new a(null);

    public C3551n(InterfaceC0188p interfaceC0188p) {
        super(interfaceC0188p, null);
    }

    @Override // p135j2.AbstractC3571t1
    /* JADX INFO: renamed from: a */
    public float mo13133a(float f10, InterfaceC3578w interfaceC3578w, InterfaceC3578w interfaceC3578w2) {
        return Float.intBitsToFloat((int) (interfaceC3578w2.mo13253v(interfaceC3578w, C6455e.m25551e((((long) Float.floatToRawIntBits(((int) (interfaceC3578w.mo13242a() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L))) & 4294967295L));
    }

    /* JADX INFO: renamed from: j2.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: j2.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10120a extends AbstractC1067w implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C3551n[] f9884r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10120a(C3551n[] c3551nArr) {
                super(2);
                this.f9884r = c3551nArr;
            }

            /* JADX INFO: renamed from: a */
            public final Float m13321a(AbstractC3545l1.a aVar, float f10) {
                return Float.valueOf(AbstractC3574u1.m13366b(aVar, true, this.f9884r, f10));
            }

            @Override // p010a9.InterfaceC0188p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m13321a((AbstractC3545l1.a) obj, ((Number) obj2).floatValue());
            }
        }

        /* JADX INFO: renamed from: j2.n$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends AbstractC1067w implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C3551n[] f9885r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3551n[] c3551nArr) {
                super(2);
                this.f9885r = c3551nArr;
            }

            /* JADX INFO: renamed from: a */
            public final Float m13322a(AbstractC3545l1.a aVar, float f10) {
                return Float.valueOf(AbstractC3574u1.m13366b(aVar, false, this.f9885r, f10));
            }

            @Override // p010a9.InterfaceC0188p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m13322a((AbstractC3545l1.a) obj, ((Number) obj2).floatValue());
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3551n m13319a(C3551n... c3551nArr) {
            return new C3551n(new C10120a(c3551nArr), null);
        }

        /* JADX INFO: renamed from: b */
        public final C3551n m13320b(C3551n... c3551nArr) {
            return new C3551n(new b(c3551nArr), null);
        }

        public a() {
        }
    }

    public /* synthetic */ C3551n(InterfaceC0188p interfaceC0188p, AbstractC1043k abstractC1043k) {
        this(interfaceC0188p);
    }

    public C3551n() {
        this(null);
    }
}
