package p213;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import com.bumptech.glide.load.engine.C3004;
import p052.InterfaceC6542;
import p112.C7327;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7952 extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3004 f22022;

    public C7952(C3004 c3004) {
        this.f22022 = c3004;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C3004 c3004 = this.f22022;
        c3004.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            InterfaceC6542 interfaceC6542 = (InterfaceC6542) c3004.f9536;
            if (interfaceC6542 != null) {
                interfaceC6542.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            InterfaceC6542 interfaceC65422 = (InterfaceC6542) c3004.f9532;
            if (interfaceC65422 != null) {
                interfaceC65422.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            InterfaceC6542 interfaceC65423 = (InterfaceC6542) c3004.f9531;
            if (interfaceC65423 != null) {
                interfaceC65423.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            InterfaceC6542 interfaceC65424 = (InterfaceC6542) c3004.f9533;
            if (interfaceC65424 != null) {
                interfaceC65424.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            InterfaceC6542 interfaceC65425 = (InterfaceC6542) c3004.f9534;
            if (interfaceC65425 != null) {
                interfaceC65425.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C3004 c3004 = this.f22022;
        c3004.getClass();
        if (menu == null) {
            C5919.m11249("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            C5919.m11249("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (((InterfaceC6542) c3004.f9536) != null) {
            C3004.m6430(menu, MenuItemOption.Copy);
        }
        if (((InterfaceC6542) c3004.f9532) != null) {
            C3004.m6430(menu, MenuItemOption.Paste);
        }
        if (((InterfaceC6542) c3004.f9531) != null) {
            C3004.m6430(menu, MenuItemOption.Cut);
        }
        if (((InterfaceC6542) c3004.f9533) != null) {
            C3004.m6430(menu, MenuItemOption.SelectAll);
        }
        if (((InterfaceC6542) c3004.f9534) == null) {
            return true;
        }
        C3004.m6430(menu, MenuItemOption.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((InterfaceC6542) this.f22022.f9537).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C7327 c7327 = (C7327) this.f22022.f9535;
        if (rect != null) {
            rect.set((int) c7327.f19545, (int) c7327.f19544, (int) c7327.f19543, (int) c7327.f19542);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C3004 c3004 = this.f22022;
        c3004.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        C3004.m6429(menu, MenuItemOption.Copy, (InterfaceC6542) c3004.f9536);
        C3004.m6429(menu, MenuItemOption.Paste, (InterfaceC6542) c3004.f9532);
        C3004.m6429(menu, MenuItemOption.Cut, (InterfaceC6542) c3004.f9531);
        C3004.m6429(menu, MenuItemOption.SelectAll, (InterfaceC6542) c3004.f9533);
        C3004.m6429(menu, MenuItemOption.Autofill, (InterfaceC6542) c3004.f9534);
        return true;
    }
}
