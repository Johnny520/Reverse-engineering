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
    public final int[] f3283a;

    /* JADX INFO: renamed from: b */
    public final int[] f3284b;

    /* JADX INFO: renamed from: c */
    public final int[] f3285c;

    /* JADX INFO: renamed from: d */
    public final int[] f3286d;

    /* JADX INFO: renamed from: e */
    public final int[] f3287e;

    /* JADX INFO: renamed from: f */
    public final int[] f3288f;

    public C0924r() {
        this.f3283a = new int[]{C1031R.drawable.abc_textfield_search_default_mtrl_alpha, C1031R.drawable.abc_textfield_default_mtrl_alpha, C1031R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f3284b = new int[]{C1031R.drawable.abc_ic_commit_search_api_mtrl_alpha, C1031R.drawable.abc_seekbar_tick_mark_material, C1031R.drawable.abc_ic_menu_share_mtrl_alpha, C1031R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C1031R.drawable.abc_ic_menu_cut_mtrl_alpha, C1031R.drawable.abc_ic_menu_selectall_mtrl_alpha, C1031R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f3285c = new int[]{C1031R.drawable.abc_textfield_activated_mtrl_alpha, C1031R.drawable.abc_textfield_search_activated_mtrl_alpha, C1031R.drawable.abc_cab_background_top_mtrl_alpha, C1031R.drawable.abc_text_cursor_material, C1031R.drawable.abc_text_select_handle_left_mtrl, C1031R.drawable.abc_text_select_handle_middle_mtrl, C1031R.drawable.abc_text_select_handle_right_mtrl};
        this.f3286d = new int[]{C1031R.drawable.abc_popup_background_mtrl_mult, C1031R.drawable.abc_cab_background_internal_bg, C1031R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f3287e = new int[]{C1031R.drawable.abc_tab_indicator_material, C1031R.drawable.abc_textfield_search_material};
        this.f3288f = new int[]{C1031R.drawable.abc_btn_check_material, C1031R.drawable.abc_btn_radio_material, C1031R.drawable.abc_btn_check_material_anim, C1031R.drawable.abc_btn_radio_material_anim};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2253a(int[] r4, int r5) {
        int r02 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (r4[r2] == r5) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m2254b(Context r6, int r7) {
        int r02 = AbstractC0849A0.m2161c(r6, C1031R.attr.colorControlHighlight);
        int r62 = AbstractC0849A0.m2160b(r6, C1031R.attr.colorButtonNormal);
        int[] r1 = AbstractC0849A0.f3069b;
        int[] r2 = AbstractC0849A0.f3071d;
        int r3 = AbstractC1100a.m2593b(r02, r7);
        int[] r4 = AbstractC0849A0.f3070c;
        int r03 = AbstractC1100a.m2593b(r02, r7);
        return new ColorStateList(new int[][]{r1, r2, r4, AbstractC0849A0.f3073f}, new int[]{r62, r3, r03, r7});
    }

    /* JADX INFO: renamed from: c */
    public static LayerDrawable m2255c(C0933v0 r6, Context r7, int r8) {
        int r82 = r7.getResources().getDimensionPixelSize(r8);
        Drawable r2 = r6.m2268e(r7, C1031R.drawable.abc_star_black_48dp);
        Drawable r62 = r6.m2268e(r7, C1031R.drawable.abc_star_half_black_48dp);
        if ((r2 instanceof BitmapDrawable) == true) goto L5;
    L9:
        Bitmap r72 = Bitmap.createBitmap(r82, r82, Bitmap.Config.ARGB_8888);
        Canvas r4 = new Canvas(r72);
        r2.setBounds(0, 0, r82, r82);
        r2.draw(r4);
        BitmapDrawable r22 = new BitmapDrawable(r72);
        BitmapDrawable r73 = new BitmapDrawable(r72);
    L10:
        r73.setTileModeX(Shader.TileMode.REPEAT);
        if ((r62 instanceof BitmapDrawable) == true) goto L13;
    L17:
        Bitmap r42 = Bitmap.createBitmap(r82, r82, Bitmap.Config.ARGB_8888);
        Canvas r5 = new Canvas(r42);
        r62.setBounds(0, 0, r82, r82);
        r62.draw(r5);
        BitmapDrawable r63 = new BitmapDrawable(r42);
    L18:
        LayerDrawable r83 = new LayerDrawable(new Drawable[]{r22, r63, r73});
        r83.setId(0, R.id.background);
        r83.setId(1, R.id.secondaryProgress);
        r83.setId(2, R.id.progress);
        return r83;
    L13:
        if (r62.getIntrinsicWidth() != r82) goto L17;
        if (r62.getIntrinsicHeight() != r82) goto L17;
        r63 = (BitmapDrawable) r62;
        goto L18
    L5:
        if (r2.getIntrinsicWidth() != r82) goto L9;
        if (r2.getIntrinsicHeight() != r82) goto L9;
        r22 = (BitmapDrawable) r2;
        r73 = new BitmapDrawable(r22.getBitmap());
        goto L10
    }

    /* JADX INFO: renamed from: e */
    public static void m2256e(Drawable r2, int r3) {
        PorterDuff.Mode r02 = C0926s.f3289b;
        Drawable r22 = r2.mutate();
        monitor-enter(C0926s.class);
        PorterDuffColorFilter r32 = C0933v0.m2264g(r3, r02);     // Catch: Throwable -> L8
        monitor-exit(C0926s.class);
        r22.setColorFilter(r32);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m2257d(Context r9, int r10) {
        if (r10 != C1031R.drawable.abc_edit_text_material) goto L7;
        return AbstractC0805P.m2049p(r9, C1031R.color.abc_tint_edittext);
    L7:
        if (r10 != C1031R.drawable.abc_switch_track_mtrl_alpha) goto L11;
        return AbstractC0805P.m2049p(r9, C1031R.color.abc_tint_switch_track);
    L11:
        if (r10 != C1031R.drawable.abc_switch_thumb_material) goto L21;
        int[][] r02 = new int[3][];
        int[] r102 = new int[3];
        ColorStateList r3 = AbstractC0849A0.m2162d(r9, C1031R.attr.colorSwitchThumbNormal);
        if (r3 != null) goto L15;
    L17:
        r02[0] = AbstractC0849A0.f3069b;
        r102[0] = AbstractC0849A0.m2160b(r9, C1031R.attr.colorSwitchThumbNormal);
        r02[1] = AbstractC0849A0.f3072e;
        r102[1] = AbstractC0849A0.m2161c(r9, C1031R.attr.colorControlActivated);
        r02[2] = AbstractC0849A0.f3073f;
        r102[2] = AbstractC0849A0.m2161c(r9, C1031R.attr.colorSwitchThumbNormal);
    L19:
        return new ColorStateList(r02, r102);
    L15:
        if (r3.isStateful() == false) goto L17;
        int[] r2 = AbstractC0849A0.f3069b;
        r02[0] = r2;
        r102[0] = r3.getColorForState(r2, 0);
        r02[1] = AbstractC0849A0.f3072e;
        r102[1] = AbstractC0849A0.m2161c(r9, C1031R.attr.colorControlActivated);
        r02[2] = AbstractC0849A0.f3073f;
        r102[2] = r3.getDefaultColor();
        goto L19
    L21:
        if (r10 != C1031R.drawable.abc_btn_default_mtrl_shape) goto L25;
        return m2254b(r9, AbstractC0849A0.m2161c(r9, C1031R.attr.colorButtonNormal));
    L25:
        if (r10 != C1031R.drawable.abc_btn_borderless_material) goto L29;
        return m2254b(r9, 0);
    L29:
        if (r10 != C1031R.drawable.abc_btn_colored_material) goto L33;
        return m2254b(r9, AbstractC0849A0.m2161c(r9, C1031R.attr.colorAccent));
    L33:
        if (r10 == C1031R.drawable.abc_spinner_mtrl_am_alpha) goto L56;
        if (r10 == C1031R.drawable.abc_spinner_textfield_background_material) goto L56;
        if (m2253a(this.f3284b, r10) == false) goto L42;
        return AbstractC0849A0.m2162d(r9, C1031R.attr.colorControlNormal);
    L42:
        if (m2253a(this.f3287e, r10) == false) goto L46;
        return AbstractC0805P.m2049p(r9, C1031R.color.abc_tint_default);
    L46:
        if (m2253a(this.f3288f, r10) == false) goto L50;
        return AbstractC0805P.m2049p(r9, C1031R.color.abc_tint_btn_checkable);
    L50:
        if (r10 == C1031R.drawable.abc_seekbar_thumb_material) goto L52;
        return null;
    L52:
        return AbstractC0805P.m2049p(r9, C1031R.color.abc_tint_seek_thumb);
    L56:
        return AbstractC0805P.m2049p(r9, C1031R.color.abc_tint_spinner);
    }
}
