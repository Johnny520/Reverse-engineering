package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mc extends w51 implements xm0 {
    public final /* synthetic */ Context i;
    public final /* synthetic */ in0 j;
    public final /* synthetic */ eo0 k;
    public final /* synthetic */ fc2 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ View n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(Context context, in0 in0Var, eo0 eo0Var, fc2 fc2Var, int i, View view) {
        super(0);
        this.i = context;
        this.j = in0Var;
        this.k = eo0Var;
        this.l = fc2Var;
        this.m = i;
        this.n = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        KeyEvent.Callback callback = this.n;
        callback.getClass();
        return new ab3(this.i, this.j, this.k, this.l, this.m, (zv1) callback).getLayoutNode();
    }
}
