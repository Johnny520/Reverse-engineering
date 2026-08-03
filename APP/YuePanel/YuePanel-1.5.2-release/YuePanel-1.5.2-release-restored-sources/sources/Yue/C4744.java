package Yue;

import Yue.C7187;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4744 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C7030 f1092;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C3175 f1093;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7024 f10196;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4712 f10197;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public C7187.C1202 f10198;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public C7187 f10199;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f10200;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f10201;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f10202;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public C7184 f10203;

    public C4744(@InterfaceC6399 C7030 c7030, @InterfaceC6399 C3175 c3175, @InterfaceC6399 C7024 c7024, @InterfaceC6399 AbstractC4712 abstractC4712) {
        C5499.m17103(c7030, "connectionPool");
        C5499.m17103(c3175, "address");
        C5499.m17103(c7024, C6411.f16272);
        C5499.m17103(abstractC4712, "eventListener");
        this.f1092 = c7030;
        this.f1093 = c3175;
        this.f10196 = c7024;
        this.f10197 = abstractC4712;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC4743 m1662(@InterfaceC6399 C6504 c6504, @InterfaceC6399 C7031 c7031) {
        C5499.m17103(c6504, "client");
        C5499.m17103(c7031, "chain");
        try {
            return m14302(c7031.m21887(), c7031.m21889(), c7031.m21891(), c6504.m20651(), c6504.m20657(), !C5499.m17094(c7031.m21890().m22156(), "GET")).m21867(c6504, c7031);
        } catch (C7186 e) {
            m14307(e.m22509());
            throw e;
        } catch (IOException e2) {
            m14307(e2);
            throw new C7186(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7026 m1663(int i, int i2, int i3, int i4, boolean z) throws IOException {
        List<C7184> listM3477;
        Socket socketM21835;
        if (this.f10196.mo9975()) {
            throw new IOException("Canceled");
        }
        C7026 c7026M21824 = this.f10196.m21824();
        if (c7026M21824 != null) {
            synchronized (c7026M21824) {
                try {
                    socketM21835 = (c7026M21824.m21861() || !m14306(c7026M21824.mo1066().m22504().m6514())) ? this.f10196.m21835() : null;
                    C8107 c8107 = C8107.f3222;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f10196.m21824() != null) {
                if (socketM21835 == null) {
                    return c7026M21824;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (socketM21835 != null) {
                C8158.m26846(socketM21835);
            }
            this.f10197.mo14058(this.f10196, c7026M21824);
        }
        this.f10200 = 0;
        this.f10201 = 0;
        this.f10202 = 0;
        if (this.f1092.m3324(this.f1093, this.f10196, null, false)) {
            C7026 c7026M218242 = this.f10196.m21824();
            C5499.m17100(c7026M218242);
            this.f10197.mo14057(this.f10196, c7026M218242);
            return c7026M218242;
        }
        C7184 c7184M22515 = this.f10203;
        try {
            if (c7184M22515 == null) {
                C7187.C1202 c1202 = this.f10198;
                if (c1202 != null) {
                    C5499.m17100(c1202);
                    if (c1202.m3478()) {
                        C7187.C1202 c12022 = this.f10198;
                        C5499.m17100(c12022);
                        c7184M22515 = c12022.m22515();
                    }
                }
                C7187 c7187 = this.f10199;
                if (c7187 == null) {
                    c7187 = new C7187(this.f1093, this.f10196.m21823().m20645(), this.f10196, this.f10197);
                    this.f10199 = c7187;
                }
                C7187.C1202 c1202M22511 = c7187.m22511();
                this.f10198 = c1202M22511;
                listM3477 = c1202M22511.m3477();
                if (this.f10196.mo9975()) {
                    throw new IOException("Canceled");
                }
                if (this.f1092.m3324(this.f1093, this.f10196, listM3477, false)) {
                    C7026 c7026M218243 = this.f10196.m21824();
                    C5499.m17100(c7026M218243);
                    this.f10197.mo14057(this.f10196, c7026M218243);
                    return c7026M218243;
                }
                c7184M22515 = c1202M22511.m22515();
                C7026 c7026 = new C7026(this.f1092, c7184M22515);
                this.f10196.m21837(c7026);
                c7026.m21850(i, i2, i3, i4, z, this.f10196, this.f10197);
                this.f10196.m21837(null);
                this.f10196.m21823().m20645().m3470(c7026.mo1066());
                if (this.f1092.m3324(this.f1093, this.f10196, listM3477, true)) {
                    synchronized (c7026) {
                        this.f1092.m21883(c7026);
                        this.f10196.m21816(c7026);
                        C8107 c81072 = C8107.f3222;
                    }
                    this.f10197.mo14057(this.f10196, c7026);
                    return c7026;
                }
                C7026 c7026M218244 = this.f10196.m21824();
                C5499.m17100(c7026M218244);
                this.f10203 = c7184M22515;
                C8158.m26846(c7026.mo11696());
                this.f10197.mo14057(this.f10196, c7026M218244);
                return c7026M218244;
            }
            C5499.m17100(c7184M22515);
            this.f10203 = null;
            c7026.m21850(i, i2, i3, i4, z, this.f10196, this.f10197);
            this.f10196.m21837(null);
            this.f10196.m21823().m20645().m3470(c7026.mo1066());
            if (this.f1092.m3324(this.f1093, this.f10196, listM3477, true)) {
            }
        } catch (Throwable th2) {
            this.f10196.m21837(null);
            throw th2;
        }
        listM3477 = null;
        C7026 c70262 = new C7026(this.f1092, c7184M22515);
        this.f10196.m21837(c70262);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C7026 m14302(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        while (true) {
            C7026 c7026M1663 = m1663(i, i2, i3, i4, z);
            if (c7026M1663.m21865(z2)) {
                return c7026M1663;
            }
            c7026M1663.m21870();
            if (this.f10203 == null) {
                C7187.C1202 c1202 = this.f10198;
                if (c1202 != null ? c1202.m3478() : true) {
                    continue;
                } else {
                    C7187 c7187 = this.f10199;
                    if (!(c7187 != null ? c7187.m3474() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C3175 m14303() {
        return this.f1093;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m14304() {
        C7187 c7187;
        if (this.f10200 == 0 && this.f10201 == 0 && this.f10202 == 0) {
            return false;
        }
        if (this.f10203 != null) {
            return true;
        }
        C7184 c7184M14305 = m14305();
        if (c7184M14305 != null) {
            this.f10203 = c7184M14305;
            return true;
        }
        C7187.C1202 c1202 = this.f10198;
        if ((c1202 == null || !c1202.m3478()) && (c7187 = this.f10199) != null) {
            return c7187.m3474();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C7184 m14305() {
        C7026 c7026M21824;
        if (this.f10200 > 1 || this.f10201 > 1 || this.f10202 > 0 || (c7026M21824 = this.f10196.m21824()) == null) {
            return null;
        }
        synchronized (c7026M21824) {
            if (c7026M21824.m21862() != 0) {
                return null;
            }
            if (C8158.m26841(c7026M21824.mo1066().m22504().m6514(), this.f1093.m6514())) {
                return c7026M21824.mo1066();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m14306(@InterfaceC6399 C5385 c5385) {
        C5499.m17103(c5385, "url");
        C5385 c5385M6514 = this.f1093.m6514();
        return c5385.m16779() == c5385M6514.m16779() && C5499.m17094(c5385.m16772(), c5385M6514.m16772());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m14307(@InterfaceC6399 IOException iOException) {
        C5499.m17103(iOException, "e");
        this.f10203 = null;
        if ((iOException instanceof C7604) && ((C7604) iOException).f23014 == EnumC4660.REFUSED_STREAM) {
            this.f10200++;
        } else if (iOException instanceof C4109) {
            this.f10201++;
        } else {
            this.f10202++;
        }
    }
}
