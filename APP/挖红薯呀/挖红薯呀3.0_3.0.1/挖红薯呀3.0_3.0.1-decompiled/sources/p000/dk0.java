package p000;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dk0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1138a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wt0 f1139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wt0 f1140c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xt0 f1141d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xt0 f1142e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vt0 f1143f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1144g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1145h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1146i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1147j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f1148k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1149l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dk0(wt0 wt0Var, wt0 wt0Var2, xt0 xt0Var, xt0 xt0Var2, vt0 vt0Var, int i, int i2, int i3, int i4, Context context, Activity activity) {
        this.f1139b = wt0Var;
        this.f1140c = wt0Var2;
        this.f1141d = xt0Var;
        this.f1142e = xt0Var2;
        this.f1143f = vt0Var;
        this.f1144g = i;
        this.f1145h = i2;
        this.f1146i = i3;
        this.f1147j = i4;
        this.f1148k = context;
        this.f1149l = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f1138a) {
            case 0:
                return fk0.m1136d0(this.f1139b, this.f1140c, this.f1141d, this.f1142e, this.f1143f, this.f1144g, this.f1145h, this.f1146i, this.f1147j, this.f1148k, (Activity) this.f1149l, view, motionEvent);
            default:
                return vs0.m4762B(this.f1139b, this.f1140c, this.f1141d, this.f1142e, this.f1143f, this.f1144g, this.f1145h, this.f1146i, this.f1147j, this.f1149l, this.f1148k, view, motionEvent);
        }
    }

    public /* synthetic */ dk0(wt0 wt0Var, wt0 wt0Var2, xt0 xt0Var, xt0 xt0Var2, vt0 vt0Var, int i, int i2, int i3, int i4, Object obj, Context context) {
        this.f1139b = wt0Var;
        this.f1140c = wt0Var2;
        this.f1141d = xt0Var;
        this.f1142e = xt0Var2;
        this.f1143f = vt0Var;
        this.f1144g = i;
        this.f1145h = i2;
        this.f1146i = i3;
        this.f1147j = i4;
        this.f1149l = obj;
        this.f1148k = context;
    }
}
