package org.luckypray.dexkit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.C5823a;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p185m8.AbstractC5116y;
import p302ue.C8680d;
import p331we.AbstractC9231a;

/* JADX INFO: renamed from: org.luckypray.dexkit.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5825c extends AbstractC1067w implements InterfaceC0173a {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C5823a.e f18248r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0188p f18249s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ AbstractC9231a f18250t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC0184l f18251u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5825c(C5823a.e eVar, InterfaceC0188p interfaceC0188p, AbstractC9231a abstractC9231a, InterfaceC0184l interfaceC0184l) {
        super(0);
        this.f18248r = eVar;
        this.f18249s = interfaceC0188p;
        this.f18250t = abstractC9231a;
        this.f18251u = interfaceC0184l;
    }

    @Override // p010a9.InterfaceC0173a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke() {
        DexKitBridge dexKitBridge;
        boolean z10;
        C5823a.e eVar = this.f18248r;
        InterfaceC0188p interfaceC0188p = this.f18249s;
        AbstractC9231a abstractC9231a = this.f18250t;
        InterfaceC0184l interfaceC0184l = this.f18251u;
        C8680d c8680dM23456x = eVar.m23456x();
        c8680dM23456x.m33348i();
        try {
            synchronized (c8680dM23456x.f28791j) {
                dexKitBridge = c8680dM23456x.f28796o;
                if (dexKitBridge == null) {
                    Object objInvoke = c8680dM23456x.f28786e.invoke();
                    c8680dM23456x.f28796o = (DexKitBridge) objInvoke;
                    dexKitBridge = (DexKitBridge) objInvoke;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                c8680dM23456x.f28787f.invoke();
            }
            Iterable iterable = (Iterable) interfaceC0188p.invoke(dexKitBridge, abstractC9231a);
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC0184l.mo27m(it.next()));
            }
            c8680dM23456x.m33350k();
            return arrayList;
        } catch (Throwable th) {
            c8680dM23456x.m33350k();
            throw th;
        }
    }
}
