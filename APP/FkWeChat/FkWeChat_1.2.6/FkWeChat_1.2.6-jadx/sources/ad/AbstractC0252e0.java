package ad;

import java.util.Iterator;
import p215oc.C5706c;
import p215oc.C5729x;
import p300uc.InterfaceC8645a;
import p375zc.AbstractC9939c;
import p375zc.EnumC9937b;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ad.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0252e0 {

    /* JADX INFO: renamed from: ad.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f629a;

        static {
            int[] iArr = new int[EnumC9937b.values().length];
            try {
                iArr[EnumC9937b.f33480q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9937b.f33481r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9937b.f33482s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f629a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Iterator m743a(EnumC9937b enumC9937b, AbstractC9939c abstractC9939c, C0295w0 c0295w0, InterfaceC8645a interfaceC8645a) {
        enumC9937b.getClass();
        abstractC9939c.getClass();
        c0295w0.getClass();
        interfaceC8645a.getClass();
        int i10 = a.f629a[m744b(c0295w0, enumC9937b).ordinal()];
        if (i10 == 1) {
            return new C0255f0(abstractC9939c, c0295w0, interfaceC8645a);
        }
        if (i10 == 2) {
            return new C0249d0(abstractC9939c, c0295w0, interfaceC8645a);
        }
        if (i10 != 3) {
            C5729x.m23182a();
            return null;
        }
        C10010p0.m38820a("AbstractJsonLexer.determineFormat must be called beforehand.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC9937b m744b(AbstractC0239a abstractC0239a, EnumC9937b enumC9937b) {
        int i10 = a.f629a[enumC9937b.ordinal()];
        if (i10 == 1) {
            return EnumC9937b.f33480q;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return m745c(abstractC0239a) ? EnumC9937b.f33481r : EnumC9937b.f33480q;
            }
            C5729x.m23182a();
            return null;
        }
        if (m745c(abstractC0239a)) {
            return EnumC9937b.f33481r;
        }
        String strM653c = AbstractC0242b.m653c((byte) 8);
        int i11 = abstractC0239a.f592a;
        int i12 = i11 - 1;
        AbstractC0239a.m588z(abstractC0239a, "Expected " + strM653c + ", but had '" + ((i11 == abstractC0239a.mo592D().length() || i12 < 0) ? "EOF" : String.valueOf(abstractC0239a.mo592D().charAt(i12))) + "' instead", i12, null, 4, null);
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m745c(AbstractC0239a abstractC0239a) {
        if (abstractC0239a.mo596H() != 8) {
            return false;
        }
        abstractC0239a.m617l((byte) 8);
        return true;
    }
}
