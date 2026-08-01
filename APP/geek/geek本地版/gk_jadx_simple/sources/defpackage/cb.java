package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb extends bb {
    public static int h0(Iterable r1) {
        if ((r1 instanceof Collection) == true) goto L5;
        return 10;
    L5:
        return ((Collection) r1).size();
    }
}
