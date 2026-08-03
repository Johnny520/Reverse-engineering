package Yue;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5715 implements InterfaceC7326<String> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final BufferedReader f1631;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۥ$ۥ */
    public static final class C0846 implements Iterator<String>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6489
        public String f14127;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f14128;

        public C0846() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f14127 == null && !this.f14128) {
                String line = C5715.this.f1631.readLine();
                this.f14127 = line;
                if (line == null) {
                    this.f14128 = true;
                }
            }
            return this.f14127 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f14127;
            this.f14127 = null;
            C5499.m17100(str);
            return str;
        }
    }

    public C5715(@InterfaceC6399 BufferedReader bufferedReader) {
        C5499.m17103(bufferedReader, "reader");
        this.f1631 = bufferedReader;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<String> iterator() {
        return new C0846();
    }
}
