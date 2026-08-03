package p050c0;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0701v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2207b;

    public /* synthetic */ RunnableC0701v(Activity activity, int i2) {
        this.f2206a = i2;
        this.f2207b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM116u;
        Activity activity = this.f2207b;
        switch (this.f2206a) {
            case 0:
                AbstractC0307g.m703e(activity, "$activity");
                C0704w.m1793a(activity, "onCreate.post");
                break;
            case 1:
                AbstractC0307g.m703e(activity, "$activity");
                C0704w.m1793a(activity, "onCreate.postDelayed");
                break;
            case 2:
                AbstractC0307g.m703e(activity, "$activity");
                if (!activity.isFinishing() && C0575B1.f1701a.m1393e()) {
                    Object obj = C0590G1.f1792a;
                    C0590G1.m1453k(activity);
                    break;
                }
                break;
            case 3:
                AbstractC0307g.m703e(activity, "$activity");
                if (!activity.isFinishing() && C0575B1.f1701a.m1393e()) {
                    Object obj2 = C0590G1.f1792a;
                    C0590G1.m1443a(activity);
                    C0590G1.m1450h(activity);
                    break;
                }
                break;
            case 4:
                AbstractC0307g.m703e(activity, "$act");
                if (C0575B1.f1701a.m1393e()) {
                    Object obj3 = C0590G1.f1792a;
                    C0590G1.m1443a(activity);
                }
                break;
            case 5:
                AbstractC0307g.m703e(activity, "$act");
                if (C0575B1.f1701a.m1393e()) {
                    Object obj4 = C0590G1.f1792a;
                    C0590G1.m1443a(activity);
                }
                break;
            case 6:
                AbstractC0307g.m703e(activity, "$act");
                if (C0575B1.f1701a.m1393e()) {
                    Object obj5 = C0590G1.f1792a;
                    C0590G1.m1443a(activity);
                }
                break;
            case 7:
                AbstractC0307g.m703e(activity, "$act");
                if (C0575B1.f1701a.m1393e()) {
                    Object obj6 = C0590G1.f1792a;
                    C0590G1.m1443a(activity);
                }
                break;
            case 8:
                AbstractC0307g.m703e(activity, "$activity");
                C0617P1 c0617p1 = C0617P1.f1903a;
                try {
                    Intent intent = new Intent(activity, (Class<?>) AbstractC0358S.m906r(activity.getClassLoader(), "com.tencent.mm.plugin.location.ui.RedirectUI"));
                    intent.putExtra("map_view_type", 8);
                    activity.startActivityForResult(intent, 44039);
                    C0617P1.m1515c("launched RedirectUI for map pick");
                    Toast.makeText(activity, "OKK：请在地图上选择位置", 0).show();
                    objM116u = C0146l.f339a;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                Throwable thM465a = AbstractC0141g.m465a(objM116u);
                if (thM465a != null) {
                    C0617P1.f1905c.set(false);
                    C0605L1 c0605l1 = C0605L1.f1854a;
                    C0605L1.m1487a();
                    C0617P1.m1515c("launch RedirectUI failed: " + thM465a.getMessage());
                    Toast.makeText(activity, "OKK：打开微信地图失败 " + thM465a.getMessage(), 1).show();
                }
                break;
            default:
                AbstractC0307g.m703e(activity, "$activity");
                AbstractC0358S.m899n0(activity);
                break;
        }
    }
}
