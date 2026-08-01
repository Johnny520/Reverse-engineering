package p022;

import androidx.appcompat.app.C0061;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.text.C5148;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import p005.C6108;
import p005.C6116;
import p012.C6164;
import p012.C6165;
import p017.AbstractC6233;
import p017.AbstractC6238;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6281 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C6262 f17317;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C6274 f17318;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C0108 f17319;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final LinkedHashSet f17320;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C5027 f17321;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f17322;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public long f17323;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f17324;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long f17325;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6263 f17326;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6165 f17327;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public long f17328;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f17329;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0061 f17330;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C6262 f17331;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C6262 f17332;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C6269 f17333;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17334;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f17335;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6165 f17336;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6165 f17337;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17338;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C6164 f17339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f17340 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17341;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC6278 f17342;

    static {
        C6262 c6262 = new C6262();
        c6262.m11746(4, Opcodes.MAX_VALUE);
        c6262.m11746(5, 16384);
        f17317 = c6262;
    }

    public C6281(C1245 c1245) {
        this.f17342 = (AbstractC6278) c1245.f3616;
        String str = (String) c1245.f3617;
        if (str == null) {
            AbstractC4394.m8918("connectionName");
            throw null;
        }
        this.f17341 = str;
        this.f17334 = 3;
        C6164 c6164 = (C6164) c1245.f3619;
        this.f17339 = c6164;
        this.f17336 = c6164.m11587();
        this.f17337 = c6164.m11587();
        this.f17327 = c6164.m11587();
        this.f17326 = C6263.f17243;
        this.f17333 = (C6269) c1245.f3618;
        C6262 c6262 = new C6262();
        c6262.m11746(4, 16777216);
        this.f17332 = c6262;
        this.f17331 = f17317;
        boolean z = false;
        this.f17330 = new C0061(0);
        this.f17328 = r0.m11747();
        C0108 c0108 = (C0108) c1245.f3620;
        if (c0108 == null) {
            AbstractC4394.m8918("socket");
            throw null;
        }
        this.f17319 = c0108;
        this.f17318 = new C6274((C6116) c0108.f318);
        this.f17321 = new C5027(16, this, new C6272((C6108) c0108.f320), z);
        this.f17320 = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m11790(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.f17318.flush();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6273 m11788(int i) {
        C6273 c6273;
        synchronized (this) {
            c6273 = (C6273) this.f17340.remove(Integer.valueOf(i));
            notifyAll();
        }
        return c6273;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6273 m11789(int i) {
        C6273 c6273;
        synchronized (this) {
            c6273 = (C6273) this.f17340.get(Integer.valueOf(i));
        }
        return c6273;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11790(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        errorCode.getClass();
        errorCode2.getClass();
        TimeZone timeZone = AbstractC6238.f17190;
        try {
            m11792(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f17340.isEmpty()) {
                array = null;
            } else {
                array = this.f17340.values().toArray(new C6273[0]);
                this.f17340.clear();
            }
        }
        C6273[] c6273Arr = (C6273[]) array;
        if (c6273Arr != null) {
            for (C6273 c6273 : c6273Arr) {
                try {
                    c6273.m11771(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f17318.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((C0325) this.f17319.f319).f1095).close();
        } catch (IOException unused4) {
        }
        this.f17336.m11591();
        this.f17337.m11591();
        this.f17327.m11591();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11791(long j) {
        synchronized (this) {
            try {
                C0061.m182(this.f17330, j, 0L, 2);
                long jM183 = this.f17330.m183();
                if (jM183 >= this.f17332.m11747() / 2) {
                    m11794(0, jM183);
                    C0061.m182(this.f17330, 0L, jM183, 1);
                }
                C6269 c6269 = this.f17333;
                C0061 c0061 = this.f17330;
                c6269.getClass();
                c0061.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11792(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this.f17318) {
            synchronized (this) {
                if (this.f17338) {
                    return;
                }
                this.f17338 = true;
                this.f17318.m11782(this.f17335, errorCode, AbstractC6233.f17181);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11793(int i, ErrorCode errorCode) {
        errorCode.getClass();
        C6165.m11590(this.f17336, this.f17341 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] writeSynReset", new C5148(this, i, errorCode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11794(final int i, final long j) {
        C6165.m11590(this.f17336, this.f17341 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] windowUpdate", new InterfaceC6542() { // from class: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪苏哲世兰
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                C6281 c6281 = this.f17363;
                try {
                    c6281.f17318.m11784(i, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    c6281.m11790(errorCode, errorCode, e);
                }
                return C5175.f14739;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f17318.f17298);
        r6 = r2;
        r8.f17329 += r6;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11795(int r9, boolean r10, p005.C6101 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰哲苏世 r8 = r8.f17318
            r8.m11779(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f17329     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f17328     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f17340     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰哲苏世 r4 = r8.f17318     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f17298     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f17329     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f17329 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰哲苏世 r4 = r8.f17318
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m11779(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6281.m11795(int, boolean, 飘花落叶言世兰哲苏楪子.飘花落叶言子楪世兰哲苏, long):void");
    }
}
