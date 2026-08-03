package p050c0;

import java.util.function.Predicate;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.z1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0715z1 implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0286l f2249a;

    public /* synthetic */ C0715z1(C0712y1 r1) {
        this.f2249a = r1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object r3) {
        InterfaceC0286l r1 = this.f2249a;
        AbstractC0307g.m703e(r1, "$tmp0");
        return ((Boolean) r1.invoke(r3)).booleanValue();
    }
}
