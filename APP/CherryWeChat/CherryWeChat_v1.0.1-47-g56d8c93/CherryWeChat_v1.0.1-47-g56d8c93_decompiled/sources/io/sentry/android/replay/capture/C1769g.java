package io.sentry.android.replay.capture;

import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1769g extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1770h f6453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1769g(C1770h c1770h, int i) {
        super(1);
        this.f6452b = i;
        this.f6453c = c1770h;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        switch (this.f6452b) {
            case 0:
                AbstractC1775m abstractC1775m = (AbstractC1775m) obj;
                if (abstractC1775m instanceof C1773k) {
                    C1770h c1770h = this.f6453c;
                    c1770h.f6458v.add(abstractC1775m);
                    c1770h.m3957l(c1770h.m3955j() + 1);
                }
                break;
            default:
                AbstractC1775m abstractC1775m2 = (AbstractC1775m) obj;
                if (abstractC1775m2 instanceof C1773k) {
                    C1770h c1770h2 = this.f6453c;
                    c1770h2.f6458v.add(abstractC1775m2);
                    c1770h2.m3957l(c1770h2.m3955j() + 1);
                }
                break;
        }
        return C0829TC.f2620a;
    }
}
