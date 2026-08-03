package p000a;

import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC1100b;
import p000a.AbstractC0553e7;

/* JADX INFO: renamed from: a.g7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0591g7 implements InterfaceC0415X<C0397W> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0553e7 f2201a;

    public C0591g7(AbstractC0553e7 abstractC0553e7) {
        this.f2201a = abstractC0553e7;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000a.InterfaceC0415X
    /* JADX INFO: renamed from: a */
    public final void mo1057a(C0397W c0397w) {
        C0397W c0397w2 = c0397w;
        AbstractC0553e7 abstractC0553e7 = this.f2201a;
        AbstractC0553e7.g gVarPollLast = abstractC0553e7.f2047E.pollLast();
        if (gVarPollLast == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        C0003A2 c0003a2 = abstractC0553e7.f2060c;
        String str = gVarPollLast.f2088a;
        ComponentCallbacksC1100b componentCallbacksC1100bM24d = c0003a2.m24d(str);
        if (componentCallbacksC1100bM24d != null) {
            componentCallbacksC1100bM24d.m2539m(gVarPollLast.f2089b, c0397w2.f1523a, c0397w2.f1524b);
        } else {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }
}
