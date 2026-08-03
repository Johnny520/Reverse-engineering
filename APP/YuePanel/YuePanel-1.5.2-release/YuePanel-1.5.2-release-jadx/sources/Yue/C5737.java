package Yue;

import android.widget.ListView;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5737 extends AbstractViewOnTouchListenerC3498 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final ListView f14214;

    public C5737(@InterfaceC6391 ListView listView) {
        super(listView);
        this.f14214 = listView;
    }

    @Override // Yue.AbstractViewOnTouchListenerC3498
    /* JADX INFO: renamed from: ۥ */
    public boolean mo555(int i) {
        return false;
    }

    @Override // Yue.AbstractViewOnTouchListenerC3498
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo556(int i) {
        ListView listView = this.f14214;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // Yue.AbstractViewOnTouchListenerC3498
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo9303(int i, int i2) {
        this.f14214.scrollListBy(i2);
    }
}
