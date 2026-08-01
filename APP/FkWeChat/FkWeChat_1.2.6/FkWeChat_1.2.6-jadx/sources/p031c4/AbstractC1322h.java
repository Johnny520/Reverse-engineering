package p031c4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p044d4.C1874b;
import p376zd.C10023w;

/* JADX INFO: renamed from: c4.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1322h {

    /* JADX INFO: renamed from: c4.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements c {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f3956a;

        public a(ByteBuffer byteBuffer) {
            this.f3956a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p031c4.AbstractC1322h.c
        /* JADX INFO: renamed from: a */
        public int mo5309a() {
            return this.f3956a.getInt();
        }

        @Override // p031c4.AbstractC1322h.c
        /* JADX INFO: renamed from: b */
        public void mo5310b(int i10) {
            ByteBuffer byteBuffer = this.f3956a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // p031c4.AbstractC1322h.c
        /* JADX INFO: renamed from: c */
        public long mo5311c() {
            return AbstractC1322h.m5307c(this.f3956a.getInt());
        }

        @Override // p031c4.AbstractC1322h.c
        public long getPosition() {
            return this.f3956a.position();
        }

        @Override // p031c4.AbstractC1322h.c
        public int readUnsignedShort() {
            return AbstractC1322h.m5308d(this.f3956a.getShort());
        }
    }

    /* JADX INFO: renamed from: c4.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final long f3957a;

        /* JADX INFO: renamed from: b */
        public final long f3958b;

        public b(long j10, long j11) {
            this.f3957a = j10;
            this.f3958b = j11;
        }

        /* JADX INFO: renamed from: a */
        public long m5312a() {
            return this.f3957a;
        }
    }

    /* JADX INFO: renamed from: c4.h$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {
        /* JADX INFO: renamed from: a */
        int mo5309a();

        /* JADX INFO: renamed from: b */
        void mo5310b(int i10);

        /* JADX INFO: renamed from: c */
        long mo5311c();

        long getPosition();

        int readUnsignedShort();
    }

    /* JADX INFO: renamed from: a */
    public static b m5305a(c cVar) throws IOException {
        long jMo5311c;
        cVar.mo5310b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            C10023w.m38841a("Cannot read metadata.");
            return null;
        }
        cVar.mo5310b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jMo5311c = -1;
                break;
            }
            int iMo5309a = cVar.mo5309a();
            cVar.mo5310b(4);
            jMo5311c = cVar.mo5311c();
            cVar.mo5310b(4);
            if (1835365473 == iMo5309a) {
                break;
            }
            i10++;
        }
        if (jMo5311c != -1) {
            cVar.mo5310b((int) (jMo5311c - cVar.getPosition()));
            cVar.mo5310b(12);
            long jMo5311c2 = cVar.mo5311c();
            for (int i11 = 0; i11 < jMo5311c2; i11++) {
                int iMo5309a2 = cVar.mo5309a();
                long jMo5311c3 = cVar.mo5311c();
                long jMo5311c4 = cVar.mo5311c();
                if (1164798569 == iMo5309a2 || 1701669481 == iMo5309a2) {
                    return new b(jMo5311c3 + jMo5311c, jMo5311c4);
                }
            }
        }
        C10023w.m38841a("Cannot read metadata.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C1874b m5306b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m5305a(new a(byteBufferDuplicate)).m5312a());
        return C1874b.m6646h(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: c */
    public static long m5307c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    /* JADX INFO: renamed from: d */
    public static int m5308d(short s10) {
        return s10 & 65535;
    }
}
