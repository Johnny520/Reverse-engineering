package p035;

import androidx.appcompat.app.C0908;
import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.text.C5981;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import p020.C6921;
import p020.C6928;
import p020.C6936;
import p029.AbstractC7054;
import p029.AbstractC7059;
import p031.C7063;
import p031.C7064;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7106 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C7087 f17644;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C7099 f17645;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C0955 f17646;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final LinkedHashSet f17647;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C5860 f17648;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f17649;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public long f17650;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f17651;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long f17652;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C7088 f17653;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7064 f17654;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public long f17655;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f17656;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0908 f17657;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C7087 f17658;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C7087 f17659;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C7094 f17660;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f17662;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C7064 f17663;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C7064 f17664;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7063 f17666;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f17667 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7103 f17669;

    static {
        C7087 c7087 = new C7087();
        c7087.m12322(4, Opcodes.MAX_VALUE);
        c7087.m12322(5, 16384);
        f17644 = c7087;
    }

    public C7106(C2080 c2080) {
        this.f17669 = (AbstractC7103) c2080.f3962;
        String str = (String) c2080.f3963;
        if (str == null) {
            AbstractC5227.m9467("connectionName");
            throw null;
        }
        this.f17668 = str;
        this.f17661 = 3;
        C7063 c7063 = (C7063) c2080.f3965;
        this.f17666 = c7063;
        this.f17663 = c7063.m12268();
        this.f17664 = c7063.m12268();
        this.f17654 = c7063.m12268();
        this.f17653 = C7088.f17570;
        this.f17660 = (C7094) c2080.f3964;
        C7087 c7087 = new C7087();
        c7087.m12322(4, 16777216);
        this.f17659 = c7087;
        this.f17658 = f17644;
        boolean z = false;
        this.f17657 = new C0908(0);
        this.f17655 = r0.m12323();
        C0955 c0955 = (C0955) c2080.f3966;
        if (c0955 == null) {
            AbstractC5227.m9467("socket");
            throw null;
        }
        this.f17646 = c0955;
        this.f17645 = new C7099((C6936) c0955.f663);
        this.f17648 = new C5860(16, this, new C7097((C6928) c0955.f665), z);
        this.f17647 = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m12366(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.f17645.flush();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7098 m12364(int i) {
        C7098 c7098;
        synchronized (this) {
            c7098 = (C7098) this.f17667.remove(Integer.valueOf(i));
            notifyAll();
        }
        return c7098;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7098 m12365(int i) {
        C7098 c7098;
        synchronized (this) {
            c7098 = (C7098) this.f17667.get(Integer.valueOf(i));
        }
        return c7098;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12366(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        errorCode.getClass();
        errorCode2.getClass();
        TimeZone timeZone = AbstractC7059.f17512;
        try {
            m12368(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f17667.isEmpty()) {
                array = null;
            } else {
                array = this.f17667.values().toArray(new C7098[0]);
                this.f17667.clear();
            }
        }
        C7098[] c7098Arr = (C7098[]) array;
        if (c7098Arr != null) {
            for (C7098 c7098 : c7098Arr) {
                try {
                    c7098.m12347(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f17645.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((C1171) this.f17646.f664).f1440).close();
        } catch (IOException unused4) {
        }
        this.f17663.m12272();
        this.f17664.m12272();
        this.f17654.m12272();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12367(long j) {
        synchronized (this) {
            try {
                C0908.m743(this.f17657, j, 0L, 2);
                long jM744 = this.f17657.m744();
                if (jM744 >= this.f17659.m12323() / 2) {
                    m12370(0, jM744);
                    C0908.m743(this.f17657, 0L, jM744, 1);
                }
                C7094 c7094 = this.f17660;
                C0908 c0908 = this.f17657;
                c7094.getClass();
                c0908.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12368(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this.f17645) {
            synchronized (this) {
                if (this.f17665) {
                    return;
                }
                this.f17665 = true;
                this.f17645.m12358(this.f17662, errorCode, AbstractC7054.f17503);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m12369(int i, ErrorCode errorCode) {
        errorCode.getClass();
        C7064.m12271(this.f17663, this.f17668 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] writeSynReset", new C5981(this, i, errorCode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12370(final int i, final long j) {
        C7064.m12271(this.f17663, this.f17668 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] windowUpdate", new InterfaceC7372() { // from class: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏哲世兰
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                C7106 c7106 = this.f17690;
                try {
                    c7106.f17645.m12360(i, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    c7106.m12366(errorCode, errorCode, e);
                }
                return C6008.f15084;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f17645.f17625);
        r6 = r2;
        r8.f17656 += r6;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12371(int i, boolean z, C6921 c6921, long j) {
        int iMin;
        long j2;
        if (j == 0) {
            this.f17645.m12355(z, i, c6921, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.f17656;
                            long j4 = this.f17655;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.f17667.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.f17645.m12355(z && j == 0, i, c6921, iMin);
        }
    }
}
