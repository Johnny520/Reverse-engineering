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

    public /* synthetic */ C1407fa(Activity r1, int r2) {
        this.f4989a = r2;
        this.f4990b = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r4) {
        String r42 = (String) r4;
        switch(this.f4989a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-46694884440117L);
        Toast.makeText(this.f4990b, AbstractC0295Gu.m625r(-46200963201077L).concat(r42), 0).show();
    L6:
        return C0829TC.f2620a;
    L7:
        Toast.makeText(this.f4990b, AbstractC0295Gu.m625r(-88106959108149L) + r42, 1).show();
        goto L6
    }
}
