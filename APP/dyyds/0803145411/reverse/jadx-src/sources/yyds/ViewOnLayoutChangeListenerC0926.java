package yyds;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.widget.SearchView;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛴᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0926 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4243;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f4244;

    public /* synthetic */ ViewOnLayoutChangeListenerC0926(int i, Object obj) {
        this.f4243 = i;
        this.f4244 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f4243;
        Object obj = this.f4244;
        switch (i9) {
            case 0:
                WindowInsets rootWindowInsets = view.getRootView().getRootWindowInsets();
                ViewOnAttachStateChangeListenerC0762 viewOnAttachStateChangeListenerC0762 = (ViewOnAttachStateChangeListenerC0762) obj;
                C2173 c2173 = (C2173) viewOnAttachStateChangeListenerC0762.f3511;
                if (rootWindowInsets == null) {
                    int i10 = DialogXBaseRelativeLayout.f416;
                } else {
                    int i11 = DialogXBaseRelativeLayout.f416;
                    c2173.m4141(C2693.m4783(null, rootWindowInsets), new C2542((C2542) viewOnAttachStateChangeListenerC0762.f3513));
                }
                break;
            default:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f170;
                View view2 = searchView.f171;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f166.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean zM3289 = AbstractC1603.m3289(searchView);
                    int dimensionPixelSize = searchView.f163 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i12 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(zM3289 ? -i12 : paddingLeft - (i12 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                }
                break;
        }
    }
}
