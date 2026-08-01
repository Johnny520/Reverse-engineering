package p106h5;

import java.io.OutputStream;
import java.io.PrintStream;
import p138j5.C3602d;
import p138j5.C3603e;

/* JADX INFO: renamed from: h5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2872a {

    /* JADX INFO: renamed from: a */
    public final C3602d f7528a;

    /* JADX INFO: renamed from: b */
    public final C3603e f7529b;

    /* JADX INFO: renamed from: c */
    public final PrintStream f7530c;

    /* JADX INFO: renamed from: d */
    public final PrintStream f7531d;

    /* JADX INFO: renamed from: e */
    public final PrintStream f7532e;

    public C2872a(OutputStream outputStream, OutputStream outputStream2) {
        this.f7528a = new C3602d();
        this.f7529b = new C3603e();
        this.f7532e = new PrintStream(new a());
        this.f7530c = new PrintStream(outputStream);
        this.f7531d = new PrintStream(outputStream2);
    }

    /* JADX INFO: renamed from: h5.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
        }
    }

    public C2872a() {
        this(System.out, System.err);
    }
}
