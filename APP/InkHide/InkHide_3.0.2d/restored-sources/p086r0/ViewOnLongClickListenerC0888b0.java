package p086r0;

import android.view.View;
import java.util.List;
import p001A0.RunnableC0045r;
import p069i.C0709q1;
import p069i.C0716t;
import p088s0.C0983e;
import p088s0.C0994p;

/* JADX INFO: renamed from: r0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0888b0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3067b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3068c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3069d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnLongClickListenerC0888b0(Object obj, Object obj2, int i2) {
        this.f3067b = i2;
        this.f3068c = obj;
        this.f3069d = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object obj = this.f3068c;
        Object obj2 = this.f3069d;
        switch (this.f3067b) {
            case 0:
                View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) obj;
                if (view != null) {
                    C0894d0 c0894d0 = (C0894d0) obj2;
                    C0894d0.m1844f(c0894d0, view, onLongClickListener);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean zOnLongClick = onLongClickListener.onLongClick(view);
                    C0894d0.m1821J0("contact original longClick", jCurrentTimeMillis, onLongClickListener.getClass().getName());
                    view.post(new RunnableC0045r(c0894d0, view, onLongClickListener, 6));
                }
                break;
            case 1:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                View.OnLongClickListener onLongClickListener2 = (View.OnLongClickListener) obj;
                boolean zOnLongClick2 = onLongClickListener2.onLongClick(view);
                String name = onLongClickListener2.getClass().getName();
                List list = C0842H0.f2813g0;
                C0842H0 c0842h0 = (C0842H0) obj2;
                c0842h0.getClass();
                C0842H0.m1623b1("conversation original longClick", jCurrentTimeMillis2, name);
                if (view != null) {
                    view.post(new RunnableC0045r(c0842h0, view, onLongClickListener2, 9));
                }
                break;
            case 2:
                C0709q1.m1342a((C0709q1) obj, ((C0983e) obj2).f2595b);
                break;
            default:
                C0716t.m1349b((C0716t) obj, ((C0994p) obj2).f2595b);
                break;
        }
        return true;
    }
}
