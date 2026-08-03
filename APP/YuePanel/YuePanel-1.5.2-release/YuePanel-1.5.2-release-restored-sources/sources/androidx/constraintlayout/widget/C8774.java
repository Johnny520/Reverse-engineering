package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8774 extends ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f26928 = "Constraints";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8770 f26929;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8774(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C8770 getConstraintSet() {
        if (this.f26929 == null) {
            this.f26929 = new C8770();
        }
        this.f26929.m29374(this);
        return this.f26929;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public C1648 generateDefaultLayoutParams() {
        return new C1648(-2, -2);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public C1648 generateLayoutParams(AttributeSet attributeSet) {
        return new C1648(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29479(AttributeSet attributeSet) {
        Log.v(f26928, " ################# init");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C1641(layoutParams);
    }

    public C8774(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29479(attributeSet);
        super.setVisibility(8);
    }

    public C8774(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29479(attributeSet);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۡ$ۥ */
    public static class C1648 extends ConstraintLayout.C1641 {

        /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
        public float f26930;

        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public boolean f26931;

        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public float f26932;

        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public float f26933;

        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public float f26934;

        /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
        public float f26935;

        /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
        public float f26936;

        /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
        public float f26937;

        /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
        public float f26938;

        /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
        public float f26939;

        /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
        public float f26940;

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public float f26941;

        /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
        public float f26942;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1648(int i, int i2) {
            super(i, i2);
            this.f26930 = 1.0f;
            this.f26931 = false;
            this.f26932 = 0.0f;
            this.f26933 = 0.0f;
            this.f26934 = 0.0f;
            this.f26935 = 0.0f;
            this.f26936 = 1.0f;
            this.f26937 = 1.0f;
            this.f26938 = 0.0f;
            this.f26939 = 0.0f;
            this.f26940 = 0.0f;
            this.f26941 = 0.0f;
            this.f26942 = 0.0f;
        }

        public C1648(C1648 c1648) {
            super((ConstraintLayout.C1641) c1648);
            this.f26930 = 1.0f;
            this.f26931 = false;
            this.f26932 = 0.0f;
            this.f26933 = 0.0f;
            this.f26934 = 0.0f;
            this.f26935 = 0.0f;
            this.f26936 = 1.0f;
            this.f26937 = 1.0f;
            this.f26938 = 0.0f;
            this.f26939 = 0.0f;
            this.f26940 = 0.0f;
            this.f26941 = 0.0f;
            this.f26942 = 0.0f;
        }

        public C1648(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26930 = 1.0f;
            this.f26931 = false;
            this.f26932 = 0.0f;
            this.f26933 = 0.0f;
            this.f26934 = 0.0f;
            this.f26935 = 0.0f;
            this.f26936 = 1.0f;
            this.f26937 = 1.0f;
            this.f26938 = 0.0f;
            this.f26939 = 0.0f;
            this.f26940 = 0.0f;
            this.f26941 = 0.0f;
            this.f26942 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f28810);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28826) {
                    this.f26930 = typedArrayObtainStyledAttributes.getFloat(index, this.f26930);
                } else if (index == C8778.C8789.f28839) {
                    this.f26932 = typedArrayObtainStyledAttributes.getFloat(index, this.f26932);
                    this.f26931 = true;
                } else if (index == C8778.C8789.f28834) {
                    this.f26934 = typedArrayObtainStyledAttributes.getFloat(index, this.f26934);
                } else if (index == C8778.C8789.f28835) {
                    this.f26935 = typedArrayObtainStyledAttributes.getFloat(index, this.f26935);
                } else if (index == C8778.C8789.f28833) {
                    this.f26933 = typedArrayObtainStyledAttributes.getFloat(index, this.f26933);
                } else if (index == C8778.C8789.f28831) {
                    this.f26936 = typedArrayObtainStyledAttributes.getFloat(index, this.f26936);
                } else if (index == C8778.C8789.f28832) {
                    this.f26937 = typedArrayObtainStyledAttributes.getFloat(index, this.f26937);
                } else if (index == C8778.C8789.f28827) {
                    this.f26938 = typedArrayObtainStyledAttributes.getFloat(index, this.f26938);
                } else if (index == C8778.C8789.f28828) {
                    this.f26939 = typedArrayObtainStyledAttributes.getFloat(index, this.f26939);
                } else if (index == C8778.C8789.f28829) {
                    this.f26940 = typedArrayObtainStyledAttributes.getFloat(index, this.f26940);
                } else if (index == C8778.C8789.f28830) {
                    this.f26941 = typedArrayObtainStyledAttributes.getFloat(index, this.f26941);
                } else if (index == C8778.C8789.f28838) {
                    this.f26942 = typedArrayObtainStyledAttributes.getFloat(index, this.f26942);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
