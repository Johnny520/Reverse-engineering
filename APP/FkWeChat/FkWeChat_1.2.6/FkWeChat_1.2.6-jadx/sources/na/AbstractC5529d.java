package na;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: na.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5529d {

    /* JADX INFO: renamed from: na.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5529d {

        /* JADX INFO: renamed from: a */
        public final String f17292a;

        /* JADX INFO: renamed from: b */
        public final String f17293b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f17292a = str;
            this.f17293b = str2;
        }

        @Override // na.AbstractC5529d
        /* JADX INFO: renamed from: a */
        public String mo22533a() {
            return m22537e() + ':' + m22536d();
        }

        /* JADX INFO: renamed from: b */
        public final String m22534b() {
            return this.f17292a;
        }

        /* JADX INFO: renamed from: c */
        public final String m22535c() {
            return this.f17293b;
        }

        /* JADX INFO: renamed from: d */
        public String m22536d() {
            return this.f17293b;
        }

        /* JADX INFO: renamed from: e */
        public String m22537e() {
            return this.f17292a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f17292a, aVar.f17292a) && AbstractC1061t.m3842c(this.f17293b, aVar.f17293b);
        }

        public int hashCode() {
            return (this.f17292a.hashCode() * 31) + this.f17293b.hashCode();
        }
    }

    /* JADX INFO: renamed from: na.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5529d {

        /* JADX INFO: renamed from: a */
        public final String f17294a;

        /* JADX INFO: renamed from: b */
        public final String f17295b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f17294a = str;
            this.f17295b = str2;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ b m22538c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f17294a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f17295b;
            }
            return bVar.m22539b(str, str2);
        }

        @Override // na.AbstractC5529d
        /* JADX INFO: renamed from: a */
        public String mo22533a() {
            return m22541e() + m22540d();
        }

        /* JADX INFO: renamed from: b */
        public final b m22539b(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new b(str, str2);
        }

        /* JADX INFO: renamed from: d */
        public String m22540d() {
            return this.f17295b;
        }

        /* JADX INFO: renamed from: e */
        public String m22541e() {
            return this.f17294a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(this.f17294a, bVar.f17294a) && AbstractC1061t.m3842c(this.f17295b, bVar.f17295b);
        }

        public int hashCode() {
            return (this.f17294a.hashCode() * 31) + this.f17295b.hashCode();
        }
    }

    public /* synthetic */ AbstractC5529d(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo22533a();

    public final String toString() {
        return mo22533a();
    }

    public AbstractC5529d() {
    }
}
