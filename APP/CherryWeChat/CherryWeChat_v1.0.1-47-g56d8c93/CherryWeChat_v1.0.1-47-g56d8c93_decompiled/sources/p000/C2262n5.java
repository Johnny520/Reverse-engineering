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

    public C2262n5(Activity activity) {
        int iM4599a;
        this.f7979f = activity.getResources().getConfiguration().orientation == 1;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        this.f7980g = Math.min(f / f2, displayMetrics.heightPixels / f2);
        this.f7974a = m4599a(activity, "status_bar_height");
        View viewFindViewById = activity.getWindow().findViewById(R.id.action_bar_container);
        int measuredHeight = viewFindViewById != null ? viewFindViewById.getMeasuredHeight() : 0;
        if (measuredHeight == 0) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
            measuredHeight = TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
        }
        this.f7975b = measuredHeight;
        if (m4600b(activity)) {
            iM4599a = m4599a(activity, activity.getResources().getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape");
        } else {
            iM4599a = 0;
        }
        this.f7977d = iM4599a;
        this.f7978e = m4600b(activity) ? m4599a(activity, "navigation_bar_width") : 0;
        this.f7976c = iM4599a > 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m4599a(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
            int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
            if (dimensionPixelSize2 >= dimensionPixelSize && (Build.VERSION.SDK_INT < 29 || str.equals("status_bar_height"))) {
                return dimensionPixelSize2;
            }
            float f = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
            return (int) (f >= 0.0f ? f + 0.5f : f - 0.5f);
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (r3 != 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
    
        if (r3 != 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        if (r3 != 2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c7, code lost:
    
        if (r3 != 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a A[PHI: r3
  0x006a: PHI (r3v16 int) = (r3v15 int), (r3v29 int) binds: [B:63:0x00b0, B:34:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079 A[PHI: r3
  0x0079: PHI (r3v7 int) = (r3v5 int), (r3v15 int), (r3v20 int), (r3v20 int), (r3v24 int), (r3v24 int), (r3v24 int), (r3v31 int), (r3v29 int) binds: [B:71:0x00c7, B:63:0x00b0, B:54:0x0099, B:56:0x009c, B:46:0x0088, B:47:0x008a, B:49:0x008d, B:40:0x0077, B:34:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4600b(Activity activity) {
        boolean z;
        boolean z2;
        int i;
        DisplayMetrics displayMetrics;
        int i2;
        if (activity != null && activity.getContentResolver() != null) {
            ContentResolver contentResolver = activity.getContentResolver();
            if (OSUtils.isHuaWei() || OSUtils.isEMUI()) {
                i2 = !OSUtils.isEMUI3_x() ? Settings.Global.getInt(contentResolver, "navigationbar_is_min", -1) : Settings.System.getInt(contentResolver, "navigationbar_is_min", -1);
                if (i2 != 0) {
                }
                z = false;
                z2 = false;
                if (i2 == -1) {
                    int i3 = Settings.Secure.getInt(contentResolver, "navigation_mode", -1);
                    if (i3 == 0 || i3 == 1) {
                        z2 = false;
                    } else if (i3 == 2) {
                        z = true;
                    }
                }
            } else if (OSUtils.isXiaoMi() || OSUtils.isMIUI()) {
                i2 = Settings.Global.getInt(contentResolver, "force_fsg_nav_bar", -1);
                if (i2 != 0 && i2 == 1) {
                    z = Settings.Global.getInt(contentResolver, "hide_gesture_line", -1) != 1;
                    z2 = true;
                    if (i2 == -1) {
                    }
                }
                z = false;
                z2 = false;
                if (i2 == -1) {
                }
            } else if (OSUtils.isVivo() || OSUtils.isFuntouchOrOriginOs()) {
                i2 = Settings.Secure.getInt(contentResolver, "navigation_gesture_on", -1);
                if (i2 != 0) {
                    if (i2 != 1) {
                    }
                    z2 = true;
                    if (i2 == -1) {
                    }
                }
                z = false;
                z2 = false;
                if (i2 == -1) {
                }
            } else if (OSUtils.isOppo() || OSUtils.isColorOs()) {
                i2 = Settings.Secure.getInt(contentResolver, "hide_navigationbar_enable", -1);
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                        }
                    }
                    z2 = true;
                    if (i2 == -1) {
                    }
                }
                z = false;
                z2 = false;
                if (i2 == -1) {
                }
            } else if (OSUtils.isSamsung()) {
                i2 = Settings.Global.getInt(contentResolver, "navigation_bar_gesture_while_hidden", -1);
                if (i2 != -1) {
                    if (i2 != 0 && i2 == 1) {
                        Settings.Global.getInt(contentResolver, "navigation_bar_gesture_detail_type", 1);
                        if (Settings.Global.getInt(contentResolver, "navigation_bar_gesture_hint", 1) == 1) {
                        }
                        z2 = true;
                        if (i2 == -1) {
                        }
                    }
                    z = false;
                    z2 = false;
                    if (i2 == -1) {
                    }
                } else {
                    i2 = Settings.Global.getInt(contentResolver, "navigationbar_hide_bar_enabled", -1);
                    if (i2 != 0) {
                    }
                    z = false;
                    z2 = false;
                    if (i2 == -1) {
                    }
                }
            } else {
                z = false;
                z2 = false;
                i2 = -1;
                if (i2 == -1) {
                }
            }
            if (!z || !z2) {
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics2);
                int i4 = displayMetrics2.heightPixels;
                i = displayMetrics2.widthPixels;
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i5 = displayMetrics.heightPixels;
                if (i - displayMetrics.widthPixels <= 0 || i4 - i5 > 0) {
                    return true;
                }
            }
            return false;
        }
        z = false;
        z2 = z;
        if (!z) {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics22 = new DisplayMetrics();
            defaultDisplay2.getRealMetrics(displayMetrics22);
            int i42 = displayMetrics22.heightPixels;
            i = displayMetrics22.widthPixels;
            displayMetrics = new DisplayMetrics();
            defaultDisplay2.getMetrics(displayMetrics);
            int i52 = displayMetrics.heightPixels;
            if (i - displayMetrics.widthPixels <= 0) {
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4601c() {
        return this.f7980g >= 600.0f || this.f7979f;
    }
}
