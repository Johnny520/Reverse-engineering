package p001;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p001.C0178d1;

/* JADX INFO: renamed from: ۟.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0177d0 extends AbstractAlertDialogC0471ya {

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public final C0344p0 f1419;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final List<C0344p0> f1420;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public final String f1421;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public final int f1422;

    /* JADX INFO: renamed from: ۟.d0$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C0318n1 f748;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ AlertDialogC0177d0 f749;

        public a(C0318n1 c0318n1, AlertDialogC0177d0 alertDialogC0177d0) {
            this.f748 = c0318n1;
            this.f749 = alertDialogC0177d0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C0344p0 c0344p0 : this.f748.f984) {
                if (C0237h4.m864(c0344p0.f1741, Boolean.TRUE)) {
                    linkedHashSet.add(c0344p0.f1018);
                }
            }
            C0286kb c0286kb = C0178d1.f750;
            C0178d1.b.m841().mo850(this.f749.f1419.f1018, linkedHashSet);
            return C0433vb.f1163;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0177d0(C0344p0 c0344p0, ArrayList arrayList, Context context, String str) {
        super(context, 0);
        C0237h4.m1090("parentData", c0344p0);
        "listData";
        C0237h4.m1090("cxt", context);
        "titleDialog";
        this.f1419 = c0344p0;
        this.f1420 = arrayList;
        this.f1421 = str;
        this.f1422 = 291;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0471ya
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final View mo1046() {
        try {
            LinearLayout linearLayoutM1277 = m1277();
            TextView textViewM1279 = m1279(-1);
            textViewM1279.setText(this.f1421.length() > 0 ? this.f1421 : this.f1419.f1733);
            linearLayoutM1277.addView(textViewM1279);
            RecyclerView recyclerView = new RecyclerView(m1280());
            recyclerView.setId(this.f1422);
            recyclerView.setLayoutManager(new LinearLayoutManager(m1280()));
            recyclerView.addItemDecoration(new C0269j8());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            recyclerView.setLayoutParams(layoutParams);
            C0318n1 c0318n1 = new C0318n1(this.f1420);
            c0318n1.m901(new a(c0318n1, this));
            recyclerView.setAdapter(c0318n1);
            linearLayoutM1277.addView(recyclerView);
            Iterator it = C0272jb.m1105(m970()).iterator();
            while (it.hasNext()) {
                linearLayoutM1277.addView((View) it.next());
            }
            return linearLayoutM1277;
        } catch (Exception unused) {
            return null;
        }
    }
}
