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
    public final /* synthetic */ int f3570a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3572c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3573d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3574e;

    public /* synthetic */ C1127a9(int i, C0398JA c0398ja, C0441KA c0441ka, C0784SA c0784sa) {
        this.f3572c = c0784sa;
        this.f3573d = c0441ka;
        this.f3571b = i;
        this.f3574e = c0398ja;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f3570a) {
            case 0:
                return CherryViewAPI.register$lambda$25$lambda$24((String) this.f3572c, (ArrayList) this.f3573d, (Lua) this.f3574e, this.f3571b);
            default:
                C0784SA c0784sa = (C0784SA) this.f3572c;
                C0441KA c0441ka = (C0441KA) this.f3573d;
                C0398JA c0398ja = (C0398JA) this.f3574e;
                Context context = c0441ka.f1443b.getContext();
                AbstractC0295Gu.m625r(-492117352773685L);
                List list = c0398ja.f1343a;
                c0784sa.getClass();
                AbstractC0295Gu.m625r(-489763710695477L);
                Activity activity = (Activity) context;
                Dialog dialog = new Dialog(activity);
                dialog.requestWindowFeature(1);
                FrameLayout frameLayout = new FrameLayout(activity);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setBackgroundColor(-16777216);
                frameLayout.setTag(AbstractC0295Gu.m625r(-489463062984757L));
                TextView textView = new TextView(activity);
                StringBuilder sb = new StringBuilder();
                int i = this.f3571b;
                sb.append(i + 1);
                sb.append(AbstractC0295Gu.m625r(-489523192526901L));
                sb.append(list.size());
                textView.setText(sb.toString());
                textView.setTextSize(14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.parseColor(AbstractC0295Gu.m625r(-489540372396085L)));
                gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
                textView.setBackground(gradientDrawable);
                textView.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(10));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 49;
                layoutParams.topMargin = AbstractC0295Gu.m616i(56);
                textView.setLayoutParams(layoutParams);
                C0230FE c0230fe = new C0230FE(activity);
                c0230fe.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c0230fe.setAdapter(new C0355IA(c0784sa, activity, list));
                c0230fe.setCurrentItem(i);
                C0699QA c0699qa = new C0699QA(textView, list, c0230fe);
                if (c0230fe.f701P == null) {
                    c0230fe.f701P = new ArrayList();
                }
                c0230fe.f701P.add(c0699qa);
                TextView textView2 = new TextView(activity);
                textView2.setText(AbstractC0295Gu.m625r(-490133077882933L));
                textView2.setTextSize(20.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(Color.parseColor(AbstractC0295Gu.m625r(-490141667817525L)));
                gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(20));
                textView2.setBackground(gradientDrawable2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(44), AbstractC0295Gu.m616i(44));
                layoutParams2.gravity = 8388661;
                layoutParams2.topMargin = AbstractC0295Gu.m616i(52);
                layoutParams2.rightMargin = AbstractC0295Gu.m616i(16);
                textView2.setLayoutParams(layoutParams2);
                textView2.setOnClickListener(new ViewOnClickListenerC0226FA(dialog, 1));
                frameLayout.addView(c0230fe);
                frameLayout.addView(textView);
                frameLayout.addView(textView2);
                frameLayout.setOnClickListener(new ViewOnClickListenerC0226FA(dialog, 2));
                dialog.setContentView(frameLayout);
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                frameLayout.setAlpha(0.0f);
                frameLayout.animate().alpha(1.0f).setDuration(250L).setInterpolator(new DecelerateInterpolator()).start();
                dialog.show();
                return C0829TC.f2620a;
        }
    }

    public /* synthetic */ C1127a9(String str, ArrayList arrayList, Lua lua, int i) {
        this.f3572c = str;
        this.f3573d = arrayList;
        this.f3574e = lua;
        this.f3571b = i;
    }
}
