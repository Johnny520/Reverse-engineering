package p239q5;

import okhttp3.internal.http2.Http2;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: q5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6247a {
    /* JADX INFO: renamed from: a */
    public static String m24647a(int i10) {
        return m24649c(i10, 30257, 1);
    }

    /* JADX INFO: renamed from: b */
    public static String m24648b(int i10) {
        return m24649c(i10, 20703, 2);
    }

    /* JADX INFO: renamed from: c */
    public static String m24649c(int i10, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(80);
        int i13 = (~i11) & i10;
        int i14 = i10 & i11;
        if ((i14 & 1) != 0) {
            sb2.append("|public");
        }
        if ((i14 & 2) != 0) {
            sb2.append("|private");
        }
        if ((i14 & 4) != 0) {
            sb2.append("|protected");
        }
        if ((i14 & 8) != 0) {
            sb2.append("|static");
        }
        if ((i14 & 16) != 0) {
            sb2.append("|final");
        }
        if ((i14 & 32) != 0) {
            if (i12 == 1) {
                sb2.append("|super");
            } else {
                sb2.append("|synchronized");
            }
        }
        if ((i14 & 64) != 0) {
            if (i12 == 3) {
                sb2.append("|bridge");
            } else {
                sb2.append("|volatile");
            }
        }
        if ((i14 & 128) != 0) {
            if (i12 == 3) {
                sb2.append("|varargs");
            } else {
                sb2.append("|transient");
            }
        }
        if ((i14 & 256) != 0) {
            sb2.append("|native");
        }
        if ((i14 & 512) != 0) {
            sb2.append("|interface");
        }
        if ((i14 & 1024) != 0) {
            sb2.append("|abstract");
        }
        if ((i14 & 2048) != 0) {
            sb2.append("|strictfp");
        }
        if ((i14 & 4096) != 0) {
            sb2.append("|synthetic");
        }
        if ((i14 & 8192) != 0) {
            sb2.append("|annotation");
        }
        if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            sb2.append("|enum");
        }
        if ((65536 & i14) != 0) {
            sb2.append("|constructor");
        }
        if ((i14 & 131072) != 0) {
            sb2.append("|declared_synchronized");
        }
        if (i13 != 0 || sb2.length() == 0) {
            sb2.append('|');
            sb2.append(AbstractC8826h.m33898g(i13));
        }
        return sb2.substring(1);
    }

    /* JADX INFO: renamed from: d */
    public static String m24650d(int i10) {
        return m24649c(i10, 30239, 1);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m24651e(int i10) {
        return (i10 & 1024) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m24652f(int i10) {
        return (i10 & 8192) != 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m24653g(int i10) {
        return (i10 & 256) != 0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24654h(int i10) {
        return (i10 & 2) != 0;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m24655i(int i10) {
        return (i10 & 8) != 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m24656j(int i10) {
        return (i10 & 32) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static String m24657k(int i10) {
        return m24649c(i10, 204287, 3);
    }
}
