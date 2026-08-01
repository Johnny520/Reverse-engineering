package p096T0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import p014C1.C0240b;
import p101U0.C1470e;
import p106V0.C1494h;
import p149d3.AbstractC1976d;

/* JADX INFO: renamed from: T0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1410j {

    /* JADX INFO: renamed from: a */
    public final TextPaint f5039a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f5040b;

    /* JADX INFO: renamed from: c */
    public final boolean f5041c;

    /* JADX INFO: renamed from: d */
    public final boolean f5042d;

    /* JADX INFO: renamed from: e */
    public C1470e f5043e;

    /* JADX INFO: renamed from: f */
    public final Layout f5044f;

    /* JADX INFO: renamed from: g */
    public final int f5045g;

    /* JADX INFO: renamed from: h */
    public final int f5046h;

    /* JADX INFO: renamed from: i */
    public final int f5047i;

    /* JADX INFO: renamed from: j */
    public final float f5048j;

    /* JADX INFO: renamed from: k */
    public final float f5049k;

    /* JADX INFO: renamed from: l */
    public final boolean f5050l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f5051m;

    /* JADX INFO: renamed from: n */
    public final int f5052n;

    /* JADX INFO: renamed from: o */
    public final C1494h[] f5053o;

    /* JADX INFO: renamed from: p */
    public final Rect f5054p = new Rect();

    /* JADX INFO: renamed from: q */
    public C0240b f5055q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa A[PHI: r7
  0x01aa: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:99:0x01bc, B:92:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1410j(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, p096T0.C1405e r35) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p096T0.C1410j.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, T0.e):void");
    }

    /* JADX INFO: renamed from: a */
    public final int m2705a() {
        boolean z5 = this.f5042d;
        Layout layout = this.f5044f;
        return (z5 ? layout.getLineBottom(this.f5045g - 1) : layout.getHeight()) + this.f5046h + this.f5047i + this.f5052n;
    }

    /* JADX INFO: renamed from: b */
    public final float m2706b(int i5) {
        if (i5 == this.f5045g - 1) {
            return this.f5048j + this.f5049k;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final C0240b m2707c() {
        C0240b c0240b = this.f5055q;
        if (c0240b != null) {
            return c0240b;
        }
        C0240b c0240b2 = new C0240b();
        c0240b2.f808a = this.f5044f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM3634b0 = AbstractC1976d.m3634b0(((Layout) c0240b2.f808a).getText(), '\n', length, 4);
            length = iM3634b0 < 0 ? ((Layout) c0240b2.f808a).getText().length() : iM3634b0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) c0240b2.f808a).getText().length());
        c0240b2.f809b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(null);
        }
        c0240b2.f810c = arrayList2;
        c0240b2.f811d = new boolean[((ArrayList) c0240b2.f809b).size()];
        ((ArrayList) c0240b2.f809b).size();
        this.f5055q = c0240b2;
        return c0240b2;
    }

    /* JADX INFO: renamed from: d */
    public final float m2708d(int i5) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f5046h + ((i5 != this.f5045g + (-1) || (fontMetricsInt = this.f5051m) == null) ? this.f5044f.getLineBaseline(i5) : m2711g(i5) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: e */
    public final float m2709e(int i5) {
        Paint.FontMetricsInt fontMetricsInt;
        int i6 = this.f5045g;
        int i7 = i6 - 1;
        Layout layout = this.f5044f;
        if (i5 != i7 || (fontMetricsInt = this.f5051m) == null) {
            return this.f5046h + layout.getLineBottom(i5) + (i5 == i6 + (-1) ? this.f5047i : 0);
        }
        return layout.getLineBottom(i5 - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: f */
    public final int m2710f(int i5) {
        ThreadLocal threadLocal = AbstractC1411k.f5056a;
        Layout layout = this.f5044f;
        return (layout.getEllipsisCount(i5) <= 0 || this.f5040b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i5) : layout.getText().length();
    }

    /* JADX INFO: renamed from: g */
    public final float m2711g(int i5) {
        return this.f5044f.getLineTop(i5) + (i5 == 0 ? 0 : this.f5046h);
    }

    /* JADX INFO: renamed from: h */
    public final float m2712h(int i5, boolean z5) {
        return m2706b(this.f5044f.getLineForOffset(i5)) + m2707c().m433j(i5, true, z5);
    }

    /* JADX INFO: renamed from: i */
    public final float m2713i(int i5, boolean z5) {
        return m2706b(this.f5044f.getLineForOffset(i5)) + m2707c().m433j(i5, false, z5);
    }

    /* JADX INFO: renamed from: j */
    public final C1470e m2714j() {
        C1470e c1470e = this.f5043e;
        if (c1470e != null) {
            return c1470e;
        }
        Layout layout = this.f5044f;
        C1470e c1470e2 = new C1470e(layout.getText(), layout.getText().length(), this.f5039a.getTextLocale());
        this.f5043e = c1470e2;
        return c1470e2;
    }
}
