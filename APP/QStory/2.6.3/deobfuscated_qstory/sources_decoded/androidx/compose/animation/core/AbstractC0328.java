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
import kotlin.C5176;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    public static final InterfaceC1333 m1006(final C1599 c1599, InterfaceC0358 interfaceC0358, InterfaceC0349 interfaceC0349, String str, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        C1353 c1353 = C1369.f3974;
        if (objM2345 == c1353) {
            objM2345 = AbstractC1367.m2474(null);
            c1324.m2386(objM2345);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
        Object objM23452 = c1324.m2345();
        if (objM23452 == c1353) {
            objM23452 = new C0331(interfaceC0358, c1599, null);
            c1324.m2386(objM23452);
        }
        C0331 c0331 = (C0331) objM23452;
        InterfaceC1395 interfaceC1395M2479 = AbstractC1367.m2479(null, c1324);
        InterfaceC1395 interfaceC1395M24792 = AbstractC1367.m2479(interfaceC0349, c1324);
        Object objM23453 = c1324.m2345();
        if (objM23453 == c1353) {
            objM23453 = AbstractC5205.m10282(-1, 6, null);
            c1324.m2386(objM23453);
        }
        final InterfaceC5207 interfaceC5207 = (InterfaceC5207) objM23453;
        boolean zM2378 = c1324.m2378(interfaceC5207) | ((((i & 14) ^ 6) > 4 && c1324.m2378(c1599)) || (6 & i) == 4);
        Object objM23454 = c1324.m2345();
        if (zM2378 || objM23454 == c1353) {
            objM23454 = new InterfaceC6543() { // from class: androidx.compose.animation.core.飘花落叶言子楪世哲兰苏
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    interfaceC5207.mo8436(c1599);
                    return C5176.f14739;
                }
            };
            c1324.m2386(objM23454);
        }
        AbstractC1367.m2502((InterfaceC6543) objM23454, c1324);
        boolean zM23782 = c1324.m2378(interfaceC5207) | c1324.m2378(c0331) | c1324.m2360(interfaceC1395M24792) | c1324.m2360(interfaceC1395M2479);
        Object objM23455 = c1324.m2345();
        if (zM23782 || objM23455 == c1353) {
            AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(interfaceC5207, c0331, interfaceC1395M24792, interfaceC1395M2479, null);
            c1324.m2386(animateAsStateKt$animateValueAsState$3$1);
            objM23455 = animateAsStateKt$animateValueAsState$3$1;
        }
        AbstractC1367.m2500(c1324, interfaceC5207, (InterfaceC6554) objM23455);
        InterfaceC1333 interfaceC1333 = (InterfaceC1333) interfaceC1395.getValue();
        return interfaceC1333 == null ? c0331.f1127 : interfaceC1333;
    }
}
