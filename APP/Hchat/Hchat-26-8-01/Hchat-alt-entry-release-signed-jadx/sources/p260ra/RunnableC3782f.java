package p260ra;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import na.C2914b;
import p162l3.C2458l;

/* JADX INFO: renamed from: ra.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3782f implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Activity f12385g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f12386h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int[] f12387i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f12388j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Handler f12389k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3784h f12390l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC3782f(C3784h c3784h, Activity activity, String str, int[] iArr, int i9, Handler handler) {
        this.f12390l = c3784h;
        this.f12385g = activity;
        this.f12386h = str;
        this.f12387i = iArr;
        this.f12388j = i9;
        this.f12389k = handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        Activity activity = this.f12385g;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        C3784h c3784h = this.f12390l;
        String str = this.f12386h;
        try {
            View decorView = activity.getWindow().getDecorView();
            if (!C3784h.m7952d(decorView) && C3784h.m7951c(decorView)) {
                c3784h.m7963o("检测到红包失败状态，关闭页面");
                C2914b c2914b = c3784h.f12402e;
                if (c2914b != null) {
                    c2914b.m6321b(str);
                }
                c3784h.f12404g.remove(activity);
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
            c3784h.m7963o("检测红包失败状态异常: " + th2.getMessage());
        }
        int[] iArr = this.f12387i;
        int i9 = iArr[0];
        iArr[0] = i9 + 1;
        if (i9 < this.f12388j) {
            this.f12389k.postDelayed(this, 300L);
        }
    }
}
