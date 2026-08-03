package p000a;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.qf */
/* JADX INFO: loaded from: classes.dex */
public final class C0789qf {

    /* JADX INFO: renamed from: a */
    public static final C0789qf f3115a = new C0789qf();

    /* JADX INFO: renamed from: b */
    public static final Set<String> f3116b = C0726n9.m1681z("微信", "WeChat", "Weixin");

    /* JADX INFO: renamed from: c */
    public static final List<InterfaceC0808rf> f3117c = C0739o3.m1757d0(new C0383V3(2), new C0383V3(0), new C0749od(), new C0383V3(1));

    /* JADX INFO: renamed from: a */
    public static TextView m1844a(Activity activity, View view) {
        InterfaceC0808rf next;
        Object objM2206a;
        TextView textView;
        C0631i9.m1482e(view, "rootView");
        Iterator<InterfaceC0808rf> it = f3117c.iterator();
        do {
            if (!it.hasNext()) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"TitleLocator: all strategies failed, title not found"}, 1));
                return null;
            }
            next = it.next();
            try {
                objM2206a = next.mo1011a(activity, view);
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            textView = (TextView) (objM2206a instanceof C0901wd.a ? null : objM2206a);
        } while (textView == null);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"TitleLocator: located by " + next.getClass().getSimpleName() + " text='" + ((Object) textView.getText()) + "'"}, 1));
        return textView;
    }

    /* JADX INFO: renamed from: b */
    public static int m1845b(Activity activity) {
        int iMin = Math.min((int) (r2.heightPixels * 0.3f), (int) (200 * activity.getResources().getDisplayMetrics().density));
        if (iMin < 120) {
            return 120;
        }
        return iMin;
    }
}
