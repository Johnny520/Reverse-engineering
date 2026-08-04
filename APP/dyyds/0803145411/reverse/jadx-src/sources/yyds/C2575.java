package yyds;

import android.media.MediaPlayer;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᲇᲈᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2575 implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12701;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f12702;

    public /* synthetic */ C2575(int i, Object obj) {
        this.f12701 = i;
        this.f12702 = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.f12701;
        Object obj = this.f12702;
        switch (i) {
            case 0:
                C0184 c0184 = (C0184) obj;
                c0184.f1067 = false;
                c0184.f1068.setImageResource(R.drawable.play);
                c0184.f1063.setText(AbstractC2328.m4341(-129475656975214L));
                c0184.f1066.setProgress(0);
                c0184.m764();
                break;
            case 1:
                C0184 c01842 = (C0184) obj;
                c01842.f1053 = -1;
                C2355 c2355 = c01842.f1047;
                if (c2355 != null) {
                    c2355.m4378(-1);
                }
                break;
            default:
                C0074 c0074 = (C0074) obj;
                c0074.f642 = -1;
                C0433 c0433 = (C0433) c0074.f638;
                if (c0433 != null) {
                    c0433.m1207(-1);
                }
                break;
        }
    }
}
