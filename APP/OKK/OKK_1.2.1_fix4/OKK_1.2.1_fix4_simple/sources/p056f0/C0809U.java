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

    public C0809U(TextView r1, SeekBar r2) {
        this.f2931a = r1;
        this.f2932b = r2;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar r4, int r5, boolean r6) {
        if (r6 == true) goto L4;
        return;
    L4:
        C0575B1 r42 = C0575B1.f1701a;
        float r43 = C0575B1.m1387c(AbstractC0040p.m111p(r5, 1, 85) / 100.0f);
        this.f2931a.setText("不透明度 " + ((int) (100 * r43)) + "%");
        float r44 = C0575B1.m1387c(r43);
        C0575B1.f1705e = r44;
        C0575B1.f1703c = SystemClock.uptimeMillis();
        C0661h1.f2048a.m1666f("theme_wallpaper_alpha", C0575B1.m1388d(r44), true);
        Object r52 = C0590G1.f1792a;
        C0590G1.f1796e.post(new RunnableC0578C1(C0575B1.m1387c(r44)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar r1) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar r5) {
        C0575B1 r52 = C0575B1.f1701a;
        float r53 = C0575B1.m1387c(C0575B1.m1387c(AbstractC0040p.m111p(this.f2932b.getProgress(), 1, 85) / 100.0f));
        C0661h1.f2048a.m1666f("theme_wallpaper_alpha", C0575B1.m1388d(r53), false);
        C0575B1.f1705e = r53;
        C0575B1.f1703c = SystemClock.uptimeMillis();
        Object r02 = C0590G1.f1792a;
        C0590G1.f1796e.post(new RunnableC0578C1(C0575B1.m1387c(r53)));
    }
}
