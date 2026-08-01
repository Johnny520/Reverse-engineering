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
import p209.C7931;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7830 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7827 f21370 = new C7827(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m13193(TextPaint textPaint, float f) {
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
    public static final void m13194(C2062 c2062, InterfaceC1601 interfaceC1601, AbstractC1598 abstractC1598, float f, C1570 c1570, C7931 c7931, AbstractC1505 abstractC1505) {
        ArrayList arrayList = c2062.f6106;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2065 c2065 = (C2065) arrayList.get(i);
            c2065.f6122.m3782(interfaceC1601, abstractC1598, f, c1570, c7931, abstractC1505);
            interfaceC1601.mo2685(0.0f, c2065.f6122.m3780());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13195(C2031 c2031) {
        C2055 c2055;
        C2059 c2059 = c2031.f5982;
        C2071 c2071 = (c2059 == null || (c2055 = c2059.f6096) == null) ? null : new C2071(c2055.f6090);
        boolean z = false;
        if (c2071 != null && c2071.f6134 == 1) {
            z = true;
        }
        return !z;
    }
}
