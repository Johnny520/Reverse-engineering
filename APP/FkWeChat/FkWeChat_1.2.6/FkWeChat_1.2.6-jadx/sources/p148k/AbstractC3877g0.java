package p148k;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0184l;
import p163l.AbstractC4287e;
import p163l.AbstractC4322l;
import p163l.C4324l1;
import p163l.InterfaceC4317k;
import p163l.InterfaceC4365t2;
import p265s1.C7128q1;

/* JADX INFO: renamed from: k.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3877g0 {

    /* JADX INFO: renamed from: a */
    public static final C4324l1 f11143a = AbstractC4322l.m16974j(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0564p5 m15379a(long j10, InterfaceC4317k interfaceC4317k, String str, InterfaceC0184l interfaceC0184l, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC4317k = f11143a;
        }
        InterfaceC4317k interfaceC4317k2 = interfaceC4317k;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC0184l = null;
        }
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zMo2162U = interfaceC0572r.mo2162U(C7128q1.m28134t(j10));
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = (InterfaceC4365t2) AbstractC3890n.m15440a(C7128q1.f23644b).mo27m(C7128q1.m28134t(j10));
            interfaceC0572r.mo2153L(objMo2170f);
        }
        int i12 = i10 << 6;
        InterfaceC0564p5 interfaceC0564p5M16836f = AbstractC4287e.m16836f(C7128q1.m28125k(j10), (InterfaceC4365t2) objMo2170f, interfaceC4317k2, null, str2, interfaceC0184l2, interfaceC0572r, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0564p5M16836f;
    }
}
