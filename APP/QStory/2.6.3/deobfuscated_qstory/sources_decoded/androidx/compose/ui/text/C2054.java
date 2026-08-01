package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.text.TextUtils;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import java.util.List;
import p193.AbstractC7823;
import p193.C7820;
import p193.C7821;
import p193.C7824;
import p205.C7898;
import p209.C7931;
import p212.AbstractC7949;
import p212.C7941;
import p212.C7950;
import p212.C7951;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2054 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f6084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CharSequence f6085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7951 f6086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7821 f6089;

    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2054(p193.C7821 r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C2054.<init>(飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲兰苏, int, int, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3776(InterfaceC1601 interfaceC1601, long j, C1570 c1570, C7931 c7931, AbstractC1505 abstractC1505) {
        C7820 c7820 = this.f6089.f21356;
        int i = c7820.f21342;
        c7820.m13184(j);
        c7820.m13182(c1570);
        c7820.m13188(c7931);
        c7820.m13183(abstractC1505);
        c7820.m13186(3);
        m3777(interfaceC1601);
        c7820.m13186(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3777(InterfaceC1601 interfaceC1601) {
        Canvas canvasM2915 = AbstractC1594.m2915(interfaceC1601);
        C7951 c7951 = this.f6086;
        if (c7951.f22003) {
            canvasM2915.save();
            canvasM2915.clipRect(0.0f, 0.0f, m3778(), m3780());
        }
        int i = c7951.f22012;
        if (canvasM2915.getClipBounds(c7951.f22011)) {
            if (i != 0) {
                canvasM2915.translate(0.0f, i);
            }
            ThreadLocal threadLocal = AbstractC7949.f21999;
            Object c7950 = threadLocal.get();
            if (c7950 == null) {
                c7950 = new C7950();
                threadLocal.set(c7950);
            }
            C7950 c79502 = (C7950) c7950;
            c79502.f22000 = canvasM2915;
            try {
                c7951.f22001.draw(c79502);
                if (i != 0) {
                    canvasM2915.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                c79502.f22000 = null;
            }
        }
        if (c7951.f22003) {
            canvasM2915.restore();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m3778() {
        return C7898.m13337(this.f6087);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v26, types: [飘花落叶言子苏楪兰哲世.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m3779(p112.C7328 r11, int r12, androidx.compose.ui.text.C2044 r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C2054.m3779(飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, int, androidx.compose.ui.text.飘花落叶言子世苏兰楪哲):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m3780() {
        return this.f6086.m13444();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7951 m3781(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        C2055 c2055;
        float fM3778 = m3778();
        C7821 c7821 = this.f6089;
        C7820 c7820 = c7821.f21356;
        int i8 = c7821.f21348;
        C7941 c7941 = c7821.f21354;
        C2031 c2031 = c7821.f21357;
        C7824 c7824 = AbstractC7823.f21361;
        C2059 c2059 = c2031.f5982;
        return new C7951(charSequence, fM3778, c7820, i, truncateAt, i8, (c2059 == null || (c2055 = c2059.f6096) == null) ? false : c2055.f6091, i3, i5, i6, i7, i4, i2, c7941);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3782(InterfaceC1601 interfaceC1601, AbstractC1598 abstractC1598, float f, C1570 c1570, C7931 c7931, AbstractC1505 abstractC1505) {
        C7820 c7820 = this.f6089.f21356;
        int i = c7820.f21342;
        float fM3778 = m3778();
        c7820.m13185(abstractC1598, (((long) Float.floatToRawIntBits(m3780())) & 4294967295L) | (Float.floatToRawIntBits(fM3778) << 32), f);
        c7820.m13182(c1570);
        c7820.m13188(c7931);
        c7820.m13183(abstractC1505);
        c7820.m13186(3);
        m3777(interfaceC1601);
        c7820.m13186(i);
    }
}
