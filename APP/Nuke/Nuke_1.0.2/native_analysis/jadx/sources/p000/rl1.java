package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mn0 f9634a;

    public /* synthetic */ rl1(mn0 mn0Var) {
        this.f9634a = mn0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m4512a() {
        mn0 mn0Var = this.f9634a;
        synchronized (ds2.f2181c) {
            List list = ds2.f2186h;
            list.getClass();
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && t11.m5086l(obj, mn0Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            ds2.f2186h = arrayList;
        }
    }
}
