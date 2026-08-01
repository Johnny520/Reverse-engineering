package io.ktor.utils.p131io;

import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import p064e8.AbstractC2049b;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: io.ktor.utils.io.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3474l {

    /* JADX INFO: renamed from: io.ktor.utils.io.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {
        public a(Object obj) {
            super(1, obj, InterfaceC3473k.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((InterfaceC3473k) this.f3190r).mo12881f(interfaceC5976f);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m12969a(InterfaceC3473k interfaceC3473k) throws Throwable {
        interfaceC3473k.getClass();
        AbstractC3476n.m12975d(new a(interfaceC3473k));
    }

    /* JADX INFO: renamed from: b */
    public static final Object m12970b(InterfaceC3473k interfaceC3473k, InterfaceC5976f interfaceC5976f) {
        AbstractC3472j.m12963t(interfaceC3473k);
        C3456a c3456a = interfaceC3473k instanceof C3456a ? (C3456a) interfaceC3473k : null;
        if ((c3456a == null || !c3456a.m12885n()) && AbstractC2049b.m7395e(interfaceC3473k.mo12880d()) < 1048576) {
            return C4700i0.f13910a;
        }
        Object objMo12879b = interfaceC3473k.mo12879b(interfaceC5976f);
        return objMo12879b == AbstractC6325c.m24992g() ? objMo12879b : C4700i0.f13910a;
    }
}
