package p030F1;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: renamed from: F1.m */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0448m {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LineBreakConfig.Builder m717a() {
        return new LineBreakConfig.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BoringLayout m721e(CharSequence charSequence, TextPaint textPaint, int i5, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z5, TextUtils.TruncateAt truncateAt, int i6) {
        return new BoringLayout(charSequence, textPaint, i5, alignment, 1.0f, 0.0f, metrics, z5, truncateAt, i6, true);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ EditorBoundsInfo.Builder m724h() {
        return new EditorBoundsInfo.Builder();
    }
}
