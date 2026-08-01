package p069i;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.p055lu.wxmask272.R;

/* JADX INFO: renamed from: i.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0648U0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f2214a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnLayoutChangeListenerC0648U0(SearchView searchView) {
        this.f2214a = searchView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        SearchView searchView = this.f2214a;
        View view2 = searchView.f1063y;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f1057s.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM1366a = AbstractC0718t1.m1366a(searchView);
            int dimensionPixelSize = searchView.f1038N ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1055q;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(zM1366a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
