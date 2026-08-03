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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0518G(InterfaceC0522K interfaceC0522K) {
        super(0);
        this.f1462a = interfaceC0522K;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        InterfaceC0522K interfaceC0522K = this.f1462a;
        AbstractC0307g.m703e(interfaceC0522K, "<this>");
        ArrayList arrayList = new ArrayList();
        AbstractC0314n.f596a.getClass();
        Class clsMo696a = new C0303c(C0520I.class).mo696a();
        AbstractC0307g.m701c(clsMo696a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C0300d(clsMo696a));
        C0300d[] c0300dArr = (C0300d[]) arrayList.toArray(new C0300d[0]);
        AbstractC0307g.m703e((C0300d[]) Arrays.copyOf(c0300dArr, c0300dArr.length), "initializers");
        AbstractC0517F abstractC0517FMo1230c = interfaceC0522K.mo1230c();
        if (interfaceC0522K instanceof InterfaceC0531h) {
            ((InterfaceC0531h) interfaceC0522K).mo1229a();
            throw null;
        }
        C0297a c0297a = C0297a.f575b;
        AbstractC0307g.m703e(abstractC0517FMo1230c, "store");
        AbstractC0307g.m703e(c0297a, "defaultCreationExtras");
        abstractC0517FMo1230c.getClass();
        throw null;
    }
}
