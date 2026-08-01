package io.ktor.network.sockets;

import io.ktor.network.sockets.AbstractC3447y;
import io.ktor.utils.p131io.C3456a;
import io.ktor.utils.p131io.C3461c0;
import io.ktor.utils.p131io.C3467f0;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import p097g8.InterfaceC2546e;
import p228p8.C5981k;
import p339x6.InterfaceC9457j;

/* JADX INFO: renamed from: io.ktor.network.sockets.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3438p extends AbstractC3444v implements InterfaceC3425d, InterfaceC3423c, InterfaceC3427e {

    /* JADX INFO: renamed from: A */
    public final InterfaceC9457j f9481A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC2546e f9482B;

    /* JADX INFO: renamed from: z */
    public final SelectableChannel f9483z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3438p(SelectableChannel selectableChannel, InterfaceC9457j interfaceC9457j, InterfaceC2546e interfaceC2546e, AbstractC3447y.e eVar) {
        super(C5981k.f18917q);
        selectableChannel.getClass();
        interfaceC9457j.getClass();
        this.f9483z = selectableChannel;
        this.f9481A = interfaceC9457j;
        this.f9482B = interfaceC2546e;
    }

    @Override // io.ktor.network.sockets.AbstractC3444v
    /* JADX INFO: renamed from: G */
    public final C3461c0 mo12829G(C3456a c3456a) {
        c3456a.getClass();
        return AbstractC3433k.m12817a(this, c3456a, (WritableByteChannel) mo12830Z(), this, this.f9481A, null);
    }

    @Override // p339x6.InterfaceC9455h
    /* JADX INFO: renamed from: Z */
    public abstract SelectableChannel mo12830Z();

    @Override // io.ktor.network.sockets.AbstractC3444v
    /* JADX INFO: renamed from: q */
    public Throwable mo12831q() {
        try {
            mo12830Z().close();
            super.close();
            this.f9481A.mo36806A(this);
            return null;
        } catch (Throwable th) {
            this.f9481A.mo36806A(this);
            return th;
        }
    }

    @Override // io.ktor.network.sockets.AbstractC3444v
    /* JADX INFO: renamed from: t */
    public final C3467f0 mo12832t(C3456a c3456a) {
        c3456a.getClass();
        return this.f9482B != null ? AbstractC3431i.m12812e(this, c3456a, (ReadableByteChannel) mo12830Z(), this, this.f9481A, this.f9482B, null) : AbstractC3431i.m12811d(this, c3456a, (ReadableByteChannel) mo12830Z(), this, this.f9481A, null);
    }
}
