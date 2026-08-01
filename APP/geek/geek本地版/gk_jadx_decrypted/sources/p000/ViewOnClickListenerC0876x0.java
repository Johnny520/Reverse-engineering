package p000;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0876x0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5079b;

    public /* synthetic */ ViewOnClickListenerC0876x0(int i, Object obj) {
        this.f5078a = i;
        this.f5079b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5078a) {
            case Base64.DEFAULT /* 0 */:
                ((AbstractC0506n1) this.f5079b).mo1882a();
                break;
            case Base64.NO_PADDING /* 1 */:
                C0172e2 c0172e2 = (C0172e2) this.f5079b;
                c0172e2.f1682v.obtainMessage(1, c0172e2.f1662b).sendToTarget();
                break;
            case Base64.NO_WRAP /* 2 */:
                C0794ut c0794ut = (C0794ut) this.f5079b;
                int i = c0794ut.f4763V;
                if (i == 2) {
                    c0794ut.m2470E(1);
                } else if (i == 1) {
                    c0794ut.m2470E(2);
                }
                break;
            default:
                f70 f70Var = ((Toolbar) this.f5079b).f360L;
                C0572ou c0572ou = f70Var == null ? null : f70Var.f1901b;
                if (c0572ou != null) {
                    c0572ou.collapseActionView();
                }
                break;
        }
    }
}
