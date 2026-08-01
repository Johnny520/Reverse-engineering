package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0621q4 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3994b;

    public /* synthetic */ C0621q4(int i, Object obj) {
        this.f3993a = i;
        this.f3994b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f3993a) {
            case Base64.DEFAULT /* 0 */:
                C0695s4 c0695s4 = (C0695s4) this.f3994b;
                C0806v4 c0806v4 = c0695s4.f4386G;
                c0806v4.setSelection(i);
                if (c0806v4.getOnItemClickListener() != null) {
                    c0806v4.performItemClick(view, i, c0695s4.f4383D.getItemId(i));
                }
                c0695s4.dismiss();
                break;
            case Base64.NO_PADDING /* 1 */:
                C0386jt c0386jt = (C0386jt) this.f3994b;
                C0421kr c0421kr = c0386jt.f2667e;
                C0386jt.m1607a(c0386jt, i < 0 ? !c0421kr.f2945z.isShowing() ? null : c0421kr.f2922c.getSelectedItem() : c0386jt.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = c0386jt.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c0421kr.f2945z.isShowing() ? null : c0421kr.f2922c.getSelectedView();
                        i = !c0421kr.f2945z.isShowing() ? -1 : c0421kr.f2922c.getSelectedItemPosition();
                        j = !c0421kr.f2945z.isShowing() ? Long.MIN_VALUE : c0421kr.f2922c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0421kr.f2922c, view, i, j);
                }
                c0421kr.dismiss();
                break;
            default:
                ((SearchView) this.f3994b).m171n(i);
                break;
        }
    }
}
