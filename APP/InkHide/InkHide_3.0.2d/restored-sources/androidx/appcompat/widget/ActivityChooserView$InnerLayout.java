package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p052b1.AbstractC0503h;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public static final int[] f1012b = {R.attr.background};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1012b);
        setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0503h.m992y(context, resourceId));
        typedArrayObtainStyledAttributes.recycle();
    }
}
