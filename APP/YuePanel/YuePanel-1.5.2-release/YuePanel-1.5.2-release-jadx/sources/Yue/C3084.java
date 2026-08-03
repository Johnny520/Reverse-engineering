package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C3084 {

    /* JADX INFO: renamed from: ۥ */
    public Context f66;

    public C3084(Context context) {
        this.f66 = context;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C3084 m170(Context context) {
        return new C3084(context);
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m171() {
        return this.f66.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m6257() {
        return this.f66.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m6258() {
        Configuration configuration = this.f66.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m6259() {
        return this.f66.getResources().getDimensionPixelSize(C6898.C6901.f18712);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m6260() {
        TypedArray typedArrayObtainStyledAttributes = this.f66.obtainStyledAttributes(null, C6898.C6909.f2460, C6898.C1110.f18355, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C6898.C6909.f19379, 0);
        Resources resources = this.f66.getResources();
        if (!m6261()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C6898.C6901.f18711));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m6261() {
        return this.f66.getResources().getBoolean(C6898.C6899.f2440);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m6262() {
        return true;
    }
}
