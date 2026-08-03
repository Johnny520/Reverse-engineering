package p000a;

import android.view.View;
import androidx.customview.poolingcontainer.C1080R;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.zc */
/* JADX INFO: loaded from: classes.dex */
public final class C0957zc {

    /* JADX INFO: renamed from: a */
    public static final int f3566a = C1080R.id.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: b */
    public static final int f3567b = C1080R.id.is_pooling_container_tag;

    /* JADX INFO: renamed from: a */
    public static final void m2247a(View view) {
        C0631i9.m1482e(view, "<this>");
        C0055Cg c0055Cg = new C0055Cg(view, null);
        C0304Qd c0304Qd = new C0304Qd();
        c0304Qd.f1101d = C0889w1.m2151j(c0304Qd, c0304Qd, c0055Cg);
        while (c0304Qd.hasNext()) {
            View view2 = (View) c0304Qd.next();
            int i = f3566a;
            C0032Bc c0032Bc = (C0032Bc) view2.getTag(i);
            if (c0032Bc == null) {
                c0032Bc = new C0032Bc();
                view2.setTag(i, c0032Bc);
            }
            ArrayList<InterfaceC0013Ac> arrayList = c0032Bc.f119a;
            for (int iM1756c0 = C0739o3.m1756c0(arrayList); -1 < iM1756c0; iM1756c0--) {
                arrayList.get(iM1756c0).m43a();
            }
        }
    }
}
