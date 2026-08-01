package p157k8;

import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p157k8.C4046d4;
import p157k8.C4078i0;
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
import p361yc.C9691f;
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;
import p375zc.C9950h0;
import p375zc.C9954j0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0003$\u001e\u0014B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b\u001e\u0010&¨\u0006*"}, m16758d2 = {"Lk8/i0;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, "message", "Lk8/i0$c;", "requestedSchema", "Lk8/d4;", "meta", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lk8/i0$c;Lzc/h0;Lyc/u2;Lb9/k;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "b", "(Lk8/i0;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "Lk8/i0$c;", "getRequestedSchema", "()Lk8/i0$c;", "c", "Lzc/h0;", "()Lzc/h0;", "getMeta-VI-3G7E$annotations", "()V", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4078i0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final c requestedSchema;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C9950h0 meta;

    /* JADX INFO: renamed from: k8.i0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f11939a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f11939a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.ElicitRequestParams", aVar, 3);
            c9714j2.m37938o("message", false);
            c9714j2.m37938o("requestedSchema", false);
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
            return new InterfaceC8647b[]{C9790z2.f33080a, c.a.f11944a, AbstractC8920a.m34253u(C4046d4.a.f11848a)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4078i0 mo15956d(InterfaceC9487e interfaceC9487e) {
            String strMo36955m;
            int i10;
            c cVar;
            C9950h0 json;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            if (interfaceC9485cMo674c.mo36958r()) {
                strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                c cVar2 = (c) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, c.a.f11944a, null);
                C4046d4 c4046d4 = (C4046d4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C4046d4.a.f11848a, null);
                i10 = 7;
                cVar = cVar2;
                json = c4046d4 != null ? c4046d4.getJson() : null;
            } else {
                boolean z10 = true;
                int i11 = 0;
                strMo36955m = null;
                c cVar3 = null;
                C9950h0 json2 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 0);
                        i11 |= 1;
                    } else if (iMo788v == 1) {
                        cVar3 = (c) interfaceC9485cMo674c.mo895x(interfaceC9218f, 1, c.a.f11944a, cVar3);
                        i11 |= 2;
                    } else {
                        if (iMo788v != 2) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        C4046d4 c4046d42 = (C4046d4) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C4046d4.a.f11848a, json2 != null ? C4046d4.m16059a(json2) : null);
                        json2 = c4046d42 != null ? c4046d42.getJson() : null;
                        i11 |= 4;
                    }
                }
                i10 = i11;
                cVar = cVar3;
                json = json2;
            }
            String str = strMo36955m;
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4078i0(i10, str, cVar, json, null, null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4078i0 c4078i0) {
            interfaceC9488f.getClass();
            c4078i0.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4078i0.m16203b(c4078i0, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4078i0(int i10, String str, c cVar, C9950h0 c9950h0, AbstractC9769u2 abstractC9769u2) {
        if (3 != (i10 & 3)) {
            AbstractC9694f2.m37891a(i10, 3, a.f11939a.mo15953a());
        }
        this.message = str;
        this.requestedSchema = cVar;
        if ((i10 & 4) == 0) {
            this.meta = null;
        } else {
            this.meta = c9950h0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m16203b(C4078i0 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        output.mo36966D(serialDesc, 0, self.message);
        output.mo36969g(serialDesc, 1, c.a.f11944a, self.requestedSchema);
        if (!output.mo639e(serialDesc, 2) && self.getMeta() == null) {
            return;
        }
        C4046d4.a aVar = C4046d4.a.f11848a;
        C9950h0 meta = self.getMeta();
        output.mo646o(serialDesc, 2, aVar, meta != null ? C4046d4.m16059a(meta) : null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public C9950h0 getMeta() {
        return this.meta;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r5 instanceof p157k8.C4078i0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k8.i0 r5 = (p157k8.C4078i0) r5
            java.lang.String r1 = r4.message
            java.lang.String r3 = r5.message
            boolean r1 = p024b9.AbstractC1061t.m3842c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            k8.i0$c r1 = r4.requestedSchema
            k8.i0$c r3 = r5.requestedSchema
            boolean r1 = p024b9.AbstractC1061t.m3842c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            zc.h0 r1 = r4.meta
            zc.h0 r5 = r5.meta
            if (r1 != 0) goto L2e
            if (r5 != 0) goto L2c
            r5 = r0
            goto L35
        L2c:
            r5 = r2
            goto L35
        L2e:
            if (r5 != 0) goto L31
            goto L2c
        L31:
            boolean r5 = p157k8.C4046d4.m16062d(r1, r5)
        L35:
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p157k8.C4078i0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + this.requestedSchema.hashCode()) * 31;
        C9950h0 c9950h0 = this.meta;
        return iHashCode + (c9950h0 == null ? 0 : C4046d4.m16063e(c9950h0));
    }

    public String toString() {
        String str = this.message;
        c cVar = this.requestedSchema;
        C9950h0 c9950h0 = this.meta;
        return "ElicitRequestParams(message=" + str + ", requestedSchema=" + cVar + ", meta=" + (c9950h0 == null ? "null" : C4046d4.m16064f(c9950h0)) + ")";
    }

    /* JADX INFO: renamed from: k8.i0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002\u001e\"B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\t\u001a\u00020\u00078\u0006X\u0087D¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0017¨\u0006,"}, m16758d2 = {"Lk8/i0$c;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lzc/h0;", "properties", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "required", "type", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILzc/h0;Ljava/util/List;Ljava/lang/String;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "d", "(Lk8/i0$c;Lxc/d;Lwc/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Lzc/h0;", "getProperties", "()Lzc/h0;", "b", "Ljava/util/List;", "getRequired", "()Ljava/util/List;", "c", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d */
        public static final InterfaceC4705l[] f11940d = {null, AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.j0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C4078i0.c.m16208b();
            }
        }), null};

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final C9950h0 properties;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final List required;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final String type;

        /* JADX INFO: renamed from: k8.i0$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class a implements InterfaceC9732n0 {

            /* JADX INFO: renamed from: a */
            public static final a f11944a;
            private static final InterfaceC9218f descriptor;

            static {
                a aVar = new a();
                f11944a = aVar;
                C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.ElicitRequestParams.RequestedSchema", aVar, 3);
                c9714j2.m37938o("properties", false);
                c9714j2.m37938o("required", true);
                c9714j2.m37938o("type", true);
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
                return new InterfaceC8647b[]{C9954j0.f33538a, AbstractC8920a.m34253u((InterfaceC8647b) c.f11940d[1].getValue()), C9790z2.f33080a};
            }

            @Override // p300uc.InterfaceC8645a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final c mo15956d(InterfaceC9487e interfaceC9487e) {
                int i10;
                C9950h0 c9950h0;
                List list;
                String strMo36955m;
                interfaceC9487e.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
                InterfaceC4705l[] interfaceC4705lArr = c.f11940d;
                C9950h0 c9950h02 = null;
                if (interfaceC9485cMo674c.mo36958r()) {
                    C9950h0 c9950h03 = (C9950h0) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, C9954j0.f33538a, null);
                    list = (List) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, (InterfaceC8645a) interfaceC4705lArr[1].getValue(), null);
                    c9950h0 = c9950h03;
                    strMo36955m = interfaceC9485cMo674c.mo36955m(interfaceC9218f, 2);
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    List list2 = null;
                    String strMo36955m2 = null;
                    while (z10) {
                        int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                        if (iMo788v == -1) {
                            z10 = false;
                        } else if (iMo788v == 0) {
                            c9950h02 = (C9950h0) interfaceC9485cMo674c.mo895x(interfaceC9218f, 0, C9954j0.f33538a, c9950h02);
                            i11 |= 1;
                        } else if (iMo788v == 1) {
                            list2 = (List) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, (InterfaceC8645a) interfaceC4705lArr[1].getValue(), list2);
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
                    c9950h0 = c9950h02;
                    list = list2;
                    strMo36955m = strMo36955m2;
                }
                interfaceC9485cMo674c.mo675d(interfaceC9218f);
                return new c(i10, c9950h0, list, strMo36955m, null);
            }

            @Override // p300uc.InterfaceC8662p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void mo15954b(InterfaceC9488f interfaceC9488f, c cVar) {
                interfaceC9488f.getClass();
                cVar.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
                c.m16210d(cVar, interfaceC9486dMo637c, interfaceC9218f);
                interfaceC9486dMo637c.mo638d(interfaceC9218f);
            }
        }

        public /* synthetic */ c(int i10, C9950h0 c9950h0, List list, String str, AbstractC9769u2 abstractC9769u2) {
            if (1 != (i10 & 1)) {
                AbstractC9694f2.m37891a(i10, 1, a.f11944a.mo15953a());
            }
            this.properties = c9950h0;
            if ((i10 & 2) == 0) {
                this.required = null;
            } else {
                this.required = list;
            }
            if ((i10 & 4) == 0) {
                this.type = "object";
            } else {
                this.type = str;
            }
        }

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ InterfaceC8647b m16208b() {
            return new C9691f(C9790z2.f33080a);
        }

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ void m16210d(c self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
            InterfaceC4705l[] interfaceC4705lArr = f11940d;
            output.mo36969g(serialDesc, 0, C9954j0.f33538a, self.properties);
            if (output.mo639e(serialDesc, 1) || self.required != null) {
                output.mo646o(serialDesc, 1, (InterfaceC8662p) interfaceC4705lArr[1].getValue(), self.required);
            }
            output.mo36966D(serialDesc, 2, self.type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC1061t.m3842c(this.properties, cVar.properties) && AbstractC1061t.m3842c(this.required, cVar.required);
        }

        public int hashCode() {
            int iHashCode = this.properties.hashCode() * 31;
            List list = this.required;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "RequestedSchema(properties=" + this.properties + ", required=" + this.required + ")";
        }

        /* JADX INFO: renamed from: k8.i0$c$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f11944a;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: k8.i0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f11939a;
        }

        public Companion() {
        }
    }

    public /* synthetic */ C4078i0(int i10, String str, c cVar, C9950h0 c9950h0, AbstractC9769u2 abstractC9769u2, AbstractC1043k abstractC1043k) {
        this(i10, str, cVar, c9950h0, abstractC9769u2);
    }
}
