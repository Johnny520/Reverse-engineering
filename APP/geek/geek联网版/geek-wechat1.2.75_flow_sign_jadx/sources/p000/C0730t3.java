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
public final class C0730t3 {

    /* JADX INFO: renamed from: a */
    public final int[] f4392a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* JADX INFO: renamed from: b */
    public final int[] f4393b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* JADX INFO: renamed from: c */
    public final int[] f4394c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* JADX INFO: renamed from: d */
    public final int[] f4395d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* JADX INFO: renamed from: e */
    public final int[] f4396e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* JADX INFO: renamed from: f */
    public final int[] f4397f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    /* JADX INFO: renamed from: a */
    public static boolean m2394a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2395b(Context context, int i) {
        int iM2637c = x60.m2637c(context, R.attr.colorControlHighlight);
        int iM2636b = x60.m2636b(context, R.attr.colorButtonNormal);
        int[] iArr = x60.f5193b;
        int[] iArr2 = x60.f5195d;
        int iM2142b = AbstractC0627qb.m2142b(iM2637c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, x60.f5194c, x60.f5197f}, new int[]{iM2636b, iM2142b, AbstractC0627qb.m2142b(iM2637c, i), i});
    }

    /* JADX INFO: renamed from: c */
    public static LayerDrawable m2396c(d10 d10Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM820c = d10Var.m820c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM820c2 = d10Var.m820c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM820c instanceof BitmapDrawable) && drawableM820c.getIntrinsicWidth() == dimensionPixelSize && drawableM820c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM820c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM820c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM820c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM820c2 instanceof BitmapDrawable) && drawableM820c2.getIntrinsicWidth() == dimensionPixelSize && drawableM820c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM820c2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM820c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM820c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: e */
    public static void m2397e(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = AbstractC0261gh.f1985a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0767u3.f4621b;
        }
        drawableMutate.setColorFilter(C0767u3.m2426c(i, mode));
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m2398d(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0493mp.m1864n(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0493mp.m1864n(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m2395b(context, x60.m2637c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m2395b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m2395b(context, x60.m2637c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0493mp.m1864n(context, R.color.abc_tint_spinner);
            }
            if (m2394a(this.f4393b, i)) {
                return x60.m2638d(context, R.attr.colorControlNormal);
            }
            if (m2394a(this.f4396e, i)) {
                return AbstractC0493mp.m1864n(context, R.color.abc_tint_default);
            }
            if (m2394a(this.f4397f, i)) {
                return AbstractC0493mp.m1864n(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0493mp.m1864n(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM2638d = x60.m2638d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM2638d == null || !colorStateListM2638d.isStateful()) {
            iArr[0] = x60.f5193b;
            iArr2[0] = x60.m2636b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = x60.f5196e;
            iArr2[1] = x60.m2637c(context, R.attr.colorControlActivated);
            iArr[2] = x60.f5197f;
            iArr2[2] = x60.m2637c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = x60.f5193b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM2638d.getColorForState(iArr3, 0);
            iArr[1] = x60.f5196e;
            iArr2[1] = x60.m2637c(context, R.attr.colorControlActivated);
            iArr[2] = x60.f5197f;
            iArr2[2] = colorStateListM2638d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }
}
