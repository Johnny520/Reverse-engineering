package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class CommandLineReader extends java.io.FilterReader {
    static final int lastCharNL = 1;
    static final int normal = 0;
    static final int sentSemi = 2;
    int state;

    public CommandLineReader(java.io.Reader r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.state = r1
            return
    }

    public static void main(java.lang.String[] r2) {
            bsh.CommandLineReader r2 = new bsh.CommandLineReader
            bsh.FileReader r0 = new bsh.FileReader
            java.io.InputStream r1 = java.lang.System.in
            r0.<init>(r1)
            r2.<init>(r0)
        Lc:
            java.io.PrintStream r0 = java.lang.System.out
            int r1 = r2.read()
            r0.println(r1)
            goto Lc
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() {
            r5 = this;
            int r0 = r5.state
            r1 = 10
            r2 = 1
            r3 = 2
            if (r0 != r3) goto Lb
            r5.state = r2
            return r1
        Lb:
            java.io.Reader r0 = r5.in
            int r0 = r0.read()
            r4 = 13
            if (r0 != r4) goto L16
            goto Lb
        L16:
            if (r0 != r1) goto L24
            int r1 = r5.state
            if (r1 != r2) goto L21
            r5.state = r3
            r0 = 59
            return r0
        L21:
            r5.state = r2
            return r0
        L24:
            r1 = 0
            r5.state = r1
            return r0
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] r2, int r3, int r4) {
            r1 = this;
            int r4 = r1.read()
            r0 = -1
            if (r4 != r0) goto L8
            return r0
        L8:
            char r4 = (char) r4
            r2[r3] = r4
            r2 = 1
            return r2
    }
}
