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

    public /* synthetic */ ViewOnClickListenerC2343p0(int r1, Object r2) {
        this.f8222a = r1;
        this.f8223b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r9) {
        switch(this.f8222a) {
            case 0: goto L49;
            case 1: goto L29;
            case 2: goto L27;
            case 3: goto L21;
            case 4: goto L14;
            default: goto L4;
        };
    L4:
        TrackSelectionView r0 = (TrackSelectionView) this.f8223b;
        HashMap r1 = r0.f4363d;
        if (r9 != r0.f4360a) goto L8;
        r0.f4367h = true;
        r1.clear();
    L10:
        r0.m2418a();
        return;
    L8:
        if (r9 != r0.f4361b) goto L12;
        r0.f4367h = false;
        r1.clear();
        goto L10
    L12:
        r0.f4367h = false;
        r9.getTag().getClass();
        throw new ClassCastException();
    L14:
        C2354pB r92 = ((Toolbar) this.f8223b).f3815M;
        if (r92 != null) goto L17;
        C2427qr r93 = null;
    L18:
        if (r93 == null) goto L51;
        r93.collapseActionView();
        return;
    L51:
        return;
    L17:
        r93 = r92.f8238b;
        goto L18
    L21:
        C0549Mq r94 = (C0549Mq) this.f8223b;
        int r02 = r94.f1777X;
        if (r02 != 2) goto L24;
        r94.m1041D(1);
        r94.f1780a0.announceForAccessibility(r94.m2878y().getResources().getString(R.string.mtrl_picker_toggled_to_day_selection));
        return;
    L24:
        if (r02 != 1) goto L53;
        r94.m1041D(2);
        r94.f1779Z.announceForAccessibility(r94.m2878y().getResources().getString(R.string.mtrl_picker_toggled_to_year_selection));
        return;
    L53:
        return;
    L27:
        AbstractC0295Gu.m625r(-47751446394933L);
        Context r2 = r9.getContext();
        AbstractC0295Gu.m625r(-47760036329525L);
        C2648vx r03 = (C2648vx) this.f8223b;
        C1456gf.m2799Q(r2, (String) r03.f9164c, (String) r03.f9165d, (String) r03.f9162a, (String) r03.f9163b, new C0649P3(22, r03, r9));
        return;
    L29:
        C2611v2 r04 = (C2611v2) this.f8223b;
        if (r9 != r04.f9040h) goto L35;
        Message r12 = r04.f9042j;
        if (r12 == null) goto L35;
        Message r95 = Message.obtain(r12);
    L45:
        if (r95 == null) goto L47;
        r95.sendToTarget();
    L47:
        r04.f9031D.obtainMessage(1, r04.f9034b).sendToTarget();
        return;
    L35:
        if (r9 != r04.f9043k) goto L40;
        Message r13 = r04.f9045m;
        if (r13 == null) goto L40;
        r95 = Message.obtain(r13);
    L40:
        if (r9 != r04.f9046n) goto L44;
        Message r96 = r04.f9048p;
        if (r96 == null) goto L44;
        r95 = Message.obtain(r96);
    L44:
        r95 = null;
        goto L45
    L49:
        ((AbstractC0345I0) this.f8223b).mo735a();
    }
}
