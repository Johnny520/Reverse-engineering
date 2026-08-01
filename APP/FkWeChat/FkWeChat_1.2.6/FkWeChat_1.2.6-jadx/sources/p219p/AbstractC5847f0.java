package p219p;

import ec.InterfaceC2165o0;
import p010a9.InterfaceC0189q;
import p121i3.AbstractC3171a0;
import p121i3.C3196z;
import p165l1.InterfaceC4507m;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6434j;
import p250r1.C6455e;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5847f0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0189q f18344a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0189q f18345b = new b(null);

    /* JADX INFO: renamed from: p.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f18346q;

        public a(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
            return m23556r((InterfaceC2165o0) obj, ((C6455e) obj2).m25566t(), (InterfaceC5976f) obj3);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f18346q == 0) {
                AbstractC4713t.m18808b(obj);
                return C4700i0.f13910a;
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        /* JADX INFO: renamed from: r */
        public final Object m23556r(InterfaceC2165o0 interfaceC2165o0, long j10, InterfaceC5976f interfaceC5976f) {
            return new a(interfaceC5976f).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: p.f0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f18347q;

        public b(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
            return m23557r((InterfaceC2165o0) obj, ((Number) obj2).floatValue(), (InterfaceC5976f) obj3);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f18347q == 0) {
                AbstractC4713t.m18808b(obj);
                return C4700i0.f13910a;
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        /* JADX INFO: renamed from: r */
        public final Object m23557r(InterfaceC2165o0 interfaceC2165o0, float f10, InterfaceC5976f interfaceC5976f) {
            return new b(interfaceC5976f).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC4507m m23551f(InterfaceC4507m interfaceC4507m, InterfaceC5856i0 interfaceC5856i0, EnumC5898w0 enumC5898w0, boolean z10, InterfaceC6434j interfaceC6434j, boolean z11, InterfaceC0189q interfaceC0189q, InterfaceC0189q interfaceC0189q2, boolean z12) {
        return interfaceC4507m.mo17445i(new C5843e0(interfaceC5856i0, enumC5898w0, z10, interfaceC6434j, z11, interfaceC0189q, interfaceC0189q2, z12));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC4507m m23552g(InterfaceC4507m interfaceC4507m, InterfaceC5856i0 interfaceC5856i0, EnumC5898w0 enumC5898w0, boolean z10, InterfaceC6434j interfaceC6434j, boolean z11, InterfaceC0189q interfaceC0189q, InterfaceC0189q interfaceC0189q2, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            interfaceC6434j = null;
        }
        return m23551f(interfaceC4507m, interfaceC5856i0, enumC5898w0, z13, interfaceC6434j, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? f18344a : interfaceC0189q, (i10 & 64) != 0 ? f18345b : interfaceC0189q2, (i10 & 128) != 0 ? false : z12);
    }

    /* JADX INFO: renamed from: h */
    public static final float m23553h(long j10, EnumC5898w0 enumC5898w0) {
        return Float.intBitsToFloat((int) (enumC5898w0 == EnumC5898w0.f18786q ? j10 & 4294967295L : j10 >> 32));
    }

    /* JADX INFO: renamed from: i */
    public static final float m23554i(long j10, EnumC5898w0 enumC5898w0) {
        return enumC5898w0 == EnumC5898w0.f18786q ? C3196z.m12138i(j10) : C3196z.m12137h(j10);
    }

    /* JADX INFO: renamed from: j */
    public static final long m23555j(long j10) {
        return AbstractC3171a0.m11961a(Float.isNaN(C3196z.m12137h(j10)) ? 0.0f : C3196z.m12137h(j10), Float.isNaN(C3196z.m12138i(j10)) ? 0.0f : C3196z.m12138i(j10));
    }
}
