package p069ef;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p054df.C1956b;
import p054df.C1957c;
import p069ef.InterfaceC2219d;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ef.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2218c implements InterfaceC2219d {

    /* JADX INFO: renamed from: g */
    public static final a f6050g = new a(null);

    /* JADX INFO: renamed from: b */
    public final String f6051b;

    /* JADX INFO: renamed from: c */
    public final String f6052c;

    /* JADX INFO: renamed from: d */
    public final List f6053d;

    /* JADX INFO: renamed from: e */
    public final String f6054e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4705l f6055f;

    /* JADX INFO: renamed from: ef.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final b f6056r = new b();

        public b() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo27m(String str) {
            str.getClass();
            return C1956b.m7084f(str);
        }
    }

    /* JADX INFO: renamed from: ef.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {
        public c() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C2218c.this.m7996k();
        }
    }

    public C2218c(String str) {
        str.getClass();
        this.f6055f = AbstractC4706m.m18787a(new c());
        int iM33152n0 = AbstractC8621f0.m33152n0(str, "->", 0, false, 6, null);
        int iM33152n02 = AbstractC8621f0.m33152n0(str, "(", iM33152n0 + 1, false, 4, null);
        int i10 = iM33152n02 + 1;
        int iM33152n03 = AbstractC8621f0.m33152n0(str, ")", i10, false, 4, null);
        if (iM33152n0 == -1 || iM33152n02 == -1 || iM33152n03 == -1) {
            throw new IllegalAccessError("not method descriptor: " + str);
        }
        this.f6051b = C1956b.m7082d(str.substring(0, iM33152n0));
        this.f6052c = str.substring(iM33152n0 + 2, iM33152n02);
        this.f6053d = C1956b.m7081c(str.substring(i10, iM33152n03));
        this.f6054e = C1956b.m7082d(str.substring(iM33152n03 + 1));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Method m7995f(C2218c c2218c, ClassLoader classLoader, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return c2218c.m8000e(classLoader, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final String m7996k() {
        return "(" + AbstractC5081g0.m20585s0(this.f6053d, _UrlKt.FRAGMENT_ENCODE_SET, null, null, 0, null, b.f6056r, 30, null) + ")" + C1956b.m7084f(this.f6054e);
    }

    /* JADX INFO: renamed from: b */
    public final String m7997b() {
        return this.f6051b;
    }

    /* JADX INFO: renamed from: c */
    public final Constructor m7998c(ClassLoader classLoader) {
        classLoader.getClass();
        return C1957c.f5453a.m7091d(classLoader, this);
    }

    /* JADX INFO: renamed from: d */
    public final String m7999d() {
        return this.f6051b;
    }

    /* JADX INFO: renamed from: e */
    public final Method m8000e(ClassLoader classLoader, Boolean bool) {
        classLoader.getClass();
        return C1957c.f5453a.m7096i(classLoader, this, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2218c)) {
            return false;
        }
        C2218c c2218c = (C2218c) obj;
        return AbstractC1061t.m3842c(this.f6051b, c2218c.f6051b) && AbstractC1061t.m3842c(this.f6052c, c2218c.f6052c) && AbstractC1061t.m3842c(this.f6053d, c2218c.f6053d) && AbstractC1061t.m3842c(this.f6054e, c2218c.f6054e);
    }

    /* JADX INFO: renamed from: g */
    public final String m8001g() {
        return (String) this.f6055f.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final String m8002h() {
        return this.f6052c;
    }

    public int hashCode() {
        return (this.f6051b.hashCode() * 31) + (this.f6052c.hashCode() * 31) + (this.f6053d.hashCode() * 31) + this.f6054e.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final List m8003i() {
        return this.f6053d;
    }

    /* JADX INFO: renamed from: j */
    public final String m8004j() {
        return this.f6054e;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m8005l() {
        return AbstractC1061t.m3842c(this.f6052c, "<init>");
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8006m() {
        return (m8007n() || m8005l()) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m8007n() {
        return AbstractC1061t.m3842c(this.f6052c, "<clinit>");
    }

    @Override // p069ef.InterfaceC2219d
    public String serialize() {
        return InterfaceC2219d.b.m8012a(this);
    }

    public String toString() {
        return C1956b.m7084f(this.f6051b) + "->" + this.f6052c + m8001g();
    }

    /* JADX INFO: renamed from: ef.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
