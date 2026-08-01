package p358y9;

import java.util.List;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p214ob.AbstractC5701a;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: y9.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9636n0 {
    /* JADX INFO: renamed from: a */
    public static final List m37687a(C5695f c5695f) {
        c5695f.getClass();
        String strM23030c = c5695f.m23030c();
        strM23030c.getClass();
        return C9624h0.m37641c(strM23030c) ? AbstractC5114x.m20804s(m37688b(c5695f)) : C9624h0.m37642d(strM23030c) ? m37692f(c5695f) : C9627j.f32785a.m37655b(c5695f);
    }

    /* JADX INFO: renamed from: b */
    public static final C5695f m37688b(C5695f c5695f) {
        c5695f.getClass();
        C5695f c5695fM37691e = m37691e(c5695f, "get", false, null, 12, null);
        return c5695fM37691e == null ? m37691e(c5695f, "is", false, null, 8, null) : c5695fM37691e;
    }

    /* JADX INFO: renamed from: c */
    public static final C5695f m37689c(C5695f c5695f, boolean z10) {
        c5695f.getClass();
        return m37691e(c5695f, "set", false, z10 ? "is" : null, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public static final C5695f m37690d(C5695f c5695f, String str, boolean z10, String str2) {
        if (c5695f.m23033k()) {
            return null;
        }
        String strM23032h = c5695f.m23032h();
        strM23032h.getClass();
        if (!AbstractC8611a0.m33075T(strM23032h, str, false, 2, null) || strM23032h.length() == str.length()) {
            return null;
        }
        char cCharAt = strM23032h.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return C5695f.m23027j(str2 + AbstractC8621f0.m33102I0(strM23032h, str));
        }
        if (!z10) {
            return c5695f;
        }
        String strM23075c = AbstractC5701a.m23075c(AbstractC8621f0.m33102I0(strM23032h, str), true);
        if (C5695f.m23028l(strM23075c)) {
            return C5695f.m23027j(strM23075c);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C5695f m37691e(C5695f c5695f, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return m37690d(c5695f, str, z10, str2);
    }

    /* JADX INFO: renamed from: f */
    public static final List m37692f(C5695f c5695f) {
        c5695f.getClass();
        return AbstractC5114x.m20805t(m37689c(c5695f, false), m37689c(c5695f, true));
    }
}
