package p212;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.text.input.C2019;
import p196.C7840;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7950 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Layout f22004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C2019 f22005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f22006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextUtils.TruncateAt f22008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextPaint f22009;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f22010;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Paint.FontMetricsInt f22011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1245 f22012;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7840[] f22013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Rect f22014 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f22015;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f22016;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f22017;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f22018;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f22019;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float f22020;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019f A[PHI: r14
  0x019f: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:96:0x01b1, B:89:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7950(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, p212.C7940 r35) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p212.C7950.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世兰哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m13411(int i) {
        ThreadLocal threadLocal = AbstractC7948.f22002;
        Layout layout = this.f22004;
        return (layout.getEllipsisCount(i) <= 0 || this.f22008 != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m13412(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f22016;
        int i3 = i2 - 1;
        Layout layout = this.f22004;
        if (i != i3 || (fontMetricsInt = this.f22011) == null) {
            return this.f22015 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f22019 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m13413(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f22015 + ((i != this.f22016 + (-1) || (fontMetricsInt = this.f22011) == null) ? this.f22004.getLineBaseline(i) : m13418(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1245 m13414() {
        C1245 c1245 = this.f22012;
        if (c1245 != null) {
            return c1245;
        }
        C1245 c12452 = new C1245(this.f22004);
        this.f22012 = c12452;
        return c12452;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m13415(int i) {
        if (i == this.f22016 - 1) {
            return this.f22020 + this.f22017;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13416() {
        boolean z = this.f22006;
        Layout layout = this.f22004;
        return (z ? layout.getLineBottom(this.f22016 - 1) : layout.getHeight()) + this.f22015 + this.f22019 + this.f22010;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m13417(int i, boolean z) {
        return m13415(this.f22004.getLineForOffset(i)) + m13414().m2155(i, true, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float m13418(int i) {
        return this.f22004.getLineTop(i) + (i == 0 ? 0 : this.f22015);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m13419(int i, boolean z) {
        return m13415(this.f22004.getLineForOffset(i)) + m13414().m2155(i, false, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C2019 m13420() {
        C2019 c2019 = this.f22005;
        if (c2019 != null) {
            return c2019;
        }
        Layout layout = this.f22004;
        C2019 c20192 = new C2019(layout.getText(), layout.getText().length(), this.f22009.getTextLocale());
        this.f22005 = c20192;
        return c20192;
    }
}
