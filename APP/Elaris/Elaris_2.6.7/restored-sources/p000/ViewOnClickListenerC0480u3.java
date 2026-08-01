package p000;

import android.view.View;
import android.widget.PopupWindow;
import com.p001mr.elaris.ElarisStatusActivity;

/* JADX INFO: renamed from: u3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0480u3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PopupWindow f937a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ElarisStatusActivity f939c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0480u3(ElarisStatusActivity elarisStatusActivity, PopupWindow popupWindow, boolean z) {
        this.f939c = elarisStatusActivity;
        this.f937a = popupWindow;
        this.f938b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f937a.dismiss();
        this.f939c.setLauncherIconHidden(!this.f938b);
    }
}
