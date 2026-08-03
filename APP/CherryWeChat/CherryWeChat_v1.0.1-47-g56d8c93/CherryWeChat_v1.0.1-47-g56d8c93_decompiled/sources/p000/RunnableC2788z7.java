package p000;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import de.robv.android.xposed.XposedHelpers;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: z7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2788z7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f9454b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f9455c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewGroup f9456d;

    public /* synthetic */ RunnableC2788z7(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, int i) {
        this.f9453a = i;
        this.f9455c = activity;
        this.f9454b = viewGroup;
        this.f9456d = viewGroup2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9453a;
        ViewGroup viewGroup = this.f9456d;
        ViewGroup viewGroup2 = this.f9454b;
        Activity activity = this.f9455c;
        switch (i) {
            case 0:
                AbstractC0585Nj.m1142j(viewGroup2);
                AbstractC0628Oj.m1247p(activity);
                viewGroup.setFitsSystemWindows(false);
                viewGroup.setPadding(0, 0, 0, 0);
                break;
            case 1:
                try {
                    View viewM2788F = C1456gf.m2788F(viewGroup2, 0, 1, 0);
                    ViewGroup viewGroup3 = viewM2788F instanceof ViewGroup ? (ViewGroup) viewM2788F : null;
                    if (viewGroup3 != null) {
                        if (viewGroup3 instanceof LinearLayout) {
                            ((LinearLayout) viewGroup3).addView(new ViewOnClickListenerC0996X7(activity, viewGroup2), 0, new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(40)));
                        } else {
                            View viewM2788F2 = C1456gf.m2788F(viewGroup2, 0, 1, 1);
                            ViewGroup viewGroup4 = viewM2788F2 instanceof ViewGroup ? (ViewGroup) viewM2788F2 : null;
                            if (viewGroup4 instanceof LinearLayout) {
                                ((LinearLayout) viewGroup4).addView(new ViewOnClickListenerC0996X7(activity, viewGroup2), 0, new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(40)));
                            } else {
                                viewGroup3.addView(new ViewOnClickListenerC0996X7(activity, viewGroup2), 0, new ViewGroup.LayoutParams(-1, AbstractC0295Gu.m616i(40)));
                            }
                        }
                        View viewM2810v = C1456gf.m2810v(viewGroup, AbstractC0295Gu.m625r(-250327873878069L));
                        AbstractC0295Gu.m625r(-248897649768501L);
                        ((ViewGroup) viewM2810v).scrollTo(0, AbstractC0295Gu.m616i(40));
                    }
                } catch (Exception e) {
                    AbstractC0213Ey.m411i(-248605591992373L, -248661426567221L, e);
                    return;
                }
                break;
            case 2:
                ViewParent parent = ((ViewGroup) activity.findViewById(R.id.content)).getParent();
                AbstractC0295Gu.m625r(-510809050445877L);
                View childAt = ((ViewGroup) parent).getChildAt(1);
                AbstractC0295Gu.m625r(-527009667086389L);
                ViewGroup viewGroup5 = (ViewGroup) childAt;
                activity.getWindow().setStatusBarColor(0);
                C1456gf.m2806q(viewGroup5);
                C1456gf.m2806q(viewGroup2);
                if (!AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-511972986583093L), AbstractC0295Gu.m625r(-510607186982965L), AbstractC0295Gu.m625r(-510323719141429L), AbstractC0295Gu.m625r(-511156942796853L)).contains(activity.getClass().getName())) {
                    AbstractC0295Gu.m625r(-525463478859829L);
                    ImageView imageView = new ImageView(viewGroup.getContext());
                    HashMap map = AbstractC0999XA.f3193a;
                    imageView.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-525497838598197L)));
                    viewGroup.addView(imageView, 0, new ViewGroup.LayoutParams(-1, C2262n5.m4599a(viewGroup.getContext(), "status_bar_height") + C1456gf.f5171o));
                    viewGroup5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0543Mk(viewGroup5, viewGroup, imageView, 1));
                }
                C1456gf.m2809u(viewGroup5);
                String name = activity.getClass().getName();
                AbstractC0295Gu.m625r(-526717609310261L);
                if (AbstractC2564tz.m5051L(name, AbstractC0295Gu.m625r(-526773443885109L), false)) {
                    C2128k5.m4312c(viewGroup);
                }
                HashMap map2 = AbstractC0999XA.f3193a;
                viewGroup.addView(C1456gf.m2808t(activity, C1517hw.m2890b(AbstractC0295Gu.m625r(-526863638198325L))), 0, new ViewGroup.LayoutParams(-1, -1));
                break;
            default:
                String strM625r = AbstractC0295Gu.m625r(-520507086600245L);
                AbstractC0295Gu.m625r(-578325936338997L);
                XposedHelpers.callMethod(activity, strM625r, Arrays.copyOf(new Object[]{0}, 1));
                String strM625r2 = AbstractC0295Gu.m625r(-520584396011573L);
                HashMap map3 = AbstractC0999XA.f3193a;
                Object[] objArr = {Boolean.valueOf(C1517hw.m2895h())};
                AbstractC0295Gu.m625r(-578325936338997L);
                XposedHelpers.callMethod(activity, strM625r2, Arrays.copyOf(objArr, 1));
                viewGroup2.setPadding(0, 0, 0, 0);
                AbstractC0295Gu.m625r(-838600954476597L);
                viewGroup.setPadding(0, C2262n5.m4599a(activity, "status_bar_height"), 0, 0);
                break;
        }
    }

    public /* synthetic */ RunnableC2788z7(ViewGroup viewGroup, Activity activity, ViewGroup viewGroup2, int i) {
        this.f9453a = i;
        this.f9454b = viewGroup;
        this.f9455c = activity;
        this.f9456d = viewGroup2;
    }
}
