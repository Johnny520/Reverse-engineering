package re;

import be.AbstractC1113a;
import be.AbstractC1117e;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p175le.C4754c;
import p175le.C4756e;

/* JADX INFO: renamed from: re.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6624c extends AbstractC6630i {

    /* JADX INFO: renamed from: e */
    public static final a f20743e = new a(null);

    /* JADX INFO: renamed from: a */
    public final List f20744a;

    /* JADX INFO: renamed from: b */
    public final List f20745b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f20746c;

    /* JADX INFO: renamed from: d */
    public final C2363j f20747d;

    public C6624c(C4754c c4754c) {
        c4754c.getClass();
        a.C10191a c10191aM26246b = f20743e.m26246b(c4754c);
        List listM26248a = c10191aM26246b.m26248a();
        List listM26249b = c10191aM26246b.m26249b();
        this.f20744a = listM26248a;
        this.f20745b = listM26249b;
        this.f20746c = c4754c.m19014f();
        this.f20747d = AbstractC2368o.m8592s(c4754c.m19013e(), c4754c.m19012d());
        m26265f();
    }

    @Override // re.AbstractC6630i
    /* JADX INFO: renamed from: a */
    public List mo26241a() {
        return this.f20744a;
    }

    @Override // re.AbstractC6630i
    /* JADX INFO: renamed from: b */
    public List mo26242b() {
        return this.f20745b;
    }

    @Override // re.AbstractC6630i
    /* JADX INFO: renamed from: c */
    public CharSequence mo26243c() {
        return this.f20746c;
    }

    @Override // re.AbstractC6630i
    /* JADX INFO: renamed from: d */
    public C2363j mo26244d() {
        return this.f20747d;
    }

    /* JADX INFO: renamed from: re.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: re.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10191a {

            /* JADX INFO: renamed from: a */
            public final List f20748a;

            /* JADX INFO: renamed from: b */
            public final List f20749b;

            public C10191a(List list, List list2) {
                list.getClass();
                list2.getClass();
                this.f20748a = list;
                this.f20749b = list2;
            }

            /* JADX INFO: renamed from: a */
            public final List m26248a() {
                return this.f20748a;
            }

            /* JADX INFO: renamed from: b */
            public final List m26249b() {
                return this.f20749b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10191a)) {
                    return false;
                }
                C10191a c10191a = (C10191a) obj;
                return AbstractC1061t.m3842c(this.f20748a, c10191a.f20748a) && AbstractC1061t.m3842c(this.f20749b, c10191a.f20749b);
            }

            public int hashCode() {
                return (this.f20748a.hashCode() * 31) + this.f20749b.hashCode();
            }

            public String toString() {
                return "ResultOfCaching(cachedTokens=" + this.f20748a + ", filteredTokens=" + this.f20749b + ')';
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final C10191a m26246b(C4754c c4754c) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (c4754c.m19017i() != null) {
                boolean zM26247c = m26247c(c4754c.m19017i());
                C4756e c4756e = new C4756e(c4754c.m19017i(), c4754c.m19016h(), c4754c.m19015g(), arrayList.size(), zM26247c ? -1 : arrayList2.size());
                arrayList.add(c4756e);
                if (!zM26247c) {
                    arrayList2.add(c4756e);
                }
                c4754c.m19009a();
            }
            return new C10191a(arrayList, arrayList2);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m26247c(AbstractC1113a abstractC1113a) {
            return AbstractC1061t.m3842c(abstractC1113a, AbstractC1117e.f3390N);
        }

        public a() {
        }
    }
}
