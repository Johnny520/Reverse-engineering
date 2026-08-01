package p000;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0983z0 {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] (LINE:3) call: android.graphics.text.LineBreakConfig.Builder.<init>():void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LineBreakConfig.Builder m5347a() {
        return new LineBreakConfig.Builder();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r12v0 java.lang.CharSequence)
  (r13v0 android.text.TextPaint)
  (r14v0 int)
  (r15v0 android.text.Layout$Alignment)
  (1.0f float)
  (0.0f float)
  (r16v0 android.text.BoringLayout$Metrics)
  (r17v0 boolean)
  (r18v0 android.text.TextUtils$TruncateAt)
  (r19v0 int)
  true
 A[MD:(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, android.text.BoringLayout$Metrics, boolean, android.text.TextUtils$TruncateAt, int, boolean):void (c)] (LINE:19) call: android.text.BoringLayout.<init>(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, android.text.BoringLayout$Metrics, boolean, android.text.TextUtils$TruncateAt, int, boolean):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BoringLayout m5351e(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }
}
