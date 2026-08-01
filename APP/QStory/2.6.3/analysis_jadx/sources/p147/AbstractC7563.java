package p147;

import android.util.Log;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.AbstractC4396;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f20472 = AbstractC4396.f12975.mo8917(AbstractC7563.class).getSimpleName();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m12792() {
        String str = f20472;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (AbstractC7566.f20478 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (AbstractC7566.f20478 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (AbstractC7566.f20478 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
