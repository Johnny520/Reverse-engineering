package com.abc.internal.probe;

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

    public C0565o(Class r1, InterfaceC0202a r2) {
        this.f1675f = r1;
        super(r2);
    }

    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    public final Object mo518b(Object r1, Object r2) {
        return ((C0565o) mo519d((C0406i) r1, (InterfaceC0202a) r2)).mo520f(C0146l.f339a);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: d */
    public final InterfaceC0202a mo519d(Object r3, InterfaceC0202a r4) {
        C0565o r02 = new C0565o(this.f1675f, r4);
        r02.f1674e = r3;
        return r02;
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    public final Object mo520f(Object r5) {
        EnumC0209a r02 = EnumC0209a.f425a;
        int r1 = this.f1673d;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        Class r12 = this.f1672c;
        C0406i r3 = (C0406i) this.f1674e;
        AbstractC0040p.m97b0(r5);
        Class r52 = r12.getSuperclass();
    L9:
        if (r52 == null) goto L15;
        if (r52.equals(Object.class) == true) goto L15;
        this.f1674e = r3;
        this.f1672c = r52;
        this.f1673d = 1;
        r3.m991d(r52, this);
        return r02;
    L15:
        return C0146l.f339a;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        AbstractC0040p.m97b0(r5);
        r3 = (C0406i) this.f1674e;
        r52 = this.f1675f;
        goto L9
    }
}
