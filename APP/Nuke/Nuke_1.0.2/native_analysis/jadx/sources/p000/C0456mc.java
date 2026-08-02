package p000;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: mc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0456mc extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f6555i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f6556j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ eo0 f6557k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ fc2 f6558l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f6559m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ View f6560n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0456mc(Context context, in0 in0Var, eo0 eo0Var, fc2 fc2Var, int i, View view) {
        super(0);
        this.f6555i = context;
        this.f6556j = in0Var;
        this.f6557k = eo0Var;
        this.f6558l = fc2Var;
        this.f6559m = i;
        this.f6560n = view;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        KeyEvent.Callback callback = this.f6560n;
        callback.getClass();
        return new ab3(this.f6555i, this.f6556j, this.f6557k, this.f6558l, this.f6559m, (zv1) callback).getLayoutNode();
    }
}
