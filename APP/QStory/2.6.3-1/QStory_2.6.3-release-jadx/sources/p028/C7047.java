package p028;

import androidx.compose.foundation.lazy.layout.C1575;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.AbstractC6019;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import okhttp3.internal.http2.ConnectionShutdownException;
import p020.C6928;
import p020.C6936;
import p023.AbstractC6957;
import p023.AbstractC6962;
import p023.C6954;
import p023.C6960;
import p023.C6961;
import p023.C6980;
import p023.InterfaceC6969;
import p023.InterfaceC6970;
import p027.C7022;
import p027.C7023;
import p027.C7032;
import p029.C7056;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7047 implements InterfaceC6969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7047 f17485 = new C7047();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01da A[Catch: IOException -> 0x00e3, TryCatch #4 {IOException -> 0x00e3, blocks: (B:56:0x00d9, B:60:0x00e6, B:74:0x0138, B:80:0x0146, B:81:0x014d, B:83:0x0150, B:86:0x0158, B:91:0x0163, B:99:0x01b9, B:101:0x01ca, B:104:0x01d4, B:111:0x01e9, B:114:0x01f6, B:115:0x021a, B:106:0x01da, B:98:0x01a8, B:117:0x021c, B:118:0x021f, B:68:0x010f, B:93:0x0182, B:97:0x018e), top: B:130:0x00d9, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0228 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // p023.InterfaceC6969
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6960 intercept(InterfaceC6970 interfaceC6970) throws IOException {
        C6961 c6961M2098;
        IOException iOException;
        ?? r14;
        C6980 c6980;
        AbstractC6957 abstractC6957;
        int i;
        C6960 c6960M12081;
        C7050 c7050 = (C7050) interfaceC6970;
        C1575 c1575 = c7050.f17490;
        c1575.getClass();
        C7032 c7032 = (C7032) c1575.f2416;
        InterfaceC7044 interfaceC7044 = (InterfaceC7044) c1575.f2414;
        C6954 c6954 = c7050.f17489;
        AbstractC6962 abstractC6962 = c6954.f17058;
        C6980 c69802 = c6954.f17059;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        ?? r142 = 1;
        boolean z2 = AbstractC5754.m10434(c6954.f17060) && abstractC6962 != null;
        boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(c69802.m12110("Connection"));
        try {
            try {
                interfaceC7044.mo12220(c6954);
                if (z2) {
                    try {
                        if ("100-continue".equalsIgnoreCase(c69802.m12110("Expect"))) {
                            try {
                                interfaceC7044.mo12218();
                                c6961M2098 = c1575.m2098(true);
                            } catch (IOException e) {
                                c1575.m2097(e);
                                throw e;
                            }
                        } else {
                            c6961M2098 = null;
                        }
                        if (c6961M2098 == null) {
                            try {
                                abstractC6962.getClass();
                                abstractC6962.getClass();
                                long jMo11713 = abstractC6962.mo11713();
                                C6936 c6936 = new C6936(new C7023(c1575, interfaceC7044.mo12227(c6954, jMo11713), jMo11713, false));
                                abstractC6962.mo11711(c6936);
                                c6936.close();
                                r142 = "upgrade";
                            } catch (IOException e2) {
                                e = e2;
                                r142 = "upgrade";
                                if ((e instanceof ConnectionShutdownException) || !c1575.f2417) {
                                    throw e;
                                }
                                iOException = e;
                                r14 = r142;
                            }
                        } else {
                            r142 = "upgrade";
                            try {
                                c7032.m12200(c1575, true, false, false, false, null);
                                if (!(c1575.m2100().f17468 != null)) {
                                    interfaceC7044.mo12226().mo12180();
                                }
                            } catch (IOException e3) {
                                e = e3;
                                if (e instanceof ConnectionShutdownException) {
                                }
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        r142 = "upgrade";
                        c6961M2098 = null;
                        if (e instanceof ConnectionShutdownException) {
                            throw e;
                        }
                        throw e;
                    }
                } else {
                    r142 = "upgrade";
                    c7032.m12200(c1575, true, false, false, false, null);
                    c6961M2098 = null;
                }
            } catch (IOException e5) {
                c1575.m2097(e5);
                throw e5;
            }
        } catch (IOException e6) {
            e = e6;
        }
        try {
            interfaceC7044.mo12223();
            iOException = null;
            r14 = r142;
            if (c6961M2098 == null) {
                try {
                    c6961M2098 = c1575.m2098(false);
                    c6961M2098.getClass();
                } catch (IOException e7) {
                    if (iOException == null) {
                        throw e7;
                    }
                    AbstractC6019.m10775(iOException, e7);
                    throw iOException;
                }
            }
            C6961 c6961 = c6961M2098;
            c6961.f17124 = c6954;
            c6961.f17120 = c1575.m2100().f17454;
            c6961.f17131 = jCurrentTimeMillis;
            c6961.f17126 = System.currentTimeMillis();
            C6960 c6960M120812 = c6961.m12081();
            int i2 = c6960M120812.f17111;
            while (true) {
                c6980 = c6960M120812.f17114;
                abstractC6957 = c6960M120812.f17115;
                if (i2 != 100 && (102 > i2 || i2 >= 200)) {
                    break;
                }
                C6961 c6961M20982 = c1575.m2098(false);
                c6961M20982.getClass();
                c6961M20982.f17124 = c6954;
                c6961M20982.f17120 = c1575.m2100().f17454;
                c6961M20982.f17131 = jCurrentTimeMillis;
                c6961M20982.f17126 = System.currentTimeMillis();
                c6960M120812 = c6961M20982.m12081();
                i2 = c6960M120812.f17111;
            }
            boolean z3 = i2 == 101;
            if (z3) {
                if (c1575.m2100().f17468 != null) {
                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                }
            }
            if (z3) {
                String strM12110 = c6980.m12110("Connection");
                if (strM12110 == null) {
                    strM12110 = null;
                }
                if (r14.equalsIgnoreCase(strM12110)) {
                    z = true;
                }
            }
            if (zEqualsIgnoreCase && z) {
                C6961 c6961M12079 = c6960M120812.m12079();
                c6961M12079.f17129 = new C7056(abstractC6957.mo11724(), abstractC6957.mo11725());
                c6961M12079.f17128 = c1575.m2102();
                c6960M12081 = c6961M12079.m12081();
                i = i2;
            } else {
                try {
                    String strM121102 = c6980.m12110("Content-Type");
                    String str = strM121102 == null ? null : strM121102;
                    long jMo12224 = interfaceC7044.mo12224(c6960M120812);
                    i = i2;
                    C7052 c7052 = new C7052(str, jMo12224, new C6928(new C7022(c1575, interfaceC7044.mo12219(c6960M120812), jMo12224, false)));
                    C6961 c6961M120792 = c6960M120812.m12079();
                    c6961M120792.f17129 = c7052;
                    c6961M120792.f17127 = new C7048();
                    c6960M12081 = c6961M120792.m12081();
                } catch (IOException e8) {
                    c1575.m2097(e8);
                    throw e8;
                }
            }
            C6954 c69542 = c6960M12081.f17118;
            c69542.getClass();
            if ("close".equalsIgnoreCase(c69542.f17059.m12110("Connection"))) {
                interfaceC7044.mo12226().mo12180();
            } else {
                String strM121103 = c6960M12081.f17114.m12110("Connection");
                if (strM121103 == null) {
                    strM121103 = null;
                }
                if ("close".equalsIgnoreCase(strM121103)) {
                }
            }
            if ((i != 204 && i != 205) || c6960M12081.f17115.mo11725() <= 0) {
                return c6960M12081;
            }
            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c6960M12081.f17115.mo11725());
        } catch (IOException e9) {
            c1575.m2097(e9);
            throw e9;
        }
    }
}
