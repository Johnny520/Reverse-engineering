package p131a2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import p199m1.AbstractC2598c;

/* JADX INFO: renamed from: a2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1798b {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f6134a = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Drawable m3270a(Context context, Context context2, int i5, Resources.Theme theme) {
        try {
            if (f6134a) {
                return m3271b(context2, i5, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e5) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e5;
            }
            return context2.getDrawable(i5);
        } catch (NoClassDefFoundError unused2) {
            f6134a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        int i6 = AbstractC2598c.f8262a;
        return resources.getDrawable(i5, theme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Drawable m3271b(Context context, int i5, Resources.Theme theme) {
        if (theme != null) {
            Context contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return AppCompatResources.getDrawable(context, i5);
    }
}
