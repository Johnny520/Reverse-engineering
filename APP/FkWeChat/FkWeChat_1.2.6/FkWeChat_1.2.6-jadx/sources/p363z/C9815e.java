package p363z;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p166l2.AbstractC4528c2;
import p189n.C5213f0;
import p189n.InterfaceC5279s1;
import p248r.InterfaceC6434j;
import p277t2.AbstractC8070f0;
import p277t2.C8079k;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: z.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9815e extends C5213f0 {

    /* JADX INFO: renamed from: f0 */
    public boolean f33149f0;

    public C9815e(boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        super(interfaceC6434j, interfaceC5279s1, z11, z12, null, c8079k, interfaceC0173a, null);
        this.f33149f0 = z10;
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: W2 */
    public void mo21301W2(InterfaceC8074h0 interfaceC8074h0) {
        AbstractC8070f0.m31119j0(interfaceC8074h0, this.f33149f0);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m38159t3(boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        if (this.f33149f0 != z10) {
            this.f33149f0 = z10;
            AbstractC4528c2.m17573b(this);
        }
        super.m21388s3(interfaceC6434j, interfaceC5279s1, z11, z12, null, c8079k, interfaceC0173a);
    }

    public /* synthetic */ C9815e(boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z11, boolean z12, C8079k c8079k, InterfaceC0173a interfaceC0173a, AbstractC1043k abstractC1043k) {
        this(z10, interfaceC6434j, interfaceC5279s1, z11, z12, c8079k, interfaceC0173a);
    }
}
