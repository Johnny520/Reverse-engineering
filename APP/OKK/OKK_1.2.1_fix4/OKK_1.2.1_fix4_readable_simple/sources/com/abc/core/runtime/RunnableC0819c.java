package com.abc.core.runtime;

import android.app.Activity;
import android.widget.Toast;
import com.abc.internal.probe.AppFingerprint;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0819c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogC0823e f2973b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppFingerprint f2974c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f2975d;

    public /* synthetic */ RunnableC0819c(DialogC0823e r1, AppFingerprint r2, Activity r3, int r4) {
        this.f2972a = r4;
        this.f2973b = r1;
        this.f2974c = r2;
        this.f2975d = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f2972a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        DialogC0823e r5 = this.f2973b;
        AppFingerprint r6 = this.f2974c;
        Activity r7 = this.f2975d;
        AbstractC0307g.m703e(r5, "$progress");
        AbstractC0307g.m703e(r6, "$merged");
        AbstractC0307g.m703e(r7, "$activity");
        r5.m2131a();
        AbstractC0358S.m865O(r6.f1638a);
        AbstractC0358S.f729i = false;
        AbstractC0358S.f728h = false;
        AbstractC0358S.m888g0(r6);
        new DialogC0827g(r7, r6).show();
        Toast.makeText(r7, "报告已更新（安装策略下次启动生效）", 1).show();
        HookDiagnostics.f3004e.set(false);
        HookDiagnostics.f3003d.set(true);
        return;
    L6:
        DialogC0823e r52 = this.f2973b;
        AppFingerprint r62 = this.f2974c;
        Activity r72 = this.f2975d;
        AbstractC0307g.m703e(r52, "$progress");
        AbstractC0307g.m703e(r62, "$merged");
        AbstractC0307g.m703e(r72, "$activity");
        r52.m2131a();
        HookDiagnostics.f3003d.set(true);
        AbstractC0358S.f729i = false;
        AbstractC0358S.f728h = false;
        AbstractC0358S.m865O(r62.f1638a);
        AbstractC0358S.m888g0(r62);
        new DialogC0827g(r72, r62).show();     // Catch: Throwable -> L9
        Object r2 = C0146l.f339a;     // Catch: Throwable -> L9
    L12:
        if (AbstractC0141g.m465a(r2) == null) goto L14;
        Toast.makeText(r72, "适配完成 " + r62.m1361e(), 1).show();
    L14:
        HookDiagnostics.f3004e.set(false);
        HookDiagnostics r02 = HookDiagnostics.f3000a;
        HookDiagnostics.m2157g("interactive done " + r62.m1361e());
        return;
    L9:
        th = move-exception;
        r2 = AbstractC0040p.m116u(th);
        goto L12
    }
}
