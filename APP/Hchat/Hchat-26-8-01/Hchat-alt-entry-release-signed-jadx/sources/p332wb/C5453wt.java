package p332wb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import p080fb.C1125g1;

/* JADX INFO: renamed from: wb.wt */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5453wt {

    /* JADX INFO: renamed from: a */
    public final C5518yt f21820a;

    /* JADX INFO: renamed from: b */
    public final Context f21821b;

    /* JADX INFO: renamed from: c */
    public final Handler f21822c;

    /* JADX INFO: renamed from: d */
    public boolean f21823d;

    /* JADX INFO: renamed from: e */
    public long f21824e;

    /* JADX INFO: renamed from: f */
    public final RunnableC4794cr f21825f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5453wt(Context context, C5518yt c5518yt) {
        this.f21820a = c5518yt;
        Context applicationContext = context.getApplicationContext();
        this.f21821b = applicationContext != null ? applicationContext : context;
        this.f21822c = new Handler(Looper.getMainLooper());
        this.f21825f = new RunnableC4794cr(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9764a() {
        C1125g1 c1125g1 = C1125g1.f3676a;
        C5518yt c5518yt = this.f21820a;
        if (C1125g1.m2864h((List) c5518yt.f22274d.getValue())) {
            this.f21824e = SystemClock.uptimeMillis();
            C1125g1.m2871o(this.f21821b, C5518yt.m9924N(c5518yt));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m9765b(boolean z9) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        RunnableC4794cr runnableC4794cr = this.f21825f;
        Handler handler = this.f21822c;
        if (!z9) {
            long j3 = jUptimeMillis - this.f21824e;
            if (j3 < 600) {
                if (this.f21823d) {
                    return;
                }
                this.f21823d = true;
                long j4 = 600 - j3;
                if (j4 < 1) {
                    j4 = 1;
                }
                handler.postDelayed(runnableC4794cr, j4);
                return;
            }
        }
        handler.removeCallbacks(runnableC4794cr);
        this.f21823d = false;
        m9764a();
    }
}
