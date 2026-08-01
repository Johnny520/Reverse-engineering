package p037cb;

import la.AbstractC4722b;
import la.C4728h;
import la.InterfaceC4724d;
import p024b9.AbstractC1043k;
import p143ja.C3770c;
import p213oa.C5691b;
import p213oa.C5692c;
import p229p9.InterfaceC6003g1;

/* JADX INFO: renamed from: cb.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1487n0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4724d f4399a;

    /* JADX INFO: renamed from: b */
    public final C4728h f4400b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6003g1 f4401c;

    /* JADX INFO: renamed from: cb.n0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1487n0 {

        /* JADX INFO: renamed from: d */
        public final C3770c f4402d;

        /* JADX INFO: renamed from: e */
        public final a f4403e;

        /* JADX INFO: renamed from: f */
        public final C5691b f4404f;

        /* JADX INFO: renamed from: g */
        public final C3770c.c f4405g;

        /* JADX INFO: renamed from: h */
        public final boolean f4406h;

        /* JADX INFO: renamed from: i */
        public final boolean f4407i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3770c c3770c, InterfaceC4724d interfaceC4724d, C4728h c4728h, InterfaceC6003g1 interfaceC6003g1, a aVar) {
            super(interfaceC4724d, c4728h, interfaceC6003g1, null);
            c3770c.getClass();
            interfaceC4724d.getClass();
            c4728h.getClass();
            this.f4402d = c3770c;
            this.f4403e = aVar;
            this.f4404f = AbstractC1483l0.m5818a(interfaceC4724d, c3770c.m14162I0());
            C3770c.c cVar = (C3770c.c) AbstractC4722b.f13978f.mo18852d(c3770c.m14161H0());
            this.f4405g = cVar == null ? C3770c.c.CLASS : cVar;
            Boolean boolMo18852d = AbstractC4722b.f13979g.mo18852d(c3770c.m14161H0());
            boolMo18852d.getClass();
            this.f4406h = boolMo18852d.booleanValue();
            Boolean boolMo18852d2 = AbstractC4722b.f13980h.mo18852d(c3770c.m14161H0());
            boolMo18852d2.getClass();
            this.f4407i = boolMo18852d2.booleanValue();
        }

        @Override // p037cb.AbstractC1487n0
        /* JADX INFO: renamed from: a */
        public C5692c mo5845a() {
            return this.f4404f.m22982a();
        }

        /* JADX INFO: renamed from: e */
        public final C5691b m5849e() {
            return this.f4404f;
        }

        /* JADX INFO: renamed from: f */
        public final C3770c m5850f() {
            return this.f4402d;
        }

        /* JADX INFO: renamed from: g */
        public final C3770c.c m5851g() {
            return this.f4405g;
        }

        /* JADX INFO: renamed from: h */
        public final a m5852h() {
            return this.f4403e;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m5853i() {
            return this.f4406h;
        }
    }

    /* JADX INFO: renamed from: cb.n0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1487n0 {

        /* JADX INFO: renamed from: d */
        public final C5692c f4408d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5692c c5692c, InterfaceC4724d interfaceC4724d, C4728h c4728h, InterfaceC6003g1 interfaceC6003g1) {
            super(interfaceC4724d, c4728h, interfaceC6003g1, null);
            c5692c.getClass();
            interfaceC4724d.getClass();
            c4728h.getClass();
            this.f4408d = c5692c;
        }

        @Override // p037cb.AbstractC1487n0
        /* JADX INFO: renamed from: a */
        public C5692c mo5845a() {
            return this.f4408d;
        }
    }

    public AbstractC1487n0(InterfaceC4724d interfaceC4724d, C4728h c4728h, InterfaceC6003g1 interfaceC6003g1) {
        this.f4399a = interfaceC4724d;
        this.f4400b = c4728h;
        this.f4401c = interfaceC6003g1;
    }

    /* JADX INFO: renamed from: a */
    public abstract C5692c mo5845a();

    /* JADX INFO: renamed from: b */
    public final InterfaceC4724d m5846b() {
        return this.f4399a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC6003g1 m5847c() {
        return this.f4401c;
    }

    /* JADX INFO: renamed from: d */
    public final C4728h m5848d() {
        return this.f4400b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo5845a();
    }

    public /* synthetic */ AbstractC1487n0(InterfaceC4724d interfaceC4724d, C4728h c4728h, InterfaceC6003g1 interfaceC6003g1, AbstractC1043k abstractC1043k) {
        this(interfaceC4724d, c4728h, interfaceC6003g1);
    }
}
