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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0228FC(int i, InterfaceC0190Eb interfaceC0190Eb) {
        super(interfaceC0190Eb);
        this.f670e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f670e) {
            case 0:
                return new C0228FC(0, interfaceC0190Eb).mo448i(C0829TC.f2620a);
            default:
                return new C0228FC(1, interfaceC0190Eb).mo448i(C0829TC.f2620a);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f670e) {
            case 0:
                return new C0228FC(0, interfaceC0190Eb);
            default:
                return new C0228FC(1, interfaceC0190Eb);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        switch (this.f670e) {
            case 0:
                int i = this.f671f;
                try {
                    if (i == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0357IC c0357ic = C0357IC.f1218a;
                        this.f671f = 1;
                        obj = C0357IC.m789a(c0357ic, this);
                        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-808609197848629L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    C0183EA.f539a.getClass();
                    ArrayList arrayList = C0183EA.f543e;
                    ArrayList arrayListM381i = C0183EA.m381i();
                    C0357IC c0357ic2 = C0357IC.f1218a;
                    List listM790b = C0357IC.m790b(c0357ic2, (List) obj, arrayList, arrayListM381i);
                    C0357IC.f1219b = listM790b;
                    AbstractC0295Gu.m625r(-792412876175413L);
                    AbstractC0295Gu.m625r(-808441694124085L);
                    listM790b.size();
                    AbstractC0295Gu.m625r(-808463168960565L);
                    C0357IC.m791c(c0357ic2);
                    return listM790b;
                } catch (Exception unused) {
                    AbstractC0295Gu.m625r(-808484643797045L);
                    AbstractC0295Gu.m625r(-808570543142965L);
                    return C0452Kf.f1484a;
                }
            default:
                int i2 = this.f671f;
                try {
                    if (i2 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0357IC c0357ic3 = C0357IC.f1218a;
                        this.f671f = 1;
                        obj = C0357IC.m789a(c0357ic3, this);
                        EnumC1453gc enumC1453gc2 = EnumC1453gc.f5148a;
                        if (obj == enumC1453gc2) {
                            return enumC1453gc2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-809116003989557L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    C0183EA.f539a.getClass();
                    ArrayList arrayList2 = C0183EA.f543e;
                    ArrayList arrayListM381i2 = C0183EA.m381i();
                    C0357IC c0357ic4 = C0357IC.f1218a;
                    List listM790b2 = C0357IC.m790b(c0357ic4, (List) obj, arrayList2, arrayListM381i2);
                    C0357IC.f1219b = listM790b2;
                    AbstractC0295Gu.m625r(-808282780334133L);
                    AbstractC0295Gu.m625r(-808368679680053L);
                    listM790b2.size();
                    AbstractC0295Gu.m625r(-808969975101493L);
                    C0357IC.m791c(c0357ic4);
                    return listM790b2;
                } catch (Exception unused2) {
                    AbstractC0295Gu.m625r(-808991449937973L);
                    AbstractC0295Gu.m625r(-809077349283893L);
                    return C0357IC.f1219b;
                }
        }
    }
}
