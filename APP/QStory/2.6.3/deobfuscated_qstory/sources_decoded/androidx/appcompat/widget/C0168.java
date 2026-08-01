package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p190.C7800;
import p190.MenuC7802;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0168 extends C0182 implements InterfaceC0181 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final Method f677;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C5856 f678;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f677 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0181
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo624(MenuC7802 menuC7802, C7800 c7800) {
        C5856 c5856 = this.f678;
        if (c5856 != null) {
            c5856.mo624(menuC7802, c7800);
        }
    }

    @Override // androidx.appcompat.widget.C0182
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0177 mo625(Context context, boolean z) {
        C0167 c0167 = new C0167(context, z);
        c0167.setHoverListener(this);
        return c0167;
    }

    @Override // androidx.appcompat.widget.InterfaceC0181
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo626(MenuC7802 menuC7802, MenuItem menuItem) {
        C5856 c5856 = this.f678;
        if (c5856 != null) {
            c5856.mo626(menuC7802, menuItem);
        }
    }
}
