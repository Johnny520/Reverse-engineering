package Yue;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C3021 implements InterfaceC8533 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final ByteChannel f4392;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public C3021(ByteChannel byteChannel) {
        this.f4392 = byteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4392.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f4392.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f4392.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f4392.write(byteBuffer);
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean mo5923() {
        ByteChannel byteChannel = this.f4392;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof InterfaceC8533) {
            return ((InterfaceC8533) byteChannel).mo5923();
        }
        return false;
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public void mo5924() throws IOException {
        ByteChannel byteChannel = this.f4392;
        if (byteChannel instanceof InterfaceC8533) {
            ((InterfaceC8533) byteChannel).mo5924();
        }
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public int mo5925(ByteBuffer byteBuffer) throws IOException {
        ByteChannel byteChannel = this.f4392;
        if (byteChannel instanceof InterfaceC8533) {
            return ((InterfaceC8533) byteChannel).mo5925(byteBuffer);
        }
        return 0;
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean mo5926() {
        ByteChannel byteChannel = this.f4392;
        return (byteChannel instanceof InterfaceC8533) && ((InterfaceC8533) byteChannel).mo5926();
    }

    @Override // Yue.InterfaceC8533
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public boolean mo5927() {
        ByteChannel byteChannel = this.f4392;
        return (byteChannel instanceof InterfaceC8533) && ((InterfaceC8533) byteChannel).mo5927();
    }

    @Deprecated
    public C3021(InterfaceC8533 interfaceC8533) {
        this.f4392 = interfaceC8533;
    }
}
