package androidx.activity;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.AbstractC3049;
import androidx.core.view.AbstractC3100;
import androidx.core.view.C3048;
import java.util.Iterator;
import java.util.List;
import p167.AbstractC8418;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0872 extends C0873 {
    @Override // androidx.activity.C0874, androidx.activity.C0891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo591(C0860 c0860, C0860 c08602, Window window, View view, boolean z, boolean z2) {
        c0860.getClass();
        c08602.getClass();
        window.getClass();
        view.getClass();
        AbstractC3100.m4790(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof AbstractC8418)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        AbstractC3049 abstractC3049 = new C3048(window, view).f6843;
        abstractC3049.mo4573(!z);
        abstractC3049.mo4574(!z2);
    }
}
