package p193;

import android.text.TextPaint;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2055;
import androidx.compose.ui.text.C2059;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.C2065;
import androidx.compose.ui.text.C2071;
import java.util.ArrayList;
import p209.C7930;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7829 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7826 f21373 = new C7826(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m13165(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m13166(C2062 c2062, InterfaceC1601 interfaceC1601, AbstractC1598 abstractC1598, float f, C1570 c1570, C7930 c7930, AbstractC1505 abstractC1505) {
        ArrayList arrayList = c2062.f6105;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2065 c2065 = (C2065) arrayList.get(i);
            c2065.f6121.m3772(interfaceC1601, abstractC1598, f, c1570, c7930, abstractC1505);
            interfaceC1601.mo2675(0.0f, c2065.f6121.m3770());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13167(C2031 c2031) {
        C2055 c2055;
        C2059 c2059 = c2031.f5981;
        C2071 c2071 = (c2059 == null || (c2055 = c2059.f6095) == null) ? null : new C2071(c2055.f6089);
        boolean z = false;
        if (c2071 != null && c2071.f6133 == 1) {
            z = true;
        }
        return !z;
    }
}
