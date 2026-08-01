package p035;

import androidx.appcompat.app.C0908;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p020.InterfaceC6929;
import p020.InterfaceC6930;
import p020.InterfaceC6932;
import p023.C6980;
import p029.AbstractC7059;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7098 implements InterfaceC6929 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public IOException f17608;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ErrorCode f17609;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C7101 f17610;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7101 f17611;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f17612;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f17613;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C7100 f17614;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C7096 f17615;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayDeque f17616;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f17617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7106 f17618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0908 f17619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f17620;

    public C7098(int i, C7106 c7106, boolean z, boolean z2, C6980 c6980) {
        c7106.getClass();
        this.f17620 = i;
        this.f17618 = c7106;
        this.f17619 = new C0908(i);
        this.f17612 = c7106.f17658.m12323();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f17616 = arrayDeque;
        this.f17614 = new C7100(this, c7106.f17659.m12323(), z2);
        this.f17615 = new C7096(this, z);
        this.f17611 = new C7101(this);
        this.f17610 = new C7101(this);
        if (c6980 == null) {
            if (m12350()) {
                return;
            }
            C6755.m11870("remotely-initiated streams should have headers");
            throw null;
        }
        if (m12350()) {
            C6755.m11870("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(c6980);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12345(ErrorCode errorCode) {
        errorCode.getClass();
        if (m12346(errorCode, null)) {
            this.f17618.m12369(this.f17620, errorCode);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m12346(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = AbstractC7059.f17512;
        synchronized (this) {
            if (m12351() != null) {
                return false;
            }
            this.f17609 = errorCode;
            this.f17608 = iOException;
            notifyAll();
            if (this.f17614.f17630) {
                if (this.f17615.f17603) {
                    return false;
                }
            }
            this.f17618.m12364(this.f17620);
            return true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12347(ErrorCode errorCode, IOException iOException) {
        errorCode.getClass();
        if (m12346(errorCode, iOException)) {
            C7106 c7106 = this.f17618;
            c7106.getClass();
            c7106.f17645.m12359(this.f17620, errorCode);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12348() throws IOException {
        C7096 c7096 = this.f17615;
        if (c7096.f17602) {
            C6755.m11866("stream closed");
            return;
        }
        if (c7096.f17603) {
            C6755.m11866("stream finished");
            return;
        }
        if (m12351() != null) {
            IOException iOException = this.f17608;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCodeM12351 = m12351();
            errorCodeM12351.getClass();
            throw new StreamResetException(errorCodeM12351);
        }
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6930 mo942() {
        return this.f17614;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12349() {
        boolean z;
        boolean zM12352;
        TimeZone timeZone = AbstractC7059.f17512;
        synchronized (this) {
            try {
                C7100 c7100 = this.f17614;
                if (c7100.f17630 || !c7100.f17627) {
                    z = false;
                } else {
                    C7096 c7096 = this.f17615;
                    if (c7096.f17603 || c7096.f17602) {
                        z = true;
                    }
                }
                zM12352 = m12352();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m12347(ErrorCode.CANCEL, null);
        } else {
            if (zM12352) {
                return;
            }
            this.f17618.m12364(this.f17620);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12350() {
        boolean z = (this.f17620 & 1) == 1;
        this.f17618.getClass();
        return true == z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ErrorCode m12351() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.f17609;
        }
        return errorCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m12352() {
        synchronized (this) {
            try {
                if (m12351() != null) {
                    return false;
                }
                C7100 c7100 = this.f17614;
                if (c7100.f17630 || c7100.f17627) {
                    C7096 c7096 = this.f17615;
                    if (c7096.f17603 || c7096.f17602) {
                        if (this.f17617) {
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
    public final void m12353(C6980 c6980, boolean z) {
        boolean zM12352;
        c6980.getClass();
        TimeZone timeZone = AbstractC7059.f17512;
        synchronized (this) {
            try {
                if (this.f17617 && c6980.m12110(":status") == null && c6980.m12110(":method") == null) {
                    this.f17614.getClass();
                } else {
                    this.f17617 = true;
                    this.f17616.add(c6980);
                }
                if (z) {
                    this.f17614.f17630 = true;
                }
                zM12352 = m12352();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM12352) {
            return;
        }
        this.f17618.m12364(this.f17620);
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final InterfaceC6932 mo961() {
        return this.f17615;
    }
}
