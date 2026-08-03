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

    public CountDownTimerC0741RA(TextView r3, Activity r4) {
        this.f2368a = r3;
        this.f2369b = r4;
        super(5000, 100);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        String r0 = AbstractC0295Gu.m625r(-490725783369781L);
        TextView r1 = this.f2368a;
        r1.setText(r0);
        r1.setEnabled(true);
        r1.setTextColor(-1);
        GradientDrawable r02 = new GradientDrawable();
        r02.setColor(ColorStateList.valueOf(this.f2369b.getColor(R.color.buttonPrimary)));
        r02.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        r02.setCornerRadius(AbstractC0295Gu.m616i(12));
        r1.setBackground(r02);
        r1.animate().scaleX(1.05f).scaleY(1.05f).setDuration(150).withEndAction(new RunnableC0562N2(28, r1)).start();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long r4) {
        this.f2368a.setText(AbstractC0295Gu.m625r(-490682833696821L) + ((r4 / ((long) 1000)) + 1) + AbstractC0295Gu.m625r(-490712898467893L));
    }
}
