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

    public C0252Fu(String r1, AbstractC2744y6 r2, EnumC0888Um r3, EnumC2773yt r4, Integer r5) {
        this.f819a = r1;
        this.f820b = AbstractC2751yD.m5333b(r1);
        this.f821c = r2;
        this.f822d = r3;
        this.f823e = r4;
        this.f824f = r5;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m523b(int[] r4, int r5) {
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

    /* JADX INFO: renamed from: d */
    public static C0252Fu m524d(String r6, AbstractC2744y6 r7, EnumC0888Um r8, EnumC2773yt r9, Integer r10) {
        if (r9 != EnumC2773yt.f9420e) goto L8;
        if (r10 == null) goto L10;
        throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
    L10:
        return new C0252Fu(r6, r7, r8, r9, r10);
    L8:
        if (r10 != null) goto L10;
        throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
    }

    /* JADX INFO: renamed from: e */
    public static ColorStateList m525e(Context r6, int r7) {
        int r0 = AbstractC1042YA.m1989c(r6, R.attr.colorControlHighlight);
        int r62 = AbstractC1042YA.m1988b(r6, R.attr.colorButtonNormal);
        int[] r1 = AbstractC1042YA.f3325b;
        int[] r2 = AbstractC1042YA.f3327d;
        int r3 = AbstractC2797za.m5365c(r0, r7);
        int[] r4 = AbstractC1042YA.f3326c;
        int r02 = AbstractC2797za.m5365c(r0, r7);
        return new ColorStateList(new int[][]{r1, r2, r4, AbstractC1042YA.f3329f}, new int[]{r62, r3, r02, r7});
    }

    /* JADX INFO: renamed from: f */
    public static LayerDrawable m526f(C2776yw r4, Context r5, int r6) {
        int r62 = r5.getResources().getDimensionPixelSize(r6);
        Drawable r0 = r4.m5350c(r5, R.drawable.abc_star_black_48dp);
        Drawable r42 = r4.m5350c(r5, R.drawable.abc_star_half_black_48dp);
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

    /* JADX INFO: renamed from: j */
    public static void m527j(Drawable r0, int r1, PorterDuff.Mode r2) {
        Drawable r02 = r0.mutate();
        if (r2 != null) goto L5;
        r2 = C0262G3.f842b;
    L5:
        r02.setColorFilter(C0262G3.m540c(r1, r2));
    }

    /* JADX INFO: renamed from: a */
    public void m528a(Activity r4) {
        C1981r r0 = ((C2029a) this.f824f).m4173a();
    L12:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L15
    L17:
        throw th;
    L15:
        th = move-exception;
        th.addSuppressed(th);
        goto L17
    L4:
        if (m531h() == true) goto L7;
        r0.close();
        return;
    L7:
        m532i(new RunnableC1685b(this, r4, 0), "FrameMetricsAggregator.add");     // Catch: Throwable -> L12
        C1687c r1 = m529c();     // Catch: Throwable -> L12
        if (r1 == null) goto L10;
        ((WeakHashMap) this.f822d).put(r4, r1);     // Catch: Throwable -> L12
    L10:
        r0.close();
    }

    /* JADX INFO: renamed from: c */
    public C1687c m529c() {
        if (m531h() == false) goto L31;
        FrameMetricsAggregator r0 = (FrameMetricsAggregator) this.f819a;
        if (r0 != null) goto L9;
        return null;
    L9:
        SparseIntArray[] r02 = (SparseIntArray[]) r0.f3910a.f1893b;
        int r2 = 0;
        if (r02.length <= 0) goto L24;
        SparseIntArray r03 = r02[0];
        if (r03 == null) goto L24;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
    L15:
        if (r2 >= r03.size()) goto L23;
        int r5 = r03.keyAt(r2);
        int r6 = r03.valueAt(r2);
        r1 = r1 + r6;
        if (r5 <= 700) goto L20;
        r4 = r4 + r6;
    L22:
        r2 = r2 + 1;
        goto L15
    L20:
        if (r5 <= 16) goto L22;
        r3 = r3 + r6;
        goto L22
    L23:
        r2 = r1;
    L26:
        return new C1687c(r2, r3, r4);
    L24:
        r3 = 0;
        r4 = 0;
        goto L26
    L31:
        return null;
    }

    /* JADX INFO: renamed from: g */
    public ColorStateList m530g(Context r9, int r10) {
        if (r10 != R.drawable.abc_edit_text_material) goto L7;
        return AbstractC0295Gu.m622o(r9, R.color.abc_tint_edittext);
    L7:
        if (r10 != R.drawable.abc_switch_track_mtrl_alpha) goto L11;
        return AbstractC0295Gu.m622o(r9, R.color.abc_tint_switch_track);
    L11:
        if (r10 != R.drawable.abc_switch_thumb_material) goto L21;
        int[][] r0 = new int[3][];
        int[] r102 = new int[3];
        ColorStateList r3 = AbstractC1042YA.m1990d(r9, R.attr.colorSwitchThumbNormal);
        if (r3 != null) goto L15;
    L17:
        r0[0] = AbstractC1042YA.f3325b;
        r102[0] = AbstractC1042YA.m1988b(r9, R.attr.colorSwitchThumbNormal);
        r0[1] = AbstractC1042YA.f3328e;
        r102[1] = AbstractC1042YA.m1989c(r9, R.attr.colorControlActivated);
        r0[2] = AbstractC1042YA.f3329f;
        r102[2] = AbstractC1042YA.m1989c(r9, R.attr.colorSwitchThumbNormal);
    L19:
        return new ColorStateList(r0, r102);
    L15:
        if (r3.isStateful() == false) goto L17;
        int[] r2 = AbstractC1042YA.f3325b;
        r0[0] = r2;
        r102[0] = r3.getColorForState(r2, 0);
        r0[1] = AbstractC1042YA.f3328e;
        r102[1] = AbstractC1042YA.m1989c(r9, R.attr.colorControlActivated);
        r0[2] = AbstractC1042YA.f3329f;
        r102[2] = r3.getDefaultColor();
        goto L19
    L21:
        if (r10 != R.drawable.abc_btn_default_mtrl_shape) goto L25;
        return m525e(r9, AbstractC1042YA.m1989c(r9, R.attr.colorButtonNormal));
    L25:
        if (r10 != R.drawable.abc_btn_borderless_material) goto L29;
        return m525e(r9, 0);
    L29:
        if (r10 != R.drawable.abc_btn_colored_material) goto L33;
        return m525e(r9, AbstractC1042YA.m1989c(r9, R.attr.colorAccent));
    L33:
        if (r10 == R.drawable.abc_spinner_mtrl_am_alpha) goto L56;
        if (r10 == R.drawable.abc_spinner_textfield_background_material) goto L56;
        if (m523b((int[]) this.f820b, r10) == false) goto L42;
        return AbstractC1042YA.m1990d(r9, R.attr.colorControlNormal);
    L42:
        if (m523b((int[]) this.f823e, r10) == false) goto L46;
        return AbstractC0295Gu.m622o(r9, R.color.abc_tint_default);
    L46:
        if (m523b((int[]) this.f824f, r10) == false) goto L50;
        return AbstractC0295Gu.m622o(r9, R.color.abc_tint_btn_checkable);
    L50:
        if (r10 == R.drawable.abc_seekbar_thumb_material) goto L52;
        return null;
    L52:
        return AbstractC0295Gu.m622o(r9, R.color.abc_tint_seek_thumb);
    L56:
        return AbstractC0295Gu.m622o(r9, R.color.abc_tint_spinner);
    }

    /* JADX INFO: renamed from: h */
    public boolean m531h() {
        SentryAndroidOptions r0 = (SentryAndroidOptions) this.f820b;
        if (((FrameMetricsAggregator) this.f819a) != null) goto L5;
        return false;
    L5:
        if (r0.isEnableFramesTracking() == true) goto L7;
        return false;
    L7:
        if (r0.isEnablePerformanceV2() == true) goto L13;
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m532i(Runnable r4, String r5) {
    L8:
        if (r5 == null) goto L12;
        ((SentryAndroidOptions) this.f820b).getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to execute ".concat(r5), new Object[0]);
        return;
    L12:
        return;
    L3:
        if (C1716d.f6223a.mo3902c() == false) goto L6;
        r4.run();     // Catch: Throwable -> L8
        return;
    L6:
        C1666I r0 = (C1666I) this.f823e;     // Catch: Throwable -> L8
        RunnableC1684a0 r1 = new RunnableC1684a0(this, r4, r5, 1);     // Catch: Throwable -> L8
        ((Handler) r0.f5974a).post(r1);     // Catch: Throwable -> L8
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

    public C0252Fu(SentryAndroidOptions r4) {
        C1666I r0 = new C1666I();
        this.f819a = null;
        this.f821c = new ConcurrentHashMap();
        this.f822d = new WeakHashMap();
        this.f824f = new C2029a();
        if (C1891i.m4095e("androidx.core.app.FrameMetricsAggregator", r4.getLogger()) == false) goto L5;
        this.f819a = new FrameMetricsAggregator();
    L5:
        this.f820b = r4;
        this.f823e = r0;
    }
}
