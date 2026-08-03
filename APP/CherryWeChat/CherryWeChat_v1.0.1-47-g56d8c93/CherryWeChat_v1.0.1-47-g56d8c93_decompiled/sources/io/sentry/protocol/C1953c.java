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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.c */
/* JADX INFO: loaded from: classes.dex */
public class C1953c implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f6889a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final C2029a f6890b = new C2029a();

    public C1953c() {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo4119a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f6889a.containsKey(obj);
    }

    /* JADX INFO: renamed from: b */
    public Set mo4120b() {
        return this.f6889a.entrySet();
    }

    /* JADX INFO: renamed from: c */
    public Object mo4121c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f6889a.get(obj);
    }

    /* JADX INFO: renamed from: d */
    public C1951a mo4122d() {
        return (C1951a) m4152u(C1951a.class, "app");
    }

    /* JADX INFO: renamed from: e */
    public C1956f mo4123e() {
        return (C1956f) m4152u(C1956f.class, "device");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1953c)) {
            return false;
        }
        return this.f6889a.equals(((C1953c) obj).f6889a);
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
    public Object mo4128j(String str, Object obj) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f6889a;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    /* JADX INFO: renamed from: k */
    public void mo4129k(C1953c c1953c) {
        if (c1953c == null) {
            return;
        }
        this.f6889a.putAll(c1953c.f6889a);
    }

    /* JADX INFO: renamed from: l */
    public void mo4130l(C1951a c1951a) {
        mo4128j("app", c1951a);
    }

    /* JADX INFO: renamed from: m */
    public void mo4131m(C1952b c1952b) {
        mo4128j("browser", c1952b);
    }

    /* JADX INFO: renamed from: n */
    public void mo4132n(C1956f c1956f) {
        mo4128j("device", c1956f);
    }

    /* JADX INFO: renamed from: o */
    public void mo4133o(C1959i c1959i) {
        mo4128j("gpu", c1959i);
    }

    /* JADX INFO: renamed from: p */
    public void mo4134p(C1963m c1963m) {
        mo4128j("os", c1963m);
    }

    /* JADX INFO: renamed from: q */
    public void mo4135q(C1966p c1966p) {
        C1981r c1981rM4173a = this.f6890b.m4173a();
        try {
            mo4128j("response", c1966p);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo4136r(C1972v c1972v) {
        mo4128j("runtime", c1972v);
    }

    /* JADX INFO: renamed from: s */
    public void mo4137s(C1945B c1945b) {
        mo4128j("spring", c1945b);
    }

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        ArrayList<String> list = Collections.list(mo4127i());
        Collections.sort(list);
        for (String str : list) {
            Object objMo4121c = mo4121c(str);
            if (objMo4121c != null) {
                c1901c.m4106p(str);
                c1901c.m4112w(iLogger, objMo4121c);
            }
        }
        c1901c.m4102k();
    }

    /* JADX INFO: renamed from: t */
    public void mo4138t(C1589H2 c1589h2) {
        AbstractC1856a.m4048D("traceContext is required", c1589h2);
        mo4128j("trace", c1589h2);
    }

    /* JADX INFO: renamed from: u */
    public final Object m4152u(Class cls, String str) {
        Object objMo4121c = mo4121c(str);
        if (cls.isInstance(objMo4121c)) {
            return cls.cast(objMo4121c);
        }
        return null;
    }

    public C1953c(C1953c c1953c) {
        for (Map.Entry entry : c1953c.mo4120b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof C1951a)) {
                    C1951a c1951a = (C1951a) value;
                    C1951a c1951a2 = new C1951a();
                    c1951a2.f6878g = c1951a.f6878g;
                    c1951a2.f6872a = c1951a.f6872a;
                    c1951a2.f6876e = c1951a.f6876e;
                    c1951a2.f6873b = c1951a.f6873b;
                    c1951a2.f6877f = c1951a.f6877f;
                    c1951a2.f6875d = c1951a.f6875d;
                    c1951a2.f6874c = c1951a.f6874c;
                    c1951a2.f6879h = AbstractC1856a.m4045A(c1951a.f6879h);
                    c1951a2.f6882k = c1951a.f6882k;
                    List list = c1951a.f6880i;
                    c1951a2.f6880i = list != null ? new ArrayList(list) : null;
                    c1951a2.f6881j = c1951a.f6881j;
                    c1951a2.f6883l = c1951a.f6883l;
                    c1951a2.f6884m = c1951a.f6884m;
                    c1951a2.f6885n = AbstractC1856a.m4045A(c1951a.f6885n);
                    mo4130l(c1951a2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof C1952b)) {
                    C1952b c1952b = (C1952b) value;
                    C1952b c1952b2 = new C1952b();
                    c1952b2.f6886a = c1952b.f6886a;
                    c1952b2.f6887b = c1952b.f6887b;
                    c1952b2.f6888c = AbstractC1856a.m4045A(c1952b.f6888c);
                    mo4131m(c1952b2);
                } else if ("device".equals(entry.getKey()) && (value instanceof C1956f)) {
                    C1956f c1956f = (C1956f) value;
                    C1956f c1956f2 = new C1956f();
                    c1956f2.f6903a = c1956f.f6903a;
                    c1956f2.f6904b = c1956f.f6904b;
                    c1956f2.f6905c = c1956f.f6905c;
                    c1956f2.f6906d = c1956f.f6906d;
                    c1956f2.f6907e = c1956f.f6907e;
                    c1956f2.f6908f = c1956f.f6908f;
                    c1956f2.f6911i = c1956f.f6911i;
                    c1956f2.f6912j = c1956f.f6912j;
                    c1956f2.f6913k = c1956f.f6913k;
                    c1956f2.f6914l = c1956f.f6914l;
                    c1956f2.f6915m = c1956f.f6915m;
                    c1956f2.f6916n = c1956f.f6916n;
                    c1956f2.f6917o = c1956f.f6917o;
                    c1956f2.f6918p = c1956f.f6918p;
                    c1956f2.f6919q = c1956f.f6919q;
                    c1956f2.f6920r = c1956f.f6920r;
                    c1956f2.f6921s = c1956f.f6921s;
                    c1956f2.f6922t = c1956f.f6922t;
                    c1956f2.f6923u = c1956f.f6923u;
                    c1956f2.f6924v = c1956f.f6924v;
                    c1956f2.f6925w = c1956f.f6925w;
                    c1956f2.f6926x = c1956f.f6926x;
                    c1956f2.f6927y = c1956f.f6927y;
                    c1956f2.f6894A = c1956f.f6894A;
                    c1956f2.f6896C = c1956f.f6896C;
                    c1956f2.f6897D = c1956f.f6897D;
                    c1956f2.f6910h = c1956f.f6910h;
                    String[] strArr = c1956f.f6909g;
                    c1956f2.f6909g = strArr != null ? (String[]) strArr.clone() : null;
                    c1956f2.f6895B = c1956f.f6895B;
                    TimeZone timeZone = c1956f.f6928z;
                    c1956f2.f6928z = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    c1956f2.f6898E = c1956f.f6898E;
                    c1956f2.f6899F = c1956f.f6899F;
                    c1956f2.f6900G = c1956f.f6900G;
                    c1956f2.f6901H = c1956f.f6901H;
                    c1956f2.f6902I = AbstractC1856a.m4045A(c1956f.f6902I);
                    mo4132n(c1956f2);
                } else if ("os".equals(entry.getKey()) && (value instanceof C1963m)) {
                    C1963m c1963m = (C1963m) value;
                    C1963m c1963m2 = new C1963m();
                    c1963m2.f6969a = c1963m.f6969a;
                    c1963m2.f6970b = c1963m.f6970b;
                    c1963m2.f6971c = c1963m.f6971c;
                    c1963m2.f6972d = c1963m.f6972d;
                    c1963m2.f6973e = c1963m.f6973e;
                    c1963m2.f6974f = c1963m.f6974f;
                    c1963m2.f6975g = AbstractC1856a.m4045A(c1963m.f6975g);
                    mo4134p(c1963m2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof C1972v)) {
                    C1972v c1972v = (C1972v) value;
                    C1972v c1972v2 = new C1972v();
                    c1972v2.f7016a = c1972v.f7016a;
                    c1972v2.f7017b = c1972v.f7017b;
                    c1972v2.f7018c = c1972v.f7018c;
                    c1972v2.f7019d = AbstractC1856a.m4045A(c1972v.f7019d);
                    mo4136r(c1972v2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof C1957g)) {
                    C1957g c1957g = (C1957g) value;
                    C1957g c1957g2 = new C1957g();
                    c1957g2.f6929a = c1957g.f6929a;
                    c1957g2.f6930b = c1957g.f6930b;
                    c1957g2.f6931c = c1957g.f6931c;
                    c1957g2.f6932d = c1957g.f6932d;
                    c1957g2.f6933e = c1957g.f6933e;
                    c1957g2.f6934f = c1957g.f6934f;
                    c1957g2.f6935g = AbstractC1856a.m4045A(c1957g.f6935g);
                    mo4128j("feedback", c1957g2);
                } else if ("gpu".equals(entry.getKey()) && (value instanceof C1959i)) {
                    C1959i c1959i = (C1959i) value;
                    C1959i c1959i2 = new C1959i();
                    c1959i2.f6940a = c1959i.f6940a;
                    c1959i2.f6941b = c1959i.f6941b;
                    c1959i2.f6942c = c1959i.f6942c;
                    c1959i2.f6943d = c1959i.f6943d;
                    c1959i2.f6944e = c1959i.f6944e;
                    c1959i2.f6945f = c1959i.f6945f;
                    c1959i2.f6946g = c1959i.f6946g;
                    c1959i2.f6947h = c1959i.f6947h;
                    c1959i2.f6948i = c1959i.f6948i;
                    c1959i2.f6949j = AbstractC1856a.m4045A(c1959i.f6949j);
                    mo4133o(c1959i2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof C1589H2)) {
                    mo4138t(new C1589H2((C1589H2) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof C1873f1)) {
                    C1873f1 c1873f1 = (C1873f1) value;
                    C1873f1 c1873f12 = new C1873f1();
                    c1873f12.f6718a = c1873f1.f6718a;
                    ConcurrentHashMap concurrentHashMapM4045A = AbstractC1856a.m4045A(c1873f1.f6719b);
                    if (concurrentHashMapM4045A != null) {
                        c1873f12.f6719b = concurrentHashMapM4045A;
                    }
                    mo4128j("profile", c1873f12);
                } else if ("response".equals(entry.getKey()) && (value instanceof C1966p)) {
                    C1966p c1966p = (C1966p) value;
                    C1966p c1966p2 = new C1966p();
                    c1966p2.f6988a = c1966p.f6988a;
                    c1966p2.f6989b = AbstractC1856a.m4045A(c1966p.f6989b);
                    c1966p2.f6993f = AbstractC1856a.m4045A(c1966p.f6993f);
                    c1966p2.f6990c = c1966p.f6990c;
                    c1966p2.f6991d = c1966p.f6991d;
                    c1966p2.f6992e = c1966p.f6992e;
                    mo4135q(c1966p2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof C1945B)) {
                    C1945B c1945b = (C1945B) value;
                    C1945B c1945b2 = new C1945B();
                    c1945b2.f6846a = c1945b.f6846a;
                    c1945b2.f6847b = AbstractC1856a.m4045A(c1945b.f6847b);
                    mo4137s(c1945b2);
                } else {
                    mo4128j((String) entry.getKey(), value);
                }
            }
        }
    }
}
