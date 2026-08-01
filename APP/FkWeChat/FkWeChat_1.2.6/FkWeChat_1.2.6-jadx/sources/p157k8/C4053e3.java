package p157k8;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
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
import p361yc.C9677c0;
import p361yc.C9714j2;
import p361yc.C9790z2;
import p361yc.InterfaceC9732n0;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: k8.e3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\u0014\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m16758d2 = {"Lk8/e3;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "progress", "total", _UrlKt.FRAGMENT_ENCODE_SET, "message", "<init>", "(DLjava/lang/Double;Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(IDLjava/lang/Double;Ljava/lang/String;Lyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "a", "(Lk8/e3;Lxc/d;Lwc/f;)V", "D", "getProgress", "()D", "b", "Ljava/lang/Double;", "getTotal", "()Ljava/lang/Double;", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Companion", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class C4053e3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final double progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Double total;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String message;

    /* JADX INFO: renamed from: k8.e3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public static final a f11873a;
        private static final InterfaceC9218f descriptor;

        static {
            a aVar = new a();
            f11873a = aVar;
            C9714j2 c9714j2 = new C9714j2("io.modelcontextprotocol.kotlin.sdk.types.Progress", aVar, 3);
            c9714j2.m37938o("progress", false);
            c9714j2.m37938o("total", true);
            c9714j2.m37938o("message", true);
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
            C9677c0 c9677c0 = C9677c0.f32910a;
            return new InterfaceC8647b[]{c9677c0, AbstractC8920a.m34253u(c9677c0), AbstractC8920a.m34253u(C9790z2.f33080a)};
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C4053e3 mo15956d(InterfaceC9487e interfaceC9487e) {
            int i10;
            Double d10;
            String str;
            double d11;
            interfaceC9487e.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(interfaceC9218f);
            Double d12 = null;
            if (interfaceC9485cMo674c.mo36958r()) {
                double dMo36956o = interfaceC9485cMo674c.mo36956o(interfaceC9218f, 0);
                d10 = (Double) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C9677c0.f32910a, null);
                str = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C9790z2.f33080a, null);
                i10 = 7;
                d11 = dMo36956o;
            } else {
                boolean z10 = true;
                int i11 = 0;
                double dMo36956o2 = 0.0d;
                String str2 = null;
                while (z10) {
                    int iMo788v = interfaceC9485cMo674c.mo788v(interfaceC9218f);
                    if (iMo788v == -1) {
                        z10 = false;
                    } else if (iMo788v == 0) {
                        dMo36956o2 = interfaceC9485cMo674c.mo36956o(interfaceC9218f, 0);
                        i11 |= 1;
                    } else if (iMo788v == 1) {
                        d12 = (Double) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 1, C9677c0.f32910a, d12);
                        i11 |= 2;
                    } else {
                        if (iMo788v != 2) {
                            C4662a.m18633a(iMo788v);
                            return null;
                        }
                        str2 = (String) interfaceC9485cMo674c.mo36949C(interfaceC9218f, 2, C9790z2.f33080a, str2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                d10 = d12;
                str = str2;
                d11 = dMo36956o2;
            }
            interfaceC9485cMo674c.mo675d(interfaceC9218f);
            return new C4053e3(i10, d11, d10, str, null);
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void mo15954b(InterfaceC9488f interfaceC9488f, C4053e3 c4053e3) {
            interfaceC9488f.getClass();
            c4053e3.getClass();
            InterfaceC9218f interfaceC9218f = descriptor;
            InterfaceC9486d interfaceC9486dMo637c = interfaceC9488f.mo637c(interfaceC9218f);
            C4053e3.m16094a(c4053e3, interfaceC9486dMo637c, interfaceC9218f);
            interfaceC9486dMo637c.mo638d(interfaceC9218f);
        }
    }

    public /* synthetic */ C4053e3(int i10, double d10, Double d11, String str, AbstractC9769u2 abstractC9769u2) {
        if (1 != (i10 & 1)) {
            AbstractC9694f2.m37891a(i10, 1, a.f11873a.mo15953a());
        }
        this.progress = d10;
        if ((i10 & 2) == 0) {
            this.total = null;
        } else {
            this.total = d11;
        }
        if ((i10 & 4) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m16094a(C4053e3 self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
        output.mo36976x(serialDesc, 0, self.progress);
        if (output.mo639e(serialDesc, 1) || self.total != null) {
            output.mo646o(serialDesc, 1, C9677c0.f32910a, self.total);
        }
        if (!output.mo639e(serialDesc, 2) && self.message == null) {
            return;
        }
        output.mo646o(serialDesc, 2, C9790z2.f33080a, self.message);
    }

    /* JADX INFO: renamed from: k8.e3$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final InterfaceC8647b serializer() {
            return a.f11873a;
        }

        public Companion() {
        }
    }

    public C4053e3(double d10, Double d11, String str) {
        this.progress = d10;
        this.total = d11;
        this.message = str;
    }
}
