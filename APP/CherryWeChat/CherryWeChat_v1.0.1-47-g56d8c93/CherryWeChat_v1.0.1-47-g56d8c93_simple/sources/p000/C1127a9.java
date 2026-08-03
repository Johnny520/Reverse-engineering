package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import java.util.ArrayList;
import java.util.List;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1127a9 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3572c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3573d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3574e;

    public /* synthetic */ C1127a9(int r2, C0398JA r3, C0441KA r4, C0784SA r5) {
        this.f3570a = 1;
        this.f3572c = r5;
        this.f3573d = r4;
        this.f3571b = r2;
        this.f3574e = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f3570a) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        C0784SA r0 = (C0784SA) this.f3572c;
        C0441KA r1 = (C0441KA) this.f3573d;
        C0398JA r2 = (C0398JA) this.f3574e;
        Context r12 = r1.f1443b.getContext();
        AbstractC0295Gu.m625r(-492117352773685L);
        List r22 = r2.f1343a;
        r0.getClass();
        AbstractC0295Gu.m625r(-489763710695477L);
        Activity r13 = (Activity) r12;
        Dialog r4 = new Dialog(r13);
        r4.requestWindowFeature(1);
        FrameLayout r5 = new FrameLayout(r13);
        r5.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r5.setBackgroundColor(-16777216);
        r5.setTag(AbstractC0295Gu.m625r(-489463062984757L));
        TextView r6 = new TextView(r13);
        StringBuilder r8 = new StringBuilder();
        int r9 = this.f3571b;
        r8.append(r9 + 1);
        r8.append(AbstractC0295Gu.m625r(-489523192526901L));
        r8.append(r22.size());
        r6.setText(r8.toString());
        r6.setTextSize(14.0f);
        r6.setTextColor(-1);
        r6.setGravity(17);
        GradientDrawable r10 = new GradientDrawable();
        r10.setColor(Color.parseColor(AbstractC0295Gu.m625r(-489540372396085L)));
        r10.setCornerRadius(AbstractC0295Gu.m616i(16));
        r6.setBackground(r10);
        r6.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(10));
        FrameLayout.LayoutParams r102 = new FrameLayout.LayoutParams(-2, -2);
        r102.gravity = 49;
        r102.topMargin = AbstractC0295Gu.m616i(56);
        r6.setLayoutParams(r102);
        C0230FE r103 = new C0230FE(r13);
        r103.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r103.setAdapter(new C0355IA(r0, r13, r22));
        r103.setCurrentItem(r9);
        C0699QA r02 = new C0699QA(r6, r22, r103);
        if (r103.f701P != null) goto L7;
        r103.f701P = new ArrayList();
    L7:
        r103.f701P.add(r02);
        TextView r03 = new TextView(r13);
        r03.setText(AbstractC0295Gu.m625r(-490133077882933L));
        r03.setTextSize(20.0f);
        r03.setTextColor(-1);
        r03.setGravity(17);
        GradientDrawable r14 = new GradientDrawable();
        r14.setColor(Color.parseColor(AbstractC0295Gu.m625r(-490141667817525L)));
        r14.setCornerRadius(AbstractC0295Gu.m616i(20));
        r03.setBackground(r14);
        FrameLayout.LayoutParams r15 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(44), AbstractC0295Gu.m616i(44));
        r15.gravity = 8388661;
        r15.topMargin = AbstractC0295Gu.m616i(52);
        r15.rightMargin = AbstractC0295Gu.m616i(16);
        r03.setLayoutParams(r15);
        r03.setOnClickListener(new ViewOnClickListenerC0226FA(r4, 1));
        r5.addView(r103);
        r5.addView(r6);
        r5.addView(r03);
        r5.setOnClickListener(new ViewOnClickListenerC0226FA(r4, 2));
        r4.setContentView(r5);
        Window r04 = r4.getWindow();
        if (r04 == null) goto L10;
        r04.setLayout(-1, -1);
        r04.setBackgroundDrawable(new ColorDrawable(0));
    L10:
        r5.setAlpha(0.0f);
        r5.animate().alpha(1.0f).setDuration(250).setInterpolator(new DecelerateInterpolator()).start();
        r4.show();
        return C0829TC.f2620a;
    L13:
        return CherryViewAPI.m3277S((String) this.f3572c, (ArrayList) this.f3573d, (Lua) this.f3574e, this.f3571b);
    }

    public /* synthetic */ C1127a9(String r2, ArrayList r3, Lua r4, int r5) {
        this.f3570a = 0;
        this.f3572c = r2;
        this.f3573d = r3;
        this.f3574e = r4;
        this.f3571b = r5;
    }
}
