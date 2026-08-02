package p000;

import android.R;
import android.app.Activity;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0724t7 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10586h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f10587i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f10588j;

    public /* synthetic */ RunnableC0724t7(int i, Object obj, Object obj2) {
        this.f10586h = i;
        this.f10587i = obj;
        this.f10588j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws j90 {
        ViewGroup viewGroup;
        int i = this.f10586h;
        Object obj = this.f10588j;
        Object obj2 = this.f10587i;
        switch (i) {
            case 0:
                AbstractC0570p7.m3778n((ViewOnAttachStateChangeListenerC0837w7) obj2, (LongSparseArray) obj);
                return;
            case 1:
                AbstractActivityC0144dw abstractActivityC0144dw = (AbstractActivityC0144dw) obj2;
                abstractActivityC0144dw.getLifecycle().mo505a(new C0709sv(0, (ot1) obj, abstractActivityC0144dw));
                return;
            case 2:
                bi0 bi0Var = (bi0) obj2;
                hg3.m2164b(new File(bi0Var.f867a + bi0Var.f868b, (String) obj));
                return;
            case 3:
                ((C0469mp) obj2).m3142F((vr0) obj);
                return;
            case 4:
                Activity activity = (Activity) obj2;
                C0402kw c0402kw = (C0402kw) obj;
                if (activity.isFinishing() || activity.isDestroyed() || (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) == null) {
                    return;
                }
                l80 l80Var = new l80();
                boolean z = l80Var.f5982k;
                la1 la1Var = l80Var.f5979h;
                if (!z) {
                    l80Var.f5980i.m4432a(null);
                    la1Var.m2892e(z91.ON_CREATE);
                    l80Var.f5982k = true;
                }
                o72 o72Var = new o72();
                y62 y62Var = new y62();
                C0328ix c0328ix = new C0328ix(activity);
                c0328ix.setTag(me.dartcv.nuke.R.id.view_tree_lifecycle_owner, l80Var);
                c0328ix.setTag(me.dartcv.nuke.R.id.view_tree_saved_state_registry_owner, l80Var);
                c0328ix.setTag(me.dartcv.nuke.R.id.view_tree_view_model_store_owner, l80Var);
                c0328ix.setViewCompositionStrategy(new hh1(29, la1Var));
                c0328ix.addOnAttachStateChangeListener(new ku0(y62Var, l80Var, o72Var));
                c0328ix.setContent(new C0402kw(992294570, true, new ju0(c0402kw, o72Var, viewGroup, y62Var, l80Var, 0)));
                o72Var.f7574i = c0328ix;
                try {
                    viewGroup.addView(c0328ix, new ViewGroup.LayoutParams(-1, -1));
                    if (l80Var.f5982k && !l80Var.f5983l) {
                        la1Var.m2892e(z91.ON_START);
                        la1Var.m2892e(z91.ON_RESUME);
                        return;
                    }
                    return;
                } finally {
                }
            case 5:
                ra1 ra1Var = (ra1) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    ra1Var.m4418a();
                }
            default:
                bg3 bg3Var = (bg3) obj2;
                ba1 ba1Var = (ba1) obj;
                if (bg3Var.f850j) {
                    return;
                }
                bg3Var.f851k = ba1Var;
                ba1Var.mo505a(bg3Var);
                return;
        }
    }
}
