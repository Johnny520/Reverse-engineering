package yyds;

import android.media.MediaPlayer;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲈᛱᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2582 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12730;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f12731;

    public /* synthetic */ C2582(int i, Object obj) {
        this.f12730 = i;
        this.f12731 = obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m4655(SeekBar seekBar) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m4656(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        MediaPlayer mediaPlayer;
        String string;
        int i2 = this.f12730;
        int i3 = 100;
        Object obj = this.f12731;
        switch (i2) {
            case 0:
                C0184 c0184 = (C0184) obj;
                if (z && (mediaPlayer = c0184.f1062) != null) {
                    int duration = (mediaPlayer.getDuration() * i) / 100;
                    MediaPlayer mediaPlayer2 = c0184.f1062;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.seekTo(duration);
                    }
                    break;
                }
                break;
            case 1:
                AbstractC2328.m4341(-165703706116974L);
                ((InterfaceC1549) obj).mo371(Integer.valueOf(i));
                break;
            default:
                AbstractC2328.m4341(-821107125551982L);
                TextView textView = (TextView) ((C1633) obj).f8331;
                C0718.f3373.getClass();
                if (i <= 0) {
                    i3 = 0;
                } else {
                    int i4 = i + 34;
                    if (i4 <= 100) {
                        i3 = i4;
                    }
                }
                if (i3 == 0) {
                    string = AbstractC2328.m4341(-853443934323566L);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append('%');
                    string = sb.toString();
                }
                textView.setText(string);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        long j;
        switch (this.f12730) {
            case 0:
                return;
            case 1:
                j = -165716591018862L;
                break;
            default:
                j = -821141485290350L;
                break;
        }
        AbstractC2328.m4341(j);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i;
        String string;
        switch (this.f12730) {
            case 0:
                break;
            case 1:
                AbstractC2328.m4341(-165729475920750L);
                C0644.m1542();
                break;
            default:
                AbstractC2328.m4341(-821175845028718L);
                C0718 c0718 = C0718.f3373;
                int progress = seekBar.getProgress();
                c0718.getClass();
                if (progress <= 0) {
                    i = 0;
                } else {
                    i = progress + 34;
                    if (i > 100) {
                        i = 100;
                    }
                }
                C1509.f7142.getClass();
                C0668 c0668 = C1509.f7154;
                InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
                if (((Number) c0668.m1579(interfaceC1989Arr[136])).intValue() != i) {
                    c0668.m1581(interfaceC1989Arr[136], Integer.valueOf(i));
                    TextView textView = (TextView) ((C1633) this.f12731).f8331;
                    c0718.getClass();
                    int iM1658 = C0718.m1658();
                    if (iM1658 == 0) {
                        string = AbstractC2328.m4341(-853443934323566L);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(iM1658);
                        sb.append('%');
                        string = sb.toString();
                    }
                    textView.setText(string);
                    AbstractC1960.m3789(AbstractC2328.m4341(-821210204767086L));
                    break;
                }
                break;
        }
    }
}
