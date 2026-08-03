package p000a;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p000a.C0251Ne;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0928y2 implements InterfaceC0269Oe {

    /* JADX INFO: renamed from: a */
    public final Set<String> f3537a = C0726n9.m1681z("微信", "通讯录", "发现", "我", "WeChat", "Contacts", "Discover", "Me");

    /* JADX INFO: renamed from: b */
    public final Set<String> f3538b = C0726n9.m1681z("微信", "WeChat", "Weixin");

    @Override // p000a.InterfaceC0269Oe
    /* JADX INFO: renamed from: a */
    public final C0251Ne.a mo750a(Activity activity, View view, Class<?> cls) {
        Object objM2206a;
        String string;
        Object next;
        CharSequence text;
        C0251Ne.a aVar = C0251Ne.a.f861c;
        if (view == null) {
            return aVar;
        }
        try {
            objM2206a = Integer.valueOf(view.getContext().getResources().getDisplayMetrics().heightPixels);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (objM2206a instanceof C0901wd.a) {
            objM2206a = 0;
        }
        int iIntValue = ((Number) objM2206a).intValue();
        if (iIntValue <= 0) {
            return aVar;
        }
        int i = (int) (iIntValue * 0.8f);
        int i2 = iIntValue - 200;
        if (i < i2) {
            i = i2;
        }
        C0909x2 c0909x2 = new C0909x2(this, i, 0);
        ArrayList arrayList = new ArrayList();
        C0889w1.m2154m(view, c0909x2, arrayList);
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            string = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            View view2 = (View) next;
            while (view2 != null) {
                if (view2.isSelected() || view2.isActivated()) {
                    break loop0;
                }
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
        }
        View view3 = (View) next;
        if (view3 != null) {
            TextView textView = view3 instanceof TextView ? (TextView) view3 : null;
            if (textView != null && (text = textView.getText()) != null) {
                string = text.toString();
            }
        }
        return string == null ? aVar : this.f3538b.contains(string) ? C0251Ne.a.f859a : C0251Ne.a.f860b;
    }

    @Override // p000a.InterfaceC0269Oe
    /* JADX INFO: renamed from: b */
    public final String mo751b() {
        return "bottomTab";
    }
}
