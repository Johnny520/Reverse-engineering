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

    public /* synthetic */ ViewOnClickListenerC0453Kg(C0625Og c0625Og, C0185EC c0185ec, int i) {
        this.f1485a = i;
        this.f1486b = c0625Og;
        this.f1487c = c0185ec;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1485a) {
            case 0:
                this.f1486b.m1215a(this.f1487c.f549a);
                break;
            default:
                this.f1486b.m1215a(this.f1487c.f549a);
                break;
        }
    }
}
