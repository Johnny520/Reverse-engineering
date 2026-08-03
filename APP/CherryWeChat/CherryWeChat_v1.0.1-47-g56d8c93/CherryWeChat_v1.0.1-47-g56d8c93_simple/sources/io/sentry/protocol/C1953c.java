package io.sentry.protocol;

import io.sentry.C1589H2;
import io.sentry.C1873f1;
import io.sentry.C1981r;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.c */
/* JADX INFO: loaded from: classes.dex */
public class C1953c implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f6889a;

    /* JADX INFO: renamed from: b */
    public final C2029a f6890b;

    public C1953c() {
        this.f6889a = new ConcurrentHashMap();
        this.f6890b = new C2029a();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo4119a(Object r2) {
        if (r2 != null) goto L6;
        return false;
    L6:
        return this.f6889a.containsKey(r2);
    }

    /* JADX INFO: renamed from: b */
    public Set mo4120b() {
        return this.f6889a.entrySet();
    }

    /* JADX INFO: renamed from: c */
    public Object mo4121c(Object r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return this.f6889a.get(r2);
    }

    /* JADX INFO: renamed from: d */
    public C1951a mo4122d() {
        return (C1951a) m4152u(C1951a.class, "app");
    }

    /* JADX INFO: renamed from: e */
    public C1956f mo4123e() {
        return (C1956f) m4152u(C1956f.class, "device");
    }

    public final boolean equals(Object r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if ((r2 instanceof C1953c) == true) goto L6;
        return false;
    L6:
        return this.f6889a.equals(((C1953c) r2).f6889a);
    }

    /* JADX INFO: renamed from: f */
    public C1963m mo4124f() {
        return (C1963m) m4152u(C1963m.class, "os");
    }

    /* JADX INFO: renamed from: g */
    public C1972v mo4125g() {
        return (C1972v) m4152u(C1972v.class, "runtime");
    }

    /* JADX INFO: renamed from: h */
    public C1589H2 mo4126h() {
        return (C1589H2) m4152u(C1589H2.class, "trace");
    }

    public final int hashCode() {
        return this.f6889a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public Enumeration mo4127i() {
        return this.f6889a.keys();
    }

    /* JADX INFO: renamed from: j */
    public Object mo4128j(String r2, Object r3) {
        if (r2 != null) goto L5;
        return null;
    L5:
        ConcurrentHashMap r0 = this.f6889a;
        if (r3 != null) goto L10;
        return r0.remove(r2);
    L10:
        return r0.put(r2, r3);
    }

    /* JADX INFO: renamed from: k */
    public void mo4129k(C1953c r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        this.f6889a.putAll(r2.f6889a);
    }

    /* JADX INFO: renamed from: l */
    public void mo4130l(C1951a r2) {
        mo4128j("app", r2);
    }

    /* JADX INFO: renamed from: m */
    public void mo4131m(C1952b r2) {
        mo4128j("browser", r2);
    }

    /* JADX INFO: renamed from: n */
    public void mo4132n(C1956f r2) {
        mo4128j("device", r2);
    }

    /* JADX INFO: renamed from: o */
    public void mo4133o(C1959i r2) {
        mo4128j("gpu", r2);
    }

    /* JADX INFO: renamed from: p */
    public void mo4134p(C1963m r2) {
        mo4128j("os", r2);
    }

    /* JADX INFO: renamed from: q */
    public void mo4135q(C1966p r3) {
        C1981r r0 = this.f6890b.m4173a();
        mo4128j("response", r3);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    /* JADX INFO: renamed from: r */
    public void mo4136r(C1972v r2) {
        mo4128j("runtime", r2);
    }

    /* JADX INFO: renamed from: s */
    public void mo4137s(C1945B r2) {
        mo4128j("spring", r2);
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        ArrayList r0 = Collections.list(mo4127i());
        Collections.sort(r0);
        Iterator r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        Object r2 = mo4121c(r1);
        if (r2 == null) goto L4;
        r42.m4106p(r1);
        r42.m4112w(r5, r2);
        goto L4
    L8:
        r42.m4102k();
    }

    /* JADX INFO: renamed from: t */
    public void mo4138t(C1589H2 r2) {
        AbstractC1856a.m4048D("traceContext is required", r2);
        mo4128j("trace", r2);
    }

    /* JADX INFO: renamed from: u */
    public final Object m4152u(Class r2, String r3) {
        Object r32 = mo4121c(r3);
        if (r2.isInstance(r32) == true) goto L5;
        return null;
    L5:
        return r2.cast(r32);
    }

    public C1953c(C1953c r6) {
        this.f6889a = new ConcurrentHashMap();
        this.f6890b = new C2029a();
        Iterator r62 = r6.mo4120b().iterator();
    L4:
        if (r62.hasNext() == false) goto L76;
        Map.Entry r0 = (Map.Entry) r62.next();
        if (r0 == null) goto L4;
        Object r1 = r0.getValue();
        TimeZone r3 = null;
        ArrayList r32 = null;
        if ("app".equals(r0.getKey()) == false) goto L16;
        if ((r1 instanceof C1951a) == false) goto L16;
        C1951a r12 = (C1951a) r1;
        C1951a r02 = new C1951a();
        r02.f6878g = r12.f6878g;
        r02.f6872a = r12.f6872a;
        r02.f6876e = r12.f6876e;
        r02.f6873b = r12.f6873b;
        r02.f6877f = r12.f6877f;
        r02.f6875d = r12.f6875d;
        r02.f6874c = r12.f6874c;
        r02.f6879h = AbstractC1856a.m4045A(r12.f6879h);
        r02.f6882k = r12.f6882k;
        List r2 = r12.f6880i;
        if (r2 == null) goto L14;
        r32 = new ArrayList(r2);
    L14:
        r02.f6880i = r32;
        r02.f6881j = r12.f6881j;
        r02.f6883l = r12.f6883l;
        r02.f6884m = r12.f6884m;
        r02.f6885n = AbstractC1856a.m4045A(r12.f6885n);
        mo4130l(r02);
    L16:
        if ("browser".equals(r0.getKey()) == false) goto L21;
        if ((r1 instanceof C1952b) == false) goto L21;
        C1952b r13 = (C1952b) r1;
        C1952b r03 = new C1952b();
        r03.f6886a = r13.f6886a;
        r03.f6887b = r13.f6887b;
        r03.f6888c = AbstractC1856a.m4045A(r13.f6888c);
        mo4131m(r03);
    L21:
        if ("device".equals(r0.getKey()) == false) goto L33;
        if ((r1 instanceof C1956f) == false) goto L33;
        C1956f r14 = (C1956f) r1;
        C1956f r04 = new C1956f();
        r04.f6903a = r14.f6903a;
        r04.f6904b = r14.f6904b;
        r04.f6905c = r14.f6905c;
        r04.f6906d = r14.f6906d;
        r04.f6907e = r14.f6907e;
        r04.f6908f = r14.f6908f;
        r04.f6911i = r14.f6911i;
        r04.f6912j = r14.f6912j;
        r04.f6913k = r14.f6913k;
        r04.f6914l = r14.f6914l;
        r04.f6915m = r14.f6915m;
        r04.f6916n = r14.f6916n;
        r04.f6917o = r14.f6917o;
        r04.f6918p = r14.f6918p;
        r04.f6919q = r14.f6919q;
        r04.f6920r = r14.f6920r;
        r04.f6921s = r14.f6921s;
        r04.f6922t = r14.f6922t;
        r04.f6923u = r14.f6923u;
        r04.f6924v = r14.f6924v;
        r04.f6925w = r14.f6925w;
        r04.f6926x = r14.f6926x;
        r04.f6927y = r14.f6927y;
        r04.f6894A = r14.f6894A;
        r04.f6896C = r14.f6896C;
        r04.f6897D = r14.f6897D;
        r04.f6910h = r14.f6910h;
        String[] r22 = r14.f6909g;
        if (r22 == null) goto L27;
        String[] r23 = (String[]) r22.clone();
    L28:
        r04.f6909g = r23;
        r04.f6895B = r14.f6895B;
        TimeZone r24 = r14.f6928z;
        if (r24 == null) goto L31;
        r3 = (TimeZone) r24.clone();
    L31:
        r04.f6928z = r3;
        r04.f6898E = r14.f6898E;
        r04.f6899F = r14.f6899F;
        r04.f6900G = r14.f6900G;
        r04.f6901H = r14.f6901H;
        r04.f6902I = AbstractC1856a.m4045A(r14.f6902I);
        mo4132n(r04);
        goto L4
    L27:
        r23 = null;
    L33:
        if ("os".equals(r0.getKey()) == false) goto L38;
        if ((r1 instanceof C1963m) == false) goto L38;
        C1963m r15 = (C1963m) r1;
        C1963m r05 = new C1963m();
        r05.f6969a = r15.f6969a;
        r05.f6970b = r15.f6970b;
        r05.f6971c = r15.f6971c;
        r05.f6972d = r15.f6972d;
        r05.f6973e = r15.f6973e;
        r05.f6974f = r15.f6974f;
        r05.f6975g = AbstractC1856a.m4045A(r15.f6975g);
        mo4134p(r05);
    L38:
        if ("runtime".equals(r0.getKey()) == false) goto L43;
        if ((r1 instanceof C1972v) == false) goto L43;
        C1972v r16 = (C1972v) r1;
        C1972v r06 = new C1972v();
        r06.f7016a = r16.f7016a;
        r06.f7017b = r16.f7017b;
        r06.f7018c = r16.f7018c;
        r06.f7019d = AbstractC1856a.m4045A(r16.f7019d);
        mo4136r(r06);
    L43:
        if ("feedback".equals(r0.getKey()) == false) goto L48;
        if ((r1 instanceof C1957g) == false) goto L48;
        C1957g r17 = (C1957g) r1;
        C1957g r07 = new C1957g();
        r07.f6929a = r17.f6929a;
        r07.f6930b = r17.f6930b;
        r07.f6931c = r17.f6931c;
        r07.f6932d = r17.f6932d;
        r07.f6933e = r17.f6933e;
        r07.f6934f = r17.f6934f;
        r07.f6935g = AbstractC1856a.m4045A(r17.f6935g);
        mo4128j("feedback", r07);
    L48:
        if ("gpu".equals(r0.getKey()) == false) goto L53;
        if ((r1 instanceof C1959i) == false) goto L53;
        C1959i r18 = (C1959i) r1;
        C1959i r08 = new C1959i();
        r08.f6940a = r18.f6940a;
        r08.f6941b = r18.f6941b;
        r08.f6942c = r18.f6942c;
        r08.f6943d = r18.f6943d;
        r08.f6944e = r18.f6944e;
        r08.f6945f = r18.f6945f;
        r08.f6946g = r18.f6946g;
        r08.f6947h = r18.f6947h;
        r08.f6948i = r18.f6948i;
        r08.f6949j = AbstractC1856a.m4045A(r18.f6949j);
        mo4133o(r08);
    L53:
        if ("trace".equals(r0.getKey()) == false) goto L58;
        if ((r1 instanceof C1589H2) == false) goto L58;
        mo4138t(new C1589H2((C1589H2) r1));
    L58:
        if ("profile".equals(r0.getKey()) == false) goto L66;
        if ((r1 instanceof C1873f1) == false) goto L66;
        C1873f1 r19 = (C1873f1) r1;
        C1873f1 r09 = new C1873f1();
        r09.f6718a = r19.f6718a;
        ConcurrentHashMap r110 = AbstractC1856a.m4045A(r19.f6719b);
        if (r110 == null) goto L64;
        r09.f6719b = r110;
    L64:
        mo4128j("profile", r09);
    L66:
        if ("response".equals(r0.getKey()) == false) goto L71;
        if ((r1 instanceof C1966p) == false) goto L71;
        C1966p r111 = (C1966p) r1;
        C1966p r010 = new C1966p();
        r010.f6988a = r111.f6988a;
        r010.f6989b = AbstractC1856a.m4045A(r111.f6989b);
        r010.f6993f = AbstractC1856a.m4045A(r111.f6993f);
        r010.f6990c = r111.f6990c;
        r010.f6991d = r111.f6991d;
        r010.f6992e = r111.f6992e;
        mo4135q(r010);
    L71:
        if ("spring".equals(r0.getKey()) == false) goto L75;
        if ((r1 instanceof C1945B) == false) goto L75;
        C1945B r112 = (C1945B) r1;
        C1945B r011 = new C1945B();
        r011.f6846a = r112.f6846a;
        r011.f6847b = AbstractC1856a.m4045A(r112.f6847b);
        mo4137s(r011);
    L75:
        mo4128j((String) r0.getKey(), r1);
        goto L4
    }
}
