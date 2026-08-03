package com.abc.core.features;

import java.lang.reflect.Method;
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

/* JADX INFO: renamed from: c0.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0616P0 extends AbstractC0237g implements InterfaceC0290p {

    /* JADX INFO: renamed from: c */
    public Class f1899c;

    /* JADX INFO: renamed from: d */
    public int f1900d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f1901e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Class f1902f;

    public C0616P0(Class r1, InterfaceC0202a r2) {
        this.f1902f = r1;
        super(r2);
    }

    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    public final Object mo518b(Object r1, Object r2) {
        return ((C0616P0) mo519d((C0406i) r1, (InterfaceC0202a) r2)).mo520f(C0146l.f339a);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: d */
    public final InterfaceC0202a mo519d(Object r3, InterfaceC0202a r4) {
        C0616P0 r02 = new C0616P0(this.f1902f, r4);
        r02.f1901e = r3;
        return r02;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:15:0x0049). Please report as a decompilation issue!!! */
    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object r6) {
        EnumC0209a r02 = EnumC0209a.f425a;
        int r1 = this.f1900d;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        Class r12 = this.f1899c;
        C0406i r3 = (C0406i) this.f1901e;
        AbstractC0040p.m97b0(r6);
    L15:
        r12 = r12.getSuperclass();
    L9:
        if (r12 == null) goto L17;
        if (r12.equals(Object.class) == true) goto L17;
        Method[] r62 = r12.getDeclaredMethods();
        AbstractC0307g.m702d(r62, "getDeclaredMethods(...)");
        InterfaceC0405h r63 = AbstractC0179j.m531h0(r62);
        this.f1901e = r3;
        this.f1899c = r12;
        this.f1900d = 1;
        if (r3.m992e(r63, this) != r02) goto L15;
        return r02;
    L17:
        return C0146l.f339a;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        AbstractC0040p.m97b0(r6);
        C0406i r64 = (C0406i) this.f1901e;
        r12 = this.f1902f;
        r3 = r64;
        goto L9
    }
}
