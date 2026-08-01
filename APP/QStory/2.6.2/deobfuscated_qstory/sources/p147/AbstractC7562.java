package p147;

import android.util.Log;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f20477 = AbstractC4395.f12971.mo8927(AbstractC7562.class).getSimpleName();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12763() {
        String str = f20477;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (AbstractC7565.f20483 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (AbstractC7565.f20483 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (AbstractC7565.f20483 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
