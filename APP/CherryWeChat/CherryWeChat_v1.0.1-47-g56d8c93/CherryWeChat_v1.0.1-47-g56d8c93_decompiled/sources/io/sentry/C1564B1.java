package io.sentry;

import io.sentry.util.AbstractC2034f;

/* JADX INFO: renamed from: io.sentry.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1564B1 implements InterfaceC1592I1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1592I1 f5601a;

    public C1564B1() {
        if (AbstractC2034f.f7219a || !AbstractC2034f.f7220b) {
            this.f5601a = new C1647X1(1);
        } else {
            this.f5601a = new C1647X1(0);
        }
    }

    @Override // io.sentry.InterfaceC1592I1
    /* JADX INFO: renamed from: a */
    public final AbstractC1588H1 mo3603a() {
        return this.f5601a.mo3603a();
    }
}
