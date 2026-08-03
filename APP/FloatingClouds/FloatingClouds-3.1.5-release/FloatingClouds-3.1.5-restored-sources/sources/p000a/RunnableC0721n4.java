package p000a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000a.C0186K3;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.n4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0721n4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f2800a;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f2800a;
        if (z) {
            C0186K3.f638a.getClass();
            if (!C0186K3.a.m508i().f2447q) {
                return;
            }
        }
        C0186K3.f638a.getClass();
        ArrayList arrayListM505f = C0186K3.a.m505f();
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
        Iterator it = arrayListM505f.iterator();
        while (it.hasNext()) {
            arrayList.add(((MaskItemBean) it.next()).getMaskId());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C0569f4.m1412a(arrayList, z, null);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] applyNativeHide: " + arrayList.size() + " wxids hide=" + z}, 1));
    }
}
