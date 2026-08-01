package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pa0 implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public String f4793d;

    /* JADX INFO: renamed from: e */
    public boolean f4794e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ qa0 f4795f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pa0(qa0 qa0Var) {
        this.f4795f = qa0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f4793d == null && !this.f4794e) {
            String line = ((BufferedReader) this.f4795f.f5100b).readLine();
            this.f4793d = line;
            if (line == null) {
                this.f4794e = true;
            }
        }
        return this.f4793d != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0921xc.m5132m();
            return null;
        }
        String str = this.f4793d;
        this.f4793d = null;
        str.getClass();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
