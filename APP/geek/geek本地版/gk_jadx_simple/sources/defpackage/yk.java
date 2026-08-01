package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void a(Object r5) {
        switch(this.a) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        zk r52 = (zk) r5;
        Object r0 = al.c;
        monitor-enter(r0);
        u30 r1 = al.d;     // Catch: Throwable -> L10
        ArrayList r2 = (ArrayList) r1.getOrDefault((String) this.b, null);     // Catch: Throwable -> L10
        if (r2 != null) goto L12;
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L12:
        r1.remove((String) this.b);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        int r02 = 0;
    L16:
        if (r02 >= r2.size()) goto L28;
        ((yk) r2.get(r02)).a(r52);
        r02 = r02 + 1;
        goto L16
    L28:
        return;
    L10:
        th = move-exception;
        throw th;
    L21:
        zk r53 = (zk) r5;
        if (r53 != null) goto L24;
        r53 = new zk(-3);
    L24:
        ((d4) this.b).F(r53);
    }
}
