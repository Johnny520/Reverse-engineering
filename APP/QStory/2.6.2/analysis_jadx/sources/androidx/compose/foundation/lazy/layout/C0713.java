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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0713 implements InterfaceC1360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2016;

    public /* synthetic */ C0713(Object obj, int i) {
        this.f2016 = i;
        this.f2015 = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC1360
    public final void dispose() {
        int i = this.f2016;
        Object obj = this.f2015;
        switch (i) {
            case 0:
                ((C0710) obj).f1999 = null;
                break;
            case 1:
                C0696 c0696 = (C0696) obj;
                C0734 c0734 = c0696.f1958;
                if (c0734 != null) {
                    c0734.f2071 = false;
                }
                c0696.f1958 = null;
                break;
            case 2:
                ((C0701) obj).f1970 = true;
                break;
            case 3:
                ((C0882) obj).m1753();
                break;
            case 4:
                InterfaceC1395 interfaceC1395 = (InterfaceC1395) obj;
                if (((C0575) interfaceC1395.getValue()) != null) {
                    interfaceC1395.setValue(null);
                }
                break;
            case 5:
                C0814 c0814 = (C0814) obj;
                C1275 c1275 = c0814.f2320;
                C1267 c1267 = c1275.f3713;
                if (c1267 != null) {
                    c1267.m2215();
                }
                c1275.m2238();
                ActionMode actionMode = c0814.f2325;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0814.f2325 = null;
                break;
            case 6:
                C0831 c0831 = (C0831) ((AbstractC1347) ((C0830) obj).f2359).getValue();
                if (c0831 != null) {
                    c0831.close();
                }
                break;
            case 7:
                ((InterfaceC1371) obj).dispose();
                break;
            case 8:
                ((C1914) obj).f5656.invoke();
                break;
            case 9:
                DialogC2105 dialogC2105 = (DialogC2105) obj;
                dialogC2105.dismiss();
                dialogC2105.f6235.m3485();
                break;
            default:
                C2097 c2097 = (C2097) obj;
                c2097.m3485();
                c2097.setTag(R.id.view_tree_lifecycle_owner, null);
                c2097.f6225.removeViewImmediate(c2097);
                break;
        }
    }
}
