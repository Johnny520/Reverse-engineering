package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class t3 {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;
    public final int[] f;

    public t3() {
        this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean a(int[] r4, int r5) {
        int r0 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        if (r4[r2] == r5) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static ColorStateList b(Context r6, int r7) {
        int r0 = r60.c(r6, R.attr.colorControlHighlight);
        int r62 = r60.b(r6, R.attr.colorButtonNormal);
        int[] r1 = r60.b;
        int[] r2 = r60.d;
        int r3 = ib.b(r0, r7);
        int[] r4 = r60.c;
        int r02 = ib.b(r0, r7);
        return new ColorStateList(new int[][]{r1, r2, r4, r60.f}, new int[]{r62, r3, r02, r7});
    }

    public static LayerDrawable c(w00 r4, Context r5, int r6) {
        int r62 = r5.getResources().getDimensionPixelSize(r6);
        Drawable r0 = r4.c(r5, R.drawable.abc_star_black_48dp);
        Drawable r42 = r4.c(r5, R.drawable.abc_star_half_black_48dp);
        if ((r0 instanceof BitmapDrawable) == true) goto L5;
    L9:
        Bitmap r52 = Bitmap.createBitmap(r62, r62, Bitmap.Config.ARGB_8888);
        Canvas r2 = new Canvas(r52);
        r0.setBounds(0, 0, r62, r62);
        r0.draw(r2);
        BitmapDrawable r02 = new BitmapDrawable(r52);
        BitmapDrawable r53 = new BitmapDrawable(r52);
    L10:
        r53.setTileModeX(Shader.TileMode.REPEAT);
        if ((r42 instanceof BitmapDrawable) == true) goto L13;
    L17:
        Bitmap r22 = Bitmap.createBitmap(r62, r62, Bitmap.Config.ARGB_8888);
        Canvas r3 = new Canvas(r22);
        r42.setBounds(0, 0, r62, r62);
        r42.draw(r3);
        BitmapDrawable r43 = new BitmapDrawable(r22);
    L18:
        LayerDrawable r63 = new LayerDrawable(new Drawable[]{r02, r43, r53});
        r63.setId(0, android.R.id.background);
        r63.setId(1, android.R.id.secondaryProgress);
        r63.setId(2, android.R.id.progress);
        return r63;
    L13:
        if (r42.getIntrinsicWidth() != r62) goto L17;
        if (r42.getIntrinsicHeight() != r62) goto L17;
        r43 = (BitmapDrawable) r42;
        goto L18
    L5:
        if (r0.getIntrinsicWidth() != r62) goto L9;
        if (r0.getIntrinsicHeight() != r62) goto L9;
        r02 = (BitmapDrawable) r0;
        r53 = new BitmapDrawable(r02.getBitmap());
        goto L10
    }

    public static void e(Drawable r1, int r2, PorterDuff.Mode r3) {
        int[] r0 = eh.a;
        Drawable r12 = r1.mutate();
        if (r3 != null) goto L5;
        r3 = u3.b;
    L5:
        r12.setColorFilter(u3.c(r2, r3));
    }

    public final ColorStateList d(Context r9, int r10) {
        if (r10 != R.drawable.abc_edit_text_material) goto L7;
        return ip.v(r9, R.color.abc_tint_edittext);
    L7:
        if (r10 != R.drawable.abc_switch_track_mtrl_alpha) goto L11;
        return ip.v(r9, R.color.abc_tint_switch_track);
    L11:
        if (r10 != R.drawable.abc_switch_thumb_material) goto L21;
        int[][] r0 = new int[3][];
        int[] r102 = new int[3];
        ColorStateList r3 = r60.d(r9, R.attr.colorSwitchThumbNormal);
        if (r3 != null) goto L15;
    L17:
        r0[0] = r60.b;
        r102[0] = r60.b(r9, R.attr.colorSwitchThumbNormal);
        r0[1] = r60.e;
        r102[1] = r60.c(r9, R.attr.colorControlActivated);
        r0[2] = r60.f;
        r102[2] = r60.c(r9, R.attr.colorSwitchThumbNormal);
    L19:
        return new ColorStateList(r0, r102);
    L15:
        if (r3.isStateful() == false) goto L17;
        int[] r2 = r60.b;
        r0[0] = r2;
        r102[0] = r3.getColorForState(r2, 0);
        r0[1] = r60.e;
        r102[1] = r60.c(r9, R.attr.colorControlActivated);
        r0[2] = r60.f;
        r102[2] = r3.getDefaultColor();
        goto L19
    L21:
        if (r10 != R.drawable.abc_btn_default_mtrl_shape) goto L25;
        return b(r9, r60.c(r9, R.attr.colorButtonNormal));
    L25:
        if (r10 != R.drawable.abc_btn_borderless_material) goto L29;
        return b(r9, 0);
    L29:
        if (r10 != R.drawable.abc_btn_colored_material) goto L33;
        return b(r9, r60.c(r9, R.attr.colorAccent));
    L33:
        if (r10 == R.drawable.abc_spinner_mtrl_am_alpha) goto L56;
        if (r10 == R.drawable.abc_spinner_textfield_background_material) goto L56;
        if (a(this.b, r10) == false) goto L42;
        return r60.d(r9, R.attr.colorControlNormal);
    L42:
        if (a(this.e, r10) == false) goto L46;
        return ip.v(r9, R.color.abc_tint_default);
    L46:
        if (a(this.f, r10) == false) goto L50;
        return ip.v(r9, R.color.abc_tint_btn_checkable);
    L50:
        if (r10 == R.drawable.abc_seekbar_thumb_material) goto L52;
        return null;
    L52:
        return ip.v(r9, R.color.abc_tint_seek_thumb);
    L56:
        return ip.v(r9, R.color.abc_tint_spinner);
    }
}
