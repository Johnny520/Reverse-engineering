package p069ef;

import java.lang.reflect.Field;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p054df.C1956b;
import p054df.C1957c;
import p069ef.InterfaceC2219d;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ef.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2217b implements InterfaceC2219d {

    /* JADX INFO: renamed from: f */
    public static final a f6044f = new a(null);

    /* JADX INFO: renamed from: b */
    public final String f6045b;

    /* JADX INFO: renamed from: c */
    public final String f6046c;

    /* JADX INFO: renamed from: d */
    public final String f6047d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4705l f6048e;

    /* JADX INFO: renamed from: ef.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {
        public b() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C2217b.this.m7990f();
        }
    }

    public C2217b(String str) {
        str.getClass();
        this.f6048e = AbstractC4706m.m18787a(new b());
        int iM33152n0 = AbstractC8621f0.m33152n0(str, "->", 0, false, 6, null);
        int iM33152n02 = AbstractC8621f0.m33152n0(str, ":", iM33152n0 + 1, false, 4, null);
        if (iM33152n0 == -1 || iM33152n02 == -1) {
            throw new IllegalAccessError("not field descriptor: " + str);
        }
        this.f6045b = C1956b.m7082d(str.substring(0, iM33152n0));
        this.f6046c = str.substring(iM33152n0 + 2, iM33152n02);
        this.f6047d = C1956b.m7082d(str.substring(iM33152n02 + 1));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Field m7986d(C2217b c2217b, ClassLoader classLoader, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        return c2217b.m7988c(classLoader, bool);
    }

    /* JADX INFO: renamed from: b */
    public final String m7987b() {
        return this.f6045b;
    }

    /* JADX INFO: renamed from: c */
    public final Field m7988c(ClassLoader classLoader, Boolean bool) {
        classLoader.getClass();
        return C1957c.f5453a.m7095h(classLoader, this, bool);
    }

    /* JADX INFO: renamed from: e */
    public final String m7989e() {
        return this.f6046c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2217b)) {
            return false;
        }
        C2217b c2217b = (C2217b) obj;
        return AbstractC1061t.m3842c(this.f6045b, c2217b.f6045b) && AbstractC1061t.m3842c(this.f6046c, c2217b.f6046c) && AbstractC1061t.m3842c(this.f6047d, c2217b.f6047d);
    }

    /* JADX INFO: renamed from: f */
    public final String m7990f() {
        return C1956b.m7084f(this.f6047d);
    }

    /* JADX INFO: renamed from: g */
    public final String m7991g() {
        return this.f6047d;
    }

    /* JADX INFO: renamed from: h */
    public final String m7992h() {
        return (String) this.f6048e.getValue();
    }

    public int hashCode() {
        return (this.f6045b.hashCode() * 31) + (this.f6046c.hashCode() * 31) + this.f6047d.hashCode();
    }

    @Override // p069ef.InterfaceC2219d
    public String serialize() {
        return InterfaceC2219d.b.m8012a(this);
    }

    public String toString() {
        return C1956b.m7084f(this.f6045b) + "->" + this.f6046c + ":" + m7992h();
    }

    /* JADX INFO: renamed from: ef.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
