package p219p;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p189n.C5200c2;
import p189n.EnumC5190a2;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5867m implements InterfaceC5881q1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f18457a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5836c1 f18458b = new b();

    /* JADX INFO: renamed from: c */
    public final C5200c2 f18459c = new C5200c2();

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f18460d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0512i2 f18461e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0512i2 f18462f;

    /* JADX INFO: renamed from: p.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18463q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ EnumC5190a2 f18465s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0188p f18466t;

        /* JADX INFO: renamed from: p.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10176a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f18467q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f18468r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C5867m f18469s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ InterfaceC0188p f18470t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10176a(C5867m c5867m, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f18469s = c5867m;
                this.f18470t = interfaceC0188p;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                C10176a c10176a = new C10176a(this.f18469s, this.f18470t, interfaceC5976f);
                c10176a.f18468r = obj;
                return c10176a;
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f18467q;
                try {
                    if (i10 == 0) {
                        AbstractC4713t.m18808b(obj);
                        InterfaceC5836c1 interfaceC5836c1 = (InterfaceC5836c1) this.f18468r;
                        this.f18469s.f18460d.setValue(AbstractC6533b.m25845a(true));
                        InterfaceC0188p interfaceC0188p = this.f18470t;
                        this.f18467q = 1;
                        if (interfaceC0188p.invoke(interfaceC5836c1, this) == objM24992g) {
                            return objM24992g;
                        }
                    } else {
                        if (i10 != 1) {
                            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC4713t.m18808b(obj);
                    }
                    this.f18469s.f18460d.setValue(AbstractC6533b.m25845a(false));
                    return C4700i0.f13910a;
                } catch (Throwable th) {
                    this.f18469s.f18460d.setValue(AbstractC6533b.m25845a(false));
                    throw th;
                }
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5836c1 interfaceC5836c1, InterfaceC5976f interfaceC5976f) {
                return ((C10176a) create(interfaceC5836c1, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18465s = enumC5190a2;
            this.f18466t = interfaceC0188p;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return C5867m.this.new a(this.f18465s, this.f18466t, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18463q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5200c2 c5200c2 = C5867m.this.f18459c;
                InterfaceC5836c1 interfaceC5836c1 = C5867m.this.f18458b;
                EnumC5190a2 enumC5190a2 = this.f18465s;
                C10176a c10176a = new C10176a(C5867m.this, this.f18466t, null);
                this.f18463q = 1;
                if (c5200c2.m21333f(interfaceC5836c1, enumC5190a2, c10176a, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: p.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC5836c1 {
        public b() {
        }

        @Override // p219p.InterfaceC5836c1
        /* JADX INFO: renamed from: g */
        public float mo23523g(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float fFloatValue = ((Number) C5867m.this.m23638l().mo27m(Float.valueOf(f10))).floatValue();
            C5867m.this.f18461e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            C5867m.this.f18462f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    public C5867m(InterfaceC0184l interfaceC0184l) {
        this.f18457a = interfaceC0184l;
        Boolean bool = Boolean.FALSE;
        this.f18460d = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f18461e = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f18462f = AbstractC0522j5.m1773e(bool, null, 2, null);
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: a */
    public boolean mo2977a() {
        return ((Boolean) this.f18460d.getValue()).booleanValue();
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: c */
    public Object mo2979c(EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        Object objM7882e = AbstractC2169p0.m7882e(new a(enumC5190a2, interfaceC0188p, null), interfaceC5976f);
        return objM7882e == AbstractC6325c.m24992g() ? objM7882e : C4700i0.f13910a;
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: f */
    public float mo2981f(float f10) {
        return ((Number) this.f18457a.mo27m(Float.valueOf(f10))).floatValue();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC0184l m23638l() {
        return this.f18457a;
    }
}
