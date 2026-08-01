package p021D3;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.LongSparseArray;
import android.view.Window;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1925g;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p000A.C0038T0;
import p000A.C0066i0;
import p002A1.AbstractC0116E;
import p002A1.C0147t;
import p002A1.EnumC0140m;
import p010B3.AbstractActivityC0224c;
import p037G2.C0494f;
import p044H3.AbstractC0646a;
import p047I0.C0755p0;
import p049I2.ExecutorC0798p;
import p049I2.SharedPreferencesC0796n;
import p050I3.AbstractC0808h;
import p056K2.C0887m;
import p112W2.InterfaceC1599a;
import p135b.C1809A;
import p135b.C1815c;
import p136b0.C1843e;
import p179i4.AbstractC2352g;
import p181j0.ViewOnAttachStateChangeListenerC2369d;

/* JADX INFO: renamed from: D3.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0270g implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f868d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f869e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f870f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0270g(int i5, Object obj, Object obj2) {
        this.f868d = i5;
        this.f869e = obj;
        this.f870f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f868d;
        boolean z5 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.f870f;
        Object obj2 = this.f869e;
        switch (i5) {
            case 0:
                Activity activity = (Activity) obj2;
                AbstractC0646a[] abstractC0646aArr = (AbstractC0646a[]) obj;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                Dialog dialog = C0274k.f890j;
                if (dialog == null || !dialog.isShowing()) {
                    C0038T0 c0038t0 = new C0038T0(13);
                    final C0271h c0271h = new C0271h();
                    boolean z6 = c0271h.f874g;
                    C0147t c0147t = c0271h.f871d;
                    if (!z6) {
                        c0271h.f872e.m1329a(null);
                        c0147t.m189e(EnumC0140m.ON_CREATE);
                        c0271h.f874g = true;
                    }
                    C0755p0 c0755p0 = new C0755p0(activity);
                    AbstractC0116E.m165g(c0755p0, c0271h);
                    c0755p0.setTag(R.id.view_tree_saved_state_registry_owner, c0271h);
                    c0755p0.setTag(R.id.view_tree_view_model_store_owner, c0271h);
                    c0755p0.setViewCompositionStrategy(new C0066i0(8, c0147t));
                    c0755p0.setContent(new C1843e(-2105142027, true, new C0265b(c0038t0, objArr == true ? 1 : 0)));
                    Dialog dialog2 = new Dialog(activity);
                    dialog2.requestWindowFeature(1);
                    dialog2.setCancelable(false);
                    dialog2.setCanceledOnTouchOutside(false);
                    dialog2.setContentView(c0755p0);
                    dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: D3.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C0271h c0271h2 = c0271h;
                            C0147t c0147t2 = c0271h2.f871d;
                            if (c0271h2.f874g && !c0271h2.f875h) {
                                c0147t2.m189e(EnumC0140m.ON_PAUSE);
                                c0147t2.m189e(EnumC0140m.ON_STOP);
                                c0147t2.m189e(EnumC0140m.ON_DESTROY);
                                c0271h2.f873f.m176a();
                                c0271h2.f875h = true;
                            }
                            C0274k.f890j = null;
                            C0274k.f891k = null;
                        }
                    });
                    C0274k.f891k = c0038t0;
                    C0274k.f890j = dialog2;
                    C0274k.m479v("正在初始化 Dex 分析[0/" + abstractC0646aArr.length + "]", null);
                    dialog2.show();
                    if (c0271h.f874g && !c0271h.f875h) {
                        c0147t.m189e(EnumC0140m.ON_START);
                        c0147t.m189e(EnumC0140m.ON_RESUME);
                    }
                    Window window = dialog2.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                        window.setDimAmount(0.36f);
                        window.setLayout(-2, -2);
                        return;
                    }
                    return;
                }
                return;
            case BuildConfig.VERSION_CODE /* 1 */:
                String str = (String) obj2;
                String str2 = (String) obj;
                AtomicBoolean atomicBoolean = C0274k.f886f;
                try {
                    C0887m c0887m = C0274k.f881a;
                    C0274k.m478u(str, str2);
                    return;
                } finally {
                    atomicBoolean.set(false);
                }
            case 2:
                SharedPreferencesC0796n sharedPreferencesC0796n = (SharedPreferencesC0796n) obj2;
                AbstractC1923e.m3481s(new File(sharedPreferencesC0796n.f2548a + sharedPreferencesC0796n.f2549b, (String) obj));
                return;
            case 3:
                ExecutorC0798p executorC0798p = (ExecutorC0798p) obj2;
                Runnable runnable = (Runnable) obj;
                executorC0798p.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0798p.m1403a();
                }
            case 4:
                String str3 = (String) obj2;
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) obj;
                AbstractC0808h.f2594a.set(true);
                ThreadLocal threadLocal = AbstractC0808h.f2595b;
                threadLocal.set(Boolean.TRUE);
                try {
                    AbstractC0808h.m1410d(str3, new C0494f(interfaceC1599a, 2));
                    return;
                } catch (Throwable th) {
                    try {
                        AbstractC1925g.m3537n("NukeNativePerf", str3 + " failed: " + AbstractC2352g.m4182E(th));
                        throw th;
                    } finally {
                        threadLocal.set(Boolean.FALSE);
                    }
                }
            case 5:
                AbstractActivityC0224c abstractActivityC0224c = (AbstractActivityC0224c) obj2;
                abstractActivityC0224c.getLifecycle().mo184a(new C1815c(objArr2 == true ? 1 : 0, (C1809A) obj, abstractActivityC0224c));
                return;
            default:
                AbstractC1923e.m3484v((ViewOnAttachStateChangeListenerC2369d) obj2, (LongSparseArray) obj);
                return;
        }
    }
}
