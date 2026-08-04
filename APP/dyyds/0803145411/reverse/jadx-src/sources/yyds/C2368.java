package yyds;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.p000ss.android.ugc.awemes.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᲈᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2368 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ TextView f11670;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ MainActivity f11671;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f11672;

    public /* synthetic */ C2368(MainActivity mainActivity, ArrayList arrayList, TextView textView) {
        this.f11671 = mainActivity;
        this.f11672 = arrayList;
        this.f11670 = textView;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        View view = (View) obj2;
        List list = MainActivity.f451;
        AbstractC2328.m4341(-273524565115758L);
        AbstractC2328.m4341(-273563219821422L);
        MainActivity mainActivity = this.f11671;
        mainActivity.m322((C1016) obj);
        Iterator it = this.f11672.iterator();
        while (it.hasNext()) {
            mainActivity.m335((C1335) it.next());
        }
        GradientDrawable gradientDrawableM333 = mainActivity.m333();
        TextView textView = this.f11670;
        textView.setBackground(gradientDrawableM333);
        textView.setTextColor(MainActivity.m304(mainActivity));
        view.animate().scaleX(0.96f).scaleY(0.96f).setDuration(90L).withEndAction(new RunnableC2048(view, 1)).start();
        return C2746.f13459;
    }
}
