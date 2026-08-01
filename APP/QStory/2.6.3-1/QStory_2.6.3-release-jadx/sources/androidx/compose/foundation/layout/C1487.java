package androidx.compose.foundation.layout;

import android.view.View;
import androidx.activity.compose.C0849;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import java.util.WeakHashMap;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1487 implements InterfaceC1486, InterfaceC1491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2162 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C1466 m2016(InterfaceC2208 interfaceC2208) {
        C2159 c2159 = (C2159) interfaceC2208;
        View view = (View) c2159.m2943(AbstractC2670.f5677);
        C1466 c1466M2019 = m2019(view);
        boolean zM2938 = c2159.m2938(c1466M2019) | c2159.m2938(view);
        Object objM2905 = c2159.m2905();
        if (zM2938 || objM2905 == C2204.f4319) {
            objM2905 = new C0849(c1466M2019, 9, view);
            c2159.m2946(objM2905);
        }
        AbstractC2202.m3044(c1466M2019, (InterfaceC7387) objM2905, c2159);
        return c1466M2019;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1453 m2017(int i, String str) {
        WeakHashMap weakHashMap = C1466.f2085;
        return new C1453(new C1512(0, 0, 0, 0), str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1472 m2018(int i, String str) {
        WeakHashMap weakHashMap = C1466.f2085;
        return new C1472(i, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C1466 m2019(View view) {
        C1466 c1466;
        WeakHashMap weakHashMap = C1466.f2085;
        synchronized (weakHashMap) {
            try {
                Object c14662 = weakHashMap.get(view);
                if (c14662 == null) {
                    c14662 = new C1466(view);
                    weakHashMap.put(view, c14662);
                }
                c1466 = (C1466) c14662;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1466;
    }

    public String toString() {
        switch (this.f2162) {
            case 0:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1486
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo2005(InterfaceC2488 interfaceC2488, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            AbstractC1469.m1996(i, iArr, iArr2, false);
        } else {
            AbstractC1469.m1996(i, iArr, iArr2, true);
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1491
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo1980(int i, InterfaceC2488 interfaceC2488, int[] iArr, int[] iArr2) {
        AbstractC1469.m1996(i, iArr, iArr2, false);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1486, androidx.compose.foundation.layout.InterfaceC1491
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public float mo2015() {
        return 0.0f;
    }
}
