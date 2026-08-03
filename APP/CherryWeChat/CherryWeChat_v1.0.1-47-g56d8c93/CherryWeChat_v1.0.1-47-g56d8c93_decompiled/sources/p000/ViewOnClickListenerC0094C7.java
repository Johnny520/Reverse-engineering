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

    public /* synthetic */ ViewOnClickListenerC0094C7(C1495ha c1495ha, Activity activity, int i) {
        this.f210a = i;
        this.f211b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f210a) {
            case 0:
                this.f211b.onBackPressed();
                break;
            case 1:
                C1456gf.m2801S(this.f211b, AbstractC0295Gu.m625r(-81668803131445L), AbstractC0295Gu.m625r(-81690277967925L), new DialogInterfaceOnClickListenerC0804So(0), true);
                break;
            case 2:
                C1456gf.m2801S(this.f211b, AbstractC0295Gu.m625r(-81668803131445L), AbstractC0295Gu.m625r(-81690277967925L), new DialogInterfaceOnClickListenerC0804So(0), true);
                break;
            default:
                Activity activity = this.f211b;
                activity.onBackPressed();
                C1337ds c1337ds = C1337ds.f4821a;
                AbstractC0295Gu.m625r(-44882408241205L);
                C1036Y4.f3308a.getClass();
                C1337ds.m2592d(c1337ds, activity, C1036Y4.m1983b(activity) ? 1007 : 1);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0094C7(Activity activity, int i) {
        this.f210a = i;
        this.f211b = activity;
    }
}
