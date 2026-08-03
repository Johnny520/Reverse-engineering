package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2400q6 implements InterfaceC2713xc, InterfaceC0835Tc, InterfaceC2558tt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8411a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f8412b;

    public C2400q6(int r1, ByteBuffer r2) {
        this.f8411a = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.f8412b = r2;
        return;
    L6:
        this.f8412b = r2;
        r2.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // p000.InterfaceC2558tt
    /* JADX INFO: renamed from: a */
    public void mo1334a(byte[] r4, Object r5, MessageDigest r6) {
        switch(this.f8411a) {
            case 2: goto L15;
            default: goto L4;
        };
    L4:
        Integer r52 = (Integer) r5;
        if (r52 == null) goto L27;
        r6.update(r4);
        ByteBuffer r0 = this.f8412b;
        monitor-enter(r0);
        this.f8412b.position(0);     // Catch: Throwable -> L12
        r6.update(this.f8412b.putInt(r52.intValue()).array());     // Catch: Throwable -> L12
        monitor-exit(r0);     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    L27:
        return;
    L15:
        Long r53 = (Long) r5;
        r6.update(r4);
        ByteBuffer r42 = this.f8412b;
        monitor-enter(r42);
        this.f8412b.position(0);     // Catch: Throwable -> L20
        r6.update(this.f8412b.putLong(r53.longValue()).array());     // Catch: Throwable -> L20
        monitor-exit(r42);     // Catch: Throwable -> L20
        return;
    L20:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: c */
    public void mo232c() {
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: f */
    public short mo234f() {
        ByteBuffer r0 = this.f8412b;
        if (r0.remaining() < 1) goto L7;
        return (short) (r0.get() & 255);
    L7:
        throw new C0792Sc();
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: h */
    public int mo236h() {
        return (mo234f() << 8) | mo234f();
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: j */
    public Object mo237j() {
        ByteBuffer r1 = this.f8412b;
        r1.position(0);
        return r1;
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: l */
    public int mo239l(int r3, byte[] r4) {
        ByteBuffer r0 = this.f8412b;
        int r32 = Math.min(r3, r0.remaining());
        if (r32 != 0) goto L6;
        return -1;
    L6:
        r0.get(r4, 0, r32);
        return r32;
    }

    @Override // p000.InterfaceC0835Tc
    public long skip(long r4) {
        ByteBuffer r0 = this.f8412b;
        int r42 = (int) Math.min(r0.remaining(), r4);
        r0.position(r0.position() + r42);
        return r42;
    }

    public C2400q6(int r1) {
        this.f8411a = r1;
        switch(r1) {
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        this.f8412b = ByteBuffer.allocate(8);
        return;
    L6:
        this.f8412b = ByteBuffer.allocate(4);
    }
}
