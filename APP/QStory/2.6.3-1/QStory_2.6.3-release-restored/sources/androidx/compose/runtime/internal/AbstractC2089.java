package androidx.compose.runtime.internal;

import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2198;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import java.util.ArrayList;
import kotlin.InterfaceC6000;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final StackTraceElement[] f3988 = new StackTraceElement[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2087 f3987 = new C2087(0, new long[0], new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2077 m2749(int i, InterfaceC6000 interfaceC6000, InterfaceC2208 interfaceC2208) {
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        if (objM2905 == C2204.f4319) {
            objM2905 = new C2077(i, true, interfaceC6000);
            c2159.m2946(objM2905);
        }
        C2077 c2077 = (C2077) objM2905;
        if (!AbstractC5227.m9466(c2077.f3946, interfaceC6000)) {
            boolean z = c2077.f3946 == null;
            c2077.f3946 = interfaceC6000;
            if (!z && c2077.f3945) {
                C2224 c2224 = c2077.f3944;
                if (c2224 != null) {
                    C2198 c2198 = c2224.f4382;
                    if (c2198 != null) {
                        c2198.m3020(c2224, null);
                    }
                    c2077.f3944 = null;
                }
                ArrayList arrayList = c2077.f3943;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C2224 c22242 = (C2224) arrayList.get(i2);
                        C2198 c21982 = c22242.f4382;
                        if (c21982 != null) {
                            c21982.m3020(c22242, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c2077;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2750(C2159 c2159, InterfaceC7383 interfaceC7383) {
        interfaceC7383.getClass();
        AbstractC5220.m9447(2, interfaceC7383);
        interfaceC7383.invoke(c2159, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m2751() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m2752(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }
}
