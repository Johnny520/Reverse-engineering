package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.github.cherrywechat.R;
import io.sentry.C1981r;
import io.sentry.EnumC1657a2;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.C1687c;
import io.sentry.android.core.RunnableC1684a0;
import io.sentry.android.core.RunnableC1685b;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C1716d;
import io.sentry.hints.C1891i;
import io.sentry.util.C2029a;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Fu */
/* JADX INFO: loaded from: classes.dex */
public final class C0252Fu {

    /* JADX INFO: renamed from: a */
    public final Object f819a;

    /* JADX INFO: renamed from: b */
    public final Object f820b;

    /* JADX INFO: renamed from: c */
    public final Serializable f821c;

    /* JADX INFO: renamed from: d */
    public final Object f822d;

    /* JADX INFO: renamed from: e */
    public final Object f823e;

    /* JADX INFO: renamed from: f */
    public final Serializable f824f;

    public C0252Fu(String str, AbstractC2744y6 abstractC2744y6, EnumC0888Um enumC0888Um, EnumC2773yt enumC2773yt, Integer num) {
        this.f819a = str;
        this.f820b = AbstractC2751yD.m5333b(str);
        this.f821c = abstractC2744y6;
        this.f822d = enumC0888Um;
        this.f823e = enumC2773yt;
        this.f824f = num;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m523b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static C0252Fu m524d(String str, AbstractC2744y6 abstractC2744y6, EnumC0888Um enumC0888Um, EnumC2773yt enumC2773yt, Integer num) throws GeneralSecurityException {
        if (enumC2773yt == EnumC2773yt.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C0252Fu(str, abstractC2744y6, enumC0888Um, enumC2773yt, num);
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m525e(Context context, int i) {
        int iM1989c = AbstractC1042YA.m1989c(context, R.attr.colorControlHighlight);
        int iM1988b = AbstractC1042YA.m1988b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC1042YA.f3325b;
        int[] iArr2 = AbstractC1042YA.f3327d;
        int iM5365c = AbstractC2797za.m5365c(iM1989c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC1042YA.f3326c, AbstractC1042YA.f3329f}, new int[]{iM1988b, iM5365c, AbstractC2797za.m5365c(iM1989c, i), i});
    }

    /* JADX INFO: renamed from: f */
    public static LayerDrawable m526f(C2776yw c2776yw, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM5350c = c2776yw.m5350c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM5350c2 = c2776yw.m5350c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM5350c instanceof BitmapDrawable) && drawableM5350c.getIntrinsicWidth() == dimensionPixelSize && drawableM5350c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM5350c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM5350c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM5350c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM5350c2 instanceof BitmapDrawable) && drawableM5350c2.getIntrinsicWidth() == dimensionPixelSize && drawableM5350c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM5350c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM5350c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM5350c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: j */
    public static void m527j(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0262G3.f842b;
        }
        drawableMutate.setColorFilter(C0262G3.m540c(i, mode));
    }

    /* JADX INFO: renamed from: a */
    public void m528a(Activity activity) {
        C1981r c1981rM4173a = ((C2029a) this.f824f).m4173a();
        try {
            if (!m531h()) {
                c1981rM4173a.close();
                return;
            }
            m532i(new RunnableC1685b(this, activity, 0), "FrameMetricsAggregator.add");
            C1687c c1687cM529c = m529c();
            if (c1687cM529c != null) {
                ((WeakHashMap) this.f822d).put(activity, c1687cM529c);
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public C1687c m529c() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!m531h() || (frameMetricsAggregator = (FrameMetricsAggregator) this.f819a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) frameMetricsAggregator.f3910a.f1893b;
        int i3 = 0;
        if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new C1687c(i3, i, i2);
    }

    /* JADX INFO: renamed from: g */
    public ColorStateList m530g(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0295Gu.m622o(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0295Gu.m622o(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m525e(context, AbstractC1042YA.m1989c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m525e(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m525e(context, AbstractC1042YA.m1989c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0295Gu.m622o(context, R.color.abc_tint_spinner);
            }
            if (m523b((int[]) this.f820b, i)) {
                return AbstractC1042YA.m1990d(context, R.attr.colorControlNormal);
            }
            if (m523b((int[]) this.f823e, i)) {
                return AbstractC0295Gu.m622o(context, R.color.abc_tint_default);
            }
            if (m523b((int[]) this.f824f, i)) {
                return AbstractC0295Gu.m622o(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0295Gu.m622o(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM1990d = AbstractC1042YA.m1990d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM1990d == null || !colorStateListM1990d.isStateful()) {
            iArr[0] = AbstractC1042YA.f3325b;
            iArr2[0] = AbstractC1042YA.m1988b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC1042YA.f3328e;
            iArr2[1] = AbstractC1042YA.m1989c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1042YA.f3329f;
            iArr2[2] = AbstractC1042YA.m1989c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC1042YA.f3325b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM1990d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC1042YA.f3328e;
            iArr2[1] = AbstractC1042YA.m1989c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC1042YA.f3329f;
            iArr2[2] = colorStateListM1990d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: h */
    public boolean m531h() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f820b;
        return (((FrameMetricsAggregator) this.f819a) == null || !sentryAndroidOptions.isEnableFramesTracking() || sentryAndroidOptions.isEnablePerformanceV2()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public void m532i(Runnable runnable, String str) {
        try {
            if (C1716d.f6223a.mo3902c()) {
                runnable.run();
                return;
            }
            C1666I c1666i = (C1666I) this.f823e;
            ((Handler) c1666i.f5974a).post(new RunnableC1684a0(this, runnable, str, 1));
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.f820b).getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int[], java.io.Serializable] */
    public C0252Fu() {
        this.f819a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f820b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f821c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f822d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f823e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f824f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public C0252Fu(SentryAndroidOptions sentryAndroidOptions) {
        C1666I c1666i = new C1666I();
        this.f819a = null;
        this.f821c = new ConcurrentHashMap();
        this.f822d = new WeakHashMap();
        this.f824f = new C2029a();
        if (C1891i.m4095e("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f819a = new FrameMetricsAggregator();
        }
        this.f820b = sentryAndroidOptions;
        this.f823e = c1666i;
    }
}
