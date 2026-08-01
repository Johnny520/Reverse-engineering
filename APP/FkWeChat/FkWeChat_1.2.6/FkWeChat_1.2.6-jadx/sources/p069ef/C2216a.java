package p069ef;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p054df.C1956b;
import p054df.C1957c;
import p069ef.InterfaceC2219d;

/* JADX INFO: renamed from: ef.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2216a implements InterfaceC2219d {

    /* JADX INFO: renamed from: c */
    public static final a f6042c = new a(null);

    /* JADX INFO: renamed from: b */
    public final String f6043b;

    public C2216a(String str) {
        str.getClass();
        this.f6043b = C1956b.m7082d(str);
    }

    /* JADX INFO: renamed from: a */
    public final Class m7983a(ClassLoader classLoader) {
        classLoader.getClass();
        return C1957c.f5453a.m7089b(classLoader, this);
    }

    /* JADX INFO: renamed from: b */
    public final String m7984b() {
        return this.f6043b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2216a) {
            return AbstractC1061t.m3842c(this.f6043b, ((C2216a) obj).f6043b);
        }
        return false;
    }

    public int hashCode() {
        return this.f6043b.hashCode();
    }

    @Override // p069ef.InterfaceC2219d
    public String serialize() {
        return InterfaceC2219d.b.m8012a(this);
    }

    public String toString() {
        return C1956b.m7084f(this.f6043b);
    }

    /* JADX INFO: renamed from: ef.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
