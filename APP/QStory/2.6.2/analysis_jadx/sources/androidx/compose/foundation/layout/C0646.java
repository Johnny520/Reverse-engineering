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
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646 implements InterfaceC0645, InterfaceC0650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f1816 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C0625 m1446(InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        View view = (View) c1324.m2373(AbstractC1835.f5331);
        C0625 c0625M1449 = m1449(view);
        boolean zM2368 = c1324.m2368(c0625M1449) | c1324.m2368(view);
        Object objM2335 = c1324.m2335();
        if (zM2368 || objM2335 == C1369.f3973) {
            objM2335 = new C0002(c0625M1449, 9, view);
            c1324.m2376(objM2335);
        }
        AbstractC1367.m2475(c0625M1449, (InterfaceC6557) objM2335, c1324);
        return c0625M1449;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0612 m1447(int i, String str) {
        WeakHashMap weakHashMap = C0625.f1739;
        return new C0612(new C0671(0, 0, 0, 0), str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0631 m1448(int i, String str) {
        WeakHashMap weakHashMap = C0625.f1739;
        return new C0631(i, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0625 m1449(View view) {
        C0625 c0625;
        WeakHashMap weakHashMap = C0625.f1739;
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
        switch (this.f1816) {
            case 0:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0645
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1435(InterfaceC1653 interfaceC1653, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            AbstractC0628.m1426(i, iArr, iArr2, false);
        } else {
            AbstractC0628.m1426(i, iArr, iArr2, true);
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo1410(int i, InterfaceC1653 interfaceC1653, int[] iArr, int[] iArr2) {
        AbstractC0628.m1426(i, iArr, iArr2, false);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0645, androidx.compose.foundation.layout.InterfaceC0650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public float mo1445() {
        return 0.0f;
    }
}
