package p000;

import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.widget.ListView;
import android.widget.TextView;

/* JADX INFO: renamed from: u8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0485u8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0314l8 f942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Handler f943b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0533x8 f944c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Dialog f945d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0565z8 f946e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TextView f947f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ListView f948g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f949h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0485u8(C0314l8 c0314l8, Handler handler, C0533x8 c0533x8, Dialog dialog, C0565z8 c0565z8, TextView textView, ListView listView, Activity activity) {
        this.f942a = c0314l8;
        this.f943b = handler;
        this.f944c = c0533x8;
        this.f945d = dialog;
        this.f946e = c0565z8;
        this.f947f = textView;
        this.f948g = listView;
        this.f949h = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean zPost = this.f943b.post(new RunnableC0412q(this, AbstractC0260i5.m576V0(this.f942a), 6, false));
            this.f942a.m754c();
            if (zPost) {
                return;
            }
        } catch (Throwable th) {
            try {
                if (!this.f942a.f528a) {
                    AbstractC0198e7.m343a("kk-tts", "catalog", th);
                    boolean zPost2 = this.f943b.post(new RunnableC0239h0(4, this));
                    this.f942a.m754c();
                    if (zPost2) {
                        return;
                    }
                    AbstractC0010a9.m72a(this.f942a);
                    return;
                }
                this.f942a.m754c();
            } catch (Throwable th2) {
                this.f942a.m754c();
                AbstractC0010a9.m72a(this.f942a);
                throw th2;
            }
        }
        AbstractC0010a9.m72a(this.f942a);
    }
}
