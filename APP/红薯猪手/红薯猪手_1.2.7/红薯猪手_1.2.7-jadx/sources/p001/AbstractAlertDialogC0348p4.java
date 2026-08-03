package p001;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۟.p4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAlertDialogC0348p4 extends AbstractAlertDialogC0471ya {

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public RecyclerView f1750;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAlertDialogC0348p4(Context context, int i) {
        super(context, i);
        C0237h4.m1090(C0341oa.m915(new byte[]{9, 26, -32}, new byte[]{106, 98, -108, -91, -96, 118}), context);
    }

    @Override // p001.AbstractAlertDialogC0471ya
    /* JADX INFO: renamed from: ۥۣ۟ */
    public final View mo1046() {
        try {
            LinearLayout linearLayoutM1277 = m1277();
            View viewMo1076 = mo1076();
            if (viewMo1076 != null) {
                linearLayoutM1277.addView(viewMo1076);
            }
            List<View> listMo1151 = mo1151();
            if (listMo1151 != null) {
                Iterator<T> it = listMo1151.iterator();
                while (it.hasNext()) {
                    linearLayoutM1277.addView((View) it.next());
                }
            }
            RecyclerView recyclerView = new RecyclerView(m1280());
            recyclerView.setLayoutManager(new LinearLayoutManager(m1280()));
            recyclerView.addItemDecoration(new C0269j8());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            recyclerView.setLayoutParams(layoutParams);
            this.f1750 = recyclerView;
            recyclerView.setAdapter(new C0371r1(mo1075()));
            RecyclerView recyclerView2 = this.f1750;
            if (recyclerView2 == null) {
                C0237h4.m1092(C0341oa.m915(new byte[]{85, -123, -101, -86, -85, 62, 84, -78, -116, -97, -69, 56, 79}, new byte[]{56, -41, -2, -55, -46, 93}));
                throw null;
            }
            linearLayoutM1277.addView(recyclerView2);
            List<View> listMo1074 = mo1074();
            if (listMo1074 != null) {
                Iterator<T> it2 = listMo1074.iterator();
                while (it2.hasNext()) {
                    linearLayoutM1277.addView((View) it2.next());
                }
            }
            return linearLayoutM1277;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۥ */
    public abstract List<View> mo1074();

    /* JADX INFO: renamed from: ۥ۟ۦ */
    public List<View> mo1151() {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۧ */
    public abstract List<C0344p0> mo1075();

    /* JADX INFO: renamed from: ۥ۟ۨ */
    public abstract View mo1076();
}
