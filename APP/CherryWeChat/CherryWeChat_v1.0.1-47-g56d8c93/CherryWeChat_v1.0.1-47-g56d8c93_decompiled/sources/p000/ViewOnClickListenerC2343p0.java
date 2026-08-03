package p000;

import android.content.Context;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.p001ui.TrackSelectionView;
import io.github.cherrywechat.R;
import java.util.HashMap;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2343p0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8223b;

    public /* synthetic */ ViewOnClickListenerC2343p0(int i, Object obj) {
        this.f8222a = i;
        this.f8223b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f8222a) {
            case 0:
                ((AbstractC0345I0) this.f8223b).mo735a();
                return;
            case 1:
                C2611v2 c2611v2 = (C2611v2) this.f8223b;
                Message messageObtain = (view != c2611v2.f9040h || (message3 = c2611v2.f9042j) == null) ? (view != c2611v2.f9043k || (message2 = c2611v2.f9045m) == null) ? (view != c2611v2.f9046n || (message = c2611v2.f9048p) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c2611v2.f9031D.obtainMessage(1, c2611v2.f9034b).sendToTarget();
                return;
            case 2:
                AbstractC0295Gu.m625r(-47751446394933L);
                Context context = view.getContext();
                AbstractC0295Gu.m625r(-47760036329525L);
                C2648vx c2648vx = (C2648vx) this.f8223b;
                C1456gf.m2799Q(context, (String) c2648vx.f9164c, (String) c2648vx.f9165d, (String) c2648vx.f9162a, (String) c2648vx.f9163b, new C0649P3(22, c2648vx, view));
                return;
            case 3:
                C0549Mq c0549Mq = (C0549Mq) this.f8223b;
                int i = c0549Mq.f1777X;
                if (i == 2) {
                    c0549Mq.m1041D(1);
                    c0549Mq.f1780a0.announceForAccessibility(c0549Mq.m2878y().getResources().getString(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else {
                    if (i == 1) {
                        c0549Mq.m1041D(2);
                        c0549Mq.f1779Z.announceForAccessibility(c0549Mq.m2878y().getResources().getString(R.string.mtrl_picker_toggled_to_year_selection));
                        return;
                    }
                    return;
                }
            case 4:
                C2354pB c2354pB = ((Toolbar) this.f8223b).f3815M;
                C2427qr c2427qr = c2354pB == null ? null : c2354pB.f8238b;
                if (c2427qr != null) {
                    c2427qr.collapseActionView();
                    return;
                }
                return;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f8223b;
                HashMap map = trackSelectionView.f4363d;
                if (view == trackSelectionView.f4360a) {
                    trackSelectionView.f4367h = true;
                    map.clear();
                } else {
                    if (view != trackSelectionView.f4361b) {
                        trackSelectionView.f4367h = false;
                        view.getTag().getClass();
                        throw new ClassCastException();
                    }
                    trackSelectionView.f4367h = false;
                    map.clear();
                }
                trackSelectionView.m2418a();
                return;
        }
    }
}
