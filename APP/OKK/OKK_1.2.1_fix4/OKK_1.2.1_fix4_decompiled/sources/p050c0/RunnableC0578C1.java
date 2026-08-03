package p050c0;

import android.app.Activity;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.C1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0578C1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f1717a;

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        Set setKeySet = C0590G1.f1799h.keySet();
        AbstractC0307g.m702d(setKeySet, "<get-keys>(...)");
        Iterator it = AbstractC0181l.m553y0(setKeySet).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Object obj = C0590G1.f1792a;
            if (!zHasNext) {
                break;
            }
            Activity activity = (Activity) it.next();
            if (!activity.isFinishing() && AbstractC0425j.m1005J0(activity.getClass().getName(), "LauncherUI", false)) {
                if (C0590G1.m1458p(activity)) {
                    C0590G1.m1453k(activity);
                } else {
                    C0590G1.m1443a(activity);
                }
            }
        }
        Set setEntrySet = C0590G1.f1797f.entrySet();
        AbstractC0307g.m702d(setEntrySet, "<get-entries>(...)");
        for (Object obj2 : AbstractC0181l.m553y0(setEntrySet)) {
            AbstractC0307g.m702d(obj2, "next(...)");
            Map.Entry entry = (Map.Entry) obj2;
            Activity activity2 = (Activity) entry.getKey();
            WeakReference weakReference = (WeakReference) entry.getValue();
            if (!activity2.isFinishing() && (imageView = (ImageView) weakReference.get()) != null) {
                if (AbstractC0425j.m1005J0(activity2.getClass().getName(), "LauncherUI", false) && C0590G1.m1458p(activity2)) {
                    C0590G1.m1453k(activity2);
                } else {
                    imageView.setAlpha(this.f1717a);
                    imageView.setVisibility(0);
                    C0590G1.m1460r(imageView);
                }
            }
        }
    }
}
