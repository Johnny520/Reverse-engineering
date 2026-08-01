package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p190.C7799;
import p190.MenuC7801;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0168 extends C0182 implements InterfaceC0181 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final Method f677;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C5851 f678;

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
    public final void mo623(MenuC7801 menuC7801, C7799 c7799) {
        C5851 c5851 = this.f678;
        if (c5851 != null) {
            c5851.mo623(menuC7801, c7799);
        }
    }

    @Override // androidx.appcompat.widget.C0182
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0177 mo624(Context context, boolean z) {
        C0167 c0167 = new C0167(context, z);
        c0167.setHoverListener(this);
        return c0167;
    }

    @Override // androidx.appcompat.widget.InterfaceC0181
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo625(MenuC7801 menuC7801, MenuItem menuItem) {
        C5851 c5851 = this.f678;
        if (c5851 != null) {
            c5851.mo625(menuC7801, menuItem);
        }
    }
}
