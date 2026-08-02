package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kd0 extends View {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RunnableC0390kk f5462h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd0(RunnableC0390kk runnableC0390kk, Context context) {
        super(context);
        this.f5462h = runnableC0390kk;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f5462h.run();
    }
}
