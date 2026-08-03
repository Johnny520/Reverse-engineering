package p046d6;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: d6.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0710g extends Writer {

    /* JADX INFO: renamed from: j */
    public static final String f2129j = System.getProperty("line.separator");

    /* JADX INFO: renamed from: g */
    public final Writer f2130g;

    /* JADX INFO: renamed from: h */
    public int f2131h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f2132i = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0710g(Writer writer) {
        this.f2130g = writer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void mo829a() throws IOException {
        for (int i9 = 0; i9 < this.f2131h; i9++) {
            this.f2130g.write(32);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i9, int i10) throws IOException {
        write(charSequence.subSequence(i9, i10).toString());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2130g.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f2130g.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer
    public final void write(String str, int i9, int i10) throws IOException {
        int i11 = i10 + i9;
        int i12 = i9;
        while (i9 < i11) {
            i9 = str.indexOf(10, i12);
            Writer writer = this.f2130g;
            if (i9 == -1 || i9 >= i11) {
                int i13 = i11 - i12;
                if (this.f2132i && i13 > 0) {
                    mo829a();
                    this.f2132i = false;
                }
                writer.write(str, i12, i13);
                return;
            }
            int i14 = i9 - i12;
            if (this.f2132i && i14 > 0) {
                mo829a();
                this.f2132i = false;
            }
            writer.write(str, i12, i14);
            writer.write(f2129j);
            this.f2132i = true;
            i12 = i9 + 1;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i9, int i10) throws IOException {
        append(charSequence, i9, i10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        write(charSequence.toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c10) throws IOException {
        write(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c10) throws IOException {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i9, int i10) throws IOException {
        Writer writer;
        int i11 = i10 + i9;
        int i12 = i9;
        while (true) {
            writer = this.f2130g;
            if (i9 >= i11) {
                break;
            }
            if (cArr[i9] == '\n') {
                int i13 = i9 - i12;
                if (this.f2132i && i13 > 0) {
                    mo829a();
                    this.f2132i = false;
                }
                writer.write(cArr, i12, i13);
                writer.write(f2129j);
                this.f2132i = true;
                i12 = i9 + 1;
                i9 = i12;
            } else {
                i9++;
            }
        }
        int i14 = i9 - i12;
        if (this.f2132i && i14 > 0) {
            mo829a();
            this.f2132i = false;
        }
        writer.write(cArr, i12, i14);
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public final void write(int i9) throws IOException {
        Writer writer = this.f2130g;
        if (i9 == 10) {
            writer.write(f2129j);
            this.f2132i = true;
        } else {
            if (this.f2132i) {
                mo829a();
            }
            this.f2132i = false;
            writer.write(i9);
        }
    }
}
