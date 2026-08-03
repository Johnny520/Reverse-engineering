package p001;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import p001.C0231gc;

/* JADX INFO: renamed from: ۟.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0476z2 extends ImageView {

    /* JADX INFO: renamed from: ۥ */
    public ViewOnTouchListenerC0390s7 f1225;

    /* JADX INFO: renamed from: ۥ۟ */
    public ImageView.ScaleType f1226;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0476z2(Context context) {
        super(context, null, 0);
        this.f1225 = new ViewOnTouchListenerC0390s7(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f1226;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f1226 = null;
        }
    }

    public ViewOnTouchListenerC0390s7 getAttacher() {
        return this.f1225;
    }

    public RectF getDisplayRect() {
        return this.f1225.m1226();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f1225.f1789;
    }

    public float getMaximumScale() {
        return this.f1225.f1782;
    }

    public float getMediumScale() {
        return this.f1225.f1781;
    }

    public float getMinimumScale() {
        return this.f1225.f1780;
    }

    public float getScale() {
        return this.f1225.m1229();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f1225.f1799;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f1225.f1783 = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f1225.m1231();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        if (viewOnTouchListenerC0390s7 != null) {
            viewOnTouchListenerC0390s7.m1231();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        if (viewOnTouchListenerC0390s7 != null) {
            viewOnTouchListenerC0390s7.m1231();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        if (viewOnTouchListenerC0390s7 != null) {
            viewOnTouchListenerC0390s7.m1231();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaximumScale(float f) {
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        C0231gc.m859(viewOnTouchListenerC0390s7.f1780, viewOnTouchListenerC0390s7.f1781, f);
        viewOnTouchListenerC0390s7.f1782 = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMediumScale(float f) {
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        C0231gc.m859(viewOnTouchListenerC0390s7.f1780, f, viewOnTouchListenerC0390s7.f1782);
        viewOnTouchListenerC0390s7.f1781 = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMinimumScale(float f) {
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        C0231gc.m859(f, viewOnTouchListenerC0390s7.f1781, viewOnTouchListenerC0390s7.f1782);
        viewOnTouchListenerC0390s7.f1780 = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1225.f1793 = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f1225.f1786.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f1225.f1794 = onLongClickListener;
    }

    public void setOnMatrixChangeListener(InterfaceC0480z6 interfaceC0480z6) {
        this.f1225.getClass();
    }

    public void setOnOutsidePhotoTapListener(InterfaceC0142a7 interfaceC0142a7) {
        this.f1225.getClass();
    }

    public void setOnPhotoTapListener(InterfaceC0156b7 interfaceC0156b7) {
        this.f1225.getClass();
    }

    public void setOnScaleChangeListener(InterfaceC0170c7 interfaceC0170c7) {
        this.f1225.getClass();
    }

    public void setOnSingleFlingListener(InterfaceC0184d7 interfaceC0184d7) {
        this.f1225.getClass();
    }

    public void setOnViewDragListener(InterfaceC0198e7 interfaceC0198e7) {
        this.f1225.getClass();
    }

    public void setOnViewTapListener(InterfaceC0212f7 interfaceC0212f7) {
        this.f1225.f1792 = interfaceC0212f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRotationBy(float f) {
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        viewOnTouchListenerC0390s7.f1083.postRotate(f % 360.0f);
        viewOnTouchListenerC0390s7.m937();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRotationTo(float f) {
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        viewOnTouchListenerC0390s7.f1083.setRotate(f % 360.0f);
        viewOnTouchListenerC0390s7.m937();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setScale(float f) {
        this.f1225.m1230(f, r0.f1785.getRight() / 2, r0.f1785.getBottom() / 2, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z;
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        if (viewOnTouchListenerC0390s7 == null) {
            this.f1226 = scaleType;
            return;
        }
        viewOnTouchListenerC0390s7.getClass();
        if (scaleType == null) {
            z = false;
        } else {
            if (C0231gc.a.f818[scaleType.ordinal()] == 1) {
                throw new IllegalStateException("Matrix scale type is not supported");
            }
            z = true;
        }
        if (!z || scaleType == viewOnTouchListenerC0390s7.f1799) {
            return;
        }
        viewOnTouchListenerC0390s7.f1799 = scaleType;
        viewOnTouchListenerC0390s7.m1231();
    }

    public void setZoomTransitionDuration(int i) {
        this.f1225.f1082 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setZoomable(boolean z) {
        ViewOnTouchListenerC0390s7 viewOnTouchListenerC0390s7 = this.f1225;
        viewOnTouchListenerC0390s7.f1798 = z;
        viewOnTouchListenerC0390s7.m1231();
    }
}
