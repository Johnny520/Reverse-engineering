package p000;

import androidx.appcompat.widget.Toolbar;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i70 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f2341b;

    public /* synthetic */ i70(Toolbar toolbar, int i) {
        this.f2340a = i;
        this.f2341b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2340a) {
            case Base64.DEFAULT /* 0 */:
                l70 l70Var = this.f2341b.f323L;
                C0869wu c0869wu = l70Var == null ? null : l70Var.f2966b;
                if (c0869wu != null) {
                    c0869wu.collapseActionView();
                }
                break;
            default:
                this.f2341b.m180n();
                break;
        }
    }
}
