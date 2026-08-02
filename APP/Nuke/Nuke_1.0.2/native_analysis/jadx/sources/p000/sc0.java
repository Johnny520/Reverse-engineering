package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sc0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f10032a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m4790a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f10032a) {
                return m4791b(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f10032a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        int i2 = o92.f7592a;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m4791b(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            Context contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i);
    }
}
