package yyds;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;

/* JADX INFO: renamed from: yyds.ᛲᛲᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0284 f1529;

    static {
        AbstractC2328.m4341(-211943324025710L);
        AbstractC2328.m4341(-212067878077294L);
        f1529 = new C0284();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static float m933(int i) {
        return ((Color.blue(i) / 255.0f) * 0.114f) + ((Color.green(i) / 255.0f) * 0.587f) + ((Color.red(i) / 255.0f) * 0.299f);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static int m934(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m935(Context context, int i, int i2) {
        Object c2658;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                try {
                    c2658 = Integer.valueOf(context.getColor(i3));
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Object objValueOf = Integer.valueOf(i2);
                if (c2658 instanceof C2658) {
                    c2658 = objValueOf;
                }
                return ((Number) c2658).intValue();
            }
            int i4 = typedValue.data;
            Integer numValueOf = Integer.valueOf(i4);
            if (i4 == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return i2;
    }
}
