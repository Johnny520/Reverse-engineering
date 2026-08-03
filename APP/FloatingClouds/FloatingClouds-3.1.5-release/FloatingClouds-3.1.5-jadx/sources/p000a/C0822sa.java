package p000a;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: a.sa */
/* JADX INFO: loaded from: classes.dex */
public final class C0822sa implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f3275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0064D7<Integer, C0413Wf> f3276b;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.D7<? super java.lang.Integer, a.Wf> */
    /* JADX WARN: Multi-variable type inference failed */
    public C0822sa(TextView textView, InterfaceC0064D7<? super Integer, C0413Wf> interfaceC0064D7) {
        this.f3275a = textView;
        this.f3276b = interfaceC0064D7;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f3275a.setText(i + "%");
        if (z) {
            this.f3276b.mo53f(Integer.valueOf(i));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
