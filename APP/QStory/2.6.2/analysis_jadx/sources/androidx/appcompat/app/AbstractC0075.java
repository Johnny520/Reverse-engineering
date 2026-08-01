package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m252(Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m253(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }
}
