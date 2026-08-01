package p125i7;

import ec.C2161n0;
import ec.InterfaceC2153l0;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p086ff.InterfaceC2436d;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: i7.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3244w implements InterfaceC2153l0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0173a f8759q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3244w(final InterfaceC2436d interfaceC2436d) {
        this(new InterfaceC0173a() { // from class: i7.v
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3244w.m12333a(interfaceC2436d);
            }
        });
        interfaceC2436d.getClass();
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC2153l0.a.m7827c(this, cVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC2153l0.a.m7828d(this, interfaceC5980j);
    }

    @Override // p228p8.InterfaceC5980j.b
    public InterfaceC5980j.c getKey() {
        return InterfaceC2153l0.f5982f;
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC2153l0.a.m7826b(this, cVar);
    }

    @Override // ec.InterfaceC2153l0
    /* JADX INFO: renamed from: j0 */
    public void mo167j0(InterfaceC5980j interfaceC5980j, Throwable th) {
        interfaceC5980j.getClass();
        th.getClass();
        if ((th instanceof CancellationException) || (th instanceof IOException)) {
            return;
        }
        Object string = (C2161n0) interfaceC5980j.mo1654h(C2161n0.f5988s);
        if (string == null) {
            string = interfaceC5980j.toString();
        }
        ((InterfaceC2436d) this.f8759q.invoke()).mo8808f("Unhandled exception caught for " + string, th);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC2153l0.a.m7825a(this, obj, interfaceC0188p);
    }

    public C3244w(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        this.f8759q = interfaceC0173a;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2436d m12333a(InterfaceC2436d interfaceC2436d) {
        return interfaceC2436d;
    }
}
