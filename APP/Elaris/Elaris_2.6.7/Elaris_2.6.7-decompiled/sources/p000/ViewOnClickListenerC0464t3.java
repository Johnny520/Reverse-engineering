package p000;

import android.view.View;
import com.p001mr.elaris.ElarisStatusActivity;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0464t3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ElarisStatusActivity f892b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0464t3(ElarisStatusActivity elarisStatusActivity, int i) {
        this.f891a = i;
        this.f892b = elarisStatusActivity;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.mr.elaris.ElarisStatusActivity.a(com.mr.elaris.ElarisStatusActivity):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f891a;
        ElarisStatusActivity elarisStatusActivity = this.f892b;
        switch (i) {
            case 0:
                elarisStatusActivity.showOverflowMenu(view);
                break;
            default:
                elarisStatusActivity.openExternalLink("https://t.me/Elaris_mod");
                break;
        }
    }
}
