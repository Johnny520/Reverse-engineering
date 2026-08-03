package p000;

import java.io.IOException;

/* JADX INFO: renamed from: B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0043B implements InterfaceC0464Kr {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: b */
    public abstract int mo63b(InterfaceC2253mx r1);

    /* JADX INFO: renamed from: c */
    public final String m64c(String r3) {
        return "Serializing " + getClass().getName() + " to a " + r3 + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2548tj mo65d();

    /* JADX INFO: renamed from: e */
    public final byte[] m66e() {
        int r0 = ((AbstractC2634vj) this).mo63b(null);     // Catch: IOException -> L7
        byte[] r1 = new byte[r0];     // Catch: IOException -> L7
        C2230ma r2 = new C2230ma(r0, r1);     // Catch: IOException -> L7
        mo67f(r2);     // Catch: IOException -> L7
        if ((r0 - r2.f7802i) != 0) goto L6;
        return r1;
    L6:
        throw new IllegalStateException("Did not write as much data as expected.");     // Catch: IOException -> L7
    L7:
        e = move-exception;
        throw new RuntimeException(m64c("byte array"), e);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo67f(C2230ma r1);
}
