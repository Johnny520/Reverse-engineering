package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: tm */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2551tm extends AbstractC2376pj implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC0126Cx interfaceC0126Cx = (InterfaceC0126Cx) obj;
        int iIntValue = ((Number) obj2).intValue();
        C2594um c2594um = (C2594um) this.f652b;
        c2594um.getClass();
        boolean z = !interfaceC0126Cx.mo211k(iIntValue) && interfaceC0126Cx.mo210j(iIntValue).mo208h();
        c2594um.f8971b = z;
        return Boolean.valueOf(z);
    }
}
