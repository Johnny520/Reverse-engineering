package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.C9757s0;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;

/* JADX INFO: renamed from: k8.o5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0002\u0004\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, m16758d2 = {"Lk8/o5;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "value", "b", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class C4125o5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final String f12095b = m16371b("endTurn");

    /* JADX INFO: renamed from: c */
    public static final String f12096c = m16371b("stopSequence");

    /* JADX INFO: renamed from: d */
    public static final String f12097d = m16371b("maxTokens");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String value;

    /* JADX INFO: renamed from: k8.o5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f12099a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f12099a = aVar;
            C9757s0 c9757s0 = new C9757s0("io.modelcontextprotocol.kotlin.sdk.types.StopReason", aVar);
            c9757s0.m37938o("value", false);
            descriptor = c9757s0;
        }

        @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: a */
        public final InterfaceC9218f mo15953a() {
            return descriptor;
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
            m16378h(interfaceC9488f, ((C4125o5) obj).getValue());
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: c */
        public /* bridge */ InterfaceC8647b[] mo15955c() {
            return super.mo15955c();
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ Object mo15956d(InterfaceC9487e interfaceC9487e) {
            return C4125o5.m16370a(m16377g(interfaceC9487e));
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            return new InterfaceC8647b[]{C9790z2.f33080a};
        }

        /* JADX INFO: renamed from: g */
        public final String m16377g(InterfaceC9487e interfaceC9487e) {
            interfaceC9487e.getClass();
            return C4125o5.m16371b(interfaceC9487e.mo659B(descriptor).mo894k());
        }

        /* JADX INFO: renamed from: h */
        public final void m16378h(InterfaceC9488f interfaceC9488f, String str) {
            interfaceC9488f.getClass();
            str.getClass();
            InterfaceC9488f interfaceC9488fMo645m = interfaceC9488f.mo645m(descriptor);
            if (interfaceC9488fMo645m == null) {
                return;
            }
            interfaceC9488fMo645m.mo631F(str);
        }
    }

    public /* synthetic */ C4125o5(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4125o5 m16370a(String str) {
        return new C4125o5(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m16371b(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16372c(String str, Object obj) {
        return (obj instanceof C4125o5) && AbstractC1061t.m3842c(str, ((C4125o5) obj).getValue());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m16373d(String str, String str2) {
        return AbstractC1061t.m3842c(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m16374e(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: f */
    public static String m16375f(String str) {
        return "StopReason(value=" + str + ")";
    }

    public boolean equals(Object other) {
        return m16372c(this.value, other);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m16374e(this.value);
    }

    public String toString() {
        return m16375f(this.value);
    }

    /* JADX INFO: renamed from: k8.o5$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f12099a;
        }

        public Companion() {
        }
    }
}
