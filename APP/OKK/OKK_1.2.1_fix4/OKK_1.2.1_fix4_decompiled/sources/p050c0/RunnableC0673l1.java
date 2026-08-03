package p050c0;

import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p009E0.AbstractC0188s;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0673l1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0685p1 f2099c;

    public /* synthetic */ RunnableC0673l1(String str, AbstractC0685p1 abstractC0685p1, int i2) {
        this.f2097a = i2;
        this.f2098b = str;
        this.f2099c = abstractC0685p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f2098b;
        AbstractC0685p1 abstractC0685p1 = this.f2099c;
        switch (this.f2097a) {
            case 0:
                AbstractC0307g.m703e(str, "$sender");
                AbstractC0307g.m703e(abstractC0685p1, "$result");
                C0688q1 c0688q1 = C0688q1.f2163a;
                C0679n1 c0679n1 = (C0679n1) abstractC0685p1;
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C0688q1.f2172j.get(str);
                if (copyOnWriteArrayList != null) {
                    AbstractC0188s.m562n0(copyOnWriteArrayList, new C0615P(1, str, c0679n1.f2136a));
                }
                break;
            default:
                AbstractC0307g.m703e(abstractC0685p1, "$result");
                CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) C0688q1.f2172j.get(str);
                if (copyOnWriteArrayList2 != null) {
                    Iterator it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        TextView textView = (TextView) ((WeakReference) it.next()).get();
                        if (textView != null && AbstractC0307g.m699a(textView.getTag(2113929217), str)) {
                            C0688q1 c0688q12 = C0688q1.f2163a;
                            C0688q1.m1766a(textView, str, ((C0679n1) abstractC0685p1).f2136a);
                        }
                    }
                }
                break;
        }
    }
}
