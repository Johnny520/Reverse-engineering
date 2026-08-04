package yyds;

import android.widget.EditText;
import android.widget.SeekBar;

/* JADX INFO: renamed from: yyds.ᛴᲈᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1004 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ EditText f4569;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2802 f4570;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ double f4571;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ double f4572;

    public native C1004(EditText editText, C2802 c2802, double d, double d2);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onProgressChanged(SeekBar seekBar, int i, boolean z);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStartTrackingTouch(SeekBar seekBar);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStopTrackingTouch(SeekBar seekBar);
}
