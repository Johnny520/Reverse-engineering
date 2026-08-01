package p189n;

import android.content.Context;
import androidx.compose.runtime.InterfaceC0531l0;
import p058e2.AbstractC2005g;
import p121i3.InterfaceC3175e;
import p179m2.AbstractC4854i0;
import p179m2.AbstractC4870l1;
import p265s1.AbstractC7138s1;
import p274t.AbstractC7872n2;
import p274t.InterfaceC7887q2;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5212f {

    /* JADX INFO: renamed from: a */
    public static final long f16010a = AbstractC7138s1.m28200d(4284900966L);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC7887q2 f16011b = AbstractC7872n2.m30446g(0.0f, 0.0f, 3, null);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5230i2 m21385b(InterfaceC0531l0 interfaceC0531l0) {
        Context context = (Context) interfaceC0531l0.mo1516d(AbstractC4854i0.m19379d());
        InterfaceC3175e interfaceC3175e = (InterfaceC3175e) interfaceC0531l0.mo1516d(AbstractC4870l1.m19441f());
        C5210e2 c5210e2 = (C5210e2) interfaceC0531l0.mo1516d(AbstractC5220g2.m21406b());
        if (c5210e2 == null) {
            return null;
        }
        return new C5207e(context, interfaceC3175e, c5210e2.m21383b(), c5210e2.m21382a(), null);
    }

    /* JADX INFO: renamed from: c */
    public static final float m21386c(int i10) {
        return AbstractC2005g.m7247d(i10, AbstractC2005g.f5574a.m7248a()) ? 4.0f : 1.0f;
    }
}
