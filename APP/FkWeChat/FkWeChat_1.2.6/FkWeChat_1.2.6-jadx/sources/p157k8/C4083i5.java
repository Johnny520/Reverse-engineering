package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p170l6.C4662a;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;
import p361yc.AbstractC9769u2;
import p361yc.C9706i;
import p361yc.C9714j2;
import p361yc.InterfaceC9732n0;
import p375zc.C9950h0;
import p375zc.C9954j0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.i5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0005(&*,$BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b(\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b1\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b$\u00100¨\u00063"}, m16758d2 = {"Lk8/i5;", _UrlKt.FRAGMENT_ENCODE_SET, "Lk8/i5$e;", "tools", "Lk8/i5$d;", "resources", "Lk8/i5$c;", "prompts", "Lzc/h0;", "logging", "completions", "experimental", "<init>", "(Lk8/i5$e;Lk8/i5$d;Lk8/i5$c;Lzc/h0;Lzc/h0;Lzc/h0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILk8/i5$e;Lk8/i5$d;Lk8/i5$c;Lzc/h0;Lzc/h0;Lzc/h0;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "f", "(Lk8/i5;Lxc/d;Lwc/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Lk8/i5$e;", "e", "()Lk8/i5$e;", "b", "Lk8/i5$d;", "d", "()Lk8/i5$d;", "c", "Lk8/i5$c;", "()Lk8/i5$c;", "Lzc/h0;", "()Lzc/h0;", "getCompletions", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4083i5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final C9950h0 f11948g = AbstractC4163u1.m16523d();

    /* JADX INFO: renamed from: h */
    public static final C9950h0 f11949h = AbstractC4163u1.m16523d();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final e tools;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final d resources;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final c prompts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C9950h0 logging;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final C9950h0 completions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final C9950h0 experimental;

    /* JADX INFO: renamed from: k8.i5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f11956a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f11956a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.ServerCapabilities", aVar, 6);
            c9714j2.m37938o("tools", true);
            c9714j2.m37938o("resources", true);
            c9714j2.m37938o("prompts", true);
            c9714j2.m37938o("logging", true);
            c9714j2.m37938o("completions", true);
            c9714j2.m37938o("experimental", true);
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
            InterfaceC8647b interfaceC8647bM34253u = AbstractC8920a.m34253u(e.a.f11963a);
            InterfaceC8647b interfaceC8647bM34253u2 = AbstractC8920a.m34253u(d.a.f11961a);
            InterfaceC8647b interfaceC8647bM34253u3 = AbstractC8920a.m34253u(c.a.f11958a);
            C9954j0 c9954j0 = C9954j0.f33538a;
            return new InterfaceC8647b[]{interfaceC8647bM34253u, interfaceC8647bM34253u2, interfaceC8647bM34253u3, AbstractC8920a.m34253u(c9954j0), AbstractC8920a.m34253u(c9954j0), AbstractC8920a.m34253u(c9954j0)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4083i5 mo15956d(InterfaceC9487e interfaceC9487e) {
            int i10;
            e eVar;
            d dVar;
            c cVar;
            C9950h0 c9950h0;
            C9950h0 c9950h02;
            C9950h0 c9950h03;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            int i11 = 5;
            boolean z10 = false;
            e eVar2 = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                e eVar3 = (e) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, e.a.f11963a, null);
                d dVar2 = (d) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, d.a.f11961a, null);
                c cVar2 = (c) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, c.a.f11958a, null);
                C9954j0 c9954j0 = C9954j0.f33538a;
                C9950h0 c9950h04 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, c9954j0, null);
                C9950h0 c9950h05 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 4, c9954j0, null);
                eVar = eVar3;
                c9950h03 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 5, c9954j0, null);
                c9950h0 = c9950h04;
                c9950h02 = c9950h05;
                cVar = cVar2;
                dVar = dVar2;
                i10 = 63;
            } else {
                boolean z11 = true;
                int i12 = 0;
                d dVar3 = null;
                c cVar3 = null;
                C9950h0 c9950h06 = null;
                C9950h0 c9950h07 = null;
                C9950h0 c9950h08 = null;
                while (z11) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    switch (iMo788v) {
                        case -1:
                            z11 = z10;
                            i11 = 5;
                            break;
                        case 0:
                            eVar2 = (e) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, e.a.f11963a, eVar2);
                            i12 |= 1;
                            z10 = false;
                            i11 = 5;
                            break;
                        case 1:
                            dVar3 = (d) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, d.a.f11961a, dVar3);
                            i12 |= 2;
                            z10 = false;
                            break;
                        case 2:
                            cVar3 = (c) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, c.a.f11958a, cVar3);
                            i12 |= 4;
                            z10 = false;
                            break;
                        case 3:
                            c9950h06 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 3, C9954j0.f33538a, c9950h06);
                            i12 |= 8;
                            z10 = false;
                            break;
                        case 4:
                            c9950h07 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 4, C9954j0.f33538a, c9950h07);
                            i12 |= 16;
                            z10 = false;
                            break;
                        case 5:
                            c9950h08 = (C9950h0) interfaceC9485cMo674c.mo36949C(interfaceC9218f, i11, C9954j0.f33538a, c9950h08);
                            i12 |= 32;
                            z10 = false;
                            break;
                        default:
                            C4662a.m18633a(iMo788v);
                            return null;
                    }
                }
                i10 = i12;
                eVar = eVar2;
                dVar = dVar3;
                cVar = cVar3;
                c9950h0 = c9950h06;
                c9950h02 = c9950h07;
                c9950h03 = c9950h08;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4083i5(i10, eVar, dVar, cVar, c9950h0, c9950h02, c9950h03, (AbstractC9769u2) null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4083i5 c4083i5) {
            interfaceC9488f.getClass();
            c4083i5.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4083i5.m16217f(c4083i5, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4083i5(int i10, e eVar, d dVar, c cVar, C9950h0 c9950h0, C9950h0 c9950h02, C9950h0 c9950h03, AbstractC9769u2 abstractC9769u2) {
        if ((i10 & 1) == 0) {
            this.tools = null;
        } else {
            this.tools = eVar;
        }
        if ((i10 & 2) == 0) {
            this.resources = null;
        } else {
            this.resources = dVar;
        }
        if ((i10 & 4) == 0) {
            this.prompts = null;
        } else {
            this.prompts = cVar;
        }
        if ((i10 & 8) == 0) {
            this.logging = null;
        } else {
            this.logging = c9950h0;
        }
        if ((i10 & 16) == 0) {
            this.completions = null;
        } else {
            this.completions = c9950h02;
        }
        if ((i10 & 32) == 0) {
            this.experimental = null;
        } else {
            this.experimental = c9950h03;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ void m16217f(C4083i5 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        if (output.mo639e(serialDesc, 0) || self.tools != null) {
            output.mo646o(serialDesc, 0, e.a.f11963a, self.tools);
        }
        if (output.mo639e(serialDesc, 1) || self.resources != null) {
            output.mo646o(serialDesc, 1, d.a.f11961a, self.resources);
        }
        if (output.mo639e(serialDesc, 2) || self.prompts != null) {
            output.mo646o(serialDesc, 2, c.a.f11958a, self.prompts);
        }
        if (output.mo639e(serialDesc, 3) || self.logging != null) {
            output.mo646o(serialDesc, 3, C9954j0.f33538a, self.logging);
        }
        if (output.mo639e(serialDesc, 4) || self.completions != null) {
            output.mo646o(serialDesc, 4, C9954j0.f33538a, self.completions);
        }
        if (!output.mo639e(serialDesc, 5) && self.experimental == null) {
            return;
        }
        output.mo646o(serialDesc, 5, C9954j0.f33538a, self.experimental);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9950h0 getExperimental() {
        return this.experimental;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9950h0 getLogging() {
        return this.logging;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getPrompts() {
        return this.prompts;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getResources() {
        return this.resources;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getTools() {
        return this.tools;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4083i5)) {
            return false;
        }
        C4083i5 c4083i5 = (C4083i5) other;
        return AbstractC1061t.m3842c(this.tools, c4083i5.tools) && AbstractC1061t.m3842c(this.resources, c4083i5.resources) && AbstractC1061t.m3842c(this.prompts, c4083i5.prompts) && AbstractC1061t.m3842c(this.logging, c4083i5.logging) && AbstractC1061t.m3842c(this.completions, c4083i5.completions) && AbstractC1061t.m3842c(this.experimental, c4083i5.experimental);
    }

    public int hashCode() {
        e eVar = this.tools;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        d dVar = this.resources;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.prompts;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C9950h0 c9950h0 = this.logging;
        int iHashCode4 = (iHashCode3 + (c9950h0 == null ? 0 : c9950h0.hashCode())) * 31;
        C9950h0 c9950h02 = this.completions;
        int iHashCode5 = (iHashCode4 + (c9950h02 == null ? 0 : c9950h02.hashCode())) * 31;
        C9950h0 c9950h03 = this.experimental;
        return iHashCode5 + (c9950h03 != null ? c9950h03.hashCode() : 0);
    }

    public String toString() {
        return "ServerCapabilities(tools=" + this.tools + ", resources=" + this.resources + ", prompts=" + this.prompts + ", logging=" + this.logging + ", completions=" + this.completions + ", experimental=" + this.experimental + ")";
    }

    /* JADX INFO: renamed from: k8.i5$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001a\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, m16758d2 = {"Lk8/i5$c;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, "listChanged", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "b", "(Lk8/i5$c;Lxc/d;Lwc/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Boolean listChanged;

        /* JADX INFO: renamed from: k8.i5$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class a implements InterfaceC9732n0 {

            /* JADX INFO: renamed from: a */
            public static final a f11958a;
            private static final InterfaceC9218f descriptor;

            static {
                a aVar = new a();
                f11958a = aVar;
                C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.ServerCapabilities.Prompts", aVar, 1);
                c9714j2.m37938o("listChanged", true);
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
                return new InterfaceC8647b[]{AbstractC8920a.m34253u(C9706i.f32952a)};
            }

            @Override // p300uc.InterfaceC8645a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final c mo15956d(InterfaceC9487e interfaceC9487e) {
                Boolean bool;
                interfaceC9487e.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
                int i10 = 1;
                AbstractC9769u2 abstractC9769u2 = null;
                if (interfaceC9485cMo674c.mo36958r()) {
                    bool = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C9706i.f32952a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    bool = null;
                    while (z10) {
                        int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                        if (iMo788v == -1) {
                            z10 = false;
                        } else {
                            if (iMo788v != 0) {
                                C4662a.m18633a(iMo788v);
                                return null;
                            }
                            bool = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C9706i.f32952a, bool);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                interfaceC9485cMo674c.mo675d(interfaceC9218f);
                return new c(i10, bool, abstractC9769u2);
            }

            @Override // p300uc.InterfaceC8662p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void mo15954b(InterfaceC9488f interfaceC9488f, c cVar) {
                interfaceC9488f.getClass();
                cVar.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
                c.m16225b(cVar, interfaceC9486dMo637c, interfaceC9218f);
                interfaceC9486dMo637c.mo638d(interfaceC9218f);
            }
        }

        public /* synthetic */ c(int i10, Boolean bool, AbstractC9769u2 abstractC9769u2) {
            if ((i10 & 1) == 0) {
                this.listChanged = null;
            } else {
                this.listChanged = bool;
            }
        }

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ void m16225b(c self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
            if (!output.mo639e(serialDesc, 0) && self.listChanged == null) {
                return;
            }
            output.mo646o(serialDesc, 0, C9706i.f32952a, self.listChanged);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getListChanged() {
            return this.listChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC1061t.m3842c(this.listChanged, ((c) other).listChanged);
        }

        public int hashCode() {
            Boolean bool = this.listChanged;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "Prompts(listChanged=" + this.listChanged + ")";
        }

        /* JADX INFO: renamed from: k8.i5$c$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f11958a;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: k8.i5$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001b\u001eB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006 "}, m16758d2 = {"Lk8/i5$d;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "seen0", _UrlKt.FRAGMENT_ENCODE_SET, "listChanged", "subscribe", "Lyc/u2;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "c", "(Lk8/i5$d;Lxc/d;Lwc/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "b", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Boolean listChanged;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Boolean subscribe;

        /* JADX INFO: renamed from: k8.i5$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class a implements InterfaceC9732n0 {

            /* JADX INFO: renamed from: a */
            public static final a f11961a;
            private static final InterfaceC9218f descriptor;

            static {
                a aVar = new a();
                f11961a = aVar;
                C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.ServerCapabilities.Resources", aVar, 2);
                c9714j2.m37938o("listChanged", true);
                c9714j2.m37938o("subscribe", true);
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
                C9706i c9706i = C9706i.f32952a;
                return new InterfaceC8647b[]{AbstractC8920a.m34253u(c9706i), AbstractC8920a.m34253u(c9706i)};
            }

            @Override // p300uc.InterfaceC8645a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final d mo15956d(InterfaceC9487e interfaceC9487e) {
                Boolean bool;
                int i10;
                Boolean bool2;
                interfaceC9487e.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
                AbstractC9769u2 abstractC9769u2 = null;
                if (interfaceC9485cMo674c.mo36958r()) {
                    C9706i c9706i = C9706i.f32952a;
                    bool2 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, c9706i, null);
                    bool = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, c9706i, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    bool = null;
                    Boolean bool3 = null;
                    while (z10) {
                        int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                        if (iMo788v == -1) {
                            z10 = false;
                        } else if (iMo788v == 0) {
                            bool3 = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C9706i.f32952a, bool3);
                            i11 |= 1;
                        } else {
                            if (iMo788v != 1) {
                                C4662a.m18633a(iMo788v);
                                return null;
                            }
                            bool = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C9706i.f32952a, bool);
                            i11 |= 2;
                        }
                    }
                    i10 = i11;
                    bool2 = bool3;
                }
                interfaceC9485cMo674c.mo675d(interfaceC9218f);
                return new d(i10, bool2, bool, abstractC9769u2);
            }

            @Override // p300uc.InterfaceC8662p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void mo15954b(InterfaceC9488f interfaceC9488f, d dVar) {
                interfaceC9488f.getClass();
                dVar.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
                d.m16229c(dVar, interfaceC9486dMo637c, interfaceC9218f);
                interfaceC9486dMo637c.mo638d(interfaceC9218f);
            }
        }

        public /* synthetic */ d(int i10, Boolean bool, Boolean bool2, AbstractC9769u2 abstractC9769u2) {
            if ((i10 & 1) == 0) {
                this.listChanged = null;
            } else {
                this.listChanged = bool;
            }
            if ((i10 & 2) == 0) {
                this.subscribe = null;
            } else {
                this.subscribe = bool2;
            }
        }

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ void m16229c(d self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
            if (output.mo639e(serialDesc, 0) || self.listChanged != null) {
                output.mo646o(serialDesc, 0, C9706i.f32952a, self.listChanged);
            }
            if (!output.mo639e(serialDesc, 1) && self.subscribe == null) {
                return;
            }
            output.mo646o(serialDesc, 1, C9706i.f32952a, self.subscribe);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getListChanged() {
            return this.listChanged;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getSubscribe() {
            return this.subscribe;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC1061t.m3842c(this.listChanged, dVar.listChanged) && AbstractC1061t.m3842c(this.subscribe, dVar.subscribe);
        }

        public int hashCode() {
            Boolean bool = this.listChanged;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.subscribe;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "Resources(listChanged=" + this.listChanged + ", subscribe=" + this.subscribe + ")";
        }

        /* JADX INFO: renamed from: k8.i5$d$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f11961a;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: k8.i5$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001b\u0011B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, m16758d2 = {"Lk8/i5$e;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "listChanged", "<init>", "(Ljava/lang/Boolean;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "b", "(Lk8/i5$e;Lxc/d;Lwc/f;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    @InterfaceC8660n
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Boolean listChanged;

        /* JADX INFO: renamed from: k8.i5$e$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class a implements InterfaceC9732n0 {

            /* JADX INFO: renamed from: a */
            public static final a f11963a;
            private static final InterfaceC9218f descriptor;

            static {
                a aVar = new a();
                f11963a = aVar;
                C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.ServerCapabilities.Tools", aVar, 1);
                c9714j2.m37938o("listChanged", true);
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
                return new InterfaceC8647b[]{AbstractC8920a.m34253u(C9706i.f32952a)};
            }

            @Override // p300uc.InterfaceC8645a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final e mo15956d(InterfaceC9487e interfaceC9487e) {
                Boolean bool;
                interfaceC9487e.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
                int i10 = 1;
                AbstractC9769u2 abstractC9769u2 = null;
                if (interfaceC9485cMo674c.mo36958r()) {
                    bool = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C9706i.f32952a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    bool = null;
                    while (z10) {
                        int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                        if (iMo788v == -1) {
                            z10 = false;
                        } else {
                            if (iMo788v != 0) {
                                C4662a.m18633a(iMo788v);
                                return null;
                            }
                            bool = (Boolean) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 0, C9706i.f32952a, bool);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                interfaceC9485cMo674c.mo675d(interfaceC9218f);
                return new e(i10, bool, abstractC9769u2);
            }

            @Override // p300uc.InterfaceC8662p
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void mo15954b(InterfaceC9488f interfaceC9488f, e eVar) {
                interfaceC9488f.getClass();
                eVar.getClass();
                InterfaceC9218f interfaceC9218f = descriptor;
                InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
                e.m16234b(eVar, interfaceC9486dMo637c, interfaceC9218f);
                interfaceC9486dMo637c.mo638d(interfaceC9218f);
            }
        }

        public /* synthetic */ e(int i10, Boolean bool, AbstractC9769u2 abstractC9769u2) {
            if ((i10 & 1) == 0) {
                this.listChanged = null;
            } else {
                this.listChanged = bool;
            }
        }

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ void m16234b(e self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
            if (!output.mo639e(serialDesc, 0) && self.listChanged == null) {
                return;
            }
            output.mo646o(serialDesc, 0, C9706i.f32952a, self.listChanged);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getListChanged() {
            return this.listChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC1061t.m3842c(this.listChanged, ((e) other).listChanged);
        }

        public int hashCode() {
            Boolean bool = this.listChanged;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "Tools(listChanged=" + this.listChanged + ")";
        }

        /* JADX INFO: renamed from: k8.i5$e$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
                this();
            }

            public final InterfaceC8647b serializer() {
                return a.f11963a;
            }

            public Companion() {
            }
        }

        public e(Boolean bool) {
            this.listChanged = bool;
        }
    }

    /* JADX INFO: renamed from: k8.i5$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f11956a;
        }

        public Companion() {
        }
    }

    public C4083i5(e eVar, d dVar, c cVar, C9950h0 c9950h0, C9950h0 c9950h02, C9950h0 c9950h03) {
        this.tools = eVar;
        this.resources = dVar;
        this.prompts = cVar;
        this.logging = c9950h0;
        this.completions = c9950h02;
        this.experimental = c9950h03;
    }

    public /* synthetic */ C4083i5(e eVar, d dVar, c cVar, C9950h0 c9950h0, C9950h0 c9950h02, C9950h0 c9950h03, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : eVar, (i10 & 2) != 0 ? null : dVar, (i10 & 4) != 0 ? null : cVar, (i10 & 8) != 0 ? null : c9950h0, (i10 & 16) != 0 ? null : c9950h02, (i10 & 32) != 0 ? null : c9950h03);
    }
}
