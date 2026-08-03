package top.mmjz.floatingclouds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000a.C0726n9;
import top.mmjz.floatingclouds.C1329R;

/* JADX INFO: loaded from: classes.dex */
public final class ItemSettingButtonBinding {
    private final LinearLayout rootView;
    public final TextView tvDesc;
    public final TextView tvTitle;

    private ItemSettingButtonBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.tvDesc = textView;
        this.tvTitle = textView2;
    }

    public static ItemSettingButtonBinding bind(View view) {
        int i = C1329R.id.tvDesc;
        TextView textView = (TextView) C0726n9.m1673p(view, i);
        if (textView != null) {
            i = C1329R.id.tvTitle;
            TextView textView2 = (TextView) C0726n9.m1673p(view, i);
            if (textView2 != null) {
                return new ItemSettingButtonBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ItemSettingButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static ItemSettingButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C1329R.layout.item_setting_button, viewGroup, false);
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
