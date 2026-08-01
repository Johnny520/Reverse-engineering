package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p157k8.C4046d4;
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
import p375zc.C9950h0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.d6 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u001c\u001eB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010 ¨\u0006$"}, m16758d2 = {"Lk8/d6;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, "uri", "Lk8/d4;", "meta", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lzc/h0;Lyc/u2;Lb9/k;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "c", "(Lk8/d6;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lzc/h0;", "()Lzc/h0;", "getMeta-VI-3G7E$annotations", "()V", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4048d6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C9950h0 meta;

    /* JADX INFO: renamed from: k8.d6$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f11851a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f11851a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.UnsubscribeRequestParams", aVar, 2);
            c9714j2.m37938o("uri", false);
            c9714j2.m37938o("_meta", true);
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
            return new InterfaceC8647b[]{C9790z2.f33080a, AbstractC8920a.m34253u(C4046d4.a.f11848a)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4048d6 mo15956d(InterfaceC9487e interfaceC9487e) {
            String strMo36955m;
            int i10;
            C9950h0 json;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            if (interfaceC9485cMo674c.mo36958r()) {
                strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                C4046d4 c4046d4 = (C4046d4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C4046d4.a.f11848a, null);
                i10 = 3;
                json = c4046d4 != null ? c4046d4.getJson() : null;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strMo36955m = null;
                C9950h0 json2 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                        i11 |= 1;
                    } else {
                        if (iMo788v != 1) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        C4046d4 c4046d42 = (C4046d4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C4046d4.a.f11848a, json2 != null ? C4046d4.m16059a(json2) : null);
                        json2 = c4046d42 != null ? c4046d42.getJson() : null;
                        i11 |= 2;
                    }
                }
                i10 = i11;
                json = json2;
            }
            String str = strMo36955m;
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4048d6(i10, str, json, null, null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4048d6 c4048d6) {
            interfaceC9488f.getClass();
            c4048d6.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4048d6.m16068c(c4048d6, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4048d6(int i10, String str, C9950h0 c9950h0, AbstractC9769u2 abstractC9769u2) {
        if (1 != (i10 & 1)) {
            AbstractC9694f2.m37891a(i10, 1, a.f11851a.mo15953a());
        }
        this.uri = str;
        if ((i10 & 2) == 0) {
            this.meta = null;
        } else {
            this.meta = c9950h0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m16068c(C4048d6 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        output.mo36966D(serialDesc, 0, self.uri);
        if (!output.mo639e(serialDesc, 1) && self.getMeta() == null) {
            return;
        }
        C4046d4.a aVar = C4046d4.a.f11848a;
        C9950h0 meta = self.getMeta();
        output.mo646o(serialDesc, 1, aVar, meta != null ? C4046d4.m16059a(meta) : null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public C9950h0 getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p157k8.C4048d6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k8.d6 r5 = (p157k8.C4048d6) r5
            java.lang.String r1 = r4.uri
            java.lang.String r3 = r5.uri
            boolean r1 = p024b9.AbstractC1061t.m3842c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            zc.h0 r1 = r4.meta
            zc.h0 r5 = r5.meta
            if (r1 != 0) goto L23
            if (r5 != 0) goto L21
            r5 = r0
            goto L2a
        L21:
            r5 = r2
            goto L2a
        L23:
            if (r5 != 0) goto L26
            goto L21
        L26:
            boolean r5 = p157k8.C4046d4.m16062d(r1, r5)
        L2a:
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p157k8.C4048d6.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode = this.uri.hashCode() * 31;
        C9950h0 c9950h0 = this.meta;
        return iHashCode + (c9950h0 == null ? 0 : C4046d4.m16063e(c9950h0));
    }

    public String toString() {
        String str = this.uri;
        C9950h0 c9950h0 = this.meta;
        return "UnsubscribeRequestParams(uri=" + str + ", meta=" + (c9950h0 == null ? "null" : C4046d4.m16064f(c9950h0)) + ")";
    }

    /* JADX INFO: renamed from: k8.d6$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f11851a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ C4048d6(int i10, String str, C9950h0 c9950h0, AbstractC9769u2 abstractC9769u2, AbstractC1043k abstractC1043k) {
        this(i10, str, c9950h0, abstractC9769u2);
    }
}
