package be;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import p083fe.C1214a;
import p152k7.AbstractC2331a;
import p215od.C3130c;
import p233pd.C3399j;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p257r7.InterfaceC3723m;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: be.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0293m implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f852b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f853c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0293m(Object obj, int i9, Object obj2) {
        this.f851a = i9;
        this.f852b = obj;
        this.f853c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f851a) {
            case 0:
                EnumC3400k enumC3400k = (EnumC3400k) this.f852b;
                Set set = (Set) this.f853c;
                C4320p c4320p = (C4320p) obj;
                if (c4320p.f14396k == enumC3400k && set.contains((C3130c) ((C3399j) c4320p).f10948o)) {
                    return Boolean.TRUE;
                }
                return null;
            case 1:
                C1214a c1214a = (C1214a) this.f852b;
                C4322r c4322r = (C4322r) this.f853c;
                AbstractC3506j abstractC3506j = (AbstractC3506j) obj;
                c1214a.getClass();
                C1214a.m3335c(c4322r, abstractC3506j);
                return abstractC3506j;
            case 2:
                Class cls = (Class) this.f852b;
                Predicate predicate = (Predicate) this.f853c;
                AbstractC2331a abstractC2331aMo7733d = ((InterfaceC3723m) obj).mo7733d(cls);
                if (abstractC2331aMo7733d == null || !(predicate == null || predicate.test(abstractC2331aMo7733d))) {
                    return null;
                }
                return abstractC2331aMo7733d;
            default:
                AbstractC3506j abstractC3506j2 = (AbstractC3506j) obj;
                AbstractC3506j abstractC3506jM3346m = ((C1214a) this.f852b).m3346m(abstractC3506j2, (Map) this.f853c);
                return abstractC3506jM3346m == null ? abstractC3506j2 : abstractC3506jM3346m;
        }
    }
}
