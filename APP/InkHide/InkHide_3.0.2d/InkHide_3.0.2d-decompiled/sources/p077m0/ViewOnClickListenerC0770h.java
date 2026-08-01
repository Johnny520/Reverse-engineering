package p077m0;

import android.app.Activity;
import android.view.View;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p088s0.C0975I;
import p088s0.C0976J;
import p088s0.C0990l;
import p090t0.C1010e;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: m0.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0770h implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2589c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0770h(int i2, Object obj) {
        this.f2588b = i2;
        this.f2589c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2588b) {
            case 0:
                new C0976J((Activity) this.f2589c).m2209g();
                break;
            case 1:
                ((View) this.f2589c).setVisibility(0);
                break;
            case 2:
                C0990l c0990l = (C0990l) this.f2589c;
                c0990l.f3562o.mo2182a();
                c0990l.m2197d();
                break;
            case 3:
                ((C0975I) this.f2589c).mo2182a();
                break;
            case 4:
                String str = (String) this.f2589c;
                if (AbstractC0223g.m414a(str, "未识别")) {
                    AbstractC0503h.m978P("暂未识别到本机微信id，请进入微信后再查看");
                } else if (!AbstractC1135r.m2484f(str)) {
                    AbstractC0503h.m978P("复制失败");
                } else {
                    AbstractC0503h.m978P("已复制本机微信识别id:" + str);
                }
                break;
            default:
                ((C1010e) this.f2589c).mo2182a();
                break;
        }
    }
}
