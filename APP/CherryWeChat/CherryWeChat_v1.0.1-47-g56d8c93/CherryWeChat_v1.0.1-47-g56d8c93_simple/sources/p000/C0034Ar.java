package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: Ar */
/* JADX INFO: loaded from: classes.dex */
public final class C0034Ar extends C0365Ie {

    /* JADX INFO: renamed from: m */
    public final int f72m;

    /* JADX INFO: renamed from: n */
    public final int f73n;

    /* JADX INFO: renamed from: o */
    public InterfaceC2384pr f74o;

    /* JADX INFO: renamed from: p */
    public C2427qr f75p;

    public C0034Ar(Context r3, boolean r4) {
        super(r3, r4);
        if (1 != r3.getResources().getConfiguration().getLayoutDirection()) goto L6;
        this.f72m = 21;
        this.f73n = 22;
        return;
    L6:
        this.f72m = 22;
        this.f73n = 21;
    }

    @Override // p000.C0365Ie, android.view.View
    public final boolean onHoverEvent(MotionEvent r5) {
        if (this.f74o == null) goto L27;
        ListAdapter r0 = getAdapter();
        if ((r0 instanceof HeaderViewListAdapter) == false) goto L7;
        HeaderViewListAdapter r02 = (HeaderViewListAdapter) r0;
        int r1 = r02.getHeadersCount();
        C2070ir r03 = (C2070ir) r02.getWrappedAdapter();
    L9:
        if (r5.getAction() == 10) goto L17;
        int r2 = pointToPosition((int) r5.getX(), (int) r5.getY());
        if (r2 == (-1)) goto L17;
        int r22 = r2 - r1;
        if (r22 < 0) goto L17;
        if (r22 >= r03.getCount()) goto L17;
        C2427qr r12 = r03.m4240b(r22);
    L18:
        C2427qr r23 = this.f75p;
        if (r23 == r12) goto L27;
        MenuC2204lr r04 = r03.f7324a;
        if (r23 == null) goto L23;
        this.f74o.mo128e(r04, r23);
    L23:
        this.f75p = r12;
        if (r12 == null) goto L27;
        this.f74o.mo129i(r04, r12);
    L17:
        r12 = null;
        goto L18
    L7:
        r03 = (C2070ir) r0;
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
        if (r5 != this.f73n) goto L22;
        setSelection(-1);
        ListAdapter r52 = getAdapter();
        if ((r52 instanceof HeaderViewListAdapter) == false) goto L18;
        C2070ir r53 = (C2070ir) ((HeaderViewListAdapter) r52).getWrappedAdapter();
    L19:
        r53.f7324a.m4430c(false);
        return true;
    L18:
        r53 = (C2070ir) r52;
    L22:
        return super.onKeyDown(r5, r6);
    L5:
        if (r5 != this.f72m) goto L12;
        if (r0.isEnabled() == true) goto L9;
    L11:
        return true;
    L9:
        if (r0.getItemData().hasSubMenu() == false) goto L11;
        performItemClick(r0, getSelectedItemPosition(), getSelectedItemId());
        goto L11
    }

    public void setHoverListener(InterfaceC2384pr r1) {
        this.f74o = r1;
    }

    @Override // p000.C0365Ie, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable r1) {
        super.setSelector(r1);
    }
}
