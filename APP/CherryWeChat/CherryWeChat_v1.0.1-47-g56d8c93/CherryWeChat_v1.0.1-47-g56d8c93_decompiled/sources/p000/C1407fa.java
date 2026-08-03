package p000;

import android.app.Activity;
import android.widget.Toast;

/* JADX INFO: renamed from: fa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1407fa implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f4990b;

    public /* synthetic */ C1407fa(Activity activity, int i) {
        this.f4989a = i;
        this.f4990b = activity;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        String str = (String) obj;
        switch (this.f4989a) {
            case 0:
                Toast.makeText(this.f4990b, AbstractC0295Gu.m625r(-88106959108149L) + str, 1).show();
                break;
            default:
                AbstractC0295Gu.m625r(-46694884440117L);
                Toast.makeText(this.f4990b, AbstractC0295Gu.m625r(-46200963201077L).concat(str), 0).show();
                break;
        }
        return C0829TC.f2620a;
    }
}
