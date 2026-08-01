package p209;

import android.text.TextPaint;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2889;
import androidx.compose.p001ui.text.C2893;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2899;
import androidx.compose.p001ui.text.C2905;
import java.util.ArrayList;
import p225.C8760;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8656 f21715 = new C8656(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m13752(TextPaint textPaint, float f) {
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
    public static final void m13753(C2896 c2896, InterfaceC2436 interfaceC2436, AbstractC2433 abstractC2433, float f, C2405 c2405, C8760 c8760, AbstractC2340 abstractC2340) {
        ArrayList arrayList = c2896.f6451;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2899 c2899 = (C2899) arrayList.get(i);
            c2899.f6467.m4342(interfaceC2436, abstractC2433, f, c2405, c8760, abstractC2340);
            interfaceC2436.mo3245(0.0f, c2899.f6467.m4340());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13754(C2865 c2865) {
        C2889 c2889;
        C2893 c2893 = c2865.f6327;
        C2905 c2905 = (c2893 == null || (c2889 = c2893.f6441) == null) ? null : new C2905(c2889.f6435);
        boolean z = false;
        if (c2905 != null && c2905.f6479 == 1) {
            z = true;
        }
        return !z;
    }
}
