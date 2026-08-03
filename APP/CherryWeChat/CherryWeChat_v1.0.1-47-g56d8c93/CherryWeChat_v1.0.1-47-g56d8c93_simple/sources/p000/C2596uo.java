package p000;

import java.util.List;

/* JADX INFO: renamed from: uo */
/* JADX INFO: loaded from: classes.dex */
public final class C2596uo extends AbstractC2639vo {
    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: a */
    public final void mo5041a(long r2, Object r4) {
        ((AbstractC0172E) ((InterfaceC0458Kl) AbstractC2092jD.f7366c.m2908i(r2, r4))).f453a = false;
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: b */
    public final void mo5042b(long r5, Object r7, Object r8) {
        AbstractC1535iD r0 = AbstractC2092jD.f7366c;
        InterfaceC0458Kl r1 = (InterfaceC0458Kl) r0.m2908i(r5, r7);
        InterfaceC0458Kl r82 = (InterfaceC0458Kl) r0.m2908i(r5, r8);
        int r02 = r1.size();
        int r2 = r82.size();
        if (r02 <= 0) goto L9;
        if (r2 <= 0) goto L9;
        if (((AbstractC0172E) r1).f453a == true) goto L8;
        r1 = r1.mo716f(r2 + r02);
    L8:
        r1.addAll(r82);
    L9:
        if (r02 <= 0) goto L11;
        r82 = r1;
    L11:
        AbstractC2092jD.m4276p(r5, r7, r82);
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: c */
    public final List mo5043c(long r3, Object r5) {
        InterfaceC0458Kl r0 = (InterfaceC0458Kl) AbstractC2092jD.f7366c.m2908i(r3, r5);
        if (((AbstractC0172E) r0).f453a == true) goto L10;
        int r1 = r0.size();
        if (r1 != 0) goto L7;
        int r12 = 10;
    L8:
        InterfaceC0458Kl r02 = r0.mo716f(r12);
        AbstractC2092jD.m4276p(r3, r5, r02);
        return r02;
    L7:
        r12 = r1 * 2;
        goto L8
    L10:
        return r0;
    }
}
