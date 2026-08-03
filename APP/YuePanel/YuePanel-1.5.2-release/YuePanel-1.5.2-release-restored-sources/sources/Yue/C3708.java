package Yue;

import Yue.C6934;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3708 extends AbstractC7956 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final String f6579 = "android:changeTransform:parent";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final String f6581 = "android:changeTransform:intermediateParentMatrix";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final String f6582 = "android:changeTransform:intermediateMatrix";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f6587;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f6588;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Matrix f6589;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String f6577 = "android:changeTransform:matrix";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f6578 = "android:changeTransform:transforms";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final String f6580 = "android:changeTransform:parentMatrix";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String[] f6583 = {f6577, f6578, f6580};

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final Property<C3711, float[]> f6584 = new C0230(float[].class, "nonTranslations");

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final Property<C3711, PointF> f6585 = new C0231(PointF.class, "translations");

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final boolean f6586 = true;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۧ$ۥ */
    public class C0230 extends Property<C3711, float[]> {
        public C0230(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public float[] get(C3711 c3711) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(C3711 c3711, float[] fArr) {
            c3711.m10168(fArr);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۧ$ۥ۟ */
    public class C0231 extends Property<C3711, PointF> {
        public C0231(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public PointF get(C3711 c3711) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(C3711 c3711, PointF pointF) {
            c3711.m10167(pointF);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C3709 extends C7985 {

        /* JADX INFO: renamed from: ۥ */
        public View f483;

        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC5171 f484;

        public C3709(View view, InterfaceC5171 interfaceC5171) {
            this.f483 = view;
            this.f484 = interfaceC5171;
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956) {
            abstractC7956.removeListener(this);
            C5175.m1950(this.f483);
            this.f483.setTag(C6934.C1117.f20103, null);
            this.f483.setTag(C6934.C1117.f20093, null);
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f484.setVisibility(4);
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f484.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C3710 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public boolean f485;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Matrix f486 = new Matrix();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f6590;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f6591;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final View f6592;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C3712 f6593;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C3711 f6594;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Matrix f6595;

        public C3710(View view, C3712 c3712, C3711 c3711, Matrix matrix, boolean z, boolean z2) {
            this.f6590 = z;
            this.f6591 = z2;
            this.f6592 = view;
            this.f6593 = c3712;
            this.f6594 = c3711;
            this.f6595 = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f485 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f485) {
                if (this.f6590 && this.f6591) {
                    m791(this.f6595);
                } else {
                    this.f6592.setTag(C6934.C1117.f20103, null);
                    this.f6592.setTag(C6934.C1117.f20093, null);
                }
            }
            C8371.m27932(this.f6592, null);
            this.f6593.m794(this.f6592);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m791(this.f6594.m792());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            C3708.m10157(this.f6592);
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m791(Matrix matrix) {
            this.f486.set(matrix);
            this.f6592.setTag(C6934.C1117.f20103, this.f486);
            this.f6593.m794(this.f6592);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C3711 {

        /* JADX INFO: renamed from: ۥ */
        public final Matrix f487 = new Matrix();

        /* JADX INFO: renamed from: ۥ۟ */
        public final View f488;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final float[] f6596;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f6597;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f6598;

        public C3711(View view, float[] fArr) {
            this.f488 = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f6596 = fArr2;
            this.f6597 = fArr2[2];
            this.f6598 = fArr2[5];
            m793();
        }

        /* JADX INFO: renamed from: ۥ */
        public Matrix m792() {
            return this.f487;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m793() {
            float[] fArr = this.f6596;
            fArr[2] = this.f6597;
            fArr[5] = this.f6598;
            this.f487.setValues(fArr);
            C8371.m27932(this.f488, this.f487);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m10167(PointF pointF) {
            this.f6597 = pointF.x;
            this.f6598 = pointF.y;
            m793();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m10168(float[] fArr) {
            System.arraycopy(fArr, 0, this.f6596, 0, fArr.length);
            m793();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C3712 {

        /* JADX INFO: renamed from: ۥ */
        public final float f489;

        /* JADX INFO: renamed from: ۥ۟ */
        public final float f490;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final float f6599;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final float f6600;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final float f6601;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final float f6602;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final float f6603;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final float f6604;

        public C3712(View view) {
            this.f489 = view.getTranslationX();
            this.f490 = view.getTranslationY();
            this.f6599 = C8273.m27383(view);
            this.f6600 = view.getScaleX();
            this.f6601 = view.getScaleY();
            this.f6602 = view.getRotationX();
            this.f6603 = view.getRotationY();
            this.f6604 = view.getRotation();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3712)) {
                return false;
            }
            C3712 c3712 = (C3712) obj;
            return c3712.f489 == this.f489 && c3712.f490 == this.f490 && c3712.f6599 == this.f6599 && c3712.f6600 == this.f6600 && c3712.f6601 == this.f6601 && c3712.f6602 == this.f6602 && c3712.f6603 == this.f6603 && c3712.f6604 == this.f6604;
        }

        public int hashCode() {
            float f = this.f489;
            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f490;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f6599;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f6600;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f6601;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f6602;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f6603;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f6604;
            return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m794(View view) {
            C3708.m10158(view, this.f489, this.f490, this.f6599, this.f6600, this.f6601, this.f6602, this.f6603, this.f6604);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3708() {
        this.f6587 = true;
        this.f6588 = true;
        this.f6589 = new Matrix();
    }

    private void captureValues(C7995 c7995) {
        View view = c7995.f3178;
        if (view.getVisibility() == 8) {
            return;
        }
        c7995.f3177.put(f6579, view.getParent());
        c7995.f3177.put(f6578, new C3712(view));
        Matrix matrix = view.getMatrix();
        c7995.f3177.put(f6577, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f6588) {
            Matrix matrix2 = new Matrix();
            C8371.m27936((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            c7995.f3177.put(f6580, matrix2);
            c7995.f3177.put(f6582, view.getTag(C6934.C1117.f20103));
            c7995.f3177.put(f6581, view.getTag(C6934.C1117.f20093));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m10157(View view) {
        m10158(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static void m10158(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C8273.m27490(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        captureValues(c7995);
        if (f6586) {
            return;
        }
        ((ViewGroup) c7995.f3178.getParent()).startViewTransition(c7995.f3178);
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c7995 == null || c79952 == null || !c7995.f3177.containsKey(f6579) || !c79952.f3177.containsKey(f6579)) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) c7995.f3177.get(f6579);
        boolean z = this.f6588 && !m10163(viewGroup2, (ViewGroup) c79952.f3177.get(f6579));
        Matrix matrix = (Matrix) c7995.f3177.get(f6582);
        if (matrix != null) {
            c7995.f3177.put(f6577, matrix);
        }
        Matrix matrix2 = (Matrix) c7995.f3177.get(f6581);
        if (matrix2 != null) {
            c7995.f3177.put(f6580, matrix2);
        }
        if (z) {
            m10164(c7995, c79952);
        }
        ObjectAnimator objectAnimatorM10160 = m10160(c7995, c79952, z);
        if (z && objectAnimatorM10160 != null && this.f6587) {
            m10159(viewGroup, c7995, c79952);
        } else if (!f6586) {
            viewGroup2.endViewTransition(c7995.f3178);
        }
        return objectAnimatorM10160;
    }

    @Override // Yue.AbstractC7956
    @InterfaceC6391
    public String[] getTransitionProperties() {
        return f6583;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m10159(ViewGroup viewGroup, C7995 c7995, C7995 c79952) {
        View view = c79952.f3178;
        Matrix matrix = new Matrix((Matrix) c79952.f3177.get(f6580));
        C8371.m27937(viewGroup, matrix);
        InterfaceC5171 interfaceC5171M1949 = C5175.m1949(view, viewGroup, matrix);
        if (interfaceC5171M1949 == null) {
            return;
        }
        interfaceC5171M1949.mo1943((ViewGroup) c7995.f3177.get(f6579), c7995.f3178);
        AbstractC7956 abstractC7956 = this;
        while (true) {
            C7991 c7991 = abstractC7956.mParent;
            if (c7991 == null) {
                break;
            } else {
                abstractC7956 = c7991;
            }
        }
        abstractC7956.addListener(new C3709(view, interfaceC5171M1949));
        if (f6586) {
            View view2 = c7995.f3178;
            if (view2 != c79952.f3178) {
                C8371.m27934(view2, 0.0f);
            }
            C8371.m27934(view, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final ObjectAnimator m10160(C7995 c7995, C7995 c79952, boolean z) {
        Matrix matrix = (Matrix) c7995.f3177.get(f6577);
        Matrix matrix2 = (Matrix) c79952.f3177.get(f6577);
        if (matrix == null) {
            matrix = C6134.f1844;
        }
        if (matrix2 == null) {
            matrix2 = C6134.f1844;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C3712 c3712 = (C3712) c79952.f3177.get(f6578);
        View view = c79952.f3178;
        m10157(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C3711 c3711 = new C3711(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c3711, PropertyValuesHolder.ofObject(f6584, new C4881(new float[9]), fArr, fArr2), C6834.m3284(f6585, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C3710 c3710 = new C3710(view, c3712, c3711, matrix3, z, this.f6587);
        objectAnimatorOfPropertyValuesHolder.addListener(c3710);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(c3710);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m10161() {
        return this.f6588;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m10162() {
        return this.f6587;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10163(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z = true;
        if (isValidTarget(viewGroup) && isValidTarget(viewGroup2)) {
            C7995 matchedTransitionValues = getMatchedTransitionValues(viewGroup, true);
            if (matchedTransitionValues == null) {
                return false;
            }
            if (viewGroup2 != matchedTransitionValues.f3178) {
            }
        } else if (viewGroup != viewGroup2) {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m10164(C7995 c7995, C7995 c79952) {
        Matrix matrix = (Matrix) c79952.f3177.get(f6580);
        c79952.f3178.setTag(C6934.C1117.f20093, matrix);
        Matrix matrix2 = this.f6589;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) c7995.f3177.get(f6577);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            c7995.f3177.put(f6577, matrix3);
        }
        matrix3.postConcat((Matrix) c7995.f3177.get(f6580));
        matrix3.postConcat(matrix2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m10165(boolean z) {
        this.f6588 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m10166(boolean z) {
        this.f6587 = z;
    }

    public C3708(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6587 = true;
        this.f6588 = true;
        this.f6589 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23046);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f6587 = C8021.m25316(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f6588 = C8021.m25316(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
