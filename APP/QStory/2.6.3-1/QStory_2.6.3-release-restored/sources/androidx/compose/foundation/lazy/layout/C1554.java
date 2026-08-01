package androidx.compose.foundation.lazy.layout;

import android.view.ActionMode;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.text.contextmenu.internal.C1654;
import androidx.compose.foundation.text.contextmenu.provider.C1670;
import androidx.compose.foundation.text.contextmenu.provider.C1671;
import androidx.compose.foundation.text.selection.C1720;
import androidx.compose.p001ui.platform.C2749;
import androidx.compose.p001ui.window.C2930;
import androidx.compose.p001ui.window.DialogC2938;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2195;
import androidx.compose.runtime.InterfaceC2206;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.snapshots.C2102;
import androidx.compose.runtime.snapshots.C2110;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1554 implements InterfaceC2195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2362;

    public /* synthetic */ C1554(Object obj, int i) {
        this.f2362 = i;
        this.f2361 = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC2195
    public final void dispose() {
        int i = this.f2362;
        Object obj = this.f2361;
        switch (i) {
            case 0:
                ((C1551) obj).f2345 = null;
                break;
            case 1:
                C1537 c1537 = (C1537) obj;
                C1575 c1575 = c1537.f2304;
                if (c1575 != null) {
                    c1575.f2417 = false;
                }
                c1537.f2304 = null;
                break;
            case 2:
                ((C1542) obj).f2316 = true;
                break;
            case 3:
                ((C1720) obj).m2323();
                break;
            case 4:
                InterfaceC2230 interfaceC2230 = (InterfaceC2230) obj;
                if (((C1416) interfaceC2230.getValue()) != null) {
                    interfaceC2230.setValue(null);
                }
                break;
            case 5:
                C1654 c1654 = (C1654) obj;
                C2110 c2110 = c1654.f2666;
                C2102 c2102 = c2110.f4059;
                if (c2102 != null) {
                    c2102.m2785();
                }
                c2110.m2808();
                ActionMode actionMode = c1654.f2671;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c1654.f2671 = null;
                break;
            case 6:
                C1671 c1671 = (C1671) ((AbstractC2182) ((C1670) obj).f2705).getValue();
                if (c1671 != null) {
                    c1671.close();
                }
                break;
            case 7:
                ((InterfaceC2206) obj).dispose();
                break;
            case 8:
                ((C2749) obj).f6002.invoke();
                break;
            case 9:
                DialogC2938 dialogC2938 = (DialogC2938) obj;
                dialogC2938.dismiss();
                dialogC2938.f6581.m4055();
                break;
            default:
                C2930 c2930 = (C2930) obj;
                c2930.m4055();
                c2930.setTag(C0328R.id.view_tree_lifecycle_owner, null);
                c2930.f6571.removeViewImmediate(c2930);
                break;
        }
    }
}
