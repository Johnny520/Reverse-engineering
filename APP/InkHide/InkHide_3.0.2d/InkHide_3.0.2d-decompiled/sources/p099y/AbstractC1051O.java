package p099y;

import android.os.Build;
import android.util.Log;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: y.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1051O {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3667a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }
}
