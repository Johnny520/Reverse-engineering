package yyds;

import android.content.Context;
import android.widget.EditText;
import android.widget.SeekBar;

/* JADX INFO: renamed from: yyds.ᛶᲁᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1430 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f6784;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f6785;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f6786;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f6787;

    public native /* synthetic */ C1430(EditText editText, C2802 c2802, int i, int i2);

    public native C1430(C0103 c0103, Context context, C0172 c0172, int i);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onProgressChanged(SeekBar seekBar, int i, boolean z);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStartTrackingTouch(SeekBar seekBar);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStopTrackingTouch(SeekBar seekBar);
}
