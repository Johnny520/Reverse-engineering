package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: renamed from: fr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219fr extends View {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RunnableC0084ca f1797d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219fr(RunnableC0084ca runnableC0084ca, Context context) {
        super(context);
        this.f1797d = runnableC0084ca;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f1797d.run();
    }
}
