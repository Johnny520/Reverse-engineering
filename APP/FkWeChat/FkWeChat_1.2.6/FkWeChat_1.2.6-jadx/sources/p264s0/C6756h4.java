package p264s0;

import androidx.compose.runtime.InterfaceC0512i2;
import java.util.List;
import java.util.Locale;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p080f9.C2363j;
import p102h1.AbstractC2820b;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p185m8.AbstractC5114x;
import p264s0.C6756h4;
import p275t0.C7947d0;

/* JADX INFO: renamed from: s0.h4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6756h4 extends AbstractC7031z implements InterfaceC6708e4 {

    /* JADX INFO: renamed from: h */
    public static final a f21501h = new a(null);

    /* JADX INFO: renamed from: f */
    public InterfaceC0512i2 f21502f;

    /* JADX INFO: renamed from: g */
    public InterfaceC0512i2 f21503g;

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6756h4(java.lang.Long r3, java.lang.Long r4, p080f9.C2363j r5, int r6, p264s0.InterfaceC6888p8 r7, java.util.Locale r8) {
        /*
            r2 = this;
            r2.<init>(r4, r5, r7, r8)
            r4 = 0
            if (r3 == 0) goto L1d
            t0.e0 r7 = r2.m27705j()
            long r0 = r3.longValue()
            t0.d0 r3 = r7.mo30692b(r0)
            int r7 = r3.m30678h()
            boolean r5 = r5.m8566t(r7)
            if (r5 == 0) goto L1d
            goto L1e
        L1d:
            r3 = r4
        L1e:
            r5 = 2
            androidx.compose.runtime.i2 r3 = androidx.compose.runtime.AbstractC0473c5.m1571j(r3, r4, r5, r4)
            r2.f21502f = r3
            s0.x4 r3 = p264s0.C7006x4.m27640c(r6)
            androidx.compose.runtime.i2 r3 = androidx.compose.runtime.AbstractC0473c5.m1571j(r3, r4, r5, r4)
            r2.f21503g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264s0.C6756h4.<init>(java.lang.Long, java.lang.Long, f9.j, int, s0.p8, java.util.Locale):void");
    }

    @Override // p264s0.InterfaceC6708e4
    /* JADX INFO: renamed from: a */
    public void mo26648a(int i10) {
        Long lMo26653f = mo26653f();
        if (lMo26653f != null) {
            m27700c(m27705j().mo30698h(lMo26653f.longValue()).m30737d());
        }
        this.f21503g.setValue(C7006x4.m27640c(i10));
    }

    @Override // p264s0.InterfaceC6708e4
    /* JADX INFO: renamed from: b */
    public int mo26649b() {
        return ((C7006x4) this.f21503g.getValue()).m27646i();
    }

    @Override // p264s0.InterfaceC6708e4
    /* JADX INFO: renamed from: f */
    public Long mo26653f() {
        C7947d0 c7947d0 = (C7947d0) this.f21502f.getValue();
        if (c7947d0 != null) {
            return Long.valueOf(c7947d0.m30677g());
        }
        return null;
    }

    @Override // p264s0.InterfaceC6708e4
    /* JADX INFO: renamed from: h */
    public void mo26655h(Long l10) {
        if (l10 == null) {
            this.f21502f.setValue(null);
        } else {
            C7947d0 c7947d0Mo30692b = m27705j().mo30692b(l10.longValue());
            this.f21502f.setValue(m27703g().m8566t(c7947d0Mo30692b.m30678h()) ? c7947d0Mo30692b : null);
        }
    }

    /* JADX INFO: renamed from: s0.h4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static List m26809a(InterfaceC2821b0 interfaceC2821b0, C6756h4 c6756h4) {
            return AbstractC5114x.m20803r(c6756h4.mo26653f(), Long.valueOf(c6756h4.m27702e()), Integer.valueOf(c6756h4.m27703g().m8560o()), Integer.valueOf(c6756h4.m27703g().m8561p()), Integer.valueOf(c6756h4.mo26649b()));
        }

        /* JADX INFO: renamed from: b */
        public static C6756h4 m26810b(InterfaceC6888p8 interfaceC6888p8, Locale locale, List list) {
            Long l10 = (Long) list.get(0);
            Long l11 = (Long) list.get(1);
            Object obj = list.get(2);
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(3);
            obj2.getClass();
            C2363j c2363j = new C2363j(iIntValue, ((Integer) obj2).intValue());
            Object obj3 = list.get(4);
            obj3.getClass();
            return new C6756h4(l10, l11, c2363j, C7006x4.m27641d(((Integer) obj3).intValue()), interfaceC6888p8, locale, null);
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC2843x m26811c(final InterfaceC6888p8 interfaceC6888p8, final Locale locale) {
            return AbstractC2820b.m10040b(new InterfaceC0188p() { // from class: s0.f4
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C6756h4.a.m26809a((InterfaceC2821b0) obj, (C6756h4) obj2);
                }
            }, new InterfaceC0184l() { // from class: s0.g4
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C6756h4.a.m26810b(interfaceC6888p8, locale, (List) obj);
                }
            });
        }

        public a() {
        }
    }

    public /* synthetic */ C6756h4(Long l10, Long l11, C2363j c2363j, int i10, InterfaceC6888p8 interfaceC6888p8, Locale locale, AbstractC1043k abstractC1043k) {
        this(l10, l11, c2363j, i10, interfaceC6888p8, locale);
    }
}
