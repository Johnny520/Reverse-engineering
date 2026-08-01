package p212;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.text.input.C2019;
import p196.C7841;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Layout f22001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C2019 f22002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f22003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextUtils.TruncateAt f22005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextPaint f22006;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int f22007;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Paint.FontMetricsInt f22008;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1245 f22009;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7841[] f22010;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Rect f22011 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f22012;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f22013;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f22014;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f22015;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f22016;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float f22017;

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
    public C7951(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, p212.C7941 r35) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p212.C7951.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世兰哲苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m13439(int i) {
        ThreadLocal threadLocal = AbstractC7949.f21999;
        Layout layout = this.f22001;
        return (layout.getEllipsisCount(i) <= 0 || this.f22005 != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m13440(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f22013;
        int i3 = i2 - 1;
        Layout layout = this.f22001;
        if (i != i3 || (fontMetricsInt = this.f22008) == null) {
            return this.f22012 + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f22016 : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m13441(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f22012 + ((i != this.f22013 + (-1) || (fontMetricsInt = this.f22008) == null) ? this.f22001.getLineBaseline(i) : m13446(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1245 m13442() {
        C1245 c1245 = this.f22009;
        if (c1245 != null) {
            return c1245;
        }
        C1245 c12452 = new C1245(this.f22001);
        this.f22009 = c12452;
        return c12452;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m13443(int i) {
        if (i == this.f22013 - 1) {
            return this.f22017 + this.f22014;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13444() {
        boolean z = this.f22003;
        Layout layout = this.f22001;
        return (z ? layout.getLineBottom(this.f22013 - 1) : layout.getHeight()) + this.f22012 + this.f22016 + this.f22007;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float m13445(int i, boolean z) {
        return m13443(this.f22001.getLineForOffset(i)) + m13442().m2165(i, true, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float m13446(int i) {
        return this.f22001.getLineTop(i) + (i == 0 ? 0 : this.f22012);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m13447(int i, boolean z) {
        return m13443(this.f22001.getLineForOffset(i)) + m13442().m2165(i, false, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C2019 m13448() {
        C2019 c2019 = this.f22002;
        if (c2019 != null) {
            return c2019;
        }
        Layout layout = this.f22001;
        C2019 c20192 = new C2019(layout.getText(), layout.getText().length(), this.f22006.getTextLocale());
        this.f22002 = c20192;
        return c20192;
    }
}
