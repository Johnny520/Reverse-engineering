package Yue;

import Yue.AbstractC7956;
import Yue.C6934;
import Yue.C7994;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3703 extends AbstractC7956 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f6567 = "android:changeImageTransform:matrix";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f6568 = "android:changeImageTransform:bounds";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String[] f6569 = {f6567, f6568};

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final TypeEvaluator<Matrix> f6570 = new C0228();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Property<ImageView, Matrix> f6571 = new C0229(Matrix.class, "animatedTransform");

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ */
    public class C0228 implements TypeEvaluator<Matrix> {
        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ۟ */
    public class C0229 extends Property<ImageView, Matrix> {
        public C0229(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(ImageView imageView, Matrix matrix) {
            C5422.m2194(imageView, matrix);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ class C3704 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f480;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f480 = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f480[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C3705 extends AnimatorListenerAdapter implements AbstractC7956.InterfaceC7964 {

        /* JADX INFO: renamed from: ۥ */
        public final ImageView f481;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Matrix f482;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Matrix f6572;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f6573 = true;

        public C3705(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f481 = imageView;
            this.f482 = matrix;
            this.f6572 = matrix2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@InterfaceC6391 Animator animator, boolean z) {
            this.f6573 = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m786((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            m785();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@InterfaceC6391 Animator animator, boolean z) {
            this.f6573 = false;
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            if (this.f6573) {
                m786(this.f482);
            }
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            m785();
        }

        @Override // Yue.AbstractC7956.InterfaceC7964
        public void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956) {
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m785() {
            Matrix matrix = (Matrix) this.f481.getTag(C6934.C1117.f20098);
            if (matrix != null) {
                C5422.m2194(this.f481, matrix);
                this.f481.setTag(C6934.C1117.f20098, null);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m786(Matrix matrix) {
            this.f481.setTag(C6934.C1117.f20098, matrix);
            C5422.m2194(this.f481, this.f6572);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6573 = false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f6573 = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3703() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    private void m10150(C7995 c7995, boolean z) {
        View view = c7995.f3178;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = c7995.f3177;
            map.put(f6568, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixM10152 = z ? (Matrix) imageView.getTag(C6934.C1117.f20098) : null;
            if (matrixM10152 == null) {
                matrixM10152 = m10152(imageView);
            }
            map.put(f6567, matrixM10152);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static Matrix m10151(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float fMax = Math.max(width / f, height / f2);
        int iRound = Math.round((width - (f * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static Matrix m10152(@InterfaceC6391 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i = C3704.f480[imageView.getScaleType().ordinal()];
        return i != 1 ? i != 2 ? new Matrix(imageView.getImageMatrix()) : m10151(imageView) : m10153(imageView);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static Matrix m10153(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        m10150(c7995, false);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        m10150(c7995, true);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c7995 != null && c79952 != null) {
            Rect rect = (Rect) c7995.f3177.get(f6568);
            Rect rect2 = (Rect) c79952.f3177.get(f6568);
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) c7995.f3177.get(f6567);
                Matrix matrix2 = (Matrix) c79952.f3177.get(f6567);
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) c79952.f3178;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    return m10155(imageView);
                }
                if (matrix == null) {
                    matrix = C6134.f1844;
                }
                if (matrix2 == null) {
                    matrix2 = C6134.f1844;
                }
                f6571.set(imageView, matrix);
                ObjectAnimator objectAnimatorM10154 = m10154(imageView, matrix, matrix2);
                C3705 c3705 = new C3705(imageView, matrix, matrix2);
                objectAnimatorM10154.addListener(c3705);
                objectAnimatorM10154.addPauseListener(c3705);
                addListener(c3705);
                return objectAnimatorM10154;
            }
        }
        return null;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public String[] getTransitionProperties() {
        return f6569;
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final ObjectAnimator m10154(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f6571, (TypeEvaluator) new C7994.C1400(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final ObjectAnimator m10155(@InterfaceC6391 ImageView imageView) {
        Property<ImageView, Matrix> property = f6571;
        TypeEvaluator<Matrix> typeEvaluator = f6570;
        Matrix matrix = C6134.f1844;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3703(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
