package p256r7;

import ec.InterfaceC2165o0;
import p034c7.InterfaceC1355b;
import p172l8.C4700i0;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p271s7.C7195a;

/* JADX INFO: renamed from: r7.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6530f extends InterfaceC2165o0 {

    /* JADX INFO: renamed from: r7.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static Object m25842a(InterfaceC6530f interfaceC6530f, String str, String str2, String str3, Long l10, String str4, InterfaceC5976f interfaceC5976f) {
            Object objMo25829x = interfaceC6530f.mo25829x(new C7195a(str, str2, str3, l10, str4), interfaceC5976f);
            return objMo25829x == AbstractC6325c.m24992g() ? objMo25829x : C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m25843b(InterfaceC6530f interfaceC6530f, String str, String str2, String str3, Long l10, String str4, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: send");
                return null;
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                l10 = null;
            }
            if ((i10 & 16) != 0) {
                str4 = null;
            }
            return interfaceC6530f.mo25827b0(str, str2, str3, l10, str4, interfaceC5976f);
        }
    }

    /* JADX INFO: renamed from: E0 */
    Object mo25825E0(InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: b0 */
    Object mo25827b0(String str, String str2, String str3, Long l10, String str4, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: e */
    InterfaceC1355b mo25828e();

    /* JADX INFO: renamed from: x */
    Object mo25829x(C7195a c7195a, InterfaceC5976f interfaceC5976f);
}
