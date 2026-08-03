package p001;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import p001.AlertDialogC0403t7;

/* JADX INFO: renamed from: ۟.s7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0390s7 implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public ImageView f1785;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public GestureDetector f1786;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public C0150b1 f1787;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public InterfaceC0212f7 f1792;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public View.OnClickListener f1793;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public View.OnLongClickListener f1794;

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public f f1795;

    /* JADX INFO: renamed from: ۥ */
    public AccelerateDecelerateInterpolator f1081 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1082 = 200;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f1780 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public float f1781 = 1.75f;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public float f1782 = 3.0f;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public boolean f1783 = true;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f1784 = false;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final Matrix f1788 = new Matrix();

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final Matrix f1789 = new Matrix();

    /* JADX INFO: renamed from: ۥ۠ */
    public final Matrix f1083 = new Matrix();

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final RectF f1790 = new RectF();

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public final float[] f1791 = new float[9];

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public int f1796 = 2;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public int f1797 = 2;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public boolean f1798 = true;

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public ImageView.ScaleType f1799 = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: ۥۡ */
    public a f1084 = new a();

    /* JADX INFO: renamed from: ۟.s7$a */
    public class a implements InterfaceC0467y6 {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ */
        public final void m939(float f, float f2, float f3) {
            float fM1229 = ViewOnTouchListenerC0390s7.this.m1229();
            ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = ViewOnTouchListenerC0390s7.this;
            if (fM1229 < viewOnTouchListenerC0390s7.f1782 || f < 1.0f) {
                viewOnTouchListenerC0390s7.getClass();
                ViewOnTouchListenerC0390s7.this.f1083.postScale(f, f, f2, f3);
                ViewOnTouchListenerC0390s7.this.m937();
            }
        }
    }

    /* JADX INFO: renamed from: ۟.s7$b */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            ViewOnTouchListenerC0390s7.this.getClass();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = ViewOnTouchListenerC0390s7.this;
            View.OnLongClickListener onLongClickListener = viewOnTouchListenerC0390s7.f1794;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(viewOnTouchListenerC0390s7.f1785);
            }
        }
    }

    /* JADX INFO: renamed from: ۟.s7$c */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fM1229 = ViewOnTouchListenerC0390s7.this.m1229();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = ViewOnTouchListenerC0390s7.this;
                float f = viewOnTouchListenerC0390s7.f1781;
                if (fM1229 >= f) {
                    if (fM1229 >= f) {
                        f = viewOnTouchListenerC0390s7.f1782;
                        if (fM1229 < f) {
                            viewOnTouchListenerC0390s7.m1230(f, x, y, true);
                        }
                    }
                    viewOnTouchListenerC0390s7.m1230(viewOnTouchListenerC0390s7.f1780, x, y, true);
                } else {
                    viewOnTouchListenerC0390s7.m1230(f, x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = ViewOnTouchListenerC0390s7.this;
            View.OnClickListener onClickListener = viewOnTouchListenerC0390s7.f1793;
            if (onClickListener != null) {
                onClickListener.onClick(viewOnTouchListenerC0390s7.f1785);
            }
            RectF rectFM1226 = ViewOnTouchListenerC0390s7.this.m1226();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s72 = ViewOnTouchListenerC0390s7.this;
            InterfaceC0212f7 interfaceC0212f7 = viewOnTouchListenerC0390s72.f1792;
            if (interfaceC0212f7 != null) {
                ImageView imageView = viewOnTouchListenerC0390s72.f1785;
                AlertDialogC0403t7.a aVar = (AlertDialogC0403t7.a) ((C0434w) interfaceC0212f7).f1164;
                C0237h4.m1090("this$0", aVar);
                aVar.f1112.onClick(imageView);
            }
            if (rectFM1226 == null) {
                return false;
            }
            if (!rectFM1226.contains(x, y)) {
                ViewOnTouchListenerC0390s7.this.getClass();
                return false;
            }
            rectFM1226.width();
            rectFM1226.height();
            ViewOnTouchListenerC0390s7.this.getClass();
            return true;
        }
    }

    /* JADX INFO: renamed from: ۟.s7$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1088;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f1088 = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1088[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1088[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1088[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: ۟.s7$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: ۥ */
        public final float f1089;

        /* JADX INFO: renamed from: ۥ۟ */
        public final float f1090;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f1800 = System.currentTimeMillis();

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final float f1801;

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public final float f1802;

        public e(float f, float f2, float f3, float f4) {
            this.f1089 = f3;
            this.f1090 = f4;
            this.f1801 = f;
            this.f1802 = f2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            float interpolation = ViewOnTouchListenerC0390s7.this.f1081.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f1800) * 1.0f) / ViewOnTouchListenerC0390s7.this.f1082));
            float f = this.f1801;
            ViewOnTouchListenerC0390s7.this.f1084.m939((((this.f1802 - f) * interpolation) + f) / ViewOnTouchListenerC0390s7.this.m1229(), this.f1089, this.f1090);
            if (interpolation < 1.0f) {
                ViewOnTouchListenerC0390s7.this.f1785.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: ۟.s7$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: ۥ */
        public final OverScroller f1091;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1092;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f1804;

        public f(Context context) {
            this.f1091 = new OverScroller(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f1091.isFinished() && this.f1091.computeScrollOffset()) {
                int currX = this.f1091.getCurrX();
                int currY = this.f1091.getCurrY();
                ViewOnTouchListenerC0390s7.this.f1083.postTranslate(this.f1092 - currX, this.f1804 - currY);
                ViewOnTouchListenerC0390s7.this.m937();
                this.f1092 = currX;
                this.f1804 = currY;
                ViewOnTouchListenerC0390s7.this.f1785.postOnAnimation(this);
            }
        }
    }

    public ViewOnTouchListenerC0390s7(ImageView imageView) {
        this.f1785 = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f1787 = new C0150b1(imageView.getContext(), this.f1084);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f1786 = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        m1232(this.f1785.getDrawable());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C0150b1 c0150b1;
        boolean z2;
        GestureDetector gestureDetector;
        RectF rectFM1226;
        e eVar;
        boolean z3 = false;
        if (!this.f1798) {
            return false;
        }
        if (!(((ImageView) view).getDrawable() != null)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (m1229() < this.f1780) {
                    RectF rectFM12262 = m1226();
                    if (rectFM12262 != null) {
                        eVar = new e(m1229(), this.f1780, rectFM12262.centerX(), rectFM12262.centerY());
                        view.post(eVar);
                        z = true;
                    }
                } else if (m1229() > this.f1782 && (rectFM1226 = m1226()) != null) {
                    eVar = new e(m1229(), this.f1782, rectFM1226.centerX(), rectFM1226.centerY());
                    view.post(eVar);
                    z = true;
                }
            }
            c0150b1 = this.f1787;
            if (c0150b1 == null) {
                boolean zIsInProgress = c0150b1.f1322.isInProgress();
                C0150b1 c0150b12 = this.f1787;
                boolean z4 = c0150b12.f1324;
                try {
                    c0150b12.f1322.onTouchEvent(motionEvent);
                    c0150b12.m818(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                boolean z5 = (zIsInProgress || this.f1787.f1322.isInProgress()) ? false : true;
                boolean z6 = (z4 || this.f1787.f1324) ? false : true;
                if (z5 && z6) {
                    z3 = true;
                }
                this.f1784 = z3;
                z2 = true;
            } else {
                z2 = z;
            }
            gestureDetector = this.f1786;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        f fVar = this.f1795;
        if (fVar != null) {
            fVar.f1091.forceFinished(true);
            this.f1795 = null;
        }
        z = false;
        c0150b1 = this.f1787;
        if (c0150b1 == null) {
        }
        gestureDetector = this.f1786;
        return gestureDetector == null ? z2 : z2;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m937() {
        if (m938()) {
            this.f1785.setImageMatrix(m1228());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m938() {
        float f2;
        RectF rectFM1227 = m1227(m1228());
        if (rectFM1227 == null) {
            return false;
        }
        float fHeight = rectFM1227.height();
        float fWidth = rectFM1227.width();
        ImageView imageView = this.f1785;
        float height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        float f3 = 0.0f;
        if (fHeight <= height) {
            int i = d.f1088[this.f1799.ordinal()];
            if (i != 2) {
                float f4 = height - fHeight;
                if (i != 3) {
                    f4 /= 2.0f;
                }
                f2 = f4 - rectFM1227.top;
            } else {
                f2 = -rectFM1227.top;
            }
            this.f1797 = 2;
        } else {
            float f5 = rectFM1227.top;
            if (f5 > 0.0f) {
                this.f1797 = 0;
                f2 = -f5;
            } else {
                float f6 = rectFM1227.bottom;
                if (f6 < height) {
                    this.f1797 = 1;
                    f2 = height - f6;
                } else {
                    this.f1797 = -1;
                    f2 = 0.0f;
                }
            }
        }
        ImageView imageView2 = this.f1785;
        float width = (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight();
        if (fWidth <= width) {
            int i2 = d.f1088[this.f1799.ordinal()];
            if (i2 != 2) {
                float f7 = width - fWidth;
                if (i2 != 3) {
                    f7 /= 2.0f;
                }
                f3 = f7 - rectFM1227.left;
            } else {
                f3 = -rectFM1227.left;
            }
            this.f1796 = 2;
        } else {
            float f8 = rectFM1227.left;
            if (f8 > 0.0f) {
                this.f1796 = 0;
                f3 = -f8;
            } else {
                float f9 = rectFM1227.right;
                if (f9 < width) {
                    f3 = width - f9;
                    this.f1796 = 1;
                } else {
                    this.f1796 = -1;
                }
            }
        }
        this.f1083.postTranslate(f3, f2);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final RectF m1226() {
        m938();
        return m1227(m1228());
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final RectF m1227(Matrix matrix) {
        if (this.f1785.getDrawable() == null) {
            return null;
        }
        this.f1790.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f1790);
        return this.f1790;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final Matrix m1228() {
        this.f1789.set(this.f1788);
        this.f1789.postConcat(this.f1083);
        return this.f1789;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final float m1229() {
        this.f1083.getValues(this.f1791);
        float fPow = (float) Math.pow(this.f1791[0], 2.0d);
        this.f1083.getValues(this.f1791);
        return (float) Math.sqrt(fPow + ((float) Math.pow(this.f1791[3], 2.0d)));
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m1230(float f2, float f3, float f4, boolean z) {
        if (f2 < this.f1780 || f2 > this.f1782) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f1785.post(new e(m1229(), f2, f3, f4));
        } else {
            this.f1083.setScale(f2, f2, f3, f4);
            m937();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m1231() {
        if (this.f1798) {
            m1232(this.f1785.getDrawable());
            return;
        }
        this.f1083.reset();
        this.f1083.postRotate(0.0f);
        m937();
        this.f1785.setImageMatrix(m1228());
        m938();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final void m1232(Drawable drawable) {
        Matrix matrix;
        Matrix.ScaleToFit scaleToFit;
        float fMin;
        if (drawable == null) {
            return;
        }
        ImageView imageView = this.f1785;
        float width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        ImageView imageView2 = this.f1785;
        float height = (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f1788.reset();
        float f2 = intrinsicWidth;
        float f3 = width / f2;
        float f4 = intrinsicHeight;
        float f5 = height / f4;
        ImageView.ScaleType scaleType = this.f1799;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f1788.postTranslate((width - f2) / 2.0f, (height - f4) / 2.0f);
        } else {
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                fMin = Math.max(f3, f5);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                fMin = Math.min(1.0f, Math.min(f3, f5));
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
                RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
                if (((int) 0.0f) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f4, f2);
                }
                int i = d.f1088[this.f1799.ordinal()];
                if (i == 1) {
                    matrix = this.f1788;
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                } else if (i == 2) {
                    matrix = this.f1788;
                    scaleToFit = Matrix.ScaleToFit.START;
                } else if (i == 3) {
                    matrix = this.f1788;
                    scaleToFit = Matrix.ScaleToFit.END;
                } else if (i == 4) {
                    matrix = this.f1788;
                    scaleToFit = Matrix.ScaleToFit.FILL;
                }
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
            }
            this.f1788.postScale(fMin, fMin);
            this.f1788.postTranslate((width - (f2 * fMin)) / 2.0f, (height - (f4 * fMin)) / 2.0f);
        }
        this.f1083.reset();
        this.f1083.postRotate(0.0f);
        m937();
        this.f1785.setImageMatrix(m1228());
        m938();
    }
}
