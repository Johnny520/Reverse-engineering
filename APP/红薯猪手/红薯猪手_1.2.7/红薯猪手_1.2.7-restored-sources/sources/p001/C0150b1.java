package p001;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import p001.ViewOnTouchListenerC0390s7;
import p001.ViewOnTouchListenerC0390s7.f;

/* JADX INFO: renamed from: ۟.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0150b1 {

    /* JADX INFO: renamed from: ۥ */
    public int f696 = -1;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f697 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ScaleGestureDetector f1322;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public VelocityTracker f1323;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f1324;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public float f1325;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public float f1326;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final float f1327;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final float f1328;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public InterfaceC0467y6 f1329;

    /* JADX INFO: renamed from: ۟.b1$a */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            ((ViewOnTouchListenerC0390s7.a) C0150b1.this.f1329).m939(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C0150b1(Context context, InterfaceC0467y6 interfaceC0467y6) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1328 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1327 = viewConfiguration.getScaledTouchSlop();
        this.f1329 = interfaceC0467y6;
        this.f1322 = new ScaleGestureDetector(context, new a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb A[PHI: r2
  0x01fb: PHI (r2v32 android.view.VelocityTracker) = (r2v14 android.view.VelocityTracker), (r2v38 android.view.VelocityTracker) binds: [B:100:0x01f9, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m818(MotionEvent motionEvent) {
        float x;
        float y;
        VelocityTracker velocityTracker;
        float x2;
        float y2;
        int iRound;
        int i;
        int iRound2;
        int i2;
        float x3;
        float y3;
        int i3;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                this.f696 = -1;
                if (this.f1324 && this.f1323 != null) {
                    try {
                        x2 = motionEvent.getX(this.f697);
                    } catch (Exception unused) {
                        x2 = motionEvent.getX();
                    }
                    this.f1325 = x2;
                    try {
                        y2 = motionEvent.getY(this.f697);
                    } catch (Exception unused2) {
                        y2 = motionEvent.getY();
                    }
                    this.f1326 = y2;
                    this.f1323.addMovement(motionEvent);
                    this.f1323.computeCurrentVelocity(1000);
                    float xVelocity = this.f1323.getXVelocity();
                    float yVelocity = this.f1323.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f1328) {
                        ViewOnTouchListenerC0390s7.a aVar = (ViewOnTouchListenerC0390s7.a) this.f1329;
                        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = ViewOnTouchListenerC0390s7.this;
                        viewOnTouchListenerC0390s7.f1795 = viewOnTouchListenerC0390s7.new f(viewOnTouchListenerC0390s7.f1785.getContext());
                        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s72 = ViewOnTouchListenerC0390s7.this;
                        ViewOnTouchListenerC0390s7.f fVar = viewOnTouchListenerC0390s72.f1795;
                        ImageView imageView = viewOnTouchListenerC0390s72.f1785;
                        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
                        ImageView imageView2 = ViewOnTouchListenerC0390s7.this.f1785;
                        int height = (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom();
                        int i4 = (int) (-xVelocity);
                        int i5 = (int) (-yVelocity);
                        RectF rectFM1226 = ViewOnTouchListenerC0390s7.this.m1226();
                        if (rectFM1226 != null) {
                            int iRound3 = Math.round(-rectFM1226.left);
                            float f = width;
                            if (f < rectFM1226.width()) {
                                iRound = Math.round(rectFM1226.width() - f);
                                i = 0;
                            } else {
                                iRound = iRound3;
                                i = iRound;
                            }
                            int iRound4 = Math.round(-rectFM1226.top);
                            float f2 = height;
                            if (f2 < rectFM1226.height()) {
                                iRound2 = Math.round(rectFM1226.height() - f2);
                                i2 = 0;
                            } else {
                                iRound2 = iRound4;
                                i2 = iRound2;
                            }
                            fVar.f1092 = iRound3;
                            fVar.f1804 = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                fVar.f1091.fling(iRound3, iRound4, i4, i5, i, iRound, i2, iRound2, 0, 0);
                            }
                        }
                        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s73 = ViewOnTouchListenerC0390s7.this;
                        viewOnTouchListenerC0390s73.f1785.post(viewOnTouchListenerC0390s73.f1795);
                    }
                }
                velocityTracker = this.f1323;
                if (velocityTracker != null) {
                }
            } else if (action == 2) {
                try {
                    x3 = motionEvent.getX(this.f697);
                } catch (Exception unused3) {
                    x3 = motionEvent.getX();
                }
                try {
                    y3 = motionEvent.getY(this.f697);
                } catch (Exception unused4) {
                    y3 = motionEvent.getY();
                }
                float f3 = x3 - this.f1325;
                float f4 = y3 - this.f1326;
                if (!this.f1324) {
                    this.f1324 = Math.sqrt((double) ((f4 * f4) + (f3 * f3))) >= ((double) this.f1327);
                }
                if (this.f1324) {
                    ViewOnTouchListenerC0390s7.a aVar2 = (ViewOnTouchListenerC0390s7.a) this.f1329;
                    if (!ViewOnTouchListenerC0390s7.this.f1787.f1322.isInProgress()) {
                        ViewOnTouchListenerC0390s7.this.getClass();
                        ViewOnTouchListenerC0390s7.this.f1083.postTranslate(f3, f4);
                        ViewOnTouchListenerC0390s7.this.m937();
                        ViewParent parent = ViewOnTouchListenerC0390s7.this.f1785.getParent();
                        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s74 = ViewOnTouchListenerC0390s7.this;
                        if (viewOnTouchListenerC0390s74.f1783 && !viewOnTouchListenerC0390s74.f1787.f1322.isInProgress()) {
                            ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s75 = ViewOnTouchListenerC0390s7.this;
                            if (!viewOnTouchListenerC0390s75.f1784) {
                                int i6 = viewOnTouchListenerC0390s75.f1796;
                                if ((i6 == 2 || ((i6 == 0 && f3 >= 1.0f) || ((i6 == 1 && f3 <= -1.0f) || (((i3 = viewOnTouchListenerC0390s75.f1797) == 0 && f4 >= 1.0f) || (i3 == 1 && f4 <= -1.0f))))) && parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                }
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f1325 = x3;
                    this.f1326 = y3;
                    VelocityTracker velocityTracker2 = this.f1323;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f696 = -1;
                velocityTracker = this.f1323;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1323 = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f696) {
                    int i7 = action2 != 0 ? 0 : 1;
                    this.f696 = motionEvent.getPointerId(i7);
                    this.f1325 = motionEvent.getX(i7);
                    this.f1326 = motionEvent.getY(i7);
                }
            }
        } else {
            this.f696 = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f1323 = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.f697);
            } catch (Exception unused5) {
                x = motionEvent.getX();
            }
            this.f1325 = x;
            try {
                y = motionEvent.getY(this.f697);
            } catch (Exception unused6) {
                y = motionEvent.getY();
            }
            this.f1326 = y;
            this.f1324 = false;
        }
        int i8 = this.f696;
        this.f697 = motionEvent.findPointerIndex(i8 != -1 ? i8 : 0);
    }
}
