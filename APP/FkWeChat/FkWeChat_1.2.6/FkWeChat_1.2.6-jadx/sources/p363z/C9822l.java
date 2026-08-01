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
import p306v2.EnumC8807a;

/* JADX INFO: renamed from: z.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9822l extends C5213f0 {

    /* JADX INFO: renamed from: f0 */
    public EnumC8807a f33180f0;

    public C9822l(EnumC8807a enumC8807a, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        super(interfaceC6434j, interfaceC5279s1, z10, z11, null, c8079k, interfaceC0173a, null);
        this.f33180f0 = enumC8807a;
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: W2 */
    public void mo21301W2(InterfaceC8074h0 interfaceC8074h0) {
        AbstractC8070f0.m31145w0(interfaceC8074h0, this.f33180f0);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m38171t3(EnumC8807a enumC8807a, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        if (this.f33180f0 != enumC8807a) {
            this.f33180f0 = enumC8807a;
            AbstractC4528c2.m17573b(this);
        }
        super.m21388s3(interfaceC6434j, interfaceC5279s1, z10, z11, null, c8079k, interfaceC0173a);
    }

    public /* synthetic */ C9822l(EnumC8807a enumC8807a, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a, AbstractC1043k abstractC1043k) {
        this(enumC8807a, interfaceC6434j, interfaceC5279s1, z10, z11, c8079k, interfaceC0173a);
    }
}
