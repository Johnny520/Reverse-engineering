package androidx.activity;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.AbstractC2216;
import androidx.core.view.AbstractC2267;
import androidx.core.view.C2215;
import java.util.Iterator;
import java.util.List;
import p151.AbstractC7589;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0025 extends C0026 {
    @Override // androidx.activity.C0027, androidx.activity.C0044
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo31(C0013 c0013, C0013 c00132, Window window, View view, boolean z, boolean z2) {
        c0013.getClass();
        c00132.getClass();
        window.getClass();
        view.getClass();
        AbstractC2267.m4230(window, false);
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
                    if (list.size() == 4 && (list.get(0) instanceof AbstractC7589)) {
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
        AbstractC2216 abstractC2216 = new C2215(window, view).f6498;
        abstractC2216.mo4013(!z);
        abstractC2216.mo4014(!z2);
    }
}
