package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: E9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0182E9 extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public C2435qz f536l;

    /* JADX INFO: renamed from: m */
    public C2147kh f537m;

    /* JADX INFO: renamed from: n */
    public ArrayList f538n;

    /* JADX INFO: renamed from: N */
    public final int m371N(C0110Ch c0110Ch) {
        int iM164c;
        C2435qz c2435qz = this.f536l;
        int iM4889N = c2435qz != null ? c2435qz.m4889N(c0110Ch) : 0;
        C2147kh c2147kh = this.f537m;
        int iM4332N = c2147kh != null ? c2147kh.m4332N(c0110Ch) : 0;
        ArrayList arrayList = this.f538n;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC2539ta.m5019d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C2435qz) it.next()).m4889N(c0110Ch)));
            }
            iM164c = c0110Ch.m164c(AbstractC2453ra.m4907q0(arrayList2));
        } else {
            iM164c = 0;
        }
        c0110Ch.m170i(9);
        c0110Ch.m162a(8, iM164c);
        c0110Ch.m162a(7, 0);
        c0110Ch.m162a(6, iM4332N);
        c0110Ch.m162a(5, 0);
        c0110Ch.m162a(4, 0);
        c0110Ch.m162a(3, 0);
        c0110Ch.m162a(2, 0);
        c0110Ch.m162a(1, iM4889N);
        c0110Ch.m162a(0, 0);
        int iM165d = c0110Ch.m165d();
        c0110Ch.m166e(iM165d);
        return iM165d;
    }

    /* JADX INFO: renamed from: O */
    public final void m372O(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2435qz(str, 1));
        }
        this.f538n = new ArrayList(arrayList);
    }
}
