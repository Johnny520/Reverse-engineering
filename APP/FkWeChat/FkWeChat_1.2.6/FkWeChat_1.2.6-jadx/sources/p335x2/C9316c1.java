package p335x2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: x2.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9316c1 {

    /* JADX INFO: renamed from: a */
    public static final C9316c1 f31865a = new C9316c1();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC9319d1 f31866b = new C9350p0();

    /* JADX INFO: renamed from: c */
    public static final int f31867c = 8;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ StaticLayout m36292b(C9316c1 c9316c1, CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, Object obj) {
        int[] iArr3;
        C9316c1 c9316c12;
        CharSequence charSequence2;
        TextPaint textPaint2;
        int i21;
        int i22 = (i20 & 8) != 0 ? 0 : i11;
        int length = (i20 & 16) != 0 ? charSequence.length() : i12;
        TextDirectionHeuristic textDirectionHeuristicM36327b = (i20 & 32) != 0 ? C9324f0.f31898a.m36327b() : textDirectionHeuristic;
        Layout.Alignment alignmentM36326a = (i20 & 64) != 0 ? C9324f0.f31898a.m36326a() : alignment;
        int i23 = (i20 & 128) != 0 ? Integer.MAX_VALUE : i13;
        TextUtils.TruncateAt truncateAt2 = (i20 & 256) != 0 ? null : truncateAt;
        int i24 = (i20 & 512) != 0 ? i10 : i14;
        float f12 = (i20 & 1024) != 0 ? 1.0f : f10;
        float f13 = (i20 & 2048) != 0 ? 0.0f : f11;
        int i25 = (i20 & 4096) != 0 ? 0 : i15;
        boolean z12 = (i20 & 8192) != 0 ? false : z10;
        boolean z13 = (i20 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z11;
        int i26 = (32768 & i20) != 0 ? 0 : i16;
        int i27 = (65536 & i20) != 0 ? 0 : i17;
        int i28 = (131072 & i20) != 0 ? 0 : i18;
        int i29 = (262144 & i20) != 0 ? 0 : i19;
        int[] iArr4 = (524288 & i20) != 0 ? null : iArr;
        if ((i20 & 1048576) != 0) {
            iArr3 = null;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i21 = i10;
            c9316c12 = c9316c1;
        } else {
            iArr3 = iArr2;
            c9316c12 = c9316c1;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i21 = i10;
        }
        return c9316c12.m36293a(charSequence2, textPaint2, i21, i22, length, textDirectionHeuristicM36327b, alignmentM36326a, i23, truncateAt2, i24, f12, f13, i25, z12, z13, i26, i27, i28, i29, iArr4, iArr3);
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m36293a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        return f31866b.mo36296a(new C9322e1(charSequence, i11, i12, textPaint, i10, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36294c(StaticLayout staticLayout, boolean z10) {
        return f31866b.mo36297b(staticLayout, z10);
    }
}
