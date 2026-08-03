package p000;

import android.app.Activity;
import android.view.View;

/* JADX INFO: renamed from: C7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0094C7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f211b;

    public /* synthetic */ ViewOnClickListenerC0094C7(C1495ha r1, Activity r2, int r3) {
        this.f210a = r3;
        this.f211b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r5) {
        switch(this.f210a) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            default: goto L4;
        };
    L4:
        Activity r52 = this.f211b;
        r52.onBackPressed();
        C1337ds r0 = C1337ds.f4821a;
        AbstractC0295Gu.m625r(-44882408241205L);
        C1036Y4.f3308a.getClass();
        if (C1036Y4.m1983b(r52) == false) goto L7;
        int r1 = 1007;
    L8:
        C1337ds.m2592d(r0, r52, r1);
        return;
    L7:
        r1 = 1;
        goto L8
    L10:
        String r53 = AbstractC0295Gu.m625r(-81668803131445L);
        String r02 = AbstractC0295Gu.m625r(-81690277967925L);
        DialogInterfaceOnClickListenerC0804So r12 = new DialogInterfaceOnClickListenerC0804So(0);
        C1456gf.m2801S(this.f211b, r53, r02, r12, true);
        return;
    L12:
        String r54 = AbstractC0295Gu.m625r(-81668803131445L);
        String r03 = AbstractC0295Gu.m625r(-81690277967925L);
        DialogInterfaceOnClickListenerC0804So r13 = new DialogInterfaceOnClickListenerC0804So(0);
        C1456gf.m2801S(this.f211b, r54, r03, r13, true);
        return;
    L14:
        this.f211b.onBackPressed();
    }

    public /* synthetic */ ViewOnClickListenerC0094C7(Activity r1, int r2) {
        this.f210a = r2;
        this.f211b = r1;
    }
}
