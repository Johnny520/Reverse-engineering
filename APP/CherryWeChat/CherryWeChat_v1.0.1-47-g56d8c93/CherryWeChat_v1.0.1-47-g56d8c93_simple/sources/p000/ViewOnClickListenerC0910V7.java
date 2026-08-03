package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;

/* JADX INFO: renamed from: V7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0910V7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2834c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2835d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2836e;

    public /* synthetic */ ViewOnClickListenerC0910V7(int r2, C0398JA r3, C0441KA r4, C0784SA r5) {
        this.f2832a = 1;
        this.f2834c = r3;
        this.f2835d = r4;
        this.f2836e = r5;
        this.f2833b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r7) {
        switch(this.f2832a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0398JA r72 = (C0398JA) this.f2834c;
        C0441KA r0 = (C0441KA) this.f2835d;
        C0784SA r1 = (C0784SA) this.f2836e;
        FrameLayout r2 = r0.f1442a;
        C1127a9 r3 = new C1127a9(this.f2833b, r72, r0, r1);
        r2.animate().scaleX(0.95f).scaleY(0.95f).setDuration(100).withEndAction(new RunnableC2260n3(16, r2, r3)).start();
        return;
    L6:
        FrameLayout r73 = (FrameLayout) this.f2834c;
        ViewOnClickListenerC0996X7 r02 = (ViewOnClickListenerC0996X7) this.f2835d;
        C0382Iv r12 = (C0382Iv) this.f2836e;
        Context r74 = r73.getContext();
        StringBuilder r22 = new StringBuilder();
        r22.append(AbstractC0295Gu.m625r(-501158258931765L));
        ArrayList r32 = r02.f3181c;
        int r4 = this.f2833b;
        r22.append((String) r32.get(r4));
        Toast.makeText(r74, r22.toString(), 0).show();
        AlertDialog r75 = (AlertDialog) r12.f1315a;
        if (r75 == null) goto L9;
        r75.dismiss();
    L9:
        String r76 = ViewOnClickListenerC0996X7.m1888a(r02);
        if (r76 == null) goto L13;
        C0668Pg r03 = AbstractC2248ms.f7951a;
        Object r13 = r32.get(r4);
        AbstractC0295Gu.m625r(-501184028735541L);
        r03.getClass();
        C0668Pg.m1331l(r76, (String) r13);
        return;
    }

    public /* synthetic */ ViewOnClickListenerC0910V7(FrameLayout r2, ViewOnClickListenerC0996X7 r3, int r4, C0382Iv r5) {
        this.f2832a = 0;
        this.f2834c = r2;
        this.f2835d = r3;
        this.f2833b = r4;
        this.f2836e = r5;
    }
}
