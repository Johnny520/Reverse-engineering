package p219p;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: p.s1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5887s1 {
    /* JADX INFO: renamed from: a */
    public static float m23706a(InterfaceC0564p5 interfaceC0564p5, float f10) {
        return ((Number) ((InterfaceC0184l) interfaceC0564p5.getValue()).mo27m(Float.valueOf(f10))).floatValue();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5881q1 m23707b(InterfaceC0184l interfaceC0184l) {
        return new C5867m(interfaceC0184l);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5881q1 m23708c(InterfaceC0184l interfaceC0184l, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:159)");
        }
        final InterfaceC0564p5 interfaceC0564p5M1577p = AbstractC0473c5.m1577p(interfaceC0184l, interfaceC0572r, i10 & 14);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = m23707b(new InterfaceC0184l() { // from class: p.r1
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return Float.valueOf(AbstractC5887s1.m23706a(interfaceC0564p5M1577p, ((Float) obj).floatValue()));
                }
            });
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC5881q1 interfaceC5881q1 = (InterfaceC5881q1) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC5881q1;
    }
}
