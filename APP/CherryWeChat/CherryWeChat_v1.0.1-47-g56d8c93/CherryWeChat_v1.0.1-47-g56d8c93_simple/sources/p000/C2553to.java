package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: to */
/* JADX INFO: loaded from: classes.dex */
public final class C2553to extends AbstractC2639vo {

    /* JADX INFO: renamed from: c */
    public static final Class f8873c = null;

    static {
        f8873c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();
    }

    /* JADX INFO: renamed from: d */
    public static List m5040d(int r3, long r4, Object r6) {
        List r0 = (List) AbstractC2092jD.f7366c.m2908i(r4, r6);
        if (r0.isEmpty() == false) goto L16;
        if ((r0 instanceof InterfaceC0374In) == false) goto L8;
        List r02 = new C0331Hn(r3);
    L13:
        AbstractC2092jD.m4276p(r4, r6, r02);
        return r02;
    L8:
        if ((r0 instanceof InterfaceC2336ou) == true) goto L10;
    L12:
        r02 = new ArrayList(r3);
        goto L13
    L10:
        if ((r0 instanceof InterfaceC0458Kl) == false) goto L12;
        r02 = ((InterfaceC0458Kl) r0).mo716f(r3);
        goto L13
    L16:
        if (f8873c.isAssignableFrom(r0.getClass()) == false) goto L20;
        ArrayList r1 = new ArrayList(r0.size() + r3);
        r1.addAll(r0);
        AbstractC2092jD.m4276p(r4, r6, r1);
        return r1;
    L20:
        if ((r0 instanceof C1254cD) == false) goto L24;
        C0331Hn r12 = new C0331Hn(r0.size() + r3);
        r12.addAll((C1254cD) r0);
        AbstractC2092jD.m4276p(r4, r6, r12);
        return r12;
    L24:
        if ((r0 instanceof InterfaceC2336ou) == true) goto L26;
    L31:
        return r0;
    L26:
        if ((r0 instanceof InterfaceC0458Kl) == false) goto L31;
        InterfaceC0458Kl r13 = (InterfaceC0458Kl) r0;
        if (((AbstractC0172E) r13).f453a == true) goto L31;
        InterfaceC0458Kl r32 = r13.mo716f(r0.size() + r3);
        AbstractC2092jD.m4276p(r4, r6, r32);
        return r32;
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: a */
    public final void mo5041a(long r4, Object r6) {
        List r0 = (List) AbstractC2092jD.f7366c.m2908i(r4, r6);
        if ((r0 instanceof InterfaceC0374In) == false) goto L6;
        Object r02 = ((InterfaceC0374In) r0).mo717l();
    L17:
        AbstractC2092jD.m4276p(r4, r6, r02);
        return;
    L6:
        if (f8873c.isAssignableFrom(r0.getClass()) == false) goto L9;
        return;
    L9:
        if ((r0 instanceof InterfaceC2336ou) == true) goto L11;
    L16:
        r02 = Collections.unmodifiableList(r0);
        goto L17
    L11:
        if ((r0 instanceof InterfaceC0458Kl) == false) goto L16;
        AbstractC0172E r03 = (AbstractC0172E) ((InterfaceC0458Kl) r0);
        if (r03.f453a == false) goto L19;
        r03.f453a = false;
        return;
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: b */
    public final void mo5042b(long r4, Object r6, Object r7) {
        List r72 = (List) AbstractC2092jD.f7366c.m2908i(r4, r7);
        List r0 = m5040d(r72.size(), r4, r6);
        int r1 = r0.size();
        int r2 = r72.size();
        if (r1 <= 0) goto L6;
        if (r2 <= 0) goto L6;
        r0.addAll(r72);
    L6:
        if (r1 <= 0) goto L8;
        r72 = r0;
    L8:
        AbstractC2092jD.m4276p(r4, r6, r72);
    }

    @Override // p000.AbstractC2639vo
    /* JADX INFO: renamed from: c */
    public final List mo5043c(long r2, Object r4) {
        return m5040d(10, r2, r4);
    }
}
