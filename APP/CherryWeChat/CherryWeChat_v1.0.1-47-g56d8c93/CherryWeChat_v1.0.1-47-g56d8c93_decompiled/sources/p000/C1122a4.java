package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1122a4 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3535b;

    public /* synthetic */ C1122a4(int i, Object obj) {
        this.f3534a = i;
        this.f3535b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f3534a) {
            case 0:
                C1245c4 c1245c4 = (C1245c4) this.f3535b;
                C1394f4 c1394f4 = c1245c4.f4236G;
                c1394f4.setSelection(i);
                if (c1394f4.getOnItemClickListener() != null) {
                    c1394f4.performItemClick(view, i, c1245c4.f4233D.getItemId(i));
                }
                c1245c4.dismiss();
                break;
            default:
                C0076Bq c0076Bq = (C0076Bq) this.f3535b;
                C0289Go c0289Go = c0076Bq.f177e;
                c0076Bq.setText(c0076Bq.convertSelectionToString(i < 0 ? !c0289Go.f962z.isShowing() ? null : c0289Go.f939c.getSelectedItem() : c0076Bq.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = c0076Bq.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c0289Go.f962z.isShowing() ? null : c0289Go.f939c.getSelectedView();
                        i = !c0289Go.f962z.isShowing() ? -1 : c0289Go.f939c.getSelectedItemPosition();
                        j = !c0289Go.f962z.isShowing() ? Long.MIN_VALUE : c0289Go.f939c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0289Go.f939c, view, i, j);
                }
                c0289Go.dismiss();
                break;
        }
    }
}
