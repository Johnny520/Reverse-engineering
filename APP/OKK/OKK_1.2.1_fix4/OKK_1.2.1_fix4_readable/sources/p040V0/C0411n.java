package p040V0;

import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0306f;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: V0.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0411n extends AbstractC0306f implements InterfaceC0286l {

    /* JADX INFO: renamed from: i */
    public static final C0411n f911i = new C0411n(InterfaceC0405h.class, "iterator", "iterator()Ljava/util/Iterator;");

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        InterfaceC0405h interfaceC0405h = (InterfaceC0405h) obj;
        AbstractC0307g.m703e(interfaceC0405h, "p0");
        return interfaceC0405h.iterator();
    }
}
