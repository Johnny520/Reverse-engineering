package p000;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: RA */
/* JADX INFO: loaded from: classes.dex */
public final class CountDownTimerC0741RA extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f2369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC0741RA(TextView textView, Activity activity) {
        super(5000L, 100L);
        this.f2368a = textView;
        this.f2369b = activity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        String strM625r = AbstractC0295Gu.m625r(-490725783369781L);
        TextView textView = this.f2368a;
        textView.setText(strM625r);
        textView.setEnabled(true);
        textView.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(this.f2369b.getColor(R.color.buttonPrimary)));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        textView.setBackground(gradientDrawable);
        textView.animate().scaleX(1.05f).scaleY(1.05f).setDuration(150L).withEndAction(new RunnableC0562N2(28, textView)).start();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f2368a.setText(AbstractC0295Gu.m625r(-490682833696821L) + ((j / ((long) 1000)) + 1) + AbstractC0295Gu.m625r(-490712898467893L));
    }
}
