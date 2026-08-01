package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: y */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0540y implements InterfaceC0027ba, InterfaceC0251hc {

    /* JADX INFO: renamed from: a */
    public final Object f1081a;

    /* JADX INFO: renamed from: b */
    public Object f1082b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0540y() {
        this.f1082b = "";
        this.f1081a = new ArrayList(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0027ba
    /* JADX INFO: renamed from: a */
    public void mo74a(int i, int i2) {
        C0566z9 c0566z9 = (C0566z9) this.f1081a;
        C0358o4 c0358o4 = (C0358o4) this.f1082b;
        if (c0358o4.f631a == null && C0566z9.m1195b(c0566z9, i) == 3 && "V".equals(C0566z9.m1196c(c0566z9, i))) {
            String[] strArr = {"refreshLayout", "TwoLevel", "Release"};
            for (int i3 = 0; i3 < 3; i3++) {
                if (!c0566z9.m1197d(strArr[i3], i2)) {
                    return;
                }
            }
            c0358o4.f631a = C0566z9.m1194a(c0566z9, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0251hc
    public void run() {
        View view = (View) this.f1082b;
        AbstractC0219fc.m408u(view);
        AbstractC0219fc.m407t();
        AbstractC0219fc.m382V(AbstractC0219fc.m398k(view, this.f1081a));
    }

    public /* synthetic */ C0540y(Object obj, Object obj2, boolean z) {
        this.f1082b = obj;
        this.f1081a = obj2;
    }

    public C0540y(ClassLoader classLoader, C0410pd c0410pd) {
        this.f1082b = classLoader;
        this.f1081a = c0410pd;
        System.currentTimeMillis();
    }

    public /* synthetic */ C0540y(Object obj, Object obj2) {
        this.f1081a = obj;
        this.f1082b = obj2;
    }
}
