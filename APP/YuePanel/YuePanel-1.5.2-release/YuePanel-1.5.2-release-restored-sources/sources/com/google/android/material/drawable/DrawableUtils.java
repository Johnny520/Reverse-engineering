package com.google.android.material.drawable;

import Yue.C4520;
import Yue.C4526;
import Yue.C4528;
import Yue.InterfaceC3897;
import Yue.InterfaceC4482;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC8570;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    @InterfaceC7113(21)
    public static class OutlineCompatL {
        private OutlineCompatL() {
        }

        @InterfaceC4482
        public static void setConvexPath(@InterfaceC6391 Outline outline, @InterfaceC6391 Path path) {
            outline.setConvexPath(path);
        }
    }

    @InterfaceC7113(30)
    public static class OutlineCompatR {
        private OutlineCompatR() {
        }

        @InterfaceC4482
        public static void setPath(@InterfaceC6391 Outline outline, @InterfaceC6391 Path path) {
            outline.setPath(path);
        }
    }

    private DrawableUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public static Drawable compositeTwoLayeredDrawable(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    @InterfaceC6490
    public static Drawable createTintableDrawableIfNeeded(@InterfaceC6490 Drawable drawable, @InterfaceC6490 ColorStateList colorStateList, @InterfaceC6490 PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public static Drawable createTintableMutatedDrawableIfNeeded(@InterfaceC6490 Drawable drawable, @InterfaceC6490 ColorStateList colorStateList, @InterfaceC6490 PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @InterfaceC6391
    public static int[] getCheckedState(@InterfaceC6391 int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    @InterfaceC6490
    public static ColorStateList getColorStateListOrNull(@InterfaceC6490 Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C4526.m1461(drawable)) {
            return null;
        }
        return C4528.m1463(drawable).getColorStateList();
    }

    private static int getTopLayerIntrinsicHeight(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int getTopLayerIntrinsicWidth(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    @InterfaceC6391
    public static int[] getUncheckedState(@InterfaceC6391 int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    @InterfaceC6391
    public static AttributeSet parseDrawableXml(@InterfaceC6391 Context context, @InterfaceC8570 int i, @InterfaceC6391 CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e) {
            e = e;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e2) {
            e = e2;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void setOutlineToPath(@InterfaceC6391 Outline outline, @InterfaceC6391 Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            OutlineCompatR.setPath(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.setConvexPath(outline, path);
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(@InterfaceC6490 RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static void setTint(@InterfaceC6391 Drawable drawable, @InterfaceC3897 int i) {
        if (i != 0) {
            C4520.m13235(drawable, i);
        } else {
            C4520.m13236(drawable, null);
        }
    }

    @InterfaceC6490
    public static PorterDuffColorFilter updateTintFilter(@InterfaceC6391 Drawable drawable, @InterfaceC6490 ColorStateList colorStateList, @InterfaceC6490 PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6490
    public static Drawable compositeTwoLayeredDrawable(@InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6844 int i, @InterfaceC6844 int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1) {
            i = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i2 == -1) {
            i2 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6490
    private static Drawable createTintableMutatedDrawableIfNeeded(@InterfaceC6490 Drawable drawable, @InterfaceC6490 ColorStateList colorStateList, @InterfaceC6490 PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = C4520.m13239(drawable).mutate();
            if (mode != null) {
                C4520.m13237(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }
}
