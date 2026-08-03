package Yue;

import Yue.InterfaceC7144;
import android.content.res.AssetManager;
import com.google.flatbuffers.reflection.AdvancedFeatures;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC3262
@InterfaceC7113(19)
public class C6214 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1907 = 1164798569;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1908 = 1701669481;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f15306 = 1835365473;

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ */
    public static class C0942 implements InterfaceC6216 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final ByteBuffer f15307;

        public C0942(@InterfaceC6391 ByteBuffer byteBuffer) {
            this.f15307 = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // Yue.C6214.InterfaceC6216
        public long getPosition() {
            return this.f15307.position();
        }

        @Override // Yue.C6214.InterfaceC6216
        public int readUnsignedShort() throws IOException {
            return C6214.m19177(this.f15307.getShort());
        }

        @Override // Yue.C6214.InterfaceC6216
        /* JADX INFO: renamed from: ۥ */
        public int mo2709() throws IOException {
            return this.f15307.getInt();
        }

        @Override // Yue.C6214.InterfaceC6216
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2710(int i) throws IOException {
            ByteBuffer byteBuffer = this.f15307;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // Yue.C6214.InterfaceC6216
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long mo19178() throws IOException {
            return C6214.m19176(this.f15307.getInt());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ۟ */
    public static class C0943 implements InterfaceC6216 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final byte[] f15308;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final ByteBuffer f15309;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6391
        public final InputStream f15310;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public long f15311 = 0;

        public C0943(@InterfaceC6391 InputStream inputStream) {
            this.f15310 = inputStream;
            byte[] bArr = new byte[4];
            this.f15308 = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f15309 = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // Yue.C6214.InterfaceC6216
        public long getPosition() {
            return this.f15311;
        }

        @Override // Yue.C6214.InterfaceC6216
        public int readUnsignedShort() throws IOException {
            this.f15309.position(0);
            m19179(2);
            return C6214.m19177(this.f15309.getShort());
        }

        @Override // Yue.C6214.InterfaceC6216
        /* JADX INFO: renamed from: ۥ */
        public int mo2709() throws IOException {
            this.f15309.position(0);
            m19179(4);
            return this.f15309.getInt();
        }

        @Override // Yue.C6214.InterfaceC6216
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2710(int i) throws IOException {
            while (i > 0) {
                int iSkip = (int) this.f15310.skip(i);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i -= iSkip;
                this.f15311 += (long) iSkip;
            }
        }

        @Override // Yue.C6214.InterfaceC6216
        /* JADX INFO: renamed from: ۥ۟۟ */
        public long mo19178() throws IOException {
            this.f15309.position(0);
            m19179(4);
            return C6214.m19176(this.f15309.getInt());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m19179(@InterfaceC5459(from = 0, m2228to = AdvancedFeatures.OptionalScalars) int i) throws IOException {
            if (this.f15310.read(this.f15308, 0, i) != i) {
                throw new IOException("read failed");
            }
            this.f15311 += (long) i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C6215 {

        /* JADX INFO: renamed from: ۥ */
        public final long f1909;

        /* JADX INFO: renamed from: ۥ۟ */
        public final long f1910;

        public C6215(long j, long j2) {
            this.f1909 = j;
            this.f1910 = j2;
        }

        /* JADX INFO: renamed from: ۥ */
        public long m2711() {
            return this.f1910;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public long m2712() {
            return this.f1909;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC6216 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f1911 = 2;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f1912 = 4;

        long getPosition();

        int readUnsignedShort() throws IOException;

        /* JADX INFO: renamed from: ۥ */
        int mo2709() throws IOException;

        /* JADX INFO: renamed from: ۥ۟ */
        void mo2710(int i) throws IOException;

        /* JADX INFO: renamed from: ۥ۟۟ */
        long mo19178() throws IOException;
    }

    /* JADX INFO: renamed from: ۥ */
    public static C6215 m2707(InterfaceC6216 interfaceC6216) throws IOException {
        long jMo19178;
        interfaceC6216.mo2710(4);
        int unsignedShort = interfaceC6216.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        interfaceC6216.mo2710(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jMo19178 = -1;
                break;
            }
            int iMo2709 = interfaceC6216.mo2709();
            interfaceC6216.mo2710(4);
            jMo19178 = interfaceC6216.mo19178();
            interfaceC6216.mo2710(4);
            if (1835365473 == iMo2709) {
                break;
            }
            i++;
        }
        if (jMo19178 != -1) {
            interfaceC6216.mo2710((int) (jMo19178 - interfaceC6216.getPosition()));
            interfaceC6216.mo2710(12);
            long jMo191782 = interfaceC6216.mo19178();
            for (int i2 = 0; i2 < jMo191782; i2++) {
                int iMo27092 = interfaceC6216.mo2709();
                long jMo191783 = interfaceC6216.mo19178();
                long jMo191784 = interfaceC6216.mo19178();
                if (1164798569 == iMo27092 || 1701669481 == iMo27092) {
                    return new C6215(jMo191783 + jMo19178, jMo191784);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C6213 m2708(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str);
        try {
            C6213 c6213M19174 = m19174(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return c6213M19174;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C6213 m19174(InputStream inputStream) throws IOException {
        C0943 c0943 = new C0943(inputStream);
        C6215 c6215M2707 = m2707(c0943);
        c0943.mo2710((int) (c6215M2707.m2712() - c0943.getPosition()));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) c6215M2707.m2711());
        int i = inputStream.read(byteBufferAllocate.array());
        if (i == c6215M2707.m2711()) {
            return C6213.m19156(byteBufferAllocate);
        }
        throw new IOException("Needed " + c6215M2707.m2711() + " bytes, got " + i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C6213 m19175(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m2707(new C0942(byteBufferDuplicate)).m2712());
        return C6213.m19156(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m19176(int i) {
        return ((long) i) & C8578.f25466;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m19177(short s) {
        return s & C8080.f23970;
    }
}
