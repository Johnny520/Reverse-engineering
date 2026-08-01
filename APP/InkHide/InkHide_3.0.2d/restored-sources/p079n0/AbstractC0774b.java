package p079n0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.concurrent.CopyOnWriteArrayList;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0774b extends BaseAdapter {

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f2596b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public abstract void mo1429a(C0773a c0773a, int i2, ViewGroup viewGroup);

    /* JADX INFO: renamed from: b */
    public abstract C0773a mo1430b(ViewGroup viewGroup);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2596b.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        return this.f2596b.get(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        C0773a c0773aMo1430b;
        AbstractC0223g.m418e(viewGroup, "parent");
        if (view == null) {
            getItemViewType(i2);
            c0773aMo1430b = mo1430b(viewGroup);
            c0773aMo1430b.f2594a.setTag(c0773aMo1430b);
        } else {
            Object tag = view.getTag();
            AbstractC0223g.m416c(tag, "null cannot be cast to non-null type VH of com.lu.wxmask.adapter.AbsListAdapter");
            c0773aMo1430b = (C0773a) tag;
        }
        c0773aMo1430b.f2595b = i2;
        mo1429a(c0773aMo1430b, i2, viewGroup);
        return c0773aMo1430b.f2594a;
    }
}
