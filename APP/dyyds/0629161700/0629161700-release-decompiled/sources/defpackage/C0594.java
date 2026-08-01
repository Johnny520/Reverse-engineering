package defpackage;

/* JADX INFO: renamed from: ᛳᲈᛶᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0594 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2969;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.widget.TextView f2970;

    static {
            r0 = 192(0xc0, float:2.69E-43)
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    public /* synthetic */ C0594(android.widget.TextView r1, int r2) {
            r0 = this;
            r0.f2969 = r2
            r0.f2970 = r1
            r0.<init>()
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStartTrackingTouch(android.widget.SeekBar r1);

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final native void onStopTrackingTouch(android.widget.SeekBar r1);
}
