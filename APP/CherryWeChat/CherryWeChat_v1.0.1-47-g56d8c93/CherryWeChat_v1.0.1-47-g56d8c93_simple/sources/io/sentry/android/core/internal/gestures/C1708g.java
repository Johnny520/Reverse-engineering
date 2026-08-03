package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.hints.C1891i;
import io.sentry.internal.gestures.C1903b;
import java.util.Collections;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1708g extends AbstractWindowCallbackC1710i {

    /* JADX INFO: renamed from: b */
    public final Window.Callback f6178b;

    /* JADX INFO: renamed from: c */
    public final GestureDetectorOnGestureListenerC1707f f6179c;

    /* JADX INFO: renamed from: d */
    public final GestureDetectorCompat f6180d;

    /* JADX INFO: renamed from: e */
    public final C2046v2 f6181e;

    /* JADX INFO: renamed from: f */
    public final C1891i f6182f;

    public C1708g(Window.Callback r4, Activity r5, GestureDetectorOnGestureListenerC1707f r6, C2046v2 r7) {
        GestureDetectorCompat r0 = new GestureDetectorCompat(r5, r6, new Handler(Looper.getMainLooper()));
        C1891i r52 = new C1891i();
        super(r4);
        this.f6178b = r4;
        this.f6179c = r6;
        this.f6181e = r7;
        this.f6180d = r0;
        this.f6182f = r52;
    }

    /* JADX INFO: renamed from: a */
    public final void m3883a(MotionEvent r9) {
        this.f6180d.f3928a.onTouchEvent(r9);
        if (r9.getActionMasked() != 1) goto L24;
        GestureDetectorOnGestureListenerC1707f r1 = this.f6179c;
        View r0 = r1.m3880b("onUp");
        C1706e r2 = r1.f6177g;
        C1903b r3 = r2.f6168b;
        if (r0 == null) goto L25;
        if (r3 == null) goto L26;
        EnumC1705d r02 = r2.f6167a;
        EnumC1705d r4 = EnumC1705d.Unknown;
        if (r02 != r4) goto L12;
        r1.f6173c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
        return;
    L12:
        float r03 = r9.getX() - r2.f6169c;
        float r5 = r9.getY() - r2.f6170d;
        if (Math.abs(r03) <= Math.abs(r5)) goto L19;
        if (r03 <= 0.0f) goto L17;
        String r04 = "right";
    L22:
        r1.m3879a(r3, r2.f6167a, Collections.singletonMap("direction", r04), r9);
        r1.m3881c(r3, r2.f6167a);
        r2.f6168b = null;
        r2.f6167a = r4;
        r2.f6169c = 0.0f;
        r2.f6170d = 0.0f;
        return;
    L17:
        r04 = "left";
        goto L22
    L19:
        if (r5 <= 0.0f) goto L21;
        r04 = "down";
        goto L22
    L21:
        r04 = "up";
        goto L22
    L26:
        return;
    L25:
        return;
    }

    @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC1710i, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent r6) {
        if (r6 == null) goto L15;
        this.f6182f.getClass();
        MotionEvent r0 = MotionEvent.obtain(r6);
        m3883a(r0);     // Catch: Throwable -> L6
    L5:
        r0.recycle();
    L6:
        th = move-exception;
        C2046v2 r2 = this.f6181e;
        if (r2 == null) goto L5;
        r2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error dispatching touch event", th);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        r0.recycle();
        throw th;
    L15:
        return this.f6184a.dispatchTouchEvent(r6);
    }
}
