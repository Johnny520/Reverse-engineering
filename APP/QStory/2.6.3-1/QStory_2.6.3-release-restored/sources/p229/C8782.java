package p229;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.p001ui.platform.actionmodecallback.MenuItemOption;
import com.bumptech.glide.load.engine.C3837;
import p068.InterfaceC7372;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8782 extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3837 f22364;

    public C8782(C3837 c3837) {
        this.f22364 = c3837;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C3837 c3837 = this.f22364;
        c3837.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            InterfaceC7372 interfaceC7372 = (InterfaceC7372) c3837.f9883;
            if (interfaceC7372 != null) {
                interfaceC7372.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            InterfaceC7372 interfaceC73722 = (InterfaceC7372) c3837.f9879;
            if (interfaceC73722 != null) {
                interfaceC73722.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            InterfaceC7372 interfaceC73723 = (InterfaceC7372) c3837.f9878;
            if (interfaceC73723 != null) {
                interfaceC73723.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            InterfaceC7372 interfaceC73724 = (InterfaceC7372) c3837.f9880;
            if (interfaceC73724 != null) {
                interfaceC73724.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            InterfaceC7372 interfaceC73725 = (InterfaceC7372) c3837.f9881;
            if (interfaceC73725 != null) {
                interfaceC73725.invoke();
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
        C3837 c3837 = this.f22364;
        c3837.getClass();
        if (menu == null) {
            C6755.m11869("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            C6755.m11869("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (((InterfaceC7372) c3837.f9883) != null) {
            C3837.m7048(menu, MenuItemOption.Copy);
        }
        if (((InterfaceC7372) c3837.f9879) != null) {
            C3837.m7048(menu, MenuItemOption.Paste);
        }
        if (((InterfaceC7372) c3837.f9878) != null) {
            C3837.m7048(menu, MenuItemOption.Cut);
        }
        if (((InterfaceC7372) c3837.f9880) != null) {
            C3837.m7048(menu, MenuItemOption.SelectAll);
        }
        if (((InterfaceC7372) c3837.f9881) == null) {
            return true;
        }
        C3837.m7048(menu, MenuItemOption.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((InterfaceC7372) this.f22364.f9884).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C8157 c8157 = (C8157) this.f22364.f9882;
        if (rect != null) {
            rect.set((int) c8157.f19885, (int) c8157.f19884, (int) c8157.f19883, (int) c8157.f19882);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C3837 c3837 = this.f22364;
        c3837.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        C3837.m7047(menu, MenuItemOption.Copy, (InterfaceC7372) c3837.f9883);
        C3837.m7047(menu, MenuItemOption.Paste, (InterfaceC7372) c3837.f9879);
        C3837.m7047(menu, MenuItemOption.Cut, (InterfaceC7372) c3837.f9878);
        C3837.m7047(menu, MenuItemOption.SelectAll, (InterfaceC7372) c3837.f9880);
        C3837.m7047(menu, MenuItemOption.Autofill, (InterfaceC7372) c3837.f9881);
        return true;
    }
}
