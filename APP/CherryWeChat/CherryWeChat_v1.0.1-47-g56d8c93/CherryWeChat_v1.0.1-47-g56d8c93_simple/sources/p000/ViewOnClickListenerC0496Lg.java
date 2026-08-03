package p000;

import android.content.Context;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: Lg */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0496Lg implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1622b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1623c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LinearLayout f1624d;

    public /* synthetic */ ViewOnClickListenerC0496Lg(Object r1, Object r2, LinearLayout r3, int r4) {
        this.f1621a = r4;
        this.f1622b = r1;
        this.f1623c = r2;
        this.f1624d = r3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r11) {
        switch(this.f1621a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        C0968Wg r112 = (C0968Wg) this.f1622b;
        ImageView r0 = (ImageView) this.f1623c;
        r112.f3018c = !r112.f3018c;
        boolean r1 = r112.f3018c;
        float r4 = 180.0f;
        float r5 = 0.0f;
        if (r1 == false) goto L7;
        r4 = 0.0f;
    L7:
        if (r1 == false) goto L9;
        r5 = 180.0f;
    L9:
        RotateAnimation r3 = new RotateAnimation(r4, r5, 1, 0.5f, 1, 0.5f);
        r3.setDuration(300);
        r3.setFillAfter(true);
        r0.startAnimation(r3);
        if (r112.f3018c == false) goto L12;
        int r113 = 0;
    L13:
        this.f1624d.setVisibility(r113);
        return;
    L12:
        r113 = 8;
        goto L13
    L15:
        TextView r114 = (TextView) this.f1622b;
        C0185EC r02 = (C0185EC) this.f1623c;
        C0625Og r12 = (C0625Og) this.f1624d;
        Context r2 = r114.getContext();
        AbstractC0295Gu.m625r(-97774930491445L);
        C1456gf.m2801S(r2, AbstractC0295Gu.m625r(-97843649968181L), AbstractC0295Gu.m625r(-97323958925365L) + r02.f551c + AbstractC0295Gu.m625r(-97371203565621L), new DialogInterfaceOnClickListenerC0534Mb(r02, r114, r12, 2), false);
    }
}
