package p031c4;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: c4.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1319e {

    /* JADX INFO: renamed from: c4.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Set<int[]> m5301a() {
            return b.m5302a();
        }
    }

    /* JADX INFO: renamed from: c4.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Set m5302a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set set = (Set) objInvoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Set m5300a() {
        return Build.VERSION.SDK_INT >= 34 ? a.m5301a() : b.m5302a();
    }
}
