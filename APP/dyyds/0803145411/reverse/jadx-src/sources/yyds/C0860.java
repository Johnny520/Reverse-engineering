package yyds;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛴᛵᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860 extends ListView implements InterfaceC2018 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public AbstractC1615 f3951;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f3952;

    public C0860(Context context, int i) {
        super(new C0586(context, R.style.DialogXCompatThemeDark));
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC1615 abstractC1615;
        if ((motionEvent.getActionMasked() & 255) == 0 && (abstractC1615 = this.f3951) != null) {
            abstractC1615.mo2543();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AbstractC1615 getBottomMenuListViewTouchEvent() {
        return this.f3951;
    }

    @Override // yyds.InterfaceC2018
    public int getScrollDistance() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        return (childAt.getHeight() * firstVisiblePosition) + (-childAt.getTop());
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3952) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // yyds.InterfaceC2018
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo292() {
        return true;
    }

    @Override // yyds.InterfaceC2018
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo293(boolean z) {
        this.f3952 = z;
    }

    public C0860(Context context) {
        super(context);
        setVerticalScrollBarEnabled(false);
    }
}
