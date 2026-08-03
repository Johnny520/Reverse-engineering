package p057g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import org.luckypray.dexkit.C1031R;
import p056f0.AbstractC0805P;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: g.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0924r {

    /* JADX INFO: renamed from: a */
    public final int[] f3283a = {C1031R.drawable.abc_textfield_search_default_mtrl_alpha, C1031R.drawable.abc_textfield_default_mtrl_alpha, C1031R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* JADX INFO: renamed from: b */
    public final int[] f3284b = {C1031R.drawable.abc_ic_commit_search_api_mtrl_alpha, C1031R.drawable.abc_seekbar_tick_mark_material, C1031R.drawable.abc_ic_menu_share_mtrl_alpha, C1031R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C1031R.drawable.abc_ic_menu_cut_mtrl_alpha, C1031R.drawable.abc_ic_menu_selectall_mtrl_alpha, C1031R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* JADX INFO: renamed from: c */
    public final int[] f3285c = {C1031R.drawable.abc_textfield_activated_mtrl_alpha, C1031R.drawable.abc_textfield_search_activated_mtrl_alpha, C1031R.drawable.abc_cab_background_top_mtrl_alpha, C1031R.drawable.abc_text_cursor_material, C1031R.drawable.abc_text_select_handle_left_mtrl, C1031R.drawable.abc_text_select_handle_middle_mtrl, C1031R.drawable.abc_text_select_handle_right_mtrl};

    /* JADX INFO: renamed from: d */
    public final int[] f3286d = {C1031R.drawable.abc_popup_background_mtrl_mult, C1031R.drawable.abc_cab_background_internal_bg, C1031R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* JADX INFO: renamed from: e */
    public final int[] f3287e = {C1031R.drawable.abc_tab_indicator_material, C1031R.drawable.abc_textfield_search_material};

    /* JADX INFO: renamed from: f */
    public final int[] f3288f = {C1031R.drawable.abc_btn_check_material, C1031R.drawable.abc_btn_radio_material, C1031R.drawable.abc_btn_check_material_anim, C1031R.drawable.abc_btn_radio_material_anim};

    /* JADX INFO: renamed from: a */
    public static boolean m2253a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2254b(Context context, int i2) {
        int iM2161c = AbstractC0849A0.m2161c(context, C1031R.attr.colorControlHighlight);
        int iM2160b = AbstractC0849A0.m2160b(context, C1031R.attr.colorButtonNormal);
        int[] iArr = AbstractC0849A0.f3069b;
        int[] iArr2 = AbstractC0849A0.f3071d;
        int iM2593b = AbstractC1100a.m2593b(iM2161c, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC0849A0.f3070c, AbstractC0849A0.f3073f}, new int[]{iM2160b, iM2593b, AbstractC1100a.m2593b(iM2161c, i2), i2});
    }

    /* JADX INFO: renamed from: c */
    public static LayerDrawable m2255c(C0933v0 c0933v0, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable drawableM2268e = c0933v0.m2268e(context, C1031R.drawable.abc_star_black_48dp);
        Drawable drawableM2268e2 = c0933v0.m2268e(context, C1031R.drawable.abc_star_half_black_48dp);
        if ((drawableM2268e instanceof BitmapDrawable) && drawableM2268e.getIntrinsicWidth() == dimensionPixelSize && drawableM2268e.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM2268e;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM2268e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2268e.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM2268e2 instanceof BitmapDrawable) && drawableM2268e2.getIntrinsicWidth() == dimensionPixelSize && drawableM2268e2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM2268e2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM2268e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2268e2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: e */
    public static void m2256e(Drawable drawable, int i2) {
        PorterDuffColorFilter porterDuffColorFilterM2264g;
        PorterDuff.Mode mode = C0926s.f3289b;
        Drawable drawableMutate = drawable.mutate();
        synchronized (C0926s.class) {
            porterDuffColorFilterM2264g = C0933v0.m2264g(i2, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterM2264g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m2257d(Context context, int i2) {
        if (i2 == C1031R.drawable.abc_edit_text_material) {
            return AbstractC0805P.m2049p(context, C1031R.color.abc_tint_edittext);
        }
        if (i2 == C1031R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0805P.m2049p(context, C1031R.color.abc_tint_switch_track);
        }
        if (i2 != C1031R.drawable.abc_switch_thumb_material) {
            if (i2 == C1031R.drawable.abc_btn_default_mtrl_shape) {
                return m2254b(context, AbstractC0849A0.m2161c(context, C1031R.attr.colorButtonNormal));
            }
            if (i2 == C1031R.drawable.abc_btn_borderless_material) {
                return m2254b(context, 0);
            }
            if (i2 == C1031R.drawable.abc_btn_colored_material) {
                return m2254b(context, AbstractC0849A0.m2161c(context, C1031R.attr.colorAccent));
            }
            if (i2 == C1031R.drawable.abc_spinner_mtrl_am_alpha || i2 == C1031R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0805P.m2049p(context, C1031R.color.abc_tint_spinner);
            }
            if (m2253a(this.f3284b, i2)) {
                return AbstractC0849A0.m2162d(context, C1031R.attr.colorControlNormal);
            }
            if (m2253a(this.f3287e, i2)) {
                return AbstractC0805P.m2049p(context, C1031R.color.abc_tint_default);
            }
            if (m2253a(this.f3288f, i2)) {
                return AbstractC0805P.m2049p(context, C1031R.color.abc_tint_btn_checkable);
            }
            if (i2 == C1031R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0805P.m2049p(context, C1031R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM2162d = AbstractC0849A0.m2162d(context, C1031R.attr.colorSwitchThumbNormal);
        if (colorStateListM2162d == null || !colorStateListM2162d.isStateful()) {
            iArr[0] = AbstractC0849A0.f3069b;
            iArr2[0] = AbstractC0849A0.m2160b(context, C1031R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC0849A0.f3072e;
            iArr2[1] = AbstractC0849A0.m2161c(context, C1031R.attr.colorControlActivated);
            iArr[2] = AbstractC0849A0.f3073f;
            iArr2[2] = AbstractC0849A0.m2161c(context, C1031R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC0849A0.f3069b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM2162d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC0849A0.f3072e;
            iArr2[1] = AbstractC0849A0.m2161c(context, C1031R.attr.colorControlActivated);
            iArr[2] = AbstractC0849A0.f3073f;
            iArr2[2] = colorStateListM2162d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
