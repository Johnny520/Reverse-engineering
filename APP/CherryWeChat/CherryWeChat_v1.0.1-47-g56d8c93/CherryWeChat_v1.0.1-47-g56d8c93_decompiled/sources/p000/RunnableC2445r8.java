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
import party.iroiro.luajava.luajit.LuaJitConsts;

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

    public /* synthetic */ RunnableC2445r8(TextView textView, AlertDialog alertDialog, Context context) {
        this.f8567a = 7;
        this.f8570d = textView;
        this.f8568b = alertDialog;
        this.f8569c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8567a) {
            case 0:
                CherryDevServer.handleScriptUpload$lambda$16((Context) this.f8569c, (File) this.f8570d, (String) this.f8568b);
                return;
            case 1:
                CherryDevServer.handleScriptExecute$lambda$20((String) this.f8568b, (C0382Iv) this.f8569c, (CountDownLatch) this.f8570d);
                return;
            case 2:
                C2276nd c2276nd = (C2276nd) this.f8569c;
                View view = (View) this.f8570d;
                C2099jd c2099jd = (C2099jd) this.f8568b;
                c2276nd.f8009a.endViewTransition(view);
                c2099jd.m78d();
                return;
            case 3:
                C0793Sd c0793Sd = (C0793Sd) this.f8569c;
                AbstractC1293cr abstractC1293cr = (AbstractC1293cr) this.f8570d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f8568b;
                try {
                    C0669Ph c0669PhM1490l = AbstractC0714Qj.m1490l(c0793Sd.f2493b);
                    if (c0669PhM1490l == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0626Oh c0626Oh = (C0626Oh) c0669PhM1490l.f2134a;
                    synchronized (c0626Oh.f2002d) {
                        c0626Oh.f2004f = threadPoolExecutor;
                        break;
                    }
                    c0669PhM1490l.f2134a.mo1218a(new C2458rf(abstractC1293cr, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC1293cr.mo2561H(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                ScriptManager.executeScript$lambda$5$lambda$4((LoadedScript) this.f8569c, (Exception) this.f8570d, (InterfaceC1416fj) this.f8568b);
                return;
            case 5:
                ScriptManager.executeScript$lambda$5((LoadedScript) this.f8569c, (String) this.f8568b, (InterfaceC1416fj) this.f8570d);
                return;
            case 6:
                TextView textView = (TextView) this.f8569c;
                Throwable th2 = (Throwable) this.f8570d;
                AlertDialog alertDialog = (AlertDialog) this.f8568b;
                textView.setText(AbstractC0295Gu.m625r(-579820584958005L) + th2.getMessage());
                Button button = alertDialog.getButton(-1);
                if (button != null) {
                    button.setText(AbstractC0295Gu.m625r(-579846354761781L));
                    button.setOnClickListener(new ViewOnClickListenerC1477h(12, alertDialog));
                    return;
                }
                return;
            case 7:
                TextView textView2 = (TextView) this.f8570d;
                AlertDialog alertDialog2 = (AlertDialog) this.f8568b;
                Context context = (Context) this.f8569c;
                textView2.setText(AbstractC0295Gu.m625r(-579859239663669L));
                Button button2 = alertDialog2.getButton(-1);
                if (button2 != null) {
                    button2.setText(AbstractC0295Gu.m625r(-579906484303925L));
                    button2.setOnClickListener(new ViewOnClickListenerC2176l5(24, alertDialog2, context));
                    return;
                }
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                Runnable runnable = (Runnable) this.f8569c;
                C2046v2 c2046v2 = (C2046v2) this.f8570d;
                String str = (String) this.f8568b;
                try {
                    runnable.run();
                    return;
                } catch (Throwable th3) {
                    c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task " + str, th3);
                    return;
                }
            default:
                C2046v2 c2046v22 = ((C1841f) this.f8569c).f6644a;
                C1589H2 c1589h2 = (C1589H2) this.f8570d;
                C1979q1 c1979q1 = (C1979q1) this.f8568b;
                if (c1589h2 != null) {
                    AbstractC1836a.m4003d(c2046v22, c1589h2, ".scope-cache", "trace.json");
                    return;
                }
                C1918l c1918l = c1979q1.f7096r;
                C1589H2 c1589h22 = new C1589H2((C1970t) c1918l.f6805b, (C1601K2) c1918l.f6806c, "default", null);
                c1589h22.f5746i = "auto";
                AbstractC1836a.m4003d(c2046v22, c1589h22, ".scope-cache", "trace.json");
                return;
        }
    }

    public /* synthetic */ RunnableC2445r8(LoadedScript loadedScript, String str, InterfaceC1416fj interfaceC1416fj) {
        this.f8567a = 5;
        this.f8569c = loadedScript;
        this.f8568b = str;
        this.f8570d = interfaceC1416fj;
    }

    public /* synthetic */ RunnableC2445r8(Object obj, Object obj2, Object obj3, int i) {
        this.f8567a = i;
        this.f8569c = obj;
        this.f8570d = obj2;
        this.f8568b = obj3;
    }

    public /* synthetic */ RunnableC2445r8(String str, C0382Iv c0382Iv, CountDownLatch countDownLatch) {
        this.f8567a = 1;
        this.f8568b = str;
        this.f8569c = c0382Iv;
        this.f8570d = countDownLatch;
    }
}
