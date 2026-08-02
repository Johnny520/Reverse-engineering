package defpackage;

import android.R;
import android.app.Activity;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ t7(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() throws j90 {
        ViewGroup viewGroup;
        int i = this.h;
        Object obj = this.j;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                p7.n((w7) obj2, (LongSparseArray) obj);
                return;
            case 1:
                dw dwVar = (dw) obj2;
                dwVar.getLifecycle().a(new sv(0, (ot1) obj, dwVar));
                return;
            case 2:
                bi0 bi0Var = (bi0) obj2;
                hg3.b(new File(bi0Var.a + bi0Var.b, (String) obj));
                return;
            case 3:
                ((mp) obj2).F((vr0) obj);
                return;
            case 4:
                Activity activity = (Activity) obj2;
                kw kwVar = (kw) obj;
                if (activity.isFinishing() || activity.isDestroyed() || (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) == null) {
                    return;
                }
                l80 l80Var = new l80();
                boolean z = l80Var.k;
                la1 la1Var = l80Var.h;
                if (!z) {
                    l80Var.i.a(null);
                    la1Var.e(z91.ON_CREATE);
                    l80Var.k = true;
                }
                o72 o72Var = new o72();
                y62 y62Var = new y62();
                ix ixVar = new ix(activity);
                ixVar.setTag(me.dartcv.nuke.R.id.view_tree_lifecycle_owner, l80Var);
                ixVar.setTag(me.dartcv.nuke.R.id.view_tree_saved_state_registry_owner, l80Var);
                ixVar.setTag(me.dartcv.nuke.R.id.view_tree_view_model_store_owner, l80Var);
                ixVar.setViewCompositionStrategy(new hh1(29, la1Var));
                ixVar.addOnAttachStateChangeListener(new ku0(y62Var, l80Var, o72Var));
                ixVar.setContent(new kw(992294570, true, new ju0(kwVar, o72Var, viewGroup, y62Var, l80Var, 0)));
                o72Var.i = ixVar;
                try {
                    viewGroup.addView(ixVar, new ViewGroup.LayoutParams(-1, -1));
                    if (l80Var.k && !l80Var.l) {
                        la1Var.e(z91.ON_START);
                        la1Var.e(z91.ON_RESUME);
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
                    ra1Var.a();
                }
            default:
                bg3 bg3Var = (bg3) obj2;
                ba1 ba1Var = (ba1) obj;
                if (bg3Var.j) {
                    return;
                }
                bg3Var.k = ba1Var;
                ba1Var.a(bg3Var);
                return;
        }
    }
}
