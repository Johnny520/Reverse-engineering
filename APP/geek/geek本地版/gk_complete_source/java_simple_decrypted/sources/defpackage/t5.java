package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import io.fastkv.LimitExecutor;
import io.fastkv.MPFastKV;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t5(Object r1, int r2, Object r3) {
        this.a = r2;
        this.b = r1;
        this.c = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.a;
        Object r1 = this.c;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L35;
            case 1: goto L33;
            case 2: goto L31;
            case 3: goto L29;
            case 4: goto L27;
            case 5: goto L23;
            case 6: goto L19;
            case 7: goto L17;
            case 8: goto L15;
            case 9: goto L13;
            default: goto L4;
        };
    L4:
        Activity r22 = (Activity) r2;
        ViewGroup r12 = (ViewGroup) r1;
        if (r22.isFinishing() == false) goto L7;
        return;
    L7:
        if (r22.isDestroyed() == true) goto L47;
        vh.d(r22, r12);     // Catch: Throwable -> L11
        return;
    L11:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "TitleSpoofer", "Fg==\n", "c8HJlSTQVfc=\n");
        return;
    L47:
        return;
    L13:
        ((zt) r2).J((Typeface) r1);
        return;
    L15:
        ((sm) r2).f((String) r1);
        return;
    L17:
        ((hv) r2).a();
        ((CountDownLatch) r1).countDown();
        return;
    L19:
        String r23 = (String) r2;
        i00 r13 = (i00) r1;
        ClassLoader r02 = d9.a;
        if (r02 == null) goto L49;
        Handler r3 = uv.a;
        uv.f(r02, r23, (String) r13.b);
        return;
    L49:
        return;
    L23:
        String r24 = (String) r2;
        String r14 = (String) r1;
        ClassLoader r03 = d9.a;
        if (r03 == null) goto L50;
        uv.c(r03, r24, r14);
        return;
    L50:
        return;
    L27:
        MPFastKV.c((MPFastKV) r2, (String) r1);
        return;
    L29:
        LimitExecutor.a((LimitExecutor) r2, (Runnable) r1);
        return;
    L31:
        ((ViewGroup) r2).removeView((View) ((i00) r1).b);
        return;
    L33:
        ((o9) r2).f((String) r1);
        return;
    L35:
        u5 r25 = (u5) r2;
        Runnable r15 = (Runnable) r1;
        r25.getClass();
        r15.run();     // Catch: Throwable -> L39
        r25.a();
        return;
    L39:
        th = move-exception;
        r25.a();
        throw th;
    }
}
