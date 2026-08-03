package com.google.android.material.internal;

import Yue.C7837;
import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import Yue.InterfaceC7662;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.C1980R;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class ThemeEnforcement {
    private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
    private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";
    private static final int[] APPCOMPAT_CHECK_ATTRS = {C1980R.attr.colorPrimary};
    private static final int[] MATERIAL_CHECK_ATTRS = {C1980R.attr.colorPrimaryVariant};

    private ThemeEnforcement() {
    }

    public static void checkAppCompatTheme(@InterfaceC6391 Context context) {
        checkTheme(context, APPCOMPAT_CHECK_ATTRS, APPCOMPAT_THEME_NAME);
    }

    private static void checkCompatibleTheme(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.ThemeEnforcement, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C1980R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                checkMaterialTheme(context);
            }
        }
        checkAppCompatTheme(context);
    }

    public static void checkMaterialTheme(@InterfaceC6391 Context context) {
        checkTheme(context, MATERIAL_CHECK_ATTRS, MATERIAL_THEME_NAME);
    }

    private static void checkTextAppearance(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC6391 @InterfaceC7662 int[] iArr, @InterfaceC3451 int i, @InterfaceC7651 int i2, @InterfaceC6490 @InterfaceC7662 int... iArr2) {
        boolean zIsCustomTextAppearanceValid;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.ThemeEnforcement, i, i2);
        if (!typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zIsCustomTextAppearanceValid = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zIsCustomTextAppearanceValid = isCustomTextAppearanceValid(context, attributeSet, iArr, i, i2, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zIsCustomTextAppearanceValid) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void checkTheme(@InterfaceC6391 Context context, @InterfaceC6391 int[] iArr, String str) {
        if (isTheme(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean isAppCompatTheme(@InterfaceC6391 Context context) {
        return isTheme(context, APPCOMPAT_CHECK_ATTRS);
    }

    private static boolean isCustomTextAppearanceValid(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC6391 @InterfaceC7662 int[] iArr, @InterfaceC3451 int i, @InterfaceC7651 int i2, @InterfaceC6391 @InterfaceC7662 int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i3, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean isMaterial3Theme(@InterfaceC6391 Context context) {
        return MaterialAttributes.resolveBoolean(context, C1980R.attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(@InterfaceC6391 Context context) {
        return isTheme(context, MATERIAL_CHECK_ATTRS);
    }

    private static boolean isTheme(@InterfaceC6391 Context context, @InterfaceC6391 int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @InterfaceC6391
    public static TypedArray obtainStyledAttributes(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC6391 @InterfaceC7662 int[] iArr, @InterfaceC3451 int i, @InterfaceC7651 int i2, @InterfaceC7662 int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static C7837 obtainTintedStyledAttributes(@InterfaceC6391 Context context, AttributeSet attributeSet, @InterfaceC6391 @InterfaceC7662 int[] iArr, @InterfaceC3451 int i, @InterfaceC7651 int i2, @InterfaceC7662 int... iArr2) {
        checkCompatibleTheme(context, attributeSet, i, i2);
        checkTextAppearance(context, attributeSet, iArr, i, i2, iArr2);
        return C7837.m24869(context, attributeSet, iArr, i, i2);
    }
}
