package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m253(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m254(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }
}
