package p208n4;

import java.io.IOException;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n4.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2710i implements InterfaceC2722u {

    /* JADX INFO: renamed from: d */
    public final InterfaceC2722u f8634d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2710i(InterfaceC2722u interfaceC2722u) {
        AbstractC1665j.m2985e(interfaceC2722u, "delegate");
        this.f8634d = interfaceC2722u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f8634d.mo3157a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8634d.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f8634d + ')';
    }
}
