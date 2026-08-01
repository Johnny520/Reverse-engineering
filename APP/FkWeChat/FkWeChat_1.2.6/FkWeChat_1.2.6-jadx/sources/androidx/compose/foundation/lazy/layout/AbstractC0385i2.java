package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.Locale;
import p024b9.AbstractC1061t;
import p179m2.AbstractC4854i0;
import p189n.AbstractC5280s2;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.i2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0385i2 {

    /* JADX INFO: renamed from: a */
    public static final a f1108a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        f1108a = AbstractC1061t.m3842c(lowerCase, "robolectric") ? new a() : null;
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0381h2 m1215a(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1141871251, i10, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        InterfaceC0381h2 interfaceC0381h2 = f1108a;
        if (interfaceC0381h2 != null) {
            interfaceC0572r.mo2163V(1345648624);
            interfaceC0572r.mo2152K();
        } else {
            interfaceC0572r.mo2163V(1345697697);
            View view = (View) interfaceC0572r.mo2142A(AbstractC4854i0.m19383h());
            boolean zMo2162U = interfaceC0572r.mo2162U(view);
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                Object tag = view.getTag(AbstractC5280s2.f16213a);
                Object viewOnAttachStateChangeListenerC0354b = tag instanceof InterfaceC0381h2 ? (InterfaceC0381h2) tag : null;
                if (viewOnAttachStateChangeListenerC0354b == null) {
                    viewOnAttachStateChangeListenerC0354b = new ViewOnAttachStateChangeListenerC0354b(view);
                    view.setTag(AbstractC5280s2.f16213a, viewOnAttachStateChangeListenerC0354b);
                }
                objMo2170f = viewOnAttachStateChangeListenerC0354b;
                interfaceC0572r.mo2153L(objMo2170f);
            }
            interfaceC0381h2 = (InterfaceC0381h2) objMo2170f;
            interfaceC0572r.mo2152K();
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0381h2;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.i2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0381h2 {
        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0381h2
        /* JADX INFO: renamed from: a */
        public void mo1213a(InterfaceC0373f2 interfaceC0373f2) {
        }
    }
}
