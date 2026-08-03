package p000a;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.D9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0066D9 implements InterfaceC0286Pd<String> {

    /* JADX INFO: renamed from: a */
    public final BufferedReader f214a;

    /* JADX INFO: renamed from: a.D9$a */
    public static final class a implements Iterator<String>, InterfaceC0783q9 {

        /* JADX INFO: renamed from: a */
        public String f215a;

        /* JADX INFO: renamed from: b */
        public boolean f216b;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.f215a == null && !this.f216b) {
                String line = C0066D9.this.f214a.readLine();
                this.f215a = line;
                if (line == null) {
                    this.f216b = true;
                }
            }
            return this.f215a != null;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f215a;
            this.f215a = null;
            C0631i9.m1479b(str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0066D9(BufferedReader bufferedReader) {
        this.f214a = bufferedReader;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<String> iterator() {
        return new a();
    }
}
