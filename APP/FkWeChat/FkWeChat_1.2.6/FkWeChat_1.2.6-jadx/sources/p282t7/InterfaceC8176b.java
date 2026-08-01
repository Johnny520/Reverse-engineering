package p282t7;

import java.util.List;
import p010a9.InterfaceC0173a;
import p254r5.C6494d0;

/* JADX INFO: renamed from: t7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8176b {

    /* JADX INFO: renamed from: t7.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static Object m31837a(InterfaceC8176b interfaceC8176b, C8174a c8174a) {
            c8174a.getClass();
            Object objMo31832c = interfaceC8176b.mo31832c(c8174a);
            if (objMo31832c != null) {
                return objMo31832c;
            }
            C6494d0.m25749a("No instance for key ", c8174a);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo31830a(C8174a c8174a);

    /* JADX INFO: renamed from: b */
    List mo31831b();

    /* JADX INFO: renamed from: c */
    Object mo31832c(C8174a c8174a);

    /* JADX INFO: renamed from: d */
    void mo31833d(C8174a c8174a, Object obj);

    /* JADX INFO: renamed from: e */
    Object mo31834e(C8174a c8174a);

    /* JADX INFO: renamed from: f */
    Object mo31835f(C8174a c8174a, InterfaceC0173a interfaceC0173a);

    /* JADX INFO: renamed from: g */
    boolean mo31836g(C8174a c8174a);
}
