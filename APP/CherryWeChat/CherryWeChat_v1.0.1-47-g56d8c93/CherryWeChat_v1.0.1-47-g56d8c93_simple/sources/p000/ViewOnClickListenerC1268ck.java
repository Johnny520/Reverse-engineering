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

    public /* synthetic */ ViewOnClickListenerC1268ck(C1505hk r1, C0185EC r2, int r3) {
        this.f4311a = r3;
        this.f4312b = r1;
        this.f4313c = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r10) {
        int r102 = this.f4311a;
        C0185EC r1 = this.f4313c;
        C1505hk r2 = this.f4312b;
        switch(r102) {
            case 0: goto L20;
            case 1: goto L17;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        r2.m2881b(r1);
        return;
    L6:
        r2.m2881b(r1);
        return;
    L8:
        C1505hk r4 = this.f4312b;
        TextView r103 = r4.f5341e;
        C0185EC r6 = this.f4313c;
        List r0 = r6.f558j;
        if (r0.isEmpty() == false) goto L12;
        Context r104 = r4.getContext();
        long r02 = -70643622082613L;
    L11:
        AbstractC0213Ey.m413k(r02, r104, 0);
        return;
    L12:
        C0140DA r5 = (C0140DA) AbstractC2453ra.m4898h0(r0);
        C0183EA.f539a.getClass();
        if (C0183EA.m380h() == true) goto L15;
        r104 = r4.getContext();
        r02 = -71232032602165L;
        goto L11
    L15:
        C0357IC r03 = C0357IC.f1218a;
        String r12 = r6.f549a;
        EnumC0099CC r3 = EnumC0099CC.f235c;
        r03.getClass();
        C0357IC.m794f(r12, r3);
        r103.setText(AbstractC0295Gu.m625r(-71257802405941L));
        r103.setEnabled(false);
        C1498hd r105 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C1417fk(r4, r5, r6, null, 0), 3);
        return;
    L17:
        C1337ds r106 = C1337ds.f4821a;
        Context r22 = r2.getContext();
        AbstractC0295Gu.m625r(-71060233910325L);
        String r13 = r1.f550b;
        r106.getClass();
        C1337ds.m2591c(r22, 1006, r13);
        return;
    L20:
        if (r1.f567s != EnumC0099CC.f233a) goto L24;
        C1337ds r107 = C1337ds.f4821a;
        Context r23 = r2.getContext();
        AbstractC0295Gu.m625r(-70991514433589L);
        String r14 = r1.f550b;
        r107.getClass();
        C1337ds.m2591c(r23, 1006, r14);
        return;
    }

    public /* synthetic */ ViewOnClickListenerC1268ck(C0185EC r2, C1505hk r3) {
        this.f4311a = 0;
        this.f4313c = r2;
        this.f4312b = r3;
    }
}
