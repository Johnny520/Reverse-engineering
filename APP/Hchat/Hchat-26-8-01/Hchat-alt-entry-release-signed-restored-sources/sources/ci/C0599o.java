package ci;

import gg.C1424t;
import p036c9.C0446i;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0599o extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1877h;

    /* JADX INFO: renamed from: i */
    public C1424t f1878i;

    /* JADX INFO: renamed from: j */
    public int f1879j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f1880k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1881l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ float f1882m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0599o(Object obj, float f3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1877h = i9;
        this.f1881l = obj;
        this.f1882m = f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1877h) {
            case 0:
                C0599o c0599o = new C0599o((C0601p) this.f1881l, this.f1882m, interfaceC5557c, 0);
                c0599o.f1880k = obj;
                return c0599o;
            case 1:
                C0599o c0599o2 = new C0599o((C0601p) this.f1881l, this.f1882m, interfaceC5557c, 1);
                c0599o2.f1880k = obj;
                return c0599o2;
            default:
                C0599o c0599o3 = new C0599o((C0580e0) this.f1881l, this.f1882m, interfaceC5557c, 2);
                c0599o3.f1880k = obj;
                return c0599o3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f1877h) {
        }
        return ((C0599o) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: all -> 0x001c, TRY_ENTER, TryCatch #2 {all -> 0x001c, blocks: (B:8:0x0018, B:22:0x0066, B:15:0x003e, B:17:0x0044), top: B:95:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #1 {all -> 0x00a6, blocks: (B:37:0x00a2, B:51:0x00ef, B:44:0x00c8, B:46:0x00ce), top: B:93:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155 A[Catch: all -> 0x0133, TRY_ENTER, TryCatch #0 {all -> 0x0133, blocks: (B:66:0x012f, B:80:0x017c, B:73:0x0155, B:75:0x015b), top: B:91:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:22:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ec -> B:51:0x00ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0179 -> B:80:0x017c). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final C1424t c1424t;
        boolean zBooleanValue;
        final C1424t c1424t2;
        boolean zBooleanValue2;
        C1424t c1424t3;
        boolean zBooleanValue3;
        switch (this.f1877h) {
            case 0:
                final C0601p c0601p = (C0601p) this.f1881l;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1880k;
                int i9 = this.f1879j;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c0601p.f1891h.m1626a(c0601p.f1884a, this.f1882m);
                    c1424t = new C1424t();
                    c1424t.f4737g = -1L;
                    zBooleanValue = false;
                    if (!zBooleanValue) {
                    }
                    return C3967n.f12976a;
                }
                if (i9 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C1424t c1424t4 = this.f1878i;
                try {
                    AbstractC1089i.m2732I0(obj);
                    C1424t c1424t5 = c1424t4;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    c1424t = c1424t5;
                    if (!zBooleanValue || !AbstractC3603v.m7561o(interfaceC3599t)) {
                        return C3967n.f12976a;
                    }
                    final int i10 = 0;
                    InterfaceC1231l interfaceC1231l = new InterfaceC1231l() { // from class: ci.n
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj2) {
                            boolean zM1627b;
                            boolean zM1627b2;
                            switch (i10) {
                                case 0:
                                    C0601p c0601p2 = c0601p;
                                    C0602p0 c0602p0 = c0601p2.f1891h;
                                    long jLongValue = ((Long) obj2).longValue();
                                    C1424t c1424t6 = c1424t;
                                    if (c1424t6.f4737g == -1) {
                                        c1424t6.f4737g = jLongValue;
                                        zM1627b = false;
                                    } else {
                                        c1424t6.f4737g = jLongValue;
                                        zM1627b = c0602p0.m1627b((jLongValue - r4) / 1.0E9f);
                                        c0601p2.m1621g((float) c0602p0.f1901c);
                                        c0601p2.f1887d = AbstractC0592k0.m1604b(c0601p2.f1884a, c0601p2.f1890g) * Math.signum(c0601p2.f1884a);
                                    }
                                    return Boolean.valueOf(zM1627b);
                                default:
                                    C0601p c0601p3 = c0601p;
                                    C0602p0 c0602p02 = c0601p3.f1892i;
                                    long jLongValue2 = ((Long) obj2).longValue();
                                    C1424t c1424t7 = c1424t;
                                    if (c1424t7.f4737g == -1) {
                                        c1424t7.f4737g = jLongValue2;
                                        zM1627b2 = false;
                                    } else {
                                        c1424t7.f4737g = jLongValue2;
                                        zM1627b2 = c0602p02.m1627b((jLongValue2 - r4) / 1.0E9f);
                                        c0601p3.m1622h((float) c0602p02.f1901c);
                                        c0601p3.f1888e = AbstractC0592k0.m1604b(c0601p3.f1885b, c0601p3.f1889f) * Math.signum(c0601p3.f1885b);
                                    }
                                    return Boolean.valueOf(zM1627b2);
                            }
                        }
                    };
                    this.f1880k = interfaceC3599t;
                    this.f1878i = c1424t;
                    this.f1879j = 1;
                    Object objM4458d = AbstractC1874r.m4637s(getContext()).m4458d(interfaceC1231l, this);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM4458d == enumC5799a) {
                        return enumC5799a;
                    }
                    c1424t4 = c1424t;
                    obj = objM4458d;
                    C1424t c1424t52 = c1424t4;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    c1424t = c1424t52;
                    if (!zBooleanValue) {
                    }
                    return C3967n.f12976a;
                } finally {
                    if (Math.abs(c0601p.f1884a) <= 1.0f) {
                        c0601p.m1621g(0.0f);
                        c0601p.f1887d = 0.0f;
                    }
                }
            case 1:
                final C0601p c0601p2 = (C0601p) this.f1881l;
                InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f1880k;
                int i11 = this.f1879j;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c0601p2.f1892i.m1626a(c0601p2.f1885b, this.f1882m);
                    c1424t2 = new C1424t();
                    c1424t2.f4737g = -1L;
                    zBooleanValue2 = false;
                    if (!zBooleanValue2) {
                    }
                    return C3967n.f12976a;
                }
                if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C1424t c1424t6 = this.f1878i;
                try {
                    AbstractC1089i.m2732I0(obj);
                    C1424t c1424t7 = c1424t6;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    c1424t2 = c1424t7;
                    if (!zBooleanValue2 || !AbstractC3603v.m7561o(interfaceC3599t2)) {
                        return C3967n.f12976a;
                    }
                    final int i12 = 1;
                    InterfaceC1231l interfaceC1231l2 = new InterfaceC1231l() { // from class: ci.n
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1231l
                        public final Object invoke(Object obj2) {
                            boolean zM1627b;
                            boolean zM1627b2;
                            switch (i12) {
                                case 0:
                                    C0601p c0601p22 = c0601p2;
                                    C0602p0 c0602p0 = c0601p22.f1891h;
                                    long jLongValue = ((Long) obj2).longValue();
                                    C1424t c1424t62 = c1424t2;
                                    if (c1424t62.f4737g == -1) {
                                        c1424t62.f4737g = jLongValue;
                                        zM1627b = false;
                                    } else {
                                        c1424t62.f4737g = jLongValue;
                                        zM1627b = c0602p0.m1627b((jLongValue - r4) / 1.0E9f);
                                        c0601p22.m1621g((float) c0602p0.f1901c);
                                        c0601p22.f1887d = AbstractC0592k0.m1604b(c0601p22.f1884a, c0601p22.f1890g) * Math.signum(c0601p22.f1884a);
                                    }
                                    return Boolean.valueOf(zM1627b);
                                default:
                                    C0601p c0601p3 = c0601p2;
                                    C0602p0 c0602p02 = c0601p3.f1892i;
                                    long jLongValue2 = ((Long) obj2).longValue();
                                    C1424t c1424t72 = c1424t2;
                                    if (c1424t72.f4737g == -1) {
                                        c1424t72.f4737g = jLongValue2;
                                        zM1627b2 = false;
                                    } else {
                                        c1424t72.f4737g = jLongValue2;
                                        zM1627b2 = c0602p02.m1627b((jLongValue2 - r4) / 1.0E9f);
                                        c0601p3.m1622h((float) c0602p02.f1901c);
                                        c0601p3.f1888e = AbstractC0592k0.m1604b(c0601p3.f1885b, c0601p3.f1889f) * Math.signum(c0601p3.f1885b);
                                    }
                                    return Boolean.valueOf(zM1627b2);
                            }
                        }
                    };
                    this.f1880k = interfaceC3599t2;
                    this.f1878i = c1424t2;
                    this.f1879j = 1;
                    Object objM4458d2 = AbstractC1874r.m4637s(getContext()).m4458d(interfaceC1231l2, this);
                    EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                    if (objM4458d2 == enumC5799a2) {
                        return enumC5799a2;
                    }
                    c1424t6 = c1424t2;
                    obj = objM4458d2;
                    C1424t c1424t72 = c1424t6;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    c1424t2 = c1424t72;
                    if (!zBooleanValue2) {
                    }
                    return C3967n.f12976a;
                } finally {
                    if (Math.abs(c0601p2.f1885b) <= 1.0f) {
                        c0601p2.m1622h(0.0f);
                        c0601p2.f1888e = 0.0f;
                    }
                }
            default:
                C0580e0 c0580e0 = (C0580e0) this.f1881l;
                float f3 = c0580e0.f1794B;
                InterfaceC3599t interfaceC3599t3 = (InterfaceC3599t) this.f1880k;
                int i13 = this.f1879j;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c0580e0.f1803z.m1626a(c0580e0.f1795C, this.f1882m);
                    c1424t3 = new C1424t();
                    c1424t3.f4737g = -1L;
                    zBooleanValue3 = false;
                    if (!zBooleanValue3) {
                    }
                    return C3967n.f12976a;
                }
                if (i13 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C1424t c1424t8 = this.f1878i;
                try {
                    AbstractC1089i.m2732I0(obj);
                    C1424t c1424t9 = c1424t8;
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                    c1424t3 = c1424t9;
                    if (!zBooleanValue3 || !AbstractC3603v.m7561o(interfaceC3599t3)) {
                        return C3967n.f12976a;
                    }
                    C0446i c0446i = new C0446i(c1424t3, 9, c0580e0);
                    this.f1880k = interfaceC3599t3;
                    this.f1878i = c1424t3;
                    this.f1879j = 1;
                    Object objM4458d3 = AbstractC1874r.m4637s(getContext()).m4458d(c0446i, this);
                    EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                    if (objM4458d3 == enumC5799a3) {
                        return enumC5799a3;
                    }
                    c1424t8 = c1424t3;
                    obj = objM4458d3;
                    C1424t c1424t92 = c1424t8;
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                    c1424t3 = c1424t92;
                    if (!zBooleanValue3) {
                    }
                    return C3967n.f12976a;
                } finally {
                    if (Math.abs(c0580e0.f1795C) <= f3) {
                        c0580e0.m1586p1();
                    }
                }
        }
    }
}
