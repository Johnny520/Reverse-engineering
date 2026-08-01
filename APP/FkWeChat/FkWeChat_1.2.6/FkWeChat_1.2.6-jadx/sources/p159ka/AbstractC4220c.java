package p159ka;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import p143ja.C3781n;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p325w8.AbstractC9202b;
import qa.C6351h;

/* JADX INFO: renamed from: ka.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4220c {
    /* JADX INFO: renamed from: a */
    public static final C4711r m16710a(InputStream inputStream) throws IllegalAccessException, IOException, InvocationTargetException {
        C3781n c3781nM14586W;
        inputStream.getClass();
        try {
            C4218a c4218aM16708a = C4218a.f12395g.m16708a(inputStream);
            if (c4218aM16708a.m16707h()) {
                C6351h c6351hM25182d = C6351h.m25182d();
                AbstractC4219b.m16709a(c6351hM25182d);
                c3781nM14586W = C3781n.m14586W(inputStream, c6351hM25182d);
            } else {
                c3781nM14586W = null;
            }
            C4711r c4711rM18815a = AbstractC4717x.m18815a(c3781nM14586W, c4218aM16708a);
            AbstractC9202b.m35830a(inputStream, null);
            return c4711rM18815a;
        } finally {
        }
    }
}
