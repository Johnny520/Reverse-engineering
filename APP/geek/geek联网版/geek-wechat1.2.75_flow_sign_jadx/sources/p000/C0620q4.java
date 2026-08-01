package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0620q4 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3792b;

    public /* synthetic */ C0620q4(int i, Object obj) {
        this.f3791a = i;
        this.f3792b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f3791a) {
            case Base64.DEFAULT /* 0 */:
                C0694s4 c0694s4 = (C0694s4) this.f3792b;
                C0805v4 c0805v4 = c0694s4.f4206G;
                c0805v4.setSelection(i);
                if (c0805v4.getOnItemClickListener() != null) {
                    c0805v4.performItemClick(view, i, c0694s4.f4203D.getItemId(i));
                }
                c0694s4.dismiss();
                break;
            case Base64.NO_PADDING /* 1 */:
                C0534nt c0534nt = (C0534nt) this.f3792b;
                C0569or c0569or = c0534nt.f3340e;
                C0534nt.m1959a(c0534nt, i < 0 ? !c0569or.f3542z.isShowing() ? null : c0569or.f3519c.getSelectedItem() : c0534nt.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = c0534nt.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c0569or.f3542z.isShowing() ? null : c0569or.f3519c.getSelectedView();
                        i = !c0569or.f3542z.isShowing() ? -1 : c0569or.f3519c.getSelectedItemPosition();
                        j = !c0569or.f3542z.isShowing() ? Long.MIN_VALUE : c0569or.f3519c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0569or.f3519c, view, i, j);
                }
                c0569or.dismiss();
                break;
            default:
                ((SearchView) this.f3792b).m156n(i);
                break;
        }
    }
}
