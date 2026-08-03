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

    public /* synthetic */ ViewOnClickListenerC0496Lg(Object obj, Object obj2, LinearLayout linearLayout, int i) {
        this.f1621a = i;
        this.f1622b = obj;
        this.f1623c = obj2;
        this.f1624d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1621a) {
            case 0:
                TextView textView = (TextView) this.f1622b;
                C0185EC c0185ec = (C0185EC) this.f1623c;
                C0625Og c0625Og = (C0625Og) this.f1624d;
                Context context = textView.getContext();
                AbstractC0295Gu.m625r(-97774930491445L);
                C1456gf.m2801S(context, AbstractC0295Gu.m625r(-97843649968181L), AbstractC0295Gu.m625r(-97323958925365L) + c0185ec.f551c + AbstractC0295Gu.m625r(-97371203565621L), new DialogInterfaceOnClickListenerC0534Mb(c0185ec, textView, c0625Og, 2), false);
                break;
            default:
                C0968Wg c0968Wg = (C0968Wg) this.f1622b;
                ImageView imageView = (ImageView) this.f1623c;
                c0968Wg.f3018c = !c0968Wg.f3018c;
                boolean z = c0968Wg.f3018c;
                RotateAnimation rotateAnimation = new RotateAnimation(z ? 0.0f : 180.0f, z ? 180.0f : 0.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(300L);
                rotateAnimation.setFillAfter(true);
                imageView.startAnimation(rotateAnimation);
                this.f1624d.setVisibility(c0968Wg.f3018c ? 0 : 8);
                break;
        }
    }
}
