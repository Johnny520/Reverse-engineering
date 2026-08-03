package p260ra;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import na.C2914b;
import p162l3.C2458l;

/* JADX INFO: renamed from: ra.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3783g implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Activity f12391g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f12392h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f12393i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int[] f12394j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f12395k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Handler f12396l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C3784h f12397m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC3783g(C3784h c3784h, Activity activity, String str, boolean z9, int[] iArr, int i9, Handler handler) {
        this.f12397m = c3784h;
        this.f12391g = activity;
        this.f12392h = str;
        this.f12393i = z9;
        this.f12394j = iArr;
        this.f12395k = i9;
        this.f12396l = handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        String strM7953f;
        boolean z9;
        Activity activity = this.f12391g;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        C3784h c3784h = this.f12397m;
        String str = this.f12392h;
        boolean z10 = this.f12393i;
        try {
            View decorView = activity.getWindow().getDecorView();
            if (C3784h.m7952d(decorView)) {
                TextView textViewM7954h = C3784h.m7954h(decorView);
                String str2 = null;
                if (textViewM7954h != null) {
                    ViewParent parent = textViewM7954h.getParent();
                    loop0: while (true) {
                        if (!(parent instanceof ViewGroup)) {
                            break;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                            View childAt = viewGroup.getChildAt(i9);
                            if (childAt != textViewM7954h && (strM7953f = C3784h.m7953f(childAt)) != null) {
                                str2 = strM7953f;
                                break loop0;
                            }
                        }
                        parent = viewGroup.getParent();
                    }
                }
                c3784h.m7963o("检测到红包领取成功: amount=" + str2);
                C2914b c2914b = c3784h.f12401d;
                if (c2914b != null) {
                    c2914b.m6323d(str, str2, z10);
                }
                C2458l c2458l = c3784h.f12399b;
                c2458l.getClass();
                try {
                    z9 = c2458l.m5853b().getBoolean("hb_auto_close", false);
                } catch (Throwable unused) {
                    z9 = false;
                }
                if (z9) {
                    activity.finish();
                    return;
                }
                return;
            }
        } catch (Throwable th2) {
            c3784h.m7963o("检测红包成功状态异常: " + th2.getMessage());
        }
        int[] iArr = this.f12394j;
        int i10 = iArr[0];
        iArr[0] = i10 + 1;
        if (i10 < this.f12395k) {
            this.f12396l.postDelayed(this, 300L);
        }
    }
}
