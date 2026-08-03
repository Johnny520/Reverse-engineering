package p000a;

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
import android.util.Log;
import androidx.appcompat.C0983R;

/* JADX INFO: renamed from: a.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0434Y0 {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f1630b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0434Y0 f1631c;

    /* JADX INFO: renamed from: a */
    public C0768pd f1632a;

    /* JADX INFO: renamed from: a.Y0$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public final int[] f1633a = {C0983R.drawable.abc_textfield_search_default_mtrl_alpha, C0983R.drawable.abc_textfield_default_mtrl_alpha, C0983R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b */
        public final int[] f1634b = {C0983R.drawable.abc_ic_commit_search_api_mtrl_alpha, C0983R.drawable.abc_seekbar_tick_mark_material, C0983R.drawable.abc_ic_menu_share_mtrl_alpha, C0983R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C0983R.drawable.abc_ic_menu_cut_mtrl_alpha, C0983R.drawable.abc_ic_menu_selectall_mtrl_alpha, C0983R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c */
        public final int[] f1635c = {C0983R.drawable.abc_textfield_activated_mtrl_alpha, C0983R.drawable.abc_textfield_search_activated_mtrl_alpha, C0983R.drawable.abc_cab_background_top_mtrl_alpha, C0983R.drawable.abc_text_cursor_material, C0983R.drawable.abc_text_select_handle_left_mtrl, C0983R.drawable.abc_text_select_handle_middle_mtrl, C0983R.drawable.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: d */
        public final int[] f1636d = {C0983R.drawable.abc_popup_background_mtrl_mult, C0983R.drawable.abc_cab_background_internal_bg, C0983R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e */
        public final int[] f1637e = {C0983R.drawable.abc_tab_indicator_material, C0983R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f */
        public final int[] f1638f = {C0983R.drawable.abc_btn_check_material, C0983R.drawable.abc_btn_radio_material, C0983R.drawable.abc_btn_check_material_anim, C0983R.drawable.abc_btn_radio_material_anim};

        /* JADX INFO: renamed from: a */
        public static boolean m1085a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static ColorStateList m1086b(Context context, int i) {
            int iM1313c = C0542df.m1313c(context, C0983R.attr.colorControlHighlight);
            int iM1312b = C0542df.m1312b(context, C0983R.attr.colorButtonNormal);
            int[] iArr = C0542df.f1950b;
            int[] iArr2 = C0542df.f1952d;
            int iM2084b = C0872v3.m2084b(iM1313c, i);
            return new ColorStateList(new int[][]{iArr, iArr2, C0542df.f1951c, C0542df.f1954f}, new int[]{iM1312b, iM2084b, C0872v3.m2084b(iM1313c, i), i});
        }

        /* JADX INFO: renamed from: c */
        public static LayerDrawable m1087c(C0768pd c0768pd, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableM1809c = c0768pd.m1809c(context, C0983R.drawable.abc_star_black_48dp);
            Drawable drawableM1809c2 = c0768pd.m1809c(context, C0983R.drawable.abc_star_half_black_48dp);
            if ((drawableM1809c instanceof BitmapDrawable) && drawableM1809c.getIntrinsicWidth() == dimensionPixelSize && drawableM1809c.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM1809c;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM1809c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM1809c.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM1809c2 instanceof BitmapDrawable) && drawableM1809c2.getIntrinsicWidth() == dimensionPixelSize && drawableM1809c2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM1809c2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM1809c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM1809c2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: e */
        public static void m1088e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C0434Y0.f1630b;
            }
            drawableMutate.setColorFilter(C0434Y0.m1081c(i, mode));
        }

        /* JADX INFO: renamed from: d */
        public final ColorStateList m1089d(Context context, int i) {
            if (i == C0983R.drawable.abc_edit_text_material) {
                return C0437Y3.m1091a(context, C0983R.color.abc_tint_edittext);
            }
            if (i == C0983R.drawable.abc_switch_track_mtrl_alpha) {
                return C0437Y3.m1091a(context, C0983R.color.abc_tint_switch_track);
            }
            if (i != C0983R.drawable.abc_switch_thumb_material) {
                if (i == C0983R.drawable.abc_btn_default_mtrl_shape) {
                    return m1086b(context, C0542df.m1313c(context, C0983R.attr.colorButtonNormal));
                }
                if (i == C0983R.drawable.abc_btn_borderless_material) {
                    return m1086b(context, 0);
                }
                if (i == C0983R.drawable.abc_btn_colored_material) {
                    return m1086b(context, C0542df.m1313c(context, C0983R.attr.colorAccent));
                }
                if (i == C0983R.drawable.abc_spinner_mtrl_am_alpha || i == C0983R.drawable.abc_spinner_textfield_background_material) {
                    return C0437Y3.m1091a(context, C0983R.color.abc_tint_spinner);
                }
                if (m1085a(this.f1634b, i)) {
                    return C0542df.m1314d(context, C0983R.attr.colorControlNormal);
                }
                if (m1085a(this.f1637e, i)) {
                    return C0437Y3.m1091a(context, C0983R.color.abc_tint_default);
                }
                if (m1085a(this.f1638f, i)) {
                    return C0437Y3.m1091a(context, C0983R.color.abc_tint_btn_checkable);
                }
                if (i == C0983R.drawable.abc_seekbar_thumb_material) {
                    return C0437Y3.m1091a(context, C0983R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListM1314d = C0542df.m1314d(context, C0983R.attr.colorSwitchThumbNormal);
            if (colorStateListM1314d == null || !colorStateListM1314d.isStateful()) {
                iArr[0] = C0542df.f1950b;
                iArr2[0] = C0542df.m1312b(context, C0983R.attr.colorSwitchThumbNormal);
                iArr[1] = C0542df.f1953e;
                iArr2[1] = C0542df.m1313c(context, C0983R.attr.colorControlActivated);
                iArr[2] = C0542df.f1954f;
                iArr2[2] = C0542df.m1313c(context, C0983R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = C0542df.f1950b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM1314d.getColorForState(iArr3, 0);
                iArr[1] = C0542df.f1953e;
                iArr2[1] = C0542df.m1313c(context, C0983R.attr.colorControlActivated);
                iArr[2] = C0542df.f1954f;
                iArr2[2] = colorStateListM1314d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0434Y0 m1080a() {
        try {
            if (f1631c == null) {
                m1082d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1631c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m1081c(int i, PorterDuff.Mode mode) {
        return C0768pd.m1807e(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m1082d() {
        if (f1631c == null) {
            C0434Y0 c0434y0 = new C0434Y0();
            f1631c = c0434y0;
            c0434y0.f1632a = C0768pd.m1806b();
            C0768pd c0768pd = f1631c.f1632a;
            a aVar = new a();
            synchronized (c0768pd) {
                c0768pd.f3041e = aVar;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1083e(Drawable drawable, C0713mf c0713mf, int[] iArr) {
        PorterDuff.Mode mode = C0768pd.f3034f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c0713mf.f2696d;
        if (!z && !c0713mf.f2695c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM1807e = null;
        ColorStateList colorStateList = z ? c0713mf.f2693a : null;
        PorterDuff.Mode mode2 = c0713mf.f2695c ? c0713mf.f2694b : C0768pd.f3034f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM1807e = C0768pd.m1807e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM1807e);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m1084b(Context context, int i) {
        return this.f1632a.m1809c(context, i);
    }
}
