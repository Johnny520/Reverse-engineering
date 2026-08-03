package p000;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import com.gyf.immersionbar.OSUtils;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: n5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2262n5 {

    /* JADX INFO: renamed from: a */
    public final int f7974a;

    /* JADX INFO: renamed from: b */
    public final int f7975b;

    /* JADX INFO: renamed from: c */
    public final boolean f7976c;

    /* JADX INFO: renamed from: d */
    public final int f7977d;

    /* JADX INFO: renamed from: e */
    public final int f7978e;

    /* JADX INFO: renamed from: f */
    public final boolean f7979f;

    /* JADX INFO: renamed from: g */
    public final float f7980g;

    public C2262n5(Activity r6) {
        boolean r1 = false;
        if (r6.getResources().getConfiguration().orientation != 1) goto L5;
        boolean r0 = true;
    L6:
        this.f7979f = r0;
        DisplayMetrics r02 = new DisplayMetrics();
        r6.getWindowManager().getDefaultDisplay().getRealMetrics(r02);
        float r3 = r02.widthPixels;
        float r4 = r02.density;
        this.f7980g = Math.min(r3 / r4, r02.heightPixels / r4);
        this.f7974a = m4599a(r6, "status_bar_height");
        View r03 = r6.getWindow().findViewById(R.id.action_bar_container);
        if (r03 == null) goto L9;
        int r04 = r03.getMeasuredHeight();
    L10:
        if (r04 != 0) goto L12;
        TypedValue r05 = new TypedValue();
        r6.getTheme().resolveAttribute(android.R.attr.actionBarSize, r05, true);
        r04 = TypedValue.complexToDimensionPixelSize(r05.data, r6.getResources().getDisplayMetrics());
    L12:
        this.f7975b = r04;
        if (m4600b(r6) == true) goto L15;
        int r06 = 0;
    L20:
        this.f7977d = r06;
        if (m4600b(r6) == false) goto L23;
        int r62 = m4599a(r6, "navigation_bar_width");
    L24:
        this.f7978e = r62;
        if (r06 <= 0) goto L27;
        r1 = true;
    L27:
        this.f7976c = r1;
        return;
    L23:
        r62 = 0;
        goto L24
    L15:
        if (r6.getResources().getConfiguration().orientation != 1) goto L17;
        String r07 = "navigation_bar_height";
    L18:
        r06 = m4599a(r6, r07);
        goto L20
    L17:
        r07 = "navigation_bar_height_landscape";
        goto L18
    L9:
        r04 = 0;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public static int m4599a(Context r4, String r5) {
        int r0 = Resources.getSystem().getIdentifier(r5, "dimen", "android");     // Catch: Resources.NotFoundException -> L20
        if (r0 <= 0) goto L18;
        int r1 = r4.getResources().getDimensionPixelSize(r0);     // Catch: Resources.NotFoundException -> L20
        int r02 = Resources.getSystem().getDimensionPixelSize(r0);     // Catch: Resources.NotFoundException -> L20
        if (r02 >= r1) goto L7;
    L11:
        float r03 = (r1 * Resources.getSystem().getDisplayMetrics().density) / r4.getResources().getDisplayMetrics().density;
        if (r03 < 0.0f) goto L15;
        float r04 = r03 + 0.5f;
    L17:
        return (int) r04;
    L15:
        r04 = r03 - 0.5f;
        goto L17
    L7:
        if (Build.VERSION.SDK_INT >= 29) goto L9;
    L10:
        return r02;
    L9:
        if (r5.equals("status_bar_height") == false) goto L11;
    L18:
        return 0;
    L23:
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4600b(Activity r8) {
        if (r8 != null) goto L5;
    L81:
        boolean r6 = false;
    L82:
        boolean r7 = r6;
    L83:
        if (r6 == true) goto L86;
        if (r7 == false) goto L86;
    L91:
        return false;
    L86:
        Display r82 = r8.getWindowManager().getDefaultDisplay();
        DisplayMetrics r2 = new DisplayMetrics();
        r82.getRealMetrics(r2);
        int r3 = r2.heightPixels;
        int r22 = r2.widthPixels;
        DisplayMetrics r4 = new DisplayMetrics();
        r82.getMetrics(r4);
        int r83 = r4.heightPixels;
        if ((r22 - r4.widthPixels) <= 0) goto L89;
    L92:
        return true;
    L89:
        if ((r3 - r83) <= 0) goto L91;
    L5:
        if (r8.getContentResolver() == null) goto L81;
        ContentResolver r23 = r8.getContentResolver();
        if (OSUtils.isHuaWei() == true) goto L66;
        if (OSUtils.isEMUI() == true) goto L66;
        if (OSUtils.isXiaoMi() == false) goto L14;
    L58:
        int r32 = Settings.Global.getInt(r23, "force_fsg_nav_bar", -1);
        if (r32 == 0) goto L31;
        if (r32 != 1) goto L31;
        if (Settings.Global.getInt(r23, "hide_gesture_line", -1) != 1) goto L35;
    L41:
        r6 = false;
    L36:
        r7 = true;
    L73:
        if (r32 != (-1)) goto L83;
        int r24 = Settings.Secure.getInt(r23, "navigation_mode", -1);
        if (r24 != 0) goto L77;
    L76:
        r7 = false;
        goto L83
    L77:
        if (r24 == 1) goto L76;
        if (r24 != 2) goto L83;
        r6 = true;
    L35:
        r6 = true;
    L31:
        r6 = false;
        r7 = false;
        goto L73
    L14:
        if (OSUtils.isMIUI() == true) goto L58;
        if (OSUtils.isVivo() == false) goto L19;
    L51:
        r32 = Settings.Secure.getInt(r23, "navigation_gesture_on", -1);
        if (r32 == 0) goto L31;
        if (r32 == 1) goto L41;
        if (r32 != 2) goto L31;
    L19:
        if (OSUtils.isFuntouchOrOriginOs() == true) goto L51;
        if (OSUtils.isOppo() == false) goto L24;
    L43:
        r32 = Settings.Secure.getInt(r23, "hide_navigationbar_enable", -1);
        if (r32 == 0) goto L31;
        if (r32 == 1) goto L41;
        if (r32 == 2) goto L41;
        if (r32 != 3) goto L31;
    L24:
        if (OSUtils.isColorOs() == true) goto L43;
        if (OSUtils.isSamsung() == false) goto L42;
        r32 = Settings.Global.getInt(r23, "navigation_bar_gesture_while_hidden", -1);
        if (r32 == (-1)) goto L37;
        if (r32 == 0) goto L31;
        if (r32 != 1) goto L31;
        Settings.Global.getInt(r23, "navigation_bar_gesture_detail_type", 1);
        if (Settings.Global.getInt(r23, "navigation_bar_gesture_hint", 1) != 1) goto L41;
    L37:
        r32 = Settings.Global.getInt(r23, "navigationbar_hide_bar_enabled", -1);
        if (r32 == 0) goto L31;
        if (r32 != 1) goto L31;
    L42:
        r6 = false;
        r7 = false;
        r32 = -1;
    L66:
        if (OSUtils.isEMUI3_x() == true) goto L68;
        r32 = Settings.Global.getInt(r23, "navigationbar_is_min", -1);
    L69:
        if (r32 == 0) goto L31;
        if (r32 != 1) goto L31;
    L68:
        r32 = Settings.System.getInt(r23, "navigationbar_is_min", -1);
        goto L69
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4601c() {
        if (this.f7980g < 600.0f) goto L5;
        return true;
    L5:
        if (this.f7979f == true) goto L11;
        return false;
    L11:
        return true;
    }
}
