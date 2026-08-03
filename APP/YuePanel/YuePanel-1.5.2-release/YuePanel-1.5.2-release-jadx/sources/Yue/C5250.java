package Yue;

import Yue.InterfaceC7144;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5250 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1366 = -1;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1367 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12493 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f12494 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f12495 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f12496 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f12497 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f12498 = 7;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f12499 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f12500 = 9;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f12501 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f12502 = 13;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f12503 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f12504 = 17;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f12505 = 21;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f12506 = 22;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f12507 = 23;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f12508 = 24;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f12509 = 25;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f12510 = 26;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f12511 = 27;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC8392
    public static final int f12512 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC8392
    public static final int f12513 = 27;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f12514 = 1;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡۧ$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0682 {
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۡۧ$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0683 {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2011(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 6;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (i2 >= 30) {
            i3 = i;
        } else if (i == 12) {
            i3 = 1;
        } else if (i != 13) {
            if (i != 16) {
                if (i == 17) {
                    i3 = 0;
                }
            }
        }
        if (i2 >= 27 || !(i3 == 7 || i3 == 8 || i3 == 9)) {
            return i3;
        }
        return -1;
    }
}
