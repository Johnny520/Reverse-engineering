package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m40 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3073a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n40 f3074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0150dg f3075c;

    public /* synthetic */ m40(C0150dg c0150dg, n40 n40Var, int i) {
        this.f3073a = i;
        this.f3075c = c0150dg;
        this.f3074b = n40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3073a) {
            case Base64.DEFAULT /* 0 */:
                ArrayList arrayList = this.f3075c.f1391b;
                n40 n40Var = this.f3074b;
                if (arrayList.contains(n40Var)) {
                    g40.m1138a(n40Var.f3216c.f3474E, n40Var.f3214a);
                }
                break;
            default:
                C0150dg c0150dg = this.f3075c;
                ArrayList arrayList2 = c0150dg.f1391b;
                n40 n40Var2 = this.f3074b;
                arrayList2.remove(n40Var2);
                c0150dg.f1392c.remove(n40Var2);
                break;
        }
    }
}
