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
import p361yc.InterfaceC9732n0;
import p375zc.C9950h0;
import p375zc.C9954j0;

/* JADX INFO: renamed from: k8.d4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0010\u0004B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, m16758d2 = {"Lk8/d4;", _UrlKt.FRAGMENT_ENCODE_SET, "Lzc/h0;", "json", "b", "(Lzc/h0;)Lzc/h0;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Lzc/h0;", "getJson", "()Lzc/h0;", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class C4046d4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C9950h0 json;

    /* JADX INFO: renamed from: k8.d4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f11848a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f11848a = aVar;
            C9757s0 c9757s0 = new C9757s0("io.modelcontextprotocol.kotlin.sdk.types.RequestMeta", aVar);
            c9757s0.m37938o("json", false);
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
            m16067h(interfaceC9488f, ((C4046d4) obj).getJson());
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: c */
        public /* bridge */ InterfaceC8647b[] mo15955c() {
            return super.mo15955c();
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ Object mo15956d(InterfaceC9487e interfaceC9487e) {
            return C4046d4.m16059a(m16066g(interfaceC9487e));
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            return new InterfaceC8647b[]{C9954j0.f33538a};
        }

        /* JADX INFO: renamed from: g */
        public final C9950h0 m16066g(InterfaceC9487e interfaceC9487e) {
            interfaceC9487e.getClass();
            return C4046d4.m16060b((C9950h0) interfaceC9487e.mo659B(descriptor).mo660D(C9954j0.f33538a));
        }

        /* JADX INFO: renamed from: h */
        public final void m16067h(InterfaceC9488f interfaceC9488f, C9950h0 c9950h0) {
            interfaceC9488f.getClass();
            c9950h0.getClass();
            InterfaceC9488f interfaceC9488fMo645m = interfaceC9488f.mo645m(descriptor);
            if (interfaceC9488fMo645m == null) {
                return;
            }
            interfaceC9488fMo645m.mo632G(C9954j0.f33538a, c9950h0);
        }
    }

    public /* synthetic */ C4046d4(C9950h0 c9950h0) {
        this.json = c9950h0;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4046d4 m16059a(C9950h0 c9950h0) {
        return new C4046d4(c9950h0);
    }

    /* JADX INFO: renamed from: b */
    public static C9950h0 m16060b(C9950h0 c9950h0) {
        c9950h0.getClass();
        return c9950h0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16061c(C9950h0 c9950h0, Object obj) {
        return (obj instanceof C4046d4) && AbstractC1061t.m3842c(c9950h0, ((C4046d4) obj).getJson());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m16062d(C9950h0 c9950h0, C9950h0 c9950h02) {
        return AbstractC1061t.m3842c(c9950h0, c9950h02);
    }

    /* JADX INFO: renamed from: e */
    public static int m16063e(C9950h0 c9950h0) {
        return c9950h0.hashCode();
    }

    /* JADX INFO: renamed from: f */
    public static String m16064f(C9950h0 c9950h0) {
        return "RequestMeta(json=" + c9950h0 + ")";
    }

    public boolean equals(Object other) {
        return m16061c(this.json, other);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ C9950h0 getJson() {
        return this.json;
    }

    public int hashCode() {
        return m16063e(this.json);
    }

    public String toString() {
        return m16064f(this.json);
    }

    /* JADX INFO: renamed from: k8.d4$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f11848a;
        }

        public Companion() {
        }
    }
}
