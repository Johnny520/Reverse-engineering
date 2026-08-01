package p217oe;

import be.C1116d;
import me.C5164c;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p175le.C4752a;

/* JADX INFO: renamed from: oe.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5739a {

    /* JADX INFO: renamed from: a */
    public static final C5739a f18090a = new C5739a();

    /* JADX INFO: renamed from: oe.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC5590b f18091r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5590b interfaceC5590b) {
            super(1);
            this.f18091r = interfaceC5590b;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean mo27m(me.C5164c.a r4) {
            /*
                r3 = this;
                r4.getClass()
                ne.b r0 = r3.f18091r
                ne.b r0 = r0.mo22672e(r4)
                java.lang.String r1 = r4.m21186c()
                int r1 = ne.AbstractC5591c.m22694f(r0, r1)
                ne.b r2 = r3.f18091r
                boolean r0 = ne.AbstractC5591c.m22695g(r0, r2)
                if (r0 == 0) goto L34
                java.lang.String r0 = r4.m21186c()
                int r0 = r0.length()
                r2 = 1
                if (r1 >= r0) goto L35
                int r1 = r1 + r2
                me.c$a r4 = r4.m21196m(r1)
                if (r4 == 0) goto L30
                java.lang.Integer r4 = r4.m21184a()
                goto L31
            L30:
                r4 = 0
            L31:
                if (r4 != 0) goto L34
                goto L35
            L34:
                r2 = 0
            L35:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p217oe.C5739a.a.mo27m(me.c$a):java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m23216a(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        C4752a c4752a = C4752a.f14072a;
        int i10 = 1;
        if (!(aVar.m21192i() == -1)) {
            throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        a aVar2 = new a(interfaceC5590b);
        while (((Boolean) aVar2.mo27m(aVar)).booleanValue() && (aVar = aVar.m21195l()) != null && (i10 = i10 + 1) <= 4) {
        }
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public final C5164c.a m23217b(InterfaceC5590b interfaceC5590b, C5164c.a aVar) {
        interfaceC5590b.getClass();
        aVar.getClass();
        do {
            InterfaceC5590b interfaceC5590bM22689a = AbstractC5591c.m22689a(interfaceC5590b, aVar);
            if (!AbstractC5591c.m22695g(interfaceC5590bM22689a, interfaceC5590b) || !AbstractC5591c.m22693e(interfaceC5590bM22689a, interfaceC5590b)) {
                break;
            }
            if (!f18090a.m23220e(AbstractC5591c.m22691c(interfaceC5590bM22689a, aVar.m21186c()))) {
                return aVar;
            }
            aVar = aVar.m21195l();
        } while (aVar != null);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C5164c.a m23218c(C5164c.a aVar, int i10) {
        aVar.getClass();
        int i11 = i10 - 1;
        C5164c.a aVarM21195l = aVar;
        for (int i12 = 0; i12 < i11; i12++) {
            aVarM21195l = aVar.m21195l();
            if (aVarM21195l == null) {
                return null;
            }
        }
        while (aVarM21195l.m21184a() == null) {
            aVarM21195l = aVarM21195l.m21195l();
            if (aVarM21195l == null) {
                return null;
            }
        }
        return aVarM21195l;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m23219d(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        int iM22694f = AbstractC5591c.m22694f(interfaceC5590b, aVar.m21186c());
        if (aVar.m21192i() >= iM22694f + 4) {
            return true;
        }
        int iM21192i = aVar.m21192i();
        if (iM22694f > iM21192i) {
            return false;
        }
        while (aVar.m21186c().charAt(iM22694f) != '\t') {
            if (iM22694f == iM21192i) {
                return false;
            }
            iM22694f++;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m23220e(CharSequence charSequence) {
        charSequence.getClass();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return false;
            }
        }
        return true;
    }
}
