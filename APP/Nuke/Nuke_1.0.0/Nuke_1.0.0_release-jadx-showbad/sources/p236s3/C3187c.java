package p236s3;

import p117X2.AbstractC1665j;
import p214o3.InterfaceC2798a;
import p225q3.C2931b;
import p225q3.InterfaceC2933d;
import p231r3.InterfaceC3152b;
import p231r3.InterfaceC3153c;

/* JADX INFO: renamed from: s3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3187c implements InterfaceC2798a {

    /* JADX INFO: renamed from: a */
    public static final C3187c f9939a = new C3187c();

    /* JADX INFO: renamed from: b */
    public static final C3198n f9940b = new C3198n("kotlin.Boolean", C2931b.f9250h);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: b */
    public final Object mo1483b(InterfaceC3152b interfaceC3152b) {
        AbstractC1665j.m2985e(interfaceC3152b, "decoder");
        return Boolean.valueOf(interfaceC3152b.mo5424c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: c */
    public final void mo1484c(InterfaceC3153c interfaceC3153c, Object obj) {
        interfaceC3153c.mo5182f(((Boolean) obj).booleanValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214o3.InterfaceC2798a
    /* JADX INFO: renamed from: e */
    public final InterfaceC2933d mo1486e() {
        return f9940b;
    }
}
