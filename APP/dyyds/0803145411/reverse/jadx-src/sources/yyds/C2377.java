package yyds;

import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲇᛱᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2377 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11722;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ TextView f11723;

    public native /* synthetic */ C2377(TextView textView, int i);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onProgressChanged(SeekBar seekBar, int i, boolean z);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStartTrackingTouch(SeekBar seekBar);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStopTrackingTouch(SeekBar seekBar);
}
