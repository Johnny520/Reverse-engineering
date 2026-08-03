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

    public /* synthetic */ RunnableC0137D7(Activity r2, ViewGroup r3) {
        this.f356a = 1;
        this.f357b = r2;
        this.f358c = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.f356a;
        int r1 = 0;
        Activity r2 = this.f357b;
        ViewGroup r3 = this.f358c;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        View r02 = C1456gf.m2810v(r3, AbstractC0295Gu.m625r(-520124834510901L));
        AbstractC0295Gu.m625r(-520300928170037L);
        View r03 = AbstractC0295Gu.m618k((ViewGroup) r02, 0);
        AbstractC0295Gu.m625r(-521108382021685L);
        ViewGroup r04 = (ViewGroup) r03;
        View r4 = C1456gf.m2810v(r3, AbstractC0295Gu.m625r(-520816324245557L));
        AbstractC0295Gu.m625r(-519360330332213L);
        AbstractC1208bA.m2329b(new RunnableC2788z7(r2, r04, (ViewGroup) r4, 3), 300);
        C1456gf.m2806q(r3);
        AbstractC0295Gu.m625r(-525463478859829L);
        ImageView r32 = new ImageView(r04.getContext());
        HashMap r42 = AbstractC0999XA.f3193a;
        r32.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-525497838598197L)));
        r04.addView(r32, 0, new ViewGroup.LayoutParams(-1, C2262n5.m4599a(r04.getContext(), "status_bar_height") + C1456gf.f5171o));
        C1456gf.m2809u(r04);
        HashMap r33 = AbstractC0999XA.f3193a;
        r04.addView(C1456gf.m2808t(r2, C1517hw.m2890b(AbstractC0295Gu.m625r(-519068272556085L))), 0, new ViewGroup.LayoutParams(-1, -1));
        return;
    L6:
        AbstractC0585Nj.m1142j(r3);
        ViewGroup r05 = (ViewGroup) r3.findViewById(AbstractC0828TB.f2617i);
        r05.getChildAt(0).getLayoutParams().width = 0;
        HashMap r34 = AbstractC0999XA.f3193a;
        ImageView r35 = C1456gf.m2808t(r2, C1517hw.m2890b(AbstractC0295Gu.m625r(-156989644601397L)));
        r35.setOnClickListener(new ViewOnClickListenerC0094C7(r2, r1));
        LinearLayout.LayoutParams r22 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
        r22.gravity = 16;
        r22.leftMargin = AbstractC0295Gu.m616i(10);
        r22.rightMargin = AbstractC0295Gu.m616i(6);
        r05.addView(r35, 0, r22);
        return;
    L8:
        AbstractC0628Oj.m1247p(r2);
        r3.setFitsSystemWindows(false);
        r3.setPadding(0, 0, 0, 0);
        return;
    L10:
        AbstractC0585Nj.m1142j(r3);
        AbstractC0628Oj.m1247p(r2);
    }

    public /* synthetic */ RunnableC0137D7(ViewGroup r1, Activity r2, int r3) {
        this.f356a = r3;
        this.f358c = r1;
        this.f357b = r2;
    }
}
