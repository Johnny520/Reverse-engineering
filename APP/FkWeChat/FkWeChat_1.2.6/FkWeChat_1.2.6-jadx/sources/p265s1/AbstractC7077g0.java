package p265s1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: renamed from: s1.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7077g0 {
    /* JADX INFO: renamed from: a */
    public static final ColorFilter m27878a(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? C7063d1.f23494a.m27779a(j10, i10) : new PorterDuffColorFilter(AbstractC7138s1.m28205i(j10), AbstractC7062d0.m27778b(i10));
    }

    /* JADX INFO: renamed from: b */
    public static final ColorFilter m27879b(AbstractC7133r1 abstractC7133r1) {
        return abstractC7133r1.m28190a();
    }
}
