package Yue;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4302 extends Socket {

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۢۨ$ۥ */
    public static class C0376 extends SocketImpl {
        public C0376(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
            ((SocketImpl) this).localport = datagramSocket.getLocalPort();
            ((SocketImpl) this).fd = fileDescriptor;
        }

        @Override // java.net.SocketImpl
        public void accept(SocketImpl socketImpl) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public int available() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void bind(InetAddress inetAddress, int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void close() throws IOException {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.net.SocketImpl
        public void connect(String str, int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void create(boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public InputStream getInputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public Object getOption(int i) throws SocketException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public OutputStream getOutputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void listen(int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void sendUrgentData(int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public void setOption(int i, Object obj) throws SocketException {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.net.SocketImpl
        public void connect(InetAddress inetAddress, int i) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void connect(SocketAddress socketAddress, int i) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public C4302(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) throws SocketException {
        super(new C0376(datagramSocket, fileDescriptor));
    }
}
