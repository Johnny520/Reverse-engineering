package p000;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.Toast;

/* JADX INFO: renamed from: hq */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC1511hq implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinearLayout f5352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2112jq f5353b;

    public AnimationAnimationListenerC1511hq(LinearLayout r1, C2112jq r2) {
        this.f5352a = r1;
        this.f5353b = r2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation r13) {
        String r132 = C1456gf.m2791I();
        LinearLayout r0 = this.f5352a;
        Object r1 = r0.getContext().getSystemService(AbstractC0295Gu.m625r(-809803198756917L));
        AbstractC0295Gu.m625r(-809846148429877L);
        ((ClipboardManager) r1).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-826089714743349L), r132));
        AbstractC0295Gu.m625r(-782302523160629L);
        ScaleAnimation r3 = new ScaleAnimation(0.95f, 1.05f, 0.95f, 1.05f, 1, 0.5f, 1, 0.5f);
        r3.setDuration(200);
        r3.setInterpolator(new AccelerateDecelerateInterpolator());
        r3.setAnimationListener(new AnimationAnimationListenerC0730Qz(r0, 2));
        r0.startAnimation(r3);
        AbstractC0295Gu.m625r(-781980400613429L);
        ValueAnimator r133 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f, 0.0f});
        r133.setDuration(1000);
        r133.setRepeatCount(-1);
        r133.setInterpolator(new AccelerateDecelerateInterpolator());
        r133.addUpdateListener(new C0733R2(0, r0));
        AbstractC0295Gu.m625r(-782001875449909L);
        r133.start();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2260n3(13, r133, r0), 1000);
        C2112jq r134 = this.f5353b;
        Toast.makeText(r134.getContext(), AbstractC0295Gu.m625r(-825398225008693L), 0).show();     // Catch: Exception -> L5
        return;
    L5:
        Toast r02 = new Toast(r134.getContext());     // Catch: Exception -> L7
        r02.setDuration(0);     // Catch: Exception -> L7
        r02.setText(AbstractC0295Gu.m625r(-825458354550837L));     // Catch: Exception -> L7
        r02.show();     // Catch: Exception -> L7
        return;
    L7:
        e = move-exception;
        e.printStackTrace();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation r1) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation r1) {
    }
}
