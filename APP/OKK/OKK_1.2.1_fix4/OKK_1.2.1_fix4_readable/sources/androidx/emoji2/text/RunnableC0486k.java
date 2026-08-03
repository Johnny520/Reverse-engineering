package androidx.emoji2.text;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.abc.core.features.C0613O0;
import com.abc.core.features.MessageDetailHook;
import com.abc.core.features.RealNameTailHook;
import com.abc.core.features.RunnableC0603L;
import com.abc.core.runtime.DialogC0823e;
import com.abc.core.runtime.HookDiagnostics;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p006D.C0095d;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: androidx.emoji2.text.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0486k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1366c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1367d;

    public /* synthetic */ RunnableC0486k(Object obj, Object obj2, Object obj3, int i2) {
        this.f1364a = i2;
        this.f1365b = obj;
        this.f1366c = obj2;
        this.f1367d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 1;
        switch (this.f1364a) {
            case 0:
                C0095d c0095d = (C0095d) this.f1365b;
                AbstractC0358S abstractC0358S = (AbstractC0358S) this.f1366c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1367d;
                c0095d.getClass();
                try {
                    C0493r c0493rM896m = AbstractC0358S.m896m((Context) c0095d.f251b);
                    if (c0493rM896m == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0492q c0492q = (C0492q) c0493rM896m.f1388a;
                    synchronized (c0492q.f1382d) {
                        c0492q.f1384f = threadPoolExecutor;
                        break;
                    }
                    c0493rM896m.f1388a.mo350p(new C0487l(abstractC0358S, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0358S.mo921U(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                Object obj = this.f1365b;
                AbstractC0307g.m703e(obj, "$currentMsg");
                MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                if (MessageDetailHook.m1562S(obj) || MessageDetailHook.m1561R(obj)) {
                    return;
                }
                ((View) this.f1366c).postDelayed(new RunnableC0603L(i2, (View) this.f1367d, obj), 80L);
                return;
            case 2:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1365b;
                AbstractC0307g.m703e(atomicBoolean, "$done");
                Activity activity = (Activity) this.f1367d;
                AbstractC0307g.m703e(activity, "$activity");
                if (!atomicBoolean.compareAndSet(false, true) || RealNameTailHook.f2170h.containsKey((String) this.f1366c)) {
                    return;
                }
                Toast.makeText(activity, "获取失败: 可能被删除/拉黑/对方账号异常", 0).show();
                return;
            case 3:
                C0613O0 c0613o0 = (C0613O0) this.f1366c;
                AbstractC0307g.m703e(c0613o0, "$identity");
                RealNameTailHook realNameTailHook = RealNameTailHook.f2163a;
                RealNameTailHook.m1766a((TextView) this.f1365b, c0613o0.f1892b, (String) this.f1367d);
                return;
            default:
                DialogC0823e dialogC0823e = (DialogC0823e) this.f1365b;
                AbstractC0307g.m703e(dialogC0823e, "$progress");
                Activity activity2 = (Activity) this.f1366c;
                AbstractC0307g.m703e(activity2, "$activity");
                Throwable th2 = (Throwable) this.f1367d;
                AbstractC0307g.m703e(th2, "$t");
                dialogC0823e.m2131a();
                Toast.makeText(activity2, "适配检查失败: " + th2.getMessage(), 1).show();
                HookDiagnostics.f3004e.set(false);
                return;
        }
    }
}
