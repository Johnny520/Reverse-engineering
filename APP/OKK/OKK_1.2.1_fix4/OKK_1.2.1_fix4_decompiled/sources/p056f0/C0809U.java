package p056f0;

import android.os.SystemClock;
import android.widget.SeekBar;
import android.widget.TextView;
import p001A0.AbstractC0040p;
import p050c0.C0575B1;
import p050c0.C0590G1;
import p050c0.C0661h1;
import p050c0.RunnableC0578C1;

/* JADX INFO: renamed from: f0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0809U implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SeekBar f2932b;

    public C0809U(TextView textView, SeekBar seekBar) {
        this.f2931a = textView;
        this.f2932b = seekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            C0575B1 c0575b1 = C0575B1.f1701a;
            float fM1387c = C0575B1.m1387c(AbstractC0040p.m111p(i2, 1, 85) / 100.0f);
            this.f2931a.setText("不透明度 " + ((int) (100 * fM1387c)) + "%");
            float fM1387c2 = C0575B1.m1387c(fM1387c);
            C0575B1.f1705e = fM1387c2;
            C0575B1.f1703c = SystemClock.uptimeMillis();
            C0661h1.f2048a.m1666f("theme_wallpaper_alpha", C0575B1.m1388d(fM1387c2), true);
            Object obj = C0590G1.f1792a;
            C0590G1.f1796e.post(new RunnableC0578C1(C0575B1.m1387c(fM1387c2)));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        C0575B1 c0575b1 = C0575B1.f1701a;
        float fM1387c = C0575B1.m1387c(C0575B1.m1387c(AbstractC0040p.m111p(this.f2932b.getProgress(), 1, 85) / 100.0f));
        C0661h1.f2048a.m1666f("theme_wallpaper_alpha", C0575B1.m1388d(fM1387c), false);
        C0575B1.f1705e = fM1387c;
        C0575B1.f1703c = SystemClock.uptimeMillis();
        Object obj = C0590G1.f1792a;
        C0590G1.f1796e.post(new RunnableC0578C1(C0575B1.m1387c(fM1387c)));
    }
}
