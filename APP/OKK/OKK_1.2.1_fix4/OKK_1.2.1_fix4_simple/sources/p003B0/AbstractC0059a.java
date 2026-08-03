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
    public static final int[] f203a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f204b = null;

    static {
        f203a = new int[]{R.attr.theme, C1031R.attr.theme};
        f204b = new int[]{C1031R.attr.materialThemeOverlay};
    }

    /* JADX INFO: renamed from: a */
    public static Context m197a(Context r2, AttributeSet r3, int r4, int r5) {
        TypedArray r42 = r2.obtainStyledAttributes(r3, f204b, r4, r5);
        int r02 = r42.getResourceId(0, 0);
        r42.recycle();
        if ((r2 instanceof C0763a) == true) goto L5;
    L7:
        boolean r43 = false;
    L8:
        if (r02 == 0) goto L18;
        if (r43 == true) goto L18;
        C0763a r44 = new C0763a(r2);
        r44.f2676a = r02;
        TypedArray r22 = r2.obtainStyledAttributes(r3, f203a);
        int r32 = r22.getResourceId(0, 0);
        int r52 = r22.getResourceId(1, 0);
        r22.recycle();
        if (r32 != 0) goto L15;
        r32 = r52;
    L15:
        if (r32 == 0) goto L17;
        r44.getTheme().applyStyle(r32, true);
    L17:
        return r44;
    L18:
        return r2;
    L5:
        if (((C0763a) r2).f2676a != r02) goto L7;
        r43 = true;
        goto L8
    }
}
