package p148k;

import android.view.ViewConfiguration;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p121i3.InterfaceC3175e;
import p163l.AbstractC4278c0;
import p163l.InterfaceC4266a0;
import p179m2.AbstractC4870l1;

/* JADX INFO: renamed from: k.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3893o0 {

    /* JADX INFO: renamed from: a */
    public static final float f11245a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: a */
    public static final float m15455a() {
        return f11245a;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4266a0 m15456b(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        InterfaceC3175e interfaceC3175e = (InterfaceC3175e) interfaceC0572r.mo2142A(AbstractC4870l1.m19441f());
        boolean zMo2171g = interfaceC0572r.mo2171g(interfaceC3175e.getDensity());
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2171g || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = AbstractC4278c0.m16828d(new C3891n0(interfaceC3175e));
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC4266a0 interfaceC4266a0 = (InterfaceC4266a0) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC4266a0;
    }
}
