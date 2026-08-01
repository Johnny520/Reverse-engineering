package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0993;
import androidx.appcompat.widget.C1006;
import androidx.appcompat.widget.C1044;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC3103;
import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p206.C8629;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0907 extends AbstractC0935 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0912 f470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Window.Callback f471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0993 f472;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f474 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final RunnableC0909 f473 = new RunnableC0909(this, 0);

    public C0907(Toolbar toolbar, CharSequence charSequence, WindowCallbackC0930 windowCallbackC0930) {
        C0912 c0912 = new C0912(this);
        C0993 c0993 = new C0993(toolbar, false);
        this.f472 = c0993;
        windowCallbackC0930.getClass();
        this.f471 = windowCallbackC0930;
        c0993.f963 = windowCallbackC0930;
        toolbar.setOnMenuItemClickListener(c0912);
        boolean z = c0993.f962;
        if (!z) {
            c0993.f961 = charSequence;
            if ((c0993.f956 & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    AbstractC3103.m4801(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f470 = new C0912(this);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    public void addOnMenuVisibilityListener(InterfaceC0936 interfaceC0936) {
        this.f474.add(interfaceC0936);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    public void removeOnMenuVisibilityListener(InterfaceC0936 interfaceC0936) {
        this.f474.remove(interfaceC0936);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo728() {
        C0993 c0993 = this.f472;
        Toolbar toolbar = c0993.f957;
        RunnableC0909 runnableC0909 = this.f473;
        toolbar.removeCallbacks(runnableC0909);
        Toolbar toolbar2 = c0993.f957;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        toolbar2.postOnAnimation(runnableC0909);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context mo729() {
        return this.f472.f957.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo730() {
        return this.f472.f956;
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo731(boolean z) {
        if (z == this.f467) {
            return;
        }
        this.f467 = z;
        ArrayList arrayList = this.f474;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        C3775.m6954();
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo732() {
        C8629 c8629;
        C1006 c1006 = this.f472.f957.f867;
        if (c1006 == null || (c8629 = c1006.f988) == null) {
            return false;
        }
        if (c1006 == null) {
            c8629 = null;
        }
        if (c8629 == null) {
            return true;
        }
        c8629.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo733() {
        C1044 c1044;
        ActionMenuView actionMenuView = this.f472.f957.f856;
        return (actionMenuView == null || (c1044 = actionMenuView.f802) == null || !c1044.m1264()) ? false : true;
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo734(CharSequence charSequence) {
        C0993 c0993 = this.f472;
        if (c0993.f962) {
            return;
        }
        Toolbar toolbar = c0993.f957;
        c0993.f961 = charSequence;
        if ((c0993.f956 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0993.f962) {
                AbstractC3103.m4801(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Menu m736() {
        boolean z = this.f468;
        C0993 c0993 = this.f472;
        if (!z) {
            C0911 c0911 = new C0911(this, 0);
            C0912 c0912 = new C0912(this);
            Toolbar toolbar = c0993.f957;
            toolbar.f862 = c0911;
            toolbar.f861 = c0912;
            ActionMenuView actionMenuView = toolbar.f856;
            if (actionMenuView != null) {
                actionMenuView.f801 = c0911;
                actionMenuView.f798 = c0912;
            }
            this.f468 = true;
        }
        return c0993.f957.getMenu();
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo737() {
        this.f472.f957.removeCallbacks(this.f473);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo739() {
        return this.f472.f957.m1061();
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo741(int i, KeyEvent keyEvent) {
        Menu menuM736 = m736();
        if (menuM736 == null) {
            return false;
        }
        menuM736.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM736.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo742(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo739();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo738() {
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo735(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0935
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo740(boolean z) {
    }
}
