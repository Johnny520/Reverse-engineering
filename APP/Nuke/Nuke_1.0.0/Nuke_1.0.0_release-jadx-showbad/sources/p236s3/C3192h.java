package p236s3;

import p117X2.AbstractC1665j;
import p214o3.InterfaceC2798a;
import p225q3.C2931b;
import p225q3.InterfaceC2933d;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;

/* JADX INFO: renamed from: s3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3192h implements InterfaceC2798a {

    /* JADX INFO: renamed from: a */
    public static final C3192h f9948a = new C3192h();

    /* JADX INFO: renamed from: b */
    public static final C3198n f9949b = new C3198n("kotlin.Long", C2931b.f9252j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public final Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        return Long.valueOf(interfaceC3152b.mo5423b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public final void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        interfaceC3153c.mo5184h(((Number) obj).longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: e */
    public final InterfaceC2933d mo1486e() {
        return f9949b;
    }
}
