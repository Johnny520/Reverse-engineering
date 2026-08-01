package androidx.compose.foundation.lazy;

import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0960;
import androidx.collection.C1110;
import androidx.compose.foundation.lazy.layout.C1531;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2466;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2586;
import androidx.compose.p001ui.node.C2615;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.InterfaceC2233;
import p025.AbstractC7012;
import p128.C8158;
import p192.AbstractC8570;
import p248.C8894;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f2498 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f2499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f2500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2501;

    public C1589(String str, Object[] objArr, boolean z) {
        this.f2501 = z;
        this.f2500 = str;
        this.f2499 = objArr;
        if (objArr.length == 0) {
            this.f2497 = str;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2116(int i, int i2) {
        if (i < 0.0f) {
            AbstractC8570.m13656("Index should be non-negative (" + i + ')');
        }
        ((AbstractC2181) ((InterfaceC2233) this.f2500)).m2993(i);
        ((C1531) this.f2497).m2054(i);
        ((AbstractC2181) ((InterfaceC2233) this.f2499)).m2993(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m2117(C0923 c0923, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        C2466 c2466 = (C2466) this.f2499;
        C2615 c2615 = (C2615) this.f2497;
        if (this.f2501) {
            return 0;
        }
        try {
            this.f2501 = true;
            C8894 c8894M986 = ((C0960) this.f2498).m986(c0923, viewTreeObserverOnGlobalLayoutListenerC2719);
            C1110 c1110 = (C1110) c8894M986.f22591;
            int iM1388 = c1110.m1388();
            for (int i3 = 0; i3 < iM1388; i3++) {
                C2478 c2478 = (C2478) c1110.m1389(i3);
                if (!c2478.f5151 && !c2478.f5160) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM13882 = c1110.m1388();
            for (int i4 = 0; i4 < iM13882; i4++) {
                C2478 c24782 = (C2478) c1110.m1389(i4);
                if (objArr != false || AbstractC2481.m3589(c24782)) {
                    C2583 c2583 = (C2583) this.f2500;
                    long j = c24782.f5152;
                    C2615 c26152 = (C2615) this.f2497;
                    int i5 = c24782.f5164;
                    C2586 c2586 = C2583.f5434;
                    c2583.m3798(j, c26152, i5, true);
                    if (!c2615.f5566.m1439()) {
                        c2466.m3575(c24782.f5154, c2615, AbstractC2481.m3589(c24782));
                        c2615.clear();
                    }
                }
            }
            boolean zM3574 = c2466.m3574(c8894M986, z);
            if (c8894M986.f22590) {
                i = 0;
            } else {
                int iM13883 = c1110.m1388();
                for (int i6 = 0; i6 < iM13883; i6++) {
                    C2478 c24783 = (C2478) c1110.m1389(i6);
                    if (!C8158.m13087(AbstractC2481.m3591(c24783, true), 0L) && c24783.m3582()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iM13884 = c1110.m1388();
            int i7 = 0;
            while (true) {
                if (i7 >= iM13884) {
                    i2 = 0;
                    break;
                }
                if (((C2478) c1110.m1389(i7)).m3582()) {
                    i2 = 1;
                    break;
                }
                i7++;
            }
            int i8 = (zM3574 ? 1 : 0) | (i << 1) | (i2 << 2);
            this.f2501 = false;
            return i8;
        } catch (Throwable th) {
            this.f2501 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m2118() {
        return ((AbstractC2181) ((InterfaceC2233) this.f2499)).m2992();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String m2119() {
        C1589 c1589 = (C1589) this.f2498;
        String string = (String) this.f2497;
        if (string == null) {
            String str = (String) this.f2500;
            Object[] objArr = (Object[]) this.f2499;
            if (objArr.length > 0) {
                string = String.format(str, objArr);
                if (c1589 != null) {
                    StringBuilder sbM12143 = AbstractC7012.m12143(string, "; ");
                    sbM12143.append(c1589.m2119());
                    string = sbM12143.toString();
                }
                this.f2497 = string;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m2120() {
        return ((AbstractC2181) ((InterfaceC2233) this.f2500)).m2992();
    }
}
