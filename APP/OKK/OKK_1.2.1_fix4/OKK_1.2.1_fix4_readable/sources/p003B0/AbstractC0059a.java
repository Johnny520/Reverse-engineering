package p003B0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.luckypray.dexkit.C1031R;
import p053e.C0763a;

/* JADX INFO: renamed from: B0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059a {

    /* JADX INFO: renamed from: a */
    public static final int[] f203a = {R.attr.theme, C1031R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f204b = {C1031R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m197a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f204b, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0763a) && ((C0763a) context).f2676a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0763a c0763a = new C0763a(context);
        c0763a.f2676a = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f203a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0763a.getTheme().applyStyle(resourceId2, true);
        }
        return c0763a;
    }
}
