package p321w;

import android.media.MediaPlayer;
import android.widget.VideoView;
import p117i0.C1808a0;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1898z;
import p187n.C2859m;

/* JADX INFO: renamed from: w.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4600g1 implements InterfaceC1898z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1809a1 f15161b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4600g1(InterfaceC1809a1 interfaceC1809a1, C1808a0 c1808a0) {
        this.f15160a = 2;
        this.f15161b = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1898z
    /* JADX INFO: renamed from: a */
    public final void mo725a() {
        switch (this.f15160a) {
            case 0:
                InterfaceC1809a1 interfaceC1809a1 = this.f15161b;
                if (((C2859m) interfaceC1809a1.getValue()) != null) {
                    interfaceC1809a1.setValue(null);
                }
                break;
            case 1:
                VideoView videoView = (VideoView) this.f15161b.getValue();
                if (videoView != null) {
                    videoView.stopPlayback();
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a12 = this.f15161b;
                MediaPlayer mediaPlayer = (MediaPlayer) interfaceC1809a12.getValue();
                if (mediaPlayer != null) {
                    try {
                        if (mediaPlayer.isPlaying()) {
                            mediaPlayer.stop();
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        mediaPlayer.release();
                        break;
                    } catch (Throwable unused2) {
                    }
                }
                interfaceC1809a12.setValue(null);
                break;
        }
    }

    public /* synthetic */ C4600g1(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f15160a = i9;
        this.f15161b = interfaceC1809a1;
    }
}
