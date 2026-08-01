package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.C1719;
import com.bumptech.glide.load.engine.C3004;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p007.C6132;
import p011.C6203;
import p011.C6207;
import p011.InterfaceC6210;
import p012.InterfaceC6215;
import p012.InterfaceC6216;
import p232.C8063;
import p232.C8068;
import p288.C8410;
import p288.C8411;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0734 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f2069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f2070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f2071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2072;

    public C0734() {
        this.f2071 = new Object();
        this.f2070 = new ArrayList();
        this.f2069 = new ArrayList();
        this.f2072 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static IOException m1536(C0734 c0734, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            c0734.m1537(iOException);
        }
        return ((C6203) c0734.f2071).m11641(c0734, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m1537(IOException iOException) {
        this.f2072 = true;
        ((InterfaceC6215) this.f2069).mo11667().mo11619((C6203) this.f2071, iOException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C6132 m1538(boolean z) throws IOException {
        try {
            C6132 c6132Mo11662 = ((InterfaceC6215) this.f2069).mo11662(z);
            if (c6132Mo11662 == null) {
                return c6132Mo11662;
            }
            c6132Mo11662.f16780 = this;
            return c6132Mo11662;
        } catch (IOException e) {
            m1537(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public File m1539() {
        File file;
        synchronized (((C8410) this.f2069)) {
            try {
                C8411 c8411 = (C8411) this.f2071;
                if (c8411.f23303 != this) {
                    throw new IllegalStateException();
                }
                if (!c8411.f23304) {
                    ((boolean[]) this.f2070)[0] = true;
                }
                file = c8411.f23305[0];
                ((C8410) this.f2069).f23302.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C6207 m1540() {
        InterfaceC6216 interfaceC6216Mo11667 = ((InterfaceC6215) this.f2069).mo11667();
        C6207 c6207 = interfaceC6216Mo11667 instanceof C6207 ? (C6207) interfaceC6216Mo11667 : null;
        if (c6207 != null) {
            return c6207;
        }
        C5925.m11311("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1541() {
        C8410.m13979((C8410) this.f2069, this, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C4871 m1542() throws SocketException {
        C6203 c6203 = (C6203) this.f2071;
        if (c6203.f17082) {
            C5925.m11311("Check failed.");
            return null;
        }
        c6203.f17082 = true;
        c6203.f17080.m11495();
        synchronized (c6203) {
            if (c6203.f17077 == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (c6203.f17072 || c6203.f17071) {
                throw new IllegalStateException("Check failed.");
            }
            if (c6203.f17074) {
                throw new IllegalStateException("Check failed.");
            }
            if (!c6203.f17073) {
                throw new IllegalStateException("Check failed.");
            }
            c6203.f17073 = false;
            c6203.f17072 = true;
            c6203.f17071 = true;
        }
        InterfaceC6216 interfaceC6216Mo11667 = ((InterfaceC6215) this.f2069).mo11667();
        interfaceC6216Mo11667.getClass();
        C6207 c6207 = (C6207) interfaceC6216Mo11667;
        c6207.f17110.setSoTimeout(0);
        c6207.mo11621();
        return new C4871(this);
    }

    public C0734(C6203 c6203, InterfaceC6210 interfaceC6210, InterfaceC6215 interfaceC6215) {
        interfaceC6210.getClass();
        this.f2071 = c6203;
        this.f2070 = interfaceC6210;
        this.f2069 = interfaceC6215;
    }

    public C0734(C3004 c3004, C8063 c8063) {
        this.f2069 = new C8068(this);
        this.f2070 = c3004;
        this.f2071 = c8063;
    }

    public C0734(C0711 c0711, C1719 c1719, InterfaceC0735 interfaceC0735) {
        this.f2071 = c0711;
        this.f2070 = c1719;
        this.f2069 = interfaceC0735;
        this.f2072 = true;
    }

    public C0734(C8410 c8410, C8411 c8411) {
        this.f2069 = c8410;
        this.f2071 = c8411;
        this.f2070 = c8411.f23304 ? null : new boolean[c8410.f23299];
    }
}
