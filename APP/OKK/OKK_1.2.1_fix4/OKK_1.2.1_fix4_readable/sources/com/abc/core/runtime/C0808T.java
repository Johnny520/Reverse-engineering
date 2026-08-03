package com.abc.core.runtime;

import android.widget.SeekBar;
import android.widget.TextView;
import com.abc.core.features.C0709x1;
import com.abc.core.features.RoundAvatarHook;
import p001A0.AbstractC0040p;

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
        SettingsUiBuilder settingsUiBuilder = SettingsUiBuilder.f2933a;
        C0709x1 c0709x1 = RoundAvatarHook.f2212b;
        this.f2930a.setText(SettingsUiBuilder.m2085e(AbstractC0040p.m110o((AbstractC0040p.m111p(i2, 0, 45) / 100.0f) + 0.05f, 0.05f, 0.5f)));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
