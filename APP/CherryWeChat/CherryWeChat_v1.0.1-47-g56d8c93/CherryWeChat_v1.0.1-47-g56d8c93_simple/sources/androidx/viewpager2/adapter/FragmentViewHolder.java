package androidx.viewpager2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentViewHolder extends AbstractC1166o {
    private FragmentViewHolder(FrameLayout r1) {
        super(r1);
    }

    public static FragmentViewHolder create(ViewGroup r2) {
        FrameLayout r0 = new FrameLayout(r2.getContext());
        r0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r0.setId(View.generateViewId());
        r0.setSaveEnabled(false);
        return new FragmentViewHolder(r0);
    }

    public FrameLayout getContainer() {
        return (FrameLayout) this.itemView;
    }
}
