package io.ktor.utils.p131io;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: io.ktor.utils.io.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3459b0 {

    /* JADX INFO: renamed from: b */
    public static final a f9556b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f9557c;

    /* JADX INFO: renamed from: d */
    public static final int f9558d;

    /* JADX INFO: renamed from: e */
    public static final int f9559e;

    /* JADX INFO: renamed from: f */
    public static final int f9560f;

    /* JADX INFO: renamed from: g */
    public static final List f9561g;

    /* JADX INFO: renamed from: a */
    public final int f9562a;

    static {
        int iM12912e = m12912e(1);
        f9557c = iM12912e;
        int iM12912e2 = m12912e(2);
        f9558d = iM12912e2;
        int iM12912e3 = m12912e(4);
        f9559e = iM12912e3;
        f9560f = m12912e(7);
        f9561g = AbstractC5114x.m20803r(m12911d(iM12912e), m12911d(iM12912e2), m12911d(iM12912e3));
    }

    public /* synthetic */ C3459b0(int i10) {
        this.f9562a = i10;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C3459b0 m12911d(int i10) {
        return new C3459b0(i10);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m12913f(int i10, int i11) {
        return (i11 | i10) == i10;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12914g(int i10, Object obj) {
        return (obj instanceof C3459b0) && i10 == ((C3459b0) obj).m12919l();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m12915h(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: i */
    public static int m12916i(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: j */
    public static final int m12917j(int i10, int i11) {
        return m12912e(i10 | i11);
    }

    /* JADX INFO: renamed from: k */
    public static String m12918k(int i10) {
        if (m12915h(i10, f9557c)) {
            return "CR";
        }
        if (m12915h(i10, f9558d)) {
            return "LF";
        }
        if (m12915h(i10, f9559e)) {
            return "CRLF";
        }
        List list = f9561g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m12913f(i10, ((C3459b0) obj).m12919l())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public boolean equals(Object obj) {
        return m12914g(this.f9562a, obj);
    }

    public int hashCode() {
        return m12916i(this.f9562a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int m12919l() {
        return this.f9562a;
    }

    public String toString() {
        return m12918k(this.f9562a);
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.b0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m12920a() {
            return C3459b0.f9557c;
        }

        /* JADX INFO: renamed from: b */
        public final int m12921b() {
            return C3459b0.f9559e;
        }

        /* JADX INFO: renamed from: c */
        public final int m12922c() {
            return C3459b0.f9558d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m12912e(int i10) {
        return i10;
    }
}
