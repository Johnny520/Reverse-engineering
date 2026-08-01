package p125i7;

import p024b9.AbstractC1043k;
import p034c7.InterfaceC1359d;
import p086ff.InterfaceC2436d;
import p108h7.InterfaceC2890a;
import p270s6.C7193c;

/* JADX INFO: renamed from: i7.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3208e implements InterfaceC1359d {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f8586a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2436d f8587b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2890a f8588c;

    /* JADX INFO: renamed from: d */
    public final C7193c f8589d;

    public C3208e(ClassLoader classLoader, InterfaceC2436d interfaceC2436d, InterfaceC2890a interfaceC2890a, C7193c c7193c) {
        classLoader.getClass();
        interfaceC2436d.getClass();
        interfaceC2890a.getClass();
        c7193c.getClass();
        this.f8586a = classLoader;
        this.f8587b = interfaceC2436d;
        this.f8588c = interfaceC2890a;
        this.f8589d = c7193c;
    }

    @Override // p034c7.InterfaceC1359d
    /* JADX INFO: renamed from: a */
    public InterfaceC2890a mo5385a() {
        return this.f8588c;
    }

    @Override // p034c7.InterfaceC1359d
    /* JADX INFO: renamed from: b */
    public C7193c mo5386b() {
        return this.f8589d;
    }

    @Override // p034c7.InterfaceC1359d
    /* JADX INFO: renamed from: c */
    public InterfaceC2436d mo5387c() {
        return this.f8587b;
    }

    @Override // p034c7.InterfaceC1359d
    public ClassLoader getClassLoader() {
        return this.f8586a;
    }

    public /* synthetic */ C3208e(ClassLoader classLoader, InterfaceC2436d interfaceC2436d, InterfaceC2890a interfaceC2890a, C7193c c7193c, int i10, AbstractC1043k abstractC1043k) {
        this(classLoader, interfaceC2436d, interfaceC2890a, (i10 & 8) != 0 ? new C7193c() : c7193c);
    }
}
