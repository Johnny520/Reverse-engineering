package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.text.TextUtils;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import java.util.List;
import p193.AbstractC7822;
import p193.C7819;
import p193.C7820;
import p193.C7823;
import p205.C7897;
import p209.C7930;
import p212.AbstractC7948;
import p212.C7940;
import p212.C7949;
import p212.C7950;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2054 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List f6083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CharSequence f6084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7950 f6085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7820 f6088;

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
    public C2054(p193.C7820 r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C2054.<init>(飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲兰苏, int, int, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3766(InterfaceC1601 interfaceC1601, long j, C1570 c1570, C7930 c7930, AbstractC1505 abstractC1505) {
        C7819 c7819 = this.f6088.f21359;
        int i = c7819.f21345;
        c7819.m13156(j);
        c7819.m13154(c1570);
        c7819.m13160(c7930);
        c7819.m13155(abstractC1505);
        c7819.m13158(3);
        m3767(interfaceC1601);
        c7819.m13158(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3767(InterfaceC1601 interfaceC1601) {
        Canvas canvasM2905 = AbstractC1594.m2905(interfaceC1601);
        C7950 c7950 = this.f6085;
        if (c7950.f22006) {
            canvasM2905.save();
            canvasM2905.clipRect(0.0f, 0.0f, m3768(), m3770());
        }
        int i = c7950.f22015;
        if (canvasM2905.getClipBounds(c7950.f22014)) {
            if (i != 0) {
                canvasM2905.translate(0.0f, i);
            }
            ThreadLocal threadLocal = AbstractC7948.f22002;
            Object c7949 = threadLocal.get();
            if (c7949 == null) {
                c7949 = new C7949();
                threadLocal.set(c7949);
            }
            C7949 c79492 = (C7949) c7949;
            c79492.f22003 = canvasM2905;
            try {
                c7950.f22004.draw(c79492);
                if (i != 0) {
                    canvasM2905.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                c79492.f22003 = null;
            }
        }
        if (c7950.f22006) {
            canvasM2905.restore();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m3768() {
        return C7897.m13309(this.f6086);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v26, types: [飘花落叶言子苏楪兰哲世.飘花落叶言子楪世苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m3769(p112.C7327 r11, int r12, androidx.compose.ui.text.C2044 r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.C2054.m3769(飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰, int, androidx.compose.ui.text.飘花落叶言子世苏兰楪哲):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m3770() {
        return this.f6085.m13416();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7950 m3771(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        C2055 c2055;
        float fM3768 = m3768();
        C7820 c7820 = this.f6088;
        C7819 c7819 = c7820.f21359;
        int i8 = c7820.f21351;
        C7940 c7940 = c7820.f21357;
        C2031 c2031 = c7820.f21360;
        C7823 c7823 = AbstractC7822.f21364;
        C2059 c2059 = c2031.f5981;
        return new C7950(charSequence, fM3768, c7819, i, truncateAt, i8, (c2059 == null || (c2055 = c2059.f6095) == null) ? false : c2055.f6090, i3, i5, i6, i7, i4, i2, c7940);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3772(InterfaceC1601 interfaceC1601, AbstractC1598 abstractC1598, float f, C1570 c1570, C7930 c7930, AbstractC1505 abstractC1505) {
        C7819 c7819 = this.f6088.f21359;
        int i = c7819.f21345;
        float fM3768 = m3768();
        c7819.m13157(abstractC1598, (((long) Float.floatToRawIntBits(m3770())) & 4294967295L) | (Float.floatToRawIntBits(fM3768) << 32), f);
        c7819.m13154(c1570);
        c7819.m13160(c7930);
        c7819.m13155(abstractC1505);
        c7819.m13158(3);
        m3767(interfaceC1601);
        c7819.m13158(i);
    }
}
