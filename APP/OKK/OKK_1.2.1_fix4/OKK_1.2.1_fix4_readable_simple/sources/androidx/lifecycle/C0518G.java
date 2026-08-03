package androidx.lifecycle;

import java.util.ArrayList;
import java.util.Arrays;
import p029P0.InterfaceC0275a;
import p030Q.C0297a;
import p030Q.C0300d;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p031Q0.AbstractC0314n;
import p031Q0.C0303c;

/* JADX INFO: renamed from: androidx.lifecycle.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0518G extends AbstractC0308h implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0522K f1462a;

    public C0518G(InterfaceC0522K r1) {
        this.f1462a = r1;
        super(0);
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        InterfaceC0522K r1 = this.f1462a;
        AbstractC0307g.m703e(r1, "<this>");
        ArrayList r02 = new ArrayList();
        AbstractC0314n.f596a.getClass();
        Class r2 = new C0303c(C0520I.class).mo696a();
        AbstractC0307g.m701c(r2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        r02.add(new C0300d(r2));
        C0300d[] r03 = (C0300d[]) r02.toArray(new C0300d[0]);
        AbstractC0307g.m703e((C0300d[]) Arrays.copyOf(r03, r03.length), "initializers");
        AbstractC0517F r04 = r1.mo1230c();
        if ((r1 instanceof InterfaceC0531h) == true) goto L6;
        C0297a r12 = C0297a.f575b;
        AbstractC0307g.m703e(r04, "store");
        AbstractC0307g.m703e(r12, "defaultCreationExtras");
        r04.getClass();
        throw null;
    L6:
        ((InterfaceC0531h) r1).mo1229a();
        throw null;
    }
}
