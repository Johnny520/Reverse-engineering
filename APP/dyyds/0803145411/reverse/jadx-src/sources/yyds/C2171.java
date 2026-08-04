package yyds;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲁᛱᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2171 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10642;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f10643;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f10644;

    public /* synthetic */ C2171(Object obj, int i, Object obj2) {
        this.f10642 = i;
        this.f10643 = obj;
        this.f10644 = obj2;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m4136(SeekBar seekBar) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m4137(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = this.f10642;
        Object obj = this.f10644;
        Object obj2 = this.f10643;
        switch (i2) {
            case 0:
                if (z) {
                    ((C0172) obj2).f997 = null;
                    ((InterfaceC1549) obj).mo371(Integer.valueOf(i));
                }
                break;
            case 1:
                AbstractC2328.m4341(-191907301589870L);
                C1509.f7142.getClass();
                C1509.f7268.m1581(C1509.f7179[70], Integer.valueOf(i));
                ((TextView) obj2).setText(String.valueOf(i));
                C0644.m1541((View) obj);
                C1435.m2931(C1435.f6790);
                break;
            default:
                AbstractC2328.m4341(-162327861822318L);
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('%');
                ((TextView) obj2).setText(sb.toString());
                ((InterfaceC1549) obj).mo371(Integer.valueOf(i));
                C1216.m2475();
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        long j;
        switch (this.f10642) {
            case 0:
                return;
            case 1:
                j = -191920186491758L;
                break;
            default:
                j = -162362221560686L;
                break;
        }
        AbstractC2328.m4341(j);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        long j;
        switch (this.f10642) {
            case 0:
                return;
            case 1:
                j = -191933071393646L;
                break;
            default:
                j = -162396581299054L;
                break;
        }
        AbstractC2328.m4341(j);
    }
}
