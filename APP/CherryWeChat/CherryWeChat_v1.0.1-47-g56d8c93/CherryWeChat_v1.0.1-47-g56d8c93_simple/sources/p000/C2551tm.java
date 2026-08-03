package p000;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: tm */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2551tm extends AbstractC2376pj implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r3, Object r4) {
        InterfaceC0126Cx r32 = (InterfaceC0126Cx) r3;
        int r42 = ((Number) r4).intValue();
        C2594um r0 = (C2594um) this.f652b;
        r0.getClass();
        if (r32.mo211k(r42) == false) goto L5;
    L7:
        boolean r33 = false;
    L8:
        r0.f8971b = r33;
        return Boolean.valueOf(r33);
    L5:
        if (r32.mo210j(r42).mo208h() == false) goto L7;
        r33 = true;
        goto L8
    }
}
