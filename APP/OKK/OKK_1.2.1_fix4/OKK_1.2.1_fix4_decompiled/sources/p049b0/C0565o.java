package p049b0;

import p001A0.AbstractC0040p;
import p007D0.C0146l;
import p014H0.InterfaceC0202a;
import p016I0.EnumC0209a;
import p018J0.AbstractC0237g;
import p029P0.InterfaceC0290p;
import p040V0.C0406i;

/* JADX INFO: renamed from: b0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0565o extends AbstractC0237g implements InterfaceC0290p {

    /* JADX INFO: renamed from: c */
    public Class f1672c;

    /* JADX INFO: renamed from: d */
    public int f1673d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f1674e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Class f1675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0565o(Class cls, InterfaceC0202a interfaceC0202a) {
        super(interfaceC0202a);
        this.f1675f = cls;
    }

    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    public final Object mo518b(Object obj, Object obj2) {
        return ((C0565o) mo519d((C0406i) obj, (InterfaceC0202a) obj2)).mo520f(C0146l.f339a);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: d */
    public final InterfaceC0202a mo519d(Object obj, InterfaceC0202a interfaceC0202a) {
        C0565o c0565o = new C0565o(this.f1675f, interfaceC0202a);
        c0565o.f1674e = obj;
        return c0565o;
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object obj) throws Throwable {
        C0406i c0406i;
        Class superclass;
        EnumC0209a enumC0209a = EnumC0209a.f425a;
        int i2 = this.f1673d;
        if (i2 == 0) {
            AbstractC0040p.m97b0(obj);
            c0406i = (C0406i) this.f1674e;
            superclass = this.f1675f;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Class cls = this.f1672c;
            c0406i = (C0406i) this.f1674e;
            AbstractC0040p.m97b0(obj);
            superclass = cls.getSuperclass();
        }
        if (superclass == null || superclass.equals(Object.class)) {
            return C0146l.f339a;
        }
        this.f1674e = c0406i;
        this.f1672c = superclass;
        this.f1673d = 1;
        c0406i.m991d(superclass, this);
        return enumC0209a;
    }
}
