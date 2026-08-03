package com.abc.core.features;

import java.lang.reflect.Field;
import p001A0.AbstractC0040p;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p014H0.InterfaceC0202a;
import p016I0.EnumC0209a;
import p018J0.AbstractC0237g;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p040V0.C0406i;
import p040V0.InterfaceC0405h;

/* JADX INFO: renamed from: c0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0669k0 extends AbstractC0237g implements InterfaceC0290p {

    /* JADX INFO: renamed from: c */
    public Class f2080c;

    /* JADX INFO: renamed from: d */
    public int f2081d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2082e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Class f2083f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0669k0(Class cls, InterfaceC0202a interfaceC0202a) {
        super(interfaceC0202a);
        this.f2083f = cls;
    }

    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    public final Object mo518b(Object obj, Object obj2) {
        return ((C0669k0) mo519d((C0406i) obj, (InterfaceC0202a) obj2)).mo520f(C0146l.f339a);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: d */
    public final InterfaceC0202a mo519d(Object obj, InterfaceC0202a interfaceC0202a) {
        C0669k0 c0669k0 = new C0669k0(this.f2083f, interfaceC0202a);
        c0669k0.f2082e = obj;
        return c0669k0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:15:0x0049). Please report as a decompilation issue!!! */
    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo520f(Object obj) throws Throwable {
        Class superclass;
        C0406i c0406i;
        EnumC0209a enumC0209a = EnumC0209a.f425a;
        int i2 = this.f2081d;
        if (i2 == 0) {
            AbstractC0040p.m97b0(obj);
            C0406i c0406i2 = (C0406i) this.f2082e;
            superclass = this.f2083f;
            c0406i = c0406i2;
            if (superclass != null) {
            }
            return C0146l.f339a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        superclass = this.f2080c;
        c0406i = (C0406i) this.f2082e;
        AbstractC0040p.m97b0(obj);
        superclass = superclass.getSuperclass();
        if (superclass != null || superclass.equals(Object.class)) {
            return C0146l.f339a;
        }
        Field[] declaredFields = superclass.getDeclaredFields();
        AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
        InterfaceC0405h interfaceC0405hM531h0 = AbstractC0179j.m531h0(declaredFields);
        this.f2082e = c0406i;
        this.f2080c = superclass;
        this.f2081d = 1;
        if (c0406i.m992e(interfaceC0405hM531h0, this) == enumC0209a) {
            return enumC0209a;
        }
        superclass = superclass.getSuperclass();
        if (superclass != null) {
        }
        return C0146l.f339a;
    }
}
