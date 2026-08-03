package p000;

import android.view.View;

/* JADX INFO: renamed from: Kg */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0453Kg implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0625Og f1486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0185EC f1487c;

    public /* synthetic */ ViewOnClickListenerC0453Kg(C0625Og r1, C0185EC r2, int r3) {
        this.f1485a = r3;
        this.f1486b = r1;
        this.f1487c = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        switch(this.f1485a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        String r22 = this.f1487c.f549a;
        this.f1486b.m1215a(r22);
        return;
    L6:
        String r23 = this.f1487c.f549a;
        this.f1486b.m1215a(r23);
    }
}
