package p322w5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: w5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9187b {

    /* JADX INFO: renamed from: a */
    public int f31404a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f31405b;

    /* JADX INFO: renamed from: c */
    public int f31406c;

    /* JADX INFO: renamed from: d */
    public int f31407d;

    /* JADX INFO: renamed from: e */
    public AbstractC9188c f31408e = AbstractC9188c.m35794d();

    /* JADX INFO: renamed from: b */
    public static int m35783b(int i10, ByteBuffer byteBuffer) {
        return i10 + byteBuffer.getInt(i10);
    }

    /* JADX INFO: renamed from: f */
    public static String m35784f(int i10, ByteBuffer byteBuffer, AbstractC9188c abstractC9188c) {
        int i11 = i10 + byteBuffer.getInt(i10);
        return abstractC9188c.mo35795a(byteBuffer, i11 + 4, byteBuffer.getInt(i11));
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC9187b m35785h(AbstractC9187b abstractC9187b, int i10, ByteBuffer byteBuffer) {
        abstractC9187b.m35788d(m35783b(i10, byteBuffer), byteBuffer);
        return abstractC9187b;
    }

    /* JADX INFO: renamed from: a */
    public int m35786a(int i10) {
        return i10 + this.f31405b.getInt(i10);
    }

    /* JADX INFO: renamed from: c */
    public int m35787c(int i10) {
        if (i10 < this.f31407d) {
            return this.f31405b.getShort(this.f31406c + i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m35788d(int i10, ByteBuffer byteBuffer) {
        this.f31405b = byteBuffer;
        if (byteBuffer == null) {
            this.f31404a = 0;
            this.f31406c = 0;
            this.f31407d = 0;
        } else {
            this.f31404a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f31406c = i11;
            this.f31407d = this.f31405b.getShort(i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public String m35789e(int i10) {
        return m35784f(i10, this.f31405b, this.f31408e);
    }

    /* JADX INFO: renamed from: g */
    public AbstractC9187b m35790g(AbstractC9187b abstractC9187b, int i10) {
        return m35785h(abstractC9187b, i10, this.f31405b);
    }

    /* JADX INFO: renamed from: i */
    public int m35791i(int i10) {
        int i11 = i10 + this.f31404a;
        return i11 + this.f31405b.getInt(i11) + 4;
    }

    /* JADX INFO: renamed from: j */
    public ByteBuffer m35792j(int i10, int i11) {
        int iM35787c = m35787c(i10);
        if (iM35787c == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f31405b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iM35791i = m35791i(iM35787c);
        byteBufferOrder.position(iM35791i);
        byteBufferOrder.limit(iM35791i + (m35793k(iM35787c) * i11));
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: k */
    public int m35793k(int i10) {
        int i11 = i10 + this.f31404a;
        return this.f31405b.getInt(i11 + this.f31405b.getInt(i11));
    }
}
