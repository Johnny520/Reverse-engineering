package p125i7;

import p034c7.InterfaceC1359d;
import p086ff.AbstractC2438f;
import p086ff.InterfaceC2436d;
import p108h7.C2893d;
import p108h7.InterfaceC2890a;

/* JADX INFO: renamed from: i7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3204c {

    /* JADX INFO: renamed from: a */
    public ClassLoader f8526a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2436d f8527b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2890a f8528c;

    public C3204c() {
        ClassLoader classLoader = C3204c.class.getClassLoader();
        classLoader.getClass();
        this.f8526a = classLoader;
        InterfaceC2436d interfaceC2436dM8840l = AbstractC2438f.m8840l("io.ktor.server.Application");
        interfaceC2436dM8840l.getClass();
        this.f8527b = interfaceC2436dM8840l;
        this.f8528c = new C2893d();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1359d m12159a() {
        return new C3208e(this.f8526a, this.f8527b, this.f8528c, null, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m12160b(InterfaceC2436d interfaceC2436d) {
        interfaceC2436d.getClass();
        this.f8527b = interfaceC2436d;
    }
}
