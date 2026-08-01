package defpackage;

import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends ct {
    public static volatile j6 e;
    public final Object d;

    public j6(int r2) {
        switch(r2) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.d = new j6(1);
        return;
    L5:
        this.d = new Object();
        Executors.newFixedThreadPool(4, new dg());
    }

    public static j6 z() {
        if (e == null) goto L7;
        return e;
    L7:
        monitor-enter(j6.class);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (e != null) goto L13;
        e = new j6(0);     // Catch: Throwable -> L11
    L13:
        monitor-exit(j6.class);     // Catch: Throwable -> L11
        return e;
    }
}
