package com.bumptech.glide.load.resource.drawable;

import Yue.C3323;
import Yue.C4187;
import Yue.C4198;
import Yue.C7130;
import Yue.InterfaceC4525;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableDecoderCompat {
    private static volatile boolean shouldCallAppCompatResources = true;

    private DrawableDecoderCompat() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Drawable getDrawable(Context context, Context context2, @InterfaceC4525 int i) {
        return getDrawable(context, context2, i, null);
    }

    private static Drawable loadDrawableV4(Context context, @InterfaceC4525 int i, @InterfaceC6490 Resources.Theme theme) {
        return C7130.m22275(context.getResources(), i, theme);
    }

    private static Drawable loadDrawableV7(Context context, @InterfaceC4525 int i, @InterfaceC6490 Resources.Theme theme) {
        if (theme != null) {
            C4198 c4198 = new C4198(context, theme);
            c4198.m1159(theme.getResources().getConfiguration());
            context = c4198;
        }
        return C3323.m396(context, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static Drawable getDrawable(Context context, @InterfaceC4525 int i, @InterfaceC6490 Resources.Theme theme) {
        return getDrawable(context, context, i, theme);
    }

    private static Drawable getDrawable(Context context, Context context2, @InterfaceC4525 int i, @InterfaceC6490 Resources.Theme theme) {
        try {
            if (shouldCallAppCompatResources) {
                return loadDrawableV7(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C4187.m12065(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            shouldCallAppCompatResources = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return loadDrawableV4(context2, i, theme);
    }
}
