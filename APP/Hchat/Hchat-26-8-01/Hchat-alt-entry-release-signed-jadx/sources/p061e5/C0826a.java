package p061e5;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p012ah.C0086a;
import p021b6.C0193a;
import p021b6.C0194b;
import p021b6.C0195c;
import p021b6.C0196d;
import p021b6.C0197e;
import p021b6.C0198f;
import p021b6.C0199g;
import p021b6.C0201i;
import p046d6.C0710g;
import p122i5.AbstractC1986a;
import p122i5.AbstractC1987b;
import p136j8.C2104o;
import p150k5.C2247c;
import p193n5.C2894a;
import p228p5.C3322a;
import p228p5.C3323b;
import p228p5.C3324c;
import p228p5.C3325d;
import p228p5.C3326e;
import p228p5.C3327f;
import p228p5.C3328g;
import p228p5.C3329h;
import p228p5.C3330i;
import p239q5.C3440a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: e5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0826a extends C3440a {

    /* JADX INFO: renamed from: h */
    public final String f2473h;

    /* JADX INFO: renamed from: i */
    public final char[] f2474i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0826a(Writer writer, String str) {
        super(writer instanceof C0710g ? writer : new C0710g(writer));
        this.f2474i = new char[24];
        this.f2473h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m2069A(long j3) throws IOException {
        Writer writer = this.f11157g;
        if (j3 < 0) {
            writer.write("-0x");
            m2071C(-j3);
            if (j3 < -2147483648L) {
                writer.write(76);
                return;
            }
            return;
        }
        writer.write("0x");
        m2071C(j3);
        if (j3 > 2147483647L) {
            writer.write(76);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m2070B(CharSequence charSequence, boolean z9) throws IOException {
        Writer writer = this.f11157g;
        if (z9) {
            writer.write(96);
        }
        writer.append(charSequence);
        if (z9) {
            writer.write(96);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m2071C(long j3) {
        char[] cArr;
        int i9;
        int i10 = 23;
        do {
            int i11 = (int) (15 & j3);
            cArr = this.f2474i;
            if (i11 < 10) {
                i9 = i10 - 1;
                cArr[i10] = (char) (i11 + 48);
            } else {
                i9 = i10 - 1;
                cArr[i10] = (char) (i11 + 87);
            }
            i10 = i9;
            j3 >>>= 4;
        } while (j3 != 0);
        int i12 = i10 + 1;
        write(cArr, i12, 24 - i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: a */
    public final void mo2072a(C3322a c3322a) throws IOException {
        Writer writer = this.f11157g;
        writer.write(".subannotation ");
        m7221t(c3322a.getType());
        writer.write(10);
        m2082x(c3322a.m7042a());
        writer.write(".end subannotation");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: b */
    public final void mo2073b(C3323b c3323b) throws IOException {
        Writer writer = this.f11157g;
        writer.write(123);
        List<InterfaceC4686a> listM7043a = c3323b.m7043a();
        if (listM7043a.size() == 0) {
            writer.write(125);
            return;
        }
        writer.write(10);
        m2081w();
        boolean z9 = true;
        for (InterfaceC4686a interfaceC4686a : listM7043a) {
            if (!z9) {
                writer.write(",\n");
            }
            mo2076g(interfaceC4686a);
            z9 = false;
        }
        m2080u();
        writer.write("\n}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: c */
    public final void mo2074c(C2894a c2894a) throws IOException {
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
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: e */
    public final void mo2075e(CharSequence charSequence) throws IOException {
        char cCharAt = charSequence.charAt(0);
        Writer writer = this.f11157g;
        writer.write(cCharAt);
        boolean z9 = false;
        int i9 = 1;
        int i10 = 1;
        while (true) {
            if (i9 >= charSequence.length()) {
                break;
            }
            char cCharAt2 = charSequence.charAt(i9);
            if (Character.getType(cCharAt2) == 12) {
                z9 = true;
            } else if (cCharAt2 == '/') {
                if (i9 == i10) {
                    C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
                    return;
                }
                m2070B(charSequence.subSequence(i10, i9), z9);
                writer.write(charSequence.charAt(i9));
                i10 = i9 + 1;
                z9 = false;
            } else if (cCharAt2 == ';') {
                if (i9 == i10) {
                    C0086a.m458q("Invalid type string: %s", new Object[]{charSequence});
                    return;
                } else {
                    m2070B(charSequence.subSequence(i10, i9), z9);
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
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: g */
    public final void mo2076g(InterfaceC4686a interfaceC4686a) throws IOException {
        int iMo863h = interfaceC4686a.mo863h();
        if (iMo863h == 0) {
            m2083y(((C0194b) interfaceC4686a).f493g, 't');
            return;
        }
        if (iMo863h == 6) {
            m2083y(((C0199g) interfaceC4686a).f498g, 'L');
            return;
        }
        if (iMo863h == 2) {
            m2083y(((C0201i) interfaceC4686a).f500g, 's');
            return;
        }
        Writer writer = this.f11157g;
        if (iMo863h == 3) {
            char c10 = ((C0195c) interfaceC4686a).f494g;
            if (c10 >= ' ' && c10 < 127) {
                writer.write(39);
                if (c10 == '\'' || c10 == '\"' || c10 == '\\') {
                    writer.write(92);
                }
                writer.write(c10);
                writer.write(39);
                return;
            }
            if (c10 <= 127) {
                if (c10 == '\t') {
                    writer.write("'\\t'");
                    return;
                } else if (c10 == '\n') {
                    writer.write("'\\n'");
                    return;
                } else if (c10 == '\r') {
                    writer.write("'\\r'");
                    return;
                }
            }
            writer.write(39);
            writer.write("\\u");
            writer.write(Character.forDigit(c10 >> '\f', 16));
            writer.write(Character.forDigit((c10 >> '\b') & 15, 16));
            writer.write(Character.forDigit((c10 >> 4) & 15, 16));
            writer.write(Character.forDigit(c10 & 15, 16));
            writer.write(39);
            return;
        }
        if (iMo863h == 4) {
            m2083y(((C0198f) interfaceC4686a).f497g, null);
            return;
        }
        if (iMo863h == 16) {
            writer.write(Float.toString(((C0197e) interfaceC4686a).f496g));
            writer.write(102);
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
                writer.write(".enum ");
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
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: h */
    public final void mo2077h(AbstractC1986a abstractC1986a) throws IOException {
        if (!abstractC1986a.mo4927f1().equals(this.f2473h)) {
            super.mo2077h(abstractC1986a);
            return;
        }
        mo2079s(abstractC1986a.getName());
        this.f11157g.write(58);
        m7221t(abstractC1986a.getType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: i */
    public final void mo2078i(AbstractC1987b abstractC1987b) {
        if (abstractC1987b.mo4929f1().equals(this.f2473h)) {
            m7220q(abstractC1987b);
        } else {
            super.mo2078i(abstractC1987b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p239q5.C3440a
    /* JADX INFO: renamed from: s */
    public final void mo2079s(CharSequence charSequence) throws IOException {
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= charSequence.length()) {
                break;
            }
            if (Character.getType(charSequence.charAt(i9)) == 12) {
                z9 = true;
                break;
            }
            i9++;
        }
        m2070B(charSequence, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m2080u() {
        C0710g c0710g = (C0710g) this.f11157g;
        int i9 = c0710g.f2131h - 4;
        c0710g.f2131h = i9;
        if (i9 < 0) {
            c0710g.f2131h = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m2081w() {
        C0710g c0710g = (C0710g) this.f11157g;
        int i9 = c0710g.f2131h + 4;
        c0710g.f2131h = i9;
        if (i9 < 0) {
            c0710g.f2131h = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m2082x(Set set) throws IOException {
        m2081w();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2247c c2247c = (C2247c) it.next();
            mo2079s(c2247c.m5494a());
            Writer writer = this.f11157g;
            writer.write(" = ");
            mo2076g(c2247c.m5495b());
            writer.write(10);
        }
        m2080u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m2083y(long j3, Character ch2) throws IOException {
        Writer writer = this.f11157g;
        if (j3 < 0) {
            writer.write("-0x");
            m2071C(-j3);
        } else {
            writer.write("0x");
            m2071C(j3);
        }
        if (ch2 != null) {
            writer.write(ch2.charValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m2084z(int i9) {
        if (i9 < 0) {
            write(45);
        }
        int i10 = 15;
        while (true) {
            int i11 = i10 - 1;
            char cAbs = (char) (Math.abs(i9 % 10) + 48);
            char[] cArr = this.f2474i;
            cArr[i10] = cAbs;
            i9 /= 10;
            if (i9 == 0) {
                write(cArr, i10, 16 - i10);
                return;
            }
            i10 = i11;
        }
    }
}
