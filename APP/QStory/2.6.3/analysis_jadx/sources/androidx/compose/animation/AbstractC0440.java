package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0328;
import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0362;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.animation.core.InterfaceC0358;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.C1599;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0440 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0299 f1402 = AbstractC0330.m1014(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC1333 m1129(long j, C0362 c0362, String str, InterfaceC1373 interfaceC1373, int i, int i2) {
        InterfaceC0349 interfaceC0349 = c0362;
        if ((i2 & 2) != 0) {
            interfaceC0349 = f1402;
        }
        InterfaceC0349 interfaceC03492 = interfaceC0349;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2360 = c1324.m2360(C1599.m2946(j));
        Object objM2345 = c1324.m2345();
        if (zM2360 || objM2345 == C1369.f3974) {
            objM2345 = (InterfaceC0358) AbstractC0409.f1357.invoke(C1599.m2946(j));
            c1324.m2386(objM2345);
        }
        int i3 = i << 6;
        return AbstractC0328.m1006(new C1599(j), (InterfaceC0358) objM2345, interfaceC03492, str2, c1324, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & Opcodes.ASM7));
    }
}
