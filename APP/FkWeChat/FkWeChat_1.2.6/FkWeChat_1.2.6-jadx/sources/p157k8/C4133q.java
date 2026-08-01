package p157k8;

import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p157k8.C4046d4;
import p157k8.C4133q;
import p170l6.C4662a;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p300uc.InterfaceC8645a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9694f2;
import p361yc.AbstractC9769u2;
import p361yc.C9678c1;
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;
import p375zc.C9950h0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0004\u0016,!(BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b!\u0010.¨\u00062"}, m16758d2 = {"Lk8/q;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lk8/q$b;", "argument", "Lk8/v3;", "ref", "Lk8/q$d;", "context", "Lk8/d4;", "meta", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILk8/q$b;Lk8/v3;Lk8/q$d;Lzc/h0;Lyc/u2;Lb9/k;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "b", "(Lk8/q;Lxc/d;Lwc/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Lk8/q$b;", "getArgument", "()Lk8/q$b;", "Lk8/v3;", "getRef", "()Lk8/v3;", "c", "Lk8/q$d;", "getContext", "()Lk8/q$d;", "d", "Lzc/h0;", "()Lzc/h0;", "getMeta-VI-3G7E$annotations", "()V", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4133q {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final b argument;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC4172v3 ref;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final d context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C9950h0 meta;

    /* JADX INFO: renamed from: k8.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f12127a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f12127a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.CompleteRequestParams", aVar, 4);
            c9714j2.m37938o("argument", false);
            c9714j2.m37938o("ref", false);
            c9714j2.m37938o("context", true);
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
            return new InterfaceC8647b[]{b.a.f12130a, C4186x3.f12295c, AbstractC8920a.m34253u(d.a.f12133a), AbstractC8920a.m34253u(C4046d4.a.f11848a)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4133q mo15956d(InterfaceC9487e interfaceC9487e) {
            b bVar;
            int i10;
            d dVar;
            InterfaceC4172v3 interfaceC4172v3;
            C9950h0 json;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            if (interfaceC9485cMo674c.mo36958r()) {
                bVar = (b) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, b.a.f12130a, null);
                InterfaceC4172v3 interfaceC4172v32 = (InterfaceC4172v3) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, C4186x3.f12295c, null);
                d dVar2 = (d) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, d.a.f12133a, null);
                C4046d4 c4046d4 = (C4046d4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, C4046d4.a.f11848a, null);
                i10 = 15;
                dVar = dVar2;
                interfaceC4172v3 = interfaceC4172v32;
                json = c4046d4 != null ? c4046d4.getJson() : null;
            } else {
                boolean z10 = true;
                int i11 = 0;
                bVar = null;
                d dVar3 = null;
                InterfaceC4172v3 interfaceC4172v33 = null;
                C9950h0 json2 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        bVar = (b) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, b.a.f12130a, bVar);
                        i11 |= 1;
                    } else if (iMo788v == 1) {
                        interfaceC4172v33 = (InterfaceC4172v3) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, C4186x3.f12295c, interfaceC4172v33);
                        i11 |= 2;
                    } else if (iMo788v == 2) {
                        dVar3 = (d) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, d.a.f12133a, dVar3);
                        i11 |= 4;
                    } else {
                        if (iMo788v != 3) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        C4046d4 c4046d42 = (C4046d4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, C4046d4.a.f11848a, json2 != null ? C4046d4.m16059a(json2) : null);
                        json2 = c4046d42 != null ? c4046d42.getJson() : null;
                        i11 |= 8;
                    }
                }
                i10 = i11;
                dVar = dVar3;
                interfaceC4172v3 = interfaceC4172v33;
                json = json2;
            }
            b bVar2 = bVar;
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4133q(i10, bVar2, interfaceC4172v3, dVar, json, null, null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4133q c4133q) {
            interfaceC9488f.getClass();
            c4133q.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4133q.m16410b(c4133q, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4133q(int i10, b bVar, InterfaceC4172v3 interfaceC4172v3, d dVar, C9950h0 c9950h0, AbstractC9769u2 abstractC9769u2) {
        if (3 != (i10 & 3)) {
            AbstractC9694f2.m37891a(i10, 3, a.f12127a.mo15953a());
        }
        this.argument = bVar;
        this.ref = interfaceC4172v3;
        if ((i10 & 4) == 0) {
            this.context = null;
        } else {
            this.context = dVar;
        }
        if ((i10 & 8) == 0) {
            this.meta = null;
        } else {
            this.meta = c9950h0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m16410b(C4133q self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        output.mo36969g(serialDesc, 0, b.a.f12130a, self.argument);
        output.mo36969g(serialDesc, 1, C4186x3.f12295c, self.ref);
        if (output.mo639e(serialDesc, 2) || self.context != null) {
            output.mo646o(serialDesc, 2, d.a.f12133a, self.context);
        }
        if (!output.mo639e(serialDesc, 3) && self.getMeta() == null) {
            return;
        }
        C4046d4.a aVar = C4046d4.a.f11848a;
        C9950h0 meta = self.getMeta();
        output.mo646o(serialDesc, 3, aVar, meta != null ? C4046d4.m16059a(meta) : null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public C9950h0 getMeta() {
        return this.meta;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
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
            boolean r1 = r5 instanceof p157k8.C4133q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k8.q r5 = (p157k8.C4133q) r5
            k8.q$b r1 = r4.argument
            k8.q$b r3 = r5.argument
            boolean r1 = p024b9.AbstractC1061t.m3842c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            k8.v3 r1 = r4.ref
            k8.v3 r3 = r5.ref
            boolean r1 = p024b9.AbstractC1061t.m3842c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            k8.q$d r1 = r4.context
            k8.q$d r3 = r5.context
            boolean r1 = p024b9.AbstractC1061t.m3842c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            zc.h0 r1 = r4.meta
            zc.h0 r5 = r5.meta
            if (r1 != 0) goto L39
            if (r5 != 0) goto L37
            r5 = r0
            goto L40
        L37:
            r5 = r2
            goto L40
        L39:
            if (r5 != 0) goto L3c
            goto L37
        L3c:
            boolean r5 = p157k8.C4046d4.m16062d(r1, r5)
        L40:
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p157k8.C4133q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode = ((this.argument.hashCode() * 31) + this.ref.hashCode()) * 31;
        d dVar = this.context;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C9950h0 c9950h0 = this.meta;
        return iHashCode2 + (c9950h0 != null ? C4046d4.m16063e(c9950h0) : 0);
    }

    public String toString() {
        b bVar = this.argument;
        InterfaceC4172v3 interfaceC4172v3 = this.ref;
        d dVar = this.context;
        C9950h0 c9950h0 = this.meta;
        return "CompleteRequestParams(argument=" + bVar + ", ref=" + interfaceC4172v3 + ", context=" + dVar + ", meta=" + (c9950h0 == null ? "null" : C4046d4.m16064f(c9950h0)) + ")";
    }

    /* JADX INFO: renamed from: k8.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011\u001dB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014¨\u0006 "}, m16758d2 = {"Lk8/q$b;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, "name", "value", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "a", "(Lk8/q$b;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "getValue", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final String value;

        /* JADX INFO: renamed from: k8.q$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class a implements InterfaceC9732n0 {

            /* JADX INFO: renamed from: a */
            public static final a f12130a;
            private static final InterfaceC9218f descriptor;

            static {
                a aVar = new a();
                f12130a = aVar;
                C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.CompleteRequestParams.Argument", aVar, 2);
                c9714j2.m37938o("name", false);
                c9714j2.m37938o("value", false);
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
                C9790z2 c9790z2 = C9790z2.f33080a;
                return new InterfaceC8647b[]{c9790z2, c9790z2};
            }

            @Override // p300uc.InterfaceC8645a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final b mo15956d(InterfaceC9487e interfaceC9487e) {
                String strMo36955m;
                String strMo36955m2;
                int i10;
                interfaceC9487e.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
                AbstractC9769u2 abstractC9769u2 = null;
                if (interfaceC9485cMo674c.mo36958r()) {
                    strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                    strMo36955m2 = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strMo36955m = null;
                    String strMo36955m3 = null;
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
                            strMo36955m3 = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 1);
                            i11 |= 2;
                        }
                    }
                    strMo36955m2 = strMo36955m3;
                    i10 = i11;
                }
                interfaceC9485cMo674c.mo675d(interfaceC9218f);
                return new b(i10, strMo36955m, strMo36955m2, abstractC9769u2);
            }

            @Override // p300uc.InterfaceC8662p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void mo15954b(InterfaceC9488f interfaceC9488f, b bVar) {
                interfaceC9488f.getClass();
                bVar.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
                b.m16414a(bVar, interfaceC9486dMo637c, interfaceC9218f);
                interfaceC9486dMo637c.mo638d(interfaceC9218f);
            }
        }

        public /* synthetic */ b(int i10, String str, String str2, AbstractC9769u2 abstractC9769u2) {
            if (3 != (i10 & 3)) {
                AbstractC9694f2.m37891a(i10, 3, a.f12130a.mo15953a());
            }
            this.name = str;
            this.value = str2;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ void m16414a(b self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
            output.mo36966D(serialDesc, 0, self.name);
            output.mo36966D(serialDesc, 1, self.value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC1061t.m3842c(this.name, bVar.name) && AbstractC1061t.m3842c(this.value, bVar.value);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Argument(name=" + this.name + ", value=" + this.value + ")";
        }

        /* JADX INFO: renamed from: k8.q$b$b, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f12130a;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: k8.q$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001b B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m16758d2 = {"Lk8/q$d;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "arguments", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILjava/util/Map;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "d", "(Lk8/q$d;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getArguments", "()Ljava/util/Map;", "Companion", "b", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b */
        public static final InterfaceC4705l[] f12131b = {AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.r
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4133q.d.m16418b();
            }
        })};

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Map arguments;

        /* JADX INFO: renamed from: k8.q$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class a implements InterfaceC9732n0 {

            /* JADX INFO: renamed from: a */
            public static final a f12133a;
            private static final InterfaceC9218f descriptor;

            static {
                a aVar = new a();
                f12133a = aVar;
                C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.CompleteRequestParams.Context", aVar, 1);
                c9714j2.m37938o("arguments", true);
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
                return new InterfaceC8647b[]{AbstractC8920a.m34253u((InterfaceC8647b) d.f12131b[0].getValue())};
            }

            @Override // p300uc.InterfaceC8645a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final d mo15956d(InterfaceC9487e interfaceC9487e) {
                Map map;
                interfaceC9487e.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
                InterfaceC4705l[] interfaceC4705lArr = d.f12131b;
                int i10 = 1;
                AbstractC9769u2 abstractC9769u2 = null;
                if (interfaceC9485cMo674c.mo36958r()) {
                    map = (Map) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, (InterfaceC8645a) interfaceC4705lArr[0].getValue(), null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Map map2 = null;
                    while (z10) {
                        int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                        if (iMo788v == -1) {
                            z10 = false;
                        } else {
                            if (iMo788v != 0) {
                                C4662a.m18633a(iMo788v);
                                return null;
                            }
                            map2 = (Map) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, (InterfaceC8645a) interfaceC4705lArr[0].getValue(), map2);
                            i11 = 1;
                        }
                    }
                    map = map2;
                    i10 = i11;
                }
                interfaceC9485cMo674c.mo675d(interfaceC9218f);
                return new d(i10, map, abstractC9769u2);
            }

            @Override // p300uc.InterfaceC8662p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void mo15954b(InterfaceC9488f interfaceC9488f, d dVar) {
                interfaceC9488f.getClass();
                dVar.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
                d.m16420d(dVar, interfaceC9486dMo637c, interfaceC9218f);
                interfaceC9486dMo637c.mo638d(interfaceC9218f);
            }
        }

        public /* synthetic */ d(int i10, Map map, AbstractC9769u2 abstractC9769u2) {
            if ((i10 & 1) == 0) {
                this.arguments = null;
            } else {
                this.arguments = map;
            }
        }

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ InterfaceC8647b m16418b() {
            C9790z2 c9790z2 = C9790z2.f33080a;
            return new C9678c1(c9790z2, c9790z2);
        }

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ void m16420d(d self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
            InterfaceC4705l[] interfaceC4705lArr = f12131b;
            if (!output.mo639e(serialDesc, 0) && self.arguments == null) {
                return;
            }
            output.mo646o(serialDesc, 0, (InterfaceC8662p) interfaceC4705lArr[0].getValue(), self.arguments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC1061t.m3842c(this.arguments, ((d) other).arguments);
        }

        public int hashCode() {
            Map map = this.arguments;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public String toString() {
            return "Context(arguments=" + this.arguments + ")";
        }

        /* JADX INFO: renamed from: k8.q$d$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f12133a;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: k8.q$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f12127a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ C4133q(int i10, b bVar, InterfaceC4172v3 interfaceC4172v3, d dVar, C9950h0 c9950h0, AbstractC9769u2 abstractC9769u2, AbstractC1043k abstractC1043k) {
        this(i10, bVar, interfaceC4172v3, dVar, c9950h0, abstractC9769u2);
    }
}
