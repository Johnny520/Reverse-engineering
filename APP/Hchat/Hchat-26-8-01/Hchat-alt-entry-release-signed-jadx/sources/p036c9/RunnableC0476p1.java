package p036c9;

import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p080fb.AbstractC1184v0;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p281t3.AbstractC4109f;
import p281t3.ExecutorC4107d;

/* JADX INFO: renamed from: c9.p1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0476p1 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1412g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f1413h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0476p1(Context context, int i9) {
        this.f1412g = i9;
        this.f1413h = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        int i9 = this.f1412g;
        Context context = this.f1413h;
        switch (i9) {
            case 0:
                AtomicBoolean atomicBoolean = C0429d2.f1237c;
                AtomicBoolean atomicBoolean2 = C0429d2.f1238d;
                do {
                    try {
                        atomicBoolean2.set(false);
                        C0429d2 c0429d2 = C0429d2.f1235a;
                        try {
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            C0429d2.m1446z(applicationContext);
                            c3959f = C3967n.f12976a;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:ConversationGroup] 同步聊天分组失败: " + thM8182b.getMessage(), thM8182b);
                        }
                    } catch (Throwable th3) {
                        atomicBoolean.set(false);
                        if (atomicBoolean2.get()) {
                            C0429d2.m1445y(context);
                        }
                        throw th3;
                    }
                    break;
                } while (atomicBoolean2.get());
                atomicBoolean.set(false);
                if (atomicBoolean2.get()) {
                    C0429d2.m1445y(context);
                    return;
                }
                return;
            case 1:
                ScriptPluginRuntime.loadEnabledPluginsWhenReady$lambda$0(context);
                return;
            case 2:
                Toast.makeText(context, "该消息暂不支持复读", 0).show();
                return;
            case 3:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0476p1(context, 4));
                return;
            default:
                AbstractC4109f.m8300t(context, new ExecutorC4107d(), AbstractC4109f.f13593a, false);
                return;
        }
    }
}
