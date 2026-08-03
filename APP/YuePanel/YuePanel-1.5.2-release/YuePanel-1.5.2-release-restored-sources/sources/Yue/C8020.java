package Yue;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8020 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m4035(TypedArray typedArray, @InterfaceC7662 int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m4036(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m25299(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final ColorStateList m25300(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final float m25301(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    @InterfaceC4399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m25302(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    @InterfaceC4399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m25303(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Drawable m25304(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        C5499.m17100(drawable);
        return drawable;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final float m25305(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Typeface m25306(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return C8019.m4034(typedArray, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m25307(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m25308(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    @InterfaceC3261
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m25309(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String m25310(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final CharSequence[] m25311(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        return typedArray.getTextArray(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final CharSequence m25312(@InterfaceC6399 TypedArray typedArray, @InterfaceC7662 int i) {
        m4035(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <R> R m25313(@InterfaceC6399 TypedArray typedArray, @InterfaceC6399 InterfaceC5124<? super TypedArray, ? extends R> interfaceC5124) {
        R rInvoke = interfaceC5124.invoke(typedArray);
        typedArray.recycle();
        return rInvoke;
    }
}
