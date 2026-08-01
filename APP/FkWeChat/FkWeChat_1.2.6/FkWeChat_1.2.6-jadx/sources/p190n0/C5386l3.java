package p190n0;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0190r;
import p010a9.InterfaceC0192t;
import p024b9.AbstractC1043k;
import p102h1.AbstractC2819a0;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p117i.AbstractC3091w;
import p117i.AbstractC3093x;
import p117i.C3070l0;
import p135j2.InterfaceC3578w;
import p185m8.AbstractC5067b0;
import p211o8.AbstractC5661b;
import p250r1.C6455e;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: n0.l3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5386l3 implements InterfaceC5356g3 {

    /* JADX INFO: renamed from: m */
    public static final a f16567m = new a(null);

    /* JADX INFO: renamed from: n */
    public static final int f16568n = 8;

    /* JADX INFO: renamed from: o */
    public static final InterfaceC2843x f16569o = AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: n0.h3
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C5386l3.m21925j((InterfaceC2821b0) obj, (C5386l3) obj2);
        }
    }, new InterfaceC0184l() { // from class: n0.i3
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C5386l3.m21927l(((Long) obj).longValue());
        }
    });

    /* JADX INFO: renamed from: a */
    public boolean f16570a;

    /* JADX INFO: renamed from: b */
    public final List f16571b;

    /* JADX INFO: renamed from: c */
    public final C3070l0 f16572c;

    /* JADX INFO: renamed from: d */
    public AtomicLong f16573d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0184l f16574e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0190r f16575f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0188p f16576g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0192t f16577h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0173a f16578i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0184l f16579j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0184l f16580k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0512i2 f16581l;

    public C5386l3(long j10) {
        this.f16571b = new ArrayList();
        this.f16572c = AbstractC3093x.m11597c();
        this.f16573d = new AtomicLong(j10);
        this.f16581l = AbstractC0522j5.m1773e(AbstractC3093x.m11595a(), null, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public static Long m21925j(InterfaceC2821b0 interfaceC2821b0, C5386l3 c5386l3) {
        return Long.valueOf(c5386l3.f16573d.get());
    }

    /* JADX INFO: renamed from: k */
    public static int m21926k(InterfaceC0188p interfaceC0188p, Object obj, Object obj2) {
        return ((Number) interfaceC0188p.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: l */
    public static C5386l3 m21927l(long j10) {
        return new C5386l3(j10);
    }

    /* JADX INFO: renamed from: m */
    public static int m21928m(InterfaceC3578w interfaceC3578w, InterfaceC5401o0 interfaceC5401o0, InterfaceC5401o0 interfaceC5401o02) {
        InterfaceC3578w interfaceC3578wMo21975B = interfaceC5401o0.mo21975B();
        InterfaceC3578w interfaceC3578wMo21975B2 = interfaceC5401o02.mo21975B();
        long jMo13253v = interfaceC3578wMo21975B != null ? interfaceC3578w.mo13253v(interfaceC3578wMo21975B, C6455e.f20314b.m25569c()) : C6455e.f20314b.m25569c();
        long jMo13253v2 = interfaceC3578wMo21975B2 != null ? interfaceC3578w.mo13253v(interfaceC3578wMo21975B2, C6455e.f20314b.m25569c()) : C6455e.f20314b.m25569c();
        int i10 = (int) (jMo13253v & 4294967295L);
        int i11 = (int) (4294967295L & jMo13253v2);
        return Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11) ? AbstractC5661b.m22869d(Float.valueOf(Float.intBitsToFloat((int) (jMo13253v >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jMo13253v2 >> 32)))) : AbstractC5661b.m22869d(Float.valueOf(Float.intBitsToFloat(i10)), Float.valueOf(Float.intBitsToFloat(i11)));
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: a */
    public void mo21837a(long j10) {
        InterfaceC0184l interfaceC0184l = this.f16579j;
        if (interfaceC0184l != null) {
            interfaceC0184l.mo27m(Long.valueOf(j10));
        }
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: b */
    public long mo21838b() {
        long andIncrement = this.f16573d.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.f16573d.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: c */
    public InterfaceC5401o0 mo21839c(InterfaceC5401o0 interfaceC5401o0) {
        if (!(interfaceC5401o0.mo21983l() != 0)) {
            AbstractC6635e.m26318a("The selectable contains an invalid id: " + interfaceC5401o0.mo21983l());
        }
        if (this.f16572c.m11577a(interfaceC5401o0.mo21983l())) {
            AbstractC6635e.m26318a("Another selectable with the id: " + interfaceC5401o0 + ".selectableId has already subscribed.");
        }
        this.f16572c.m11411r(interfaceC5401o0.mo21983l(), interfaceC5401o0);
        this.f16571b.add(interfaceC5401o0);
        this.f16570a = false;
        return interfaceC5401o0;
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: d */
    public void mo21840d() {
        InterfaceC0173a interfaceC0173a = this.f16578i;
        if (interfaceC0173a != null) {
            interfaceC0173a.invoke();
        }
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: e */
    public AbstractC3091w mo21841e() {
        return (AbstractC3091w) this.f16581l.getValue();
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: f */
    public void mo21842f(InterfaceC3578w interfaceC3578w, long j10, InterfaceC5455x0 interfaceC5455x0, boolean z10) {
        InterfaceC0190r interfaceC0190r = this.f16575f;
        if (interfaceC0190r != null) {
            interfaceC0190r.mo284p(Boolean.valueOf(z10), interfaceC3578w, C6455e.m25550d(j10), interfaceC5455x0);
        }
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: g */
    public void mo21843g(long j10) {
        this.f16570a = false;
        InterfaceC0184l interfaceC0184l = this.f16574e;
        if (interfaceC0184l != null) {
            interfaceC0184l.mo27m(Long.valueOf(j10));
        }
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: h */
    public void mo21844h(InterfaceC5401o0 interfaceC5401o0) {
        if (this.f16572c.m11577a(interfaceC5401o0.mo21983l())) {
            this.f16571b.remove(interfaceC5401o0);
            this.f16572c.m11408o(interfaceC5401o0.mo21983l());
            InterfaceC0184l interfaceC0184l = this.f16580k;
            if (interfaceC0184l != null) {
                interfaceC0184l.mo27m(Long.valueOf(interfaceC5401o0.mo21983l()));
            }
        }
    }

    @Override // p190n0.InterfaceC5356g3
    /* JADX INFO: renamed from: i */
    public boolean mo21845i(InterfaceC3578w interfaceC3578w, long j10, long j11, boolean z10, InterfaceC5455x0 interfaceC5455x0, boolean z11) {
        InterfaceC0192t interfaceC0192t = this.f16577h;
        if (interfaceC0192t != null) {
            return ((Boolean) interfaceC0192t.mo361s(Boolean.valueOf(z11), interfaceC3578w, C6455e.m25550d(j10), C6455e.m25550d(j11), Boolean.valueOf(z10), interfaceC5455x0)).booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC3091w m21930o() {
        return this.f16572c;
    }

    /* JADX INFO: renamed from: p */
    public final List m21931p() {
        return this.f16571b;
    }

    /* JADX INFO: renamed from: q */
    public final void m21932q(InterfaceC0184l interfaceC0184l) {
        this.f16580k = interfaceC0184l;
    }

    /* JADX INFO: renamed from: r */
    public final void m21933r(InterfaceC0184l interfaceC0184l) {
        this.f16574e = interfaceC0184l;
    }

    /* JADX INFO: renamed from: s */
    public final void m21934s(InterfaceC0184l interfaceC0184l) {
        this.f16579j = interfaceC0184l;
    }

    /* JADX INFO: renamed from: t */
    public final void m21935t(InterfaceC0192t interfaceC0192t) {
        this.f16577h = interfaceC0192t;
    }

    /* JADX INFO: renamed from: u */
    public final void m21936u(InterfaceC0173a interfaceC0173a) {
        this.f16578i = interfaceC0173a;
    }

    /* JADX INFO: renamed from: v */
    public final void m21937v(InterfaceC0188p interfaceC0188p) {
        this.f16576g = interfaceC0188p;
    }

    /* JADX INFO: renamed from: w */
    public final void m21938w(InterfaceC0190r interfaceC0190r) {
        this.f16575f = interfaceC0190r;
    }

    /* JADX INFO: renamed from: x */
    public void m21939x(AbstractC3091w abstractC3091w) {
        this.f16581l.setValue(abstractC3091w);
    }

    /* JADX INFO: renamed from: y */
    public final List m21940y(final InterfaceC3578w interfaceC3578w) {
        if (!this.f16570a) {
            List list = this.f16571b;
            final InterfaceC0188p interfaceC0188p = new InterfaceC0188p() { // from class: n0.j3
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(C5386l3.m21928m(interfaceC3578w, (InterfaceC5401o0) obj, (InterfaceC5401o0) obj2));
                }
            };
            AbstractC5067b0.m20482D(list, new Comparator() { // from class: n0.k3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C5386l3.m21926k(interfaceC0188p, obj, obj2);
                }
            });
            this.f16570a = true;
        }
        return m21931p();
    }

    /* JADX INFO: renamed from: n0.l3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m21941a() {
            return C5386l3.f16569o;
        }

        public a() {
        }
    }

    public C5386l3() {
        this(1L);
    }
}
