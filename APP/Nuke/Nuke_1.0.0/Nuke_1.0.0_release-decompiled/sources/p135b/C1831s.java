package p135b;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1926h;
import java.util.Iterator;
import java.util.List;
import p117X2.AbstractC1665j;
import p229r1.C3072d0;
import p229r1.C3074e0;
import p229r1.C3076f0;
import p246u1.AbstractC3330a;

/* JADX INFO: renamed from: b.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1831s extends C1830r {
    @Override // p135b.C1829q, p135b.C1827o
    /* JADX INFO: renamed from: b */
    public void mo3297b(C1812D c1812d, C1812D c1812d2, Window window, View view, boolean z5, boolean z6) {
        AbstractC1665j.m2985e(c1812d, "statusBarStyle");
        AbstractC1665j.m2985e(c1812d2, "navigationBarStyle");
        AbstractC1665j.m2985e(window, "window");
        AbstractC1665j.m2985e(view, "view");
        AbstractC1924f.m3511y(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i5 = 0;
            while (true) {
                if (!(i5 < viewGroup.getChildCount())) {
                    break;
                }
                int i6 = i5 + 1;
                View childAt = viewGroup.getChildAt(i5);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof AbstractC3330a)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i5 = i6;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i7 = Build.VERSION.SDK_INT;
        AbstractC1926h c3076f0 = i7 >= 35 ? new C3076f0(window) : i7 >= 30 ? new C3074e0(window) : new C3072d0(window);
        c3076f0.mo3585D(!z5);
        c3076f0.mo3584C(true ^ z6);
    }
}
