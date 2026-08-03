package bsh;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class CommandLineReader extends FilterReader {
    static final int lastCharNL = 1;
    static final int normal = 0;
    static final int sentSemi = 2;
    int state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CommandLineReader(Reader reader) {
        super(reader);
        this.state = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void main(String[] strArr) {
        while (true) {
            System.out.println(new CommandLineReader(new FileReader(System.in)).read());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i9;
        if (this.state == 2) {
            this.state = 1;
            return 10;
        }
        do {
            i9 = ((FilterReader) this).in.read();
        } while (i9 == 13);
        if (i9 != 10) {
            this.state = 0;
            return i9;
        }
        if (this.state == 1) {
            this.state = 2;
            return 59;
        }
        this.state = 1;
        return i9;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i9, int i10) throws IOException {
        int i11 = read();
        if (i11 == -1) {
            return -1;
        }
        cArr[i9] = (char) i11;
        return 1;
    }
}
