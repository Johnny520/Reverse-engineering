package p134j6;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: renamed from: j6.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2079q extends Writer {

    /* JADX INFO: renamed from: g */
    public final Appendable f6982g;

    /* JADX INFO: renamed from: h */
    public final C2078p f6983h = new C2078p();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2079q(Appendable appendable) {
        this.f6982g = appendable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.f6982g.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i9, int i10) throws IOException {
        C2078p c2078p = this.f6983h;
        c2078p.f6980g = cArr;
        c2078p.f6981h = null;
        this.f6982g.append(c2078p, i9, i10 + i9);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        this.f6982g.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i9, int i10) throws IOException {
        this.f6982g.append(charSequence, i9, i10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i9, int i10) throws IOException {
        this.f6982g.append(charSequence, i9, i10);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i9, int i10) throws IOException {
        Objects.requireNonNull(str);
        this.f6982g.append(str, i9, i10 + i9);
    }

    @Override // java.io.Writer
    public final void write(int i9) throws IOException {
        this.f6982g.append((char) i9);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
