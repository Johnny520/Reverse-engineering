package p019;

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
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.text.C5149;
import net.bytebuddy.pool.TypePool;
import okhttp3.internal.http2.ErrorCode;
import p004.C6099;
import p004.C6107;
import p013.AbstractC6225;
import p013.AbstractC6230;
import p015.C6234;
import p015.C6235;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6277 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C6258 f17299;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C6270 f17300;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C0108 f17301;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final LinkedHashSet f17302;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C5028 f17303;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public long f17304;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public long f17305;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public long f17306;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public long f17307;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6259 f17308;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6235 f17309;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public long f17310;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public long f17311;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0061 f17312;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C6258 f17313;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C6258 f17314;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C6265 f17315;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f17316;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f17317;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6235 f17318;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6235 f17319;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f17320;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C6234 f17321;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f17322 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f17323;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC6274 f17324;

    static {
        C6258 c6258 = new C6258();
        c6258.m11763(4, Opcodes.MAX_VALUE);
        c6258.m11763(5, 16384);
        f17299 = c6258;
    }

    public C6277(C1245 c1245) {
        this.f17324 = (AbstractC6274) c1245.f3617;
        String str = (String) c1245.f3618;
        if (str == null) {
            AbstractC4395.m8908("connectionName");
            throw null;
        }
        this.f17323 = str;
        this.f17316 = 3;
        C6234 c6234 = (C6234) c1245.f3620;
        this.f17321 = c6234;
        this.f17318 = c6234.m11709();
        this.f17319 = c6234.m11709();
        this.f17309 = c6234.m11709();
        this.f17308 = C6259.f17225;
        this.f17315 = (C6265) c1245.f3619;
        C6258 c6258 = new C6258();
        c6258.m11763(4, 16777216);
        this.f17314 = c6258;
        this.f17313 = f17299;
        boolean z = false;
        this.f17312 = new C0061(0);
        this.f17310 = r0.m11764();
        C0108 c0108 = (C0108) c1245.f3621;
        if (c0108 == null) {
            AbstractC4395.m8908("socket");
            throw null;
        }
        this.f17301 = c0108;
        this.f17300 = new C6270((C6107) c0108.f318);
        this.f17303 = new C5028(16, this, new C6268((C6099) c0108.f320), z);
        this.f17302 = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m11807(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void flush() {
        this.f17300.flush();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6269 m11805(int i) {
        C6269 c6269;
        synchronized (this) {
            c6269 = (C6269) this.f17322.remove(Integer.valueOf(i));
            notifyAll();
        }
        return c6269;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6269 m11806(int i) {
        C6269 c6269;
        synchronized (this) {
            c6269 = (C6269) this.f17322.get(Integer.valueOf(i));
        }
        return c6269;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11807(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] array;
        errorCode.getClass();
        errorCode2.getClass();
        TimeZone timeZone = AbstractC6230.f17167;
        try {
            m11809(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f17322.isEmpty()) {
                array = null;
            } else {
                array = this.f17322.values().toArray(new C6269[0]);
                this.f17322.clear();
            }
        }
        C6269[] c6269Arr = (C6269[]) array;
        if (c6269Arr != null) {
            for (C6269 c6269 : c6269Arr) {
                try {
                    c6269.m11788(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f17300.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((C0325) this.f17301.f319).f1095).close();
        } catch (IOException unused4) {
        }
        this.f17318.m11713();
        this.f17319.m11713();
        this.f17309.m11713();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11808(long j) {
        synchronized (this) {
            try {
                C0061.m183(this.f17312, j, 0L, 2);
                long jM184 = this.f17312.m184();
                if (jM184 >= this.f17314.m11764() / 2) {
                    m11811(0, jM184);
                    C0061.m183(this.f17312, 0L, jM184, 1);
                }
                C6265 c6265 = this.f17315;
                C0061 c0061 = this.f17312;
                c6265.getClass();
                c0061.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11809(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this.f17300) {
            synchronized (this) {
                if (this.f17320) {
                    return;
                }
                this.f17320 = true;
                this.f17300.m11799(this.f17317, errorCode, AbstractC6225.f17158);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11810(int i, ErrorCode errorCode) {
        errorCode.getClass();
        C6235.m11712(this.f17318, this.f17323 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] writeSynReset", new C5149(this, i, errorCode));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11811(final int i, final long j) {
        C6235.m11712(this.f17318, this.f17323 + TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + i + "] windowUpdate", new InterfaceC6543() { // from class: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪苏哲世兰
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                C6277 c6277 = this.f17345;
                try {
                    c6277.f17300.m11801(i, j);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    c6277.m11807(errorCode, errorCode, e);
                }
                return C5176.f14739;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f17300.f17280);
        r6 = r2;
        r8.f17311 += r6;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11812(int r9, boolean r10, p004.C6092 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲苏世 r8 = r8.f17300
            r8.m11796(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f17311     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f17310     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f17322     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
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
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲苏世 r4 = r8.f17300     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f17280     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f17311     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f17311 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲苏世 r4 = r8.f17300
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m11796(r5, r9, r11, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: p019.C6277.m11812(int, boolean, 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世兰哲苏, long):void");
    }
}
