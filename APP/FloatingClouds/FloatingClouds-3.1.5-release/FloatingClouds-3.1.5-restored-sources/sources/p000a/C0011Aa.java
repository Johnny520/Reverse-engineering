package p000a;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: a.Aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0011Aa implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0030Ba f52a;

    public C0011Aa(C0030Ba c0030Ba) {
        this.f52a = c0030Ba;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        C0030Ba c0030Ba = this.f52a;
        if (i < 0) {
            C0102F9 c0102f9 = c0030Ba.f108e;
            item = !c0102f9.f353z.isShowing() ? null : c0102f9.f330c.getSelectedItem();
        } else {
            item = c0030Ba.getAdapter().getItem(i);
        }
        C0030Ba.m88a(c0030Ba, item);
        AdapterView.OnItemClickListener onItemClickListener = c0030Ba.getOnItemClickListener();
        C0102F9 c0102f92 = c0030Ba.f108e;
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = c0102f92.f353z.isShowing() ? c0102f92.f330c.getSelectedView() : null;
                i = !c0102f92.f353z.isShowing() ? -1 : c0102f92.f330c.getSelectedItemPosition();
                j = !c0102f92.f353z.isShowing() ? Long.MIN_VALUE : c0102f92.f330c.getSelectedItemId();
            }
            onItemClickListener.onItemClick(c0102f92.f330c, view, i, j);
        }
        c0102f92.dismiss();
    }
}
