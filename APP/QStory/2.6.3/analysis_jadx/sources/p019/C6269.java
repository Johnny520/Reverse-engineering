package p019;

import androidx.appcompat.app.C0061;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p004.InterfaceC6100;
import p004.InterfaceC6101;
import p004.InterfaceC6103;
import p007.C6151;
import p013.AbstractC6230;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6269 implements InterfaceC6100 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public IOException f17263;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ErrorCode f17264;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6272 f17265;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6272 f17266;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f17268;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6271 f17269;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6267 f17270;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayDeque f17271;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f17272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6277 f17273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0061 f17274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f17275;

    public C6269(int i, C6277 c6277, boolean z, boolean z2, C6151 c6151) {
        c6277.getClass();
        this.f17275 = i;
        this.f17273 = c6277;
        this.f17274 = new C0061(i);
        this.f17267 = c6277.f17313.m11764();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f17271 = arrayDeque;
        this.f17269 = new C6271(this, c6277.f17314.m11764(), z2);
        this.f17270 = new C6267(this, z);
        this.f17266 = new C6272(this);
        this.f17265 = new C6272(this);
        if (c6151 == null) {
            if (m11791()) {
                return;
            }
            C5925.m11311("remotely-initiated streams should have headers");
            throw null;
        }
        if (m11791()) {
            C5925.m11311("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(c6151);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11786(ErrorCode errorCode) {
        errorCode.getClass();
        if (m11787(errorCode, null)) {
            this.f17273.m11810(this.f17275, errorCode);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m11787(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = AbstractC6230.f17167;
        synchronized (this) {
            if (m11792() != null) {
                return false;
            }
            this.f17264 = errorCode;
            this.f17263 = iOException;
            notifyAll();
            if (this.f17269.f17285) {
                if (this.f17270.f17258) {
                    return false;
                }
            }
            this.f17273.m11805(this.f17275);
            return true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11788(ErrorCode errorCode, IOException iOException) {
        errorCode.getClass();
        if (m11787(errorCode, iOException)) {
            C6277 c6277 = this.f17273;
            c6277.getClass();
            c6277.f17300.m11800(this.f17275, errorCode);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11789() throws IOException {
        C6267 c6267 = this.f17270;
        if (c6267.f17257) {
            C5925.m11307("stream closed");
            return;
        }
        if (c6267.f17258) {
            C5925.m11307("stream finished");
            return;
        }
        if (m11792() != null) {
            IOException iOException = this.f17263;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeM11792 = m11792();
            errorCodeM11792.getClass();
            throw new StreamResetException(errorCodeM11792);
        }
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6101 mo382() {
        return this.f17269;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11790() {
        /*
            r2 = this;
            java.util.TimeZone r0 = p013.AbstractC6230.f17167
            monitor-enter(r2)
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰苏世哲 r0 = r2.f17269     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f17285     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f17282     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰世哲苏 r0 = r2.f17270     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f17258     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f17257     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.m11793()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r2.m11788(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            飘花落叶言世兰苏子哲楪.飘花落叶言子楪哲苏世兰 r0 = r2.f17273
            int r2 = r2.f17275
            r0.m11805(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p019.C6269.m11790():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m11791() {
        boolean z = (this.f17275 & 1) == 1;
        this.f17273.getClass();
        return true == z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ErrorCode m11792() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.f17264;
        }
        return errorCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m11793() {
        synchronized (this) {
            try {
                if (m11792() != null) {
                    return false;
                }
                C6271 c6271 = this.f17269;
                if (c6271.f17285 || c6271.f17282) {
                    C6267 c6267 = this.f17270;
                    if (c6267.f17258 || c6267.f17257) {
                        if (this.f17272) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11794(C6151 c6151, boolean z) {
        boolean zM11793;
        c6151.getClass();
        TimeZone timeZone = AbstractC6230.f17167;
        synchronized (this) {
            try {
                if (this.f17272 && c6151.m11551(":status") == null && c6151.m11551(":method") == null) {
                    this.f17269.getClass();
                } else {
                    this.f17272 = true;
                    this.f17271.add(c6151);
                }
                if (z) {
                    this.f17269.f17285 = true;
                }
                zM11793 = m11793();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM11793) {
            return;
        }
        this.f17273.m11805(this.f17275);
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final InterfaceC6103 mo401() {
        return this.f17270;
    }
}
