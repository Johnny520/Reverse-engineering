package p130ic;

import p010a9.InterfaceC0189q;
import p024b9.AbstractC1064u0;
import p024b9.C1055q;
import p113hc.InterfaceC2974d;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ic.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3401s {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0189q f9387a;

    /* JADX INFO: renamed from: ic.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0189q {

        /* JADX INFO: renamed from: y */
        public static final a f9388y = new a();

        public a() {
            super(3, InterfaceC2974d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(InterfaceC2974d interfaceC2974d, Object obj, InterfaceC5976f interfaceC5976f) {
            return interfaceC2974d.mo400a(obj, interfaceC5976f);
        }
    }

    static {
        a aVar = a.f9388y;
        aVar.getClass();
        f9387a = (InterfaceC0189q) AbstractC1064u0.m3858f(aVar, 3);
    }
}
