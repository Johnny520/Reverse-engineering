package p056f0;

import android.widget.SeekBar;
import android.widget.TextView;
import p001A0.AbstractC0040p;
import p050c0.C0703v1;
import p050c0.C0709x1;

/* JADX INFO: renamed from: f0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0808T implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2930a;

    public C0808T(TextView textView) {
        this.f2930a = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        C0810V c0810v = C0810V.f2933a;
        C0709x1 c0709x1 = C0703v1.f2212b;
        this.f2930a.setText(C0810V.m2085e(AbstractC0040p.m110o((AbstractC0040p.m111p(i2, 0, 45) / 100.0f) + 0.05f, 0.05f, 0.5f)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
