package p111ha;

import la.InterfaceC4724d;
import ma.AbstractC5140a;
import na.AbstractC5529d;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p215oc.C5729x;

/* JADX INFO: renamed from: ha.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2905a0 {

    /* JADX INFO: renamed from: b */
    public static final a f7654b = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f7655a;

    public C2905a0(String str) {
        this.f7655a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m10553a() {
        return this.f7655a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2905a0) && AbstractC1061t.m3842c(this.f7655a, ((C2905a0) obj).f7655a);
    }

    public int hashCode() {
        return this.f7655a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f7655a + ')';
    }

    /* JADX INFO: renamed from: ha.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2905a0 m10554a(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new C2905a0(str + '#' + str2, null);
        }

        /* JADX INFO: renamed from: b */
        public final C2905a0 m10555b(AbstractC5529d abstractC5529d) {
            abstractC5529d.getClass();
            if (abstractC5529d instanceof AbstractC5529d.b) {
                AbstractC5529d.b bVar = (AbstractC5529d.b) abstractC5529d;
                return m10557d(bVar.m22541e(), bVar.m22540d());
            }
            if (abstractC5529d instanceof AbstractC5529d.a) {
                AbstractC5529d.a aVar = (AbstractC5529d.a) abstractC5529d;
                return m10554a(aVar.m22537e(), aVar.m22536d());
            }
            C5729x.m23182a();
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final C2905a0 m10556c(InterfaceC4724d interfaceC4724d, AbstractC5140a.c cVar) {
            interfaceC4724d.getClass();
            cVar.getClass();
            return m10557d(interfaceC4724d.getString(cVar.m21022x()), interfaceC4724d.getString(cVar.m21021w()));
        }

        /* JADX INFO: renamed from: d */
        public final C2905a0 m10557d(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new C2905a0(str + str2, null);
        }

        /* JADX INFO: renamed from: e */
        public final C2905a0 m10558e(C2905a0 c2905a0, int i10) {
            c2905a0.getClass();
            return new C2905a0(c2905a0.m10553a() + '@' + i10, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C2905a0(String str, AbstractC1043k abstractC1043k) {
        this(str);
    }
}
