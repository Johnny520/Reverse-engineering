package p069ef;

import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ef.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2219d {

    /* JADX INFO: renamed from: a */
    public static final a f6058a = a.f6059a;

    /* JADX INFO: renamed from: ef.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f6059a = new a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC2219d m8010a(String str) {
            str.getClass();
            int iM33152n0 = AbstractC8621f0.m33152n0(str, "->", 0, false, 6, null);
            return iM33152n0 == -1 ? new C2216a(str) : AbstractC8621f0.m33152n0(str, ":", iM33152n0 + 1, false, 4, null) == -1 ? new C2218c(str) : new C2217b(str);
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC2219d m8011b(String str) {
            str.getClass();
            InterfaceC2219d interfaceC2219dM8010a = m8010a(str);
            interfaceC2219dM8010a.getClass();
            return interfaceC2219dM8010a;
        }
    }

    /* JADX INFO: renamed from: ef.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static String m8012a(InterfaceC2219d interfaceC2219d) {
            return interfaceC2219d.toString();
        }
    }

    String serialize();
}
