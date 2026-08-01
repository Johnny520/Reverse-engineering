package androidx.compose.foundation.lazy;

import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0113;
import androidx.collection.C0263;
import androidx.compose.foundation.lazy.layout.C0690;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1631;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import androidx.compose.ui.node.C1780;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p007.AbstractC6136;
import p112.C7328;
import p176.AbstractC7740;
import p232.C8064;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f2152 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f2153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f2154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2155;

    public C0748(String str, Object[] objArr, boolean z) {
        this.f2155 = z;
        this.f2154 = str;
        this.f2153 = objArr;
        if (objArr.length == 0) {
            this.f2151 = str;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m1546(int i, int i2) {
        if (i < 0.0f) {
            AbstractC7740.m13069("Index should be non-negative (" + i + ')');
        }
        ((AbstractC1346) ((InterfaceC1398) this.f2154)).m2423(i);
        ((C0690) this.f2151).m1484(i);
        ((AbstractC1346) ((InterfaceC1398) this.f2153)).m2423(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m1547(C0076 c0076, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        C1631 c1631 = (C1631) this.f2153;
        C1780 c1780 = (C1780) this.f2151;
        if (this.f2155) {
            return 0;
        }
        try {
            this.f2155 = true;
            C8064 c8064M425 = ((C0113) this.f2152).m425(c0076, viewTreeObserverOnGlobalLayoutListenerC1884);
            C0263 c0263 = (C0263) c8064M425.f22248;
            int iM827 = c0263.m827();
            for (int i3 = 0; i3 < iM827; i3++) {
                C1643 c1643 = (C1643) c0263.m828(i3);
                if (!c1643.f4805 && !c1643.f4814) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM8272 = c0263.m827();
            for (int i4 = 0; i4 < iM8272; i4++) {
                C1643 c16432 = (C1643) c0263.m828(i4);
                if (objArr != false || AbstractC1646.m3019(c16432)) {
                    C1748 c1748 = (C1748) this.f2154;
                    long j = c16432.f4806;
                    C1780 c17802 = (C1780) this.f2151;
                    int i5 = c16432.f4818;
                    C1751 c1751 = C1748.f5088;
                    c1748.m3228(j, c17802, i5, true);
                    if (!c1780.f5220.m878()) {
                        c1631.m3005(c16432.f4808, c1780, AbstractC1646.m3019(c16432));
                        c1780.clear();
                    }
                }
            }
            boolean zM3004 = c1631.m3004(c8064M425, z);
            if (c8064M425.f22247) {
                i = 0;
            } else {
                int iM8273 = c0263.m827();
                for (int i6 = 0; i6 < iM8273; i6++) {
                    C1643 c16433 = (C1643) c0263.m828(i6);
                    if (!C7328.m12501(AbstractC1646.m3021(c16433, true), 0L) && c16433.m3012()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iM8274 = c0263.m827();
            int i7 = 0;
            while (true) {
                if (i7 >= iM8274) {
                    i2 = 0;
                    break;
                }
                if (((C1643) c0263.m828(i7)).m3012()) {
                    i2 = 1;
                    break;
                }
                i7++;
            }
            int i8 = (zM3004 ? 1 : 0) | (i << 1) | (i2 << 2);
            this.f2155 = false;
            return i8;
        } catch (Throwable th) {
            this.f2155 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m1548() {
        return ((AbstractC1346) ((InterfaceC1398) this.f2153)).m2422();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String m1549() {
        C0748 c0748 = (C0748) this.f2152;
        String string = (String) this.f2151;
        if (string == null) {
            String str = (String) this.f2154;
            Object[] objArr = (Object[]) this.f2153;
            if (objArr.length > 0) {
                string = String.format(str, objArr);
                if (c0748 != null) {
                    StringBuilder sbM11553 = AbstractC6136.m11553(string, "; ");
                    sbM11553.append(c0748.m1549());
                    string = sbM11553.toString();
                }
                this.f2151 = string;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m1550() {
        return ((AbstractC1346) ((InterfaceC1398) this.f2154)).m2422();
    }
}
