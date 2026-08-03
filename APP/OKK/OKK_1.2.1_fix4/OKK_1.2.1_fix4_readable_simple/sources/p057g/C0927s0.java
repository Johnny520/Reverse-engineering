package p057g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p055f.C0776g;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: g.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0927s0 extends AbstractC0895c0 {

    /* JADX INFO: renamed from: m */
    public final int f3292m;

    /* JADX INFO: renamed from: n */
    public final int f3293n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0921p0 f3294o;

    /* JADX INFO: renamed from: p */
    public MenuItemC0780k f3295p;

    public C0927s0(Context r3, boolean r4) {
        super(r3, r4);
        if (1 != r3.getResources().getConfiguration().getLayoutDirection()) goto L5;
        this.f3292m = 21;
        this.f3293n = 22;
        return;
    L5:
        this.f3292m = 22;
        this.f3293n = 21;
    }

    @Override // p057g.AbstractC0895c0, android.view.View
    public final boolean onHoverEvent(MotionEvent r5) {
        if (this.f3294o == null) goto L27;
        ListAdapter r02 = getAdapter();
        if ((r02 instanceof HeaderViewListAdapter) == false) goto L7;
        HeaderViewListAdapter r03 = (HeaderViewListAdapter) r02;
        int r1 = r03.getHeadersCount();
        C0776g r04 = (C0776g) r03.getWrappedAdapter();
    L9:
        if (r5.getAction() == 10) goto L17;
        int r2 = pointToPosition((int) r5.getX(), (int) r5.getY());
        if (r2 == (-1)) goto L17;
        int r22 = r2 - r1;
        if (r22 < 0) goto L17;
        if (r22 >= r04.getCount()) goto L17;
        MenuItemC0780k r12 = r04.m1994b(r22);
    L18:
        MenuItemC0780k r23 = this.f3295p;
        if (r23 == r12) goto L27;
        MenuC0779j r05 = r04.f2778a;
        if (r23 == null) goto L23;
        this.f3294o.mo349o(r05, r23);
    L23:
        this.f3295p = r12;
        if (r12 == null) goto L27;
        this.f3294o.mo353s(r05, r12);
    L17:
        r12 = null;
        goto L18
    L7:
        r04 = (C0776g) r02;
        r1 = 0;
    L27:
        return super.onHoverEvent(r5);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, KeyEvent r6) {
        ListMenuItemView r02 = (ListMenuItemView) getSelectedView();
        if (r02 != null) goto L5;
    L12:
        if (r02 == null) goto L22;
        if (r5 != this.f3293n) goto L22;
        setSelection(-1);
        ListAdapter r52 = getAdapter();
        if ((r52 instanceof HeaderViewListAdapter) == false) goto L18;
        C0776g r53 = (C0776g) ((HeaderViewListAdapter) r52).getWrappedAdapter();
    L19:
        r53.f2778a.m1997c(false);
        return true;
    L18:
        r53 = (C0776g) r52;
    L22:
        return super.onKeyDown(r5, r6);
    L5:
        if (r5 != this.f3292m) goto L12;
        if (r02.isEnabled() == true) goto L9;
    L11:
        return true;
    L9:
        if (r02.getItemData().hasSubMenu() == false) goto L11;
        performItemClick(r02, getSelectedItemPosition(), getSelectedItemId());
        goto L11
    }

    public void setHoverListener(InterfaceC0921p0 r1) {
        this.f3294o = r1;
    }

    @Override // p057g.AbstractC0895c0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable r1) {
        super.setSelector(r1);
    }
}
