package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1363;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import java.util.ArrayList;
import kotlin.InterfaceC5168;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final StackTraceElement[] f3643 = new StackTraceElement[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1252 f3642 = new C1252(0, new long[0], new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1242 m2189(int i, InterfaceC5168 interfaceC5168, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        if (objM2345 == C1369.f3974) {
            objM2345 = new C1242(i, true, interfaceC5168);
            c1324.m2386(objM2345);
        }
        C1242 c1242 = (C1242) objM2345;
        if (!AbstractC4395.m8907(c1242.f3601, interfaceC5168)) {
            boolean z = c1242.f3601 == null;
            c1242.f3601 = interfaceC5168;
            if (!z && c1242.f3600) {
                C1389 c1389 = c1242.f3599;
                if (c1389 != null) {
                    C1363 c1363 = c1389.f4037;
                    if (c1363 != null) {
                        c1363.m2460(c1389, null);
                    }
                    c1242.f3599 = null;
                }
                ArrayList arrayList = c1242.f3598;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C1389 c13892 = (C1389) arrayList.get(i2);
                        C1363 c13632 = c13892.f4037;
                        if (c13632 != null) {
                            c13632.m2460(c13892, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c1242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2190(C1324 c1324, InterfaceC6554 interfaceC6554) {
        interfaceC6554.getClass();
        AbstractC4388.m8888(2, interfaceC6554);
        interfaceC6554.invoke(c1324, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m2191() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m2192(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }
}
