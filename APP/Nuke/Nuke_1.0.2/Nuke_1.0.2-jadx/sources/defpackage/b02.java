package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b02 implements bs0 {
    public final View a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b02(View view) {
        this.a = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        int i2;
        int i3 = 0;
        if (i == 16) {
            i2 = 16;
        } else if (i == 6) {
            i2 = 6;
        } else if (i == 13) {
            i2 = 13;
        } else {
            i2 = 23;
            if (i != 23) {
                i2 = 3;
                if (i != 3) {
                    if (i == 0) {
                        i2 = 0;
                    } else if (i == 17) {
                        i2 = 17;
                    } else {
                        i2 = 27;
                        if (i != 27) {
                            i2 = 26;
                            if (i != 26) {
                                i2 = 9;
                                if (i != 9) {
                                    i2 = 22;
                                    if (i != 22) {
                                        i2 = 21;
                                        if (i != 21) {
                                            i2 = i == 1 ? 1 : -1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i4 = wa3.a;
        if (i2 == -1) {
            i3 = -1;
        } else {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 34) {
                switch (i2) {
                    case 21:
                    case 23:
                    case 26:
                        i2 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i2 = 4;
                        break;
                    case 25:
                        i2 = 0;
                        break;
                }
            }
            if (i5 >= 30) {
                i3 = i2;
            } else if (i2 == 12) {
                i3 = 1;
            } else if (i2 == 13) {
                i3 = 6;
            } else if (i2 != 16) {
                if (i2 != 17) {
                }
            }
        }
        if (i3 == -1) {
            return;
        }
        this.a.performHapticFeedback(i3);
    }
}
