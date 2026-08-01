package p117i;

import p024b9.AbstractC1061t;
import p132j.AbstractC3489a;

/* JADX INFO: renamed from: i.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3048e {
    /* JADX INFO: renamed from: a */
    public static final void m11275a(C3042c c3042c, int i10) {
        c3042c.getClass();
        c3042c.m11250r(new int[i10]);
        c3042c.m11249q(new Object[i10]);
    }

    /* JADX INFO: renamed from: b */
    public static final int m11276b(C3042c c3042c, int i10) {
        c3042c.getClass();
        try {
            return AbstractC3489a.m13004a(c3042c.m11245e(), c3042c.m11247o(), i10);
        } catch (IndexOutOfBoundsException unused) {
            C3039b.m11232a();
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m11277c(C3042c c3042c, Object obj, int i10) {
        c3042c.getClass();
        int iM11247o = c3042c.m11247o();
        if (iM11247o == 0) {
            return -1;
        }
        int iM11276b = m11276b(c3042c, i10);
        if (iM11276b < 0 || AbstractC1061t.m3842c(obj, c3042c.m11244c()[iM11276b])) {
            return iM11276b;
        }
        int i11 = iM11276b + 1;
        while (i11 < iM11247o && c3042c.m11245e()[i11] == i10) {
            if (AbstractC1061t.m3842c(obj, c3042c.m11244c()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM11276b - 1; i12 >= 0 && c3042c.m11245e()[i12] == i10; i12--) {
            if (AbstractC1061t.m3842c(obj, c3042c.m11244c()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    /* JADX INFO: renamed from: d */
    public static final int m11278d(C3042c c3042c) {
        c3042c.getClass();
        return m11277c(c3042c, null, 0);
    }
}
