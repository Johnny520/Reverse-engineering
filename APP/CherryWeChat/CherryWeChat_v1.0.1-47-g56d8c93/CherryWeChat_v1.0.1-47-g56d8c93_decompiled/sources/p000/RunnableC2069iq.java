package p000;

import android.app.AlertDialog;
import android.os.Handler;
import android.widget.Button;
import io.sentry.C1563B0;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.android.replay.C1821w;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC1810v;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: iq */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2069iq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7318a;

    /* JADX INFO: renamed from: b */
    public final Object f7319b;

    /* JADX INFO: renamed from: c */
    public final Object f7320c;

    /* JADX INFO: renamed from: d */
    public Object f7321d;

    /* JADX INFO: renamed from: e */
    public Object f7322e;

    /* JADX INFO: renamed from: f */
    public final Object f7323f;

    public RunnableC2069iq(C2046v2 c2046v2, C1563B0 c1563b0) {
        this.f7318a = 1;
        this.f7319b = c2046v2;
        this.f7320c = c1563b0;
        this.f7323f = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7318a) {
            case 0:
                Button button = (Button) this.f7320c;
                C0339Hv c0339Hv = (C0339Hv) this.f7319b;
                int i = c0339Hv.f1147a - 1;
                c0339Hv.f1147a = i;
                if (i <= 0) {
                    button.setText(AbstractC0295Gu.m625r(-826128369449013L));
                    button.setEnabled(true);
                    button.setOnClickListener(new ViewOnClickListenerC2176l5(18, (AlertDialog) this.f7322e, (C1389f) this.f7323f));
                } else {
                    button.setText(AbstractC0295Gu.m625r(-826106894612533L) + c0339Hv.f1147a + ')');
                    ((Handler) this.f7321d).postDelayed(this, 1000L);
                }
                break;
            default:
                C2046v2 c2046v2 = (C2046v2) this.f7319b;
                if (((AtomicBoolean) this.f7323f).get()) {
                    try {
                        if (c2046v2.getSessionReplay().f7316l) {
                            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing a frame.", new Object[0]);
                        }
                        ViewTreeObserverOnDrawListenerC1810v viewTreeObserverOnDrawListenerC1810v = (ViewTreeObserverOnDrawListenerC1810v) this.f7321d;
                        if (viewTreeObserverOnDrawListenerC1810v != null) {
                            viewTreeObserverOnDrawListenerC1810v.m3980b();
                        }
                    } catch (Throwable th) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to capture a frame", th);
                    }
                    if (c2046v2.getSessionReplay().f7316l) {
                        ILogger logger = c2046v2.getLogger();
                        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
                        StringBuilder sb = new StringBuilder("Posting the capture runnable again, frame rate is ");
                        C1821w c1821w = (C1821w) this.f7322e;
                        logger.mo3680e(enumC1657a2, AbstractC0213Ey.m409g(sb, c1821w != null ? c1821w.f6593e : 1, " fps."), new Object[0]);
                    }
                    C1563B0 c1563b0 = (C1563B0) this.f7320c;
                    C1821w c1821w2 = (C1821w) this.f7322e;
                    if (!((Handler) c1563b0.f5600a).postDelayed(this, 1000 / ((long) (c1821w2 != null ? c1821w2.f6593e : 1)))) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                    }
                } else if (c2046v2.getSessionReplay().f7316l) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                }
                break;
        }
    }

    public RunnableC2069iq(C0339Hv c0339Hv, Button button, Handler handler, AlertDialog alertDialog, C1389f c1389f) {
        this.f7318a = 0;
        this.f7319b = c0339Hv;
        this.f7320c = button;
        this.f7321d = handler;
        this.f7322e = alertDialog;
        this.f7323f = c1389f;
    }
}
