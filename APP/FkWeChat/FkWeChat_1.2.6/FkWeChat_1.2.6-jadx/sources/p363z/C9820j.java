package p363z;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p166l2.AbstractC4528c2;
import p172l8.C4700i0;
import p189n.C5213f0;
import p189n.InterfaceC5279s1;
import p248r.InterfaceC6434j;
import p277t2.AbstractC8070f0;
import p277t2.C8079k;
import p277t2.InterfaceC8074h0;
import p306v2.AbstractC8808b;

/* JADX INFO: renamed from: z.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9820j extends C5213f0 {

    /* JADX INFO: renamed from: f0 */
    public boolean f33170f0;

    /* JADX INFO: renamed from: g0 */
    public InterfaceC0184l f33171g0;

    /* JADX INFO: renamed from: h0 */
    public final InterfaceC0173a f33172h0;

    public C9820j(final boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, C8079k c8079k, final InterfaceC0184l interfaceC0184l) {
        super(interfaceC6434j, interfaceC5279s1, z11, z12, null, c8079k, new InterfaceC0173a() { // from class: z.h
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C9820j.m38167u3(interfaceC0184l, z10);
            }
        }, null);
        this.f33170f0 = z10;
        this.f33171g0 = interfaceC0184l;
        this.f33172h0 = new InterfaceC0173a() { // from class: z.i
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C9820j.m38166t3(this.f33169q);
            }
        };
    }

    /* JADX INFO: renamed from: t3 */
    public static C4700i0 m38166t3(C9820j c9820j) {
        c9820j.f33171g0.mo27m(Boolean.valueOf(!c9820j.f33170f0));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: u3 */
    public static C4700i0 m38167u3(InterfaceC0184l interfaceC0184l, boolean z10) {
        interfaceC0184l.mo27m(Boolean.valueOf(!z10));
        return C4700i0.f13910a;
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: W2 */
    public void mo21301W2(InterfaceC8074h0 interfaceC8074h0) {
        AbstractC8070f0.m31145w0(interfaceC8074h0, AbstractC8808b.m33788a(this.f33170f0));
    }

    /* JADX INFO: renamed from: v3 */
    public final void m38168v3(boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, C8079k c8079k, InterfaceC0184l interfaceC0184l) {
        if (this.f33170f0 != z10) {
            this.f33170f0 = z10;
            AbstractC4528c2.m17573b(this);
        }
        this.f33171g0 = interfaceC0184l;
        super.m21388s3(interfaceC6434j, interfaceC5279s1, z11, z12, null, c8079k, this.f33172h0);
    }

    public /* synthetic */ C9820j(boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, C8079k c8079k, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(z10, interfaceC6434j, interfaceC5279s1, z11, z12, c8079k, interfaceC0184l);
    }
}
