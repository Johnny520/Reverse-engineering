package p000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: ck */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1268ck implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1505hk f4312b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0185EC f4313c;

    public /* synthetic */ ViewOnClickListenerC1268ck(C1505hk c1505hk, C0185EC c0185ec, int i) {
        this.f4311a = i;
        this.f4312b = c1505hk;
        this.f4313c = c0185ec;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        long j;
        int i = this.f4311a;
        C0185EC c0185ec = this.f4313c;
        C1505hk c1505hk = this.f4312b;
        switch (i) {
            case 0:
                if (c0185ec.f567s == EnumC0099CC.f233a) {
                    C1337ds c1337ds = C1337ds.f4821a;
                    Context context2 = c1505hk.getContext();
                    AbstractC0295Gu.m625r(-70991514433589L);
                    String str = c0185ec.f550b;
                    c1337ds.getClass();
                    C1337ds.m2591c(context2, 1006, str);
                }
                break;
            case 1:
                C1337ds c1337ds2 = C1337ds.f4821a;
                Context context3 = c1505hk.getContext();
                AbstractC0295Gu.m625r(-71060233910325L);
                String str2 = c0185ec.f550b;
                c1337ds2.getClass();
                C1337ds.m2591c(context3, 1006, str2);
                break;
            case 2:
                C1505hk c1505hk2 = this.f4312b;
                TextView textView = c1505hk2.f5341e;
                C0185EC c0185ec2 = this.f4313c;
                List list = c0185ec2.f558j;
                if (!list.isEmpty()) {
                    C0140DA c0140da = (C0140DA) AbstractC2453ra.m4898h0(list);
                    C0183EA.f539a.getClass();
                    if (C0183EA.m380h()) {
                        C0357IC c0357ic = C0357IC.f1218a;
                        String str3 = c0185ec2.f549a;
                        EnumC0099CC enumC0099CC = EnumC0099CC.f235c;
                        c0357ic.getClass();
                        C0357IC.m794f(str3, enumC0099CC);
                        textView.setText(AbstractC0295Gu.m625r(-71257802405941L));
                        textView.setEnabled(false);
                        C1498hd c1498hd = AbstractC1499he.f5282a;
                        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C1417fk(c1505hk2, c0140da, c0185ec2, null, 0), 3);
                    } else {
                        context = c1505hk2.getContext();
                        j = -71232032602165L;
                    }
                } else {
                    context = c1505hk2.getContext();
                    j = -70643622082613L;
                }
                AbstractC0213Ey.m413k(j, context, 0);
                break;
            case 3:
                c1505hk.m2881b(c0185ec);
                break;
            default:
                c1505hk.m2881b(c0185ec);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC1268ck(C0185EC c0185ec, C1505hk c1505hk) {
        this.f4311a = 0;
        this.f4313c = c0185ec;
        this.f4312b = c1505hk;
    }
}
