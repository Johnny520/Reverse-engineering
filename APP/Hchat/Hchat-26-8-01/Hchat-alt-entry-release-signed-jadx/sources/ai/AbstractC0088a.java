package ai;

import android.graphics.RuntimeShader;
import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: renamed from: ai.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0088a {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.graphics.RuntimeShader) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ RuntimeShader m479e(Object obj) {
        return (RuntimeShader) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] (LINE:3) call: android.graphics.text.LineBreakConfig.Builder.<init>():void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ LineBreakConfig.Builder m480f() {
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
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ BoringLayout m484j(CharSequence charSequence, TextPaint textPaint, int i9, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z9, TextUtils.TruncateAt truncateAt, int i10) {
        return new BoringLayout(charSequence, textPaint, i9, alignment, 1.0f, 0.0f, metrics, z9, truncateAt, i10, true);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] (LINE:3) call: android.view.inputmethod.EditorBoundsInfo.Builder.<init>():void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ EditorBoundsInfo.Builder m487m() {
        return new EditorBoundsInfo.Builder();
    }
}
