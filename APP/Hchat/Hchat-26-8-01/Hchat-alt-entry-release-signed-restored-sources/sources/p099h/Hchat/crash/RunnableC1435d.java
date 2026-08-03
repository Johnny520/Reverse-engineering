package p099h.Hchat.crash;

import android.app.Activity;
import ba.C0226f;
import gg.AbstractC1416l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p218og.AbstractC3149m;
import p266s0.C3874d;
import p332wb.C5322su;
import p332wb.C5491y2;
import p332wb.InterfaceC5059kv;

/* JADX INFO: renamed from: h.Hchat.crash.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1435d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4751g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f4752h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h.Hchat.crash.g.k(android.app.Activity):void] */
    public /* synthetic */ RunnableC1435d(Activity activity) {
        this.f4752h = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = null;
        switch (this.f4751g) {
            case 0:
                Activity activity2 = this.f4752h;
                C1438g c1438g = C1438g.f4755a;
                if (!C1438g.f4763i) {
                    C1438g.f4760f.set(false);
                    return;
                }
                if (C1438g.f4766l.get() != activity2 || activity2.isFinishing() || activity2.isDestroyed()) {
                    C1438g.f4760f.set(false);
                    Activity activity3 = (Activity) C1438g.f4766l.get();
                    if (activity3 != null) {
                        if (!activity3.isFinishing() && !activity3.isDestroyed()) {
                            activity = activity3;
                        }
                        if (activity != null) {
                            C1438g.m3869k(activity);
                            return;
                        }
                        return;
                    }
                    return;
                }
                File file = C1438g.f4773s;
                if (file == null) {
                    AbstractC1416l.m3831g("pendingReportFile");
                    throw null;
                }
                String strM3868j = C1438g.m3868j(file);
                if (strM3868j == null || AbstractC3149m.m6721t0(strM3868j)) {
                    File file2 = C1438g.f4773s;
                    if (file2 == null) {
                        AbstractC1416l.m3831g("pendingReportFile");
                        throw null;
                    }
                    file2.delete();
                    C1438g.f4760f.set(false);
                    return;
                }
                String strConcat = strM3868j.length() <= 32768 ? strM3868j : AbstractC3149m.m6701P0(32768, strM3868j).concat("\n\n[日志较长，界面仅展示部分内容；点击日志或复制按钮仍会复制完整内容]");
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                InterfaceC5059kv interfaceC5059kvM9796P1 = C5491y2.m9796P1(activity2, new C0035c(atomicBoolean, 9, strM3868j), new C3874d(2037942914, new C5322su(activity2, strM3868j, strConcat), true));
                if (!interfaceC5059kvM9796P1.mo7023a()) {
                    atomicBoolean.set(false);
                    C1438g.f4760f.set(false);
                    return;
                } else {
                    C1438g.f4767m = interfaceC5059kvM9796P1;
                    C1438g.f4768n = new WeakReference(activity2);
                    C1438g.f4769o = atomicBoolean;
                    return;
                }
            default:
                AbstractC0018a.m231S(this.f4752h, null, false);
                return;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ba.f.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void] */
    public /* synthetic */ RunnableC1435d(C0226f c0226f, Activity activity) {
        this.f4752h = activity;
    }
}
