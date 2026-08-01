package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1363;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import java.util.ArrayList;
import kotlin.InterfaceC5167;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final StackTraceElement[] f3642 = new StackTraceElement[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1252 f3641 = new C1252(0, new long[0], new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1242 m2179(int i, InterfaceC5167 interfaceC5167, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        if (objM2335 == C1369.f3973) {
            objM2335 = new C1242(i, true, interfaceC5167);
            c1324.m2376(objM2335);
        }
        C1242 c1242 = (C1242) objM2335;
        if (!AbstractC4394.m8917(c1242.f3600, interfaceC5167)) {
            boolean z = c1242.f3600 == null;
            c1242.f3600 = interfaceC5167;
            if (!z && c1242.f3599) {
                C1389 c1389 = c1242.f3598;
                if (c1389 != null) {
                    C1363 c1363 = c1389.f4036;
                    if (c1363 != null) {
                        c1363.m2450(c1389, null);
                    }
                    c1242.f3598 = null;
                }
                ArrayList arrayList = c1242.f3597;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C1389 c13892 = (C1389) arrayList.get(i2);
                        C1363 c13632 = c13892.f4036;
                        if (c13632 != null) {
                            c13632.m2450(c13892, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c1242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2180(C1324 c1324, InterfaceC6553 interfaceC6553) {
        interfaceC6553.getClass();
        AbstractC4387.m8898(2, interfaceC6553);
        interfaceC6553.invoke(c1324, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m2181() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m2182(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }
}
