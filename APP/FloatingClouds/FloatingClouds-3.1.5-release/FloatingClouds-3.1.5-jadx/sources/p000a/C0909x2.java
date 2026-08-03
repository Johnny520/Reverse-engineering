package p000a;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.x2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0909x2 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3513c;

    public /* synthetic */ C0909x2(Object obj, int i, int i2) {
        this.f3511a = i2;
        this.f3513c = obj;
        this.f3512b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo53f(Object obj) {
        boolean z;
        Object objM2206a;
        List<String> list;
        switch (this.f3511a) {
            case 0:
                View view = (View) obj;
                C0631i9.m1482e(view, "v");
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    if (textView.getVisibility() == 0) {
                        Set<String> set = ((C0928y2) this.f3513c).f3537a;
                        CharSequence text = textView.getText();
                        if (C0834t3.m1947k0(set, text != null ? text.toString() : null)) {
                            Rect rect = new Rect();
                            z = view.getGlobalVisibleRect(rect) && rect.bottom > this.f3512b;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                TextView textView2 = (TextView) obj;
                C0631i9.m1482e(textView2, "v");
                boolean z2 = false;
                if (textView2.getId() != -1) {
                    try {
                        objM2206a = textView2.getResources().getResourceEntryName(textView2.getId());
                    } catch (Throwable th) {
                        objM2206a = C0920xd.m2206a(th);
                    }
                    if (objM2206a instanceof C0901wd.a) {
                        objM2206a = null;
                    }
                    String str = (String) objM2206a;
                    if (str != null && ((list = ((C0749od) this.f3513c).f2954a) == null || !list.isEmpty())) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C0034Be.m94I(str, (String) it.next(), true)) {
                                    if (C0726n9.m1661d(textView2, this.f3512b)) {
                                        CharSequence text2 = textView2.getText();
                                        if ((text2 != null ? text2.length() : 0) <= 10) {
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return Boolean.valueOf(z2);
        }
    }
}
