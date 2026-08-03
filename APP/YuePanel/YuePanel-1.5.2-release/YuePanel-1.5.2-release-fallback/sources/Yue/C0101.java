package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class C0101 implements Yue.InterfaceC7132 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.nio.channels.ByteChannel f192;

    @java.lang.Deprecated
    public C0101(Yue.InterfaceC7132 r1) {
            r0 = this;
            r0.<init>()
            r0.f192 = r1
            return
    }

    @java.lang.Deprecated
    public C0101(java.nio.channels.ByteChannel r1) {
            r0 = this;
            r0.<init>()
            r0.f192 = r1
            return
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.ByteChannel r0 = r1.f192
            r0.close()
            return
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            java.nio.channels.ByteChannel r0 = r1.f192
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.ByteChannel r0 = r1.f192
            int r2 = r0.read(r2)
            return r2
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.ByteChannel r0 = r1.f192
            int r2 = r0.write(r2)
            return r2
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean mo564() {
            r2 = this;
            java.nio.channels.ByteChannel r0 = r2.f192
            boolean r1 = r0 instanceof java.nio.channels.SocketChannel
            if (r1 == 0) goto Ld
            java.nio.channels.SocketChannel r0 = (java.nio.channels.SocketChannel) r0
            boolean r0 = r0.isBlocking()
            return r0
        Ld:
            boolean r1 = r0 instanceof Yue.InterfaceC7132
            if (r1 == 0) goto L18
            Yue.ۥۢۦ۠ r0 = (Yue.InterfaceC7132) r0
            boolean r0 = r0.mo564()
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public void mo565() throws java.io.IOException {
            r2 = this;
            java.nio.channels.ByteChannel r0 = r2.f192
            boolean r1 = r0 instanceof Yue.InterfaceC7132
            if (r1 == 0) goto Lb
            Yue.ۥۢۦ۠ r0 = (Yue.InterfaceC7132) r0
            r0.mo565()
        Lb:
            return
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public int mo566(java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
            java.nio.channels.ByteChannel r0 = r2.f192
            boolean r1 = r0 instanceof Yue.InterfaceC7132
            if (r1 == 0) goto Ld
            Yue.ۥۢۦ۠ r0 = (Yue.InterfaceC7132) r0
            int r3 = r0.mo566(r3)
            goto Le
        Ld:
            r3 = 0
        Le:
            return r3
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean mo567() {
            r2 = this;
            java.nio.channels.ByteChannel r0 = r2.f192
            boolean r1 = r0 instanceof Yue.InterfaceC7132
            if (r1 == 0) goto L10
            Yue.ۥۢۦ۠ r0 = (Yue.InterfaceC7132) r0
            boolean r0 = r0.mo567()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public boolean mo568() {
            r2 = this;
            java.nio.channels.ByteChannel r0 = r2.f192
            boolean r1 = r0 instanceof Yue.InterfaceC7132
            if (r1 == 0) goto L10
            Yue.ۥۢۦ۠ r0 = (Yue.InterfaceC7132) r0
            boolean r0 = r0.mo568()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }
}
