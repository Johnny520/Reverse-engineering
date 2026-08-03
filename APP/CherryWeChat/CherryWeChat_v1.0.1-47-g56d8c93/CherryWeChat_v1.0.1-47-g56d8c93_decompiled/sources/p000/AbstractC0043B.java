package p000;

import java.io.IOException;

/* JADX INFO: renamed from: B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0043B implements InterfaceC0464Kr {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: b */
    public abstract int mo63b(InterfaceC2253mx interfaceC2253mx);

    /* JADX INFO: renamed from: c */
    public final String m64c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC2548tj mo65d();

    /* JADX INFO: renamed from: e */
    public final byte[] m66e() {
        try {
            int iMo63b = ((AbstractC2634vj) this).mo63b(null);
            byte[] bArr = new byte[iMo63b];
            C2230ma c2230ma = new C2230ma(iMo63b, bArr);
            mo67f(c2230ma);
            if (iMo63b - c2230ma.f7802i == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m64c("byte array"), e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo67f(C2230ma c2230ma);
}
