package p022;

import androidx.appcompat.app.C0061;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p005.InterfaceC6109;
import p005.InterfaceC6110;
import p005.InterfaceC6112;
import p015.C6224;
import p017.AbstractC6238;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6273 implements InterfaceC6109 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public IOException f17281;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ErrorCode f17282;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6276 f17283;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6276 f17284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17285;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f17286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6275 f17287;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C6271 f17288;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayDeque f17289;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f17290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6281 f17291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0061 f17292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f17293;

    public C6273(int i, C6281 c6281, boolean z, boolean z2, C6224 c6224) {
        c6281.getClass();
        this.f17293 = i;
        this.f17291 = c6281;
        this.f17292 = new C0061(i);
        this.f17285 = c6281.f17331.m11747();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f17289 = arrayDeque;
        this.f17287 = new C6275(this, c6281.f17332.m11747(), z2);
        this.f17288 = new C6271(this, z);
        this.f17284 = new C6276(this);
        this.f17283 = new C6276(this);
        if (c6224 == null) {
            if (m11774()) {
                return;
            }
            C5919.m11250("remotely-initiated streams should have headers");
            throw null;
        }
        if (m11774()) {
            C5919.m11250("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(c6224);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11769(ErrorCode errorCode) {
        errorCode.getClass();
        if (m11770(errorCode, null)) {
            this.f17291.m11793(this.f17293, errorCode);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m11770(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = AbstractC6238.f17190;
        synchronized (this) {
            if (m11775() != null) {
                return false;
            }
            this.f17282 = errorCode;
            this.f17281 = iOException;
            notifyAll();
            if (this.f17287.f17303) {
                if (this.f17288.f17276) {
                    return false;
                }
            }
            this.f17291.m11788(this.f17293);
            return true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11771(ErrorCode errorCode, IOException iOException) {
        errorCode.getClass();
        if (m11770(errorCode, iOException)) {
            C6281 c6281 = this.f17291;
            c6281.getClass();
            c6281.f17318.m11783(this.f17293, errorCode);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11772() throws IOException {
        C6271 c6271 = this.f17288;
        if (c6271.f17275) {
            C5919.m11246("stream closed");
            return;
        }
        if (c6271.f17276) {
            C5919.m11246("stream finished");
            return;
        }
        if (m11775() != null) {
            IOException iOException = this.f17281;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeM11775 = m11775();
            errorCodeM11775.getClass();
            throw new StreamResetException(errorCodeM11775);
        }
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6110 mo381() {
        return this.f17287;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11773() {
        /*
            r2 = this;
            java.util.TimeZone r0 = p017.AbstractC6238.f17190
            monitor-enter(r2)
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰苏世哲 r0 = r2.f17287     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f17303     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f17300     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪兰世哲苏 r0 = r2.f17288     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f17276     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f17275     // Catch: java.lang.Throwable -> L18
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
            boolean r1 = r2.m11776()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r2.m11771(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            飘花落叶言世兰苏楪子哲.飘花落叶言子楪哲苏世兰 r0 = r2.f17291
            int r2 = r2.f17293
            r0.m11788(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p022.C6273.m11773():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m11774() {
        boolean z = (this.f17293 & 1) == 1;
        this.f17291.getClass();
        return true == z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ErrorCode m11775() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.f17282;
        }
        return errorCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m11776() {
        synchronized (this) {
            try {
                if (m11775() != null) {
                    return false;
                }
                C6275 c6275 = this.f17287;
                if (c6275.f17303 || c6275.f17300) {
                    C6271 c6271 = this.f17288;
                    if (c6271.f17276 || c6271.f17275) {
                        if (this.f17290) {
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
    public final void m11777(C6224 c6224, boolean z) {
        boolean zM11776;
        c6224.getClass();
        TimeZone timeZone = AbstractC6238.f17190;
        synchronized (this) {
            try {
                if (this.f17290 && c6224.m11680(":status") == null && c6224.m11680(":method") == null) {
                    this.f17287.getClass();
                } else {
                    this.f17290 = true;
                    this.f17289.add(c6224);
                }
                if (z) {
                    this.f17287.f17303 = true;
                }
                zM11776 = m11776();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM11776) {
            return;
        }
        this.f17291.m11788(this.f17293);
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final InterfaceC6112 mo400() {
        return this.f17288;
    }
}
