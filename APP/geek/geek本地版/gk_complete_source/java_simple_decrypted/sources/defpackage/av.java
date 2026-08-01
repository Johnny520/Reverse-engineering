package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class av extends kh {
    public final int m;
    public final int n;
    public nu o;
    public ou p;

    public av(Context r3, boolean r4) {
        super(r3, r4);
        if (1 != zu.a(r3.getResources().getConfiguration())) goto L6;
        this.m = 21;
        this.n = 22;
        return;
    L6:
        this.m = 22;
        this.n = 21;
    }

    @Override // defpackage.kh, android.view.View
    public final boolean onHoverEvent(MotionEvent r5) {
        if (this.o == null) goto L27;
        ListAdapter r0 = getAdapter();
        if ((r0 instanceof HeaderViewListAdapter) == false) goto L7;
        HeaderViewListAdapter r02 = (HeaderViewListAdapter) r0;
        int r1 = r02.getHeadersCount();
        hu r03 = (hu) r02.getWrappedAdapter();
    L9:
        if (r5.getAction() == 10) goto L17;
        int r2 = pointToPosition((int) r5.getX(), (int) r5.getY());
        if (r2 == (-1)) goto L17;
        int r22 = r2 - r1;
        if (r22 < 0) goto L17;
        if (r22 >= r03.getCount()) goto L17;
        ou r12 = r03.b(r22);
    L18:
        ou r23 = this.p;
        if (r23 == r12) goto L27;
        ku r04 = r03.a;
        if (r23 == null) goto L23;
        this.o.p(r04, r23);
    L23:
        this.p = r12;
        if (r12 == null) goto L27;
        this.o.r(r04, r12);
    L17:
        r12 = null;
        goto L18
    L7:
        r03 = (hu) r0;
        r1 = 0;
    L27:
        return super.onHoverEvent(r5);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, KeyEvent r6) {
        ListMenuItemView r0 = (ListMenuItemView) getSelectedView();
        if (r0 != null) goto L5;
    L12:
        if (r0 == null) goto L22;
        if (r5 != this.n) goto L22;
        setSelection(-1);
        ListAdapter r52 = getAdapter();
        if ((r52 instanceof HeaderViewListAdapter) == false) goto L18;
        hu r53 = (hu) ((HeaderViewListAdapter) r52).getWrappedAdapter();
    L19:
        r53.a.c(false);
        return true;
    L18:
        r53 = (hu) r52;
    L22:
        return super.onKeyDown(r5, r6);
    L5:
        if (r5 != this.m) goto L12;
        if (r0.isEnabled() == true) goto L9;
    L11:
        return true;
    L9:
        if (r0.getItemData().hasSubMenu() == false) goto L11;
        performItemClick(r0, getSelectedItemPosition(), getSelectedItemId());
        goto L11
    }

    public void setHoverListener(nu r1) {
        this.o = r1;
    }

    @Override // defpackage.kh, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable r1) {
        super.setSelector(r1);
    }
}
