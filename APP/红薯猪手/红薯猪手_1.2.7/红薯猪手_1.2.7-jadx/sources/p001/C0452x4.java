package p001;

import android.app.Activity;
import android.content.Context;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: ۟.x4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0452x4 extends AbstractC0335o4 implements InterfaceC0208f3<ProgressBar> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Context f1187;

    public C0452x4(Activity activity) {
        this.f1187 = activity;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public final ProgressBar mo7() {
        return new ProgressBar(this.f1187);
    }
}
