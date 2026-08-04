package yyds;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛲᛷᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0386 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final int f1969 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean f1970;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final float[] f1971;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f1972;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int f1973;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2045 f1974;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public boolean f1975;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final C2045 f1976;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f1977;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final float[] f1978;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final float[] f1979;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final float[] f1980;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final float[] f1981;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1651 f1982;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public boolean f1983;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public RunnableC0871 f1984;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final AccelerateInterpolator f1985;

    public ViewOnTouchListenerC0386(C2045 c2045) {
        C1651 c1651 = new C1651();
        c1651.f8436 = Long.MIN_VALUE;
        c1651.f8439 = -1L;
        c1651.f8441 = 0L;
        this.f1982 = c1651;
        this.f1985 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1978 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1971 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1981 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1979 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1980 = fArr5;
        this.f1974 = c2045;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1973 = f1969;
        c1651.f8437 = 500;
        c1651.f8438 = 500;
        this.f1976 = c2045;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static float m1108(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f1977) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 2;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m1112();
                return false;
            }
            this.f1975 = true;
            this.f1972 = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            C2045 c2045 = this.f1974;
            float fM1110 = m1110(0, x, width, c2045.getWidth());
            float fM11102 = m1110(1, motionEvent.getY(), view.getHeight(), c2045.getHeight());
            C1651 c1651 = this.f1982;
            c1651.f8440 = fM1110;
            c1651.f8442 = fM11102;
            if (!this.f1983 && m1109()) {
                RunnableC0871 runnableC0871 = this.f1984;
                if (runnableC0871 == null) {
                    runnableC0871 = new RunnableC0871(i2, this);
                    this.f1984 = runnableC0871;
                }
                this.f1983 = true;
                this.f1970 = true;
                if (this.f1972 || (i = this.f1973) <= 0) {
                    runnableC0871.run();
                } else {
                    long j = i;
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    c2045.postOnAnimationDelayed(runnableC0871, j);
                }
                this.f1972 = true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m1109() {
        C2045 c2045;
        int count;
        C1651 c1651 = this.f1982;
        float f = c1651.f8442;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c1651.f8440);
        if (iAbs != 0 && (count = (c2045 = this.f1976).getCount()) != 0) {
            int childCount = c2045.getChildCount();
            int firstVisiblePosition = c2045.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c2045.getChildAt(0).getTop() >= 0)) : !(i >= count && c2045.getChildAt(childCount - 1).getBottom() <= c2045.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1110(int i, float f, float f2, float f3) {
        float fM1108;
        float interpolation;
        float fM11082 = m1108(this.f1978[i] * f2, 0.0f, this.f1971[i]);
        float fM1111 = m1111(f2 - f, fM11082) - m1111(f, fM11082);
        AccelerateInterpolator accelerateInterpolator = this.f1985;
        if (fM1111 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM1111);
        } else {
            if (fM1111 <= 0.0f) {
                fM1108 = 0.0f;
                if (fM1108 != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.f1981[i];
                float f5 = this.f1979[i];
                float f6 = this.f1980[i];
                float f7 = f4 * f3;
                return fM1108 > 0.0f ? m1108(fM1108 * f7, f5, f6) : -m1108((-fM1108) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM1111);
        }
        fM1108 = m1108(interpolation, -1.0f, 1.0f);
        if (fM1108 != 0.0f) {
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float m1111(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f1983) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1112() {
        int i = 0;
        if (this.f1970) {
            this.f1983 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C1651 c1651 = this.f1982;
        int i2 = (int) (jCurrentAnimationTimeMillis - c1651.f8436);
        int i3 = c1651.f8438;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c1651.f8435 = i;
        c1651.f8434 = c1651.m3375(jCurrentAnimationTimeMillis);
        c1651.f8439 = jCurrentAnimationTimeMillis;
    }
}
