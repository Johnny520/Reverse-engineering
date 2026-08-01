package p320w3;

import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: w3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9170c {
    /* JADX INFO: renamed from: a */
    public static void m35612a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m35613b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        C9987e.m38645a(str);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static Object m35614c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m35615d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* JADX INFO: renamed from: e */
    public static void m35616e(boolean z10, String str) {
        if (z10) {
            return;
        }
        C10010p0.m38820a(str);
    }
}
