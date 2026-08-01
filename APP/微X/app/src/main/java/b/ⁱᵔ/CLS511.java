// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;

public final class CLS511 implements AbsListView.OnScrollListener {
    public final CLS425 FLD5052;

    public CLS511(CLS425 ˊﹳ0) {
        this.FLD5052 = ˊﹳ0;
        super();
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScroll(AbsListView absListView0, int v, int v1, int v2) {
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView0, int v) {
        this.FLD5052.FLD4105 = v != 0;
    }
}

