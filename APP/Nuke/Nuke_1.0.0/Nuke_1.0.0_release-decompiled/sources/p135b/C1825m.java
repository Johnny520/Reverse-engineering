package p135b;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import p000A.RunnableC0083r;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1825m extends View {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ RunnableC0083r f6222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825m(RunnableC0083r runnableC0083r, Context context) {
        super(context);
        this.f6222d = runnableC0083r;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC1665j.m2985e(configuration, "newConfig");
        this.f6222d.run();
    }
}
