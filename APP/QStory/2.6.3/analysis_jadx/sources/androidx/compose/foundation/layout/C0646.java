package androidx.compose.foundation.layout;

import android.view.View;
import androidx.activity.compose.C0002;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.WeakHashMap;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646 implements InterfaceC0645, InterfaceC0650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1817 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C0625 m1456(InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        View view = (View) c1324.m2383(AbstractC1835.f5332);
        C0625 c0625M1459 = m1459(view);
        boolean zM2378 = c1324.m2378(c0625M1459) | c1324.m2378(view);
        Object objM2345 = c1324.m2345();
        if (zM2378 || objM2345 == C1369.f3974) {
            objM2345 = new C0002(c0625M1459, 9, view);
            c1324.m2386(objM2345);
        }
        AbstractC1367.m2484(c0625M1459, (InterfaceC6558) objM2345, c1324);
        return c0625M1459;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0612 m1457(int i, String str) {
        WeakHashMap weakHashMap = C0625.f1740;
        return new C0612(new C0671(0, 0, 0, 0), str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0631 m1458(int i, String str) {
        WeakHashMap weakHashMap = C0625.f1740;
        return new C0631(i, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0625 m1459(View view) {
        C0625 c0625;
        WeakHashMap weakHashMap = C0625.f1740;
        synchronized (weakHashMap) {
            try {
                Object c06252 = weakHashMap.get(view);
                if (c06252 == null) {
                    c06252 = new C0625(view);
                    weakHashMap.put(view, c06252);
                }
                c0625 = (C0625) c06252;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0625;
    }

    public String toString() {
        switch (this.f1817) {
            case 0:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0645
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1445(InterfaceC1653 interfaceC1653, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            AbstractC0628.m1436(i, iArr, iArr2, false);
        } else {
            AbstractC0628.m1436(i, iArr, iArr2, true);
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo1420(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        AbstractC0628.m1436(i, iArr, iArr2, false);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0645, androidx.compose.foundation.layout.InterfaceC0650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public float mo1455() {
        return 0.0f;
    }
}
