package p335x2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p030c3.AbstractC1314a;

/* JADX INFO: renamed from: x2.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9338k {

    /* JADX INFO: renamed from: a */
    public static final C9338k f31945a = new C9338k();

    /* JADX INFO: renamed from: a */
    public final BoringLayout m36419a(CharSequence charSequence, TextPaint textPaint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        if (i10 < 0) {
            AbstractC1314a.m5291a("negative width");
        }
        if (i11 < 0) {
            AbstractC1314a.m5291a("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? C9335j.m36394a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : C9341l.m36430a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36420b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C9335j.m36396c(boringLayout);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final BoringLayout.Metrics m36421c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? C9335j.m36395b(charSequence, textPaint, textDirectionHeuristic) : C9341l.m36431b(charSequence, textPaint, textDirectionHeuristic);
    }
}
