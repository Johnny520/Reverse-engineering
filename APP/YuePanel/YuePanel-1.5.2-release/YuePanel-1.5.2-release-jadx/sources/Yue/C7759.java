package Yue;

import Yue.C6728;
import Yue.InterfaceC7144;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۢۡۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7759 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3065 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3066 = 1;

    /* JADX INFO: renamed from: Yue.ۥۢۡۡ۟$ۥ */
    @InterfaceC7113(23)
    public static class C1346 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3853(TextView textView) {
            return textView.getBreakStrategy();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ColorStateList m3854(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static PorterDuff.Mode m24680(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int m24681(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m24682(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m24683(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m24684(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m24685(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡ۟$ۥ۟ */
    @InterfaceC7113(24)
    public static class C1347 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static DecimalFormatSymbols m3855(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡ۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C7760 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m3856(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m3857(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static int m24686(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static int[] m24687(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m24688(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m24689(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m24690(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m24691(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡ۟$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(28)
    public static class C7761 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static CharSequence m3858(PrecomputedText precomputedText) {
            return precomputedText;
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static String[] m3859(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static PrecomputedText.Params m24692(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m24693(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public static class C7762 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3860(@InterfaceC6391 TextView textView, int i, @InterfaceC4885(from = 0.0d) float f) {
            textView.setLineHeight(i, f);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7763 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۡ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class ActionModeCallbackC7764 implements ActionMode.Callback {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f23291 = 100;

        /* JADX INFO: renamed from: ۥ */
        public final ActionMode.Callback f3067;

        /* JADX INFO: renamed from: ۥ۟ */
        public final TextView f3068;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Class<?> f23292;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Method f23293;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f23294;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f23295 = false;

        public ActionModeCallbackC7764(ActionMode.Callback callback, TextView textView) {
            this.f3067 = callback;
            this.f3068 = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3067.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3067.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3067.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m24698(menu);
            return this.f3067.onPrepareActionMode(actionMode, menu);
        }

        /* JADX INFO: renamed from: ۥ */
        public final Intent m3861() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final Intent m3862(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = m3861().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m24696(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final List<ResolveInfo> m24694(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m3861(), 0)) {
                if (m24697(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public ActionMode.Callback m24695() {
            return this.f3067;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m24696(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m24697(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m24698(Menu menu) {
            Context context = this.f3068.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f23295) {
                this.f23295 = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f23292 = cls;
                    this.f23293 = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f23294 = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f23292 = null;
                    this.f23293 = null;
                    this.f23294 = false;
                }
            }
            try {
                Method declaredMethod = (this.f23294 && this.f23292.isInstance(menu)) ? this.f23293 : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listM24694 = m24694(context, packageManager);
                for (int i = 0; i < listM24694.size(); i++) {
                    ResolveInfo resolveInfo = listM24694.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m3862(resolveInfo, this.f3068)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ */
    public static int m3851(@InterfaceC6391 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C7760.m3856(textView);
        }
        if (textView instanceof InterfaceC3499) {
            return ((InterfaceC3499) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3852(@InterfaceC6391 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C7760.m3857(textView);
        }
        if (textView instanceof InterfaceC3499) {
            return ((InterfaceC3499) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m24649(@InterfaceC6391 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C7760.m24686(textView);
        }
        if (textView instanceof InterfaceC3499) {
            return ((InterfaceC3499) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int[] m24650(@InterfaceC6391 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? C7760.m24687(textView) : textView instanceof InterfaceC3499 ? ((InterfaceC3499) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m24651(@InterfaceC6391 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return C7760.m24688(textView);
        }
        if (textView instanceof InterfaceC3499) {
            return ((InterfaceC3499) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static ColorStateList m24652(@InterfaceC6391 TextView textView) {
        C6740.m21415(textView);
        return C1346.m3854(textView);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static PorterDuff.Mode m24653(@InterfaceC6391 TextView textView) {
        C6740.m21415(textView);
        return C1346.m24680(textView);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Drawable[] m24654(@InterfaceC6391 TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m24655(@InterfaceC6391 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m24656(@InterfaceC6391 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m24657(@InterfaceC6391 TextView textView) {
        return textView.getMaxLines();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m24658(@InterfaceC6391 TextView textView) {
        return textView.getMinLines();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static int m24659(@InterfaceC6391 TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static TextDirectionHeuristic m24660(@InterfaceC6391 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(C7761.m3859(C1347.m3855(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static C6728.C1075 m24661(@InterfaceC6391 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C6728.C1075(C7761.m24692(textView));
        }
        C6728.C1075.C6729 c6729 = new C6728.C1075.C6729(new TextPaint(textView.getPaint()));
        c6729.m3215(C1346.m3853(textView));
        c6729.m21404(C1346.m24681(textView));
        c6729.m21405(m24660(textView));
        return c6729.m3214();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m24662(@InterfaceC6391 TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C7760.m24689(textView, i, i2, i3, i4);
        } else if (textView instanceof InterfaceC3499) {
            ((InterfaceC3499) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m24663(@InterfaceC6391 TextView textView, @InterfaceC6391 int[] iArr, int i) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            C7760.m24690(textView, iArr, i);
        } else if (textView instanceof InterfaceC3499) {
            ((InterfaceC3499) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m24664(@InterfaceC6391 TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C7760.m24691(textView, i);
        } else if (textView instanceof InterfaceC3499) {
            ((InterfaceC3499) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m24665(@InterfaceC6391 TextView textView, @InterfaceC6490 ColorStateList colorStateList) {
        C6740.m21415(textView);
        C1346.m24683(textView, colorStateList);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m24666(@InterfaceC6391 TextView textView, @InterfaceC6490 PorterDuff.Mode mode) {
        C6740.m21415(textView);
        C1346.m24684(textView, mode);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m24667(@InterfaceC6391 TextView textView, @InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m24668(@InterfaceC6391 TextView textView, @InterfaceC4525 int i, @InterfaceC4525 int i2, @InterfaceC4525 int i3, @InterfaceC4525 int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m24669(@InterfaceC6391 TextView textView, @InterfaceC6490 Drawable drawable, @InterfaceC6490 Drawable drawable2, @InterfaceC6490 Drawable drawable3, @InterfaceC6490 Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static void m24670(@InterfaceC6391 TextView textView, @InterfaceC6391 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(m24679(textView, callback));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m24671(@InterfaceC6391 TextView textView, @InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        C6740.m21412(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C7761.m24693(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m24672(@InterfaceC6391 TextView textView, @InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        C6740.m21412(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m24673(@InterfaceC6391 TextView textView, @InterfaceC6844 @InterfaceC5459(from = 0) int i) {
        C6740.m21412(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m24674(@InterfaceC6391 TextView textView, int i, @InterfaceC4885(from = 0.0d) float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            C7762.m3860(textView, i, f);
        } else {
            m24673(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m24675(@InterfaceC6391 TextView textView, @InterfaceC6391 C6728 c6728) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(C7761.m3858(c6728.m21400()));
        } else {
            if (!m24661(textView).m3212(c6728.m21399())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(c6728);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static void m24676(@InterfaceC6391 TextView textView, @InterfaceC7651 int i) {
        textView.setTextAppearance(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m24677(@InterfaceC6391 TextView textView, @InterfaceC6391 C6728.C1075 c1075) {
        textView.setTextDirection(m24659(c1075.m21402()));
        textView.getPaint().set(c1075.m21403());
        C1346.m24682(textView, c1075.m3213());
        C1346.m24685(textView, c1075.m21401());
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static ActionMode.Callback m24678(@InterfaceC6490 ActionMode.Callback callback) {
        return callback instanceof ActionModeCallbackC7764 ? ((ActionModeCallbackC7764) callback).m24695() : callback;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static ActionMode.Callback m24679(@InterfaceC6391 TextView textView, @InterfaceC6490 ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC7764) || callback == null) ? callback : new ActionModeCallbackC7764(callback, textView);
    }
}
