package com.google.android.material.resources;

import Yue.InterfaceC3451;
import Yue.InterfaceC4398;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class MaterialAttributes {
    @InterfaceC6490
    public static TypedValue resolve(@InterfaceC6391 Context context, @InterfaceC3451 int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@InterfaceC6391 Context context, @InterfaceC3451 int i, boolean z) {
        TypedValue typedValueResolve = resolve(context, i);
        return (typedValueResolve == null || typedValueResolve.type != 18) ? z : typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(@InterfaceC6391 Context context, @InterfaceC3451 int i, @InterfaceC6391 String str) {
        return resolveOrThrow(context, i, str) != 0;
    }

    @InterfaceC6844
    public static int resolveDimension(@InterfaceC6391 Context context, @InterfaceC3451 int i, @InterfaceC4398 int i2) {
        TypedValue typedValueResolve = resolve(context, i);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i2) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveInteger(@InterfaceC6391 Context context, @InterfaceC3451 int i, int i2) {
        TypedValue typedValueResolve = resolve(context, i);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i2 : typedValueResolve.data;
    }

    @InterfaceC6844
    public static int resolveMinimumAccessibleTouchTarget(@InterfaceC6391 Context context) {
        return resolveDimension(context, C1980R.attr.minTouchTargetSize, C1980R.dimen.mtrl_min_touch_target_size);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int resolveOrThrow(@InterfaceC6391 Context context, @InterfaceC3451 int i, @InterfaceC6391 String str) {
        return resolveTypedValueOrThrow(context, i, str).data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static TypedValue resolveTypedValueOrThrow(@InterfaceC6391 View view, @InterfaceC3451 int i) {
        return resolveTypedValueOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int resolveOrThrow(@InterfaceC6391 View view, @InterfaceC3451 int i) {
        return resolveTypedValueOrThrow(view, i).data;
    }

    @InterfaceC6391
    public static TypedValue resolveTypedValueOrThrow(@InterfaceC6391 Context context, @InterfaceC3451 int i, @InterfaceC6391 String str) {
        TypedValue typedValueResolve = resolve(context, i);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
