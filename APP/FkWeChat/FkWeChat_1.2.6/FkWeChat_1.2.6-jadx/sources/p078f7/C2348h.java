package p078f7;

import ec.InterfaceC2165o0;
import ec.InterfaceC2196w;
import io.ktor.utils.p131io.InterfaceC3468g;
import io.ktor.utils.p131io.InterfaceC3473k;
import java.net.SocketAddress;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: f7.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2348h implements InterfaceC2165o0 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5980j f6453q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC3468g f6454r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3473k f6455s;

    /* JADX INFO: renamed from: t */
    public final SocketAddress f6456t;

    /* JADX INFO: renamed from: u */
    public final SocketAddress f6457u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC2196w f6458v;

    public C2348h(InterfaceC5980j interfaceC5980j, InterfaceC3468g interfaceC3468g, InterfaceC3473k interfaceC3473k, SocketAddress socketAddress, SocketAddress socketAddress2, InterfaceC2196w interfaceC2196w) {
        interfaceC5980j.getClass();
        interfaceC3468g.getClass();
        interfaceC3473k.getClass();
        this.f6453q = interfaceC5980j;
        this.f6454r = interfaceC3468g;
        this.f6455s = interfaceC3473k;
        this.f6456t = socketAddress;
        this.f6457u = socketAddress2;
        this.f6458v = interfaceC2196w;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3468g m8527a() {
        return this.f6454r;
    }

    /* JADX INFO: renamed from: b */
    public final SocketAddress m8528b() {
        return this.f6457u;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3473k m8529c() {
        return this.f6455s;
    }

    /* JADX INFO: renamed from: f */
    public final SocketAddress m8530f() {
        return this.f6456t;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2196w m8531g() {
        return this.f6458v;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f6453q;
    }
}
