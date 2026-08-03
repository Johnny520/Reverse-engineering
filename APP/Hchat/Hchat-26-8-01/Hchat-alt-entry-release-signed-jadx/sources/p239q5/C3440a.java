package p239q5;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import p012ah.C0086a;
import p021b6.C0193a;
import p021b6.C0194b;
import p021b6.C0195c;
import p021b6.C0196d;
import p021b6.C0197e;
import p021b6.C0198f;
import p021b6.C0199g;
import p021b6.C0201i;
import p033c6.C0403a;
import p074f5.AbstractC1068d;
import p122i5.AbstractC1986a;
import p122i5.AbstractC1987b;
import p136j8.C2104o;
import p150k5.C2247c;
import p193n5.C2894a;
import p193n5.C2896c;
import p193n5.C2897d;
import p193n5.C2899f;
import p222p.AbstractC3199a;
import p228p5.C3322a;
import p228p5.C3323b;
import p228p5.C3324c;
import p228p5.C3325d;
import p228p5.C3326e;
import p228p5.C3327f;
import p228p5.C3328g;
import p228p5.C3329h;
import p228p5.C3330i;
import p312v5.InterfaceC4479b;
import p312v5.InterfaceC4480c;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: q5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3440a extends Writer {

    /* JADX INFO: renamed from: g */
    public final Writer f11157g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3440a(Writer writer) {
        this.f11157g = writer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void mo2072a(C3322a c3322a) throws IOException {
        Writer writer = this.f11157g;
        writer.write("Annotation[");
        m7221t(c3322a.getType());
        for (C2247c c2247c : c3322a.m7042a()) {
            writer.write(", ");
            mo2079s(c2247c.m5494a());
            writer.write(61);
            mo2076g(c2247c.m5495b());
        }
        writer.write(93);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        return this.f11157g.append(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo2073b(C3323b c3323b) throws IOException {
        Writer writer = this.f11157g;
        writer.write("Array[");
        boolean z9 = true;
        for (InterfaceC4686a interfaceC4686a : c3323b.m7043a()) {
            if (z9) {
                z9 = false;
            } else {
                writer.write(", ");
            }
            mo2076g(interfaceC4686a);
        }
        writer.write(93);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void mo2074c(C2894a c2894a) throws IOException {
        mo2079s(c2894a.getName());
        Writer writer = this.f11157g;
        writer.write(40);
        m7218m(c2894a.m6297h1());
        writer.write(", ");
        m7217l(c2894a.m6298i1());
        for (InterfaceC4686a interfaceC4686a : c2894a.m6295f1()) {
            writer.write(", ");
            mo2076g(interfaceC4686a);
        }
        writer.write(")@");
        if (c2894a.m6296g1().m6301g1() == 4) {
            mo2078i((AbstractC1987b) c2894a.m6296g1().m6300f1());
        } else {
            C2104o.m5294t("The linker method handle for a call site must be of type invoke-static");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f11157g.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void mo2075e(CharSequence charSequence) throws IOException {
        char cCharAt = charSequence.charAt(0);
        Writer writer = this.f11157g;
        writer.write(cCharAt);
        int i9 = 1;
        int i10 = 1;
        while (true) {
            if (i9 >= charSequence.length()) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i9);
            if (cCharAt2 == '/') {
                if (i9 == i10) {
                    C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
                    return;
                } else {
                    mo2079s(charSequence.subSequence(i10, i9));
                    writer.write(charSequence.charAt(i9));
                    i10 = i9 + 1;
                }
            } else if (cCharAt2 == ';') {
                if (i9 == i10) {
                    C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
                    return;
                } else {
                    mo2079s(charSequence.subSequence(i10, i9));
                    writer.write(charSequence.charAt(i9));
                }
            }
            i9++;
        }
        if (i9 == charSequence.length() - 1 && charSequence.charAt(i9) == ';') {
            return;
        }
        C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f11157g.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void mo2076g(InterfaceC4686a interfaceC4686a) throws IOException {
        int iMo863h = interfaceC4686a.mo863h();
        Writer writer = this.f11157g;
        if (iMo863h == 0) {
            writer.write(String.format("0x%x", Byte.valueOf(((C0194b) interfaceC4686a).f493g)));
            return;
        }
        if (iMo863h == 6) {
            writer.write(String.format("0x%x", Long.valueOf(((C0199g) interfaceC4686a).f498g)));
            return;
        }
        if (iMo863h == 2) {
            writer.write(String.format("0x%x", Short.valueOf(((C0201i) interfaceC4686a).f500g)));
            return;
        }
        if (iMo863h == 3) {
            writer.write(String.format("0x%x", Integer.valueOf(((C0195c) interfaceC4686a).f494g)));
            return;
        }
        if (iMo863h == 4) {
            writer.write(String.format("0x%x", Integer.valueOf(((C0198f) interfaceC4686a).f497g)));
            return;
        }
        if (iMo863h == 16) {
            writer.write(Float.toString(((C0197e) interfaceC4686a).f496g));
            return;
        }
        if (iMo863h == 17) {
            writer.write(Double.toString(((C0196d) interfaceC4686a).f495g));
            return;
        }
        switch (iMo863h) {
            case 21:
                m7217l(((C3328g) interfaceC4686a).m7048a());
                break;
            case 22:
                m7216k(((C3327f) interfaceC4686a).m7047a());
                break;
            case 23:
                m7218m(((C3329h) interfaceC4686a).m7049a());
                break;
            case 24:
                m7221t(((C3330i) interfaceC4686a).m7050a());
                break;
            case 25:
                mo2077h(((C3325d) interfaceC4686a).m7045a());
                break;
            case 26:
                mo2078i(((C3326e) interfaceC4686a).m7046a());
                break;
            case 27:
                mo2077h(((C3324c) interfaceC4686a).m7044a());
                break;
            case 28:
                mo2073b((C3323b) interfaceC4686a);
                break;
            case 29:
                mo2072a((C3322a) interfaceC4686a);
                break;
            case 30:
                writer.write("null");
                break;
            case 31:
                writer.write(Boolean.toString(((C0193a) interfaceC4686a).f492g));
                break;
            default:
                C2104o.m5294t("Unknown encoded value type");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void mo2077h(AbstractC1986a abstractC1986a) {
        m7221t(abstractC1986a.mo4927f1());
        Writer writer = this.f11157g;
        writer.write("->");
        mo2079s(abstractC1986a.getName());
        writer.write(58);
        m7221t(abstractC1986a.getType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void mo2078i(AbstractC1987b abstractC1987b) {
        m7221t(abstractC1987b.mo4929f1());
        Writer writer = this.f11157g;
        writer.write("->");
        mo2079s(abstractC1987b.getName());
        writer.write(40);
        Iterator it = abstractC1987b.mo4930g1().iterator();
        while (it.hasNext()) {
            m7221t((CharSequence) it.next());
        }
        writer.write(41);
        m7221t(abstractC1987b.mo4931h1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7216k(C2896c c2896c) {
        int iM6301g1 = c2896c.m6301g1();
        String str = (String) AbstractC1068d.f3429a.get(Integer.valueOf(iM6301g1));
        if (str == null) {
            throw new C0403a(null, "Invalid method handle type: %d", Integer.valueOf(iM6301g1));
        }
        Writer writer = this.f11157g;
        writer.write(str);
        writer.write(64);
        InterfaceC4479b interfaceC4479bM6300f1 = c2896c.m6300f1();
        if (interfaceC4479bM6300f1 instanceof AbstractC1987b) {
            mo2078i((AbstractC1987b) interfaceC4479bM6300f1);
        } else {
            mo2077h((AbstractC1986a) interfaceC4479bM6300f1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m7217l(C2897d c2897d) {
        Writer writer = this.f11157g;
        writer.write(40);
        Iterator it = c2897d.m6302e1().iterator();
        while (it.hasNext()) {
            m7221t((CharSequence) it.next());
        }
        writer.write(41);
        m7221t(c2897d.m6303f1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7218m(CharSequence charSequence) {
        Writer writer = this.f11157g;
        writer.write(34);
        String string = charSequence.toString();
        for (int i9 = 0; i9 < string.length(); i9++) {
            char cCharAt = string.charAt(i9);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    writer.write(92);
                }
                writer.write(cCharAt);
            } else if (cCharAt > 127) {
                writer.write("\\u");
                writer.write(Character.forDigit(cCharAt >> '\f', 16));
                writer.write(Character.forDigit((cCharAt >> '\b') & 15, 16));
                writer.write(Character.forDigit((cCharAt >> 4) & 15, 16));
                writer.write(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                writer.write("\\t");
            } else if (cCharAt == '\n') {
                writer.write("\\n");
            } else if (cCharAt == '\r') {
                writer.write("\\r");
            }
        }
        writer.write(34);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m7219o(InterfaceC4479b interfaceC4479b) throws IOException {
        if (interfaceC4479b instanceof C2899f) {
            m7218m((C2899f) interfaceC4479b);
            return;
        }
        if (interfaceC4479b instanceof InterfaceC4480c) {
            m7221t((InterfaceC4480c) interfaceC4479b);
            return;
        }
        if (interfaceC4479b instanceof AbstractC1986a) {
            mo2077h((AbstractC1986a) interfaceC4479b);
            return;
        }
        if (interfaceC4479b instanceof AbstractC1987b) {
            mo2078i((AbstractC1987b) interfaceC4479b);
            return;
        }
        if (interfaceC4479b instanceof C2897d) {
            m7217l((C2897d) interfaceC4479b);
            return;
        }
        if (interfaceC4479b instanceof C2896c) {
            m7216k((C2896c) interfaceC4479b);
        } else if (interfaceC4479b instanceof C2894a) {
            mo2074c((C2894a) interfaceC4479b);
        } else {
            C2104o.m5294t(AbstractC3199a.m6838k(interfaceC4479b.getClass(), "Not a known reference type: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m7220q(AbstractC1987b abstractC1987b) {
        mo2079s(abstractC1987b.getName());
        Writer writer = this.f11157g;
        writer.write(40);
        Iterator it = abstractC1987b.mo4930g1().iterator();
        while (it.hasNext()) {
            m7221t((CharSequence) it.next());
        }
        writer.write(41);
        m7221t(abstractC1987b.mo4931h1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void mo2079s(CharSequence charSequence) throws IOException {
        this.f11157g.append(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m7221t(CharSequence charSequence) {
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt == 'L') {
                mo2075e(charSequence.subSequence(i9, charSequence.length()));
                return;
            }
            Writer writer = this.f11157g;
            if (cCharAt != '[') {
                if (cCharAt != 'Z' && cCharAt != 'B' && cCharAt != 'S' && cCharAt != 'C' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'F' && cCharAt != 'D' && cCharAt != 'V') {
                    C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
                    return;
                }
                writer.write(cCharAt);
                if (i9 == charSequence.length() - 1) {
                    return;
                }
                C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
                return;
            }
            writer.write(cCharAt);
        }
        C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Writer
    public final void write(int i9) {
        this.f11157g.write(i9);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        this.f11157g.write(cArr);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        return this.f11157g.append(charSequence);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i9, int i10) {
        this.f11157g.write(cArr, i9, i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i9, int i10) {
        return this.f11157g.append(charSequence, i9, i10);
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        this.f11157g.write(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i9, int i10) {
        return this.f11157g.append(charSequence, i9, i10);
    }

    @Override // java.io.Writer
    public final void write(String str, int i9, int i10) throws IOException {
        this.f11157g.write(str, i9, i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c10) {
        return this.f11157g.append(c10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c10) {
        return this.f11157g.append(c10);
    }
}
