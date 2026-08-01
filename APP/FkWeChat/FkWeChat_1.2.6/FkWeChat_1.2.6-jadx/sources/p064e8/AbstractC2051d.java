package p064e8;

import java.io.EOFException;
import p215oc.C5708d;
import p215oc.InterfaceC5728w;

/* JADX INFO: renamed from: e8.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2051d {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5728w f5764a = new C5708d();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5728w m7397a(InterfaceC5728w interfaceC5728w) {
        interfaceC5728w.getClass();
        return interfaceC5728w.peek();
    }

    /* JADX INFO: renamed from: b */
    public static final long m7398b(InterfaceC5728w interfaceC5728w, long j10) throws EOFException {
        interfaceC5728w.getClass();
        interfaceC5728w.mo23110i(j10);
        long jMin = Math.min(j10, m7400d(interfaceC5728w));
        interfaceC5728w.mo23102b().skip(jMin);
        return jMin;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m7399c(InterfaceC5728w interfaceC5728w, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return m7398b(interfaceC5728w, j10);
    }

    /* JADX INFO: renamed from: d */
    public static final long m7400d(InterfaceC5728w interfaceC5728w) {
        interfaceC5728w.getClass();
        return interfaceC5728w.mo23102b().m23111j();
    }
}
