package top.mmjz.floatingclouds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p000a.C0726n9;
import top.mmjz.floatingclouds.C1329R;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutMainBinding {
    public final FrameLayout mainContainer;
    private final LinearLayout rootView;

    private LayoutMainBinding(LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.mainContainer = frameLayout;
    }

    public static LayoutMainBinding bind(View view) {
        int i = C1329R.id.mainContainer;
        FrameLayout frameLayout = (FrameLayout) C0726n9.m1673p(view, i);
        if (frameLayout != null) {
            return new LayoutMainBinding((LinearLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LayoutMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static LayoutMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C1329R.layout.layout_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
