package p264s0;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p163l.InterfaceC4303h0;
import p215oc.C5729x;
import p317w0.EnumC9032w;

/* JADX INFO: renamed from: s0.l6 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6822l6 {

    /* JADX INFO: renamed from: s0.l6$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21947a;

        static {
            int[] iArr = new int[EnumC9032w.values().length];
            try {
                iArr[EnumC9032w.f30864q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9032w.f30865r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9032w.f30866s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9032w.f30867t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC9032w.f30868u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC9032w.f30869v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21947a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4303h0 m27053a(InterfaceC6806k6 interfaceC6806k6, EnumC9032w enumC9032w) {
        switch (a.f21947a[enumC9032w.ordinal()]) {
            case 1:
                return interfaceC6806k6.mo27000f();
            case 2:
                return interfaceC6806k6.mo26997c();
            case 3:
                return interfaceC6806k6.mo26999e();
            case 4:
                return interfaceC6806k6.mo26998d();
            case 5:
                return interfaceC6806k6.mo26996b();
            case 6:
                return interfaceC6806k6.mo26995a();
            default:
                C5729x.m23182a();
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4303h0 m27054b(EnumC9032w enumC9032w, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-19828261, i10, -1, "androidx.compose.material3.value (MotionScheme.kt:288)");
        }
        InterfaceC4303h0 interfaceC4303h0M27053a = m27053a(C6977v5.f22996a.m27581c(interfaceC0572r, 6), enumC9032w);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC4303h0M27053a;
    }
}
