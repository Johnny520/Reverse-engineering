package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: FC */
/* JADX INFO: loaded from: classes.dex */
public final class C0228FC extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f670e;

    /* JADX INFO: renamed from: f */
    public int f671f;

    public /* synthetic */ C0228FC(int r1, InterfaceC0190Eb r2) {
        this.f670e = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f670e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0228FC(1, r32).mo448i(C0829TC.f2620a);
    L7:
        return new C0228FC(0, r32).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r2, Object r3) {
        switch(this.f670e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0228FC(1, r2);
    L7:
        return new C0228FC(0, r2);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r6) {
        switch(this.f670e) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        int r0 = this.f671f;
        if (r0 == 0) goto L11;
        if (r0 != 1) goto L10;
        AbstractC0628Oj.m1232T(r6);     // Catch: Exception -> L18
    L16:
        C0183EA.f539a.getClass();     // Catch: Exception -> L18
        ArrayList r02 = C0183EA.f543e;     // Catch: Exception -> L18
        ArrayList r1 = C0183EA.m381i();     // Catch: Exception -> L18
        C0357IC r2 = C0357IC.f1218a;     // Catch: Exception -> L18
        List r03 = C0357IC.m790b(r2, (List) r6, r02, r1);     // Catch: Exception -> L18
        C0357IC.f1219b = r03;     // Catch: Exception -> L18
        AbstractC0295Gu.m625r(-808282780334133L);     // Catch: Exception -> L18
        AbstractC0295Gu.m625r(-808368679680053L);     // Catch: Exception -> L18
        r03.size();     // Catch: Exception -> L18
        AbstractC0295Gu.m625r(-808969975101493L);     // Catch: Exception -> L18
        C0357IC.m791c(r2);     // Catch: Exception -> L18
        return r03;
    L10:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-809116003989557L));
    L11:
        AbstractC0628Oj.m1232T(r6);
        C0357IC r62 = C0357IC.f1218a;     // Catch: Exception -> L18
        this.f671f = 1;     // Catch: Exception -> L18
        r6 = C0357IC.m789a(r62, this);     // Catch: Exception -> L18
        EnumC1453gc r04 = EnumC1453gc.f5148a;
        if (r6 != r04) goto L16;
        return r04;
    L18:
        AbstractC0295Gu.m625r(-808991449937973L);
        AbstractC0295Gu.m625r(-809077349283893L);
        return C0357IC.f1219b;
    L20:
        int r05 = this.f671f;
        if (r05 == 0) goto L27;
        if (r05 != 1) goto L26;
        AbstractC0628Oj.m1232T(r6);     // Catch: Exception -> L34
    L32:
        C0183EA.f539a.getClass();     // Catch: Exception -> L34
        ArrayList r06 = C0183EA.f543e;     // Catch: Exception -> L34
        ArrayList r12 = C0183EA.m381i();     // Catch: Exception -> L34
        C0357IC r22 = C0357IC.f1218a;     // Catch: Exception -> L34
        List r07 = C0357IC.m790b(r22, (List) r6, r06, r12);     // Catch: Exception -> L34
        C0357IC.f1219b = r07;     // Catch: Exception -> L34
        AbstractC0295Gu.m625r(-792412876175413L);     // Catch: Exception -> L34
        AbstractC0295Gu.m625r(-808441694124085L);     // Catch: Exception -> L34
        r07.size();     // Catch: Exception -> L34
        AbstractC0295Gu.m625r(-808463168960565L);     // Catch: Exception -> L34
        C0357IC.m791c(r22);     // Catch: Exception -> L34
        return r07;
    L26:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-808609197848629L));
    L27:
        AbstractC0628Oj.m1232T(r6);
        C0357IC r63 = C0357IC.f1218a;     // Catch: Exception -> L34
        this.f671f = 1;     // Catch: Exception -> L34
        r6 = C0357IC.m789a(r63, this);     // Catch: Exception -> L34
        EnumC1453gc r08 = EnumC1453gc.f5148a;
        if (r6 != r08) goto L32;
        return r08;
    L34:
        AbstractC0295Gu.m625r(-808484643797045L);
        AbstractC0295Gu.m625r(-808570543142965L);
        return C0452Kf.f1484a;
    }
}
