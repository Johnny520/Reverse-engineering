package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;
import io.sentry.C1589H2;
import io.sentry.C1601K2;
import io.sentry.C1918l;
import io.sentry.C1979q1;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.cache.AbstractC1836a;
import io.sentry.cache.C1841f;
import io.sentry.protocol.C1970t;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2445r8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8569c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f8570d;

    public /* synthetic */ RunnableC2445r8(TextView r2, AlertDialog r3, Context r4) {
        this.f8567a = 7;
        this.f8570d = r2;
        this.f8568b = r3;
        this.f8569c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f8567a) {
            case 0: goto L49;
            case 1: goto L47;
            case 2: goto L45;
            case 3: goto L27;
            case 4: goto L25;
            case 5: goto L23;
            case 6: goto L19;
            case 7: goto L15;
            case 8: goto L9;
            default: goto L4;
        };
    L4:
        C2046v2 r1 = ((C1841f) this.f8569c).f6644a;
        C1589H2 r2 = (C1589H2) this.f8570d;
        C1979q1 r3 = (C1979q1) this.f8568b;
        if (r2 != null) goto L7;
        C1918l r22 = r3.f7096r;
        C1589H2 r32 = new C1589H2((C1970t) r22.f6805b, (C1601K2) r22.f6806c, "default", null);
        r32.f5746i = "auto";
        AbstractC1836a.m4003d(r1, r32, ".scope-cache", "trace.json");
        return;
    L7:
        AbstractC1836a.m4003d(r1, r2, ".scope-cache", "trace.json");
        return;
    L9:
        Runnable r0 = (Runnable) this.f8569c;
        C2046v2 r12 = (C2046v2) this.f8570d;
        String r23 = (String) this.f8568b;
        r0.run();     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        r12.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task " + r23, th);
        return;
    L15:
        TextView r02 = (TextView) this.f8570d;
        AlertDialog r13 = (AlertDialog) this.f8568b;
        Context r24 = (Context) this.f8569c;
        r02.setText(AbstractC0295Gu.m625r(-579859239663669L));
        Button r03 = r13.getButton(-1);
        if (r03 == null) goto L58;
        r03.setText(AbstractC0295Gu.m625r(-579906484303925L));
        r03.setOnClickListener(new ViewOnClickListenerC2176l5(24, r13, r24));
        return;
    L58:
        return;
    L19:
        TextView r04 = (TextView) this.f8569c;
        Throwable r14 = (Throwable) this.f8570d;
        AlertDialog r25 = (AlertDialog) this.f8568b;
        r04.setText(AbstractC0295Gu.m625r(-579820584958005L) + r14.getMessage());
        Button r05 = r25.getButton(-1);
        if (r05 == null) goto L59;
        r05.setText(AbstractC0295Gu.m625r(-579846354761781L));
        r05.setOnClickListener(new ViewOnClickListenerC1477h(12, r25));
        return;
    L59:
        return;
    L23:
        ScriptManager.m3533b((LoadedScript) this.f8569c, (String) this.f8568b, (InterfaceC1416fj) this.f8570d);
        return;
    L25:
        ScriptManager.m3534c((LoadedScript) this.f8569c, (Exception) this.f8570d, (InterfaceC1416fj) this.f8568b);
        return;
    L27:
        C0793Sd r06 = (C0793Sd) this.f8569c;
        AbstractC1293cr r15 = (AbstractC1293cr) this.f8570d;
        ThreadPoolExecutor r26 = (ThreadPoolExecutor) this.f8568b;
        C0669Ph r07 = AbstractC0714Qj.m1490l(r06.f2493b);     // Catch: Throwable -> L36
        if (r07 == null) goto L42;
        C0626Oh r33 = (C0626Oh) r07.f2134a;     // Catch: Throwable -> L36
        Object r4 = r33.f2002d;     // Catch: Throwable -> L36
        monitor-enter(r4);     // Catch: Throwable -> L36
        r33.f2004f = r26;     // Catch: Throwable -> L38
        monitor-exit(r4);     // Catch: Throwable -> L38
        r07.f2134a.mo1218a(new C2458rf(r15, r26));     // Catch: Throwable -> L36
        return;
    L38:
        th = move-exception;
        throw th;     // Catch: Throwable -> L36
    L42:
        throw new RuntimeException("EmojiCompat font provider not available on this device.");     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        r15.mo2561H(th);
        r26.shutdown();
        return;
    L45:
        C2276nd r08 = (C2276nd) this.f8569c;
        View r16 = (View) this.f8570d;
        C2099jd r27 = (C2099jd) this.f8568b;
        r08.f8009a.endViewTransition(r16);
        r27.m78d();
        return;
    L47:
        CherryDevServer.m3521d((String) this.f8568b, (C0382Iv) this.f8569c, (CountDownLatch) this.f8570d);
        return;
    L49:
        CherryDevServer.m3523f((Context) this.f8569c, (File) this.f8570d, (String) this.f8568b);
    }

    public /* synthetic */ RunnableC2445r8(LoadedScript r2, String r3, InterfaceC1416fj r4) {
        this.f8567a = 5;
        this.f8569c = r2;
        this.f8568b = r3;
        this.f8570d = r4;
    }

    public /* synthetic */ RunnableC2445r8(Object r1, Object r2, Object r3, int r4) {
        this.f8567a = r4;
        this.f8569c = r1;
        this.f8570d = r2;
        this.f8568b = r3;
    }

    public /* synthetic */ RunnableC2445r8(String r2, C0382Iv r3, CountDownLatch r4) {
        this.f8567a = 1;
        this.f8568b = r2;
        this.f8569c = r3;
        this.f8570d = r4;
    }
}
