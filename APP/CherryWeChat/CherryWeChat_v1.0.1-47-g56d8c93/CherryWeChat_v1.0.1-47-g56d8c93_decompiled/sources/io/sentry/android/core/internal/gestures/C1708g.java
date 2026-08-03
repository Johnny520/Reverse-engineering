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

    public C1708g(Window.Callback callback, Activity activity, GestureDetectorOnGestureListenerC1707f gestureDetectorOnGestureListenerC1707f, C2046v2 c2046v2) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, gestureDetectorOnGestureListenerC1707f, new Handler(Looper.getMainLooper()));
        C1891i c1891i = new C1891i();
        super(callback);
        this.f6178b = callback;
        this.f6179c = gestureDetectorOnGestureListenerC1707f;
        this.f6181e = c2046v2;
        this.f6180d = gestureDetectorCompat;
        this.f6182f = c1891i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3883a(MotionEvent motionEvent) {
        this.f6180d.f3928a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            GestureDetectorOnGestureListenerC1707f gestureDetectorOnGestureListenerC1707f = this.f6179c;
            View viewM3880b = gestureDetectorOnGestureListenerC1707f.m3880b("onUp");
            C1706e c1706e = gestureDetectorOnGestureListenerC1707f.f6177g;
            C1903b c1903b = c1706e.f6168b;
            if (viewM3880b == null || c1903b == null) {
                return;
            }
            EnumC1705d enumC1705d = c1706e.f6167a;
            EnumC1705d enumC1705d2 = EnumC1705d.Unknown;
            if (enumC1705d == enumC1705d2) {
                gestureDetectorOnGestureListenerC1707f.f6173c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x = motionEvent.getX() - c1706e.f6169c;
            float y = motionEvent.getY() - c1706e.f6170d;
            gestureDetectorOnGestureListenerC1707f.m3879a(c1903b, c1706e.f6167a, Collections.singletonMap("direction", Math.abs(x) > Math.abs(y) ? x > 0.0f ? "right" : "left" : y > 0.0f ? "down" : "up"), motionEvent);
            gestureDetectorOnGestureListenerC1707f.m3881c(c1903b, c1706e.f6167a);
            c1706e.f6168b = null;
            c1706e.f6167a = enumC1705d2;
            c1706e.f6169c = 0.0f;
            c1706e.f6170d = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC1710i, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2046v2 c2046v2;
        if (motionEvent != null) {
            this.f6182f.getClass();
            try {
                m3883a(MotionEvent.obtain(motionEvent));
            } finally {
                if (c2046v2 != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.f6184a.dispatchTouchEvent(motionEvent);
    }
}
