package p163;

import android.util.Log;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.AbstractC5228;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f20817 = AbstractC5228.f13320.mo9476(AbstractC8392.class).getSimpleName();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m13351() {
        String str = f20817;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (AbstractC8395.f20823 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (AbstractC8395.f20823 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (AbstractC8395.f20823 != VerificationMode.LOG) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
