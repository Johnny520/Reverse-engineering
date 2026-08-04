package yyds;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲁᛲᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2184 implements InterfaceC0124, InterfaceC1062 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public InterfaceC2213 f10739;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0698 f10740;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0124 f10741;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Throwable f10742;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC1062 f10743;

    public C2184(InterfaceC0124 interfaceC0124) {
        C2255 c2255 = new C2255();
        this.f10741 = interfaceC0124;
        this.f10743 = c2255;
        this.f10740 = new C0698(this);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        C0698 c0698 = this.f10740;
        if (c0698 != null) {
            c0698.m2549(-1);
        }
        this.f10741.close();
    }

    public final String toString() {
        return this.f10741.toString();
    }

    @Override // yyds.InterfaceC1062
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo2251(Object obj) {
        this.f10743.mo2251(null);
    }

    @Override // yyds.InterfaceC0124
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ */
    public final boolean mo574() {
        return this.f10741.mo574();
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4175(StringBuilder sb) {
        int i;
        if (this.f10739 == null && this.f10742 == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            InterfaceC2213 interfaceC2213 = this.f10739;
            if (interfaceC2213 != null) {
                sb.append("\t\tCoroutine: " + interfaceC2213);
                sb.append('\n');
            }
            Throwable th = this.f10742;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                Iterator it = AbstractC1595.m3264(1, AbstractC0473.m1316(stringWriter.toString())).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.f10740 != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            C0698 c0698 = this.f10740;
            synchronized (((C1586) c0698.f5886)) {
                i = c0698.f5887;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // yyds.InterfaceC0124
    /* JADX INFO: renamed from: ᲀᛲᛱᛱ */
    public final InterfaceC1212 mo575(String str) {
        C0698 c0698 = this.f10740;
        return c0698 != null ? new C1032((InterfaceC1212) c0698.m2548(str)) : this.f10741.mo575(str);
    }

    @Override // yyds.InterfaceC1062
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Object mo2252(AbstractC1320 abstractC1320) {
        return this.f10743.mo2252(abstractC1320);
    }
}
