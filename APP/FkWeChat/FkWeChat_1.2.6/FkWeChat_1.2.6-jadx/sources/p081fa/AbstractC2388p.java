package p081fa;

import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p213oa.C5692c;

/* JADX INFO: renamed from: fa.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2388p {
    /* JADX INFO: renamed from: a */
    public static final boolean m8635a(InterfaceC2390r interfaceC2390r) {
        C5692c c5692cMo8616d;
        InterfaceC2372b0 interfaceC2372b0 = (InterfaceC2372b0) AbstractC5081g0.m20539K0(interfaceC2390r.mo8641m());
        InterfaceC2396x type = interfaceC2372b0 != null ? interfaceC2372b0.getType() : null;
        InterfaceC2382j interfaceC2382j = type instanceof InterfaceC2382j ? (InterfaceC2382j) type : null;
        if (interfaceC2382j == null) {
            return false;
        }
        InterfaceC2381i interfaceC2381iMo8628e = interfaceC2382j.mo8628e();
        return (interfaceC2381iMo8628e instanceof InterfaceC2379g) && (c5692cMo8616d = ((InterfaceC2379g) interfaceC2381iMo8628e).mo8616d()) != null && AbstractC1061t.m3842c(c5692cMo8616d.m22994a(), "java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8636b(InterfaceC2390r interfaceC2390r) {
        String strM23030c = interfaceC2390r.getName().m23030c();
        int iHashCode = strM23030c.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strM23030c.equals("equals")) {
                    return m8635a(interfaceC2390r);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strM23030c.equals("hashCode")) {
                return false;
            }
        } else if (!strM23030c.equals("toString")) {
            return false;
        }
        return interfaceC2390r.mo8641m().isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8637c(InterfaceC2389q interfaceC2389q) {
        interfaceC2389q.getClass();
        return interfaceC2389q.mo8638S().mo8611K() && (interfaceC2389q instanceof InterfaceC2390r) && m8636b((InterfaceC2390r) interfaceC2389q);
    }
}
