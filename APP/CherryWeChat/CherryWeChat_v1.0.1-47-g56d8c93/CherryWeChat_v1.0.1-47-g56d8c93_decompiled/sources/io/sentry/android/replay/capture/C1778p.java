package io.sentry.android.replay.capture;

import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1778p extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1779q f6467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1778p(C1779q c1779q, int i) {
        super(1);
        this.f6466b = i;
        this.f6467c = c1779q;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        switch (this.f6466b) {
            case 0:
                AbstractC1775m abstractC1775m = (AbstractC1775m) obj;
                if (abstractC1775m instanceof C1773k) {
                    C1773k c1773k = (C1773k) abstractC1775m;
                    C1779q c1779q = this.f6467c;
                    C1773k.m3966a(c1773k, c1779q.f6469s);
                    c1779q.m3957l(c1779q.m3955j() + 1);
                    c1779q.m3958m(c1773k.f6459a.f7285u);
                }
                break;
            default:
                AbstractC1775m abstractC1775m2 = (AbstractC1775m) obj;
                if (abstractC1775m2 instanceof C1773k) {
                    C1779q c1779q2 = this.f6467c;
                    C1773k.m3966a((C1773k) abstractC1775m2, c1779q2.f6469s);
                    c1779q2.m3957l(c1779q2.m3955j() + 1);
                }
                break;
        }
        return C0829TC.f2620a;
    }
}
