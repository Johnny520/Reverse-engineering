package p124;

import android.os.Build;
import android.view.View;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8144 implements InterfaceC8146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f19851;

    public C8144(View view) {
        this.f19851 = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13068(int i) {
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
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        if (i2 == -1) {
            i3 = -1;
        } else {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 34) {
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
            if (i4 >= 30) {
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
        this.f19851.performHapticFeedback(i3);
    }
}
