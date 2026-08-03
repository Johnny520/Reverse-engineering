package Yue;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C5157 {

    /* JADX INFO: renamed from: ۥ */
    public final GestureDetector f1310;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5157(@InterfaceC6391 Context context, @InterfaceC6391 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m1937() {
        return this.f1310.isLongpressEnabled();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m1938(@InterfaceC6391 MotionEvent motionEvent) {
        return this.f1310.onTouchEvent(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m15824(boolean z) {
        this.f1310.setIsLongpressEnabled(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m15825(@InterfaceC6490 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f1310.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5157(@InterfaceC6391 Context context, @InterfaceC6391 GestureDetector.OnGestureListener onGestureListener, @InterfaceC6490 Handler handler) {
        this.f1310 = new GestureDetector(context, onGestureListener, handler);
    }
}
