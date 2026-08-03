package p040V0;

import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0306f;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: V0.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0411n extends AbstractC0306f implements InterfaceC0286l {

    /* JADX INFO: renamed from: i */
    public static final C0411n f911i = null;

    static {
        f911i = new C0411n(InterfaceC0405h.class, "iterator", "iterator()Ljava/util/Iterator;");
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r2) {
        InterfaceC0405h r22 = (InterfaceC0405h) r2;
        AbstractC0307g.m703e(r22, "p0");
        return r22.iterator();
    }
}
