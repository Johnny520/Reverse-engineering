package p117X2;

import p056K2.C0881g;
import p077P0.AbstractC1134u;
import p112W2.InterfaceC1601c;
import p137b3.InterfaceC1853a;
import p137b3.InterfaceC1855c;

/* JADX INFO: renamed from: X2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1667l extends AbstractC1670o implements InterfaceC1855c, InterfaceC1601c {
    public C1667l(String str, String str2) {
        super(C1657b.f5691d, AbstractC1134u.class, str, str2, 1);
    }

    @Override // p117X2.AbstractC1658c
    /* JADX INFO: renamed from: c */
    public final InterfaceC1853a mo2975c() {
        AbstractC1676u.f5711a.getClass();
        return this;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        m2992i();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final void m2992i() {
        if (this.f5704j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1853a interfaceC1853aM2993e = m2993e();
        if (interfaceC1853aM2993e == this) {
            throw new C0881g("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C1667l) ((InterfaceC1855c) interfaceC1853aM2993e)).m2992i();
    }
}
