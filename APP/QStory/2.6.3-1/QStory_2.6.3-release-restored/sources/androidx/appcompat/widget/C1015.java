package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p206.C8629;
import p206.MenuC8631;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1015 extends C1029 implements InterfaceC1028 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final Method f1022;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public C6686 f1023;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1022 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1028
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo1184(MenuC8631 menuC8631, C8629 c8629) {
        C6686 c6686 = this.f1023;
        if (c6686 != null) {
            c6686.mo1184(menuC8631, c8629);
        }
    }

    @Override // androidx.appcompat.widget.C1029
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1024 mo1185(Context context, boolean z) {
        C1014 c1014 = new C1014(context, z);
        c1014.setHoverListener(this);
        return c1014;
    }

    @Override // androidx.appcompat.widget.InterfaceC1028
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo1186(MenuC8631 menuC8631, MenuItem menuItem) {
        C6686 c6686 = this.f1023;
        if (c6686 != null) {
            c6686.mo1186(menuC8631, menuItem);
        }
    }
}
