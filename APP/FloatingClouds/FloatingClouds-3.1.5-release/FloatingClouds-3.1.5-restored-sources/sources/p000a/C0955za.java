package p000a;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: a.za */
/* JADX INFO: loaded from: classes.dex */
public final class C0955za {
    /* JADX INFO: renamed from: a */
    public static TypedValue m2244a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2245b(Context context, int i, boolean z) {
        TypedValue typedValueM2244a = m2244a(context, i);
        return (typedValueM2244a == null || typedValueM2244a.type != 18) ? z : typedValueM2244a.data != 0;
    }

    /* JADX INFO: renamed from: c */
    public static TypedValue m2246c(Context context, int i, String str) {
        TypedValue typedValueM2244a = m2244a(context, i);
        if (typedValueM2244a != null) {
            return typedValueM2244a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
