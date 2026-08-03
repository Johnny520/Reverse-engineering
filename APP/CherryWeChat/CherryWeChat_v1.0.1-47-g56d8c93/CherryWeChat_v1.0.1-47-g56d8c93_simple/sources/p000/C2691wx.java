package p000;

import android.content.SharedPreferences;
import android.widget.SeekBar;

/* JADX INFO: renamed from: wx */
/* JADX INFO: loaded from: classes.dex */
public final class C2691wx implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2734xx f9261a;

    public C2691wx(C2734xx r1) {
        this.f9261a = r1;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar r3, int r4, boolean r5) {
        AbstractC0295Gu.m625r(-494449520015413L);
        C2734xx r32 = this.f9261a;
        r32.m5299a(r4);
        if (r5 == false) goto L11;
        String r52 = r32.f9335a;
        if (r52 == null) goto L7;
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        AbstractC0295Gu.m625r(-839971049044021L);
        SharedPreferences.Editor r02 = AbstractC0599Nx.f1939a.edit();
        r02.putInt(r52, r4);
        r02.apply();
    L7:
        InterfaceC1416fj r33 = r32.f9341g;
        if (r33 == null) goto L12;
        r33.mo90g(Integer.valueOf(r4));
        return;
    L12:
        return;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar r3) {
        AbstractC0295Gu.m625r(-494462404917301L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar r3) {
        AbstractC0295Gu.m625r(-494475289819189L);
    }
}
