package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0146;
import androidx.appcompat.widget.C0159;
import androidx.appcompat.widget.C0197;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC2270;
import com.alibaba.fastjson2.C2942;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p190.C7800;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0060 extends AbstractC0088 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0065 f125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Window.Callback f126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0146 f127;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f129 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final RunnableC0062 f128 = new RunnableC0062(this, 0);

    public C0060(Toolbar toolbar, CharSequence charSequence, WindowCallbackC0083 windowCallbackC0083) {
        C0065 c0065 = new C0065(this);
        C0146 c0146 = new C0146(toolbar, false);
        this.f127 = c0146;
        windowCallbackC0083.getClass();
        this.f126 = windowCallbackC0083;
        c0146.f618 = windowCallbackC0083;
        toolbar.setOnMenuItemClickListener(c0065);
        boolean z = c0146.f617;
        if (!z) {
            c0146.f616 = charSequence;
            if ((c0146.f611 & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    AbstractC2270.m4241(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f125 = new C0065(this);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    public void addOnMenuVisibilityListener(InterfaceC0089 interfaceC0089) {
        this.f129.add(interfaceC0089);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    public void removeOnMenuVisibilityListener(InterfaceC0089 interfaceC0089) {
        this.f129.remove(interfaceC0089);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo168() {
        C0146 c0146 = this.f127;
        Toolbar toolbar = c0146.f612;
        RunnableC0062 runnableC0062 = this.f128;
        toolbar.removeCallbacks(runnableC0062);
        Toolbar toolbar2 = c0146.f612;
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        toolbar2.postOnAnimation(runnableC0062);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Context mo169() {
        return this.f127.f612.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo170() {
        return this.f127.f611;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo171(boolean z) {
        if (z == this.f122) {
            return;
        }
        this.f122 = z;
        ArrayList arrayList = this.f129;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        C2942.m6394();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo172() {
        C7800 c7800;
        C0159 c0159 = this.f127.f612.f522;
        if (c0159 == null || (c7800 = c0159.f643) == null) {
            return false;
        }
        if (c0159 == null) {
            c7800 = null;
        }
        if (c7800 == null) {
            return true;
        }
        c7800.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo173() {
        C0197 c0197;
        ActionMenuView actionMenuView = this.f127.f612.f511;
        return (actionMenuView == null || (c0197 = actionMenuView.f457) == null || !c0197.m704()) ? false : true;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo174(CharSequence charSequence) {
        C0146 c0146 = this.f127;
        if (c0146.f617) {
            return;
        }
        Toolbar toolbar = c0146.f612;
        c0146.f616 = charSequence;
        if ((c0146.f611 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c0146.f617) {
                AbstractC2270.m4241(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Menu m176() {
        boolean z = this.f123;
        C0146 c0146 = this.f127;
        if (!z) {
            C0064 c0064 = new C0064(this, 0);
            C0065 c0065 = new C0065(this);
            Toolbar toolbar = c0146.f612;
            toolbar.f517 = c0064;
            toolbar.f516 = c0065;
            ActionMenuView actionMenuView = toolbar.f511;
            if (actionMenuView != null) {
                actionMenuView.f456 = c0064;
                actionMenuView.f453 = c0065;
            }
            this.f123 = true;
        }
        return c0146.f612.getMenu();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo177() {
        this.f127.f612.removeCallbacks(this.f128);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo179() {
        return this.f127.f612.m501();
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo181(int i, KeyEvent keyEvent) {
        Menu menuM176 = m176();
        if (menuM176 == null) {
            return false;
        }
        menuM176.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM176.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo182(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo179();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo178() {
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo175(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC0088
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo180(boolean z) {
    }
}
