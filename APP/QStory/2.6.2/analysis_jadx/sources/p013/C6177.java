package p013;

import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import p012.C6165;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.InterfaceC6209;
import p016.C6231;
import p017.AbstractC6233;
import p017.AbstractC6238;
import p019.AbstractC6241;
import p021.C6256;
import p021.C6258;
import p021.C6259;
import p021.InterfaceC6253;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6177 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f16865;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f16866;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f16867;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f16868;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f16869;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C0734 f16870;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f16871;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public volatile C0734 f16872;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public volatile boolean f16873;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AtomicBoolean f16874;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6178 f16875;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C6181 f16876;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f16877;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f16878;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC6184 f16879;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6198 f16880;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6182 f16881;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6200 f16882;

    public C6177(C6200 c6200, C6198 c6198) {
        c6200.getClass();
        this.f16882 = c6200;
        this.f16880 = c6198;
        this.f16881 = (C6182) c6200.f16958.f16007;
        c6200.f16966.getClass();
        C6178 c6178 = new C6178(this);
        c6178.mo11462(c6200.f16975);
        this.f16875 = c6178;
        this.f16874 = new AtomicBoolean();
        this.f16865 = true;
        this.f16871 = new CopyOnWriteArrayList();
        new AtomicReference(c6198.f16951);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11613(C6177 c6177) {
        StringBuilder sb = new StringBuilder();
        sb.append(c6177.f16873 ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(c6177.f16880.f16955.m11675());
        return sb.toString();
    }

    public final void cancel() {
        if (this.f16873) {
            return;
        }
        this.f16873 = true;
        C0734 c0734 = this.f16872;
        if (c0734 != null) {
            ((InterfaceC6253) c0734.f2068).cancel();
        }
        Iterator it = this.f16871.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC6174) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new C6177(this.f16882, this.f16880);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11614(boolean z) {
        C0734 c0734;
        synchronized (this) {
            if (!this.f16865) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (c0734 = this.f16872) != null) {
            ((InterfaceC6253) c0734.f2068).cancel();
            ((C6177) c0734.f2070).m11622(c0734, true, true, true, true, null);
        }
        this.f16870 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6204 m11615() {
        if (!this.f16874.compareAndSet(false, true)) {
            C5919.m11250("Already Executed");
            return null;
        }
        this.f16875.m11501();
        AbstractC6241 abstractC6241 = AbstractC6241.f17194;
        this.f16878 = AbstractC6241.f17194.mo11720();
        try {
            C0325 c0325 = this.f16882.f16969;
            synchronized (c0325) {
                ((ArrayDeque) c0325.f1093).add(this);
            }
            return m11620();
        } finally {
            C0325 c03252 = this.f16882.f16969;
            c03252.getClass();
            C0325.m955(c03252, null, this, null, 5);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11616(InterfaceC6209 interfaceC6209) {
        if (!this.f16874.compareAndSet(false, true)) {
            C5919.m11250("Already Executed");
            return;
        }
        AbstractC6241 abstractC6241 = AbstractC6241.f17194;
        this.f16878 = AbstractC6241.f17194.mo11720();
        C0325 c0325 = this.f16882.f16969;
        RunnableC6185 runnableC6185 = new RunnableC6185(this, interfaceC6209);
        c0325.getClass();
        C0325.m955(c0325, runnableC6185, null, null, 6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final IOException m11617(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM11619;
        TimeZone timeZone = AbstractC6238.f17190;
        C6181 c6181 = this.f16876;
        if (c6181 != null) {
            synchronized (c6181) {
                socketM11619 = m11619();
            }
            if (this.f16876 == null) {
                if (socketM11619 != null) {
                    AbstractC6238.m11704(socketM11619);
                }
            } else if (socketM11619 != null) {
                C5919.m11250("Check failed.");
                return null;
            }
        }
        if (!this.f16877 && this.f16875.m11502()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11618(C6181 c6181) {
        c6181.getClass();
        TimeZone timeZone = AbstractC6238.f17190;
        if (this.f16876 != null) {
            C5919.m11250("Check failed.");
        } else {
            this.f16876 = c6181;
            c6181.f16910.add(new C6186(this, this.f16878));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Socket m11619() {
        C6181 c6181 = this.f16876;
        c6181.getClass();
        TimeZone timeZone = AbstractC6238.f17190;
        ArrayList arrayList = c6181.f16910;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (AbstractC4394.m8917(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C5919.m11250("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f16876 = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c6181.f16908 = System.nanoTime();
        C6182 c6182 = this.f16881;
        ConcurrentLinkedQueue concurrentLinkedQueue = c6182.f16917;
        TimeZone timeZone2 = AbstractC6238.f17190;
        if (!c6181.f16916) {
            c6182.f16919.m11593(c6182.f16918, 0L);
            return null;
        }
        c6181.f16916 = true;
        concurrentLinkedQueue.remove(c6181);
        if (concurrentLinkedQueue.isEmpty()) {
            C6165 c6165 = c6182.f16919;
            synchronized (c6165.f16809) {
                if (c6165.m11594()) {
                    c6165.f16809.m11588(c6165);
                }
            }
        }
        return c6181.f16902;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6204 m11620() {
        ArrayList arrayList = new ArrayList();
        AbstractC4343.m8794(this.f16882.f16968, arrayList);
        arrayList.add(new C6258(this.f16882));
        arrayList.add(new C6258(this.f16882.f16987));
        this.f16882.getClass();
        arrayList.add(new C6231(0));
        arrayList.add(C6173.f16854);
        AbstractC4343.m8794(this.f16882.f16967, arrayList);
        arrayList.add(C6256.f17226);
        C6198 c6198 = this.f16880;
        C6200 c6200 = this.f16882;
        try {
            try {
                C6204 c6204M11743 = new C6259(this, arrayList, 0, null, c6198, c6200.f16972, c6200.f16973, c6200.f16963).m11743(c6198);
                if (this.f16873) {
                    AbstractC6233.m11690(c6204M11743);
                    throw new IOException("Canceled");
                }
                m11621(null);
                return c6204M11743;
            } catch (IOException e) {
                IOException iOExceptionM11621 = m11621(e);
                iOExceptionM11621.getClass();
                throw iOExceptionM11621;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m11621(null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final IOException m11621(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f16865) {
                this.f16865 = false;
                if (!this.f16869 && !this.f16868 && !this.f16867) {
                    if (!this.f16866) {
                        z = true;
                    }
                }
            }
        }
        return z ? m11617(iOException) : iOException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final IOException m11622(C0734 c0734, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        c0734.getClass();
        if (c0734.equals(this.f16872)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.f16869) {
                            if ((z2 || !this.f16868) && ((!z4 || !this.f16867) && (!z3 || !this.f16866))) {
                            }
                        }
                        if (z) {
                            this.f16869 = false;
                        }
                        if (z2) {
                            this.f16868 = false;
                        }
                        if (z4) {
                            this.f16867 = false;
                        }
                        if (z3) {
                            this.f16866 = false;
                        }
                        boolean z7 = (this.f16869 || this.f16868 || this.f16867 || this.f16866) ? false : true;
                        if (z7) {
                            if (!this.f16865) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.f16872 = null;
                C6181 c6181 = this.f16876;
                if (c6181 != null) {
                    synchronized (c6181) {
                        c6181.f16907++;
                    }
                }
            }
            if (z6) {
                return m11617(iOException);
            }
        }
        return iOException;
    }
}
