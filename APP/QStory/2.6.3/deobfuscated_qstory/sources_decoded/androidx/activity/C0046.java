package androidx.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0046 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ RunnableC0042 f94;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046(RunnableC0042 runnableC0042, Context context) {
        super(context);
        this.f94 = runnableC0042;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f94.run();
    }
}
