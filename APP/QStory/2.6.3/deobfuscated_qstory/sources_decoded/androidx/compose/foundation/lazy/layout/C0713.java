package androidx.compose.foundation.lazy.layout;

import android.view.ActionMode;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.text.contextmenu.internal.C0814;
import androidx.compose.foundation.text.contextmenu.provider.C0830;
import androidx.compose.foundation.text.contextmenu.provider.C0831;
import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1360;
import androidx.compose.runtime.InterfaceC1371;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.snapshots.C1267;
import androidx.compose.runtime.snapshots.C1275;
import androidx.compose.ui.platform.C1914;
import androidx.compose.ui.window.C2097;
import androidx.compose.ui.window.DialogC2105;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0713 implements InterfaceC1360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2017;

    public /* synthetic */ C0713(Object obj, int i) {
        this.f2017 = i;
        this.f2016 = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC1360
    public final void dispose() {
        int i = this.f2017;
        Object obj = this.f2016;
        switch (i) {
            case 0:
                ((C0710) obj).f2000 = null;
                break;
            case 1:
                C0696 c0696 = (C0696) obj;
                C0734 c0734 = c0696.f1959;
                if (c0734 != null) {
                    c0734.f2072 = false;
                }
                c0696.f1959 = null;
                break;
            case 2:
                ((C0701) obj).f1971 = true;
                break;
            case 3:
                ((C0882) obj).m1763();
                break;
            case 4:
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj;
                if (((C0575) interfaceC1395.getValue()) != null) {
                    interfaceC1395.setValue(null);
                }
                break;
            case 5:
                C0814 c0814 = (C0814) obj;
                C1275 c1275 = c0814.f2321;
                C1267 c1267 = c1275.f3714;
                if (c1267 != null) {
                    c1267.m2225();
                }
                c1275.m2248();
                ActionMode actionMode = c0814.f2326;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0814.f2326 = null;
                break;
            case 6:
                C0831 c0831 = (C0831) ((AbstractC1347) ((C0830) obj).f2360).getValue();
                if (c0831 != null) {
                    c0831.close();
                }
                break;
            case 7:
                ((InterfaceC1371) obj).dispose();
                break;
            case 8:
                ((C1914) obj).f5657.invoke();
                break;
            case 9:
                DialogC2105 dialogC2105 = (DialogC2105) obj;
                dialogC2105.dismiss();
                dialogC2105.f6236.m3495();
                break;
            default:
                C2097 c2097 = (C2097) obj;
                c2097.m3495();
                c2097.setTag(R.id.view_tree_lifecycle_owner, null);
                c2097.f6226.removeViewImmediate(c2097);
                break;
        }
    }
}
