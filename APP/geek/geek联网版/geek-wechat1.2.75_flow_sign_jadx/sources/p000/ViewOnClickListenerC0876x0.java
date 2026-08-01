package p000;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0876x0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5150b;

    public /* synthetic */ ViewOnClickListenerC0876x0(int i, Object obj) {
        this.f5149a = i;
        this.f5150b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5149a) {
            case Base64.DEFAULT /* 0 */:
                ((AbstractC0506n1) this.f5150b).mo613a();
                break;
            case Base64.NO_PADDING /* 1 */:
                C0172e2 c0172e2 = (C0172e2) this.f5150b;
                c0172e2.f1486v.obtainMessage(1, c0172e2.f1466b).sendToTarget();
                break;
            case Base64.NO_WRAP /* 2 */:
                C0942yt c0942yt = (C0942yt) this.f5150b;
                int i = c0942yt.f5495V;
                if (i == 2) {
                    c0942yt.m2781E(1);
                } else if (i == 1) {
                    c0942yt.m2781E(2);
                }
                break;
            default:
                l70 l70Var = ((Toolbar) this.f5150b).f323L;
                C0869wu c0869wu = l70Var == null ? null : l70Var.f2966b;
                if (c0869wu != null) {
                    c0869wu.collapseActionView();
                }
                break;
        }
    }
}
