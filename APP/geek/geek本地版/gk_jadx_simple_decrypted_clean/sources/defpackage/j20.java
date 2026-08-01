package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j20 extends k20 {
    public static List I(i20 r2) {
        Iterator r22 = r2.iterator();
        if (r22.hasNext() == false) goto L5;
        Object r0 = r22.next();
        if (r22.hasNext() == false) goto L9;
        ArrayList r1 = new ArrayList();
        r1.add(r0);
    L12:
        if (r22.hasNext() == false) goto L14;
        r1.add(r22.next());
        goto L12
    L14:
        return r1;
    L9:
        return ip.C(r0);
    L5:
        return yi.a;
    }
}
