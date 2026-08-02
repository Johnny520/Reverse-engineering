package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ew {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(dw dwVar, kw kwVar) {
        View childAt = ((ViewGroup) dwVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ix ixVar = childAt instanceof ix ? (ix) childAt : null;
        if (ixVar != null) {
            ixVar.setParentCompositionContext(null);
            ixVar.setContent(kwVar);
            return;
        }
        ix ixVar2 = new ix(dwVar);
        ixVar2.setParentCompositionContext(null);
        ixVar2.setContent(kwVar);
        View decorView = dwVar.getWindow().getDecorView();
        if (rb3.b(decorView) == null) {
            decorView.setTag(me.dartcv.nuke.R.id.view_tree_lifecycle_owner, dwVar);
        }
        if (tb3.b(decorView) == null) {
            decorView.setTag(me.dartcv.nuke.R.id.view_tree_view_model_store_owner, dwVar);
        }
        if (sb3.b(decorView) == null) {
            decorView.setTag(me.dartcv.nuke.R.id.view_tree_saved_state_registry_owner, dwVar);
        }
        dwVar.setContentView(ixVar2, a);
    }
}
