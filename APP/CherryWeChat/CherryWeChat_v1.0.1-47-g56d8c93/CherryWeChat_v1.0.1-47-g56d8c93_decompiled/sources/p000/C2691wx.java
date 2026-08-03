package p000;

import android.content.SharedPreferences;
import android.widget.SeekBar;

/* JADX INFO: renamed from: wx */
/* JADX INFO: loaded from: classes.dex */
public final class C2691wx implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2734xx f9261a;

    public C2691wx(C2734xx c2734xx) {
        this.f9261a = c2734xx;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        AbstractC0295Gu.m625r(-494449520015413L);
        C2734xx c2734xx = this.f9261a;
        c2734xx.m5299a(i);
        if (z) {
            String str = c2734xx.f9335a;
            if (str != null) {
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                AbstractC0295Gu.m625r(-839971049044021L);
                SharedPreferences.Editor editorEdit = AbstractC0599Nx.f1939a.edit();
                editorEdit.putInt(str, i);
                editorEdit.apply();
            }
            InterfaceC1416fj interfaceC1416fj = c2734xx.f9341g;
            if (interfaceC1416fj != null) {
                interfaceC1416fj.mo90g(Integer.valueOf(i));
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        AbstractC0295Gu.m625r(-494462404917301L);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        AbstractC0295Gu.m625r(-494475289819189L);
    }
}
