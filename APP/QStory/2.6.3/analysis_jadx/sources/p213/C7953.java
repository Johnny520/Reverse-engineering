package p213;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.actionmodecallback.MenuItemOption;
import com.bumptech.glide.load.engine.C3005;
import p052.InterfaceC6543;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7953 extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3005 f22019;

    public C7953(C3005 c3005) {
        this.f22019 = c3005;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C3005 c3005 = this.f22019;
        c3005.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            InterfaceC6543 interfaceC6543 = (InterfaceC6543) c3005.f9538;
            if (interfaceC6543 != null) {
                interfaceC6543.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            InterfaceC6543 interfaceC65432 = (InterfaceC6543) c3005.f9534;
            if (interfaceC65432 != null) {
                interfaceC65432.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            InterfaceC6543 interfaceC65433 = (InterfaceC6543) c3005.f9533;
            if (interfaceC65433 != null) {
                interfaceC65433.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            InterfaceC6543 interfaceC65434 = (InterfaceC6543) c3005.f9535;
            if (interfaceC65434 != null) {
                interfaceC65434.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            InterfaceC6543 interfaceC65435 = (InterfaceC6543) c3005.f9536;
            if (interfaceC65435 != null) {
                interfaceC65435.invoke();
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
        C3005 c3005 = this.f22019;
        c3005.getClass();
        if (menu == null) {
            C5925.m11310("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            C5925.m11310("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (((InterfaceC6543) c3005.f9538) != null) {
            C3005.m6488(menu, MenuItemOption.Copy);
        }
        if (((InterfaceC6543) c3005.f9534) != null) {
            C3005.m6488(menu, MenuItemOption.Paste);
        }
        if (((InterfaceC6543) c3005.f9533) != null) {
            C3005.m6488(menu, MenuItemOption.Cut);
        }
        if (((InterfaceC6543) c3005.f9535) != null) {
            C3005.m6488(menu, MenuItemOption.SelectAll);
        }
        if (((InterfaceC6543) c3005.f9536) == null) {
            return true;
        }
        C3005.m6488(menu, MenuItemOption.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((InterfaceC6543) this.f22019.f9539).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C7328 c7328 = (C7328) this.f22019.f9537;
        if (rect != null) {
            rect.set((int) c7328.f19540, (int) c7328.f19539, (int) c7328.f19538, (int) c7328.f19537);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C3005 c3005 = this.f22019;
        c3005.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        C3005.m6487(menu, MenuItemOption.Copy, (InterfaceC6543) c3005.f9538);
        C3005.m6487(menu, MenuItemOption.Paste, (InterfaceC6543) c3005.f9534);
        C3005.m6487(menu, MenuItemOption.Cut, (InterfaceC6543) c3005.f9533);
        C3005.m6487(menu, MenuItemOption.SelectAll, (InterfaceC6543) c3005.f9535);
        C3005.m6487(menu, MenuItemOption.Autofill, (InterfaceC6543) c3005.f9536);
        return true;
    }
}
