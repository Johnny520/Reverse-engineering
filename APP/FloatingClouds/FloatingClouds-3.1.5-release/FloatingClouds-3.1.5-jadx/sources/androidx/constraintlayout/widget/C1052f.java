package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1052f extends ViewGroup {

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.f$a */
    public static class a extends ConstraintLayout.C1044a {

        /* JADX INFO: renamed from: m0 */
        public float f4360m0;

        /* JADX INFO: renamed from: n0 */
        public boolean f4361n0;

        /* JADX INFO: renamed from: o0 */
        public float f4362o0;

        /* JADX INFO: renamed from: p0 */
        public float f4363p0;

        /* JADX INFO: renamed from: q0 */
        public float f4364q0;

        /* JADX INFO: renamed from: r0 */
        public float f4365r0;

        /* JADX INFO: renamed from: s0 */
        public float f4366s0;

        /* JADX INFO: renamed from: t0 */
        public float f4367t0;

        /* JADX INFO: renamed from: u0 */
        public float f4368u0;

        /* JADX INFO: renamed from: v0 */
        public float f4369v0;

        /* JADX INFO: renamed from: w0 */
        public float f4370w0;

        /* JADX INFO: renamed from: x0 */
        public float f4371x0;

        /* JADX INFO: renamed from: y0 */
        public float f4372y0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a();
        aVar.f4360m0 = 1.0f;
        aVar.f4361n0 = false;
        aVar.f4362o0 = 0.0f;
        aVar.f4363p0 = 0.0f;
        aVar.f4364q0 = 0.0f;
        aVar.f4365r0 = 0.0f;
        aVar.f4366s0 = 1.0f;
        aVar.f4367t0 = 1.0f;
        aVar.f4368u0 = 0.0f;
        aVar.f4369v0 = 0.0f;
        aVar.f4370w0 = 0.0f;
        aVar.f4371x0 = 0.0f;
        aVar.f4372y0 = 0.0f;
        return aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f4360m0 = 1.0f;
        aVar.f4361n0 = false;
        aVar.f4362o0 = 0.0f;
        aVar.f4363p0 = 0.0f;
        aVar.f4364q0 = 0.0f;
        aVar.f4365r0 = 0.0f;
        aVar.f4366s0 = 1.0f;
        aVar.f4367t0 = 1.0f;
        aVar.f4368u0 = 0.0f;
        aVar.f4369v0 = 0.0f;
        aVar.f4370w0 = 0.0f;
        aVar.f4371x0 = 0.0f;
        aVar.f4372y0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1046R.styleable.ConstraintSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C1046R.styleable.ConstraintSet_android_alpha) {
                aVar.f4360m0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4360m0);
            } else if (index == C1046R.styleable.ConstraintSet_android_elevation) {
                aVar.f4362o0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4362o0);
                aVar.f4361n0 = true;
            } else if (index == C1046R.styleable.ConstraintSet_android_rotationX) {
                aVar.f4364q0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4364q0);
            } else if (index == C1046R.styleable.ConstraintSet_android_rotationY) {
                aVar.f4365r0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4365r0);
            } else if (index == C1046R.styleable.ConstraintSet_android_rotation) {
                aVar.f4363p0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4363p0);
            } else if (index == C1046R.styleable.ConstraintSet_android_scaleX) {
                aVar.f4366s0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4366s0);
            } else if (index == C1046R.styleable.ConstraintSet_android_scaleY) {
                aVar.f4367t0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4367t0);
            } else if (index == C1046R.styleable.ConstraintSet_android_transformPivotX) {
                aVar.f4368u0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4368u0);
            } else if (index == C1046R.styleable.ConstraintSet_android_transformPivotY) {
                aVar.f4369v0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4369v0);
            } else if (index == C1046R.styleable.ConstraintSet_android_translationX) {
                aVar.f4370w0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4370w0);
            } else if (index == C1046R.styleable.ConstraintSet_android_translationY) {
                aVar.f4371x0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4371x0);
            } else if (index == C1046R.styleable.ConstraintSet_android_translationZ) {
                aVar.f4372y0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f4372y0);
            }
        }
        return aVar;
    }

    public C1051e getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C1044a(layoutParams);
    }
}
