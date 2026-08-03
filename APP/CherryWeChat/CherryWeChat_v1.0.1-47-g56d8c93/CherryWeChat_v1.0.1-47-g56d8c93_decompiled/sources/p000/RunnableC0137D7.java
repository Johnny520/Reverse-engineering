package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: D7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0137D7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f357b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewGroup f358c;

    public /* synthetic */ RunnableC0137D7(Activity activity, ViewGroup viewGroup) {
        this.f356a = 1;
        this.f357b = activity;
        this.f358c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f356a;
        int i2 = 0;
        Activity activity = this.f357b;
        ViewGroup viewGroup = this.f358c;
        switch (i) {
            case 0:
                AbstractC0585Nj.m1142j(viewGroup);
                AbstractC0628Oj.m1247p(activity);
                break;
            case 1:
                AbstractC0628Oj.m1247p(activity);
                viewGroup.setFitsSystemWindows(false);
                viewGroup.setPadding(0, 0, 0, 0);
                break;
            case 2:
                AbstractC0585Nj.m1142j(viewGroup);
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(AbstractC0828TB.f2617i);
                viewGroup2.getChildAt(0).getLayoutParams().width = 0;
                HashMap map = AbstractC0999XA.f3193a;
                ImageView imageViewM2808t = C1456gf.m2808t(activity, C1517hw.m2890b(AbstractC0295Gu.m625r(-156989644601397L)));
                imageViewM2808t.setOnClickListener(new ViewOnClickListenerC0094C7(activity, i2));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
                layoutParams.gravity = 16;
                layoutParams.leftMargin = AbstractC0295Gu.m616i(10);
                layoutParams.rightMargin = AbstractC0295Gu.m616i(6);
                viewGroup2.addView(imageViewM2808t, 0, layoutParams);
                break;
            default:
                View viewM2810v = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-520124834510901L));
                AbstractC0295Gu.m625r(-520300928170037L);
                View viewM618k = AbstractC0295Gu.m618k((ViewGroup) viewM2810v, 0);
                AbstractC0295Gu.m625r(-521108382021685L);
                ViewGroup viewGroup3 = (ViewGroup) viewM618k;
                View viewM2810v2 = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-520816324245557L));
                AbstractC0295Gu.m625r(-519360330332213L);
                AbstractC1208bA.m2329b(new RunnableC2788z7(activity, viewGroup3, (ViewGroup) viewM2810v2, 3), 300L);
                C1456gf.m2806q(viewGroup);
                AbstractC0295Gu.m625r(-525463478859829L);
                ImageView imageView = new ImageView(viewGroup3.getContext());
                HashMap map2 = AbstractC0999XA.f3193a;
                imageView.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-525497838598197L)));
                viewGroup3.addView(imageView, 0, new ViewGroup.LayoutParams(-1, C2262n5.m4599a(viewGroup3.getContext(), "status_bar_height") + C1456gf.f5171o));
                C1456gf.m2809u(viewGroup3);
                HashMap map3 = AbstractC0999XA.f3193a;
                viewGroup3.addView(C1456gf.m2808t(activity, C1517hw.m2890b(AbstractC0295Gu.m625r(-519068272556085L))), 0, new ViewGroup.LayoutParams(-1, -1));
                break;
        }
    }

    public /* synthetic */ RunnableC0137D7(ViewGroup viewGroup, Activity activity, int i) {
        this.f356a = i;
        this.f358c = viewGroup;
        this.f357b = activity;
    }
}
