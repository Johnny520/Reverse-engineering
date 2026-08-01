package p024b9;

import java.util.List;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2550d;
import p098g9.InterfaceC2551e;
import p098g9.InterfaceC2552f;
import p098g9.InterfaceC2554h;
import p098g9.InterfaceC2555i;
import p098g9.InterfaceC2558l;
import p098g9.InterfaceC2559m;
import p098g9.InterfaceC2560n;

/* JADX INFO: renamed from: b9.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1054p0 {
    /* JADX INFO: renamed from: b */
    public InterfaceC2549c mo3823b(Class cls) {
        return new C1039i(cls);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC2551e mo3824c(Class cls, String str) {
        return new C1030d0(cls, str);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC2560n mo3827f(InterfaceC2560n interfaceC2560n) {
        C1070x0 c1070x0 = (C1070x0) interfaceC2560n;
        return new C1070x0(interfaceC2560n.mo3877e(), interfaceC2560n.mo3876c(), c1070x0.m3882j(), c1070x0.m3881i() | 4);
    }

    /* JADX INFO: renamed from: i */
    public String mo3830i(InterfaceC1051o interfaceC1051o) {
        String string = interfaceC1051o.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: j */
    public String mo3831j(AbstractC1067w abstractC1067w) {
        return mo3830i(abstractC1067w);
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC2560n mo3832k(InterfaceC2550d interfaceC2550d, List list, boolean z10) {
        return new C1070x0(interfaceC2550d, list, z10);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC2552f mo3822a(AbstractC1053p abstractC1053p) {
        return abstractC1053p;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC2554h mo3825d(AbstractC1071y abstractC1071y) {
        return abstractC1071y;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC2555i mo3826e(AbstractC1024a0 abstractC1024a0) {
        return abstractC1024a0;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC2558l mo3828g(AbstractC1032e0 abstractC1032e0) {
        return abstractC1032e0;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC2559m mo3829h(AbstractC1036g0 abstractC1036g0) {
        return abstractC1036g0;
    }
}
