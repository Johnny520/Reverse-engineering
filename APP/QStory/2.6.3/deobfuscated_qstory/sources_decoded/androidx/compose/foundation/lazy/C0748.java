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
import p009.AbstractC6183;
import p112.C7329;
import p176.AbstractC7741;
import p232.C8065;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f2153 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f2154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f2155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2156;

    public C0748(String str, Object[] objArr, boolean z) {
        this.f2156 = z;
        this.f2155 = str;
        this.f2154 = objArr;
        if (objArr.length == 0) {
            this.f2152 = str;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m1556(int i, int i2) {
        if (i < 0.0f) {
            AbstractC7741.m13097("Index should be non-negative (" + i + ')');
        }
        ((AbstractC1346) ((InterfaceC1398) this.f2155)).m2433(i);
        ((C0690) this.f2152).m1494(i);
        ((AbstractC1346) ((InterfaceC1398) this.f2154)).m2433(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m1557(C0076 c0076, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        C1631 c1631 = (C1631) this.f2154;
        C1780 c1780 = (C1780) this.f2152;
        if (this.f2156) {
            return 0;
        }
        try {
            this.f2156 = true;
            C8065 c8065M426 = ((C0113) this.f2153).m426(c0076, viewTreeObserverOnGlobalLayoutListenerC1884);
            C0263 c0263 = (C0263) c8065M426.f22246;
            int iM828 = c0263.m828();
            for (int i3 = 0; i3 < iM828; i3++) {
                C1643 c1643 = (C1643) c0263.m829(i3);
                if (!c1643.f4806 && !c1643.f4815) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM8282 = c0263.m828();
            for (int i4 = 0; i4 < iM8282; i4++) {
                C1643 c16432 = (C1643) c0263.m829(i4);
                if (objArr != false || AbstractC1646.m3029(c16432)) {
                    C1748 c1748 = (C1748) this.f2155;
                    long j = c16432.f4807;
                    C1780 c17802 = (C1780) this.f2152;
                    int i5 = c16432.f4819;
                    C1751 c1751 = C1748.f5089;
                    c1748.m3238(j, c17802, i5, true);
                    if (!c1780.f5221.m879()) {
                        c1631.m3015(c16432.f4809, c1780, AbstractC1646.m3029(c16432));
                        c1780.clear();
                    }
                }
            }
            boolean zM3014 = c1631.m3014(c8065M426, z);
            if (c8065M426.f22245) {
                i = 0;
            } else {
                int iM8283 = c0263.m828();
                for (int i6 = 0; i6 < iM8283; i6++) {
                    C1643 c16433 = (C1643) c0263.m829(i6);
                    if (!C7329.m12528(AbstractC1646.m3031(c16433, true), 0L) && c16433.m3022()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iM8284 = c0263.m828();
            int i7 = 0;
            while (true) {
                if (i7 >= iM8284) {
                    i2 = 0;
                    break;
                }
                if (((C1643) c0263.m829(i7)).m3022()) {
                    i2 = 1;
                    break;
                }
                i7++;
            }
            int i8 = (zM3014 ? 1 : 0) | (i << 1) | (i2 << 2);
            this.f2156 = false;
            return i8;
        } catch (Throwable th) {
            this.f2156 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m1558() {
        return ((AbstractC1346) ((InterfaceC1398) this.f2154)).m2432();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String m1559() {
        C0748 c0748 = (C0748) this.f2153;
        String string = (String) this.f2152;
        if (string == null) {
            String str = (String) this.f2155;
            Object[] objArr = (Object[]) this.f2154;
            if (objArr.length > 0) {
                string = String.format(str, objArr);
                if (c0748 != null) {
                    StringBuilder sbM11584 = AbstractC6183.m11584(string, "; ");
                    sbM11584.append(c0748.m1559());
                    string = sbM11584.toString();
                }
                this.f2152 = string;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int m1560() {
        return ((AbstractC1346) ((InterfaceC1398) this.f2155)).m2432();
    }
}
