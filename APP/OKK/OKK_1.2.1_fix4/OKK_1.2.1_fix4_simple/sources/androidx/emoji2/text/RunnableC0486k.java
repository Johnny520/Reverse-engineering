package androidx.emoji2.text;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p006D.C0095d;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p050c0.C0613O0;
import p050c0.C0639a0;
import p050c0.C0688q1;
import p050c0.RunnableC0603L;
import p056f0.C0830i;
import p056f0.DialogC0823e;

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

    public /* synthetic */ RunnableC0486k(Object r1, Object r2, Object r3, int r4) {
        this.f1364a = r4;
        this.f1365b = r1;
        this.f1366c = r2;
        this.f1367d = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = 1;
        switch(this.f1364a) {
            case 0: goto L22;
            case 1: goto L14;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        DialogC0823e r3 = (DialogC0823e) this.f1365b;
        AbstractC0307g.m703e(r3, "$progress");
        Activity r4 = (Activity) this.f1366c;
        AbstractC0307g.m703e(r4, "$activity");
        Throwable r5 = (Throwable) this.f1367d;
        AbstractC0307g.m703e(r5, "$t");
        r3.m2131a();
        Toast.makeText(r4, "适配检查失败: " + r5.getMessage(), 1).show();
        C0830i.f3004e.set(false);
        return;
    L6:
        C0613O0 r02 = (C0613O0) this.f1366c;
        AbstractC0307g.m703e(r02, "$identity");
        C0688q1 r12 = C0688q1.f2163a;
        C0688q1.m1766a((TextView) this.f1365b, r02.f1892b, (String) this.f1367d);
        return;
    L8:
        AtomicBoolean r32 = (AtomicBoolean) this.f1365b;
        AbstractC0307g.m703e(r32, "$done");
        Activity r42 = (Activity) this.f1367d;
        AbstractC0307g.m703e(r42, "$activity");
        if (r32.compareAndSet(false, true) == true) goto L11;
        return;
    L11:
        if (C0688q1.f2170h.containsKey((String) this.f1366c) == true) goto L44;
        Toast.makeText(r42, "获取失败: 可能被删除/拉黑/对方账号异常", 0).show();
        return;
    L44:
        return;
    L14:
        Object r03 = this.f1365b;
        AbstractC0307g.m703e(r03, "$currentMsg");
        C0639a0 r2 = C0639a0.f1967a;
        if (C0639a0.m1562S(r03) == false) goto L18;
        return;
    L18:
        if (C0639a0.m1561R(r03) == true) goto L46;
        ((View) this.f1366c).postDelayed(new RunnableC0603L(r1, (View) this.f1367d, r03), 80);
        return;
    L46:
        return;
    L22:
        C0095d r04 = (C0095d) this.f1365b;
        AbstractC0358S r13 = (AbstractC0358S) this.f1366c;
        ThreadPoolExecutor r22 = (ThreadPoolExecutor) this.f1367d;
        r04.getClass();
        C0493r r05 = AbstractC0358S.m896m((Context) r04.f251b);     // Catch: Throwable -> L31
        if (r05 == null) goto L37;
        C0492q r33 = (C0492q) r05.f1388a;     // Catch: Throwable -> L31
        Object r43 = r33.f1382d;     // Catch: Throwable -> L31
        monitor-enter(r43);     // Catch: Throwable -> L31
        r33.f1384f = r22;     // Catch: Throwable -> L33
        monitor-exit(r43);     // Catch: Throwable -> L33
        r05.f1388a.mo350p(new C0487l(r13, r22));     // Catch: Throwable -> L31
        return;
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L31
    L37:
        throw new RuntimeException("EmojiCompat font provider not available on this device.");     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        r13.mo921U(th);
        r22.shutdown();
    }
}
