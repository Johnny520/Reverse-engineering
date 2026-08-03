package p000a;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.V3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0383V3 implements InterfaceC0808rf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1442a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.qf.<clinit>():void] */
    public /* synthetic */ C0383V3(int i) {
        this.f1442a = i;
    }

    @Override // p000a.InterfaceC0808rf
    /* JADX INFO: renamed from: a */
    public final TextView mo1011a(Activity activity, View view) {
        Object next;
        Object objM2206a;
        Object objM2206a2;
        final int i = 0;
        int i2 = this.f1442a;
        C0631i9.m1482e(view, "rootView");
        switch (i2) {
            case 0:
                C0789qf.f3115a.getClass();
                final int iM1845b = C0789qf.m1845b(activity);
                return C0726n9.m1674q(view, new InterfaceC0064D7() { // from class: a.U3
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj) {
                        String string;
                        TextView textView = (TextView) obj;
                        switch (i) {
                            case 0:
                                C0631i9.m1482e(textView, "v");
                                CharSequence contentDescription = textView.getContentDescription();
                                if (contentDescription == null || (string = contentDescription.toString()) == null) {
                                    string = "";
                                }
                                C0789qf.f3115a.getClass();
                                Set<String> set = C0789qf.f3116b;
                                boolean z = false;
                                if (set == null || !set.isEmpty()) {
                                    Iterator<T> it = set.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (C0034Be.m94I(string, (String) it.next(), false)) {
                                                if (C0726n9.m1661d(textView, iM1845b)) {
                                                    z = true;
                                                }
                                            }
                                        }
                                    }
                                }
                                return Boolean.valueOf(z);
                            default:
                                C0631i9.m1482e(textView, "v");
                                C0789qf.f3115a.getClass();
                                Set<String> set2 = C0789qf.f3116b;
                                CharSequence text = textView.getText();
                                return Boolean.valueOf(C0834t3.m1947k0(set2, text != null ? text.toString() : null) && C0726n9.m1661d(textView, iM1845b));
                        }
                    }
                });
            case 1:
                float f = activity.getResources().getDisplayMetrics().density;
                int i3 = (int) (80 * f);
                float f2 = 16 * f;
                ArrayList arrayList = new ArrayList();
                C0726n9.m1668k(view, new C0105Fc(f2, i3, arrayList));
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int[] iArr = new int[2];
                        try {
                            ((TextView) next).getLocationOnScreen(iArr);
                            objM2206a = C0413Wf.f1577a;
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                        boolean z = objM2206a instanceof C0901wd.a;
                        int i4 = iArr[0];
                        do {
                            Object next2 = it.next();
                            int[] iArr2 = new int[2];
                            try {
                                ((TextView) next2).getLocationOnScreen(iArr2);
                                objM2206a2 = C0413Wf.f1577a;
                            } catch (Throwable th2) {
                                objM2206a2 = C0920xd.m2206a(th2);
                            }
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                            boolean z2 = objM2206a2 instanceof C0901wd.a;
                            int i5 = iArr2[0];
                            if (i4 > i5) {
                                next = next2;
                                i4 = i5;
                            }
                        } while (it.hasNext());
                    }
                    break;
                } else {
                    next = null;
                }
                return (TextView) next;
            default:
                C0789qf.f3115a.getClass();
                final int iM1845b2 = C0789qf.m1845b(activity);
                final int i6 = 1;
                return C0726n9.m1674q(view, new InterfaceC0064D7() { // from class: a.U3
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj) {
                        String string;
                        TextView textView = (TextView) obj;
                        switch (i6) {
                            case 0:
                                C0631i9.m1482e(textView, "v");
                                CharSequence contentDescription = textView.getContentDescription();
                                if (contentDescription == null || (string = contentDescription.toString()) == null) {
                                    string = "";
                                }
                                C0789qf.f3115a.getClass();
                                Set<String> set = C0789qf.f3116b;
                                boolean z3 = false;
                                if (set == null || !set.isEmpty()) {
                                    Iterator<T> it2 = set.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (C0034Be.m94I(string, (String) it2.next(), false)) {
                                                if (C0726n9.m1661d(textView, iM1845b2)) {
                                                    z3 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                                return Boolean.valueOf(z3);
                            default:
                                C0631i9.m1482e(textView, "v");
                                C0789qf.f3115a.getClass();
                                Set<String> set2 = C0789qf.f3116b;
                                CharSequence text = textView.getText();
                                return Boolean.valueOf(C0834t3.m1947k0(set2, text != null ? text.toString() : null) && C0726n9.m1661d(textView, iM1845b2));
                        }
                    }
                });
        }
    }
}
