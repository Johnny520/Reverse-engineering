package androidx.compose.runtime;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p172l8.C4699i;

/* JADX INFO: renamed from: androidx.compose.runtime.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598u0 extends AbstractC0506h3 {

    /* JADX INFO: renamed from: b */
    public final C0605v0 f1613b;

    public C0598u0(InterfaceC0184l interfaceC0184l) {
        super(new InterfaceC0173a() { // from class: androidx.compose.runtime.t0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C0598u0.m2226g();
            }
        });
        this.f1613b = new C0605v0(interfaceC0184l);
    }

    /* JADX INFO: renamed from: g */
    public static Object m2226g() {
        AbstractC0468c0.m1549c("Unexpected call to default provider");
        throw new C4699i();
    }

    @Override // androidx.compose.runtime.AbstractC0506h3
    /* JADX INFO: renamed from: c */
    public C0513i3 mo1630c(Object obj) {
        return new C0513i3(this, obj, obj == null, null, null, null, true);
    }

    @Override // androidx.compose.runtime.AbstractC0524k0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0605v0 mo1775a() {
        return this.f1613b;
    }
}
