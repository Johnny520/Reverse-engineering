package p000;

import androidx.appcompat.widget.Toolbar;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c70 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f907a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f908b;

    public /* synthetic */ c70(Toolbar toolbar, int i) {
        this.f907a = i;
        this.f908b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f907a) {
            case Base64.DEFAULT /* 0 */:
                f70 f70Var = this.f908b.f360L;
                C0572ou c0572ou = f70Var == null ? null : f70Var.f1901b;
                if (c0572ou != null) {
                    c0572ou.collapseActionView();
                }
                break;
            default:
                this.f908b.m195n();
                break;
        }
    }
}
