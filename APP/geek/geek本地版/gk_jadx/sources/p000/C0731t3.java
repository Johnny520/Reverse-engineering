package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.ljx.wechatmod.R;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0731t3 {

    /* JADX INFO: renamed from: a */
    public final int[] f4488a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* JADX INFO: renamed from: b */
    public final int[] f4489b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* JADX INFO: renamed from: c */
    public final int[] f4490c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* JADX INFO: renamed from: d */
    public final int[] f4491d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* JADX INFO: renamed from: e */
    public final int[] f4492e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* JADX INFO: renamed from: f */
    public final int[] f4493f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    /* JADX INFO: renamed from: a */
    public static boolean m2353a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2354b(Context context, int i) {
        int iM2249c = r60.m2249c(context, R.attr.colorControlHighlight);
        int iM2248b = r60.m2248b(context, R.attr.colorButtonNormal);
        int[] iArr = r60.f4214b;
        int[] iArr2 = r60.f4216d;
        int iM1426b = AbstractC0329ib.m1426b(iM2249c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, r60.f4215c, r60.f4218f}, new int[]{iM2248b, iM1426b, AbstractC0329ib.m1426b(iM2249c, i), i});
    }

    /* JADX INFO: renamed from: c */
    public static LayerDrawable m2355c(w00 w00Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM2540c = w00Var.m2540c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM2540c2 = w00Var.m2540c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM2540c instanceof BitmapDrawable) && drawableM2540c.getIntrinsicWidth() == dimensionPixelSize && drawableM2540c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM2540c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM2540c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2540c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM2540c2 instanceof BitmapDrawable) && drawableM2540c2.getIntrinsicWidth() == dimensionPixelSize && drawableM2540c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM2540c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM2540c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM2540c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: e */
    public static void m2356e(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = AbstractC0187eh.f1774a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0768u3.f4653b;
        }
        drawableMutate.setColorFilter(C0768u3.m2405c(i, mode));
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m2357d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0346ip.m1510v(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0346ip.m1510v(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m2354b(context, r60.m2249c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m2354b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m2354b(context, r60.m2249c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0346ip.m1510v(context, R.color.abc_tint_spinner);
            }
            if (m2353a(this.f4489b, i)) {
                return r60.m2250d(context, R.attr.colorControlNormal);
            }
            if (m2353a(this.f4492e, i)) {
                return AbstractC0346ip.m1510v(context, R.color.abc_tint_default);
            }
            if (m2353a(this.f4493f, i)) {
                return AbstractC0346ip.m1510v(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0346ip.m1510v(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM2250d = r60.m2250d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM2250d == null || !colorStateListM2250d.isStateful()) {
            iArr[0] = r60.f4214b;
            iArr2[0] = r60.m2248b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = r60.f4217e;
            iArr2[1] = r60.m2249c(context, R.attr.colorControlActivated);
            iArr[2] = r60.f4218f;
            iArr2[2] = r60.m2249c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = r60.f4214b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM2250d.getColorForState(iArr3, 0);
            iArr[1] = r60.f4217e;
            iArr2[1] = r60.m2249c(context, R.attr.colorControlActivated);
            iArr[2] = r60.f4218f;
            iArr2[2] = colorStateListM2250d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
