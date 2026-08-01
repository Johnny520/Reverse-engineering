package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.appcompat.app.C0113;
import androidx.compose.animation.core.C0333;
import androidx.compose.animation.core.InterfaceC0334;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.platform.AbstractC1902;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0434 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f1398 = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC0334 m1124(InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        InterfaceC7895 interfaceC7895 = (InterfaceC7895) c1324.m2373(AbstractC1902.f5587);
        boolean zM2353 = c1324.m2353(interfaceC7895.mo1246());
        Object objM2335 = c1324.m2335();
        if (zM2353 || objM2335 == C1369.f3973) {
            objM2335 = new C0333(new C0113(interfaceC7895));
            c1324.m2376(objM2335);
        }
        return (InterfaceC0334) objM2335;
    }
}
