package bsh;

import java.util.ListIterator;

/* JADX INFO: renamed from: bsh.h3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1188h3 extends ListIterator {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC1188h3 f3612c = new a(-1);

    /* JADX INFO: renamed from: bsh.h3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a extends AbstractC1195i4 {
        private static final long serialVersionUID = 1;

        public a(int i10) {
            super(i10);
        }

        @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
        /* JADX INFO: renamed from: a */
        public String mo4038a() {
            return "<Called from Java Code>";
        }

        @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
        public int getLineNumber() {
            return -1;
        }

        @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
        public String getText() {
            return "<Compiled Java Code>";
        }

        @Override // bsh.AbstractC1195i4
        public String toString() {
            return "JavaCode";
        }
    }

    /* JADX INFO: renamed from: a */
    String mo4038a();

    /* JADX INFO: renamed from: e */
    void mo4040e();

    int getLineNumber();

    String getText();

    /* JADX INFO: renamed from: j */
    void mo4045j(InterfaceC1188h3 interfaceC1188h3, int i10);

    /* JADX INFO: renamed from: m */
    void mo4046m(InterfaceC1188h3 interfaceC1188h3);

    /* JADX INFO: renamed from: n */
    void mo4047n(String str);

    /* JADX INFO: renamed from: p */
    Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2);

    /* JADX INFO: renamed from: q */
    InterfaceC1188h3[] mo4049q();

    /* JADX INFO: renamed from: r */
    int mo4050r();

    /* JADX INFO: renamed from: s */
    InterfaceC1188h3 mo4051s(int i10);

    /* JADX INFO: renamed from: t */
    void mo4052t();

    /* JADX INFO: renamed from: u */
    void mo4053u(String str);

    /* JADX INFO: renamed from: w */
    InterfaceC1188h3 mo4054w();
}
