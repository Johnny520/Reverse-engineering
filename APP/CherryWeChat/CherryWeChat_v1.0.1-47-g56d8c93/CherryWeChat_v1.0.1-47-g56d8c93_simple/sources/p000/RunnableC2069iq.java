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

    public RunnableC2069iq(C2046v2 r2, C1563B0 r3) {
        this.f7318a = 1;
        this.f7319b = r2;
        this.f7320c = r3;
        this.f7323f = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f7318a) {
            case 0: goto L33;
            default: goto L4;
        };
    L4:
        C2046v2 r0 = (C2046v2) this.f7319b;
        if (((AtomicBoolean) this.f7323f).get() == false) goto L7;
    L12:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to capture a frame", th);
    L19:
        int r3 = 1;
        if (r0.getSessionReplay().f7316l == false) goto L26;
        ILogger r1 = r0.getLogger();
        EnumC1657a2 r4 = EnumC1657a2.DEBUG;
        StringBuilder r5 = new StringBuilder("Posting the capture runnable again, frame rate is ");
        C1821w r6 = (C1821w) this.f7322e;
        if (r6 == null) goto L24;
        int r62 = r6.f6593e;
    L25:
        r1.mo3680e(r4, AbstractC0213Ey.m409g(r5, r62, " fps."), new Object[0]);
        goto L26
    L24:
        r62 = 1;
    L26:
        C1563B0 r12 = (C1563B0) this.f7320c;
        C1821w r42 = (C1821w) this.f7322e;
        if (r42 == null) goto L30;
        r3 = r42.f6593e;
    L30:
        if (((Handler) r12.f5600a).postDelayed(this, 1000 / ((long) r3)) == true) goto L42;
        r0.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        return;
    L42:
        return;
    L10:
        if (r0.getSessionReplay().f7316l == false) goto L14;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Capturing a frame.", new Object[0]);     // Catch: Throwable -> L12
    L14:
        ViewTreeObserverOnDrawListenerC1810v r13 = (ViewTreeObserverOnDrawListenerC1810v) this.f7321d;     // Catch: Throwable -> L12
        if (r13 == null) goto L19;
        r13.m3980b();     // Catch: Throwable -> L12
        goto L19
    L7:
        if (r0.getSessionReplay().f7316l == false) goto L40;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
        return;
    L40:
        return;
    L33:
        Button r02 = (Button) this.f7320c;
        C0339Hv r14 = (C0339Hv) this.f7319b;
        int r2 = r14.f1147a - 1;
        r14.f1147a = r2;
        if (r2 <= 0) goto L36;
        r02.setText(AbstractC0295Gu.m625r(-826106894612533L) + r14.f1147a + ')');
        ((Handler) this.f7321d).postDelayed(this, 1000);
        return;
    L36:
        r02.setText(AbstractC0295Gu.m625r(-826128369449013L));
        r02.setEnabled(true);
        r02.setOnClickListener(new ViewOnClickListenerC2176l5(18, (AlertDialog) this.f7322e, (C1389f) this.f7323f));
    }

    public RunnableC2069iq(C0339Hv r2, Button r3, Handler r4, AlertDialog r5, C1389f r6) {
        this.f7318a = 0;
        this.f7319b = r2;
        this.f7320c = r3;
        this.f7321d = r4;
        this.f7322e = r5;
        this.f7323f = r6;
    }
}
