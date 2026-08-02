package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl1 {
    public final /* synthetic */ mn0 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [qj1.<init>():void, ts2.d():void, v0.r(java.lang.Object):java.lang.Object, zq2.<init>():void] */
    public /* synthetic */ rl1(mn0 mn0Var) {
        this.a = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        mn0 mn0Var = this.a;
        synchronized (ds2.c) {
            List list = ds2.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(eu.B(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && t11.l(obj, mn0Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            ds2.h = arrayList;
        }
    }
}
