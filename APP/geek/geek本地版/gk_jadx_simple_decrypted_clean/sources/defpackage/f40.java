package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g40 b;
    public final /* synthetic */ cg c;

    public /* synthetic */ f40(cg r1, g40 r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        cg r0 = this.c;
        ArrayList r1 = r0.b;
        g40 r2 = this.b;
        r1.remove(r2);
        r0.c.remove(r2);
        return;
    L6:
        ArrayList r02 = this.c.b;
        g40 r12 = this.b;
        if (r02.contains(r12) == false) goto L10;
        int r03 = r12.a;
        z30.a(r12.c.E, r03);
        return;
    }
}
