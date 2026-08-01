package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.C1599;
import java.util.Map;
import kotlin.C5175;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0328 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f1103 = 0;

    static {
        Map map = AbstractC0320.f1086;
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Map map2 = AbstractC0320.f1086;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC1333 m1005(final C1599 c1599, InterfaceC0358 interfaceC0358, InterfaceC0349 interfaceC0349, String str, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (objM2335 == c1353) {
            objM2335 = AbstractC1367.m2465(null);
            c1324.m2376(objM2335);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2335;
        Object objM23352 = c1324.m2335();
        if (objM23352 == c1353) {
            objM23352 = new C0331(interfaceC0358, c1599, null);
            c1324.m2376(objM23352);
        }
        C0331 c0331 = (C0331) objM23352;
        InterfaceC1395 interfaceC1395M2463 = AbstractC1367.m2463(null, c1324);
        InterfaceC1395 interfaceC1395M24632 = AbstractC1367.m2463(interfaceC0349, c1324);
        Object objM23353 = c1324.m2335();
        if (objM23353 == c1353) {
            objM23353 = AbstractC5204.m10278(-1, 6, null);
            c1324.m2376(objM23353);
        }
        final InterfaceC5206 interfaceC5206 = (InterfaceC5206) objM23353;
        boolean zM2368 = c1324.m2368(interfaceC5206) | ((((i & 14) ^ 6) > 4 && c1324.m2368(c1599)) || (6 & i) == 4);
        Object objM23354 = c1324.m2335();
        if (zM2368 || objM23354 == c1353) {
            objM23354 = new InterfaceC6542() { // from class: androidx.compose.animation.core.飘花落叶言子楪世哲兰苏
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    interfaceC5206.mo8445(c1599);
                    return C5175.f14739;
                }
            };
            c1324.m2376(objM23354);
        }
        AbstractC1367.m2492((InterfaceC6542) objM23354, c1324);
        boolean zM23682 = c1324.m2368(interfaceC5206) | c1324.m2368(c0331) | c1324.m2350(interfaceC1395M24632) | c1324.m2350(interfaceC1395M2463);
        Object objM23355 = c1324.m2335();
        if (zM23682 || objM23355 == c1353) {
            AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(interfaceC5206, c0331, interfaceC1395M24632, interfaceC1395M2463, null);
            c1324.m2376(animateAsStateKt$animateValueAsState$3$1);
            objM23355 = animateAsStateKt$animateValueAsState$3$1;
        }
        AbstractC1367.m2490(c1324, interfaceC5206, (InterfaceC6553) objM23355);
        InterfaceC1333 interfaceC1333 = (InterfaceC1333) interfaceC1395.getValue();
        return interfaceC1333 == null ? c0331.f1127 : interfaceC1333;
    }
}
