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

    public /* synthetic */ RunnableC2788z7(Activity r1, ViewGroup r2, ViewGroup r3, int r4) {
        this.f9453a = r4;
        this.f9455c = r1;
        this.f9454b = r2;
        this.f9456d = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.f9453a;
        ViewGroup r5 = this.f9456d;
        ViewGroup r6 = this.f9454b;
        Activity r7 = this.f9455c;
        switch(r0) {
            case 0: goto L37;
            case 1: goto L39;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        String r02 = AbstractC0295Gu.m625r(-520507086600245L);
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r7, r02, Arrays.copyOf(new Object[]{0}, 1));
        String r03 = AbstractC0295Gu.m625r(-520584396011573L);
        HashMap r1 = AbstractC0999XA.f3193a;
        Object[] r12 = {Boolean.valueOf(C1517hw.m2895h())};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r7, r03, Arrays.copyOf(r12, 1));
        r6.setPadding(0, 0, 0, 0);
        AbstractC0295Gu.m625r(-838600954476597L);
        r5.setPadding(0, C2262n5.m4599a(r7, "status_bar_height"), 0, 0);
        return;
    L6:
        ViewParent r04 = ((ViewGroup) r7.findViewById(R.id.content)).getParent();
        AbstractC0295Gu.m625r(-510809050445877L);
        View r05 = ((ViewGroup) r04).getChildAt(1);
        AbstractC0295Gu.m625r(-527009667086389L);
        ViewGroup r06 = (ViewGroup) r05;
        r7.getWindow().setStatusBarColor(0);
        C1456gf.m2806q(r06);
        C1456gf.m2806q(r6);
        if (AbstractC2496sa.m4977b0(new String[]{AbstractC0295Gu.m625r(-511972986583093L), AbstractC0295Gu.m625r(-510607186982965L), AbstractC0295Gu.m625r(-510323719141429L), AbstractC0295Gu.m625r(-511156942796853L)}).contains(r7.getClass().getName()) == true) goto L9;
        AbstractC0295Gu.m625r(-525463478859829L);
        ImageView r62 = new ImageView(r5.getContext());
        HashMap r8 = AbstractC0999XA.f3193a;
        r62.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-525497838598197L)));
        r5.addView(r62, 0, new ViewGroup.LayoutParams(-1, C2262n5.m4599a(r5.getContext(), "status_bar_height") + C1456gf.f5171o));
        r06.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0543Mk(r06, r5, r62, 1));
    L9:
        C1456gf.m2809u(r06);
        String r07 = r7.getClass().getName();
        AbstractC0295Gu.m625r(-526717609310261L);
        if (AbstractC2564tz.m5051L(r07, AbstractC0295Gu.m625r(-526773443885109L), false) == false) goto L12;
        C2128k5.m4312c(r5);
    L12:
        HashMap r08 = AbstractC0999XA.f3193a;
        r5.addView(C1456gf.m2808t(r7, C1517hw.m2890b(AbstractC0295Gu.m625r(-526863638198325L))), 0, new ViewGroup.LayoutParams(-1, -1));
        return;
    L37:
        AbstractC0585Nj.m1142j(r6);
        AbstractC0628Oj.m1247p(r7);
        r5.setFitsSystemWindows(false);
        r5.setPadding(0, 0, 0, 0);
        return;
    L39:
        View r2 = C1456gf.m2788F(r6, new int[]{0, 1, 0});     // Catch: Exception -> L18
        ViewGroup r9 = null;
        if ((r2 instanceof ViewGroup) == false) goto L20;
        ViewGroup r22 = (ViewGroup) r2;     // Catch: Exception -> L18
    L21:
        if (r22 != null) goto L24;
        return;
    L24:
        if ((r22 instanceof LinearLayout) == false) goto L26;
        ((LinearLayout) r22).addView(new ViewOnClickListenerC0996X7(r7, r6), 0, new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(40)));     // Catch: Exception -> L18
    L33:
        View r13 = C1456gf.m2810v(r5, AbstractC0295Gu.m625r(-250327873878069L));     // Catch: Exception -> L18
        AbstractC0295Gu.m625r(-248897649768501L);     // Catch: Exception -> L18
        ((ViewGroup) r13).scrollTo(0, AbstractC0295Gu.m616i(40));     // Catch: Exception -> L18
        return;
    L26:
        View r3 = C1456gf.m2788F(r6, new int[]{0, 1, 1});     // Catch: Exception -> L18
        if ((r3 instanceof ViewGroup) == false) goto L30;
        r9 = (ViewGroup) r3;     // Catch: Exception -> L18
    L30:
        if ((r9 instanceof LinearLayout) == false) goto L32;
        ((LinearLayout) r9).addView(new ViewOnClickListenerC0996X7(r7, r6), 0, new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(40)));     // Catch: Exception -> L18
        goto L33
    L32:
        r22.addView(new ViewOnClickListenerC0996X7(r7, r6), 0, new ViewGroup.LayoutParams(-1, AbstractC0295Gu.m616i(40)));     // Catch: Exception -> L18
        goto L33
    L20:
        r22 = null;
    L18:
        e = move-exception;
        AbstractC0213Ey.m411i(-248605591992373L, -248661426567221L, e);
    }

    public /* synthetic */ RunnableC2788z7(ViewGroup r1, Activity r2, ViewGroup r3, int r4) {
        this.f9453a = r4;
        this.f9454b = r1;
        this.f9455c = r2;
        this.f9456d = r3;
    }
}
