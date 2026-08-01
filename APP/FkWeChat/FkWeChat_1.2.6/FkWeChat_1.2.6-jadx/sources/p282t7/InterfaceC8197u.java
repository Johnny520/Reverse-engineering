package p282t7;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: t7.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8197u {

    /* JADX INFO: renamed from: t7.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m31874a(InterfaceC8197u interfaceC8197u, InterfaceC0188p interfaceC0188p) {
            interfaceC0188p.getClass();
            for (Map.Entry entry : interfaceC8197u.mo7356a()) {
                interfaceC0188p.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m31875b(InterfaceC8197u interfaceC8197u, String str) {
            str.getClass();
            List listMo7359d = interfaceC8197u.mo7359d(str);
            if (listMo7359d != null) {
                return (String) AbstractC5081g0.m20578l0(listMo7359d);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    Set mo7356a();

    /* JADX INFO: renamed from: b */
    boolean mo7357b();

    /* JADX INFO: renamed from: c */
    void mo7358c(InterfaceC0188p interfaceC0188p);

    /* JADX INFO: renamed from: d */
    List mo7359d(String str);

    /* JADX INFO: renamed from: e */
    String mo12334e(String str);

    boolean isEmpty();

    Set names();
}
