package p000;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: renamed from: d4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0117d4 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LineBreakConfig.Builder m939a() {
        return new LineBreakConfig.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BoringLayout m943e(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ EditorBoundsInfo.Builder m946h() {
        return new EditorBoundsInfo.Builder();
    }
}
