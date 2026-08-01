package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.appcompat.app.C0113;
import androidx.compose.animation.core.C0333;
import androidx.compose.animation.core.InterfaceC0334;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.platform.AbstractC1902;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0434 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f1398 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC0334 m1125(InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        InterfaceC7896 interfaceC7896 = (InterfaceC7896) c1324.m2383(AbstractC1902.f5588);
        boolean zM2363 = c1324.m2363(interfaceC7896.mo1256());
        Object objM2345 = c1324.m2345();
        if (zM2363 || objM2345 == C1369.f3974) {
            objM2345 = new C0333(new C0113(interfaceC7896));
            c1324.m2386(objM2345);
        }
        return (InterfaceC0334) objM2345;
    }
}
