package yyds;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.app.CustomCardView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛷᛳᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1521 implements InterfaceC1749 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Object f7339;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f7340;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Object f7341;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f7342;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f7343;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f7344;

    public C1521(int i) {
        switch (i) {
            case 1:
                this.f7342 = new AtomicBoolean(false);
                this.f7344 = new CountDownLatch(1);
                this.f7339 = "PublicSuffixDatabase.list";
                break;
            default:
                this.f7342 = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.f7344 = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f7340 = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.f7343 = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f7341 = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f7339 = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m3141(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static ColorStateList m3142(Context context, int i) {
        int iM4253 = AbstractC2251.m4253(context, R.attr.colorControlHighlight);
        int iM4252 = AbstractC2251.m4252(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC2251.f11097;
        int[] iArr2 = AbstractC2251.f11101;
        int iM4078 = AbstractC2138.m4078(iM4253, i);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC2251.f11099, AbstractC2251.f11100}, new int[]{iM4252, iM4078, AbstractC2138.m4078(iM4253, i), i});
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m3143(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM3175;
        int[] iArr = AbstractC2137.f10562;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C1541.f7386;
        }
        PorterDuff.Mode mode2 = C1541.f7386;
        synchronized (C1541.class) {
            porterDuffColorFilterM3175 = C1542.m3175(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterM3175);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static LayerDrawable m3144(C1542 c1542, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM3181 = c1542.m3181(context, R.drawable.abc_star_black_48dp);
        Drawable drawableM31812 = c1542.m3181(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableM3181 instanceof BitmapDrawable) && drawableM3181.getIntrinsicWidth() == dimensionPixelSize && drawableM3181.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM3181;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM3181.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM3181.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM31812 instanceof BitmapDrawable) && drawableM31812.getIntrinsicWidth() == dimensionPixelSize && drawableM31812.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM31812;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM31812.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM31812.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0809 m3145() throws IOException {
        C1966 c1966 = AbstractC1325.f6087;
        C1966 c19662 = AbstractC1325.f6087;
        if (c19662 == null) {
            c19662 = null;
        }
        Context context = c19662 != null ? c19662.f9864 : null;
        AssetManager assets = context != null ? context.getAssets() : null;
        if (assets != null) {
            return new C0809(assets.open((String) this.f7339), new C2755());
        }
        if (Build.FINGERPRINT == null) {
            C0188.m804("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        C0188.m804("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m3146() {
        try {
            C2066 c2066 = new C2066(m3145());
            try {
                C2534 c2534M3927 = c2066.m3927(c2066.m3922());
                C2534 c2534M39272 = c2066.m3927(c2066.m3922());
                c2066.close();
                synchronized (this) {
                    this.f7340 = c2534M3927;
                    this.f7343 = c2534M39272;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f7344).countDown();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ColorStateList m3147(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return C2810.m4942(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return C2810.m4942(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m3142(context, AbstractC2251.m4253(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m3142(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m3142(context, AbstractC2251.m4253(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return C2810.m4942(context, R.color.abc_tint_spinner);
            }
            if (m3141((int[]) this.f7344, i)) {
                return AbstractC2251.m4254(context, R.attr.colorControlNormal);
            }
            if (m3141((int[]) this.f7341, i)) {
                return C2810.m4942(context, R.color.abc_tint_default);
            }
            if (m3141((int[]) this.f7339, i)) {
                return C2810.m4942(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return C2810.m4942(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM4254 = AbstractC2251.m4254(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListM4254 == null || !colorStateListM4254.isStateful()) {
            iArr[0] = AbstractC2251.f11097;
            iArr2[0] = AbstractC2251.m4252(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC2251.f11095;
            iArr2[1] = AbstractC2251.m4253(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2251.f11100;
            iArr2[2] = AbstractC2251.m4253(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC2251.f11097;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM4254.getColorForState(iArr3, 0);
            iArr[1] = AbstractC2251.f11095;
            iArr2[1] = AbstractC2251.m4253(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC2251.f11100;
            iArr2[2] = colorStateListM4254.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public C1521(CustomCardView customCardView, ImageView imageView, View view, TextView textView, TextView textView2, TextView textView3) {
        this.f7342 = customCardView;
        this.f7344 = imageView;
        this.f7340 = view;
        this.f7343 = textView;
        this.f7341 = textView2;
        this.f7339 = textView3;
    }

    public C1521(ScrollView scrollView, EditText editText, ImageButton imageButton, Button button, EditText editText2, Button button2, EditText editText3) {
        this.f7342 = editText;
        this.f7344 = imageButton;
        this.f7340 = button;
        this.f7343 = editText2;
        this.f7341 = button2;
        this.f7339 = editText3;
    }
}
