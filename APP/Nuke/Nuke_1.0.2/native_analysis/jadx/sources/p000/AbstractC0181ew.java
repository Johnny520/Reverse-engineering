package p000;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ew */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0181ew {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f2656a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: a */
    public static void m1480a(AbstractActivityC0144dw abstractActivityC0144dw, C0402kw c0402kw) {
        View childAt = ((ViewGroup) abstractActivityC0144dw.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0328ix c0328ix = childAt instanceof C0328ix ? (C0328ix) childAt : null;
        if (c0328ix != null) {
            c0328ix.setParentCompositionContext(null);
            c0328ix.setContent(c0402kw);
            return;
        }
        C0328ix c0328ix2 = new C0328ix(abstractActivityC0144dw);
        c0328ix2.setParentCompositionContext(null);
        c0328ix2.setContent(c0402kw);
        View decorView = abstractActivityC0144dw.getWindow().getDecorView();
        if (rb3.m4427b(decorView) == null) {
            decorView.setTag(me.dartcv.nuke.R.id.view_tree_lifecycle_owner, abstractActivityC0144dw);
        }
        if (tb3.m5156b(decorView) == null) {
            decorView.setTag(me.dartcv.nuke.R.id.view_tree_view_model_store_owner, abstractActivityC0144dw);
        }
        if (sb3.m4784b(decorView) == null) {
            decorView.setTag(me.dartcv.nuke.R.id.view_tree_saved_state_registry_owner, abstractActivityC0144dw);
        }
        abstractActivityC0144dw.setContentView(c0328ix2, f2656a);
    }
}
