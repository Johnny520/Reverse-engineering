package p229r1;

import android.view.View;
import android.view.WindowInsets;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.V */
/* JADX INFO: loaded from: classes.dex */
public class C3060V extends C3059U {

    /* JADX INFO: renamed from: w */
    public static final C3070c0 f9773w = C3070c0.m5393c(null, WindowInsets.CONSUMED);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3060V(C3070c0 c3070c0, WindowInsets windowInsets) {
        super(c3070c0, windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: i */
    public C2688b mo5367i(int i5) {
        return C2688b.m4668c(this.f9758c.getInsets(AbstractC3066a0.m5389a(i5)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: j */
    public C2688b mo5368j(int i5) {
        return C2688b.m4668c(this.f9758c.getInsetsIgnoringVisibility(AbstractC3066a0.m5389a(i5)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: u */
    public boolean mo5374u(int i5) {
        return this.f9758c.isVisible(AbstractC3066a0.m5389a(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3060V(C3070c0 c3070c0, C3060V c3060v) {
        super(c3070c0, c3060v);
    }

    @Override // p229r1.C3056Q, p229r1.C3064Z
    /* JADX INFO: renamed from: d */
    public final void mo5363d(View view) {
    }
}
