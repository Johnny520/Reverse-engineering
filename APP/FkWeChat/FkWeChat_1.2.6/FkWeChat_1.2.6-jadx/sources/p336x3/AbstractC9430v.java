package p336x3;

import android.content.Context;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: x3.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9430v {

    /* JADX INFO: renamed from: x3.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static float m36699a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* JADX INFO: renamed from: b */
        public static float m36700b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m36697a(ViewConfiguration viewConfiguration, Context context) {
        return a.m36699a(viewConfiguration);
    }

    /* JADX INFO: renamed from: b */
    public static float m36698b(ViewConfiguration viewConfiguration, Context context) {
        return a.m36700b(viewConfiguration);
    }
}
