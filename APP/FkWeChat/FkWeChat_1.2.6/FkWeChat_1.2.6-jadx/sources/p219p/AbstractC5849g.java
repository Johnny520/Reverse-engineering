package p219p;

import android.content.Context;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.InterfaceC0531l0;
import p010a9.InterfaceC0184l;
import p179m2.AbstractC4854i0;

/* JADX INFO: renamed from: p.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5849g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f18349a = AbstractC0552o0.m1979g(new InterfaceC0184l() { // from class: p.f
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return AbstractC5849g.m23560a((InterfaceC0531l0) obj);
        }
    });

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5842e f18350b = new a();

    /* JADX INFO: renamed from: p.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5842e {

        /* JADX INFO: renamed from: b */
        public final float f18351b = 0.3f;

        /* JADX INFO: renamed from: c */
        public final float f18352c;

        @Override // p219p.InterfaceC5842e
        /* JADX INFO: renamed from: a */
        public float mo23536a(float f10, float f11, float f12) {
            float fAbs = Math.abs((f11 + f10) - f10);
            boolean z10 = fAbs <= f12;
            float f13 = (this.f18351b * f12) - (this.f18352c * fAbs);
            float f14 = f12 - f13;
            if (z10 && f14 < fAbs) {
                f13 = f12 - fAbs;
            }
            return f10 - f13;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5842e m23560a(InterfaceC0531l0 interfaceC0531l0) {
        return !((Context) interfaceC0531l0.mo1516d(AbstractC4854i0.m19379d())).getPackageManager().hasSystemFeature("android.software.leanback") ? InterfaceC5842e.f18329a.m23539b() : f18350b;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0506h3 m23561b() {
        return f18349a;
    }
}
