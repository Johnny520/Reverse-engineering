package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p157k8.C4137q3;
import p170l6.C4662a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9694f2;
import p361yc.AbstractC9769u2;
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.l1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002 \"B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%R \u0010\u000b\u001a\u00020\n8\u0016X\u0097D¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010\u0018¨\u0006+"}, m16758d2 = {"Lk8/l1;", "Lk8/m1;", "Lk8/b4;", "id", "Lk8/q3;", "error", "<init>", "(Lk8/b4;Lk8/q3;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, "jsonrpc", "Lyc/u2;", "serializationConstructorMarker", "(ILk8/b4;Lk8/q3;Ljava/lang/String;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "d", "(Lk8/l1;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Lk8/b4;", "b", "()Lk8/b4;", "Lk8/q3;", "()Lk8/q3;", "c", "Ljava/lang/String;", "getJsonrpc$annotations", "()V", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4100l1 implements InterfaceC4107m1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final InterfaceC4030b4 id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C4137q3 error;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String jsonrpc;

    /* JADX INFO: renamed from: k8.l1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f12021a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f12021a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.JSONRPCError", aVar, 3);
            c9714j2.m37938o("id", false);
            c9714j2.m37938o("error", false);
            c9714j2.m37938o("jsonrpc", true);
            descriptor = c9714j2;
        }

        @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: a */
        public final InterfaceC9218f mo15953a() {
            return descriptor;
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: c */
        public /* bridge */ InterfaceC8647b[] mo15955c() {
            return super.mo15955c();
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public final InterfaceC8647b[] mo15957e() {
            return new InterfaceC8647b[]{AbstractC8920a.m34253u(C4038c4.f11828c), C4137q3.a.f12145a, C9790z2.f33080a};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4100l1 mo15956d(InterfaceC9487e interfaceC9487e) {
            int i10;
            InterfaceC4030b4 interfaceC4030b4;
            C4137q3 c4137q3;
            String strMo36955m;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            InterfaceC4030b4 interfaceC4030b42 = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                InterfaceC4030b4 interfaceC4030b43 = (InterfaceC4030b4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C4038c4.f11828c, null);
                C4137q3 c4137q32 = (C4137q3) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, C4137q3.a.f12145a, null);
                interfaceC4030b4 = interfaceC4030b43;
                strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 2);
                c4137q3 = c4137q32;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                C4137q3 c4137q33 = null;
                String strMo36955m2 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        interfaceC4030b42 = (InterfaceC4030b4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C4038c4.f11828c, interfaceC4030b42);
                        i11 |= 1;
                    } else if (iMo788v == 1) {
                        c4137q33 = (C4137q3) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, C4137q3.a.f12145a, c4137q33);
                        i11 |= 2;
                    } else {
                        if (iMo788v != 2) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        strMo36955m2 = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                interfaceC4030b4 = interfaceC4030b42;
                c4137q3 = c4137q33;
                strMo36955m = strMo36955m2;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4100l1(i10, interfaceC4030b4, c4137q3, strMo36955m, null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4100l1 c4100l1) {
            interfaceC9488f.getClass();
            c4100l1.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4100l1.m16291d(c4100l1, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4100l1(int i10, InterfaceC4030b4 interfaceC4030b4, C4137q3 c4137q3, String str, AbstractC9769u2 abstractC9769u2) {
        if (3 != (i10 & 3)) {
            AbstractC9694f2.m37891a(i10, 3, a.f12021a.mo15953a());
        }
        this.id = interfaceC4030b4;
        this.error = c4137q3;
        if ((i10 & 4) == 0) {
            this.jsonrpc = "2.0";
        } else {
            this.jsonrpc = str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m16291d(C4100l1 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        output.mo646o(serialDesc, 0, C4038c4.f11828c, self.id);
        output.mo36969g(serialDesc, 1, C4137q3.a.f12145a, self.error);
        output.mo36966D(serialDesc, 2, self.getJsonrpc());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4137q3 getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC4030b4 getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4100l1)) {
            return false;
        }
        C4100l1 c4100l1 = (C4100l1) other;
        return AbstractC1061t.m3842c(this.id, c4100l1.id) && AbstractC1061t.m3842c(this.error, c4100l1.error);
    }

    public int hashCode() {
        InterfaceC4030b4 interfaceC4030b4 = this.id;
        return ((interfaceC4030b4 == null ? 0 : interfaceC4030b4.hashCode()) * 31) + this.error.hashCode();
    }

    public String toString() {
        return "JSONRPCError(id=" + this.id + ", error=" + this.error + ")";
    }

    /* JADX INFO: renamed from: k8.l1$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f12021a;
        }

        public Companion() {
        }
    }

    public C4100l1(InterfaceC4030b4 interfaceC4030b4, C4137q3 c4137q3) {
        c4137q3.getClass();
        this.id = interfaceC4030b4;
        this.error = c4137q3;
        this.jsonrpc = "2.0";
    }
}
